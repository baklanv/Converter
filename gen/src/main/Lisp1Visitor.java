// Generated from C:/Projects/test1/src/main\Lisp1.g4 by ANTLR 4.12.0
package src.main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lisp1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Lisp1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Lisp1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Lisp1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lisp1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Lisp1Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lisp1Parser#pieces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieces(Lisp1Parser.PiecesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lisp1Parser#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(Lisp1Parser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lisp1Parser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(Lisp1Parser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lisp1Parser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(Lisp1Parser.MoveContext ctx);
}