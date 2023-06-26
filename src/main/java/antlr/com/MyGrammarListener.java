// Generated from C:/Projects/1222/Converter/src/main/java/antlr\MyGrammar.g4 by ANTLR 4.12.0
package antlr.com;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#pieces}.
	 * @param ctx the parse tree
	 */
	void enterPieces(MyGrammarParser.PiecesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#pieces}.
	 * @param ctx the parse tree
	 */
	void exitPieces(MyGrammarParser.PiecesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(MyGrammarParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(MyGrammarParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(MyGrammarParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(MyGrammarParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(MyGrammarParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(MyGrammarParser.MoveContext ctx);
}