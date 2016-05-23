// Generated from JS2JAVAParser.g4 by ANTLR 4.5.3
package grammar;
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
		STRING=1, NUMBER=2, WS=3, OPENPAR=4, CLOSEPAR=5, OPENBRACES=6, CLOSEBRACES=7, 
		OPENBRACKETS=8, CLOSEBRACKETS=9, TWOPOINTS=10, QUOTATION_MARK=11, COMMA=12, 
		TRUE=13, FALSE=14, NULL=15, TYPE=16, SOURCETYPE=17, BODY=18;
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_pair = 2, RULE_left_operand = 3, 
		RULE_array = 4, RULE_value = 5;
	public static final String[] ruleNames = {
		"json", "object", "pair", "left_operand", "array", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", 
		"'\"'", "','", "'true'", "'false'", "'null'", "'type'", "'\"sourceType\"'", 
		"'\"body\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "WS", "OPENPAR", "CLOSEPAR", "OPENBRACES", "CLOSEBRACES", 
		"OPENBRACKETS", "CLOSEBRACKETS", "TWOPOINTS", "QUOTATION_MARK", "COMMA", 
		"TRUE", "FALSE", "NULL", "TYPE", "SOURCETYPE", "BODY"
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
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
		try {
			setState(14);
			switch (_input.LA(1)) {
			case OPENBRACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				object();
				}
				break;
			case OPENBRACKETS:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				array();
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OPENBRACES() { return getToken(JS2JAVAParser.OPENBRACES, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode CLOSEBRACES() { return getToken(JS2JAVAParser.CLOSEBRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(OPENBRACES);
				setState(17);
				pair();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(18);
					match(COMMA);
					setState(19);
					pair();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(25);
				match(CLOSEBRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(OPENBRACES);
				setState(28);
				match(CLOSEBRACES);
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

	public static class PairContext extends ParserRuleContext {
		public Left_operandContext left_operand() {
			return getRuleContext(Left_operandContext.class,0);
		}
		public TerminalNode TWOPOINTS() { return getToken(JS2JAVAParser.TWOPOINTS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			left_operand();
			setState(32);
			match(TWOPOINTS);
			setState(33);
			value();
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

	public static class Left_operandContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARK() { return getTokens(JS2JAVAParser.QUOTATION_MARK); }
		public TerminalNode QUOTATION_MARK(int i) {
			return getToken(JS2JAVAParser.QUOTATION_MARK, i);
		}
		public TerminalNode TYPE() { return getToken(JS2JAVAParser.TYPE, 0); }
		public Left_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterLeft_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitLeft_operand(this);
		}
	}

	public final Left_operandContext left_operand() throws RecognitionException {
		Left_operandContext _localctx = new Left_operandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_left_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(QUOTATION_MARK);
			setState(36);
			match(TYPE);
			setState(37);
			match(QUOTATION_MARK);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPENBRACKETS() { return getToken(JS2JAVAParser.OPENBRACKETS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CLOSEBRACKETS() { return getToken(JS2JAVAParser.CLOSEBRACKETS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JS2JAVAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JS2JAVAParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(OPENBRACKETS);
				setState(40);
				value();
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(41);
					match(COMMA);
					setState(42);
					value();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				match(CLOSEBRACKETS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(OPENBRACKETS);
				setState(51);
				match(CLOSEBRACKETS);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JS2JAVAParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JS2JAVAParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(JS2JAVAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JS2JAVAParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JS2JAVAParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JS2JAVAParserListener ) ((JS2JAVAParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(NUMBER);
				}
				break;
			case OPENBRACES:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				object();
				}
				break;
			case OPENBRACKETS:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(NULL);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\6\3\6\3\6"+
		"\3\6\5\6\67\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\2\2\b\2\4\6\b"+
		"\n\f\2\2F\2\20\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n\66\3\2\2\2"+
		"\f?\3\2\2\2\16\21\5\4\3\2\17\21\5\n\6\2\20\16\3\2\2\2\20\17\3\2\2\2\21"+
		"\3\3\2\2\2\22\23\7\b\2\2\23\30\5\6\4\2\24\25\7\16\2\2\25\27\5\6\4\2\26"+
		"\24\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32"+
		"\30\3\2\2\2\33\34\7\t\2\2\34 \3\2\2\2\35\36\7\b\2\2\36 \7\t\2\2\37\22"+
		"\3\2\2\2\37\35\3\2\2\2 \5\3\2\2\2!\"\5\b\5\2\"#\7\f\2\2#$\5\f\7\2$\7\3"+
		"\2\2\2%&\7\r\2\2&\'\7\22\2\2\'(\7\r\2\2(\t\3\2\2\2)*\7\n\2\2*/\5\f\7\2"+
		"+,\7\16\2\2,.\5\f\7\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62"+
		"\3\2\2\2\61/\3\2\2\2\62\63\7\13\2\2\63\67\3\2\2\2\64\65\7\n\2\2\65\67"+
		"\7\13\2\2\66)\3\2\2\2\66\64\3\2\2\2\67\13\3\2\2\28@\7\3\2\29@\7\4\2\2"+
		":@\5\4\3\2;@\5\n\6\2<@\7\17\2\2=@\7\20\2\2>@\7\21\2\2?8\3\2\2\2?9\3\2"+
		"\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\r\3\2\2\2\b\20"+
		"\30\37/\66?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}