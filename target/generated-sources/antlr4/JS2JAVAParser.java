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
		BINARYEX=26, LOGICALEX=27, UPDATEEX=28, ASSIGNEX=29, UNARYEX=30, ARRAYEX=31, 
		CALLEX=32, MEMBEREX=33, EXPRESSION=34, ID=35, INIT=36, OPERATOR=37, LEFT=38, 
		RIGHT=39, VALUE=40, NAME=41, RAW=42, KIND=43, EACH=44, ELEMENTS=45, VAR=46, 
		UPDATE=47, ARGUMENT=48, ARGUMENTS=49, DECLARATIONS=50, PARAMS=51, DEFAULTS=52, 
		PREFIX=53, GENERATOR=54, CALLEE=55, TEST=56, CONSEQUENT=57, ALTERNATE=58, 
		COMPUTED=59, OBJECT=60, PROPERTY=61, SOURCETYPE=62, BODY=63, PROGRAM=64, 
		SCRIPT=65, ADD=66, SUB=67, MUL=68, DIV=69, REM=70, EQUAL=71, NEQUAL=72, 
		SMALLER=73, SMALLEREQ=74, BIGGER=75, BIGGEREQ=76, INC=77, DEC=78, NOT=79, 
		ASSIGN=80, ADDASSIGN=81, SUBASSIGN=82, MULASSIGN=83, DIVASSIGN=84, REMASSIGN=85, 
		AND=86, OR=87, STRING=88, NUMBER=89, WS=90;
	public static final int
		RULE_json = 0, RULE_obj = 1, RULE_vardecobj = 2, RULE_funcdecobj = 3, 
		RULE_declarations = 4, RULE_variableDeclarator = 5, RULE_params = 6, RULE_defaults = 7, 
		RULE_init_for = 8, RULE_forstmt = 9, RULE_forinstmt = 10, RULE_whilestmt = 11, 
		RULE_dowhilestmt = 12, RULE_blockstmt = 13, RULE_ifstmt = 14, RULE_returnstmt = 15, 
		RULE_expstmt = 16, RULE_init = 17, RULE_literal = 18, RULE_binaryex = 19, 
		RULE_logicalex = 20, RULE_updateex = 21, RULE_assignex = 22, RULE_unaryex = 23, 
		RULE_arrayex = 24, RULE_callex = 25, RULE_memberex = 26, RULE_expression = 27, 
		RULE_id = 28, RULE_id2 = 29;
	public static final String[] ruleNames = {
		"json", "obj", "vardecobj", "funcdecobj", "declarations", "variableDeclarator", 
		"params", "defaults", "init_for", "forstmt", "forinstmt", "whilestmt", 
		"dowhilestmt", "blockstmt", "ifstmt", "returnstmt", "expstmt", "init", 
		"literal", "binaryex", "logicalex", "updateex", "assignex", "unaryex", 
		"arrayex", "callex", "memberex", "expression", "id", "id2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "','", "'true'", 
		"'false'", "'null'", "'\"type\"'", "'\"VariableDeclaration\"'", "'\"FunctionDeclaration\"'", 
		"'\"VariableDeclarator\"'", "'\"BlockStatement\"'", "'\"ForStatement\"'", 
		"'\"ForInStatement\"'", "'\"IfStatement\"'", "'\"ExpressionStatement\"'", 
		"'\"WhileStatement\"'", "'\"DoWhileStatement\"'", "'\"ReturnStatement\"'", 
		"'\"Identifier\"'", "'\"Literal\"'", "'\"BinaryExpression\"'", "'\"LogicalExpression\"'", 
		"'\"UpdateExpression\"'", "'\"AssignmentExpression\"'", "'\"UnaryExpression\"'", 
		"'\"ArrayExpression\"'", "'\"CallExpression\"'", "'\"MemberExpression\"'", 
		"'\"expression\"'", "'\"id\"'", "'\"init\"'", "'\"operator\"'", "'\"left\"'", 
		"'\"right\"'", "'\"value\"'", "'\"name\"'", "'\"raw\"'", "'\"kind\"'", 
		"'\"each\"'", "'\"elements\"'", "'\"var\"'", "'\"update\"'", "'\"argument\"'", 
		"'\"arguments\"'", "'\"declarations\"'", "'\"params\"'", "'\"defaults\"'", 
		"'\"prefix\"'", "'\"generator\"'", "'\"callee\"'", "'\"test\"'", "'\"consequent\"'", 
		"'\"alternate\"'", "'\"computed\"'", "'\"object\"'", "'\"property\"'", 
		"'\"sourceType\"'", "'\"body\"'", "'\"Program\"'", "'\"script\"'", "'\"+\"'", 
		"'\"-\"'", "'\"*\"'", "'\"/\"'", "'\"%\"'", "'\"==\"'", "'\"!=\"'", "'\"<\"'", 
		"'\"<=\"'", "'\">\"'", "'\">=\"'", "'\"++\"'", "'\"--\"'", "'\"!\"'", 
		"'\"=\"'", "'\"+=\"'", "'\"-=\"'", "'\"*=\"'", "'\"/=\"'", "'\"%=\"'", 
		"'\"&&\"'", "'\"||\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPENPAR", "CLOSEPAR", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", 
		"CLOSEBRACKETS", "TWOPOINTS", "COMMA", "TRUE", "FALSE", "NULL", "TYPE", 
		"VARDEC", "FUNCDEC", "VARDECTOR", "BLOCKSTMT", "FORSTMT", "FORINSTMT", 
		"IFSTMT", "EXPSTMT", "WHILESTMT", "DOWHILESTMT", "RETURNSTMT", "IDENTIFIER", 
		"LITERAL", "BINARYEX", "LOGICALEX", "UPDATEEX", "ASSIGNEX", "UNARYEX", 
		"ARRAYEX", "CALLEX", "MEMBEREX", "EXPRESSION", "ID", "INIT", "OPERATOR", 
		"LEFT", "RIGHT", "VALUE", "NAME", "RAW", "KIND", "EACH", "ELEMENTS", "VAR", 
		"UPDATE", "ARGUMENT", "ARGUMENTS", "DECLARATIONS", "PARAMS", "DEFAULTS", 
		"PREFIX", "GENERATOR", "CALLEE", "TEST", "CONSEQUENT", "ALTERNATE", "COMPUTED", 
		"OBJECT", "PROPERTY", "SOURCETYPE", "BODY", "PROGRAM", "SCRIPT", "ADD", 
		"SUB", "MUL", "DIV", "REM", "EQUAL", "NEQUAL", "SMALLER", "SMALLEREQ", 
		"BIGGER", "BIGGEREQ", "INC", "DEC", "NOT", "ASSIGN", "ADDASSIGN", "SUBASSIGN", 
		"MULASSIGN", "DIVASSIGN", "REMASSIGN", "AND", "OR", "STRING", "NUMBER", 
		"WS"
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
			setState(60);
			match(OPENBRACES);
			setState(61);
			match(TYPE);
			setState(62);
			match(TWOPOINTS);
			setState(63);
			match(PROGRAM);
			setState(64);
			match(COMMA);
			setState(65);
			match(BODY);
			setState(66);
			match(TWOPOINTS);
			setState(67);
			match(OPENBRACKETS);
			setState(76);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(68);
				obj();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(69);
					match(COMMA);
					setState(70);
					obj();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78);
			match(CLOSEBRACKETS);
			setState(79);
			match(COMMA);
			setState(80);
			match(SOURCETYPE);
			setState(81);
			match(TWOPOINTS);
			setState(82);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				vardecobj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				funcdecobj();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				forstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				forinstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				whilestmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				dowhilestmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				blockstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				ifstmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				returnstmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
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
			setState(96);
			match(OPENBRACES);
			setState(97);
			match(TYPE);
			setState(98);
			match(TWOPOINTS);
			setState(99);
			match(VARDEC);
			setState(100);
			match(COMMA);
			setState(101);
			declarations();
			setState(102);
			match(COMMA);
			setState(103);
			match(KIND);
			setState(104);
			match(TWOPOINTS);
			setState(105);
			match(VAR);
			setState(106);
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
			setState(108);
			match(OPENBRACES);
			setState(109);
			match(TYPE);
			setState(110);
			match(TWOPOINTS);
			setState(111);
			match(FUNCDEC);
			setState(112);
			match(COMMA);
			setState(113);
			id();
			setState(114);
			match(COMMA);
			setState(115);
			params();
			setState(116);
			match(COMMA);
			setState(117);
			defaults();
			setState(118);
			match(COMMA);
			setState(119);
			match(BODY);
			setState(120);
			match(TWOPOINTS);
			setState(121);
			blockstmt();
			setState(122);
			match(COMMA);
			setState(123);
			match(GENERATOR);
			setState(124);
			match(TWOPOINTS);
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(126);
			match(COMMA);
			setState(127);
			match(EXPRESSION);
			setState(128);
			match(TWOPOINTS);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(130);
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
			setState(132);
			match(DECLARATIONS);
			setState(133);
			match(TWOPOINTS);
			setState(134);
			match(OPENBRACKETS);
			setState(135);
			match(OPENBRACES);
			setState(136);
			variableDeclarator();
			setState(137);
			match(CLOSEBRACES);
			setState(138);
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
			setState(140);
			match(TYPE);
			setState(141);
			match(TWOPOINTS);
			setState(142);
			match(VARDECTOR);
			setState(143);
			match(COMMA);
			setState(144);
			id();
			setState(145);
			match(COMMA);
			setState(146);
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
			setState(148);
			match(PARAMS);
			setState(149);
			match(TWOPOINTS);
			setState(150);
			match(OPENBRACKETS);
			setState(159);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(151);
				id2();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					id2();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
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
			setState(163);
			match(DEFAULTS);
			setState(164);
			match(TWOPOINTS);
			setState(165);
			match(OPENBRACKETS);
			setState(174);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(166);
				expression();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(167);
					match(COMMA);
					setState(168);
					expression();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(176);
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
			setState(180);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NULL);
				}
				break;
			case OPENBRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			setState(182);
			match(OPENBRACES);
			setState(183);
			match(TYPE);
			setState(184);
			match(TWOPOINTS);
			setState(185);
			match(FORSTMT);
			setState(186);
			match(COMMA);
			setState(187);
			match(INIT);
			setState(188);
			match(TWOPOINTS);
			setState(189);
			init_for();
			setState(190);
			match(COMMA);
			setState(191);
			match(TEST);
			setState(192);
			match(TWOPOINTS);
			setState(193);
			expression();
			setState(194);
			match(COMMA);
			setState(195);
			match(UPDATE);
			setState(196);
			match(TWOPOINTS);
			setState(197);
			expression();
			setState(198);
			match(COMMA);
			setState(199);
			match(BODY);
			setState(200);
			match(TWOPOINTS);
			setState(201);
			obj();
			setState(202);
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
			setState(204);
			match(OPENBRACES);
			setState(205);
			match(TYPE);
			setState(206);
			match(TWOPOINTS);
			setState(207);
			match(FORINSTMT);
			setState(208);
			match(COMMA);
			setState(209);
			match(LEFT);
			setState(210);
			match(TWOPOINTS);
			setState(211);
			vardecobj();
			setState(212);
			match(COMMA);
			setState(213);
			match(RIGHT);
			setState(214);
			match(TWOPOINTS);
			setState(215);
			id2();
			setState(216);
			match(COMMA);
			setState(217);
			match(BODY);
			setState(218);
			match(TWOPOINTS);
			setState(219);
			obj();
			setState(220);
			match(COMMA);
			setState(221);
			match(EACH);
			setState(222);
			match(TWOPOINTS);
			setState(223);
			match(FALSE);
			setState(224);
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
			setState(226);
			match(OPENBRACES);
			setState(227);
			match(TYPE);
			setState(228);
			match(TWOPOINTS);
			setState(229);
			match(WHILESTMT);
			setState(230);
			match(COMMA);
			setState(231);
			match(TEST);
			setState(232);
			match(TWOPOINTS);
			setState(233);
			expression();
			setState(234);
			match(COMMA);
			setState(235);
			match(BODY);
			setState(236);
			match(TWOPOINTS);
			setState(237);
			obj();
			setState(238);
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
			setState(240);
			match(OPENBRACES);
			setState(241);
			match(TYPE);
			setState(242);
			match(TWOPOINTS);
			setState(243);
			match(DOWHILESTMT);
			setState(244);
			match(COMMA);
			setState(245);
			match(BODY);
			setState(246);
			match(TWOPOINTS);
			setState(247);
			obj();
			setState(248);
			match(COMMA);
			setState(249);
			match(TEST);
			setState(250);
			match(TWOPOINTS);
			setState(251);
			expression();
			setState(252);
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
			setState(254);
			match(OPENBRACES);
			setState(255);
			match(TYPE);
			setState(256);
			match(TWOPOINTS);
			setState(257);
			match(BLOCKSTMT);
			setState(258);
			match(COMMA);
			setState(259);
			match(BODY);
			setState(260);
			match(TWOPOINTS);
			setState(261);
			match(OPENBRACKETS);
			setState(270);
			_la = _input.LA(1);
			if (_la==OPENBRACES) {
				{
				setState(262);
				obj();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					obj();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(272);
			match(CLOSEBRACKETS);
			setState(273);
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
			setState(275);
			match(OPENBRACES);
			setState(276);
			match(TYPE);
			setState(277);
			match(TWOPOINTS);
			setState(278);
			match(IFSTMT);
			setState(279);
			match(COMMA);
			setState(280);
			match(TEST);
			setState(281);
			match(TWOPOINTS);
			setState(282);
			expression();
			setState(283);
			match(COMMA);
			setState(284);
			match(CONSEQUENT);
			setState(285);
			match(TWOPOINTS);
			setState(286);
			obj();
			setState(287);
			match(COMMA);
			setState(288);
			match(ALTERNATE);
			setState(289);
			match(TWOPOINTS);
			setState(290);
			obj();
			setState(291);
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
			setState(293);
			match(OPENBRACES);
			setState(294);
			match(TYPE);
			setState(295);
			match(TWOPOINTS);
			setState(296);
			match(RETURNSTMT);
			setState(297);
			match(COMMA);
			setState(298);
			match(ARGUMENT);
			setState(299);
			match(TWOPOINTS);
			setState(300);
			expression();
			setState(301);
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
			setState(303);
			match(OPENBRACES);
			setState(304);
			match(TYPE);
			setState(305);
			match(TWOPOINTS);
			setState(306);
			match(EXPSTMT);
			setState(307);
			match(COMMA);
			setState(308);
			match(EXPRESSION);
			setState(309);
			match(TWOPOINTS);
			setState(310);
			expression();
			setState(311);
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
			setState(313);
			match(INIT);
			setState(314);
			match(TWOPOINTS);
			setState(315);
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
			setState(317);
			match(OPENBRACES);
			setState(318);
			match(TYPE);
			setState(319);
			match(TWOPOINTS);
			setState(320);
			match(LITERAL);
			setState(321);
			match(COMMA);
			setState(322);
			match(VALUE);
			setState(323);
			match(TWOPOINTS);
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0) || _la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(325);
			match(COMMA);
			setState(326);
			match(RAW);
			setState(327);
			match(TWOPOINTS);
			setState(328);
			match(STRING);
			setState(329);
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
			setState(331);
			match(OPENBRACES);
			setState(332);
			match(TYPE);
			setState(333);
			match(TWOPOINTS);
			setState(334);
			match(BINARYEX);
			setState(335);
			match(COMMA);
			setState(336);
			match(OPERATOR);
			setState(337);
			match(TWOPOINTS);
			setState(338);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (DIV - 66)) | (1L << (REM - 66)) | (1L << (EQUAL - 66)) | (1L << (NEQUAL - 66)) | (1L << (SMALLER - 66)) | (1L << (SMALLEREQ - 66)) | (1L << (BIGGER - 66)) | (1L << (BIGGEREQ - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(339);
			match(COMMA);
			setState(340);
			match(LEFT);
			setState(341);
			match(TWOPOINTS);
			setState(342);
			expression();
			setState(343);
			match(COMMA);
			setState(344);
			match(RIGHT);
			setState(345);
			match(TWOPOINTS);
			setState(346);
			expression();
			setState(347);
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

	public static class LogicalexContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public List<TerminalNode> TWOPOINTS() { return getTokens(JS2JAVAParser.TWOPOINTS); }
		public TerminalNode TWOPOINTS(int i) {
			return getToken(JS2JAVAParser.TWOPOINTS, i);
		}
		public TerminalNode LOGICALEX() { return getToken(JS2JAVAParser.LOGICALEX, 0); }
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
		public TerminalNode AND() { return getToken(JS2JAVAParser.AND, 0); }
		public TerminalNode OR() { return getToken(JS2JAVAParser.OR, 0); }
		public LogicalexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterLogicalex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitLogicalex(this);
		}
	}

	public final LogicalexContext logicalex() throws RecognitionException {
		LogicalexContext _localctx = new LogicalexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPENBRACES);
			setState(350);
			match(TYPE);
			setState(351);
			match(TWOPOINTS);
			setState(352);
			match(LOGICALEX);
			setState(353);
			match(COMMA);
			setState(354);
			match(OPERATOR);
			setState(355);
			match(TWOPOINTS);
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(357);
			match(COMMA);
			setState(358);
			match(LEFT);
			setState(359);
			match(TWOPOINTS);
			setState(360);
			expression();
			setState(361);
			match(COMMA);
			setState(362);
			match(RIGHT);
			setState(363);
			match(TWOPOINTS);
			setState(364);
			expression();
			setState(365);
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
		enterRule(_localctx, 42, RULE_updateex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(OPENBRACES);
			setState(368);
			match(TYPE);
			setState(369);
			match(TWOPOINTS);
			setState(370);
			match(UPDATEEX);
			setState(371);
			match(COMMA);
			setState(372);
			match(OPERATOR);
			setState(373);
			match(TWOPOINTS);
			setState(374);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(375);
			match(COMMA);
			setState(376);
			match(ARGUMENT);
			setState(377);
			match(TWOPOINTS);
			setState(378);
			id2();
			setState(379);
			match(COMMA);
			setState(380);
			match(PREFIX);
			setState(381);
			match(TWOPOINTS);
			setState(382);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(383);
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
		public TerminalNode RIGHT() { return getToken(JS2JAVAParser.RIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode ASSIGN() { return getToken(JS2JAVAParser.ASSIGN, 0); }
		public TerminalNode ADDASSIGN() { return getToken(JS2JAVAParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(JS2JAVAParser.SUBASSIGN, 0); }
		public TerminalNode MULASSIGN() { return getToken(JS2JAVAParser.MULASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(JS2JAVAParser.DIVASSIGN, 0); }
		public TerminalNode REMASSIGN() { return getToken(JS2JAVAParser.REMASSIGN, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public MemberexContext memberex() {
			return getRuleContext(MemberexContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_assignex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(OPENBRACES);
			setState(386);
			match(TYPE);
			setState(387);
			match(TWOPOINTS);
			setState(388);
			match(ASSIGNEX);
			setState(389);
			match(COMMA);
			setState(390);
			match(OPERATOR);
			setState(391);
			match(TWOPOINTS);
			setState(392);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ASSIGN - 80)) | (1L << (ADDASSIGN - 80)) | (1L << (SUBASSIGN - 80)) | (1L << (MULASSIGN - 80)) | (1L << (DIVASSIGN - 80)) | (1L << (REMASSIGN - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(393);
			match(COMMA);
			setState(394);
			match(LEFT);
			setState(395);
			match(TWOPOINTS);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(396);
				id2();
				}
				break;
			case 2:
				{
				setState(397);
				memberex();
				}
				break;
			}
			setState(400);
			match(COMMA);
			setState(401);
			match(RIGHT);
			setState(402);
			match(TWOPOINTS);
			setState(403);
			expression();
			setState(404);
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
		enterRule(_localctx, 46, RULE_unaryex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(OPENBRACES);
			setState(407);
			match(TYPE);
			setState(408);
			match(TWOPOINTS);
			setState(409);
			match(UNARYEX);
			setState(410);
			match(COMMA);
			setState(411);
			match(OPERATOR);
			setState(412);
			match(TWOPOINTS);
			setState(413);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (NOT - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(414);
			match(COMMA);
			setState(415);
			match(ARGUMENT);
			setState(416);
			match(TWOPOINTS);
			setState(417);
			expression();
			setState(418);
			match(COMMA);
			setState(419);
			match(PREFIX);
			setState(420);
			match(TWOPOINTS);
			setState(421);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(422);
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
		enterRule(_localctx, 48, RULE_arrayex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(OPENBRACES);
			setState(425);
			match(TYPE);
			setState(426);
			match(TWOPOINTS);
			setState(427);
			match(ARRAYEX);
			setState(428);
			match(COMMA);
			setState(429);
			match(ELEMENTS);
			setState(430);
			match(TWOPOINTS);
			setState(431);
			match(OPENBRACKETS);
			setState(440);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(432);
				expression();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					expression();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(442);
			match(CLOSEBRACKETS);
			setState(443);
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
		enterRule(_localctx, 50, RULE_callex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(OPENBRACES);
			setState(446);
			match(TYPE);
			setState(447);
			match(TWOPOINTS);
			setState(448);
			match(CALLEX);
			setState(449);
			match(COMMA);
			setState(450);
			match(CALLEE);
			setState(451);
			match(TWOPOINTS);
			setState(452);
			id2();
			setState(453);
			match(COMMA);
			setState(454);
			match(ARGUMENTS);
			setState(455);
			match(TWOPOINTS);
			setState(456);
			match(OPENBRACKETS);
			setState(465);
			_la = _input.LA(1);
			if (_la==OPENBRACES || _la==NULL) {
				{
				setState(457);
				expression();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(458);
					match(COMMA);
					setState(459);
					expression();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(467);
			match(CLOSEBRACKETS);
			setState(468);
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
		enterRule(_localctx, 52, RULE_memberex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(OPENBRACES);
			setState(471);
			match(TYPE);
			setState(472);
			match(TWOPOINTS);
			setState(473);
			match(MEMBEREX);
			setState(474);
			match(COMMA);
			setState(475);
			match(COMPUTED);
			setState(476);
			match(TWOPOINTS);
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(478);
			match(COMMA);
			setState(479);
			match(OBJECT);
			setState(480);
			match(TWOPOINTS);
			setState(481);
			id2();
			setState(482);
			match(COMMA);
			setState(483);
			match(PROPERTY);
			setState(484);
			match(TWOPOINTS);
			setState(485);
			expression();
			setState(486);
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
		public LogicalexContext logicalex() {
			return getRuleContext(LogicalexContext.class,0);
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
		enterRule(_localctx, 54, RULE_expression);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				binaryex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				logicalex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				updateex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				assignex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(493);
				unaryex();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(494);
				arrayex();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(495);
				callex();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(496);
				memberex();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(497);
				id2();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(498);
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
		enterRule(_localctx, 56, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(ID);
			setState(502);
			match(TWOPOINTS);
			setState(503);
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
		enterRule(_localctx, 58, RULE_id2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(OPENBRACES);
			setState(506);
			match(TYPE);
			setState(507);
			match(TWOPOINTS);
			setState(508);
			match(IDENTIFIER);
			setState(509);
			match(COMMA);
			setState(510);
			match(NAME);
			setState(511);
			match(TWOPOINTS);
			setState(512);
			match(STRING);
			setState(513);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\\\u0206\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\5\2O\n\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\5\b\u00a2\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\5"+
		"\t\u00b1\n\t\3\t\3\t\3\n\3\n\5\n\u00b7\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u010c\n\17\f\17\16\17\u010f\13\17\5\17\u0111\n\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0191"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01b6\n\32\f\32\16\32\u01b9"+
		"\13\32\5\32\u01bb\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01cf\n\33\f\33\16\33"+
		"\u01d2\13\33\5\33\u01d4\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01f6\n\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2"+
		"\t\3\2\13\f\4\2\13\rZ[\3\2DN\3\2XY\3\2OP\3\2RW\4\2DEQQ\u0208\2>\3\2\2"+
		"\2\4`\3\2\2\2\6b\3\2\2\2\bn\3\2\2\2\n\u0086\3\2\2\2\f\u008e\3\2\2\2\16"+
		"\u0096\3\2\2\2\20\u00a5\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26\u00ce"+
		"\3\2\2\2\30\u00e4\3\2\2\2\32\u00f2\3\2\2\2\34\u0100\3\2\2\2\36\u0115\3"+
		"\2\2\2 \u0127\3\2\2\2\"\u0131\3\2\2\2$\u013b\3\2\2\2&\u013f\3\2\2\2(\u014d"+
		"\3\2\2\2*\u015f\3\2\2\2,\u0171\3\2\2\2.\u0183\3\2\2\2\60\u0198\3\2\2\2"+
		"\62\u01aa\3\2\2\2\64\u01bf\3\2\2\2\66\u01d8\3\2\2\28\u01f5\3\2\2\2:\u01f7"+
		"\3\2\2\2<\u01fb\3\2\2\2>?\7\5\2\2?@\7\16\2\2@A\7\t\2\2AB\7B\2\2BC\7\n"+
		"\2\2CD\7A\2\2DE\7\t\2\2EN\7\7\2\2FK\5\4\3\2GH\7\n\2\2HJ\5\4\3\2IG\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2NO\3\2"+
		"\2\2OP\3\2\2\2PQ\7\b\2\2QR\7\n\2\2RS\7@\2\2ST\7\t\2\2TU\7C\2\2U\3\3\2"+
		"\2\2Va\5\6\4\2Wa\5\b\5\2Xa\5\24\13\2Ya\5\26\f\2Za\5\30\r\2[a\5\32\16\2"+
		"\\a\5\34\17\2]a\5\36\20\2^a\5 \21\2_a\5\"\22\2`V\3\2\2\2`W\3\2\2\2`X\3"+
		"\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_"+
		"\3\2\2\2a\5\3\2\2\2bc\7\5\2\2cd\7\16\2\2de\7\t\2\2ef\7\17\2\2fg\7\n\2"+
		"\2gh\5\n\6\2hi\7\n\2\2ij\7-\2\2jk\7\t\2\2kl\7\60\2\2lm\7\6\2\2m\7\3\2"+
		"\2\2no\7\5\2\2op\7\16\2\2pq\7\t\2\2qr\7\20\2\2rs\7\n\2\2st\5:\36\2tu\7"+
		"\n\2\2uv\5\16\b\2vw\7\n\2\2wx\5\20\t\2xy\7\n\2\2yz\7A\2\2z{\7\t\2\2{|"+
		"\5\34\17\2|}\7\n\2\2}~\78\2\2~\177\7\t\2\2\177\u0080\t\2\2\2\u0080\u0081"+
		"\7\n\2\2\u0081\u0082\7$\2\2\u0082\u0083\7\t\2\2\u0083\u0084\t\2\2\2\u0084"+
		"\u0085\7\6\2\2\u0085\t\3\2\2\2\u0086\u0087\7\64\2\2\u0087\u0088\7\t\2"+
		"\2\u0088\u0089\7\7\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5\f\7\2\u008b\u008c"+
		"\7\6\2\2\u008c\u008d\7\b\2\2\u008d\13\3\2\2\2\u008e\u008f\7\16\2\2\u008f"+
		"\u0090\7\t\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7\n\2\2\u0092\u0093\5"+
		":\36\2\u0093\u0094\7\n\2\2\u0094\u0095\5$\23\2\u0095\r\3\2\2\2\u0096\u0097"+
		"\7\65\2\2\u0097\u0098\7\t\2\2\u0098\u00a1\7\7\2\2\u0099\u009e\5<\37\2"+
		"\u009a\u009b\7\n\2\2\u009b\u009d\5<\37\2\u009c\u009a\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\7\b\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\7\66\2\2\u00a6\u00a7"+
		"\7\t\2\2\u00a7\u00b0\7\7\2\2\u00a8\u00ad\58\35\2\u00a9\u00aa\7\n\2\2\u00aa"+
		"\u00ac\58\35\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00a8\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\b"+
		"\2\2\u00b3\21\3\2\2\2\u00b4\u00b7\7\r\2\2\u00b5\u00b7\5\6\4\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\u00ba\7\16\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\7"+
		"\n\2\2\u00bd\u00be\7&\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\5\22\n\2\u00c0"+
		"\u00c1\7\n\2\2\u00c1\u00c2\7:\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\58\35"+
		"\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7\t\2\2\u00c7"+
		"\u00c8\58\35\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7A\2\2\u00ca\u00cb\7\t"+
		"\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\7\6\2\2\u00cd\25\3\2\2\2\u00ce\u00cf"+
		"\7\5\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\7\24\2\2"+
		"\u00d2\u00d3\7\n\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6"+
		"\5\6\4\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\7)\2\2\u00d8\u00d9\7\t\2\2\u00d9"+
		"\u00da\5<\37\2\u00da\u00db\7\n\2\2\u00db\u00dc\7A\2\2\u00dc\u00dd\7\t"+
		"\2\2\u00dd\u00de\5\4\3\2\u00de\u00df\7\n\2\2\u00df\u00e0\7.\2\2\u00e0"+
		"\u00e1\7\t\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e3\7\6\2\2\u00e3\27\3\2\2"+
		"\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\7\t\2\2\u00e7"+
		"\u00e8\7\27\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00ea\7:\2\2\u00ea\u00eb\7\t"+
		"\2\2\u00eb\u00ec\58\35\2\u00ec\u00ed\7\n\2\2\u00ed\u00ee\7A\2\2\u00ee"+
		"\u00ef\7\t\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7\6\2\2\u00f1\31\3\2\2"+
		"\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\7\t\2\2\u00f5"+
		"\u00f6\7\30\2\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\7A\2\2\u00f8\u00f9\7\t"+
		"\2\2\u00f9\u00fa\5\4\3\2\u00fa\u00fb\7\n\2\2\u00fb\u00fc\7:\2\2\u00fc"+
		"\u00fd\7\t\2\2\u00fd\u00fe\58\35\2\u00fe\u00ff\7\6\2\2\u00ff\33\3\2\2"+
		"\2\u0100\u0101\7\5\2\2\u0101\u0102\7\16\2\2\u0102\u0103\7\t\2\2\u0103"+
		"\u0104\7\22\2\2\u0104\u0105\7\n\2\2\u0105\u0106\7A\2\2\u0106\u0107\7\t"+
		"\2\2\u0107\u0110\7\7\2\2\u0108\u010d\5\4\3\2\u0109\u010a\7\n\2\2\u010a"+
		"\u010c\5\4\3\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0108\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\b"+
		"\2\2\u0113\u0114\7\6\2\2\u0114\35\3\2\2\2\u0115\u0116\7\5\2\2\u0116\u0117"+
		"\7\16\2\2\u0117\u0118\7\t\2\2\u0118\u0119\7\25\2\2\u0119\u011a\7\n\2\2"+
		"\u011a\u011b\7:\2\2\u011b\u011c\7\t\2\2\u011c\u011d\58\35\2\u011d\u011e"+
		"\7\n\2\2\u011e\u011f\7;\2\2\u011f\u0120\7\t\2\2\u0120\u0121\5\4\3\2\u0121"+
		"\u0122\7\n\2\2\u0122\u0123\7<\2\2\u0123\u0124\7\t\2\2\u0124\u0125\5\4"+
		"\3\2\u0125\u0126\7\6\2\2\u0126\37\3\2\2\2\u0127\u0128\7\5\2\2\u0128\u0129"+
		"\7\16\2\2\u0129\u012a\7\t\2\2\u012a\u012b\7\31\2\2\u012b\u012c\7\n\2\2"+
		"\u012c\u012d\7\62\2\2\u012d\u012e\7\t\2\2\u012e\u012f\58\35\2\u012f\u0130"+
		"\7\6\2\2\u0130!\3\2\2\2\u0131\u0132\7\5\2\2\u0132\u0133\7\16\2\2\u0133"+
		"\u0134\7\t\2\2\u0134\u0135\7\26\2\2\u0135\u0136\7\n\2\2\u0136\u0137\7"+
		"$\2\2\u0137\u0138\7\t\2\2\u0138\u0139\58\35\2\u0139\u013a\7\6\2\2\u013a"+
		"#\3\2\2\2\u013b\u013c\7&\2\2\u013c\u013d\7\t\2\2\u013d\u013e\58\35\2\u013e"+
		"%\3\2\2\2\u013f\u0140\7\5\2\2\u0140\u0141\7\16\2\2\u0141\u0142\7\t\2\2"+
		"\u0142\u0143\7\33\2\2\u0143\u0144\7\n\2\2\u0144\u0145\7*\2\2\u0145\u0146"+
		"\7\t\2\2\u0146\u0147\t\3\2\2\u0147\u0148\7\n\2\2\u0148\u0149\7,\2\2\u0149"+
		"\u014a\7\t\2\2\u014a\u014b\7Z\2\2\u014b\u014c\7\6\2\2\u014c\'\3\2\2\2"+
		"\u014d\u014e\7\5\2\2\u014e\u014f\7\16\2\2\u014f\u0150\7\t\2\2\u0150\u0151"+
		"\7\34\2\2\u0151\u0152\7\n\2\2\u0152\u0153\7\'\2\2\u0153\u0154\7\t\2\2"+
		"\u0154\u0155\t\4\2\2\u0155\u0156\7\n\2\2\u0156\u0157\7(\2\2\u0157\u0158"+
		"\7\t\2\2\u0158\u0159\58\35\2\u0159\u015a\7\n\2\2\u015a\u015b\7)\2\2\u015b"+
		"\u015c\7\t\2\2\u015c\u015d\58\35\2\u015d\u015e\7\6\2\2\u015e)\3\2\2\2"+
		"\u015f\u0160\7\5\2\2\u0160\u0161\7\16\2\2\u0161\u0162\7\t\2\2\u0162\u0163"+
		"\7\35\2\2\u0163\u0164\7\n\2\2\u0164\u0165\7\'\2\2\u0165\u0166\7\t\2\2"+
		"\u0166\u0167\t\5\2\2\u0167\u0168\7\n\2\2\u0168\u0169\7(\2\2\u0169\u016a"+
		"\7\t\2\2\u016a\u016b\58\35\2\u016b\u016c\7\n\2\2\u016c\u016d\7)\2\2\u016d"+
		"\u016e\7\t\2\2\u016e\u016f\58\35\2\u016f\u0170\7\6\2\2\u0170+\3\2\2\2"+
		"\u0171\u0172\7\5\2\2\u0172\u0173\7\16\2\2\u0173\u0174\7\t\2\2\u0174\u0175"+
		"\7\36\2\2\u0175\u0176\7\n\2\2\u0176\u0177\7\'\2\2\u0177\u0178\7\t\2\2"+
		"\u0178\u0179\t\6\2\2\u0179\u017a\7\n\2\2\u017a\u017b\7\62\2\2\u017b\u017c"+
		"\7\t\2\2\u017c\u017d\5<\37\2\u017d\u017e\7\n\2\2\u017e\u017f\7\67\2\2"+
		"\u017f\u0180\7\t\2\2\u0180\u0181\t\2\2\2\u0181\u0182\7\6\2\2\u0182-\3"+
		"\2\2\2\u0183\u0184\7\5\2\2\u0184\u0185\7\16\2\2\u0185\u0186\7\t\2\2\u0186"+
		"\u0187\7\37\2\2\u0187\u0188\7\n\2\2\u0188\u0189\7\'\2\2\u0189\u018a\7"+
		"\t\2\2\u018a\u018b\t\7\2\2\u018b\u018c\7\n\2\2\u018c\u018d\7(\2\2\u018d"+
		"\u0190\7\t\2\2\u018e\u0191\5<\37\2\u018f\u0191\5\66\34\2\u0190\u018e\3"+
		"\2\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\n\2\2\u0193"+
		"\u0194\7)\2\2\u0194\u0195\7\t\2\2\u0195\u0196\58\35\2\u0196\u0197\7\6"+
		"\2\2\u0197/\3\2\2\2\u0198\u0199\7\5\2\2\u0199\u019a\7\16\2\2\u019a\u019b"+
		"\7\t\2\2\u019b\u019c\7 \2\2\u019c\u019d\7\n\2\2\u019d\u019e\7\'\2\2\u019e"+
		"\u019f\7\t\2\2\u019f\u01a0\t\b\2\2\u01a0\u01a1\7\n\2\2\u01a1\u01a2\7\62"+
		"\2\2\u01a2\u01a3\7\t\2\2\u01a3\u01a4\58\35\2\u01a4\u01a5\7\n\2\2\u01a5"+
		"\u01a6\7\67\2\2\u01a6\u01a7\7\t\2\2\u01a7\u01a8\t\2\2\2\u01a8\u01a9\7"+
		"\6\2\2\u01a9\61\3\2\2\2\u01aa\u01ab\7\5\2\2\u01ab\u01ac\7\16\2\2\u01ac"+
		"\u01ad\7\t\2\2\u01ad\u01ae\7!\2\2\u01ae\u01af\7\n\2\2\u01af\u01b0\7/\2"+
		"\2\u01b0\u01b1\7\t\2\2\u01b1\u01ba\7\7\2\2\u01b2\u01b7\58\35\2\u01b3\u01b4"+
		"\7\n\2\2\u01b4\u01b6\58\35\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\7\b\2\2\u01bd\u01be\7\6\2\2\u01be\63\3\2\2\2\u01bf\u01c0\7\5\2"+
		"\2\u01c0\u01c1\7\16\2\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\7\"\2\2\u01c3"+
		"\u01c4\7\n\2\2\u01c4\u01c5\79\2\2\u01c5\u01c6\7\t\2\2\u01c6\u01c7\5<\37"+
		"\2\u01c7\u01c8\7\n\2\2\u01c8\u01c9\7\63\2\2\u01c9\u01ca\7\t\2\2\u01ca"+
		"\u01d3\7\7\2\2\u01cb\u01d0\58\35\2\u01cc\u01cd\7\n\2\2\u01cd\u01cf\58"+
		"\35\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01cb\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7\b\2\2\u01d6"+
		"\u01d7\7\6\2\2\u01d7\65\3\2\2\2\u01d8\u01d9\7\5\2\2\u01d9\u01da\7\16\2"+
		"\2\u01da\u01db\7\t\2\2\u01db\u01dc\7#\2\2\u01dc\u01dd\7\n\2\2\u01dd\u01de"+
		"\7=\2\2\u01de\u01df\7\t\2\2\u01df\u01e0\t\2\2\2\u01e0\u01e1\7\n\2\2\u01e1"+
		"\u01e2\7>\2\2\u01e2\u01e3\7\t\2\2\u01e3\u01e4\5<\37\2\u01e4\u01e5\7\n"+
		"\2\2\u01e5\u01e6\7?\2\2\u01e6\u01e7\7\t\2\2\u01e7\u01e8\58\35\2\u01e8"+
		"\u01e9\7\6\2\2\u01e9\67\3\2\2\2\u01ea\u01f6\5&\24\2\u01eb\u01f6\5(\25"+
		"\2\u01ec\u01f6\5*\26\2\u01ed\u01f6\5,\27\2\u01ee\u01f6\5.\30\2\u01ef\u01f6"+
		"\5\60\31\2\u01f0\u01f6\5\62\32\2\u01f1\u01f6\5\64\33\2\u01f2\u01f6\5\66"+
		"\34\2\u01f3\u01f6\5<\37\2\u01f4\u01f6\7\r\2\2\u01f5\u01ea\3\2\2\2\u01f5"+
		"\u01eb\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01ee\3\2"+
		"\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f5"+
		"\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f69\3\2\2\2"+
		"\u01f7\u01f8\7%\2\2\u01f8\u01f9\7\t\2\2\u01f9\u01fa\5<\37\2\u01fa;\3\2"+
		"\2\2\u01fb\u01fc\7\5\2\2\u01fc\u01fd\7\16\2\2\u01fd\u01fe\7\t\2\2\u01fe"+
		"\u01ff\7\32\2\2\u01ff\u0200\7\n\2\2\u0200\u0201\7+\2\2\u0201\u0202\7\t"+
		"\2\2\u0202\u0203\7Z\2\2\u0203\u0204\7\6\2\2\u0204=\3\2\2\2\22KN`\u009e"+
		"\u00a1\u00ad\u00b0\u00b6\u010d\u0110\u0190\u01b7\u01ba\u01d0\u01d3\u01f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}