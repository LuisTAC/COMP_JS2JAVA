import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends JS2JAVAParserBaseListener {
	
	private HashMap<String, Var> varTypes = new HashMap<String, Var>();
	private HashMap<String, Method> methodTypes = new HashMap<String,Method>();
	
	private String currScope="1";
	
	public Stack<String> codeStack = new Stack<String>();
	
	public void setVarTypes(HashMap<String, Var> varTypes) {
		this.varTypes = varTypes;
	}
	
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
	@Override public void exitVardecobj(JS2JAVAParser.VardecobjContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuncdecobj(JS2JAVAParser.FuncdecobjContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuncdecobj(JS2JAVAParser.FuncdecobjContext ctx) { }
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParams(JS2JAVAParser.ParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParams(JS2JAVAParser.ParamsContext ctx) { }
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInit_for(JS2JAVAParser.Init_forContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInit_for(JS2JAVAParser.Init_forContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForstmt(JS2JAVAParser.ForstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForstmt(JS2JAVAParser.ForstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForinstmt(JS2JAVAParser.ForinstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForinstmt(JS2JAVAParser.ForinstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhilestmt(JS2JAVAParser.WhilestmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhilestmt(JS2JAVAParser.WhilestmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDowhilestmt(JS2JAVAParser.DowhilestmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDowhilestmt(JS2JAVAParser.DowhilestmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlockstmt(JS2JAVAParser.BlockstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlockstmt(JS2JAVAParser.BlockstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfstmt(JS2JAVAParser.IfstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfstmt(JS2JAVAParser.IfstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnstmt(JS2JAVAParser.ReturnstmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnstmt(JS2JAVAParser.ReturnstmtContext ctx) { }
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
		String type="";
		String val="";
		
		if(ctx.STRING().size()>1) {
			type="String";
			val = ctx.STRING(0).getText();
		}
		else if(ctx.TRUE()!=null) {
			type="boolean";
			val="true";
		}
		else if(ctx.FALSE()!=null) {
			type="boolean";
			val="false";
		}
		else if(ctx.NULL()!=null) {
			type="null";
			val="null";
		}
		else { //NUMBER
			val=ctx.NUMBER().getText();
			if(val.contains(".")) type="float";
			else type="int";
		}
		
		codeStack.push(type+":"+val);
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
		String[] rhsArr=rhs.split(":");
		String rhsType="";
		if(rhsArr.length>1) {
			rhsType = rhsArr[0];
			rhs=rhsArr[1];
		}
		//TODO else getVarType
		
		String lhs=codeStack.pop();
		String[] lhsArr=lhs.split(":");
		String lhsType="";
		if(lhsArr.length>1) {
			lhsType=lhsArr[0];
			lhs=lhsArr[1];
		}
		//TODO else getVarType
		
		String type="";
		if(lhsType.equals("ERROR")||rhsType.equals("ERROR")) type="ERROR";
		else if(op.matches("(==|!=)")) type="boolean";
		else if((lhsType.equals("String")||rhsType.equals("String")) && op.equals("+")) type="String";
		else if(lhsType.equals("float")||rhsType.equals("float")) type="float";
		else if(lhsType.equals("int")&&rhsType.equals("int")) type="int";
		else type="ERROR";
		
		codeStack.push(type+":("+lhs+" "+op+" "+rhs+")");
	}
	@Override public void exitLogicalex(JS2JAVAParser.LogicalexContext ctx) {
		String op="";
		if(ctx.AND()!=null) op="&&";
		else op="||";
		
		String rhs=codeStack.pop();
		String[] rhsArr=rhs.split(":");
		String rhsType="";
		if(rhsArr.length>1) {
			rhsType = rhsArr[0];
			rhs=rhsArr[1];
		}
		//TODO else getVarType
		
		String lhs=codeStack.pop();
		String[] lhsArr=lhs.split(":");
		String lhsType="";
		if(lhsArr.length>1) {
			lhsType=lhsArr[0];
			lhs=lhsArr[1];
		}
		//TODO else getVarType
		
		String type="";
		if(lhsType.equals("boolean")&&rhsType.equals("boolean")) type="boolean";
		else type="ERROR";
		
		codeStack.push(type+":("+lhs+" "+op+" "+rhs+")");
	}
	@Override public void exitUpdateex(JS2JAVAParser.UpdateexContext ctx) {
		String var=codeStack.pop();
		
		String op="";
		if(ctx.INC()!=null) op="++";
		else op="--";
		
		//TODO check if var is int 
		
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
		String[] rhsArr=rhs.split(":");
		String rhsType="";
		if(rhsArr.length>1) {
			rhsType = rhsArr[0];
			rhs=rhsArr[1];
		}
		//TODO else getVarType
		//TODO put varType
		
		String lhs=codeStack.pop();
		
		codeStack.push(lhs+op+rhs);
	}	
	@Override public void exitUnaryex(JS2JAVAParser.UnaryexContext ctx) {
		String op="";
		if(ctx.ADD()!=null) op="+";
		else if(ctx.SUB()!=null) op="-";
		else op="!";
		
		String rhs=codeStack.pop();
		String[] rhsArr=rhs.split(":");
		String rhsType="";
		if(rhsArr.length>1) {
			rhsType = rhsArr[0];
			rhs=rhsArr[1];
		}
		//TODO else getVarType
		
		String type="";
		if(op.matches("(\\+|-)") && (rhsType.equals("int")||rhsType.equals("float"))) type=rhsType;
		else if(op.equals("!") && rhsType.equals("boolean")) type="boolean";
		else type="ERROR";
		
		if(ctx.TRUE()!=null)
			codeStack.push(type+":"+op+rhs);
		else codeStack.push(type+":"+rhs+op);
	}
	@Override public void exitArrayex(JS2JAVAParser.ArrayexContext ctx) {
		String[] elems= new String[ctx.expression().size()];
		for(int i=0;i<ctx.expression().size();i++){
			elems[i]=codeStack.pop();
		}
		
		String elemsType="";
		String elemsStr="";
		boolean error=false;
		for(int i=elems.length-1;i>0;i--){
			String elem=elems[i];
			String[] elemArr=elem.split(":");
			String elemType="";
			if(elemArr.length>1) {
				elemType = elemArr[0];
				elem=elemArr[1];
			}
			if(i==elems.length-1) {
				elemsType=elemType;
			}
			else if(elemType!=elemsType) {
				if((elemsType.equals("float") && elemType.equals("int"))
						|| (elemsType.equals("int") && elemType.equals("float")))
					elemsType="float";
				else error=true;
			}
			
			elemsStr+=elem+", ";
		}
		
		String[] elemArr=elems[0].split(":");
		String elemType=elemArr[0];
		String elem=elemArr[1];
		if(elemType!=elemsType) {
			if((elemsType.equals("float") && elemType.equals("int"))
					|| (elemsType.equals("int") && elemType.equals("float")))
				elemsType="float";
			else error=true;
		}
		elemsStr+=elem;
		
		if(error) codeStack.push("ERROR:{"+elemsStr+"}");
		else codeStack.push(elemsType+":{"+elemsStr+"}");
	}
	@Override public void exitCallex(JS2JAVAParser.CallexContext ctx) {
		String[] args= new String[ctx.expression().size()];
		for(int i=0;i<ctx.expression().size();i++){
			args[i]=codeStack.pop();
		}
		
		boolean error=false;
		String func=codeStack.pop();
		Method method=methodTypes.get(func);
		String argsStr="";
		if(method!=null) {
			
			for(int i=args.length-1;i>0;i--){
				String arg=args[i];
				String[] argArr=arg.split(":");
				String argType="";
				if(argArr.length>1) {
					argType = argArr[0];
					arg=argArr[1];
				}
				if(argType!=method.getParameter(i)) error=true;
				
				argsStr+=arg+", ";
			}
			String[] argArr=args[0].split(":");
			if(argArr.length>1) argsStr+=argArr[1];
			else argsStr+=argArr[0];
		}
		else {
			for(int i=args.length-1;i>0;i--){
				String arg=args[i];
				String[] argArr=arg.split(":");
				if(argArr.length>1) {
					arg=argArr[1];
				}				
				argsStr+=arg+", ";
			}
			String[] argArr=args[0].split(":");
			if(argArr.length>1) argsStr+=argArr[1];
			else argsStr+=argArr[0];
			
		}
		
		if(error) {
			func=func.split(":")[1];
			codeStack.push("ERROR:"+func+"("+argsStr+")");
		}
		else codeStack.push(func+"("+argsStr+")");
	}

	@Override public void exitMemberex(JS2JAVAParser.MemberexContext ctx) {
		String property = codeStack.pop();
		String object = codeStack.pop();
		
		String[] objArr=object.split(":");
		String objType= objArr[0];
		object=objArr[1];
		
		String[] propArr=property.split(":");
		String propType= propArr[0];
		property=propArr[1];
		if(!propType.equals("int") && !propType.equals("UNDEF"))
			objType = "ERROR";
		
		codeStack.push(objType+":"+object+"["+property+"]");
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
		Method method=methodTypes.get(name);
		if(method==null) {
			Var var=varTypes.get(name);
			if(var==null) codeStack.push("UNDEF:"+name);
			else codeStack.push(var.getType()+":"+name);
		}
		else codeStack.push(method.getType()+":"+name);
		
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
