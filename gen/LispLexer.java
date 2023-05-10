// Generated from C:/Projects/test1/src/main\Lisp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMEIDENTIFIER=1, IDENTIFIER=2, PARAM=3, PLUS=4, MINUS=5, MULT=6, DIV=7, 
		ME=8, E=9, L=10, OP=11, CP=12, OC=13, CC=14, STRING=15, NUMBER=16, RAZ=17, 
		WHITESPACE=18, DIGIT=19, FLOATDIGIT=20, LETTER=21, LOWER=22, UPPER=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAMEIDENTIFIER", "IDENTIFIER", "PARAM", "PLUS", "MINUS", "MULT", "DIV", 
			"ME", "E", "L", "OP", "CP", "OC", "CC", "STRING", "NUMBER", "RAZ", "WHITESPACE", 
			"DIGIT", "FLOATDIGIT", "LETTER", "LOWER", "UPPER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'>='", "'='", "'<'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAMEIDENTIFIER", "IDENTIFIER", "PARAM", "PLUS", "MINUS", "MULT", 
			"DIV", "ME", "E", "L", "OP", "CP", "OC", "CC", "STRING", "NUMBER", "RAZ", 
			"WHITESPACE", "DIGIT", "FLOATDIGIT", "LETTER", "LOWER", "UPPER"
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


	public LispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lisp.g4"; }

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
		"\u0004\u0000\u0017\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001"+
		"\n\u0001\f\u00019\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0004\u000ec\b\u000e\u000b\u000e\f\u000e"+
		"d\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fj\b\u000f\u000b\u000f"+
		"\f\u000fk\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011q\b\u0011\u000b"+
		"\u0011\f\u0011r\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0004\u0013z\b\u0013\u000b\u0013\f\u0013{\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u0080\b\u0013\u000b\u0013\f\u0013\u0081\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0086\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0002\u0004\u0000\'\',/::__\u0003"+
		"\u0000\t\n\r\r  \u009c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000"+
		"\u0000\u0005C\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\t"+
		"H\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000"+
		"\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000"+
		"\u0013S\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017W"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b[\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001fi\u0001\u0000\u0000\u0000"+
		"!m\u0001\u0000\u0000\u0000#p\u0001\u0000\u0000\u0000%v\u0001\u0000\u0000"+
		"\u0000\'y\u0001\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000+\u0087"+
		"\u0001\u0000\u0000\u0000-\u0089\u0001\u0000\u0000\u0000/0\u0003\u0003"+
		"\u0001\u000001\u0005:\u0000\u00001\u0002\u0001\u0000\u0000\u000027\u0003"+
		")\u0014\u000036\u0003)\u0014\u000046\u0003%\u0012\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008B\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:B\u0003\u0007\u0003\u0000;B\u0003\t\u0004\u0000"+
		"<B\u0003\u000b\u0005\u0000=B\u0003\r\u0006\u0000>B\u0003\u000f\u0007\u0000"+
		"?B\u0003\u0011\b\u0000@B\u0003\u0013\t\u0000A2\u0001\u0000\u0000\u0000"+
		"A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001\u0000\u0000"+
		"\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0004\u0001\u0000\u0000\u0000"+
		"CD\u0005#\u0000\u0000DE\u0003\u001f\u000f\u0000E\u0006\u0001\u0000\u0000"+
		"\u0000FG\u0005+\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005-\u0000"+
		"\u0000I\n\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000K\f\u0001\u0000"+
		"\u0000\u0000LM\u0005/\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005"+
		">\u0000\u0000OP\u0005=\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005"+
		"=\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005<\u0000\u0000T\u0014"+
		"\u0001\u0000\u0000\u0000UV\u0005(\u0000\u0000V\u0016\u0001\u0000\u0000"+
		"\u0000WX\u0005)\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005{\u0000"+
		"\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005}\u0000\u0000\\\u001c\u0001"+
		"\u0000\u0000\u0000]b\u0005\"\u0000\u0000^c\u0003)\u0014\u0000_c\u0003"+
		"%\u0012\u0000`c\u0003#\u0011\u0000ac\u0003!\u0010\u0000b^\u0001\u0000"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\"\u0000\u0000"+
		"g\u001e\u0001\u0000\u0000\u0000hj\u0003%\u0012\u0000ih\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000l \u0001\u0000\u0000\u0000mn\u0007\u0000\u0000\u0000n\"\u0001"+
		"\u0000\u0000\u0000oq\u0007\u0001\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0006\u0011\u0000\u0000u$\u0001\u0000"+
		"\u0000\u0000vw\u000209\u0000w&\u0001\u0000\u0000\u0000xz\u0003%\u0012"+
		"\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0005.\u0000\u0000~\u0080\u0003%\u0012\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082(\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0003+\u0015\u0000\u0084\u0086\u0003-\u0016\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086*\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0002az\u0000\u0088,\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0002AZ\u0000\u008a.\u0001\u0000\u0000\u0000\u000b"+
		"\u000057Abdkr{\u0081\u0085\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}