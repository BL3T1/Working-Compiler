// Generated from src/Grammar/CSS/CssParser.g4 by ANTLR 4.13.2
package Grammar.CSS;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORTANT=1, URL=2, AT_RULE=3, AND=4, NOT=5, VAR=6, STRING=7, LBRACE=8, 
		RBRACE=9, LPAREN=10, RPAREN=11, COMMA=12, SEMICOLON=13, COLON=14, DOT=15, 
		HASH=16, GREATER=17, PLUS=18, TILDE=19, DOUBLE_COLON=20, SLASH=21, EQUALS=22, 
		MINUS=23, SQUARE_OPEN=24, SQUARE_CLOSE=25, STAR=26, TILDE_EQUALS=27, PIPE_EQUALS=28, 
		CARET_EQUALS=29, DOLLAR_EQUALS=30, STAR_EQUALS=31, QUESTION=32, NUMBER=33, 
		IDENT=34, WS=35, COMMENT=36;
	public static final int
		RULE_stylesheet = 0, RULE_rule = 1, RULE_selector = 2, RULE_simpleSelector = 3, 
		RULE_typeSelector = 4, RULE_universal = 5, RULE_class = 6, RULE_attrib = 7, 
		RULE_pseudo = 8, RULE_pseudoExpr = 9, RULE_combinator = 10, RULE_declaration = 11, 
		RULE_property = 12, RULE_value = 13, RULE_valuePart = 14, RULE_atRule = 15, 
		RULE_atRuleBody = 16, RULE_atRuleValue = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "rule", "selector", "simpleSelector", "typeSelector", "universal", 
			"class", "attrib", "pseudo", "pseudoExpr", "combinator", "declaration", 
			"property", "value", "valuePart", "atRule", "atRuleBody", "atRuleValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'and'", "'not'", null, null, "'{'", "'}'", "'('", 
			"')'", "','", "';'", "':'", "'.'", null, "'>'", "'+'", "'~'", "'::'", 
			"'/'", "'='", "'-'", "'['", "']'", "'*'", "'~='", "'|='", "'^='", "'$='", 
			"'*='", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORTANT", "URL", "AT_RULE", "AND", "NOT", "VAR", "STRING", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", "COLON", "DOT", "HASH", 
			"GREATER", "PLUS", "TILDE", "DOUBLE_COLON", "SLASH", "EQUALS", "MINUS", 
			"SQUARE_OPEN", "SQUARE_CLOSE", "STAR", "TILDE_EQUALS", "PIPE_EQUALS", 
			"CARET_EQUALS", "DOLLAR_EQUALS", "STAR_EQUALS", "QUESTION", "NUMBER", 
			"IDENT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17264918536L) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
				case DOT:
				case HASH:
				case DOUBLE_COLON:
				case SQUARE_OPEN:
				case STAR:
				case IDENT:
					{
					setState(36);
					rule_();
					}
					break;
				case AT_RULE:
					{
					setState(37);
					atRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class RuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			selector();
			setState(46);
			match(LBRACE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==IDENT) {
				{
				{
				setState(47);
				declaration();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RBRACE);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CssParser.COMMA, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			simpleSelector();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17265836032L) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
				case DOT:
				case HASH:
				case DOUBLE_COLON:
				case SQUARE_OPEN:
				case STAR:
				case IDENT:
					{
					setState(56);
					simpleSelector();
					}
					break;
				case GREATER:
				case PLUS:
				case TILDE:
					{
					setState(57);
					combinator();
					setState(58);
					simpleSelector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(65);
				match(COMMA);
				setState(66);
				selector();
				}
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorModifiersOnlyContext extends SimpleSelectorContext {
		public List<TerminalNode> HASH() { return getTokens(CssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(CssParser.HASH, i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public SimpleSelectorModifiersOnlyContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelectorModifiersOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelectorModifiersOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelectorModifiersOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorWithTypeContext extends SimpleSelectorContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> HASH() { return getTokens(CssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(CssParser.HASH, i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public SimpleSelectorWithTypeContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelectorWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelectorWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelectorWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleSelector);
		try {
			int _alt;
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case IDENT:
				_localctx = new SimpleSelectorWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(69);
					typeSelector();
					}
					break;
				case STAR:
					{
					setState(70);
					universal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(77);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(73);
							match(HASH);
							}
							break;
						case DOT:
							{
							setState(74);
							class_();
							}
							break;
						case SQUARE_OPEN:
							{
							setState(75);
							attrib();
							}
							break;
						case COLON:
						case DOUBLE_COLON:
							{
							setState(76);
							pseudo();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case HASH:
				_localctx = new SimpleSelectorModifiersOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(HASH);
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(87);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(83);
							match(HASH);
							}
							break;
						case DOT:
							{
							setState(84);
							class_();
							}
							break;
						case SQUARE_OPEN:
							{
							setState(85);
							attrib();
							}
							break;
						case COLON:
						case DOUBLE_COLON:
							{
							setState(86);
							pseudo();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case DOT:
				_localctx = new SimpleSelectorModifiersOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				class_();
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(97);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(93);
							match(HASH);
							}
							break;
						case DOT:
							{
							setState(94);
							class_();
							}
							break;
						case SQUARE_OPEN:
							{
							setState(95);
							attrib();
							}
							break;
						case COLON:
						case DOUBLE_COLON:
							{
							setState(96);
							pseudo();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case SQUARE_OPEN:
				_localctx = new SimpleSelectorModifiersOnlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				attrib();
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(107);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(103);
							match(HASH);
							}
							break;
						case DOT:
							{
							setState(104);
							class_();
							}
							break;
						case SQUARE_OPEN:
							{
							setState(105);
							attrib();
							}
							break;
						case COLON:
						case DOUBLE_COLON:
							{
							setState(106);
							pseudo();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case COLON:
			case DOUBLE_COLON:
				_localctx = new SimpleSelectorModifiersOnlyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				pseudo();
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(117);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(113);
							match(HASH);
							}
							break;
						case DOT:
							{
							setState(114);
							class_();
							}
							break;
						case SQUARE_OPEN:
							{
							setState(115);
							attrib();
							}
							break;
						case COLON:
						case DOUBLE_COLON:
							{
							setState(116);
							pseudo();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENT);
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
	public static class UniversalContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(STAR);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DOT);
			setState(129);
			match(IDENT);
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
	public static class AttribContext extends ParserRuleContext {
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
	 
		public AttribContext() { }
		public void copyFrom(AttribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribWithoutValueContext extends AttribContext {
		public TerminalNode SQUARE_OPEN() { return getToken(CssParser.SQUARE_OPEN, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(CssParser.SQUARE_CLOSE, 0); }
		public AttribWithoutValueContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttribWithoutValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttribWithoutValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttribWithoutValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttribWithValueContext extends AttribContext {
		public TerminalNode SQUARE_OPEN() { return getToken(CssParser.SQUARE_OPEN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(CssParser.SQUARE_CLOSE, 0); }
		public TerminalNode EQUALS() { return getToken(CssParser.EQUALS, 0); }
		public TerminalNode TILDE_EQUALS() { return getToken(CssParser.TILDE_EQUALS, 0); }
		public TerminalNode PIPE_EQUALS() { return getToken(CssParser.PIPE_EQUALS, 0); }
		public TerminalNode CARET_EQUALS() { return getToken(CssParser.CARET_EQUALS, 0); }
		public TerminalNode DOLLAR_EQUALS() { return getToken(CssParser.DOLLAR_EQUALS, 0); }
		public TerminalNode STAR_EQUALS() { return getToken(CssParser.STAR_EQUALS, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public AttribWithValueContext(AttribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttribWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttribWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttribWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrib);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AttribWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(SQUARE_OPEN);
				setState(132);
				match(IDENT);
				{
				setState(133);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4164943872L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(136);
				match(SQUARE_CLOSE);
				}
				break;
			case 2:
				_localctx = new AttribWithoutValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(SQUARE_OPEN);
				setState(138);
				match(IDENT);
				setState(139);
				match(SQUARE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoContext extends ParserRuleContext {
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
	 
		public PseudoContext() { }
		public void copyFrom(PseudoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotPseudoContext extends PseudoContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(CssParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public NotPseudoContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNotPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNotPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNotPseudo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementContext extends PseudoContext {
		public TerminalNode DOUBLE_COLON() { return getToken(CssParser.DOUBLE_COLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public PseudoElementContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends PseudoContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public PseudoClassContext(PseudoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pseudo);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new PseudoClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(COLON);
				setState(143);
				match(IDENT);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(144);
					match(LPAREN);
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25848725664L) != 0)) {
						{
						setState(145);
						pseudoExpr();
						}
					}

					setState(148);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				_localctx = new PseudoElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(DOUBLE_COLON);
				setState(152);
				match(IDENT);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(153);
					match(LPAREN);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25848725664L) != 0)) {
						{
						setState(154);
						pseudoExpr();
						}
					}

					setState(157);
					match(RPAREN);
					}
				}

				}
				break;
			case 3:
				_localctx = new NotPseudoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(COLON);
				setState(161);
				match(NOT);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(162);
					match(LPAREN);
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25848725664L) != 0)) {
						{
						setState(163);
						pseudoExpr();
						}
					}

					setState(166);
					match(RPAREN);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoExprContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(CssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CssParser.NUMBER, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CssParser.STRING, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CssParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CssParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CssParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CssParser.MINUS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(CssParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CssParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(CssParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(CssParser.SLASH, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CssParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CssParser.COLON, i);
		}
		public List<TerminalNode> NOT() { return getTokens(CssParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(CssParser.NOT, i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public PseudoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoExprContext pseudoExpr() throws RecognitionException {
		PseudoExprContext _localctx = new PseudoExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pseudoExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(171);
					match(NUMBER);
					}
					break;
				case 2:
					{
					setState(172);
					match(IDENT);
					}
					break;
				case 3:
					{
					setState(173);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(174);
					match(PLUS);
					}
					break;
				case 5:
					{
					setState(175);
					match(MINUS);
					}
					break;
				case 6:
					{
					setState(176);
					match(STAR);
					}
					break;
				case 7:
					{
					setState(177);
					match(SLASH);
					}
					break;
				case 8:
					{
					setState(178);
					match(COLON);
					}
					break;
				case 9:
					{
					setState(179);
					match(NOT);
					}
					break;
				case 10:
					{
					setState(180);
					pseudo();
					}
					break;
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25848725664L) != 0) );
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
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdjacentSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public AdjacentSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAdjacentSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAdjacentSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAdjacentSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildCombinatorContext extends CombinatorContext {
		public TerminalNode GREATER() { return getToken(CssParser.GREATER, 0); }
		public ChildCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterChildCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitChildCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitChildCombinator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralSiblingCombinatorContext extends CombinatorContext {
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public GeneralSiblingCombinatorContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterGeneralSiblingCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitGeneralSiblingCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitGeneralSiblingCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_combinator);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				_localctx = new ChildCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(GREATER);
				}
				break;
			case PLUS:
				_localctx = new AdjacentSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new GeneralSiblingCombinatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(TILDE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			property();
			setState(191);
			match(COLON);
			setState(192);
			value();
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentPropertyContext extends PropertyContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public IdentPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarPropertyContext extends PropertyContext {
		public TerminalNode VAR() { return getToken(CssParser.VAR, 0); }
		public VarPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterVarProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitVarProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitVarProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_property);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new IdentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(IDENT);
				}
				break;
			case VAR:
				_localctx = new VarPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<ValuePartContext> valuePart() {
			return getRuleContexts(ValuePartContext.class);
		}
		public ValuePartContext valuePart(int i) {
			return getRuleContext(ValuePartContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				valuePart();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30147597510L) != 0) );
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
	public static class ValuePartContext extends ParserRuleContext {
		public ValuePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuePart; }
	 
		public ValuePartContext() { }
		public void copyFrom(ValuePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionValueContext extends ValuePartContext {
		public TerminalNode QUESTION() { return getToken(CssParser.QUESTION, 0); }
		public QuestionValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlValueContext extends ValuePartContext {
		public TerminalNode URL() { return getToken(CssParser.URL, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(CssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CssParser.STRING, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CssParser.NUMBER, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(CssParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(CssParser.SLASH, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CssParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CssParser.COLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CssParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CssParser.DOT, i);
		}
		public List<TerminalNode> QUESTION() { return getTokens(CssParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(CssParser.QUESTION, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(CssParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(CssParser.EQUALS, i);
		}
		public List<TerminalNode> AND() { return getTokens(CssParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CssParser.AND, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CssParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CssParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CssParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CssParser.PLUS, i);
		}
		public UrlValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUrlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUrlValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUrlValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashValueContext extends ValuePartContext {
		public TerminalNode SLASH() { return getToken(CssParser.SLASH, 0); }
		public SlashValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSlashValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSlashValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSlashValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarValueContext extends ValuePartContext {
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public StarValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotValueContext extends ValuePartContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public DotValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDotValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HashValueContext extends ValuePartContext {
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public HashValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterHashValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitHashValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitHashValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenValueContext extends ValuePartContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public ParenValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterParenValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitParenValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitParenValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TildeValueContext extends ValuePartContext {
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public TildeValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTildeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTildeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTildeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ValuePartContext {
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public StringValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarValueContext extends ValuePartContext {
		public TerminalNode VAR() { return getToken(CssParser.VAR, 0); }
		public VarValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsValueContext extends ValuePartContext {
		public TerminalNode EQUALS() { return getToken(CssParser.EQUALS, 0); }
		public EqualsValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEqualsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEqualsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEqualsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaValueContext extends ValuePartContext {
		public TerminalNode COMMA() { return getToken(CssParser.COMMA, 0); }
		public CommaValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCommaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCommaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCommaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonValueContext extends ValuePartContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ColonValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterColonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitColonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitColonValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusValueContext extends ValuePartContext {
		public TerminalNode MINUS() { return getToken(CssParser.MINUS, 0); }
		public MinusValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMinusValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMinusValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMinusValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusValueContext extends ValuePartContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public PlusValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPlusValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPlusValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPlusValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportantValueContext extends ValuePartContext {
		public TerminalNode IMPORTANT() { return getToken(CssParser.IMPORTANT, 0); }
		public ImportantValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterImportantValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitImportantValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitImportantValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentValueContext extends ValuePartContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public IdentValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberValueContext extends ValuePartContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public NumberValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterValueContext extends ValuePartContext {
		public TerminalNode GREATER() { return getToken(CssParser.GREATER, 0); }
		public GreaterValueContext(ValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterGreaterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitGreaterValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitGreaterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuePartContext valuePart() throws RecognitionException {
		ValuePartContext _localctx = new ValuePartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valuePart);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new IdentValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENT);
				}
				break;
			case VAR:
				_localctx = new VarValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(VAR);
				}
				break;
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(STRING);
				}
				break;
			case HASH:
				_localctx = new HashValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(HASH);
				}
				break;
			case IMPORTANT:
				_localctx = new ImportantValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(IMPORTANT);
				}
				break;
			case URL:
				_localctx = new UrlValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				match(URL);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30079762576L) != 0)) {
					{
					{
					setState(211);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30079762576L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(RPAREN);
				}
				break;
			case LPAREN:
				_localctx = new ParenValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(LPAREN);
				setState(219);
				value();
				setState(220);
				match(RPAREN);
				}
				break;
			case COMMA:
				_localctx = new CommaValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				match(COMMA);
				}
				break;
			case DOT:
				_localctx = new DotValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
				match(DOT);
				}
				break;
			case COLON:
				_localctx = new ColonValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(224);
				match(COLON);
				}
				break;
			case SLASH:
				_localctx = new SlashValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(225);
				match(SLASH);
				}
				break;
			case GREATER:
				_localctx = new GreaterValueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(226);
				match(GREATER);
				}
				break;
			case PLUS:
				_localctx = new PlusValueContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(227);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusValueContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(228);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new StarValueContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(229);
				match(STAR);
				}
				break;
			case TILDE:
				_localctx = new TildeValueContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(230);
				match(TILDE);
				}
				break;
			case EQUALS:
				_localctx = new EqualsValueContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(231);
				match(EQUALS);
				}
				break;
			case QUESTION:
				_localctx = new QuestionValueContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(232);
				match(QUESTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public TerminalNode AT_RULE() { return getToken(CssParser.AT_RULE, 0); }
		public AtRuleBodyContext atRuleBody() {
			return getRuleContext(AtRuleBodyContext.class,0);
		}
		public List<AtRuleValueContext> atRuleValue() {
			return getRuleContexts(AtRuleValueContext.class);
		}
		public AtRuleValueContext atRuleValue(int i) {
			return getRuleContext(AtRuleValueContext.class,i);
		}
		public List<TerminalNode> URL() { return getTokens(CssParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(CssParser.URL, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CssParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CssParser.RPAREN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CssParser.STRING, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CssParser.NUMBER, i);
		}
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(AT_RULE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30147599572L) != 0)) {
				{
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(236);
					atRuleValue();
					}
					break;
				case 2:
					{
					setState(237);
					match(URL);
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25769803904L) != 0)) {
						{
						setState(238);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 25769803904L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(241);
					match(RPAREN);
					}
					break;
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			atRuleBody();
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
	public static class AtRuleBodyContext extends ParserRuleContext {
		public AtRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRuleBody; }
	 
		public AtRuleBodyContext() { }
		public void copyFrom(AtRuleBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleWithoutBlockContext extends AtRuleBodyContext {
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public AtRuleWithoutBlockContext(AtRuleBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleWithoutBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleWithoutBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleWithoutBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleWithBlockContext extends AtRuleBodyContext {
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public AtRuleWithBlockContext(AtRuleBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleWithBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleWithBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleBodyContext atRuleBody() throws RecognitionException {
		AtRuleBodyContext _localctx = new AtRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atRuleBody);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new AtRuleWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(LBRACE);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17264918600L) != 0)) {
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(250);
						rule_();
						}
						break;
					case 2:
						{
						setState(251);
						declaration();
						}
						break;
					case 3:
						{
						setState(252);
						atRule();
						}
						break;
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(RBRACE);
				}
				break;
			case SEMICOLON:
				_localctx = new AtRuleWithoutBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleValueContext extends ParserRuleContext {
		public AtRuleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRuleValue; }
	 
		public AtRuleValueContext() { }
		public void copyFrom(AtRuleValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleGreaterContext extends AtRuleValueContext {
		public TerminalNode GREATER() { return getToken(CssParser.GREATER, 0); }
		public AtRuleGreaterContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleCommaContext extends AtRuleValueContext {
		public TerminalNode COMMA() { return getToken(CssParser.COMMA, 0); }
		public AtRuleCommaContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleVarContext extends AtRuleValueContext {
		public TerminalNode VAR() { return getToken(CssParser.VAR, 0); }
		public AtRuleVarContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleTildeContext extends AtRuleValueContext {
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public AtRuleTildeContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleTilde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleTilde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleTilde(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleDotContext extends AtRuleValueContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public AtRuleDotContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleStringContext extends AtRuleValueContext {
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public AtRuleStringContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleSlashContext extends AtRuleValueContext {
		public TerminalNode SLASH() { return getToken(CssParser.SLASH, 0); }
		public AtRuleSlashContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleMinusContext extends AtRuleValueContext {
		public TerminalNode MINUS() { return getToken(CssParser.MINUS, 0); }
		public AtRuleMinusContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleStarContext extends AtRuleValueContext {
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public AtRuleStarContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleHashContext extends AtRuleValueContext {
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public AtRuleHashContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleHash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleEqualsContext extends AtRuleValueContext {
		public TerminalNode EQUALS() { return getToken(CssParser.EQUALS, 0); }
		public AtRuleEqualsContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleColonContext extends AtRuleValueContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public AtRuleColonContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleColon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleIdentContext extends AtRuleValueContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public AtRuleIdentContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleRParenContext extends AtRuleValueContext {
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public AtRuleRParenContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleRParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleRParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleRParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleAndContext extends AtRuleValueContext {
		public TerminalNode AND() { return getToken(CssParser.AND, 0); }
		public AtRuleAndContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleNumberContext extends AtRuleValueContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public AtRuleNumberContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleQuestionContext extends AtRuleValueContext {
		public TerminalNode QUESTION() { return getToken(CssParser.QUESTION, 0); }
		public AtRuleQuestionContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRulePlusContext extends AtRuleValueContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public AtRulePlusContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRulePlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRulePlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRulePlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleLParenContext extends AtRuleValueContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public AtRuleLParenContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleLParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleLParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleLParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleUrlContext extends AtRuleValueContext {
		public TerminalNode URL() { return getToken(CssParser.URL, 0); }
		public AtRuleUrlContext(AtRuleValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRuleUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRuleUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRuleUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleValueContext atRuleValue() throws RecognitionException {
		AtRuleValueContext _localctx = new AtRuleValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atRuleValue);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new AtRuleIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(IDENT);
				}
				break;
			case VAR:
				_localctx = new AtRuleVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(VAR);
				}
				break;
			case STRING:
				_localctx = new AtRuleStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new AtRuleNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(NUMBER);
				}
				break;
			case HASH:
				_localctx = new AtRuleHashContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(HASH);
				}
				break;
			case COMMA:
				_localctx = new AtRuleCommaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(COMMA);
				}
				break;
			case LPAREN:
				_localctx = new AtRuleLParenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				match(LPAREN);
				}
				break;
			case RPAREN:
				_localctx = new AtRuleRParenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				match(RPAREN);
				}
				break;
			case COLON:
				_localctx = new AtRuleColonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				match(COLON);
				}
				break;
			case URL:
				_localctx = new AtRuleUrlContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				match(URL);
				}
				break;
			case GREATER:
				_localctx = new AtRuleGreaterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				match(GREATER);
				}
				break;
			case PLUS:
				_localctx = new AtRulePlusContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(273);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new AtRuleTildeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(274);
				match(TILDE);
				}
				break;
			case SLASH:
				_localctx = new AtRuleSlashContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(275);
				match(SLASH);
				}
				break;
			case DOT:
				_localctx = new AtRuleDotContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(276);
				match(DOT);
				}
				break;
			case EQUALS:
				_localctx = new AtRuleEqualsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(277);
				match(EQUALS);
				}
				break;
			case MINUS:
				_localctx = new AtRuleMinusContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(278);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new AtRuleStarContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(279);
				match(STAR);
				}
				break;
			case AND:
				_localctx = new AtRuleAndContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(280);
				match(AND);
				}
				break;
			case QUESTION:
				_localctx = new AtRuleQuestionContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(281);
				match(QUESTION);
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
		"\u0004\u0001$\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001\f\u0001"+
		"4\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002\f\u0002@\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003H\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003X\b\u0003\n\u0003\f\u0003"+
		"[\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003"+
		"o\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0003\u0003{\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008d\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0093\b\b\u0001\b\u0003\b\u0096\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\b\u0003\b\u009f"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a5\b\b\u0001\b\u0003\b"+
		"\u00a8\b\b\u0003\b\u00aa\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00b6\b\t\u000b\t\f\t\u00b7"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00bd\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00c6\b\f\u0001"+
		"\r\u0004\r\u00c9\b\r\u000b\r\f\r\u00ca\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00d5\b\u000e\n\u000e\f\u000e\u00d8\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ea\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00f0\b\u000f\u0001\u000f\u0005\u000f\u00f3"+
		"\b\u000f\n\u000f\f\u000f\u00f6\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00fe\b\u0010\n\u0010"+
		"\f\u0010\u0101\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0105\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u011b\b\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0005\u0002\u0000\u0016\u0016\u001b\u001f"+
		"\u0002\u0000\u0007\u0007\"\"\u0001\u0001\r\r\u0006\u0000\u0004\u0004\u0007"+
		"\u0007\u000e\u000f\u0012\u0012\u0015\u0017 \"\u0002\u0000\u0007\u0007"+
		"!\"\u016d\u0000(\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u00047\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000\u0000\b|\u0001"+
		"\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000"+
		"\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000"+
		"\u0000\u0012\u00b5\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000"+
		"\u0000\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u00c5\u0001\u0000\u0000"+
		"\u0000\u001a\u00c8\u0001\u0000\u0000\u0000\u001c\u00e9\u0001\u0000\u0000"+
		"\u0000\u001e\u00eb\u0001\u0000\u0000\u0000 \u0104\u0001\u0000\u0000\u0000"+
		"\"\u011a\u0001\u0000\u0000\u0000$\'\u0003\u0002\u0001\u0000%\'\u0003\u001e"+
		"\u000f\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000"+
		"\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0003\u0004\u0002\u0000.2\u0005"+
		"\b\u0000\u0000/1\u0003\u0016\u000b\u00000/\u0001\u0000\u0000\u000014\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"35\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005\t\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u00007>\u0003\u0006\u0003\u00008=\u0003\u0006"+
		"\u0003\u00009:\u0003\u0014\n\u0000:;\u0003\u0006\u0003\u0000;=\u0001\u0000"+
		"\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?C\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\f\u0000\u0000"+
		"BD\u0003\u0004\u0002\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0005\u0001\u0000\u0000\u0000EH\u0003\b\u0004\u0000FH\u0003\n"+
		"\u0005\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HO\u0001"+
		"\u0000\u0000\u0000IN\u0005\u0010\u0000\u0000JN\u0003\f\u0006\u0000KN\u0003"+
		"\u000e\u0007\u0000LN\u0003\u0010\b\u0000MI\u0001\u0000\u0000\u0000MJ\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000P{\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RY\u0005\u0010"+
		"\u0000\u0000SX\u0005\u0010\u0000\u0000TX\u0003\f\u0006\u0000UX\u0003\u000e"+
		"\u0007\u0000VX\u0003\u0010\b\u0000WS\u0001\u0000\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z{\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\c\u0003\f\u0006"+
		"\u0000]b\u0005\u0010\u0000\u0000^b\u0003\f\u0006\u0000_b\u0003\u000e\u0007"+
		"\u0000`b\u0003\u0010\b\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d{\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fm\u0003\u000e\u0007\u0000"+
		"gl\u0005\u0010\u0000\u0000hl\u0003\f\u0006\u0000il\u0003\u000e\u0007\u0000"+
		"jl\u0003\u0010\b\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n{\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pw\u0003\u0010\b\u0000qv\u0005\u0010"+
		"\u0000\u0000rv\u0003\f\u0006\u0000sv\u0003\u000e\u0007\u0000tv\u0003\u0010"+
		"\b\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000zG\u0001\u0000\u0000\u0000zR\u0001\u0000\u0000"+
		"\u0000z\\\u0001\u0000\u0000\u0000zf\u0001\u0000\u0000\u0000zp\u0001\u0000"+
		"\u0000\u0000{\u0007\u0001\u0000\u0000\u0000|}\u0005\"\u0000\u0000}\t\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\u001a\u0000\u0000\u007f\u000b\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0082\u0005\"\u0000"+
		"\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0018\u0000\u0000"+
		"\u0084\u0085\u0005\"\u0000\u0000\u0085\u0086\u0007\u0000\u0000\u0000\u0086"+
		"\u0087\u0007\u0001\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008d\u0005\u0019\u0000\u0000\u0089\u008a\u0005\u0018\u0000\u0000\u008a"+
		"\u008b\u0005\"\u0000\u0000\u008b\u008d\u0005\u0019\u0000\u0000\u008c\u0083"+
		"\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u000f"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u000e\u0000\u0000\u008f\u0095"+
		"\u0005\"\u0000\u0000\u0090\u0092\u0005\n\u0000\u0000\u0091\u0093\u0003"+
		"\u0012\t\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u000b"+
		"\u0000\u0000\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u00aa\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0014"+
		"\u0000\u0000\u0098\u009e\u0005\"\u0000\u0000\u0099\u009b\u0005\n\u0000"+
		"\u0000\u009a\u009c\u0003\u0012\t\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0005\u000b\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a7\u0005\u0005\u0000\u0000"+
		"\u00a2\u00a4\u0005\n\u0000\u0000\u00a3\u00a5\u0003\u0012\t\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u000b\u0000\u0000\u00a7"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u008e\u0001\u0000\u0000\u0000\u00a9"+
		"\u0097\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00aa"+
		"\u0011\u0001\u0000\u0000\u0000\u00ab\u00b6\u0005!\u0000\u0000\u00ac\u00b6"+
		"\u0005\"\u0000\u0000\u00ad\u00b6\u0005\u0007\u0000\u0000\u00ae\u00b6\u0005"+
		"\u0012\u0000\u0000\u00af\u00b6\u0005\u0017\u0000\u0000\u00b0\u00b6\u0005"+
		"\u001a\u0000\u0000\u00b1\u00b6\u0005\u0015\u0000\u0000\u00b2\u00b6\u0005"+
		"\u000e\u0000\u0000\u00b3\u00b6\u0005\u0005\u0000\u0000\u00b4\u00b6\u0003"+
		"\u0010\b\u0000\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u0013\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bd\u0005\u0011\u0000\u0000\u00ba\u00bd\u0005\u0012"+
		"\u0000\u0000\u00bb\u00bd\u0005\u0013\u0000\u0000\u00bc\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\u0018"+
		"\f\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c1\u0003\u001a\r"+
		"\u0000\u00c1\u00c2\u0007\u0002\u0000\u0000\u00c2\u0017\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0005\"\u0000\u0000\u00c4\u00c6\u0005\u0006\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u0019\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003\u001c\u000e\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u001b\u0001\u0000\u0000\u0000\u00cc\u00ea\u0005\"\u0000\u0000\u00cd"+
		"\u00ea\u0005\u0006\u0000\u0000\u00ce\u00ea\u0005!\u0000\u0000\u00cf\u00ea"+
		"\u0005\u0007\u0000\u0000\u00d0\u00ea\u0005\u0010\u0000\u0000\u00d1\u00ea"+
		"\u0005\u0001\u0000\u0000\u00d2\u00d6\u0005\u0002\u0000\u0000\u00d3\u00d5"+
		"\u0007\u0003\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00ea\u0005\u000b\u0000\u0000\u00da\u00db"+
		"\u0005\n\u0000\u0000\u00db\u00dc\u0003\u001a\r\u0000\u00dc\u00dd\u0005"+
		"\u000b\u0000\u0000\u00dd\u00ea\u0001\u0000\u0000\u0000\u00de\u00ea\u0005"+
		"\f\u0000\u0000\u00df\u00ea\u0005\u000f\u0000\u0000\u00e0\u00ea\u0005\u000e"+
		"\u0000\u0000\u00e1\u00ea\u0005\u0015\u0000\u0000\u00e2\u00ea\u0005\u0011"+
		"\u0000\u0000\u00e3\u00ea\u0005\u0012\u0000\u0000\u00e4\u00ea\u0005\u0017"+
		"\u0000\u0000\u00e5\u00ea\u0005\u001a\u0000\u0000\u00e6\u00ea\u0005\u0013"+
		"\u0000\u0000\u00e7\u00ea\u0005\u0016\u0000\u0000\u00e8\u00ea\u0005 \u0000"+
		"\u0000\u00e9\u00cc\u0001\u0000\u0000\u0000\u00e9\u00cd\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ce\u0001\u0000\u0000\u0000\u00e9\u00cf\u0001\u0000\u0000"+
		"\u0000\u00e9\u00d0\u0001\u0000\u0000\u0000\u00e9\u00d1\u0001\u0000\u0000"+
		"\u0000\u00e9\u00d2\u0001\u0000\u0000\u0000\u00e9\u00da\u0001\u0000\u0000"+
		"\u0000\u00e9\u00de\u0001\u0000\u0000\u0000\u00e9\u00df\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e0\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u001d\u0001\u0000\u0000"+
		"\u0000\u00eb\u00f4\u0005\u0003\u0000\u0000\u00ec\u00f3\u0003\"\u0011\u0000"+
		"\u00ed\u00ef\u0005\u0002\u0000\u0000\u00ee\u00f0\u0007\u0004\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005\u000b\u0000\u0000"+
		"\u00f2\u00ec\u0001\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003 \u0010\u0000\u00f8"+
		"\u001f\u0001\u0000\u0000\u0000\u00f9\u00ff\u0005\b\u0000\u0000\u00fa\u00fe"+
		"\u0003\u0002\u0001\u0000\u00fb\u00fe\u0003\u0016\u000b\u0000\u00fc\u00fe"+
		"\u0003\u001e\u000f\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0105\u0005\t\u0000\u0000\u0103\u0105\u0005"+
		"\r\u0000\u0000\u0104\u00f9\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000"+
		"\u0000\u0000\u0105!\u0001\u0000\u0000\u0000\u0106\u011b\u0005\"\u0000"+
		"\u0000\u0107\u011b\u0005\u0006\u0000\u0000\u0108\u011b\u0005\u0007\u0000"+
		"\u0000\u0109\u011b\u0005!\u0000\u0000\u010a\u011b\u0005\u0010\u0000\u0000"+
		"\u010b\u011b\u0005\f\u0000\u0000\u010c\u011b\u0005\n\u0000\u0000\u010d"+
		"\u011b\u0005\u000b\u0000\u0000\u010e\u011b\u0005\u000e\u0000\u0000\u010f"+
		"\u011b\u0005\u0002\u0000\u0000\u0110\u011b\u0005\u0011\u0000\u0000\u0111"+
		"\u011b\u0005\u0012\u0000\u0000\u0112\u011b\u0005\u0013\u0000\u0000\u0113"+
		"\u011b\u0005\u0015\u0000\u0000\u0114\u011b\u0005\u000f\u0000\u0000\u0115"+
		"\u011b\u0005\u0016\u0000\u0000\u0116\u011b\u0005\u0017\u0000\u0000\u0117"+
		"\u011b\u0005\u001a\u0000\u0000\u0118\u011b\u0005\u0004\u0000\u0000\u0119"+
		"\u011b\u0005 \u0000\u0000\u011a\u0106\u0001\u0000\u0000\u0000\u011a\u0107"+
		"\u0001\u0000\u0000\u0000\u011a\u0108\u0001\u0000\u0000\u0000\u011a\u0109"+
		"\u0001\u0000\u0000\u0000\u011a\u010a\u0001\u0000\u0000\u0000\u011a\u010b"+
		"\u0001\u0000\u0000\u0000\u011a\u010c\u0001\u0000\u0000\u0000\u011a\u010d"+
		"\u0001\u0000\u0000\u0000\u011a\u010e\u0001\u0000\u0000\u0000\u011a\u010f"+
		"\u0001\u0000\u0000\u0000\u011a\u0110\u0001\u0000\u0000\u0000\u011a\u0111"+
		"\u0001\u0000\u0000\u0000\u011a\u0112\u0001\u0000\u0000\u0000\u011a\u0113"+
		"\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000\u0000\u011a\u0115"+
		"\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011a\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011b#\u0001\u0000\u0000\u0000(&(2<>CGMOWYac"+
		"kmuwz\u008c\u0092\u0095\u009b\u009e\u00a4\u00a7\u00a9\u00b5\u00b7\u00bc"+
		"\u00c5\u00ca\u00d6\u00e9\u00ef\u00f2\u00f4\u00fd\u00ff\u0104\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}