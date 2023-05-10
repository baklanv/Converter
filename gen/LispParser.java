// Generated from C:/Projects/test1/src/main\Lisp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMEIDENTIFIER=1, IDENTIFIER=2, PARAM=3, PLUS=4, MINUS=5, MULT=6, DIV=7, 
		ME=8, E=9, L=10, OP=11, CP=12, OC=13, CC=14, STRING=15, NUMBER=16, RAZ=17, 
		WHITESPACE=18, DIGIT=19, FLOATDIGIT=20, LETTER=21, LOWER=22, UPPER=23;
	public static final int
		RULE_program = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression"
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

	@Override
	public String getGrammarFileName() { return "Lisp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(4);
				expression();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(LispParser.OP, 0); }
		public TerminalNode CP() { return getToken(LispParser.CP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(LispParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LispParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LispParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LispParser.STRING, i);
		}
		public TerminalNode OC() { return getToken(LispParser.OC, 0); }
		public List<TerminalNode> NAMEIDENTIFIER() { return getTokens(LispParser.NAMEIDENTIFIER); }
		public TerminalNode NAMEIDENTIFIER(int i) {
			return getToken(LispParser.NAMEIDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LispParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LispParser.NUMBER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PARAM() { return getTokens(LispParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(LispParser.PARAM, i);
		}
		public List<TerminalNode> FLOATDIGIT() { return getTokens(LispParser.FLOATDIGIT); }
		public TerminalNode FLOATDIGIT(int i) {
			return getToken(LispParser.FLOATDIGIT, i);
		}
		public TerminalNode CC() { return getToken(LispParser.CC, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(OP);
			setState(13);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OC) {
				{
				setState(14);
				match(OC);
				}
			}

			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1148942L) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAMEIDENTIFIER:
					{
					setState(17);
					match(NAMEIDENTIFIER);
					}
					break;
				case IDENTIFIER:
					{
					setState(18);
					match(IDENTIFIER);
					}
					break;
				case STRING:
					{
					setState(19);
					match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(20);
					match(NUMBER);
					}
					break;
				case OP:
					{
					setState(21);
					expression();
					}
					break;
				case PARAM:
					{
					setState(22);
					match(PARAM);
					}
					break;
				case FLOATDIGIT:
					{
					setState(23);
					match(FLOATDIGIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CC) {
				{
				setState(29);
				match(CC);
				}
			}

			setState(32);
			match(CP);
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
		"\u0004\u0001\u0017#\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0005\u0000\u0006\b\u0000\n\u0000\f\u0000\t\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001\u0001"+
		"\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0001\u0002\u0000\u0002\u0002\u000f\u000f"+
		"*\u0000\u0007\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000"+
		"\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000"+
		"\u0006\t\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0001\u0000\u0000\u0000\b\n\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0005\u0000\u0000\u0001\u000b\u0001\u0001\u0000\u0000"+
		"\u0000\f\r\u0005\u000b\u0000\u0000\r\u000f\u0007\u0000\u0000\u0000\u000e"+
		"\u0010\u0005\r\u0000\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0001\u0000\u0000\u0000\u0010\u001a\u0001\u0000\u0000\u0000\u0011\u0019"+
		"\u0005\u0001\u0000\u0000\u0012\u0019\u0005\u0002\u0000\u0000\u0013\u0019"+
		"\u0005\u000f\u0000\u0000\u0014\u0019\u0005\u0010\u0000\u0000\u0015\u0019"+
		"\u0003\u0002\u0001\u0000\u0016\u0019\u0005\u0003\u0000\u0000\u0017\u0019"+
		"\u0005\u0014\u0000\u0000\u0018\u0011\u0001\u0000\u0000\u0000\u0018\u0012"+
		"\u0001\u0000\u0000\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0018\u0014"+
		"\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001d\u001f\u0005\u000e\u0000\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0005\f\u0000\u0000!\u0003\u0001\u0000\u0000\u0000"+
		"\u0005\u0007\u000f\u0018\u001a\u001e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}