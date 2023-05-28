package antlr;

import Nodes.*;
import antlr.com.MyGrammarBaseVisitor;
import antlr.com.MyGrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyVisitor extends MyGrammarBaseVisitor<String> {
    Map<String, String> _finalPiece;
    Map<String, String> _definePiece;
    Map<String, String> _movePiece;
    List<PieceNode> _allPieceNode;
    List<MapNode> _mapNodes;
    List<DefinePieceNode> _definePieceNodes;
    DefineDistanceBetween _defineDistanceBetween;
    Map<String, String> _errorList;
    private int level = 0;
    public MyVisitor (){
        _finalPiece = new HashMap<>();
        _allPieceNode = new ArrayList<>();
        _mapNodes = new ArrayList<>();
        _definePieceNodes = new ArrayList<>();
        _defineDistanceBetween = new DefineDistanceBetween();
        _definePiece = new HashMap<>();
        _movePiece = new HashMap<>();
        _errorList = new HashMap<>();
    }

    @Override
    public String visitProgram(MyGrammarParser.ProgramContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (ParseTree child : ctx.children) {
            if (!(child instanceof MyGrammarParser.PiecesContext)) {
                String result = visit(child);
                if (result != null) {
                    builder.append(result);
                }
            }
        }
        mapFormation();
        defineFormation();
        addMap(builder, _mapNodes);
        addDefine(builder, _definePieceNodes, _defineDistanceBetween, _definePiece);
        if (!_errorList.isEmpty())
        {
            return _errorList.get(0);
        }
        return builder.toString();
    }

    @Override
    public String visitExpression(MyGrammarParser.ExpressionContext ctx) {
        boolean isPiece = false;
        boolean isEquipment = false;
        String currentNamePiece = "";
        if (ctx.getParent() != null) {
            if (ctx.getParent().getTokens(5).stream().anyMatch(x -> Objects.equals(x.getSymbol().getText(), "equipment")))
                if (ctx.IDENTIFIER().stream().anyMatch(t -> Objects.equals(t.getSymbol().getText(), "piece"))) {
                    var identifief = ctx.IDENTIFIER().get(1).getText();
                    var string = ctx.STRING().get(0).getText();
                    _finalPiece.put(string, identifief);
                    isPiece = true;
                    currentNamePiece = string;

            }
            //todo добавить move
        }
        if (ctx.getTokens(5).stream().anyMatch(x -> Objects.equals(x.getText(), "equipment")))
            isEquipment = true;

        List<MyGrammarParser.PiecesContext> piecesList = ctx.getRuleContexts(MyGrammarParser.PiecesContext.class);

        StringBuilder builder = new StringBuilder();

        var gh = ctx.IDENTIFIER();
        if (piecesList.isEmpty() && ctx.IDENTIFIER().stream().noneMatch(t -> Objects.equals(t.getText(), "metadata"))) {
            //builder.append("\n");
            appendIndent(builder, level); // добавляем отступы в начало строки, соответствующие уровню вложенности

            level++;

            for (ParseTree child : ctx.children) {
                //if (!(child.getText() == "")) {
                String result = visit(child);
                if (result != null) {
                    if (isPiece && result.equals(")")){
                        level++;
                        //appendIndent(builder, level); // todo добавить в каждую строку
                        builder.append(_movePiece.get(currentNamePiece));
                        level--;
                    }
                    /*else if (isEquipment && result.equals("}")){
                        for (var map : _mapNodes)
                            builder.append(map.generateCode()); // todo в данный момент _mapNodes всегда пустой
                    }*/
                    builder.append(result);
                }
            }
                // else {
                // String result = visit(child);
                // }
           // }
            level--;
            //builder.append("\n");
            //appendIndent(builder, level);
//todo нужен пример где define не принадлежит к конкретному писесу
        }
        else if (!piecesList.isEmpty()){
            for (var piece : piecesList){
                String result = visit(piece);
                if (result != null) {
                    builder.append(result);
                }
            }
        }
        return builder.toString();
    }

    @Override
    public String visitPieces(MyGrammarParser.PiecesContext ctx) {
        boolean abs = ctx.ABSTRACT() != null;
        String name = ctx.STRING().getText();

        List<String> defines = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            //todo тут будет define и move
            if (child instanceof MyGrammarParser.DefineContext){
                String result = visit(child);
                _definePiece.put(child.getText(), result);
            }
            else if (child instanceof MyGrammarParser.MoveContext){ // todo дописать visit Move
                String result = visit(child);
                _movePiece.put(ctx.STRING().getText(), result);
            }
        }

        /*for (var define : ctx.define()) {
            defines.add(define.getText());
            //visit(define);
        }*/

        List<String> parents = new ArrayList<>();
        if (ctx.parent() != null) {
            for (var parent : ctx.parent().STRING()) {
                parents.add(parent.getText());
            }
        }

        _allPieceNode.add(new PieceNode(_allPieceNode.size() + 1, abs, name, parents, defines));

        return null;
    }

    @Override
    public String visitDefine(MyGrammarParser.DefineContext ctx) {
        StringBuilder builder = new StringBuilder();

        appendIndent(builder, level);

        level++;
        for (ParseTree child : ctx.children) {
            String result = visit(child);
            if (result != null) {
                builder.append(result);
            }
        }
        level--;
        return builder.toString();
    }
    @Override public String visitMove(MyGrammarParser.MoveContext ctx) {
        StringBuilder builder = new StringBuilder();

        //appendIndent(builder, level);
        int currentLevel = level;
        level =4;
        //level++;
        for (ParseTree child : ctx.children) {
            String result = visit(child);
            if (result != null) {
                builder.append(result);
            }
        }
        /*int index = 0;
        while (Character.isWhitespace(builder.charAt(index)))
            index++;
        builder.delete(0, index);*/
        //level--;
        level = currentLevel;
        return builder.toString(); }
    @Override
    public String visitTerminal(TerminalNode node){
        String text = node.getText();
        if (text.equals("<EOF>")){
            return "";
        }
        return (!text.equals("{")  && !text.equals("(") && !text.equals(")") && !text.equals("}")) ? text + " " : text;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        // получаем строку, содержащую ошибку
        String errorMessage = errorNode.getText();

        // выводим сообщение об ошибке
        System.err.println("Error: " + errorMessage);

        // можно выполнять дополнительные действия при обнаружении ошибки
        // например, выбросить исключение
        throw new RuntimeException("An error has occurred during parsing!");
    }

    public void addMap(StringBuilder builder, List<MapNode> mapNodes) {
        String str = builder.toString();
        int index = str.indexOf("equipment") + "equipment".length();
        index = str.indexOf("}", index);
        if (index != -1) {
            for (MapNode node : mapNodes)
                builder.insert(index, "\n" + node.generateCode());
        }
    }

    public void addDefine(StringBuilder builder, List<DefinePieceNode> definePieceNodes, DefineDistanceBetween defineDistanceBetween, Map<String, String> definePiece) {
        String str = builder.toString();
        int index = 0;
        for (String node : definePiece.values()) {
            builder.insert(index, node);
        }

        DefineInstanceOf defineInstanceOf = new DefineInstanceOf(_finalPiece.size());
        builder.insert(index, defineInstanceOf.generateCode());
        builder.insert(index, defineDistanceBetween.generateCode());

        for (DefinePieceNode node : definePieceNodes) {
            builder.insert(index, node.generateCode());
        }

    }

    private void appendIndent(StringBuilder builder, int level) {
        builder.append("\n").append("\t".repeat(Math.max(0, level)));
    }

    private HashSet<String> getNodeAndParentsNames(PieceNode node) {
        HashSet<String> nodeAndParentsNumbers = new HashSet<>();
        nodeAndParentsNumbers.add(node.getName());
        for (PieceNode parent : node.getParents()) {
            nodeAndParentsNumbers.addAll(getNodeAndParentsNames(parent));
        }
        return nodeAndParentsNumbers;
    }

    private int maxLenght() {
        return _allPieceNode.stream()
                .mapToInt(pieceNode -> getNodeAndParentsNames(pieceNode).size())
                .max()
                .orElse(0);
    }

    public void mapFormation(){
        // добавить родителей
        if (checkPiece()) {
            for (PieceNode currentPiece : _allPieceNode) {
                for (String parent : currentPiece.getParentsName()) {
                    _allPieceNode.stream()
                            .filter(node -> Objects.equals(node.getName(), parent))
                            .findFirst().ifPresent(currentPiece::addParent);
                }
            }
            // максимальная длина
            int max = maxLenght();

            for (int i = 0; i < max; i++) {
                _mapNodes.add(new MapNode(i + 1));
            }

            for (PieceNode currentPiece : _allPieceNode) {
                if (!currentPiece.isAbstract()) {
                    List<String> NodeAndParentsName = new ArrayList<>(getNodeAndParentsNames(currentPiece).stream().toList());
                    while (NodeAndParentsName.size() != max) {
                        NodeAndParentsName.add("\"SuperPiece\"");
                    }
                    for (int i = 0; i < _mapNodes.size(); i++) {
                        _mapNodes.get(i).addPair(currentPiece.getName(), _finalPiece.get(currentPiece.getName()), NodeAndParentsName.get(i));
                    }
                }
            }

            for (var map : _mapNodes)
                map.generateCode();

        }

    }

    public boolean checkPiece(){
        for (PieceNode currentPiece : _allPieceNode) {
            for (String parent : currentPiece.getParentsName()) {
                if (_allPieceNode.stream().noneMatch(node -> node.getName().equals(parent))){
                    return false;
                }
            }
        }

//        for(String name : _finalPiece.keySet()){
//            if (_allPieceNode.stream().noneMatch(node -> node.getName().equals(name))){
//                return name;
//            }
//        }
        return true;
    }
    public void defineFormation(){
        _definePieceNodes.add(new DefinePieceNode("\"SuperPiece\"", 0));
        for (PieceNode pieceNode : _allPieceNode){
            _definePieceNodes.add(new DefinePieceNode(pieceNode.getName(), pieceNode.getNumber()));
        }
        for (DefinePieceNode definePieceNode : _definePieceNodes){
            definePieceNode.generateCode();
        }
        _defineDistanceBetween.generateCode();

        DefineInstanceOf defineInstanceOf = new DefineInstanceOf(_finalPiece.size());
        defineInstanceOf.generateCode();
    }

}
