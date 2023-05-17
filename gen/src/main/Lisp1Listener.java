// Generated from C:/Projects/test1/src/main\Lisp1.g4 by ANTLR 4.12.0
package src.main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Lisp1Parser}.
 */
public interface Lisp1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Lisp1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Lisp1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lisp1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Lisp1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lisp1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Lisp1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lisp1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Lisp1Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lisp1Parser#pieces}.
	 * @param ctx the parse tree
	 */
	void enterPieces(Lisp1Parser.PiecesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lisp1Parser#pieces}.
	 * @param ctx the parse tree
	 */
	void exitPieces(Lisp1Parser.PiecesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lisp1Parser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(Lisp1Parser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lisp1Parser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(Lisp1Parser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lisp1Parser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(Lisp1Parser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lisp1Parser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(Lisp1Parser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lisp1Parser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(Lisp1Parser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lisp1Parser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(Lisp1Parser.MoveContext ctx);
}