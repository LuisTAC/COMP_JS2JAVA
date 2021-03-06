import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends JS2JAVAParserBaseListener {
		
	private String genTabLine() {
		String tabsline = "";
		for(int j=0;j<this.tabs;j++) tabsline+="\t";
		return tabsline;
	}
	
	private int tabs=1;
	
	public Stack<String> codeStack = new Stack<String>();
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterJson(JS2JAVAParser.JsonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitJson(JS2JAVAParser.JsonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterObj(JS2JAVAParser.ObjContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitObj(JS2JAVAParser.ObjContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVardecobj(JS2JAVAParser.VardecobjContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVardecobj(JS2JAVAParser.VardecobjContext ctx) { 
		String val = codeStack.pop();
		String name = codeStack.pop();
		
		codeStack.push(name+'='+val);
	}

	@Override public void exitFuncdecobj(JS2JAVAParser.FuncdecobjContext ctx) { 		
		String body = codeStack.pop();
		String params = codeStack.pop();
		String id = codeStack.pop();

		codeStack.push("\tpublic var " + id + "("+params+")" + body);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarations(JS2JAVAParser.DeclarationsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarations(JS2JAVAParser.DeclarationsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclarator(JS2JAVAParser.VariableDeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclarator(JS2JAVAParser.VariableDeclaratorContext ctx) { }

	@Override public void exitParams(JS2JAVAParser.ParamsContext ctx) {
		String[] id2s= new String[ctx.id2().size()];
		for(int i=0;i<ctx.id2().size();i++){
			id2s[i]=codeStack.pop();
		}
		String id2sStr="";
		for(int i=id2s.length-1;i>0;i--){
			id2sStr+="var "+id2s[i]+", ";
		}
		id2sStr+="var "+id2s[0];
		
		codeStack.push(id2sStr);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefaults(JS2JAVAParser.DefaultsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDefaults(JS2JAVAParser.DefaultsContext ctx) { }

	@Override public void exitForstmt(JS2JAVAParser.ForstmtContext ctx) {
		String obj=codeStack.pop();
		String update=codeStack.pop();
		String test=codeStack.pop();
		String init=codeStack.pop();
		
		codeStack.push("for("+init+";"+test+";"+update+")\n"+obj);		
	}
	@Override public void exitForinstmt(JS2JAVAParser.ForinstmtContext ctx) { 
		String body=codeStack.pop();
		String right=codeStack.pop();
		String left=codeStack.pop();
		
		if(ctx.obj().blockstmt()==null) codeStack.push("for(var "+left+" : "+right+")\n"+genTabLine()+"\t"+body);
		else codeStack.push("for(var "+left+" : "+right+")\n"+body);
	}
	@Override public void exitWhilestmt(JS2JAVAParser.WhilestmtContext ctx) {
		String body = codeStack.pop();
		String test = codeStack.pop();
		
		if(ctx.obj().blockstmt()==null) codeStack.push("while("+test+")\n"+genTabLine()+"\t"+body);
		else codeStack.push("while("+test+")\n"+body);
	}
	@Override public void exitDowhilestmt(JS2JAVAParser.DowhilestmtContext ctx) {
		String condition = codeStack.pop();
		String body = codeStack.pop();
		
		if(ctx.obj().blockstmt()==null) codeStack.push("do\n"+genTabLine()+"\t"+body+"\n"+genTabLine()+"while("+condition+")");
		else codeStack.push("do\n"+body+"\n"+genTabLine()+"while("+condition+")");
	}
	@Override public void enterBlockstmt(JS2JAVAParser.BlockstmtContext ctx) {
		tabs++;
	}
	@Override public void exitBlockstmt(JS2JAVAParser.BlockstmtContext ctx) {
		String tabsline = genTabLine();		
		
		String[] objs= new String[ctx.obj().size()];
		for(int i=0;i<ctx.obj().size();i++){
			objs[i]=codeStack.pop();
		}
		String objsStr="";
		for(int i=objs.length-1;i>0;i--){
			objsStr+=tabsline+objs[i]+";\n";
		}
		objsStr+=tabsline+objs[0]+";\n";
		tabs--;
		tabsline = genTabLine();
		
		codeStack.push(tabsline+"{\n"+objsStr+tabsline+"}");
	}
	@Override public void exitBreakstmt(JS2JAVAParser.BreakstmtContext ctx) { 
		codeStack.push("break");
	}
	
	@Override public void exitIfstmt(JS2JAVAParser.IfstmtContext ctx) {
		String alt ="";
		if(ctx.obj(1).NULL()==null) alt = codeStack.pop();
			
		String cons = codeStack.pop();
		String test = codeStack.pop();
		
		String tabsline=genTabLine();
		if(alt.equals("")) {
			if(ctx.obj(0).blockstmt()==null)codeStack.push("if("+test+")\n"+tabsline+"\t"+cons);
			else codeStack.push("if("+test+")\n"+cons);
		}
		else {
			String res="if("+test+")\n";
			if(ctx.obj(0).blockstmt()==null) res+=tabsline+"\t";
			res+=cons+"\n"+tabsline+"else\n";
			if(ctx.obj(1).blockstmt()==null) res+=tabsline+"\t";
			res+=alt;
			codeStack.push(res);
		}
	}
	@Override public void exitReturnstmt(JS2JAVAParser.ReturnstmtContext ctx) {
		String pop = codeStack.pop();
		codeStack.push("return "+pop);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpstmt(JS2JAVAParser.ExpstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpstmt(JS2JAVAParser.ExpstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInit(JS2JAVAParser.InitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInit(JS2JAVAParser.InitContext ctx) { }
	
	@Override public void exitLiteral(JS2JAVAParser.LiteralContext ctx) {
		String val="";
		
		if(ctx.STRING().size()>1) {
			val = ctx.STRING(0).getText();
		}
		else if(ctx.TRUE()!=null) {
			val="true";
		}
		else if(ctx.FALSE()!=null) {
			val="false";
		}
		else if(ctx.NULL()!=null) {
			val="null";
		}
		else { //NUMBER
			val=ctx.NUMBER().getText();
		}
		codeStack.push(val);
	}
	@Override public void exitBinaryex(JS2JAVAParser.BinaryexContext ctx) {
		String op="";
		if(ctx.ADD()!=null) op="+";
		else if(ctx.SUB()!=null) op="-";
		else if(ctx.MUL()!=null) op="*";
		else if(ctx.DIV()!=null) op="/";
		else if(ctx.REM()!=null) op="%";
		else if(ctx.EQUAL()!=null) op="==";
		else if(ctx.NEQUAL()!=null) op="!=";
		else if(ctx.SMALLER()!=null) op="<";
		else if(ctx.SMALLEREQ()!=null) op="<=";
		else if(ctx.BIGGER()!=null) op=">";
		else op=">=";
		
		String rhs=codeStack.pop();	
		String lhs=codeStack.pop();
		
		codeStack.push("("+lhs+" "+op+" "+rhs+")");
	}
	@Override public void exitLogicalex(JS2JAVAParser.LogicalexContext ctx) {
		String op="";
		if(ctx.AND()!=null) op="&&";
		else op="||";
		
		String rhs=codeStack.pop();
		String lhs=codeStack.pop();

		codeStack.push("("+lhs+" "+op+" "+rhs+")");
	}
	@Override public void exitUpdateex(JS2JAVAParser.UpdateexContext ctx) {
		String var=codeStack.pop();
		
		String op="";
		if(ctx.INC()!=null) op="++";
		else op="--";
		
		if(ctx.TRUE()!=null)
			codeStack.push(op+var);
		else codeStack.push(var+op);		
	}
	@Override public void exitAssignex(JS2JAVAParser.AssignexContext ctx) {
		String op="";
		if(ctx.ASSIGN()!=null) op="=";
		else if(ctx.ADDASSIGN()!=null) op="+=";
		else if(ctx.SUBASSIGN()!=null) op="-=";
		else if(ctx.MULASSIGN()!=null) op="*=";
		else if(ctx.DIVASSIGN()!=null) op="/=";
		else op="%=";
		
		String rhs=codeStack.pop();
		String lhs=codeStack.pop();

		codeStack.push(lhs+op+rhs);
	}	
	@Override public void exitUnaryex(JS2JAVAParser.UnaryexContext ctx) {
		String op="";
		if(ctx.ADD()!=null) op="+";
		else if(ctx.SUB()!=null) op="-";
		else op="!";
		
		String rhs=codeStack.pop();
		
		if(ctx.TRUE()!=null) codeStack.push(op+rhs);
		else codeStack.push(rhs+op);
	}
	@Override public void exitArrayex(JS2JAVAParser.ArrayexContext ctx) {
		String[] elems= new String[ctx.expression().size()];
		for(int i=0;i<ctx.expression().size();i++){
			elems[i]=codeStack.pop();
		}
		
		String elemsStr="";
		
		for(int i=elems.length-1;i>0;i--){
			elemsStr+=elems[i]+", ";
		}
		
		elemsStr+=elems[0];
		codeStack.push("{"+elemsStr+"}");
	}
 	@Override public void exitCallex(JS2JAVAParser.CallexContext ctx) {
		String[] args= new String[ctx.expression().size()];
		for(int i=0;i<ctx.expression().size();i++){
			args[i]=codeStack.pop();
		}
		
		String func=codeStack.pop();
		String argsStr="";
		for(int i=args.length-1;i>0;i--){				
			argsStr+=args[i]+", ";
		}
		argsStr+=args[0];

		codeStack.push(func+"("+argsStr+")");
	}
	@Override public void exitMemberex(JS2JAVAParser.MemberexContext ctx) {
		String property = codeStack.pop();
		String object = codeStack.pop();

		codeStack.push(object+"["+property+"]");
	}
	
	@Override public void exitSwitchcase(JS2JAVAParser.SwitchcaseContext ctx) {
		String[] objs= new String[ctx.obj().size()];
		for(int i=0;i<ctx.obj().size();i++){
			objs[i]=codeStack.pop();
		}
		String objsStr="";
		
		String tabsline = genTabLine();
		for(int i=objs.length-1;i>0;i--){
			objsStr+=tabsline+"\t"+objs[i]+";\n";
		}
		objsStr+=tabsline+"\t"+objs[0]+";";
		
		String test = codeStack.pop();
		
		codeStack.push(tabsline+"case "+test+":\n"+objsStr);
		
	}

	@Override public void exitSwitchstmt(JS2JAVAParser.SwitchstmtContext ctx) {
		String[] cases= new String[ctx.switchcase().size()];
		for(int i=0;i<ctx.switchcase().size();i++){
			cases[i]=codeStack.pop();
		}
		String casesStr="";
		for(int i=cases.length-1;i>0;i--){
			casesStr+=cases[i]+"\n";
		}
		casesStr+=cases[0]+"\n";
		
		String discriminant = codeStack.pop();
		
		String tabsline = genTabLine();
		
		codeStack.push("switch("+discriminant+")\n"+tabsline+"{\n"+casesStr+tabsline+"}");
	}
	
	@Override public void exitExpression(JS2JAVAParser.ExpressionContext ctx) {
		if(ctx.NULL()!=null) codeStack.push("null");
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(JS2JAVAParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitId(JS2JAVAParser.IdContext ctx) { }

	@Override public void exitId2(JS2JAVAParser.Id2Context ctx) {
		String name=ctx.STRING().getText();
		name=name.substring(1, name.length()-1);
		codeStack.push(name);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
