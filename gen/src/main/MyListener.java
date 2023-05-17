package src.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyListener extends Lisp1BaseListener{
    Map<String, String> finalPiece;
    List<Piece> allPiece;
    public MyListener (){
        finalPiece = new HashMap<>();
        allPiece = new ArrayList<>();
    }
    @Override public void enterProgram(Lisp1Parser.ProgramContext ctx) { }
    @Override public void exitProgram(Lisp1Parser.ProgramContext ctx) { }
    @Override public void enterExpression(Lisp1Parser.ExpressionContext ctx) {
        if (ctx.getParent() != null) {
            //var hfdjf = ctx.getParent().getTokens(5);
            if (ctx.getParent().getTokens(5).stream().anyMatch(x -> Objects.equals(x.getText(), "equipment")))
                if (ctx.IDENTIFIER().stream().anyMatch(t -> Objects.equals(t.getSymbol().getText(), "piece"))) {
                    var identifief = ctx.IDENTIFIER().get(1).getText();
                    var string = ctx.STRING().get(0).getText();
                     finalPiece.put(string, identifief);
                }
        }
    }
    @Override public void exitExpression(Lisp1Parser.ExpressionContext ctx) { }
    @Override public void enterPieces(Lisp1Parser.PiecesContext ctx) {
        boolean abs = false;
        if(ctx.ABSTRACT() != null){
            abs = true;
        }
        String name = ctx.STRING().getText();
        List<String> defines = new ArrayList<>();
        if (ctx.define() != null){
            for (int i =0; i<ctx.define().size(); i++) {
                defines.add(ctx.define().get(i).getText());
            }
        }
        List<String> parents = new ArrayList<>();
        if (ctx.parent() != null){
            for (int i =0; i<ctx.parent().STRING().size(); i++) {
                parents.add(ctx.parent().STRING().get(i).getText());
            }
        }

        Piece piece = new Piece(abs, name, parents, defines);
        allPiece.add(piece);
    }
    @Override public void exitPieces(Lisp1Parser.PiecesContext ctx) { }
    @Override public void enterParent(Lisp1Parser.ParentContext ctx) { } //не надо
    @Override public void exitParent(Lisp1Parser.ParentContext ctx) { }
    @Override public void enterDefine(Lisp1Parser.DefineContext ctx) { } //не надо
    @Override public void exitDefine(Lisp1Parser.DefineContext ctx) { }
    @Override public void enterMove(Lisp1Parser.MoveContext ctx) { }//не надо
    @Override public void exitMove(Lisp1Parser.MoveContext ctx) { }
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    @Override public void visitTerminal(TerminalNode node) { }
    @Override public void visitErrorNode(ErrorNode node) { }
}
