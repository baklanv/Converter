// Generated from C:/Projects/1222/Converter/src/main/java/antlr\MyGrammar.g4 by ANTLR 4.12.0
package antlr.com;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ISA=1, PIECE=2, DEFINE=3, ABSTRACT=4, IDENTIFIER=5, NAMEIDENTIFIER=6, 
		EMTPY=7, STRING=8, PARAM=9, ARITHMETIC=10, LOGICAL=11, OP=12, CP=13, OC=14, 
		CC=15, NUMBER=16, RAZ=17, WHITESPACE=18, DIGIT=19, LETTER=20, LOWER=21, 
		UPPER=22, COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ISA", "PIECE", "DEFINE", "ABSTRACT", "IDENTIFIER", "NAMEIDENTIFIER", 
			"EMTPY", "STRING", "PARAM", "ARITHMETIC", "LOGICAL", "OP", "CP", "OC", 
			"CC", "NUMBER", "RAZ", "WHITESPACE", "DIGIT", "LETTER", "LOWER", "UPPER", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@is_a:'", "'@piece'", "'@define'", "'@abstract'", null, null, 
			"'~'", null, null, null, null, "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISA", "PIECE", "DEFINE", "ABSTRACT", "IDENTIFIER", "NAMEIDENTIFIER", 
			"EMTPY", "STRING", "PARAM", "ARITHMETIC", "LOGICAL", "OP", "CP", "OC", 
			"CC", "NUMBER", "RAZ", "WHITESPACE", "DIGIT", "LETTER", "LOWER", "UPPER", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00b6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004"+
		"V\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\\\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007e\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007k\b\u0007\u000b\u0007\f\u0007l\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n}\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0004\u000f\u0088\b\u000f\u000b\u000f\f\u000f\u0089\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0004\u0011\u008f\b\u0011\u000b\u0011\f\u0011\u0090"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0099\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00a3\b\u0016"+
		"\n\u0016\f\u0016\u00a6\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u00ac\b\u0016\n\u0016\f\u0016\u00af\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00b3\b\u0016\u0001\u0016\u0001\u0016\u0001\u00ad"+
		"\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017\u0001\u0000\u0004\u0004\u0000*+--//^^\u0004\u0000\'\',/::__\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00c9\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00036"+
		"\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007E\u0001\u0000"+
		"\u0000\u0000\t[\u0001\u0000\u0000\u0000\u000b]\u0001\u0000\u0000\u0000"+
		"\r`\u0001\u0000\u0000\u0000\u000fb\u0001\u0000\u0000\u0000\u0011p\u0001"+
		"\u0000\u0000\u0000\u0013s\u0001\u0000\u0000\u0000\u0015|\u0001\u0000\u0000"+
		"\u0000\u0017~\u0001\u0000\u0000\u0000\u0019\u0080\u0001\u0000\u0000\u0000"+
		"\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0084\u0001\u0000\u0000\u0000"+
		"\u001f\u0087\u0001\u0000\u0000\u0000!\u008b\u0001\u0000\u0000\u0000#\u008e"+
		"\u0001\u0000\u0000\u0000%\u0094\u0001\u0000\u0000\u0000\'\u0098\u0001"+
		"\u0000\u0000\u0000)\u009a\u0001\u0000\u0000\u0000+\u009c\u0001\u0000\u0000"+
		"\u0000-\u00b2\u0001\u0000\u0000\u0000/0\u0005@\u0000\u000001\u0005i\u0000"+
		"\u000012\u0005s\u0000\u000023\u0005_\u0000\u000034\u0005a\u0000\u0000"+
		"45\u0005:\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005@\u0000\u0000"+
		"78\u0005p\u0000\u000089\u0005i\u0000\u00009:\u0005e\u0000\u0000:;\u0005"+
		"c\u0000\u0000;<\u0005e\u0000\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005"+
		"@\u0000\u0000>?\u0005d\u0000\u0000?@\u0005e\u0000\u0000@A\u0005f\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000CD\u0005e\u0000\u0000"+
		"D\u0006\u0001\u0000\u0000\u0000EF\u0005@\u0000\u0000FG\u0005a\u0000\u0000"+
		"GH\u0005b\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005"+
		"r\u0000\u0000KL\u0005a\u0000\u0000LM\u0005c\u0000\u0000MN\u0005t\u0000"+
		"\u0000N\b\u0001\u0000\u0000\u0000OT\u0003\'\u0013\u0000PS\u0003\'\u0013"+
		"\u0000QS\u0003%\u0012\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\\\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000W\\\u0003"+
		"\u0013\t\u0000X\\\u0003\u0015\n\u0000Y\\\u0003\r\u0006\u0000Z\\\u0003"+
		"\u0011\b\u0000[O\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\\n\u0001\u0000\u0000\u0000]^\u0003\t\u0004\u0000^_\u0005:\u0000\u0000"+
		"_\f\u0001\u0000\u0000\u0000`a\u0005~\u0000\u0000a\u000e\u0001\u0000\u0000"+
		"\u0000bd\u0005\"\u0000\u0000ce\u0005@\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ej\u0001\u0000\u0000\u0000fk\u0003\'\u0013"+
		"\u0000gk\u0003%\u0012\u0000hk\u0003#\u0011\u0000ik\u0003!\u0010\u0000"+
		"jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005"+
		"\"\u0000\u0000o\u0010\u0001\u0000\u0000\u0000pq\u0005#\u0000\u0000qr\u0003"+
		"\u001f\u000f\u0000r\u0012\u0001\u0000\u0000\u0000st\u0007\u0000\u0000"+
		"\u0000t\u0014\u0001\u0000\u0000\u0000uv\u0005!\u0000\u0000v}\u0005=\u0000"+
		"\u0000wx\u0005>\u0000\u0000x}\u0005=\u0000\u0000yz\u0005<\u0000\u0000"+
		"z}\u0005=\u0000\u0000{}\u0002<>\u0000|u\u0001\u0000\u0000\u0000|w\u0001"+
		"\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0016\u0001\u0000\u0000\u0000~\u007f\u0005(\u0000\u0000\u007f\u0018"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005)\u0000\u0000\u0081\u001a\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005{\u0000\u0000\u0083\u001c\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005}\u0000\u0000\u0085\u001e\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0003%\u0012\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a \u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0007\u0001\u0000\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0007\u0002\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0006\u0011\u0000\u0000\u0093$\u0001\u0000\u0000\u0000\u0094\u0095\u0002"+
		"09\u0000\u0095&\u0001\u0000\u0000\u0000\u0096\u0099\u0003)\u0014\u0000"+
		"\u0097\u0099\u0003+\u0015\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099(\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0002az\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0002AZ\u0000"+
		"\u009d,\u0001\u0000\u0000\u0000\u009e\u009f\u0005/\u0000\u0000\u009f\u00a0"+
		"\u0005/\u0000\u0000\u00a0\u00a4\u0001\u0000\u0000\u0000\u00a1\u00a3\b"+
		"\u0003\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00b3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005/\u0000\u0000\u00a8\u00a9\u0005*\u0000"+
		"\u0000\u00a9\u00ad\u0001\u0000\u0000\u0000\u00aa\u00ac\t\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005*\u0000\u0000\u00b1\u00b3\u0005/\u0000\u0000\u00b2\u009e"+
		"\u0001\u0000\u0000\u0000\u00b2\u00a7\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006\u0016\u0001\u0000\u00b5.\u0001"+
		"\u0000\u0000\u0000\u000e\u0000RT[djl|\u0089\u0090\u0098\u00a4\u00ad\u00b2"+
		"\u0002\u0000\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}