// Generated from JS2JAVAParser.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JS2JAVAParser}.
 */
public interface JS2JAVAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JS2JAVAParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JS2JAVAParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JS2JAVAParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JS2JAVAParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JS2JAVAParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JS2JAVAParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#left_operand}.
	 * @param ctx the parse tree
	 */
	void enterLeft_operand(JS2JAVAParser.Left_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#left_operand}.
	 * @param ctx the parse tree
	 */
	void exitLeft_operand(JS2JAVAParser.Left_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JS2JAVAParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JS2JAVAParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JS2JAVAParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JS2JAVAParser.ValueContext ctx);
}