// Generated from JS2JAVA.g4 by ANTLR 4.5.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21, VARID=22, INT=23, REAL=24, OPENPAR=25, 
		CLOSEPAR=26, OPENBRACES=27, CLOSEBRACES=28, OPENBRACKETS=29, CLOSEBRACKETS=30, 
		COMMA=31, COLON=32, SEMICOLON=33, STRING=34, ASCIICHAR=35, UNICHAR=36;
	public static final int
		RULE_s = 0, RULE_header = 1, RULE_body = 2, RULE_functiondec = 3, RULE_vardec = 4, 
		RULE_id = 5, RULE_init = 6;
	public static final String[] ruleNames = {
		"s", "header", "body", "functiondec", "vardec", "id", "init"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"sourceType\"'", "'\"script\"'", "'\"type\"'", "'\"Program\"'", 
		"'\"body\"'", "'\"VariableDeclaration\"'", "'\"declarations\"'", "'\"VariableDeclarator\"'", 
		"'\"kind\"'", "'\"var\"'", "'\"id\"'", "'\"Identifier\"'", "'\"name\"'", 
		"'\"'", "'\"init\"'", "'\"Literal\"'", "'\"value\"'", "'\"raw\"'", "'\"\\\"'", 
		"'\\\"\"'", null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", "':'", "';'", "'lol'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WS", "VARID", "INT", 
		"REAL", "OPENPAR", "CLOSEPAR", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", 
		"CLOSEBRACKETS", "COMMA", "COLON", "SEMICOLON", "STRING", "ASCIICHAR", 
		"UNICHAR"
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
	public String getGrammarFileName() { return "JS2JAVA.g4"; }

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
	public static class SContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JS2JAVAParser.COLON, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(OPENBRACES);
			setState(15);
			header();
			setState(16);
			match(COMMA);
			setState(17);
			body();
			setState(18);
			match(COMMA);
			setState(19);
			match(T__0);
			setState(20);
			match(COLON);
			setState(21);
			match(T__1);
			setState(22);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JS2JAVAParser.COLON, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__2);
			setState(25);
			match(COLON);
			setState(26);
			match(T__3);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public FunctiondecContext functiondec() {
			return getRuleContext(FunctiondecContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__4);
			setState(29);
			match(COLON);
			setState(30);
			match(OPENBRACKETS);
			setState(31);
			match(OPENBRACES);
			setState(34);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(32);
				vardec();
				}
				break;
			case CLOSEBRACES:
				{
				setState(33);
				functiondec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(36);
			match(CLOSEBRACES);
			setState(37);
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

	public static class FunctiondecContext extends ParserRuleContext {
		public FunctiondecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterFunctiondec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitFunctiondec(this);
		}
	}

	public final FunctiondecContext functiondec() throws RecognitionException {
		FunctiondecContext _localctx = new FunctiondecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functiondec);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class VardecContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(JS2JAVAParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JS2JAVAParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitVardec(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			match(COLON);
			setState(43);
			match(T__5);
			setState(44);
			match(COMMA);
			setState(45);
			match(T__6);
			setState(46);
			match(COLON);
			setState(47);
			match(OPENBRACKETS);
			setState(48);
			match(OPENBRACES);
			setState(49);
			match(T__2);
			setState(50);
			match(COLON);
			setState(51);
			match(T__7);
			setState(52);
			match(COMMA);
			setState(53);
			id();
			setState(54);
			match(COMMA);
			setState(55);
			init();
			setState(56);
			match(CLOSEBRACES);
			setState(57);
			match(CLOSEBRACKETS);
			setState(58);
			match(COMMA);
			setState(59);
			match(T__8);
			setState(60);
			match(COLON);
			setState(61);
			match(T__9);
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
		public List<TerminalNode> COLON() { return getTokens(JS2JAVAParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JS2JAVAParser.COLON, i);
		}
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public TerminalNode COMMA() { return getToken(JS2JAVAParser.COMMA, 0); }
		public TerminalNode VARID() { return getToken(JS2JAVAParser.VARID, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__10);
			setState(64);
			match(COLON);
			setState(65);
			match(OPENBRACES);
			setState(66);
			match(T__2);
			setState(67);
			match(COLON);
			setState(68);
			match(T__11);
			setState(69);
			match(COMMA);
			setState(70);
			match(T__12);
			setState(71);
			match(COLON);
			setState(72);
			match(T__13);
			setState(73);
			match(VARID);
			setState(74);
			match(T__13);
			setState(75);
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
		public List<TerminalNode> COLON() { return getTokens(JS2JAVAParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JS2JAVAParser.COLON, i);
		}
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public List<TerminalNode> INT() { return getTokens(JS2JAVAParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JS2JAVAParser.INT, i);
		}
		public List<TerminalNode> REAL() { return getTokens(JS2JAVAParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(JS2JAVAParser.REAL, i);
		}
		public TerminalNode STRING() { return getToken(JS2JAVAParser.STRING, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAListener ) ((JS2JAVAListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__14);
			setState(78);
			match(COLON);
			setState(79);
			match(OPENBRACES);
			setState(80);
			match(T__2);
			setState(81);
			match(COLON);
			setState(82);
			match(T__15);
			setState(83);
			match(COMMA);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(84);
				match(T__16);
				setState(85);
				match(COLON);
				setState(86);
				match(INT);
				setState(87);
				match(COMMA);
				setState(88);
				match(T__17);
				setState(89);
				match(COLON);
				setState(90);
				match(T__13);
				setState(91);
				match(INT);
				setState(92);
				match(T__13);
				}
				break;
			case 2:
				{
				setState(93);
				match(T__16);
				setState(94);
				match(COLON);
				setState(95);
				match(REAL);
				setState(96);
				match(COMMA);
				setState(97);
				match(T__17);
				setState(98);
				match(COLON);
				setState(99);
				match(T__13);
				setState(100);
				match(REAL);
				setState(101);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(102);
				match(T__16);
				setState(103);
				match(COLON);
				setState(104);
				match(T__13);
				setState(105);
				match(STRING);
				setState(106);
				match(T__13);
				setState(107);
				match(COMMA);
				setState(108);
				match(T__17);
				setState(109);
				match(COLON);
				setState(110);
				match(T__18);
				setState(111);
				match(STRING);
				setState(112);
				match(T__19);
				}
				break;
			}
			setState(115);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2s\2\20"+
		"\3\2\2\2\4\32\3\2\2\2\6\36\3\2\2\2\b)\3\2\2\2\n+\3\2\2\2\fA\3\2\2\2\16"+
		"O\3\2\2\2\20\21\7\35\2\2\21\22\5\4\3\2\22\23\7!\2\2\23\24\5\6\4\2\24\25"+
		"\7!\2\2\25\26\7\3\2\2\26\27\7\"\2\2\27\30\7\4\2\2\30\31\7\36\2\2\31\3"+
		"\3\2\2\2\32\33\7\5\2\2\33\34\7\"\2\2\34\35\7\6\2\2\35\5\3\2\2\2\36\37"+
		"\7\7\2\2\37 \7\"\2\2 !\7\37\2\2!$\7\35\2\2\"%\5\n\6\2#%\5\b\5\2$\"\3\2"+
		"\2\2$#\3\2\2\2%&\3\2\2\2&\'\7\36\2\2\'(\7 \2\2(\7\3\2\2\2)*\3\2\2\2*\t"+
		"\3\2\2\2+,\7\5\2\2,-\7\"\2\2-.\7\b\2\2./\7!\2\2/\60\7\t\2\2\60\61\7\""+
		"\2\2\61\62\7\37\2\2\62\63\7\35\2\2\63\64\7\5\2\2\64\65\7\"\2\2\65\66\7"+
		"\n\2\2\66\67\7!\2\2\678\5\f\7\289\7!\2\29:\5\16\b\2:;\7\36\2\2;<\7 \2"+
		"\2<=\7!\2\2=>\7\13\2\2>?\7\"\2\2?@\7\f\2\2@\13\3\2\2\2AB\7\r\2\2BC\7\""+
		"\2\2CD\7\35\2\2DE\7\5\2\2EF\7\"\2\2FG\7\16\2\2GH\7!\2\2HI\7\17\2\2IJ\7"+
		"\"\2\2JK\7\20\2\2KL\7\30\2\2LM\7\20\2\2MN\7\36\2\2N\r\3\2\2\2OP\7\21\2"+
		"\2PQ\7\"\2\2QR\7\35\2\2RS\7\5\2\2ST\7\"\2\2TU\7\22\2\2Us\7!\2\2VW\7\23"+
		"\2\2WX\7\"\2\2XY\7\31\2\2YZ\7!\2\2Z[\7\24\2\2[\\\7\"\2\2\\]\7\20\2\2]"+
		"^\7\31\2\2^t\7\20\2\2_`\7\23\2\2`a\7\"\2\2ab\7\32\2\2bc\7!\2\2cd\7\24"+
		"\2\2de\7\"\2\2ef\7\20\2\2fg\7\32\2\2gt\7\20\2\2hi\7\23\2\2ij\7\"\2\2j"+
		"k\7\20\2\2kl\7$\2\2lm\7\20\2\2mn\7!\2\2no\7\24\2\2op\7\"\2\2pq\7\25\2"+
		"\2qr\7$\2\2rt\7\26\2\2sV\3\2\2\2s_\3\2\2\2sh\3\2\2\2tu\3\2\2\2uv\7\36"+
		"\2\2v\17\3\2\2\2\4$s";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}