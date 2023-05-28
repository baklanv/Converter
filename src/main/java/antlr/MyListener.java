package antlr;

import Nodes.*;
import antlr.com.MyGrammarParser;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import antlr.com.MyGrammarBaseListener;

import java.util.*;

public class MyListener extends MyGrammarBaseListener {
    Map<String, String> _finalPiece;
    List<PieceNode> _allPieceNode;
    List<MapNode> _mapNodes;
    List<DefinePieceNode> _definePieceNodes;
    DefineDistanceBetween _defineDistanceBetween;
    private StringBuilder code = new StringBuilder();
    public MyListener (){
        _finalPiece = new HashMap<>();
        _allPieceNode = new ArrayList<>();
        _mapNodes = new ArrayList<>();
        _definePieceNodes = new ArrayList<>();
        _defineDistanceBetween = new DefineDistanceBetween();
    }
    @Override public void enterProgram(MyGrammarParser.ProgramContext ctx) { }
    @Override
    public void exitProgram(MyGrammarParser.ProgramContext ctx) {
        System.out.println(code.toString()); // Вывод сгенерированного кода
    }
    @Override public void enterExpression(MyGrammarParser.ExpressionContext ctx) {
        if (ctx.getParent() != null) {
            if (ctx.getParent().getTokens(5).stream().anyMatch(x -> Objects.equals(x.getText(), "equipment")))
                if (ctx.IDENTIFIER().stream().anyMatch(t -> Objects.equals(t.getText(), "piece"))) {
                    var identifief = ctx.IDENTIFIER().get(1).getText();
                    var string = ctx.STRING().get(0).getText();
                    _finalPiece.put(string, identifief);
                }
        }

       /* if (ctx.OP().getText().equals("(") && ctx.CP().getText().equals(")")) {
            // Обработка узлов, содержащих выражение в круглых скобках
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    TerminalNode tn = (TerminalNode) child;
                    if (tn.getSymbol().getType() == MyGrammarParser.STRING) {
                        // Добавление строки в формируемый код
                        code.append("Добавили ");
                    }
                }
            }
        }*/
        // Обработка узла expression
        var parent = ctx.getParent(); //&& !(parent instanceof MyGrammarParser.DefineContext)
        var list = ctx.getRuleContexts(MyGrammarParser.PiecesContext.class);
        if (list.isEmpty() ) {
            String text = ctx.getText();
            code.append(" ").append(text).append("\n");
        }
    }
    @Override public void exitExpression(MyGrammarParser.ExpressionContext ctx) { }
    @Override public void enterPieces(MyGrammarParser.PiecesContext ctx) {
        boolean abs = ctx.ABSTRACT() != null;
        String name = ctx.STRING().getText();

        List<String> defines = new ArrayList<>();
        for (var define : ctx.define()) {
            defines.add(define.getText());
        }

        List<String> parents = new ArrayList<>();
        if (ctx.parent() != null) {
            for (var parent : ctx.parent().STRING()) {
                parents.add(parent.getText());
            }
        }

        _allPieceNode.add(new PieceNode(_allPieceNode.size() + 1, abs, name, parents, defines));

        // Обработка узла pieces
        String text = ctx.getText();
        //code.append(text);
/*

        ParserRuleContext parent = ctx.getParent(); // получаем родительский узел
        if (parent != null) {
            int index = ctx.getRuleIndex(); // получаем индекс текущего узла
            while (ctx.getChildCount() > 0) {
                ctx.removeLastChild(); // удаляем все дочерние узлы
            }
            parent.removeLastChild(); // удаляем текущий узел из родительского
            parent.removeLastChild();
            parent.removeLastChild();
            //parent.addChild(index, new TerminalNodeImpl(new CommonToken(MyLexer.T__0))); // добавляем замену на пустой токен
        }*/
    }

    public String getResult() {
        // Возвращаем результирующую строку
        System.out.println(code);
        return code.toString();
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
        for (PieceNode currentPiece : _allPieceNode) {
            for (String parent : currentPiece.getParentsName()) {
                _allPieceNode.stream()
                        .filter(node -> Objects.equals(node.getName(), parent))
                        .findFirst().ifPresent(currentPiece::addParent);
            }
        }
        // максимальная длина
        int max = maxLenght();

        for (int i =0; i < max; i++){
            _mapNodes.add(new MapNode(i+1));
        }

        for (PieceNode currentPiece : _allPieceNode) {
            if (!currentPiece.isAbstract()) {
                List<String> NodeAndParentsName = new ArrayList<>(getNodeAndParentsNames(currentPiece).stream().toList());
                while (NodeAndParentsName.size() != max){
                    NodeAndParentsName.add("\"SuperPiece\"");
                }
                    for (int i = 0; i< _mapNodes.size(); i++) {
                        _mapNodes.get(i).addPair(currentPiece.getName(), _finalPiece.get(currentPiece.getName()), NodeAndParentsName.get(i));
                    }
            }
        }

        for (var map:_mapNodes)
            map.generateCode();

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
       // defineInstanceOf.generateCode();
    }

    @Override public void exitPieces(MyGrammarParser.PiecesContext ctx) {

    }
    @Override public void enterParent(MyGrammarParser.ParentContext ctx) { } //не надо
    @Override public void exitParent(MyGrammarParser.ParentContext ctx) { }
    @Override public void enterDefine(MyGrammarParser.DefineContext ctx) { } //не надо
    @Override public void exitDefine(MyGrammarParser.DefineContext ctx) { }
    @Override public void enterMove(MyGrammarParser.MoveContext ctx) { }//не надо
    @Override public void exitMove(MyGrammarParser.MoveContext ctx) { }
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    @Override public void visitTerminal(TerminalNode node) { }
    @Override public void visitErrorNode(ErrorNode node) { }
}
