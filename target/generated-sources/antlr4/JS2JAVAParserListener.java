// Generated from JS2JAVAParser.g4 by ANTLR 4.5.3
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
	 * Enter a parse tree produced by {@link JS2JAVAParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JS2JAVAParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JS2JAVAParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#vardecobj}.
	 * @param ctx the parse tree
	 */
	void enterVardecobj(JS2JAVAParser.VardecobjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#vardecobj}.
	 * @param ctx the parse tree
	 */
	void exitVardecobj(JS2JAVAParser.VardecobjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#funcdecobj}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecobj(JS2JAVAParser.FuncdecobjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#funcdecobj}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecobj(JS2JAVAParser.FuncdecobjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(JS2JAVAParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(JS2JAVAParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JS2JAVAParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JS2JAVAParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(JS2JAVAParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(JS2JAVAParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#defaults}.
	 * @param ctx the parse tree
	 */
	void enterDefaults(JS2JAVAParser.DefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#defaults}.
	 * @param ctx the parse tree
	 */
	void exitDefaults(JS2JAVAParser.DefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#init_for}.
	 * @param ctx the parse tree
	 */
	void enterInit_for(JS2JAVAParser.Init_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#init_for}.
	 * @param ctx the parse tree
	 */
	void exitInit_for(JS2JAVAParser.Init_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(JS2JAVAParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(JS2JAVAParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#forinstmt}.
	 * @param ctx the parse tree
	 */
	void enterForinstmt(JS2JAVAParser.ForinstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#forinstmt}.
	 * @param ctx the parse tree
	 */
	void exitForinstmt(JS2JAVAParser.ForinstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(JS2JAVAParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(JS2JAVAParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#dowhilestmt}.
	 * @param ctx the parse tree
	 */
	void enterDowhilestmt(JS2JAVAParser.DowhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#dowhilestmt}.
	 * @param ctx the parse tree
	 */
	void exitDowhilestmt(JS2JAVAParser.DowhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(JS2JAVAParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(JS2JAVAParser.BlockstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(JS2JAVAParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(JS2JAVAParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(JS2JAVAParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(JS2JAVAParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#expstmt}.
	 * @param ctx the parse tree
	 */
	void enterExpstmt(JS2JAVAParser.ExpstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#expstmt}.
	 * @param ctx the parse tree
	 */
	void exitExpstmt(JS2JAVAParser.ExpstmtContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JS2JAVAParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JS2JAVAParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#binaryex}.
	 * @param ctx the parse tree
	 */
	void enterBinaryex(JS2JAVAParser.BinaryexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#binaryex}.
	 * @param ctx the parse tree
	 */
	void exitBinaryex(JS2JAVAParser.BinaryexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#updateex}.
	 * @param ctx the parse tree
	 */
	void enterUpdateex(JS2JAVAParser.UpdateexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#updateex}.
	 * @param ctx the parse tree
	 */
	void exitUpdateex(JS2JAVAParser.UpdateexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#assignex}.
	 * @param ctx the parse tree
	 */
	void enterAssignex(JS2JAVAParser.AssignexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#assignex}.
	 * @param ctx the parse tree
	 */
	void exitAssignex(JS2JAVAParser.AssignexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#unaryex}.
	 * @param ctx the parse tree
	 */
	void enterUnaryex(JS2JAVAParser.UnaryexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#unaryex}.
	 * @param ctx the parse tree
	 */
	void exitUnaryex(JS2JAVAParser.UnaryexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#arrayex}.
	 * @param ctx the parse tree
	 */
	void enterArrayex(JS2JAVAParser.ArrayexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#arrayex}.
	 * @param ctx the parse tree
	 */
	void exitArrayex(JS2JAVAParser.ArrayexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#callex}.
	 * @param ctx the parse tree
	 */
	void enterCallex(JS2JAVAParser.CallexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#callex}.
	 * @param ctx the parse tree
	 */
	void exitCallex(JS2JAVAParser.CallexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#memberex}.
	 * @param ctx the parse tree
	 */
	void enterMemberex(JS2JAVAParser.MemberexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#memberex}.
	 * @param ctx the parse tree
	 */
	void exitMemberex(JS2JAVAParser.MemberexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JS2JAVAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JS2JAVAParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JS2JAVAParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link JS2JAVAParser#id2}.
	 * @param ctx the parse tree
	 */
	void enterId2(JS2JAVAParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JS2JAVAParser#id2}.
	 * @param ctx the parse tree
	 */
	void exitId2(JS2JAVAParser.Id2Context ctx);
}