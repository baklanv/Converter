package antlr;

import Nodes.MapNode;
import Nodes.PieceNode;
import antlr.com.MyGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import antlr.com.MyGrammarBaseListener;

import java.util.*;

public class MyListener extends MyGrammarBaseListener {
    Map<String, String> _finalPiece;
    List<PieceNode> _allPieceNode;
    List<MapNode> _mapNodes;
    public MyListener (){
        _finalPiece = new HashMap<>();
        _allPieceNode = new ArrayList<>();
        _mapNodes = new ArrayList<>();
    }
    @Override public void enterProgram(MyGrammarParser.ProgramContext ctx) { }
    @Override public void exitProgram(MyGrammarParser.ProgramContext ctx) { }
    @Override public void enterExpression(MyGrammarParser.ExpressionContext ctx) {
        if (ctx.getParent() != null) {
            if (ctx.getParent().getTokens(5).stream().anyMatch(x -> Objects.equals(x.getText(), "equipment")))
                if (ctx.IDENTIFIER().stream().anyMatch(t -> Objects.equals(t.getSymbol().getText(), "piece"))) {
                    var identifief = ctx.IDENTIFIER().get(1).getText();
                    var string = ctx.STRING().get(0).getText();
                    _finalPiece.put(string, identifief);
                }
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
                    NodeAndParentsName.add("\"@SuperPiece\"");
                }
                    for (int i = 0; i< _mapNodes.size(); i++) {
                        _mapNodes.get(i).addPair(currentPiece.getName(), _finalPiece.get(currentPiece.getName()), NodeAndParentsName.get(i));
                    }

            }
        }

        for (var map:_mapNodes)
            map.generateCode();

    }
    @Override public void exitPieces(MyGrammarParser.PiecesContext ctx) { }
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
