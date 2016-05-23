// Generated from JS2JAVALexer.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JS2JAVALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, WS=3, OPENPAR=4, CLOSEPAR=5, OPENBRACES=6, CLOSEBRACES=7, 
		OPENBRACKETS=8, CLOSEBRACKETS=9, TWOPOINTS=10, QUOTATION_MARK=11, COMMA=12, 
		TRUE=13, FALSE=14, NULL=15, TYPE=16, SOURCETYPE=17, BODY=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS", "OPENPAR", 
		"CLOSEPAR", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", "CLOSEBRACKETS", 
		"TWOPOINTS", "QUOTATION_MARK", "COMMA", "TRUE", "FALSE", "NULL", "TYPE", 
		"SOURCETYPE", "BODY"
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


	public JS2JAVALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JS2JAVALexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\5\3?\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\5\6J\n\6\3\6\3\6\3\6\6\6O\n\6\r\6\16\6"+
		"P\3\6\5\6T\n\6\3\6\5\6W\n\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\5\6`\n\6\3\7"+
		"\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\5\7j\n\7\3\b\3\b\5\bn\n\b\3\b\3\b\3\t"+
		"\6\ts\n\t\r\t\16\tt\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\2\7\2\t\2\13\4\r\2\17"+
		"\2\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23"+
		"/\24\3\2\n\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63"+
		";\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\u00bb\2\3\3\2\2\2\2\13\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5;\3"+
		"\2\2\2\7@\3\2\2\2\tF\3\2\2\2\13_\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21r\3"+
		"\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2"+
		"\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a"+
		"\3\2\2\2\'\u008f\3\2\2\2)\u0095\3\2\2\2+\u009a\3\2\2\2-\u009f\3\2\2\2"+
		"/\u00ac\3\2\2\2\61\66\7$\2\2\62\65\5\5\3\2\63\65\n\2\2\2\64\62\3\2\2\2"+
		"\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66"+
		"\3\2\2\29:\7$\2\2:\4\3\2\2\2;>\7^\2\2<?\t\3\2\2=?\5\7\4\2><\3\2\2\2>="+
		"\3\2\2\2?\6\3\2\2\2@A\7w\2\2AB\5\t\5\2BC\5\t\5\2CD\5\t\5\2DE\5\t\5\2E"+
		"\b\3\2\2\2FG\t\4\2\2G\n\3\2\2\2HJ\7/\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2"+
		"KL\5\r\7\2LN\7\60\2\2MO\t\5\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QS\3\2\2\2RT\5\17\b\2SR\3\2\2\2ST\3\2\2\2T`\3\2\2\2UW\7/\2\2VU\3\2\2"+
		"\2VW\3\2\2\2WX\3\2\2\2XY\5\r\7\2YZ\5\17\b\2Z`\3\2\2\2[]\7/\2\2\\[\3\2"+
		"\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\r\7\2_I\3\2\2\2_V\3\2\2\2_\\\3\2\2\2`\f"+
		"\3\2\2\2aj\7\62\2\2bf\t\6\2\2ce\t\5\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ib\3\2\2\2j\16\3\2\2\2km\t\7\2"+
		"\2ln\t\b\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\r\7\2p\20\3\2\2\2qs\t\t"+
		"\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\t\2\2w\22\3"+
		"\2\2\2xy\7*\2\2y\24\3\2\2\2z{\7+\2\2{\26\3\2\2\2|}\7}\2\2}\30\3\2\2\2"+
		"~\177\7\177\2\2\177\32\3\2\2\2\u0080\u0081\7]\2\2\u0081\34\3\2\2\2\u0082"+
		"\u0083\7_\2\2\u0083\36\3\2\2\2\u0084\u0085\7<\2\2\u0085 \3\2\2\2\u0086"+
		"\u0087\7$\2\2\u0087\"\3\2\2\2\u0088\u0089\7.\2\2\u0089$\3\2\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d\u008e\7g\2\2"+
		"\u008e&\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7c\2\2\u0091\u0092\7n\2"+
		"\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094(\3\2\2\2\u0095\u0096\7"+
		"p\2\2\u0096\u0097\7w\2\2\u0097\u0098\7n\2\2\u0098\u0099\7n\2\2\u0099*"+
		"\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7{\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7g\2\2\u009e,\3\2\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7e\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8\7{\2\2\u00a8\u00a9"+
		"\7r\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7$\2\2\u00ab.\3\2\2\2\u00ac\u00ad"+
		"\7$\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7f\2\2\u00b0"+
		"\u00b1\7{\2\2\u00b1\u00b2\7$\2\2\u00b2\60\3\2\2\2\20\2\64\66>IPSV\\_f"+
		"imt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}