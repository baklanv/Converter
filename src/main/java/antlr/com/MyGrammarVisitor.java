// Generated from C:/Projects/1222/Converter/src/main/java/antlr\MyGrammar.g4 by ANTLR 4.12.0
package antlr.com;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#pieces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieces(MyGrammarParser.PiecesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(MyGrammarParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(MyGrammarParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(MyGrammarParser.MoveContext ctx);
}