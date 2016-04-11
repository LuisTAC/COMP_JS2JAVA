// Generated from JS2JAVA.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JS2JAVAParser}.
 */
public interface JS2JAVAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(JS2JAVAParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(JS2JAVAParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(JS2JAVAParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(JS2JAVAParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JS2JAVAParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JS2JAVAParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#functiondec}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondec(JS2JAVAParser.FunctiondecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#functiondec}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondec(JS2JAVAParser.FunctiondecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(JS2JAVAParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(JS2JAVAParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(JS2JAVAParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(JS2JAVAParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(JS2JAVAParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(JS2JAVAParser.InitContext ctx);
}