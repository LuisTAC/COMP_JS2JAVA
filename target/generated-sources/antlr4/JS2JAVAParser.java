// Generated from JS2JAVAParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JS2JAVAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENPAR=1, CLOSEPAR=2, OPENBRACES=3, CLOSEBRACES=4, OPENBRACKETS=5, CLOSEBRACKETS=6, 
		TWOPOINTS=7, COMMA=8, TRUE=9, FALSE=10, NULL=11, TYPE=12, VARDEC=13, FUNCDEC=14, 
		VARDECTOR=15, BLOCKSTMT=16, FORSTMT=17, FORINSTMT=18, IFSTMT=19, EXPSTMT=20, 
		WHILESTMT=21, DOWHILESTMT=22, RETURNSTMT=23, IDENTIFIER=24, LITERAL=25, 
		BINARYEX=26, UPDATEEX=27, ASSIGNEX=28, UNARYEX=29, ARRAYEX=30, CALLEX=31, 
		MEMBEREX=32, EXPRESSION=33, ID=34, INIT=35, OPERATOR=36, LEFT=37, RIGHT=38, 
		VALUE=39, NAME=40, RAW=41, KIND=42, EACH=43, ELEMENTS=44, VAR=45, UPDATE=46, 
		ARGUMENT=47, ARGUMENTS=48, DECLARATIONS=49, PARAMS=50, DEFAULTS=51, PREFIX=52, 
		GENERATOR=53, CALLEE=54, TEST=55, CONSEQUENT=56, ALTERNATE=57, COMPUTED=58, 
		OBJECT=59, PROPERTY=60, SOURCETYPE=61, BODY=62, PROGRAM=63, SCRIPT=64, 
		ADD=65, SUB=66, MUL=67, DIV=68, REM=69, EQUAL=70, NEQUAL=71, SMALLER=72, 
		SMALLEREQ=73, BIGGER=74, BIGGEREQ=75, INC=76, DEC=77, NOT=78, ASSIGN=79, 
		ADDASSIGN=80, SUBASSIGN=81, MULASSIGN=82, DIVASSIGN=83, STRING=84, NUMBER=85, 
		WS=86;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_vardecobj = 2, RULE_funcdecobj = 3, 
		RULE_declarations = 4, RULE_variableDeclarator = 5, RULE_params = 6, RULE_defaults = 7, 
		RULE_init_for = 8, RULE_forstmt = 9, RULE_forinstmt = 10, RULE_whilestmt = 11, 
		RULE_dowhilestmt = 12, RULE_blockstmt = 13, RULE_ifstmt = 14, RULE_returnstmt = 15, 
		RULE_expstmt = 16, RULE_init = 17, RULE_literal = 18, RULE_binaryex = 19, 
		RULE_updateex = 20, RULE_assignex = 21, RULE_unaryex = 22, RULE_arrayex = 23, 
		RULE_callex = 24, RULE_memberex = 25, RULE_expression = 26, RULE_id = 27, 
		RULE_id2 = 28;
	public static final String[] ruleNames = {
		"json", "obj", "vardecobj", "funcdecobj", "declarations", "variableDeclarator", 
		"params", "defaults", "init_for", "forstmt", "forinstmt", "whilestmt", 
		"dowhilestmt", "blockstmt", "ifstmt", "returnstmt", "expstmt", "init", 
		"literal", "binaryex", "updateex", "assignex", "unaryex", "arrayex", "callex", 
		"memberex", "expression", "id", "id2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "','", "'true'", 
		"'false'", "'null'", "'\"type\"'", "'\"VariableDeclaration\"'", "'\"FunctionDeclaration\"'", 
		"'\"VariableDeclarator\"'", "'\"BlockStatement\"'", "'\"ForStatement\"'", 
		"'\"ForInStatement\"'", "'\"IfStatement\"'", "'\"ExpressionStatement\"'", 
		"'\"WhileStatement\"'", "'\"DoWhileStatement\"'", "'\"ReturnStatement\"'", 
		"'\"Identifier\"'", "'\"Literal\"'", "'\"BinaryExpression\"'", "'\"UpdateExpression\"'", 
		"'\"AssignmentExpression\"'", "'\"UnaryExpression\"'", "'\"ArrayExpression\"'", 
		"'\"CallExpression\"'", "'\"MemberExpression\"'", "'\"expression\"'", 
		"'\"id\"'", "'\"init\"'", "'\"operator\"'", "'\"left\"'", "'\"right\"'", 
		"'\"value\"'", "'\"name\"'", "'\"raw\"'", "'\"kind\"'", "'\"each\"'", 
		"'\"elements\"'", "'\"var\"'", "'\"update\"'", "'\"argument\"'", "'\"arguments\"'", 
		"'\"declarations\"'", "'\"params\"'", "'\"defaults\"'", "'\"prefix\"'", 
		"'\"generator\"'", "'\"callee\"'", "'\"test\"'", "'\"consequent\"'", "'\"alternate\"'", 
		"'\"computed\"'", "'\"object\"'", "'\"property\"'", "'\"sourceType\"'", 
		"'\"body\"'", "'\"Program\"'", "'\"script\"'", "'\"+\"'", "'\"-\"'", "'\"*\"'", 
		"'\"/\"'", "'\"%\"'", "'\"==\"'", "'\"!=\"'", "'\"<\"'", "'\"<=\"'", "'\">\"'", 
		"'\">=\"'", "'\"++\"'", "'\"--\"'", "'\"!\"'", "'\"=\"'", "'\"+=\"'", 
		"'\"-=\"'", "'\"*=\"'", "'\"/=\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPENPAR", "CLOSEPAR", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", 
		"CLOSEBRACKETS", "TWOPOINTS", "COMMA", "TRUE", "FALSE", "NULL", "TYPE", 
		"VARDEC", "FUNCDEC", "VARDECTOR", "BLOCKSTMT", "FORSTMT", "FORINSTMT", 
		"IFSTMT", "EXPSTMT", "WHILESTMT", "DOWHILESTMT", "RETURNSTMT", "IDENTIFIER", 
		"LITERAL", "BINARYEX", "UPDATEEX", "ASSIGNEX", "UNARYEX", "ARRAYEX", "CALLEX", 
		"MEMBEREX", "EXPRESSION", "ID", "INIT", "OPERATOR", "LEFT", "RIGHT", "VALUE", 
		"NAME", "RAW", "KIND", "EACH", "ELEMENTS", "VAR", "UPDATE", "ARGUMENT", 
		"ARGUMENTS", "DECLARATIONS", "PARAMS", "DEFAULTS", "PREFIX", "GENERATOR", 
		"CALLEE", "TEST", "CONSEQUENT", "ALTERNATE", "COMPUTED", "OBJECT", "PROPERTY", 
		"SOURCETYPE", "BODY", "PROGRAM", "SCRIPT", "ADD", "SUB", "MUL", "DIV", 
		"REM", "EQUAL", "NEQUAL", "SMALLER", "SMALLEREQ", "BIGGER", "BIGGEREQ", 
		"INC", "DEC", "NOT", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
		"DIVASSIGN", "STRING", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JS2JAVAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JS2JAVAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode PROGRAM() { return getToken(JS2JAVAParser.PROGRAM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public TerminalNode SOURCETYPE() { return getToken(JS2JAVAParser.SOURCETYPE, 0); }
		public TerminalNode SCRIPT() { return getToken(JS2JAVAParser.SCRIPT, 0); }
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(OPENBRACES);
			setState(59);
			match(TYPE);
			setState(60);
			match(TWOPOINTS);
			setState(61);
			match(PROGRAM);
			setState(62);
			match(COMMA);
			setState(63);
			match(BODY);
			setState(64);
			match(TWOPOINTS);
			setState(65);
			match(OPENBRACKETS);
			setState(74);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(66);
				obj();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(67);
					match(COMMA);
					setState(68);
					obj();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(CLOSEBRACKETS);
			setState(77);
			match(COMMA);
			setState(78);
			match(SOURCETYPE);
			setState(79);
			match(TWOPOINTS);
			setState(80);
			match(SCRIPT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public VardecobjContext vardecobj() {
			return getRuleContext(VardecobjContext.class,0);
		}
		public FuncdecobjContext funcdecobj() {
			return getRuleContext(FuncdecobjContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ForinstmtContext forinstmt() {
			return getRuleContext(ForinstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public DowhilestmtContext dowhilestmt() {
			return getRuleContext(DowhilestmtContext.class,0);
		}
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public ExpstmtContext expstmt() {
			return getRuleContext(ExpstmtContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				vardecobj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				funcdecobj();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				forstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				forinstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				whilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				dowhilestmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				blockstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				ifstmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				returnstmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				expstmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardecobjContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode VARDEC() { return getToken(JS2JAVAParser.VARDEC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode KIND() { return getToken(JS2JAVAParser.KIND, 0); }
		public TerminalNode VAR() { return getToken(JS2JAVAParser.VAR, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public VardecobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecobj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterVardecobj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitVardecobj(this);
		}
	}

	public final VardecobjContext vardecobj() throws RecognitionException {
		VardecobjContext _localctx = new VardecobjContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardecobj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(OPENBRACES);
			setState(95);
			match(TYPE);
			setState(96);
			match(TWOPOINTS);
			setState(97);
			match(VARDEC);
			setState(98);
			match(COMMA);
			setState(99);
			declarations();
			setState(100);
			match(COMMA);
			setState(101);
			match(KIND);
			setState(102);
			match(TWOPOINTS);
			setState(103);
			match(VAR);
			setState(104);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdecobjContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode FUNCDEC() { return getToken(JS2JAVAParser.FUNCDEC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public DefaultsContext defaults() {
			return getRuleContext(DefaultsContext.class,0);
		}
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public TerminalNode GENERATOR() { return getToken(JS2JAVAParser.GENERATOR, 0); }
		public TerminalNode EXPRESSION() { return getToken(JS2JAVAParser.EXPRESSION, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public List<TerminalNode> TRUE() { return getTokens(JS2JAVAParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(JS2JAVAParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(JS2JAVAParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(JS2JAVAParser.FALSE, i);
		}
		public FuncdecobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecobj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterFuncdecobj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitFuncdecobj(this);
		}
	}

	public final FuncdecobjContext funcdecobj() throws RecognitionException {
		FuncdecobjContext _localctx = new FuncdecobjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdecobj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(OPENBRACES);
			setState(107);
			match(TYPE);
			setState(108);
			match(TWOPOINTS);
			setState(109);
			match(FUNCDEC);
			setState(110);
			match(COMMA);
			setState(111);
			id();
			setState(112);
			match(COMMA);
			setState(113);
			params();
			setState(114);
			match(COMMA);
			setState(115);
			defaults();
			setState(116);
			match(COMMA);
			setState(117);
			match(BODY);
			setState(118);
			match(TWOPOINTS);
			setState(119);
			blockstmt();
			setState(120);
			match(COMMA);
			setState(121);
			match(GENERATOR);
			setState(122);
			match(TWOPOINTS);
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(124);
			match(COMMA);
			setState(125);
			match(EXPRESSION);
			setState(126);
			match(TWOPOINTS);
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(128);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode DECLARATIONS() { return getToken(JS2JAVAParser.DECLARATIONS, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DECLARATIONS);
			setState(131);
			match(TWOPOINTS);
			setState(132);
			match(OPENBRACKETS);
			setState(133);
			match(OPENBRACES);
			setState(134);
			variableDeclarator();
			setState(135);
			match(CLOSEBRACES);
			setState(136);
			match(CLOSEBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public TerminalNode VARDECTOR() { return getToken(JS2JAVAParser.VARDECTOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TYPE);
			setState(139);
			match(TWOPOINTS);
			setState(140);
			match(VARDECTOR);
			setState(141);
			match(COMMA);
			setState(142);
			id();
			setState(143);
			match(COMMA);
			setState(144);
			init();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(JS2JAVAParser.PARAMS, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public List<Id2Context> id2() {
			return getRuleContexts(Id2Context.class);
		}
		public Id2Context id2(int i) {
			return getRuleContext(Id2Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(PARAMS);
			setState(147);
			match(TWOPOINTS);
			setState(148);
			match(OPENBRACKETS);
			setState(157);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(149);
				id2();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					id2();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(159);
			match(CLOSEBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultsContext extends ParserRuleContext {
		public TerminalNode DEFAULTS() { return getToken(JS2JAVAParser.DEFAULTS, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public DefaultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaults; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterDefaults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitDefaults(this);
		}
	}

	public final DefaultsContext defaults() throws RecognitionException {
		DefaultsContext _localctx = new DefaultsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defaults);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(DEFAULTS);
			setState(162);
			match(TWOPOINTS);
			setState(163);
			match(OPENBRACKETS);
			setState(172);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(164);
				expression();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(165);
					match(COMMA);
					setState(166);
					expression();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174);
			match(CLOSEBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_forContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JS2JAVAParser.NULL, 0); }
		public VardecobjContext vardecobj() {
			return getRuleContext(VardecobjContext.class,0);
		}
		public Init_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterInit_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitInit_for(this);
		}
	}

	public final Init_forContext init_for() throws RecognitionException {
		Init_forContext _localctx = new Init_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_init_for);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(NULL);
				}
				break;
			case OPENBRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				vardecobj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode FORSTMT() { return getToken(JS2JAVAParser.FORSTMT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode INIT() { return getToken(JS2JAVAParser.INIT, 0); }
		public Init_forContext init_for() {
			return getRuleContext(Init_forContext.class,0);
		}
		public TerminalNode TEST() { return getToken(JS2JAVAParser.TEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(JS2JAVAParser.UPDATE, 0); }
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(OPENBRACES);
			setState(181);
			match(TYPE);
			setState(182);
			match(TWOPOINTS);
			setState(183);
			match(FORSTMT);
			setState(184);
			match(COMMA);
			setState(185);
			match(INIT);
			setState(186);
			match(TWOPOINTS);
			setState(187);
			init_for();
			setState(188);
			match(COMMA);
			setState(189);
			match(TEST);
			setState(190);
			match(TWOPOINTS);
			setState(191);
			expression();
			setState(192);
			match(COMMA);
			setState(193);
			match(UPDATE);
			setState(194);
			match(TWOPOINTS);
			setState(195);
			expression();
			setState(196);
			match(COMMA);
			setState(197);
			match(BODY);
			setState(198);
			match(TWOPOINTS);
			setState(199);
			obj();
			setState(200);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinstmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode FORINSTMT() { return getToken(JS2JAVAParser.FORINSTMT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode LEFT() { return getToken(JS2JAVAParser.LEFT, 0); }
		public VardecobjContext vardecobj() {
			return getRuleContext(VardecobjContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(JS2JAVAParser.RIGHT, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode EACH() { return getToken(JS2JAVAParser.EACH, 0); }
		public TerminalNode FALSE() { return getToken(JS2JAVAParser.FALSE, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public ForinstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterForinstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitForinstmt(this);
		}
	}

	public final ForinstmtContext forinstmt() throws RecognitionException {
		ForinstmtContext _localctx = new ForinstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forinstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(OPENBRACES);
			setState(203);
			match(TYPE);
			setState(204);
			match(TWOPOINTS);
			setState(205);
			match(FORINSTMT);
			setState(206);
			match(COMMA);
			setState(207);
			match(LEFT);
			setState(208);
			match(TWOPOINTS);
			setState(209);
			vardecobj();
			setState(210);
			match(COMMA);
			setState(211);
			match(RIGHT);
			setState(212);
			match(TWOPOINTS);
			setState(213);
			id2();
			setState(214);
			match(COMMA);
			setState(215);
			match(BODY);
			setState(216);
			match(TWOPOINTS);
			setState(217);
			obj();
			setState(218);
			match(COMMA);
			setState(219);
			match(EACH);
			setState(220);
			match(TWOPOINTS);
			setState(221);
			match(FALSE);
			setState(222);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode WHILESTMT() { return getToken(JS2JAVAParser.WHILESTMT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode TEST() { return getToken(JS2JAVAParser.TEST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(OPENBRACES);
			setState(225);
			match(TYPE);
			setState(226);
			match(TWOPOINTS);
			setState(227);
			match(WHILESTMT);
			setState(228);
			match(COMMA);
			setState(229);
			match(TEST);
			setState(230);
			match(TWOPOINTS);
			setState(231);
			expression();
			setState(232);
			match(COMMA);
			setState(233);
			match(BODY);
			setState(234);
			match(TWOPOINTS);
			setState(235);
			obj();
			setState(236);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhilestmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode DOWHILESTMT() { return getToken(JS2JAVAParser.DOWHILESTMT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode TEST() { return getToken(JS2JAVAParser.TEST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public DowhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterDowhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitDowhilestmt(this);
		}
	}

	public final DowhilestmtContext dowhilestmt() throws RecognitionException {
		DowhilestmtContext _localctx = new DowhilestmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dowhilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(OPENBRACES);
			setState(239);
			match(TYPE);
			setState(240);
			match(TWOPOINTS);
			setState(241);
			match(DOWHILESTMT);
			setState(242);
			match(COMMA);
			setState(243);
			match(BODY);
			setState(244);
			match(TWOPOINTS);
			setState(245);
			obj();
			setState(246);
			match(COMMA);
			setState(247);
			match(TEST);
			setState(248);
			match(TWOPOINTS);
			setState(249);
			expression();
			setState(250);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockstmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode BLOCKSTMT() { return getToken(JS2JAVAParser.BLOCKSTMT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode BODY() { return getToken(JS2JAVAParser.BODY, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterBlockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitBlockstmt(this);
		}
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(OPENBRACES);
			setState(253);
			match(TYPE);
			setState(254);
			match(TWOPOINTS);
			setState(255);
			match(BLOCKSTMT);
			setState(256);
			match(COMMA);
			setState(257);
			match(BODY);
			setState(258);
			match(TWOPOINTS);
			setState(259);
			match(OPENBRACKETS);
			setState(268);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(260);
				obj();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261);
					match(COMMA);
					setState(262);
					obj();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(270);
			match(CLOSEBRACKETS);
			setState(271);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode IFSTMT() { return getToken(JS2JAVAParser.IFSTMT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode TEST() { return getToken(JS2JAVAParser.TEST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONSEQUENT() { return getToken(JS2JAVAParser.CONSEQUENT, 0); }
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public TerminalNode ALTERNATE() { return getToken(JS2JAVAParser.ALTERNATE, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(OPENBRACES);
			setState(274);
			match(TYPE);
			setState(275);
			match(TWOPOINTS);
			setState(276);
			match(IFSTMT);
			setState(277);
			match(COMMA);
			setState(278);
			match(TEST);
			setState(279);
			match(TWOPOINTS);
			setState(280);
			expression();
			setState(281);
			match(COMMA);
			setState(282);
			match(CONSEQUENT);
			setState(283);
			match(TWOPOINTS);
			setState(284);
			obj();
			setState(285);
			match(COMMA);
			setState(286);
			match(ALTERNATE);
			setState(287);
			match(TWOPOINTS);
			setState(288);
			obj();
			setState(289);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode RETURNSTMT() { return getToken(JS2JAVAParser.RETURNSTMT, 0); }
		public TerminalNode COMMA() { return getToken(JS2JAVAParser.COMMA, 0); }
		public TerminalNode ARGUMENT() { return getToken(JS2JAVAParser.ARGUMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(OPENBRACES);
			setState(292);
			match(TYPE);
			setState(293);
			match(TWOPOINTS);
			setState(294);
			match(RETURNSTMT);
			setState(295);
			match(COMMA);
			setState(296);
			match(ARGUMENT);
			setState(297);
			match(TWOPOINTS);
			setState(298);
			expression();
			setState(299);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpstmtContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode EXPSTMT() { return getToken(JS2JAVAParser.EXPSTMT, 0); }
		public TerminalNode COMMA() { return getToken(JS2JAVAParser.COMMA, 0); }
		public TerminalNode EXPRESSION() { return getToken(JS2JAVAParser.EXPRESSION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public ExpstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterExpstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitExpstmt(this);
		}
	}

	public final ExpstmtContext expstmt() throws RecognitionException {
		ExpstmtContext _localctx = new ExpstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(OPENBRACES);
			setState(302);
			match(TYPE);
			setState(303);
			match(TWOPOINTS);
			setState(304);
			match(EXPSTMT);
			setState(305);
			match(COMMA);
			setState(306);
			match(EXPRESSION);
			setState(307);
			match(TWOPOINTS);
			setState(308);
			expression();
			setState(309);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(JS2JAVAParser.INIT, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(INIT);
			setState(312);
			match(TWOPOINTS);
			setState(313);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode LITERAL() { return getToken(JS2JAVAParser.LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode VALUE() { return getToken(JS2JAVAParser.VALUE, 0); }
		public TerminalNode RAW() { return getToken(JS2JAVAParser.RAW, 0); }
		public List<TerminalNode> STRING() { return getTokens(JS2JAVAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JS2JAVAParser.STRING, i);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode NUMBER() { return getToken(JS2JAVAParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(JS2JAVAParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(JS2JAVAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JS2JAVAParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(OPENBRACES);
			setState(316);
			match(TYPE);
			setState(317);
			match(TWOPOINTS);
			setState(318);
			match(LITERAL);
			setState(319);
			match(COMMA);
			setState(320);
			match(VALUE);
			setState(321);
			match(TWOPOINTS);
			setState(322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || _la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(323);
			match(COMMA);
			setState(324);
			match(RAW);
			setState(325);
			match(TWOPOINTS);
			setState(326);
			match(STRING);
			setState(327);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode BINARYEX() { return getToken(JS2JAVAParser.BINARYEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode OPERATOR() { return getToken(JS2JAVAParser.OPERATOR, 0); }
		public TerminalNode LEFT() { return getToken(JS2JAVAParser.LEFT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(JS2JAVAParser.RIGHT, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode ADD() { return getToken(JS2JAVAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JS2JAVAParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(JS2JAVAParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JS2JAVAParser.DIV, 0); }
		public TerminalNode REM() { return getToken(JS2JAVAParser.REM, 0); }
		public TerminalNode EQUAL() { return getToken(JS2JAVAParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(JS2JAVAParser.NEQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(JS2JAVAParser.SMALLER, 0); }
		public TerminalNode SMALLEREQ() { return getToken(JS2JAVAParser.SMALLEREQ, 0); }
		public TerminalNode BIGGER() { return getToken(JS2JAVAParser.BIGGER, 0); }
		public TerminalNode BIGGEREQ() { return getToken(JS2JAVAParser.BIGGEREQ, 0); }
		public BinaryexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterBinaryex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitBinaryex(this);
		}
	}

	public final BinaryexContext binaryex() throws RecognitionException {
		BinaryexContext _localctx = new BinaryexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binaryex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OPENBRACES);
			setState(330);
			match(TYPE);
			setState(331);
			match(TWOPOINTS);
			setState(332);
			match(BINARYEX);
			setState(333);
			match(COMMA);
			setState(334);
			match(OPERATOR);
			setState(335);
			match(TWOPOINTS);
			setState(336);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (DIV - 65)) | (1L << (REM - 65)) | (1L << (EQUAL - 65)) | (1L << (NEQUAL - 65)) | (1L << (SMALLER - 65)) | (1L << (SMALLEREQ - 65)) | (1L << (BIGGER - 65)) | (1L << (BIGGEREQ - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(337);
			match(COMMA);
			setState(338);
			match(LEFT);
			setState(339);
			match(TWOPOINTS);
			setState(340);
			expression();
			setState(341);
			match(COMMA);
			setState(342);
			match(RIGHT);
			setState(343);
			match(TWOPOINTS);
			setState(344);
			expression();
			setState(345);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode UPDATEEX() { return getToken(JS2JAVAParser.UPDATEEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode OPERATOR() { return getToken(JS2JAVAParser.OPERATOR, 0); }
		public TerminalNode ARGUMENT() { return getToken(JS2JAVAParser.ARGUMENT, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode PREFIX() { return getToken(JS2JAVAParser.PREFIX, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode INC() { return getToken(JS2JAVAParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JS2JAVAParser.DEC, 0); }
		public TerminalNode TRUE() { return getToken(JS2JAVAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JS2JAVAParser.FALSE, 0); }
		public UpdateexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterUpdateex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitUpdateex(this);
		}
	}

	public final UpdateexContext updateex() throws RecognitionException {
		UpdateexContext _localctx = new UpdateexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_updateex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(OPENBRACES);
			setState(348);
			match(TYPE);
			setState(349);
			match(TWOPOINTS);
			setState(350);
			match(UPDATEEX);
			setState(351);
			match(COMMA);
			setState(352);
			match(OPERATOR);
			setState(353);
			match(TWOPOINTS);
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(355);
			match(COMMA);
			setState(356);
			match(ARGUMENT);
			setState(357);
			match(TWOPOINTS);
			setState(358);
			id2();
			setState(359);
			match(COMMA);
			setState(360);
			match(PREFIX);
			setState(361);
			match(TWOPOINTS);
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(363);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode ASSIGNEX() { return getToken(JS2JAVAParser.ASSIGNEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode OPERATOR() { return getToken(JS2JAVAParser.OPERATOR, 0); }
		public TerminalNode LEFT() { return getToken(JS2JAVAParser.LEFT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT() { return getToken(JS2JAVAParser.RIGHT, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode ASSIGN() { return getToken(JS2JAVAParser.ASSIGN, 0); }
		public TerminalNode ADDASSIGN() { return getToken(JS2JAVAParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(JS2JAVAParser.SUBASSIGN, 0); }
		public TerminalNode MULASSIGN() { return getToken(JS2JAVAParser.MULASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(JS2JAVAParser.DIVASSIGN, 0); }
		public AssignexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterAssignex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitAssignex(this);
		}
	}

	public final AssignexContext assignex() throws RecognitionException {
		AssignexContext _localctx = new AssignexContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(OPENBRACES);
			setState(366);
			match(TYPE);
			setState(367);
			match(TWOPOINTS);
			setState(368);
			match(ASSIGNEX);
			setState(369);
			match(COMMA);
			setState(370);
			match(OPERATOR);
			setState(371);
			match(TWOPOINTS);
			setState(372);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (ASSIGN - 79)) | (1L << (ADDASSIGN - 79)) | (1L << (SUBASSIGN - 79)) | (1L << (MULASSIGN - 79)) | (1L << (DIVASSIGN - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(373);
			match(COMMA);
			setState(374);
			match(LEFT);
			setState(375);
			match(TWOPOINTS);
			setState(376);
			expression();
			setState(377);
			match(COMMA);
			setState(378);
			match(RIGHT);
			setState(379);
			match(TWOPOINTS);
			setState(380);
			expression();
			setState(381);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode UNARYEX() { return getToken(JS2JAVAParser.UNARYEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode OPERATOR() { return getToken(JS2JAVAParser.OPERATOR, 0); }
		public TerminalNode ARGUMENT() { return getToken(JS2JAVAParser.ARGUMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PREFIX() { return getToken(JS2JAVAParser.PREFIX, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode ADD() { return getToken(JS2JAVAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JS2JAVAParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(JS2JAVAParser.NOT, 0); }
		public TerminalNode TRUE() { return getToken(JS2JAVAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JS2JAVAParser.FALSE, 0); }
		public UnaryexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterUnaryex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitUnaryex(this);
		}
	}

	public final UnaryexContext unaryex() throws RecognitionException {
		UnaryexContext _localctx = new UnaryexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(OPENBRACES);
			setState(384);
			match(TYPE);
			setState(385);
			match(TWOPOINTS);
			setState(386);
			match(UNARYEX);
			setState(387);
			match(COMMA);
			setState(388);
			match(OPERATOR);
			setState(389);
			match(TWOPOINTS);
			setState(390);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (NOT - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(391);
			match(COMMA);
			setState(392);
			match(ARGUMENT);
			setState(393);
			match(TWOPOINTS);
			setState(394);
			expression();
			setState(395);
			match(COMMA);
			setState(396);
			match(PREFIX);
			setState(397);
			match(TWOPOINTS);
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(399);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode ARRAYEX() { return getToken(JS2JAVAParser.ARRAYEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode ELEMENTS() { return getToken(JS2JAVAParser.ELEMENTS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterArrayex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitArrayex(this);
		}
	}

	public final ArrayexContext arrayex() throws RecognitionException {
		ArrayexContext _localctx = new ArrayexContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(OPENBRACES);
			setState(402);
			match(TYPE);
			setState(403);
			match(TWOPOINTS);
			setState(404);
			match(ARRAYEX);
			setState(405);
			match(COMMA);
			setState(406);
			match(ELEMENTS);
			setState(407);
			match(TWOPOINTS);
			setState(408);
			match(OPENBRACKETS);
			setState(417);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(409);
				expression();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(410);
					match(COMMA);
					setState(411);
					expression();
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(419);
			match(CLOSEBRACKETS);
			setState(420);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode CALLEX() { return getToken(JS2JAVAParser.CALLEX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode CALLEE() { return getToken(JS2JAVAParser.CALLEE, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode ARGUMENTS() { return getToken(JS2JAVAParser.ARGUMENTS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterCallex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitCallex(this);
		}
	}

	public final CallexContext callex() throws RecognitionException {
		CallexContext _localctx = new CallexContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OPENBRACES);
			setState(423);
			match(TYPE);
			setState(424);
			match(TWOPOINTS);
			setState(425);
			match(CALLEX);
			setState(426);
			match(COMMA);
			setState(427);
			match(CALLEE);
			setState(428);
			match(TWOPOINTS);
			setState(429);
			id2();
			setState(430);
			match(COMMA);
			setState(431);
			match(ARGUMENTS);
			setState(432);
			match(TWOPOINTS);
			setState(433);
			match(OPENBRACKETS);
			setState(442);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(434);
				expression();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(435);
					match(COMMA);
					setState(436);
					expression();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(444);
			match(CLOSEBRACKETS);
			setState(445);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode MEMBEREX() { return getToken(JS2JAVAParser.MEMBEREX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode COMPUTED() { return getToken(JS2JAVAParser.COMPUTED, 0); }
		public TerminalNode OBJECT() { return getToken(JS2JAVAParser.OBJECT, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode PROPERTY() { return getToken(JS2JAVAParser.PROPERTY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode TRUE() { return getToken(JS2JAVAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JS2JAVAParser.FALSE, 0); }
		public MemberexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterMemberex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitMemberex(this);
		}
	}

	public final MemberexContext memberex() throws RecognitionException {
		MemberexContext _localctx = new MemberexContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_memberex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(OPENBRACES);
			setState(448);
			match(TYPE);
			setState(449);
			match(TWOPOINTS);
			setState(450);
			match(MEMBEREX);
			setState(451);
			match(COMMA);
			setState(452);
			match(COMPUTED);
			setState(453);
			match(TWOPOINTS);
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(455);
			match(COMMA);
			setState(456);
			match(OBJECT);
			setState(457);
			match(TWOPOINTS);
			setState(458);
			id2();
			setState(459);
			match(COMMA);
			setState(460);
			match(PROPERTY);
			setState(461);
			match(TWOPOINTS);
			setState(462);
			expression();
			setState(463);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BinaryexContext binaryex() {
			return getRuleContext(BinaryexContext.class,0);
		}
		public UpdateexContext updateex() {
			return getRuleContext(UpdateexContext.class,0);
		}
		public AssignexContext assignex() {
			return getRuleContext(AssignexContext.class,0);
		}
		public UnaryexContext unaryex() {
			return getRuleContext(UnaryexContext.class,0);
		}
		public ArrayexContext arrayex() {
			return getRuleContext(ArrayexContext.class,0);
		}
		public CallexContext callex() {
			return getRuleContext(CallexContext.class,0);
		}
		public MemberexContext memberex() {
			return getRuleContext(MemberexContext.class,0);
		}
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode NULL() { return getToken(JS2JAVAParser.NULL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				binaryex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				updateex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				assignex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				unaryex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				arrayex();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				callex();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(472);
				memberex();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(473);
				id2();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(474);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JS2JAVAParser.ID, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(ID);
			setState(478);
			match(TWOPOINTS);
			setState(479);
			id2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id2Context extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JS2JAVAParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(JS2JAVAParser.COMMA, 0); }
		public TerminalNode NAME() { return getToken(JS2JAVAParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(JS2JAVAParser.STRING, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public Id2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterId2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitId2(this);
		}
	}

	public final Id2Context id2() throws RecognitionException {
		Id2Context _localctx = new Id2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_id2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(OPENBRACES);
			setState(482);
			match(TYPE);
			setState(483);
			match(TWOPOINTS);
			setState(484);
			match(IDENTIFIER);
			setState(485);
			match(COMMA);
			setState(486);
			match(NAME);
			setState(487);
			match(TWOPOINTS);
			setState(488);
			match(STRING);
			setState(489);
			match(CLOSEBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\5\2M\n\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\5\b\u00a0\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\5\t\u00af\n"+
		"\t\3\t\3\t\3\n\3\n\5\n\u00b5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u010a"+
		"\n\17\f\17\16\17\u010d\13\17\5\17\u010f\n\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u019f\n\31"+
		"\f\31\16\31\u01a2\13\31\5\31\u01a4\n\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01b8"+
		"\n\32\f\32\16\32\u01bb\13\32\5\32\u01bd\n\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01de"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\b\3\2\13\f\4\2\13\rVW\3\2CM\3\2NO\3\2QU\4\2CDPP\u01ef\2<\3"+
		"\2\2\2\4^\3\2\2\2\6`\3\2\2\2\bl\3\2\2\2\n\u0084\3\2\2\2\f\u008c\3\2\2"+
		"\2\16\u0094\3\2\2\2\20\u00a3\3\2\2\2\22\u00b4\3\2\2\2\24\u00b6\3\2\2\2"+
		"\26\u00cc\3\2\2\2\30\u00e2\3\2\2\2\32\u00f0\3\2\2\2\34\u00fe\3\2\2\2\36"+
		"\u0113\3\2\2\2 \u0125\3\2\2\2\"\u012f\3\2\2\2$\u0139\3\2\2\2&\u013d\3"+
		"\2\2\2(\u014b\3\2\2\2*\u015d\3\2\2\2,\u016f\3\2\2\2.\u0181\3\2\2\2\60"+
		"\u0193\3\2\2\2\62\u01a8\3\2\2\2\64\u01c1\3\2\2\2\66\u01dd\3\2\2\28\u01df"+
		"\3\2\2\2:\u01e3\3\2\2\2<=\7\5\2\2=>\7\16\2\2>?\7\t\2\2?@\7A\2\2@A\7\n"+
		"\2\2AB\7@\2\2BC\7\t\2\2CL\7\7\2\2DI\5\4\3\2EF\7\n\2\2FH\5\4\3\2GE\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LD\3\2\2\2LM\3\2"+
		"\2\2MN\3\2\2\2NO\7\b\2\2OP\7\n\2\2PQ\7?\2\2QR\7\t\2\2RS\7B\2\2S\3\3\2"+
		"\2\2T_\5\6\4\2U_\5\b\5\2V_\5\24\13\2W_\5\26\f\2X_\5\30\r\2Y_\5\32\16\2"+
		"Z_\5\34\17\2[_\5\36\20\2\\_\5 \21\2]_\5\"\22\2^T\3\2\2\2^U\3\2\2\2^V\3"+
		"\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]"+
		"\3\2\2\2_\5\3\2\2\2`a\7\5\2\2ab\7\16\2\2bc\7\t\2\2cd\7\17\2\2de\7\n\2"+
		"\2ef\5\n\6\2fg\7\n\2\2gh\7,\2\2hi\7\t\2\2ij\7/\2\2jk\7\6\2\2k\7\3\2\2"+
		"\2lm\7\5\2\2mn\7\16\2\2no\7\t\2\2op\7\20\2\2pq\7\n\2\2qr\58\35\2rs\7\n"+
		"\2\2st\5\16\b\2tu\7\n\2\2uv\5\20\t\2vw\7\n\2\2wx\7@\2\2xy\7\t\2\2yz\5"+
		"\34\17\2z{\7\n\2\2{|\7\67\2\2|}\7\t\2\2}~\t\2\2\2~\177\7\n\2\2\177\u0080"+
		"\7#\2\2\u0080\u0081\7\t\2\2\u0081\u0082\t\2\2\2\u0082\u0083\7\6\2\2\u0083"+
		"\t\3\2\2\2\u0084\u0085\7\63\2\2\u0085\u0086\7\t\2\2\u0086\u0087\7\7\2"+
		"\2\u0087\u0088\7\5\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7\6\2\2\u008a\u008b"+
		"\7\b\2\2\u008b\13\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\7\t\2\2\u008e"+
		"\u008f\7\21\2\2\u008f\u0090\7\n\2\2\u0090\u0091\58\35\2\u0091\u0092\7"+
		"\n\2\2\u0092\u0093\5$\23\2\u0093\r\3\2\2\2\u0094\u0095\7\64\2\2\u0095"+
		"\u0096\7\t\2\2\u0096\u009f\7\7\2\2\u0097\u009c\5:\36\2\u0098\u0099\7\n"+
		"\2\2\u0099\u009b\5:\36\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7\b\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\7\65\2\2\u00a4\u00a5\7\t\2"+
		"\2\u00a5\u00ae\7\7\2\2\u00a6\u00ab\5\66\34\2\u00a7\u00a8\7\n\2\2\u00a8"+
		"\u00aa\5\66\34\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00a6\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\b"+
		"\2\2\u00b1\21\3\2\2\2\u00b2\u00b5\7\r\2\2\u00b3\u00b5\5\6\4\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\7\5\2\2\u00b7"+
		"\u00b8\7\16\2\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\7"+
		"\n\2\2\u00bb\u00bc\7%\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\5\22\n\2\u00be"+
		"\u00bf\7\n\2\2\u00bf\u00c0\79\2\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\66"+
		"\34\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\7\t\2\2\u00c5"+
		"\u00c6\5\66\34\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9\7"+
		"\t\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7\6\2\2\u00cb\25\3\2\2\2\u00cc"+
		"\u00cd\7\5\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\7"+
		"\24\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\7\'\2\2\u00d2\u00d3\7\t\2\2\u00d3"+
		"\u00d4\5\6\4\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7\t"+
		"\2\2\u00d7\u00d8\5:\36\2\u00d8\u00d9\7\n\2\2\u00d9\u00da\7@\2\2\u00da"+
		"\u00db\7\t\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\7\n\2\2\u00dd\u00de\7-"+
		"\2\2\u00de\u00df\7\t\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\7\6\2\2\u00e1"+
		"\27\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e5\7\t\2"+
		"\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\7\n\2\2\u00e7\u00e8\79\2\2\u00e8\u00e9"+
		"\7\t\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\7@\2\2"+
		"\u00ec\u00ed\7\t\2\2\u00ed\u00ee\5\4\3\2\u00ee\u00ef\7\6\2\2\u00ef\31"+
		"\3\2\2\2\u00f0\u00f1\7\5\2\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3\7\t\2\2"+
		"\u00f3\u00f4\7\30\2\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7"+
		"\7\t\2\2\u00f7\u00f8\5\4\3\2\u00f8\u00f9\7\n\2\2\u00f9\u00fa\79\2\2\u00fa"+
		"\u00fb\7\t\2\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\7\6\2\2\u00fd\33\3\2"+
		"\2\2\u00fe\u00ff\7\5\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\7\t\2\2\u0101"+
		"\u0102\7\22\2\2\u0102\u0103\7\n\2\2\u0103\u0104\7@\2\2\u0104\u0105\7\t"+
		"\2\2\u0105\u010e\7\7\2\2\u0106\u010b\5\4\3\2\u0107\u0108\7\n\2\2\u0108"+
		"\u010a\5\4\3\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0106\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\b"+
		"\2\2\u0111\u0112\7\6\2\2\u0112\35\3\2\2\2\u0113\u0114\7\5\2\2\u0114\u0115"+
		"\7\16\2\2\u0115\u0116\7\t\2\2\u0116\u0117\7\25\2\2\u0117\u0118\7\n\2\2"+
		"\u0118\u0119\79\2\2\u0119\u011a\7\t\2\2\u011a\u011b\5\66\34\2\u011b\u011c"+
		"\7\n\2\2\u011c\u011d\7:\2\2\u011d\u011e\7\t\2\2\u011e\u011f\5\4\3\2\u011f"+
		"\u0120\7\n\2\2\u0120\u0121\7;\2\2\u0121\u0122\7\t\2\2\u0122\u0123\5\4"+
		"\3\2\u0123\u0124\7\6\2\2\u0124\37\3\2\2\2\u0125\u0126\7\5\2\2\u0126\u0127"+
		"\7\16\2\2\u0127\u0128\7\t\2\2\u0128\u0129\7\31\2\2\u0129\u012a\7\n\2\2"+
		"\u012a\u012b\7\61\2\2\u012b\u012c\7\t\2\2\u012c\u012d\5\66\34\2\u012d"+
		"\u012e\7\6\2\2\u012e!\3\2\2\2\u012f\u0130\7\5\2\2\u0130\u0131\7\16\2\2"+
		"\u0131\u0132\7\t\2\2\u0132\u0133\7\26\2\2\u0133\u0134\7\n\2\2\u0134\u0135"+
		"\7#\2\2\u0135\u0136\7\t\2\2\u0136\u0137\5\66\34\2\u0137\u0138\7\6\2\2"+
		"\u0138#\3\2\2\2\u0139\u013a\7%\2\2\u013a\u013b\7\t\2\2\u013b\u013c\5\66"+
		"\34\2\u013c%\3\2\2\2\u013d\u013e\7\5\2\2\u013e\u013f\7\16\2\2\u013f\u0140"+
		"\7\t\2\2\u0140\u0141\7\33\2\2\u0141\u0142\7\n\2\2\u0142\u0143\7)\2\2\u0143"+
		"\u0144\7\t\2\2\u0144\u0145\t\3\2\2\u0145\u0146\7\n\2\2\u0146\u0147\7+"+
		"\2\2\u0147\u0148\7\t\2\2\u0148\u0149\7V\2\2\u0149\u014a\7\6\2\2\u014a"+
		"\'\3\2\2\2\u014b\u014c\7\5\2\2\u014c\u014d\7\16\2\2\u014d\u014e\7\t\2"+
		"\2\u014e\u014f\7\34\2\2\u014f\u0150\7\n\2\2\u0150\u0151\7&\2\2\u0151\u0152"+
		"\7\t\2\2\u0152\u0153\t\4\2\2\u0153\u0154\7\n\2\2\u0154\u0155\7\'\2\2\u0155"+
		"\u0156\7\t\2\2\u0156\u0157\5\66\34\2\u0157\u0158\7\n\2\2\u0158\u0159\7"+
		"(\2\2\u0159\u015a\7\t\2\2\u015a\u015b\5\66\34\2\u015b\u015c\7\6\2\2\u015c"+
		")\3\2\2\2\u015d\u015e\7\5\2\2\u015e\u015f\7\16\2\2\u015f\u0160\7\t\2\2"+
		"\u0160\u0161\7\35\2\2\u0161\u0162\7\n\2\2\u0162\u0163\7&\2\2\u0163\u0164"+
		"\7\t\2\2\u0164\u0165\t\5\2\2\u0165\u0166\7\n\2\2\u0166\u0167\7\61\2\2"+
		"\u0167\u0168\7\t\2\2\u0168\u0169\5:\36\2\u0169\u016a\7\n\2\2\u016a\u016b"+
		"\7\66\2\2\u016b\u016c\7\t\2\2\u016c\u016d\t\2\2\2\u016d\u016e\7\6\2\2"+
		"\u016e+\3\2\2\2\u016f\u0170\7\5\2\2\u0170\u0171\7\16\2\2\u0171\u0172\7"+
		"\t\2\2\u0172\u0173\7\36\2\2\u0173\u0174\7\n\2\2\u0174\u0175\7&\2\2\u0175"+
		"\u0176\7\t\2\2\u0176\u0177\t\6\2\2\u0177\u0178\7\n\2\2\u0178\u0179\7\'"+
		"\2\2\u0179\u017a\7\t\2\2\u017a\u017b\5\66\34\2\u017b\u017c\7\n\2\2\u017c"+
		"\u017d\7(\2\2\u017d\u017e\7\t\2\2\u017e\u017f\5\66\34\2\u017f\u0180\7"+
		"\6\2\2\u0180-\3\2\2\2\u0181\u0182\7\5\2\2\u0182\u0183\7\16\2\2\u0183\u0184"+
		"\7\t\2\2\u0184\u0185\7\37\2\2\u0185\u0186\7\n\2\2\u0186\u0187\7&\2\2\u0187"+
		"\u0188\7\t\2\2\u0188\u0189\t\7\2\2\u0189\u018a\7\n\2\2\u018a\u018b\7\61"+
		"\2\2\u018b\u018c\7\t\2\2\u018c\u018d\5\66\34\2\u018d\u018e\7\n\2\2\u018e"+
		"\u018f\7\66\2\2\u018f\u0190\7\t\2\2\u0190\u0191\t\2\2\2\u0191\u0192\7"+
		"\6\2\2\u0192/\3\2\2\2\u0193\u0194\7\5\2\2\u0194\u0195\7\16\2\2\u0195\u0196"+
		"\7\t\2\2\u0196\u0197\7 \2\2\u0197\u0198\7\n\2\2\u0198\u0199\7.\2\2\u0199"+
		"\u019a\7\t\2\2\u019a\u01a3\7\7\2\2\u019b\u01a0\5\66\34\2\u019c\u019d\7"+
		"\n\2\2\u019d\u019f\5\66\34\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a3\u019b\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\7\b\2\2\u01a6\u01a7\7\6\2\2\u01a7\61\3\2\2\2\u01a8\u01a9\7\5\2"+
		"\2\u01a9\u01aa\7\16\2\2\u01aa\u01ab\7\t\2\2\u01ab\u01ac\7!\2\2\u01ac\u01ad"+
		"\7\n\2\2\u01ad\u01ae\78\2\2\u01ae\u01af\7\t\2\2\u01af\u01b0\5:\36\2\u01b0"+
		"\u01b1\7\n\2\2\u01b1\u01b2\7\62\2\2\u01b2\u01b3\7\t\2\2\u01b3\u01bc\7"+
		"\7\2\2\u01b4\u01b9\5\66\34\2\u01b5\u01b6\7\n\2\2\u01b6\u01b8\5\66\34\2"+
		"\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7\b\2\2\u01bf\u01c0\7\6"+
		"\2\2\u01c0\63\3\2\2\2\u01c1\u01c2\7\5\2\2\u01c2\u01c3\7\16\2\2\u01c3\u01c4"+
		"\7\t\2\2\u01c4\u01c5\7\"\2\2\u01c5\u01c6\7\n\2\2\u01c6\u01c7\7<\2\2\u01c7"+
		"\u01c8\7\t\2\2\u01c8\u01c9\t\2\2\2\u01c9\u01ca\7\n\2\2\u01ca\u01cb\7="+
		"\2\2\u01cb\u01cc\7\t\2\2\u01cc\u01cd\5:\36\2\u01cd\u01ce\7\n\2\2\u01ce"+
		"\u01cf\7>\2\2\u01cf\u01d0\7\t\2\2\u01d0\u01d1\5\66\34\2\u01d1\u01d2\7"+
		"\6\2\2\u01d2\65\3\2\2\2\u01d3\u01de\5&\24\2\u01d4\u01de\5(\25\2\u01d5"+
		"\u01de\5*\26\2\u01d6\u01de\5,\27\2\u01d7\u01de\5.\30\2\u01d8\u01de\5\60"+
		"\31\2\u01d9\u01de\5\62\32\2\u01da\u01de\5\64\33\2\u01db\u01de\5:\36\2"+
		"\u01dc\u01de\7\r\2\2\u01dd\u01d3\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d5"+
		"\3\2\2\2\u01dd\u01d6\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd"+
		"\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01de\67\3\2\2\2\u01df\u01e0\7$\2\2\u01e0\u01e1\7\t\2\2\u01e1\u01e2"+
		"\5:\36\2\u01e29\3\2\2\2\u01e3\u01e4\7\5\2\2\u01e4\u01e5\7\16\2\2\u01e5"+
		"\u01e6\7\t\2\2\u01e6\u01e7\7\32\2\2\u01e7\u01e8\7\n\2\2\u01e8\u01e9\7"+
		"*\2\2\u01e9\u01ea\7\t\2\2\u01ea\u01eb\7V\2\2\u01eb\u01ec\7\6\2\2\u01ec"+
		";\3\2\2\2\21IL^\u009c\u009f\u00ab\u00ae\u00b4\u010b\u010e\u01a0\u01a3"+
		"\u01b9\u01bc\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}