// Generated from JS2JAVAParser.g4 by ANTLR 4.5.2
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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENPAR=1, CLOSEPAR=2, OPENBRACES=3, CLOSEBRACES=4, OPENBRACKETS=5, CLOSEBRACKETS=6, 
		TWOPOINTS=7, COMMA=8, TRUE=9, FALSE=10, NULL=11, TYPE=12, VARDEC=13, FUNCDEC=14, 
		VARDECTOR=15, BLOCKSTMT=16, FORSTMT=17, FORINSTMT=18, IFSTMT=19, EXPSTMT=20, 
		WHILESTMT=21, DOWHILESTMT=22, IDENTIFIER=23, LITERAL=24, BINARYEX=25, 
		UPDATEEX=26, ASSIGNEX=27, UNARYEX=28, ARRAYEX=29, CALLEX=30, EXPRESSION=31, 
		ID=32, INIT=33, OPERATOR=34, LEFT=35, RIGHT=36, VALUE=37, NAME=38, RAW=39, 
		KIND=40, EACH=41, ELEMENTS=42, VAR=43, UPDATE=44, ARGUMENT=45, ARGUMENTS=46, 
		DECLARATIONS=47, PARAMS=48, DEFAULTS=49, PREFIX=50, GENERATOR=51, CALLEE=52, 
		TEST=53, CONSEQUENT=54, ALTERNATE=55, SOURCETYPE=56, BODY=57, PROGRAM=58, 
		SCRIPT=59, ADD=60, SUB=61, MUL=62, DIV=63, REM=64, EQUAL=65, NEQUAL=66, 
		SMALLER=67, SMALLEREQ=68, BIGGER=69, BIGGEREQ=70, INC=71, DEC=72, NOT=73, 
		ASSIGN=74, ADDASSIGN=75, SUBASSIGN=76, MULASSIGN=77, DIVASSIGN=78, STRING=79, 
		NUMBER=80, WS=81;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_vardecobj = 2, RULE_funcdecobj = 3, 
		RULE_declarations = 4, RULE_variableDeclarator = 5, RULE_params = 6, RULE_defaults = 7, 
		RULE_init_for = 8, RULE_forstmt = 9, RULE_forinstmt = 10, RULE_whilestmt = 11, 
		RULE_dowhilestmt = 12, RULE_blockstmt = 13, RULE_ifstmt = 14, RULE_expstmt = 15, 
		RULE_init = 16, RULE_literal = 17, RULE_binaryex = 18, RULE_updateex = 19, 
		RULE_assignex = 20, RULE_unaryex = 21, RULE_arrayex = 22, RULE_callex = 23, 
		RULE_expression = 24, RULE_id = 25, RULE_id2 = 26;
	public static final String[] ruleNames = {
		"json", "obj", "vardecobj", "funcdecobj", "declarations", "variableDeclarator", 
		"params", "defaults", "init_for", "forstmt", "forinstmt", "whilestmt", 
		"dowhilestmt", "blockstmt", "ifstmt", "expstmt", "init", "literal", "binaryex", 
		"updateex", "assignex", "unaryex", "arrayex", "callex", "expression", 
		"id", "id2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "','", "'true'", 
		"'false'", "'null'", "'\"type\"'", "'\"VariableDeclaration\"'", "'\"FunctionDeclaration\"'", 
		"'\"VariableDeclarator\"'", "'\"BlockStatement\"'", "'\"ForStatement\"'", 
		"'\"ForInStatement\"'", "'\"IfStatement\"'", "'\"ExpressionStatement\"'", 
		"'\"WhileStatement\"'", "'\"DoWhileStatement\"'", "'\"Identifier\"'", 
		"'\"Literal\"'", "'\"BinaryExpression\"'", "'\"UpdateExpression\"'", "'\"AssignmentExpression\"'", 
		"'\"UnaryExpression\"'", "'\"ArrayExpression\"'", "'\"CallExpression\"'", 
		"'\"expression\"'", "'\"id\"'", "'\"init\"'", "'\"operator\"'", "'\"left\"'", 
		"'\"right\"'", "'\"value\"'", "'\"name\"'", "'\"raw\"'", "'\"kind\"'", 
		"'\"each\"'", "'\"elements\"'", "'\"var\"'", "'\"update\"'", "'\"argument\"'", 
		"'\"arguments\"'", "'\"declarations\"'", "'\"params\"'", "'\"defaults\"'", 
		"'\"prefix\"'", "'\"generator\"'", "'\"callee\"'", "'\"test\"'", "'\"consequent\"'", 
		"'\"alternate\"'", "'\"sourceType\"'", "'\"body\"'", "'\"Program\"'", 
		"'\"script\"'", "'\"+\"'", "'\"-\"'", "'\"*\"'", "'\"/\"'", "'\"%\"'", 
		"'\"==\"'", "'\"!=\"'", "'\"<\"'", "'\"<=\"'", "'\">\"'", "'\">=\"'", 
		"'\"++\"'", "'\"--\"'", "'\"!\"'", "'\"=\"'", "'\"+=\"'", "'\"-=\"'", 
		"'\"*=\"'", "'\"/=\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPENPAR", "CLOSEPAR", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", 
		"CLOSEBRACKETS", "TWOPOINTS", "COMMA", "TRUE", "FALSE", "NULL", "TYPE", 
		"VARDEC", "FUNCDEC", "VARDECTOR", "BLOCKSTMT", "FORSTMT", "FORINSTMT", 
		"IFSTMT", "EXPSTMT", "WHILESTMT", "DOWHILESTMT", "IDENTIFIER", "LITERAL", 
		"BINARYEX", "UPDATEEX", "ASSIGNEX", "UNARYEX", "ARRAYEX", "CALLEX", "EXPRESSION", 
		"ID", "INIT", "OPERATOR", "LEFT", "RIGHT", "VALUE", "NAME", "RAW", "KIND", 
		"EACH", "ELEMENTS", "VAR", "UPDATE", "ARGUMENT", "ARGUMENTS", "DECLARATIONS", 
		"PARAMS", "DEFAULTS", "PREFIX", "GENERATOR", "CALLEE", "TEST", "CONSEQUENT", 
		"ALTERNATE", "SOURCETYPE", "BODY", "PROGRAM", "SCRIPT", "ADD", "SUB", 
		"MUL", "DIV", "REM", "EQUAL", "NEQUAL", "SMALLER", "SMALLEREQ", "BIGGER", 
		"BIGGEREQ", "INC", "DEC", "NOT", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
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
			setState(54);
			match(OPENBRACES);
			setState(55);
			match(TYPE);
			setState(56);
			match(TWOPOINTS);
			setState(57);
			match(PROGRAM);
			setState(58);
			match(COMMA);
			setState(59);
			match(BODY);
			setState(60);
			match(TWOPOINTS);
			setState(61);
			match(OPENBRACKETS);
			setState(70);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(62);
				obj();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63);
					match(COMMA);
					setState(64);
					obj();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(72);
			match(CLOSEBRACKETS);
			setState(73);
			match(COMMA);
			setState(74);
			match(SOURCETYPE);
			setState(75);
			match(TWOPOINTS);
			setState(76);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				vardecobj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				funcdecobj();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				forstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				forinstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				whilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				dowhilestmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				blockstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				ifstmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
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
			setState(89);
			match(OPENBRACES);
			setState(90);
			match(TYPE);
			setState(91);
			match(TWOPOINTS);
			setState(92);
			match(VARDEC);
			setState(93);
			match(COMMA);
			setState(94);
			declarations();
			setState(95);
			match(COMMA);
			setState(96);
			match(KIND);
			setState(97);
			match(TWOPOINTS);
			setState(98);
			match(VAR);
			setState(99);
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
			setState(101);
			match(OPENBRACES);
			setState(102);
			match(TYPE);
			setState(103);
			match(TWOPOINTS);
			setState(104);
			match(FUNCDEC);
			setState(105);
			match(COMMA);
			setState(106);
			id();
			setState(107);
			match(COMMA);
			setState(108);
			params();
			setState(109);
			match(COMMA);
			setState(110);
			defaults();
			setState(111);
			match(COMMA);
			setState(112);
			match(BODY);
			setState(113);
			match(TWOPOINTS);
			setState(114);
			blockstmt();
			setState(115);
			match(COMMA);
			setState(116);
			match(GENERATOR);
			setState(117);
			match(TWOPOINTS);
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(119);
			match(COMMA);
			setState(120);
			match(EXPRESSION);
			setState(121);
			match(TWOPOINTS);
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(123);
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
			setState(125);
			match(DECLARATIONS);
			setState(126);
			match(TWOPOINTS);
			setState(127);
			match(OPENBRACKETS);
			setState(128);
			match(OPENBRACES);
			setState(129);
			variableDeclarator();
			setState(130);
			match(CLOSEBRACES);
			setState(131);
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
			setState(133);
			match(TYPE);
			setState(134);
			match(TWOPOINTS);
			setState(135);
			match(VARDECTOR);
			setState(136);
			match(COMMA);
			setState(137);
			id();
			setState(138);
			match(COMMA);
			setState(139);
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
			setState(141);
			match(PARAMS);
			setState(142);
			match(TWOPOINTS);
			setState(143);
			match(OPENBRACKETS);
			setState(152);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(144);
				id2();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					id2();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154);
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
			setState(156);
			match(DEFAULTS);
			setState(157);
			match(TWOPOINTS);
			setState(158);
			match(OPENBRACKETS);
			setState(167);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(159);
				expression();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					expression();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(169);
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
			setState(173);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(NULL);
				}
				break;
			case OPENBRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
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
			setState(175);
			match(OPENBRACES);
			setState(176);
			match(TYPE);
			setState(177);
			match(TWOPOINTS);
			setState(178);
			match(FORSTMT);
			setState(179);
			match(COMMA);
			setState(180);
			match(INIT);
			setState(181);
			match(TWOPOINTS);
			setState(182);
			init_for();
			setState(183);
			match(COMMA);
			setState(184);
			match(TEST);
			setState(185);
			match(TWOPOINTS);
			setState(186);
			expression();
			setState(187);
			match(COMMA);
			setState(188);
			match(UPDATE);
			setState(189);
			match(TWOPOINTS);
			setState(190);
			expression();
			setState(191);
			match(COMMA);
			setState(192);
			match(BODY);
			setState(193);
			match(TWOPOINTS);
			setState(194);
			obj();
			setState(195);
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
			setState(197);
			match(OPENBRACES);
			setState(198);
			match(TYPE);
			setState(199);
			match(TWOPOINTS);
			setState(200);
			match(FORINSTMT);
			setState(201);
			match(COMMA);
			setState(202);
			match(LEFT);
			setState(203);
			match(TWOPOINTS);
			setState(204);
			vardecobj();
			setState(205);
			match(COMMA);
			setState(206);
			match(RIGHT);
			setState(207);
			match(TWOPOINTS);
			setState(208);
			id2();
			setState(209);
			match(COMMA);
			setState(210);
			match(BODY);
			setState(211);
			match(TWOPOINTS);
			setState(212);
			obj();
			setState(213);
			match(COMMA);
			setState(214);
			match(EACH);
			setState(215);
			match(TWOPOINTS);
			setState(216);
			match(FALSE);
			setState(217);
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
			setState(219);
			match(OPENBRACES);
			setState(220);
			match(TYPE);
			setState(221);
			match(TWOPOINTS);
			setState(222);
			match(WHILESTMT);
			setState(223);
			match(COMMA);
			setState(224);
			match(TEST);
			setState(225);
			match(TWOPOINTS);
			setState(226);
			expression();
			setState(227);
			match(COMMA);
			setState(228);
			match(BODY);
			setState(229);
			match(TWOPOINTS);
			setState(230);
			obj();
			setState(231);
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
			setState(233);
			match(OPENBRACES);
			setState(234);
			match(TYPE);
			setState(235);
			match(TWOPOINTS);
			setState(236);
			match(DOWHILESTMT);
			setState(237);
			match(COMMA);
			setState(238);
			match(BODY);
			setState(239);
			match(TWOPOINTS);
			setState(240);
			obj();
			setState(241);
			match(COMMA);
			setState(242);
			match(TEST);
			setState(243);
			match(TWOPOINTS);
			setState(244);
			expression();
			setState(245);
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
			setState(247);
			match(OPENBRACES);
			setState(248);
			match(TYPE);
			setState(249);
			match(TWOPOINTS);
			setState(250);
			match(BLOCKSTMT);
			setState(251);
			match(COMMA);
			setState(252);
			match(BODY);
			setState(253);
			match(TWOPOINTS);
			setState(254);
			match(OPENBRACKETS);
			setState(263);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(255);
				obj();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(256);
					match(COMMA);
					setState(257);
					obj();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
			match(CLOSEBRACKETS);
			setState(266);
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
			setState(268);
			match(OPENBRACES);
			setState(269);
			match(TYPE);
			setState(270);
			match(TWOPOINTS);
			setState(271);
			match(IFSTMT);
			setState(272);
			match(COMMA);
			setState(273);
			match(TEST);
			setState(274);
			match(TWOPOINTS);
			setState(275);
			expression();
			setState(276);
			match(COMMA);
			setState(277);
			match(CONSEQUENT);
			setState(278);
			match(TWOPOINTS);
			setState(279);
			obj();
			setState(280);
			match(COMMA);
			setState(281);
			match(ALTERNATE);
			setState(282);
			match(TWOPOINTS);
			setState(283);
			obj();
			setState(284);
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
		enterRule(_localctx, 30, RULE_expstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(OPENBRACES);
			setState(287);
			match(TYPE);
			setState(288);
			match(TWOPOINTS);
			setState(289);
			match(EXPSTMT);
			setState(290);
			match(COMMA);
			setState(291);
			match(EXPRESSION);
			setState(292);
			match(TWOPOINTS);
			setState(293);
			expression();
			setState(294);
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
		enterRule(_localctx, 32, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(INIT);
			setState(297);
			match(TWOPOINTS);
			setState(298);
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
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(OPENBRACES);
			setState(301);
			match(TYPE);
			setState(302);
			match(TWOPOINTS);
			setState(303);
			match(LITERAL);
			setState(304);
			match(COMMA);
			setState(305);
			match(VALUE);
			setState(306);
			match(TWOPOINTS);
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || _la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(308);
			match(COMMA);
			setState(309);
			match(RAW);
			setState(310);
			match(TWOPOINTS);
			setState(311);
			match(STRING);
			setState(312);
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
		enterRule(_localctx, 36, RULE_binaryex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(OPENBRACES);
			setState(315);
			match(TYPE);
			setState(316);
			match(TWOPOINTS);
			setState(317);
			match(BINARYEX);
			setState(318);
			match(COMMA);
			setState(319);
			match(OPERATOR);
			setState(320);
			match(TWOPOINTS);
			setState(321);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ADD - 60)) | (1L << (SUB - 60)) | (1L << (MUL - 60)) | (1L << (DIV - 60)) | (1L << (REM - 60)) | (1L << (EQUAL - 60)) | (1L << (NEQUAL - 60)) | (1L << (SMALLER - 60)) | (1L << (SMALLEREQ - 60)) | (1L << (BIGGER - 60)) | (1L << (BIGGEREQ - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(322);
			match(COMMA);
			setState(323);
			match(LEFT);
			setState(324);
			match(TWOPOINTS);
			setState(325);
			expression();
			setState(326);
			match(COMMA);
			setState(327);
			match(RIGHT);
			setState(328);
			match(TWOPOINTS);
			setState(329);
			expression();
			setState(330);
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
		enterRule(_localctx, 38, RULE_updateex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(OPENBRACES);
			setState(333);
			match(TYPE);
			setState(334);
			match(TWOPOINTS);
			setState(335);
			match(UPDATEEX);
			setState(336);
			match(COMMA);
			setState(337);
			match(OPERATOR);
			setState(338);
			match(TWOPOINTS);
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(340);
			match(COMMA);
			setState(341);
			match(ARGUMENT);
			setState(342);
			match(TWOPOINTS);
			setState(343);
			id2();
			setState(344);
			match(COMMA);
			setState(345);
			match(PREFIX);
			setState(346);
			match(TWOPOINTS);
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(348);
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
		enterRule(_localctx, 40, RULE_assignex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(OPENBRACES);
			setState(351);
			match(TYPE);
			setState(352);
			match(TWOPOINTS);
			setState(353);
			match(ASSIGNEX);
			setState(354);
			match(COMMA);
			setState(355);
			match(OPERATOR);
			setState(356);
			match(TWOPOINTS);
			setState(357);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ASSIGN - 74)) | (1L << (ADDASSIGN - 74)) | (1L << (SUBASSIGN - 74)) | (1L << (MULASSIGN - 74)) | (1L << (DIVASSIGN - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(358);
			match(COMMA);
			setState(359);
			match(LEFT);
			setState(360);
			match(TWOPOINTS);
			setState(361);
			expression();
			setState(362);
			match(COMMA);
			setState(363);
			match(RIGHT);
			setState(364);
			match(TWOPOINTS);
			setState(365);
			expression();
			setState(366);
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
		enterRule(_localctx, 42, RULE_unaryex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(OPENBRACES);
			setState(369);
			match(TYPE);
			setState(370);
			match(TWOPOINTS);
			setState(371);
			match(UNARYEX);
			setState(372);
			match(COMMA);
			setState(373);
			match(OPERATOR);
			setState(374);
			match(TWOPOINTS);
			setState(375);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (ADD - 60)) | (1L << (SUB - 60)) | (1L << (NOT - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(376);
			match(COMMA);
			setState(377);
			match(ARGUMENT);
			setState(378);
			match(TWOPOINTS);
			setState(379);
			expression();
			setState(380);
			match(COMMA);
			setState(381);
			match(PREFIX);
			setState(382);
			match(TWOPOINTS);
			setState(383);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(384);
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
		enterRule(_localctx, 44, RULE_arrayex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(OPENBRACES);
			setState(387);
			match(TYPE);
			setState(388);
			match(TWOPOINTS);
			setState(389);
			match(ARRAYEX);
			setState(390);
			match(COMMA);
			setState(391);
			match(ELEMENTS);
			setState(392);
			match(TWOPOINTS);
			setState(393);
			match(OPENBRACKETS);
			setState(402);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(394);
				expression();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(395);
					match(COMMA);
					setState(396);
					expression();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(404);
			match(CLOSEBRACKETS);
			setState(405);
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
		enterRule(_localctx, 46, RULE_callex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(OPENBRACES);
			setState(408);
			match(TYPE);
			setState(409);
			match(TWOPOINTS);
			setState(410);
			match(CALLEX);
			setState(411);
			match(COMMA);
			setState(412);
			match(CALLEE);
			setState(413);
			match(TWOPOINTS);
			setState(414);
			id2();
			setState(415);
			match(COMMA);
			setState(416);
			match(ARGUMENTS);
			setState(417);
			match(TWOPOINTS);
			setState(418);
			match(OPENBRACKETS);
			setState(427);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(419);
				expression();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(420);
					match(COMMA);
					setState(421);
					expression();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429);
			match(CLOSEBRACKETS);
			setState(430);
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
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				binaryex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				updateex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				assignex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				unaryex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				arrayex();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(438);
				callex();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(439);
				id2();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(440);
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
		enterRule(_localctx, 50, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(ID);
			setState(444);
			match(TWOPOINTS);
			setState(445);
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
		enterRule(_localctx, 52, RULE_id2);
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
			match(IDENTIFIER);
			setState(451);
			match(COMMA);
			setState(452);
			match(NAME);
			setState(453);
			match(TWOPOINTS);
			setState(454);
			match(STRING);
			setState(455);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u01cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2D\n\2\f\2\16\2G\13\2\5\2I\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0096"+
		"\n\b\f\b\16\b\u0099\13\b\5\b\u009b\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\5\t\u00aa\n\t\3\t\3\t\3\n\3\n\5\n\u00b0"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0105\n\17\f\17\16\17\u0108\13"+
		"\17\5\17\u010a\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0190\n\30\f\30"+
		"\16\30\u0193\13\30\5\30\u0195\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01a9\n\31"+
		"\f\31\16\31\u01ac\13\31\5\31\u01ae\n\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01bc\n\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\3\2\13\f\4\2\13\r"+
		"QR\3\2>H\3\2IJ\3\2LP\4\2>?KK\u01cd\28\3\2\2\2\4Y\3\2\2\2\6[\3\2\2\2\b"+
		"g\3\2\2\2\n\177\3\2\2\2\f\u0087\3\2\2\2\16\u008f\3\2\2\2\20\u009e\3\2"+
		"\2\2\22\u00af\3\2\2\2\24\u00b1\3\2\2\2\26\u00c7\3\2\2\2\30\u00dd\3\2\2"+
		"\2\32\u00eb\3\2\2\2\34\u00f9\3\2\2\2\36\u010e\3\2\2\2 \u0120\3\2\2\2\""+
		"\u012a\3\2\2\2$\u012e\3\2\2\2&\u013c\3\2\2\2(\u014e\3\2\2\2*\u0160\3\2"+
		"\2\2,\u0172\3\2\2\2.\u0184\3\2\2\2\60\u0199\3\2\2\2\62\u01bb\3\2\2\2\64"+
		"\u01bd\3\2\2\2\66\u01c1\3\2\2\289\7\5\2\29:\7\16\2\2:;\7\t\2\2;<\7<\2"+
		"\2<=\7\n\2\2=>\7;\2\2>?\7\t\2\2?H\7\7\2\2@E\5\4\3\2AB\7\n\2\2BD\5\4\3"+
		"\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H@\3\2\2"+
		"\2HI\3\2\2\2IJ\3\2\2\2JK\7\b\2\2KL\7\n\2\2LM\7:\2\2MN\7\t\2\2NO\7=\2\2"+
		"O\3\3\2\2\2PZ\5\6\4\2QZ\5\b\5\2RZ\5\24\13\2SZ\5\26\f\2TZ\5\30\r\2UZ\5"+
		"\32\16\2VZ\5\34\17\2WZ\5\36\20\2XZ\5 \21\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2"+
		"\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\5\3\2"+
		"\2\2[\\\7\5\2\2\\]\7\16\2\2]^\7\t\2\2^_\7\17\2\2_`\7\n\2\2`a\5\n\6\2a"+
		"b\7\n\2\2bc\7*\2\2cd\7\t\2\2de\7-\2\2ef\7\6\2\2f\7\3\2\2\2gh\7\5\2\2h"+
		"i\7\16\2\2ij\7\t\2\2jk\7\20\2\2kl\7\n\2\2lm\5\64\33\2mn\7\n\2\2no\5\16"+
		"\b\2op\7\n\2\2pq\5\20\t\2qr\7\n\2\2rs\7;\2\2st\7\t\2\2tu\5\34\17\2uv\7"+
		"\n\2\2vw\7\65\2\2wx\7\t\2\2xy\t\2\2\2yz\7\n\2\2z{\7!\2\2{|\7\t\2\2|}\t"+
		"\2\2\2}~\7\6\2\2~\t\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7\t\2\2\u0081"+
		"\u0082\7\7\2\2\u0082\u0083\7\5\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7\6"+
		"\2\2\u0085\u0086\7\b\2\2\u0086\13\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089"+
		"\7\t\2\2\u0089\u008a\7\21\2\2\u008a\u008b\7\n\2\2\u008b\u008c\5\64\33"+
		"\2\u008c\u008d\7\n\2\2\u008d\u008e\5\"\22\2\u008e\r\3\2\2\2\u008f\u0090"+
		"\7\62\2\2\u0090\u0091\7\t\2\2\u0091\u009a\7\7\2\2\u0092\u0097\5\66\34"+
		"\2\u0093\u0094\7\n\2\2\u0094\u0096\5\66\34\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7\b\2\2\u009d\17\3\2\2\2\u009e\u009f\7\63\2"+
		"\2\u009f\u00a0\7\t\2\2\u00a0\u00a9\7\7\2\2\u00a1\u00a6\5\62\32\2\u00a2"+
		"\u00a3\7\n\2\2\u00a3\u00a5\5\62\32\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\7\b\2\2\u00ac\21\3\2\2\2\u00ad\u00b0\7\r\2\2\u00ae\u00b0"+
		"\5\6\4\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\23\3\2\2\2\u00b1"+
		"\u00b2\7\5\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\7\t\2\2\u00b4\u00b5\7"+
		"\23\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7\t\2\2\u00b8"+
		"\u00b9\5\22\n\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\7\67\2\2\u00bb\u00bc\7"+
		"\t\2\2\u00bc\u00bd\5\62\32\2\u00bd\u00be\7\n\2\2\u00be\u00bf\7.\2\2\u00bf"+
		"\u00c0\7\t\2\2\u00c0\u00c1\5\62\32\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\7"+
		";\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5\4\3\2\u00c5\u00c6\7\6\2\2\u00c6"+
		"\25\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca\7\t\2"+
		"\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\7\n\2\2\u00cc\u00cd\7%\2\2\u00cd\u00ce"+
		"\7\t\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7&\2\2\u00d1"+
		"\u00d2\7\t\2\2\u00d2\u00d3\5\66\34\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\7"+
		";\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\4\3\2\u00d7\u00d8\7\n\2\2\u00d8"+
		"\u00d9\7+\2\2\u00d9\u00da\7\t\2\2\u00da\u00db\7\f\2\2\u00db\u00dc\7\6"+
		"\2\2\u00dc\27\3\2\2\2\u00dd\u00de\7\5\2\2\u00de\u00df\7\16\2\2\u00df\u00e0"+
		"\7\t\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e2\7\n\2\2\u00e2\u00e3\7\67\2\2"+
		"\u00e3\u00e4\7\t\2\2\u00e4\u00e5\5\62\32\2\u00e5\u00e6\7\n\2\2\u00e6\u00e7"+
		"\7;\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea\7\6\2\2\u00ea"+
		"\31\3\2\2\2\u00eb\u00ec\7\5\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\7\t\2"+
		"\2\u00ee\u00ef\7\30\2\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\7;\2\2\u00f1\u00f2"+
		"\7\t\2\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\7\n\2\2\u00f4\u00f5\7\67\2\2"+
		"\u00f5\u00f6\7\t\2\2\u00f6\u00f7\5\62\32\2\u00f7\u00f8\7\6\2\2\u00f8\33"+
		"\3\2\2\2\u00f9\u00fa\7\5\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00fc\7\t\2\2"+
		"\u00fc\u00fd\7\22\2\2\u00fd\u00fe\7\n\2\2\u00fe\u00ff\7;\2\2\u00ff\u0100"+
		"\7\t\2\2\u0100\u0109\7\7\2\2\u0101\u0106\5\4\3\2\u0102\u0103\7\n\2\2\u0103"+
		"\u0105\5\4\3\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\b"+
		"\2\2\u010c\u010d\7\6\2\2\u010d\35\3\2\2\2\u010e\u010f\7\5\2\2\u010f\u0110"+
		"\7\16\2\2\u0110\u0111\7\t\2\2\u0111\u0112\7\25\2\2\u0112\u0113\7\n\2\2"+
		"\u0113\u0114\7\67\2\2\u0114\u0115\7\t\2\2\u0115\u0116\5\62\32\2\u0116"+
		"\u0117\7\n\2\2\u0117\u0118\78\2\2\u0118\u0119\7\t\2\2\u0119\u011a\5\4"+
		"\3\2\u011a\u011b\7\n\2\2\u011b\u011c\79\2\2\u011c\u011d\7\t\2\2\u011d"+
		"\u011e\5\4\3\2\u011e\u011f\7\6\2\2\u011f\37\3\2\2\2\u0120\u0121\7\5\2"+
		"\2\u0121\u0122\7\16\2\2\u0122\u0123\7\t\2\2\u0123\u0124\7\26\2\2\u0124"+
		"\u0125\7\n\2\2\u0125\u0126\7!\2\2\u0126\u0127\7\t\2\2\u0127\u0128\5\62"+
		"\32\2\u0128\u0129\7\6\2\2\u0129!\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c"+
		"\7\t\2\2\u012c\u012d\5\62\32\2\u012d#\3\2\2\2\u012e\u012f\7\5\2\2\u012f"+
		"\u0130\7\16\2\2\u0130\u0131\7\t\2\2\u0131\u0132\7\32\2\2\u0132\u0133\7"+
		"\n\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7\t\2\2\u0135\u0136\t\3\2\2\u0136"+
		"\u0137\7\n\2\2\u0137\u0138\7)\2\2\u0138\u0139\7\t\2\2\u0139\u013a\7Q\2"+
		"\2\u013a\u013b\7\6\2\2\u013b%\3\2\2\2\u013c\u013d\7\5\2\2\u013d\u013e"+
		"\7\16\2\2\u013e\u013f\7\t\2\2\u013f\u0140\7\33\2\2\u0140\u0141\7\n\2\2"+
		"\u0141\u0142\7$\2\2\u0142\u0143\7\t\2\2\u0143\u0144\t\4\2\2\u0144\u0145"+
		"\7\n\2\2\u0145\u0146\7%\2\2\u0146\u0147\7\t\2\2\u0147\u0148\5\62\32\2"+
		"\u0148\u0149\7\n\2\2\u0149\u014a\7&\2\2\u014a\u014b\7\t\2\2\u014b\u014c"+
		"\5\62\32\2\u014c\u014d\7\6\2\2\u014d\'\3\2\2\2\u014e\u014f\7\5\2\2\u014f"+
		"\u0150\7\16\2\2\u0150\u0151\7\t\2\2\u0151\u0152\7\34\2\2\u0152\u0153\7"+
		"\n\2\2\u0153\u0154\7$\2\2\u0154\u0155\7\t\2\2\u0155\u0156\t\5\2\2\u0156"+
		"\u0157\7\n\2\2\u0157\u0158\7/\2\2\u0158\u0159\7\t\2\2\u0159\u015a\5\66"+
		"\34\2\u015a\u015b\7\n\2\2\u015b\u015c\7\64\2\2\u015c\u015d\7\t\2\2\u015d"+
		"\u015e\t\2\2\2\u015e\u015f\7\6\2\2\u015f)\3\2\2\2\u0160\u0161\7\5\2\2"+
		"\u0161\u0162\7\16\2\2\u0162\u0163\7\t\2\2\u0163\u0164\7\35\2\2\u0164\u0165"+
		"\7\n\2\2\u0165\u0166\7$\2\2\u0166\u0167\7\t\2\2\u0167\u0168\t\6\2\2\u0168"+
		"\u0169\7\n\2\2\u0169\u016a\7%\2\2\u016a\u016b\7\t\2\2\u016b\u016c\5\62"+
		"\32\2\u016c\u016d\7\n\2\2\u016d\u016e\7&\2\2\u016e\u016f\7\t\2\2\u016f"+
		"\u0170\5\62\32\2\u0170\u0171\7\6\2\2\u0171+\3\2\2\2\u0172\u0173\7\5\2"+
		"\2\u0173\u0174\7\16\2\2\u0174\u0175\7\t\2\2\u0175\u0176\7\36\2\2\u0176"+
		"\u0177\7\n\2\2\u0177\u0178\7$\2\2\u0178\u0179\7\t\2\2\u0179\u017a\t\7"+
		"\2\2\u017a\u017b\7\n\2\2\u017b\u017c\7/\2\2\u017c\u017d\7\t\2\2\u017d"+
		"\u017e\5\62\32\2\u017e\u017f\7\n\2\2\u017f\u0180\7\64\2\2\u0180\u0181"+
		"\7\t\2\2\u0181\u0182\t\2\2\2\u0182\u0183\7\6\2\2\u0183-\3\2\2\2\u0184"+
		"\u0185\7\5\2\2\u0185\u0186\7\16\2\2\u0186\u0187\7\t\2\2\u0187\u0188\7"+
		"\37\2\2\u0188\u0189\7\n\2\2\u0189\u018a\7,\2\2\u018a\u018b\7\t\2\2\u018b"+
		"\u0194\7\7\2\2\u018c\u0191\5\62\32\2\u018d\u018e\7\n\2\2\u018e\u0190\5"+
		"\62\32\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u018c\3\2"+
		"\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7\b\2\2\u0197"+
		"\u0198\7\6\2\2\u0198/\3\2\2\2\u0199\u019a\7\5\2\2\u019a\u019b\7\16\2\2"+
		"\u019b\u019c\7\t\2\2\u019c\u019d\7 \2\2\u019d\u019e\7\n\2\2\u019e\u019f"+
		"\7\66\2\2\u019f\u01a0\7\t\2\2\u01a0\u01a1\5\66\34\2\u01a1\u01a2\7\n\2"+
		"\2\u01a2\u01a3\7\60\2\2\u01a3\u01a4\7\t\2\2\u01a4\u01ad\7\7\2\2\u01a5"+
		"\u01aa\5\62\32\2\u01a6\u01a7\7\n\2\2\u01a7\u01a9\5\62\32\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\b\2\2\u01b0\u01b1\7\6\2\2\u01b1"+
		"\61\3\2\2\2\u01b2\u01bc\5$\23\2\u01b3\u01bc\5&\24\2\u01b4\u01bc\5(\25"+
		"\2\u01b5\u01bc\5*\26\2\u01b6\u01bc\5,\27\2\u01b7\u01bc\5.\30\2\u01b8\u01bc"+
		"\5\60\31\2\u01b9\u01bc\5\66\34\2\u01ba\u01bc\7\r\2\2\u01bb\u01b2\3\2\2"+
		"\2\u01bb\u01b3\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b6"+
		"\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\63\3\2\2\2\u01bd\u01be\7\"\2\2\u01be\u01bf\7\t\2"+
		"\2\u01bf\u01c0\5\66\34\2\u01c0\65\3\2\2\2\u01c1\u01c2\7\5\2\2\u01c2\u01c3"+
		"\7\16\2\2\u01c3\u01c4\7\t\2\2\u01c4\u01c5\7\31\2\2\u01c5\u01c6\7\n\2\2"+
		"\u01c6\u01c7\7(\2\2\u01c7\u01c8\7\t\2\2\u01c8\u01c9\7Q\2\2\u01c9\u01ca"+
		"\7\6\2\2\u01ca\67\3\2\2\2\21EHY\u0097\u009a\u00a6\u00a9\u00af\u0106\u0109"+
		"\u0191\u0194\u01aa\u01ad\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}