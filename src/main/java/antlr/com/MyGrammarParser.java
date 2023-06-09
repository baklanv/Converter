// Generated from C:/Projects/1222/Converter/src/main/java/antlr\MyGrammar.g4 by ANTLR 4.12.0
package antlr.com;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ISA=1, PIECE=2, DEFINE=3, ABSTRACT=4, IDENTIFIER=5, NAMEIDENTIFIER=6, 
		EMTPY=7, STRING=8, PARAM=9, ARITHMETIC=10, LOGICAL=11, OP=12, CP=13, OC=14, 
		CC=15, NUMBER=16, RAZ=17, WHITESPACE=18, DIGIT=19, LETTER=20, LOWER=21, 
		UPPER=22, COMMENT=23;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_pieces = 2, RULE_parent = 3, 
		RULE_define = 4, RULE_move = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "pieces", "parent", "define", "move"
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

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(MyGrammarParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(MyGrammarParser.COMMENT, i);
		}
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
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP || _la==COMMENT) {
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMENT:
					{
					setState(12);
					match(COMMENT);
					}
					break;
				case OP:
					{
					setState(13);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
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
		public TerminalNode OP() { return getToken(MyGrammarParser.OP, 0); }
		public TerminalNode CP() { return getToken(MyGrammarParser.CP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGrammarParser.STRING, i);
		}
		public PiecesContext pieces() {
			return getRuleContext(PiecesContext.class,0);
		}
		public List<TerminalNode> OC() { return getTokens(MyGrammarParser.OC); }
		public TerminalNode OC(int i) {
			return getToken(MyGrammarParser.OC, i);
		}
		public List<TerminalNode> NAMEIDENTIFIER() { return getTokens(MyGrammarParser.NAMEIDENTIFIER); }
		public TerminalNode NAMEIDENTIFIER(int i) {
			return getToken(MyGrammarParser.NAMEIDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MyGrammarParser.NUMBER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(MyGrammarParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(MyGrammarParser.COMMENT, i);
		}
		public List<TerminalNode> CC() { return getTokens(MyGrammarParser.CC); }
		public TerminalNode CC(int i) {
			return getToken(MyGrammarParser.CC, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(21);
			match(OP);
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(22);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				setState(23);
				match(STRING);
				}
				break;
			case PIECE:
				{
				setState(24);
				pieces();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8507744L) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OC:
					{
					setState(27);
					match(OC);
					}
					break;
				case NAMEIDENTIFIER:
					{
					setState(28);
					match(NAMEIDENTIFIER);
					}
					break;
				case IDENTIFIER:
					{
					setState(29);
					match(IDENTIFIER);
					}
					break;
				case STRING:
					{
					setState(30);
					match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(31);
					match(NUMBER);
					}
					break;
				case OP:
					{
					setState(32);
					expression();
					}
					break;
				case COMMENT:
					{
					setState(33);
					match(COMMENT);
					}
					break;
				case CC:
					{
					setState(34);
					match(CC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PiecesContext extends ParserRuleContext {
		public TerminalNode PIECE() { return getToken(MyGrammarParser.PIECE, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public TerminalNode ABSTRACT() { return getToken(MyGrammarParser.ABSTRACT, 0); }
		public ParentContext parent() {
			return getRuleContext(ParentContext.class,0);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public PiecesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPieces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPieces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPieces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiecesContext pieces() throws RecognitionException {
		PiecesContext _localctx = new PiecesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pieces);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PIECE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(43);
				match(ABSTRACT);
				}
			}

			setState(46);
			match(STRING);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ISA) {
				{
				setState(47);
				parent();
				}
			}

			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					define();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					move();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
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
	public static class ParentContext extends ParserRuleContext {
		public TerminalNode ISA() { return getToken(MyGrammarParser.ISA, 0); }
		public List<TerminalNode> STRING() { return getTokens(MyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGrammarParser.STRING, i);
		}
		public TerminalNode OC() { return getToken(MyGrammarParser.OC, 0); }
		public TerminalNode CC() { return getToken(MyGrammarParser.CC, 0); }
		public List<TerminalNode> RAZ() { return getTokens(MyGrammarParser.RAZ); }
		public TerminalNode RAZ(int i) {
			return getToken(MyGrammarParser.RAZ, i);
		}
		public ParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentContext parent() throws RecognitionException {
		ParentContext _localctx = new ParentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ISA);
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(63);
				match(STRING);
				}
				break;
			case OC:
				{
				{
				setState(64);
				match(OC);
				setState(65);
				match(STRING);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RAZ) {
					{
					{
					setState(66);
					match(RAZ);
					setState(67);
					match(STRING);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(CC);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
	public static class DefineContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(MyGrammarParser.OP, 0); }
		public TerminalNode DEFINE() { return getToken(MyGrammarParser.DEFINE, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(MyGrammarParser.CP, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(OP);
			setState(77);
			match(DEFINE);
			setState(78);
			match(STRING);
			setState(79);
			expression();
			setState(80);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_move);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				expression();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(STRING);
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
		"\u0004\u0001\u0017W\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n"+
		"\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00021\b\u0002\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f"+
		"\u00027\t\u0002\u0001\u0002\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003E\b\u0003\n\u0003\f\u0003H\t\u0003\u0001\u0003\u0003\u0003"+
		"K\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000c\u0000\u0010"+
		"\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004*\u0001"+
		"\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000"+
		"\u0000\nT\u0001\u0000\u0000\u0000\f\u000f\u0005\u0017\u0000\u0000\r\u000f"+
		"\u0003\u0002\u0001\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e\r\u0001"+
		"\u0000\u0000\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0019\u0005"+
		"\f\u0000\u0000\u0016\u001a\u0005\u0005\u0000\u0000\u0017\u001a\u0005\b"+
		"\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000\u0019\u0016\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000"+
		"\u0000\u0000\u001a%\u0001\u0000\u0000\u0000\u001b$\u0005\u000e\u0000\u0000"+
		"\u001c$\u0005\u0006\u0000\u0000\u001d$\u0005\u0005\u0000\u0000\u001e$"+
		"\u0005\b\u0000\u0000\u001f$\u0005\u0010\u0000\u0000 $\u0003\u0002\u0001"+
		"\u0000!$\u0005\u0017\u0000\u0000\"$\u0005\u000f\u0000\u0000#\u001b\u0001"+
		"\u0000\u0000\u0000#\u001c\u0001\u0000\u0000\u0000#\u001d\u0001\u0000\u0000"+
		"\u0000#\u001e\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000#"+
		" \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005"+
		"\r\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*,\u0005\u0002\u0000\u0000"+
		"+-\u0005\u0004\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.0\u0005\b\u0000\u0000/1\u0003\u0006\u0003"+
		"\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000015\u0001\u0000"+
		"\u0000\u000024\u0003\b\u0004\u000032\u0001\u0000\u0000\u000047\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006;\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0003\n\u0005\u000098\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>J\u0005\u0001\u0000\u0000?K\u0005\b\u0000\u0000@A\u0005\u000e"+
		"\u0000\u0000AF\u0005\b\u0000\u0000BC\u0005\u0011\u0000\u0000CE\u0005\b"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IK\u0005\u000f\u0000\u0000J?\u0001\u0000\u0000"+
		"\u0000J@\u0001\u0000\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005"+
		"\f\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0005\b\u0000\u0000OP\u0003"+
		"\u0002\u0001\u0000PQ\u0005\r\u0000\u0000Q\t\u0001\u0000\u0000\u0000RU"+
		"\u0003\u0002\u0001\u0000SU\u0005\b\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000U\u000b\u0001\u0000\u0000\u0000\f\u000e\u0010"+
		"\u0019#%,05;FJT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}