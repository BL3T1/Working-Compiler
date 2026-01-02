// Generated from src/Grammar/HTML/HtmlJinjaParser.g4 by ANTLR 4.13.2
package Grammar.HTML;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlJinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, PI_START=2, CDATA_START=3, HTML_COMMENT=4, CONDITIONAL_COMMENT=5, 
		OPEN_EXPR=6, OPEN_STMT=7, OPEN_COMMENT=8, SCRIPT_OPEN=9, STYLE_OPEN=10, 
		LINK_OPEN=11, TAG_CLOSE_OPEN=12, TAG_OPEN=13, HTML_TEXT=14, TAG_OPEN_EXPR=15, 
		TAG_OPEN_STMT=16, TAG_NAME=17, ATTR_NAME=18, ATTR_EQ=19, ATTR_VALUE=20, 
		TAG_WS=21, TAG_SLASH=22, TAG_CLOSE=23, TAG_SLASH_CLOSE=24, SCRIPT_OPEN_EXPR=25, 
		SCRIPT_OPEN_STMT=26, SCRIPT_ATTR_NAME=27, SCRIPT_TAG_NAME=28, SCRIPT_ATTR_EQ=29, 
		SCRIPT_ATTR_VALUE_START=30, SCRIPT_ATTR_VALUE_START_SINGLE=31, SCRIPT_ATTR_VALUE_UNQUOTED=32, 
		SCRIPT_TAG_WS=33, SCRIPT_TAG_CLOSE=34, SCRIPT_TAG_SLASH_CLOSE=35, SCRIPT_ATTR_VALUE_END=36, 
		SCRIPT_ATTR_VALUE_OPEN_EXPR=37, SCRIPT_ATTR_VALUE_OPEN_STMT=38, SCRIPT_ATTR_VALUE_TEXT=39, 
		SCRIPT_ATTR_VALUE_END_SINGLE=40, SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE=41, 
		SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE=42, SCRIPT_ATTR_VALUE_TEXT_SINGLE=43, 
		SCRIPT_JINJA_EXPR=44, SCRIPT_JINJA_STMT=45, CDATA_START_IN_SCRIPT=46, 
		SCRIPT_CLOSE=47, SCRIPT_CONTENT_TEXT=48, STYLE_OPEN_EXPR=49, STYLE_OPEN_STMT=50, 
		STYLE_ATTR_NAME=51, STYLE_TAG_NAME=52, STYLE_ATTR_EQ=53, STYLE_ATTR_VALUE_START=54, 
		STYLE_ATTR_VALUE_START_SINGLE=55, STYLE_ATTR_VALUE_UNQUOTED=56, STYLE_TAG_WS=57, 
		STYLE_TAG_CLOSE=58, STYLE_TAG_SLASH_CLOSE=59, STYLE_ATTR_VALUE_END=60, 
		STYLE_ATTR_VALUE_OPEN_EXPR=61, STYLE_ATTR_VALUE_OPEN_STMT=62, STYLE_ATTR_VALUE_TEXT=63, 
		STYLE_ATTR_VALUE_END_SINGLE=64, STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE=65, 
		STYLE_ATTR_VALUE_OPEN_STMT_SINGLE=66, STYLE_ATTR_VALUE_TEXT_SINGLE=67, 
		STYLE_JINJA_EXPR=68, STYLE_JINJA_STMT=69, CDATA_START_IN_STYLE=70, STYLE_CLOSE=71, 
		STYLE_CONTENT_TEXT=72, EXPR_WS=73, EXPR_CONTENT=74, CLOSE_EXPR=75, STMT_WS=76, 
		CLOSE_STMT=77, STMT_CONTENT=78, COMMENT_WS=79, COMMENT_CONTENT=80, CLOSE_COMMENT=81, 
		CDATA_CONTENT=82, PI_CONTENT=83;
	public static final int
		RULE_html = 0, RULE_htmlContent = 1, RULE_element = 2, RULE_tagOpen = 3, 
		RULE_tagClose = 4, RULE_selfClosingTag = 5, RULE_voidTag = 6, RULE_scriptTag = 7, 
		RULE_scriptContent = 8, RULE_scriptContentText = 9, RULE_styleTag = 10, 
		RULE_styleContent = 11, RULE_styleContentText = 12, RULE_tagContent = 13, 
		RULE_attribute = 14, RULE_scriptAttribute = 15, RULE_scriptAttrValue = 16, 
		RULE_scriptAttrValueContent = 17, RULE_scriptAttrValueContentSingle = 18, 
		RULE_styleAttribute = 19, RULE_styleAttrValue = 20, RULE_styleAttrValueContent = 21, 
		RULE_styleAttrValueContentSingle = 22, RULE_htmlText = 23, RULE_jinjaExpr = 24, 
		RULE_jinjaStmt = 25, RULE_jinjaComment = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"html", "htmlContent", "element", "tagOpen", "tagClose", "selfClosingTag", 
			"voidTag", "scriptTag", "scriptContent", "scriptContentText", "styleTag", 
			"styleContent", "styleContentText", "tagContent", "attribute", "scriptAttribute", 
			"scriptAttrValue", "scriptAttrValueContent", "scriptAttrValueContentSingle", 
			"styleAttribute", "styleAttrValue", "styleAttrValueContent", "styleAttrValueContentSingle", 
			"htmlText", "jinjaExpr", "jinjaStmt", "jinjaComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<?'", null, null, null, null, null, "'{#'", "'<script'", 
			"'<style'", "'<link'", "'</'", "'<'", null, null, null, null, null, null, 
			null, null, "'/'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'</script>'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'</style>'", null, null, null, "'}}'", 
			null, "'%}'", null, null, null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "PI_START", "CDATA_START", "HTML_COMMENT", "CONDITIONAL_COMMENT", 
			"OPEN_EXPR", "OPEN_STMT", "OPEN_COMMENT", "SCRIPT_OPEN", "STYLE_OPEN", 
			"LINK_OPEN", "TAG_CLOSE_OPEN", "TAG_OPEN", "HTML_TEXT", "TAG_OPEN_EXPR", 
			"TAG_OPEN_STMT", "TAG_NAME", "ATTR_NAME", "ATTR_EQ", "ATTR_VALUE", "TAG_WS", 
			"TAG_SLASH", "TAG_CLOSE", "TAG_SLASH_CLOSE", "SCRIPT_OPEN_EXPR", "SCRIPT_OPEN_STMT", 
			"SCRIPT_ATTR_NAME", "SCRIPT_TAG_NAME", "SCRIPT_ATTR_EQ", "SCRIPT_ATTR_VALUE_START", 
			"SCRIPT_ATTR_VALUE_START_SINGLE", "SCRIPT_ATTR_VALUE_UNQUOTED", "SCRIPT_TAG_WS", 
			"SCRIPT_TAG_CLOSE", "SCRIPT_TAG_SLASH_CLOSE", "SCRIPT_ATTR_VALUE_END", 
			"SCRIPT_ATTR_VALUE_OPEN_EXPR", "SCRIPT_ATTR_VALUE_OPEN_STMT", "SCRIPT_ATTR_VALUE_TEXT", 
			"SCRIPT_ATTR_VALUE_END_SINGLE", "SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE", 
			"SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE", "SCRIPT_ATTR_VALUE_TEXT_SINGLE", 
			"SCRIPT_JINJA_EXPR", "SCRIPT_JINJA_STMT", "CDATA_START_IN_SCRIPT", "SCRIPT_CLOSE", 
			"SCRIPT_CONTENT_TEXT", "STYLE_OPEN_EXPR", "STYLE_OPEN_STMT", "STYLE_ATTR_NAME", 
			"STYLE_TAG_NAME", "STYLE_ATTR_EQ", "STYLE_ATTR_VALUE_START", "STYLE_ATTR_VALUE_START_SINGLE", 
			"STYLE_ATTR_VALUE_UNQUOTED", "STYLE_TAG_WS", "STYLE_TAG_CLOSE", "STYLE_TAG_SLASH_CLOSE", 
			"STYLE_ATTR_VALUE_END", "STYLE_ATTR_VALUE_OPEN_EXPR", "STYLE_ATTR_VALUE_OPEN_STMT", 
			"STYLE_ATTR_VALUE_TEXT", "STYLE_ATTR_VALUE_END_SINGLE", "STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE", 
			"STYLE_ATTR_VALUE_OPEN_STMT_SINGLE", "STYLE_ATTR_VALUE_TEXT_SINGLE", 
			"STYLE_JINJA_EXPR", "STYLE_JINJA_STMT", "CDATA_START_IN_STYLE", "STYLE_CLOSE", 
			"STYLE_CONTENT_TEXT", "EXPR_WS", "EXPR_CONTENT", "CLOSE_EXPR", "STMT_WS", 
			"CLOSE_STMT", "STMT_CONTENT", "COMMENT_WS", "COMMENT_CONTENT", "CLOSE_COMMENT", 
			"CDATA_CONTENT", "PI_CONTENT"
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
	public String getGrammarFileName() { return "HtmlJinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlJinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HtmlJinjaParser.EOF, 0); }
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_html);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513025601L) != 0)) {
					{
					{
					setState(54);
					htmlContent();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(EOF);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaStmtContext jinjaStmt() {
			return getRuleContext(JinjaStmtContext.class,0);
		}
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlContent);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_EXPR:
			case TAG_OPEN_EXPR:
			case SCRIPT_OPEN_EXPR:
			case SCRIPT_JINJA_EXPR:
			case STYLE_OPEN_EXPR:
			case STYLE_JINJA_EXPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				jinjaExpr();
				}
				break;
			case OPEN_STMT:
			case TAG_OPEN_STMT:
			case SCRIPT_OPEN_STMT:
			case SCRIPT_JINJA_STMT:
			case STYLE_OPEN_STMT:
			case STYLE_JINJA_STMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				jinjaStmt();
				}
				break;
			case OPEN_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				jinjaComment();
				}
				break;
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case LINK_OPEN:
			case TAG_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				element();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				htmlText();
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagElementWithContentContext extends ElementContext {
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public TagContentContext tagContent() {
			return getRuleContext(TagContentContext.class,0);
		}
		public TagCloseContext tagClose() {
			return getRuleContext(TagCloseContext.class,0);
		}
		public TagElementWithContentContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagElementWithContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagElementWithContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagElementWithContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagElementEmptyContext extends ElementContext {
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public TagCloseContext tagClose() {
			return getRuleContext(TagCloseContext.class,0);
		}
		public TagElementEmptyContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagElementEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagElementEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagElementEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ElementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptElementContext extends ElementContext {
		public ScriptTagContext scriptTag() {
			return getRuleContext(ScriptTagContext.class,0);
		}
		public ScriptElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidElementContext extends ElementContext {
		public VoidTagContext voidTag() {
			return getRuleContext(VoidTagContext.class,0);
		}
		public VoidElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterVoidElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitVoidElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitVoidElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends ElementContext {
		public StyleTagContext styleTag() {
			return getRuleContext(StyleTagContext.class,0);
		}
		public StyleElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VoidElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				voidTag();
				}
				break;
			case 2:
				_localctx = new TagElementWithContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				tagOpen();
				setState(73);
				tagContent();
				setState(74);
				tagClose();
				}
				break;
			case 3:
				_localctx = new TagElementEmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				tagOpen();
				setState(77);
				tagClose();
				}
				break;
			case 4:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				selfClosingTag();
				}
				break;
			case 5:
				_localctx = new ScriptElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				scriptTag();
				}
				break;
			case 6:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				styleTag();
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
	public static class TagOpenContext extends ParserRuleContext {
		public TagOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagOpen; }
	 
		public TagOpenContext() { }
		public void copyFrom(TagOpenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularTagContext extends TagOpenContext {
		public TerminalNode TAG_OPEN() { return getToken(HtmlJinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlJinjaParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public RegularTagContext(TagOpenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterRegularTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitRegularTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitRegularTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinkTagContext extends TagOpenContext {
		public TerminalNode LINK_OPEN() { return getToken(HtmlJinjaParser.LINK_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlJinjaParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public LinkTagContext(TagOpenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterLinkTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitLinkTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitLinkTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagOpenContext tagOpen() throws RecognitionException {
		TagOpenContext _localctx = new TagOpenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagOpen);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new RegularTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(TAG_OPEN);
				setState(85);
				match(TAG_NAME);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513019901L) != 0)) {
					{
					setState(89);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
					case ATTR_NAME:
						{
						setState(86);
						attribute();
						}
						break;
					case OPEN_EXPR:
					case TAG_OPEN_EXPR:
					case SCRIPT_OPEN_EXPR:
					case SCRIPT_JINJA_EXPR:
					case STYLE_OPEN_EXPR:
					case STYLE_JINJA_EXPR:
						{
						setState(87);
						jinjaExpr();
						}
						break;
					case OPEN_STMT:
					case TAG_OPEN_STMT:
					case SCRIPT_OPEN_STMT:
					case SCRIPT_JINJA_STMT:
					case STYLE_OPEN_STMT:
					case STYLE_JINJA_STMT:
						{
						setState(88);
						jinjaStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(TAG_CLOSE);
				}
				break;
			case LINK_OPEN:
				_localctx = new LinkTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(LINK_OPEN);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513019901L) != 0)) {
					{
					setState(99);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
					case ATTR_NAME:
						{
						setState(96);
						attribute();
						}
						break;
					case OPEN_EXPR:
					case TAG_OPEN_EXPR:
					case SCRIPT_OPEN_EXPR:
					case SCRIPT_JINJA_EXPR:
					case STYLE_OPEN_EXPR:
					case STYLE_JINJA_EXPR:
						{
						setState(97);
						jinjaExpr();
						}
						break;
					case OPEN_STMT:
					case TAG_OPEN_STMT:
					case SCRIPT_OPEN_STMT:
					case SCRIPT_JINJA_STMT:
					case STYLE_OPEN_STMT:
					case STYLE_JINJA_STMT:
						{
						setState(98);
						jinjaStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(TAG_CLOSE);
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
	public static class TagCloseContext extends ParserRuleContext {
		public TerminalNode TAG_CLOSE_OPEN() { return getToken(HtmlJinjaParser.TAG_CLOSE_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlJinjaParser.TAG_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public TagCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagCloseContext tagClose() throws RecognitionException {
		TagCloseContext _localctx = new TagCloseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagClose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(TAG_CLOSE_OPEN);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_NAME) {
				{
				setState(108);
				match(TAG_NAME);
				}
			}

			setState(111);
			match(TAG_CLOSE);
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
	 
		public SelfClosingTagContext() { }
		public void copyFrom(SelfClosingTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinkSelfClosingContext extends SelfClosingTagContext {
		public TerminalNode LINK_OPEN() { return getToken(HtmlJinjaParser.LINK_OPEN, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlJinjaParser.TAG_SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public LinkSelfClosingContext(SelfClosingTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterLinkSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitLinkSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitLinkSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularSelfClosingContext extends SelfClosingTagContext {
		public TerminalNode TAG_OPEN() { return getToken(HtmlJinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlJinjaParser.TAG_SLASH_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public RegularSelfClosingContext(SelfClosingTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterRegularSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitRegularSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitRegularSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selfClosingTag);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new RegularSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(TAG_OPEN);
				setState(114);
				match(TAG_NAME);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513019901L) != 0)) {
					{
					setState(118);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
					case ATTR_NAME:
						{
						setState(115);
						attribute();
						}
						break;
					case OPEN_EXPR:
					case TAG_OPEN_EXPR:
					case SCRIPT_OPEN_EXPR:
					case SCRIPT_JINJA_EXPR:
					case STYLE_OPEN_EXPR:
					case STYLE_JINJA_EXPR:
						{
						setState(116);
						jinjaExpr();
						}
						break;
					case OPEN_STMT:
					case TAG_OPEN_STMT:
					case SCRIPT_OPEN_STMT:
					case SCRIPT_JINJA_STMT:
					case STYLE_OPEN_STMT:
					case STYLE_JINJA_STMT:
						{
						setState(117);
						jinjaStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case LINK_OPEN:
				_localctx = new LinkSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(LINK_OPEN);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513019901L) != 0)) {
					{
					setState(128);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
					case ATTR_NAME:
						{
						setState(125);
						attribute();
						}
						break;
					case OPEN_EXPR:
					case TAG_OPEN_EXPR:
					case SCRIPT_OPEN_EXPR:
					case SCRIPT_JINJA_EXPR:
					case STYLE_OPEN_EXPR:
					case STYLE_JINJA_EXPR:
						{
						setState(126);
						jinjaExpr();
						}
						break;
					case OPEN_STMT:
					case TAG_OPEN_STMT:
					case SCRIPT_OPEN_STMT:
					case SCRIPT_JINJA_STMT:
					case STYLE_OPEN_STMT:
					case STYLE_JINJA_STMT:
						{
						setState(127);
						jinjaStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(TAG_SLASH_CLOSE);
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
	public static class VoidTagContext extends ParserRuleContext {
		public VoidTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidTag; }
	 
		public VoidTagContext() { }
		public void copyFrom(VoidTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinkVoidTagContext extends VoidTagContext {
		public TerminalNode LINK_OPEN() { return getToken(HtmlJinjaParser.LINK_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlJinjaParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public LinkVoidTagContext(VoidTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterLinkVoidTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitLinkVoidTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitLinkVoidTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularVoidTagContext extends VoidTagContext {
		public TerminalNode TAG_OPEN() { return getToken(HtmlJinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlJinjaParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public RegularVoidTagContext(VoidTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterRegularVoidTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitRegularVoidTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitRegularVoidTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTagContext voidTag() throws RecognitionException {
		VoidTagContext _localctx = new VoidTagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_voidTag);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new RegularVoidTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(TAG_OPEN);
				setState(137);
				match(TAG_NAME);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513019901L) != 0)) {
					{
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
					case ATTR_NAME:
						{
						setState(138);
						attribute();
						}
						break;
					case OPEN_EXPR:
					case TAG_OPEN_EXPR:
					case SCRIPT_OPEN_EXPR:
					case SCRIPT_JINJA_EXPR:
					case STYLE_OPEN_EXPR:
					case STYLE_JINJA_EXPR:
						{
						setState(139);
						jinjaExpr();
						}
						break;
					case OPEN_STMT:
					case TAG_OPEN_STMT:
					case SCRIPT_OPEN_STMT:
					case SCRIPT_JINJA_STMT:
					case STYLE_OPEN_STMT:
					case STYLE_JINJA_STMT:
						{
						setState(140);
						jinjaStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(TAG_CLOSE);
				}
				break;
			case LINK_OPEN:
				_localctx = new LinkVoidTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LINK_OPEN);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513019901L) != 0)) {
					{
					setState(151);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_NAME:
					case ATTR_NAME:
						{
						setState(148);
						attribute();
						}
						break;
					case OPEN_EXPR:
					case TAG_OPEN_EXPR:
					case SCRIPT_OPEN_EXPR:
					case SCRIPT_JINJA_EXPR:
					case STYLE_OPEN_EXPR:
					case STYLE_JINJA_EXPR:
						{
						setState(149);
						jinjaExpr();
						}
						break;
					case OPEN_STMT:
					case TAG_OPEN_STMT:
					case SCRIPT_OPEN_STMT:
					case SCRIPT_JINJA_STMT:
					case STYLE_OPEN_STMT:
					case STYLE_JINJA_STMT:
						{
						setState(150);
						jinjaStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(TAG_CLOSE);
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
	public static class ScriptTagContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HtmlJinjaParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_TAG_CLOSE() { return getToken(HtmlJinjaParser.SCRIPT_TAG_CLOSE, 0); }
		public ScriptContentContext scriptContent() {
			return getRuleContext(ScriptContentContext.class,0);
		}
		public TerminalNode SCRIPT_CLOSE() { return getToken(HtmlJinjaParser.SCRIPT_CLOSE, 0); }
		public List<ScriptAttributeContext> scriptAttribute() {
			return getRuleContexts(ScriptAttributeContext.class);
		}
		public ScriptAttributeContext scriptAttribute(int i) {
			return getRuleContext(ScriptAttributeContext.class,i);
		}
		public ScriptTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptTagContext scriptTag() throws RecognitionException {
		ScriptTagContext _localctx = new ScriptTagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scriptTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(SCRIPT_OPEN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCRIPT_ATTR_NAME) {
				{
				{
				setState(160);
				scriptAttribute();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(SCRIPT_TAG_CLOSE);
			setState(167);
			scriptContent();
			setState(168);
			match(SCRIPT_CLOSE);
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
	public static class ScriptContentContext extends ParserRuleContext {
		public List<ScriptContentTextContext> scriptContentText() {
			return getRuleContexts(ScriptContentTextContext.class);
		}
		public ScriptContentTextContext scriptContentText(int i) {
			return getRuleContext(ScriptContentTextContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public ScriptContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContentContext scriptContent() throws RecognitionException {
		ScriptContentContext _localctx = new ScriptContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scriptContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611654407466514941L) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCRIPT_CONTENT_TEXT:
					{
					setState(170);
					scriptContentText();
					}
					break;
				case OPEN_EXPR:
				case TAG_OPEN_EXPR:
				case SCRIPT_OPEN_EXPR:
				case SCRIPT_JINJA_EXPR:
				case STYLE_OPEN_EXPR:
				case STYLE_JINJA_EXPR:
					{
					setState(171);
					jinjaExpr();
					}
					break;
				case OPEN_STMT:
				case TAG_OPEN_STMT:
				case SCRIPT_OPEN_STMT:
				case SCRIPT_JINJA_STMT:
				case STYLE_OPEN_STMT:
				case STYLE_JINJA_STMT:
					{
					setState(172);
					jinjaStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ScriptContentTextContext extends ParserRuleContext {
		public TerminalNode SCRIPT_CONTENT_TEXT() { return getToken(HtmlJinjaParser.SCRIPT_CONTENT_TEXT, 0); }
		public ScriptContentTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptContentText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptContentText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptContentText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptContentText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContentTextContext scriptContentText() throws RecognitionException {
		ScriptContentTextContext _localctx = new ScriptContentTextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scriptContentText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SCRIPT_CONTENT_TEXT);
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
	public static class StyleTagContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlJinjaParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_TAG_CLOSE() { return getToken(HtmlJinjaParser.STYLE_TAG_CLOSE, 0); }
		public StyleContentContext styleContent() {
			return getRuleContext(StyleContentContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(HtmlJinjaParser.STYLE_CLOSE, 0); }
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public StyleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleTagContext styleTag() throws RecognitionException {
		StyleTagContext _localctx = new StyleTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styleTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STYLE_OPEN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_ATTR_NAME) {
				{
				{
				setState(181);
				styleAttribute();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(STYLE_TAG_CLOSE);
			setState(188);
			styleContent();
			setState(189);
			match(STYLE_CLOSE);
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
	public static class StyleContentContext extends ParserRuleContext {
		public List<StyleContentTextContext> styleContentText() {
			return getRuleContexts(StyleContentTextContext.class);
		}
		public StyleContentTextContext styleContentText(int i) {
			return getRuleContext(StyleContentTextContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public StyleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentContext styleContent() throws RecognitionException {
		StyleContentContext _localctx = new StyleContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1741626519158976L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 19L) != 0)) {
				{
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STYLE_CONTENT_TEXT:
					{
					setState(191);
					styleContentText();
					}
					break;
				case OPEN_EXPR:
				case TAG_OPEN_EXPR:
				case SCRIPT_OPEN_EXPR:
				case SCRIPT_JINJA_EXPR:
				case STYLE_OPEN_EXPR:
				case STYLE_JINJA_EXPR:
					{
					setState(192);
					jinjaExpr();
					}
					break;
				case OPEN_STMT:
				case TAG_OPEN_STMT:
				case SCRIPT_OPEN_STMT:
				case SCRIPT_JINJA_STMT:
				case STYLE_OPEN_STMT:
				case STYLE_JINJA_STMT:
					{
					setState(193);
					jinjaStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class StyleContentTextContext extends ParserRuleContext {
		public TerminalNode STYLE_CONTENT_TEXT() { return getToken(HtmlJinjaParser.STYLE_CONTENT_TEXT, 0); }
		public StyleContentTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContentText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleContentText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleContentText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleContentText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentTextContext styleContentText() throws RecognitionException {
		StyleContentTextContext _localctx = new StyleContentTextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_styleContentText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(STYLE_CONTENT_TEXT);
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
	public static class TagContentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<JinjaStmtContext> jinjaStmt() {
			return getRuleContexts(JinjaStmtContext.class);
		}
		public JinjaStmtContext jinjaStmt(int i) {
			return getRuleContext(JinjaStmtContext.class,i);
		}
		public List<JinjaCommentContext> jinjaComment() {
			return getRuleContexts(JinjaCommentContext.class);
		}
		public JinjaCommentContext jinjaComment(int i) {
			return getRuleContext(JinjaCommentContext.class,i);
		}
		public List<HtmlTextContext> htmlText() {
			return getRuleContexts(HtmlTextContext.class);
		}
		public HtmlTextContext htmlText(int i) {
			return getRuleContext(HtmlTextContext.class,i);
		}
		public TagContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContentContext tagContent() throws RecognitionException {
		TagContentContext _localctx = new TagContentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4611658805513025601L) != 0)) {
				{
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCRIPT_OPEN:
				case STYLE_OPEN:
				case LINK_OPEN:
				case TAG_OPEN:
					{
					setState(201);
					element();
					}
					break;
				case OPEN_EXPR:
				case TAG_OPEN_EXPR:
				case SCRIPT_OPEN_EXPR:
				case SCRIPT_JINJA_EXPR:
				case STYLE_OPEN_EXPR:
				case STYLE_JINJA_EXPR:
					{
					setState(202);
					jinjaExpr();
					}
					break;
				case OPEN_STMT:
				case TAG_OPEN_STMT:
				case SCRIPT_OPEN_STMT:
				case SCRIPT_JINJA_STMT:
				case STYLE_OPEN_STMT:
				case STYLE_JINJA_STMT:
					{
					setState(203);
					jinjaStmt();
					}
					break;
				case OPEN_COMMENT:
					{
					setState(204);
					jinjaComment();
					}
					break;
				case HTML_TEXT:
					{
					setState(205);
					htmlText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrWithValueContext extends AttributeContext {
		public TerminalNode ATTR_EQ() { return getToken(HtmlJinjaParser.ATTR_EQ, 0); }
		public TerminalNode ATTR_VALUE() { return getToken(HtmlJinjaParser.ATTR_VALUE, 0); }
		public TerminalNode ATTR_NAME() { return getToken(HtmlJinjaParser.ATTR_NAME, 0); }
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public AttrWithValueContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterAttrWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitAttrWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitAttrWithValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrWithoutValueContext extends AttributeContext {
		public TerminalNode ATTR_NAME() { return getToken(HtmlJinjaParser.ATTR_NAME, 0); }
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public AttrWithoutValueContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterAttrWithoutValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitAttrWithoutValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitAttrWithoutValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attribute);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AttrWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				_la = _input.LA(1);
				if ( !(_la==TAG_NAME || _la==ATTR_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(212);
				match(ATTR_EQ);
				setState(213);
				match(ATTR_VALUE);
				}
				break;
			case 2:
				_localctx = new AttrWithoutValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==TAG_NAME || _la==ATTR_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class ScriptAttributeContext extends ParserRuleContext {
		public ScriptAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptAttribute; }
	 
		public ScriptAttributeContext() { }
		public void copyFrom(ScriptAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptAttrWithValueContext extends ScriptAttributeContext {
		public TerminalNode SCRIPT_ATTR_NAME() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_NAME, 0); }
		public TerminalNode SCRIPT_ATTR_EQ() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_EQ, 0); }
		public ScriptAttrValueContext scriptAttrValue() {
			return getRuleContext(ScriptAttrValueContext.class,0);
		}
		public ScriptAttrWithValueContext(ScriptAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrWithValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptAttrWithoutValueContext extends ScriptAttributeContext {
		public TerminalNode SCRIPT_ATTR_NAME() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_NAME, 0); }
		public ScriptAttrWithoutValueContext(ScriptAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrWithoutValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrWithoutValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrWithoutValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptAttributeContext scriptAttribute() throws RecognitionException {
		ScriptAttributeContext _localctx = new ScriptAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scriptAttribute);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ScriptAttrWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(SCRIPT_ATTR_NAME);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCRIPT_ATTR_EQ) {
					{
					setState(218);
					match(SCRIPT_ATTR_EQ);
					setState(219);
					scriptAttrValue();
					}
				}

				}
				break;
			case 2:
				_localctx = new ScriptAttrWithoutValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(SCRIPT_ATTR_NAME);
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
	public static class ScriptAttrValueContext extends ParserRuleContext {
		public ScriptAttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptAttrValue; }
	 
		public ScriptAttrValueContext() { }
		public void copyFrom(ScriptAttrValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptAttrValueUnquotedContext extends ScriptAttrValueContext {
		public TerminalNode SCRIPT_ATTR_VALUE_UNQUOTED() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_UNQUOTED, 0); }
		public ScriptAttrValueUnquotedContext(ScriptAttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrValueUnquoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrValueUnquoted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrValueUnquoted(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptAttrValueSingleContext extends ScriptAttrValueContext {
		public TerminalNode SCRIPT_ATTR_VALUE_START_SINGLE() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_START_SINGLE, 0); }
		public TerminalNode SCRIPT_ATTR_VALUE_END_SINGLE() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_END_SINGLE, 0); }
		public List<ScriptAttrValueContentSingleContext> scriptAttrValueContentSingle() {
			return getRuleContexts(ScriptAttrValueContentSingleContext.class);
		}
		public ScriptAttrValueContentSingleContext scriptAttrValueContentSingle(int i) {
			return getRuleContext(ScriptAttrValueContentSingleContext.class,i);
		}
		public ScriptAttrValueSingleContext(ScriptAttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrValueSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrValueSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrValueSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptAttrValueDoubleContext extends ScriptAttrValueContext {
		public TerminalNode SCRIPT_ATTR_VALUE_START() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_START, 0); }
		public TerminalNode SCRIPT_ATTR_VALUE_END() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_END, 0); }
		public List<ScriptAttrValueContentContext> scriptAttrValueContent() {
			return getRuleContexts(ScriptAttrValueContentContext.class);
		}
		public ScriptAttrValueContentContext scriptAttrValueContent(int i) {
			return getRuleContext(ScriptAttrValueContentContext.class,i);
		}
		public ScriptAttrValueDoubleContext(ScriptAttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrValueDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrValueDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrValueDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptAttrValueContext scriptAttrValue() throws RecognitionException {
		ScriptAttrValueContext _localctx = new ScriptAttrValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scriptAttrValue);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPT_ATTR_VALUE_START:
				_localctx = new ScriptAttrValueDoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(SCRIPT_ATTR_VALUE_START);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) {
					{
					{
					setState(226);
					scriptAttrValueContent();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(SCRIPT_ATTR_VALUE_END);
				}
				break;
			case SCRIPT_ATTR_VALUE_START_SINGLE:
				_localctx = new ScriptAttrValueSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(SCRIPT_ATTR_VALUE_START_SINGLE);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162788864L) != 0)) {
					{
					{
					setState(234);
					scriptAttrValueContentSingle();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(SCRIPT_ATTR_VALUE_END_SINGLE);
				}
				break;
			case SCRIPT_ATTR_VALUE_UNQUOTED:
				_localctx = new ScriptAttrValueUnquotedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(SCRIPT_ATTR_VALUE_UNQUOTED);
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
	public static class ScriptAttrValueContentContext extends ParserRuleContext {
		public TerminalNode SCRIPT_ATTR_VALUE_TEXT() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_TEXT, 0); }
		public TerminalNode SCRIPT_ATTR_VALUE_OPEN_EXPR() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_OPEN_EXPR, 0); }
		public TerminalNode EXPR_CONTENT() { return getToken(HtmlJinjaParser.EXPR_CONTENT, 0); }
		public TerminalNode CLOSE_EXPR() { return getToken(HtmlJinjaParser.CLOSE_EXPR, 0); }
		public TerminalNode SCRIPT_ATTR_VALUE_OPEN_STMT() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_OPEN_STMT, 0); }
		public TerminalNode STMT_CONTENT() { return getToken(HtmlJinjaParser.STMT_CONTENT, 0); }
		public TerminalNode CLOSE_STMT() { return getToken(HtmlJinjaParser.CLOSE_STMT, 0); }
		public ScriptAttrValueContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptAttrValueContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrValueContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrValueContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrValueContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptAttrValueContentContext scriptAttrValueContent() throws RecognitionException {
		ScriptAttrValueContentContext _localctx = new ScriptAttrValueContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scriptAttrValueContent);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPT_ATTR_VALUE_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(SCRIPT_ATTR_VALUE_TEXT);
				}
				break;
			case SCRIPT_ATTR_VALUE_OPEN_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(SCRIPT_ATTR_VALUE_OPEN_EXPR);
				setState(246);
				match(EXPR_CONTENT);
				setState(247);
				match(CLOSE_EXPR);
				}
				break;
			case SCRIPT_ATTR_VALUE_OPEN_STMT:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(SCRIPT_ATTR_VALUE_OPEN_STMT);
				setState(249);
				match(STMT_CONTENT);
				setState(250);
				match(CLOSE_STMT);
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
	public static class ScriptAttrValueContentSingleContext extends ParserRuleContext {
		public TerminalNode SCRIPT_ATTR_VALUE_TEXT_SINGLE() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_TEXT_SINGLE, 0); }
		public TerminalNode SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE, 0); }
		public TerminalNode EXPR_CONTENT() { return getToken(HtmlJinjaParser.EXPR_CONTENT, 0); }
		public TerminalNode CLOSE_EXPR() { return getToken(HtmlJinjaParser.CLOSE_EXPR, 0); }
		public TerminalNode SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE() { return getToken(HtmlJinjaParser.SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE, 0); }
		public TerminalNode STMT_CONTENT() { return getToken(HtmlJinjaParser.STMT_CONTENT, 0); }
		public TerminalNode CLOSE_STMT() { return getToken(HtmlJinjaParser.CLOSE_STMT, 0); }
		public ScriptAttrValueContentSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptAttrValueContentSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptAttrValueContentSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptAttrValueContentSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptAttrValueContentSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptAttrValueContentSingleContext scriptAttrValueContentSingle() throws RecognitionException {
		ScriptAttrValueContentSingleContext _localctx = new ScriptAttrValueContentSingleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scriptAttrValueContentSingle);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPT_ATTR_VALUE_TEXT_SINGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(SCRIPT_ATTR_VALUE_TEXT_SINGLE);
				}
				break;
			case SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE);
				setState(255);
				match(EXPR_CONTENT);
				setState(256);
				match(CLOSE_EXPR);
				}
				break;
			case SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE);
				setState(258);
				match(STMT_CONTENT);
				setState(259);
				match(CLOSE_STMT);
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
	public static class StyleAttributeContext extends ParserRuleContext {
		public StyleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttribute; }
	 
		public StyleAttributeContext() { }
		public void copyFrom(StyleAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttrWithoutValueContext extends StyleAttributeContext {
		public TerminalNode STYLE_ATTR_NAME() { return getToken(HtmlJinjaParser.STYLE_ATTR_NAME, 0); }
		public StyleAttrWithoutValueContext(StyleAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrWithoutValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrWithoutValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrWithoutValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttrWithValueContext extends StyleAttributeContext {
		public TerminalNode STYLE_ATTR_NAME() { return getToken(HtmlJinjaParser.STYLE_ATTR_NAME, 0); }
		public TerminalNode STYLE_ATTR_EQ() { return getToken(HtmlJinjaParser.STYLE_ATTR_EQ, 0); }
		public StyleAttrValueContext styleAttrValue() {
			return getRuleContext(StyleAttrValueContext.class,0);
		}
		public StyleAttrWithValueContext(StyleAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributeContext styleAttribute() throws RecognitionException {
		StyleAttributeContext _localctx = new StyleAttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_styleAttribute);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new StyleAttrWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(STYLE_ATTR_NAME);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STYLE_ATTR_EQ) {
					{
					setState(263);
					match(STYLE_ATTR_EQ);
					setState(264);
					styleAttrValue();
					}
				}

				}
				break;
			case 2:
				_localctx = new StyleAttrWithoutValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(STYLE_ATTR_NAME);
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
	public static class StyleAttrValueContext extends ParserRuleContext {
		public StyleAttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttrValue; }
	 
		public StyleAttrValueContext() { }
		public void copyFrom(StyleAttrValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttrValueDoubleContext extends StyleAttrValueContext {
		public TerminalNode STYLE_ATTR_VALUE_START() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_START, 0); }
		public TerminalNode STYLE_ATTR_VALUE_END() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_END, 0); }
		public List<StyleAttrValueContentContext> styleAttrValueContent() {
			return getRuleContexts(StyleAttrValueContentContext.class);
		}
		public StyleAttrValueContentContext styleAttrValueContent(int i) {
			return getRuleContext(StyleAttrValueContentContext.class,i);
		}
		public StyleAttrValueDoubleContext(StyleAttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrValueDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrValueDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrValueDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttrValueSingleContext extends StyleAttrValueContext {
		public TerminalNode STYLE_ATTR_VALUE_START_SINGLE() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_START_SINGLE, 0); }
		public TerminalNode STYLE_ATTR_VALUE_END_SINGLE() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_END_SINGLE, 0); }
		public List<StyleAttrValueContentSingleContext> styleAttrValueContentSingle() {
			return getRuleContexts(StyleAttrValueContentSingleContext.class);
		}
		public StyleAttrValueContentSingleContext styleAttrValueContentSingle(int i) {
			return getRuleContext(StyleAttrValueContentSingleContext.class,i);
		}
		public StyleAttrValueSingleContext(StyleAttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrValueSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrValueSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrValueSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttrValueUnquotedContext extends StyleAttrValueContext {
		public TerminalNode STYLE_ATTR_VALUE_UNQUOTED() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_UNQUOTED, 0); }
		public StyleAttrValueUnquotedContext(StyleAttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrValueUnquoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrValueUnquoted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrValueUnquoted(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttrValueContext styleAttrValue() throws RecognitionException {
		StyleAttrValueContext _localctx = new StyleAttrValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_styleAttrValue);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_ATTR_VALUE_START:
				_localctx = new StyleAttrValueDoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(STYLE_ATTR_VALUE_START);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009213693952L) != 0)) {
					{
					{
					setState(271);
					styleAttrValueContent();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(STYLE_ATTR_VALUE_END);
				}
				break;
			case STYLE_ATTR_VALUE_START_SINGLE:
				_localctx = new StyleAttrValueSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(STYLE_ATTR_VALUE_START_SINGLE);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7L) != 0)) {
					{
					{
					setState(279);
					styleAttrValueContentSingle();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(STYLE_ATTR_VALUE_END_SINGLE);
				}
				break;
			case STYLE_ATTR_VALUE_UNQUOTED:
				_localctx = new StyleAttrValueUnquotedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(STYLE_ATTR_VALUE_UNQUOTED);
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
	public static class StyleAttrValueContentContext extends ParserRuleContext {
		public TerminalNode STYLE_ATTR_VALUE_TEXT() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_TEXT, 0); }
		public TerminalNode STYLE_ATTR_VALUE_OPEN_EXPR() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_OPEN_EXPR, 0); }
		public TerminalNode EXPR_CONTENT() { return getToken(HtmlJinjaParser.EXPR_CONTENT, 0); }
		public TerminalNode CLOSE_EXPR() { return getToken(HtmlJinjaParser.CLOSE_EXPR, 0); }
		public TerminalNode STYLE_ATTR_VALUE_OPEN_STMT() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_OPEN_STMT, 0); }
		public TerminalNode STMT_CONTENT() { return getToken(HtmlJinjaParser.STMT_CONTENT, 0); }
		public TerminalNode CLOSE_STMT() { return getToken(HtmlJinjaParser.CLOSE_STMT, 0); }
		public StyleAttrValueContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttrValueContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrValueContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrValueContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrValueContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttrValueContentContext styleAttrValueContent() throws RecognitionException {
		StyleAttrValueContentContext _localctx = new StyleAttrValueContentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_styleAttrValueContent);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_ATTR_VALUE_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(STYLE_ATTR_VALUE_TEXT);
				}
				break;
			case STYLE_ATTR_VALUE_OPEN_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(STYLE_ATTR_VALUE_OPEN_EXPR);
				setState(291);
				match(EXPR_CONTENT);
				setState(292);
				match(CLOSE_EXPR);
				}
				break;
			case STYLE_ATTR_VALUE_OPEN_STMT:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(STYLE_ATTR_VALUE_OPEN_STMT);
				setState(294);
				match(STMT_CONTENT);
				setState(295);
				match(CLOSE_STMT);
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
	public static class StyleAttrValueContentSingleContext extends ParserRuleContext {
		public TerminalNode STYLE_ATTR_VALUE_TEXT_SINGLE() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_TEXT_SINGLE, 0); }
		public TerminalNode STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE, 0); }
		public TerminalNode EXPR_CONTENT() { return getToken(HtmlJinjaParser.EXPR_CONTENT, 0); }
		public TerminalNode CLOSE_EXPR() { return getToken(HtmlJinjaParser.CLOSE_EXPR, 0); }
		public TerminalNode STYLE_ATTR_VALUE_OPEN_STMT_SINGLE() { return getToken(HtmlJinjaParser.STYLE_ATTR_VALUE_OPEN_STMT_SINGLE, 0); }
		public TerminalNode STMT_CONTENT() { return getToken(HtmlJinjaParser.STMT_CONTENT, 0); }
		public TerminalNode CLOSE_STMT() { return getToken(HtmlJinjaParser.CLOSE_STMT, 0); }
		public StyleAttrValueContentSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttrValueContentSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyleAttrValueContentSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyleAttrValueContentSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyleAttrValueContentSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttrValueContentSingleContext styleAttrValueContentSingle() throws RecognitionException {
		StyleAttrValueContentSingleContext _localctx = new StyleAttrValueContentSingleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_styleAttrValueContentSingle);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_ATTR_VALUE_TEXT_SINGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(STYLE_ATTR_VALUE_TEXT_SINGLE);
				}
				break;
			case STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE);
				setState(300);
				match(EXPR_CONTENT);
				setState(301);
				match(CLOSE_EXPR);
				}
				break;
			case STYLE_ATTR_VALUE_OPEN_STMT_SINGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(STYLE_ATTR_VALUE_OPEN_STMT_SINGLE);
				setState(303);
				match(STMT_CONTENT);
				setState(304);
				match(CLOSE_STMT);
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
	public static class HtmlTextContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlJinjaParser.HTML_TEXT, 0); }
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htmlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(HTML_TEXT);
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
	public static class JinjaExprContext extends ParserRuleContext {
		public TerminalNode OPEN_EXPR() { return getToken(HtmlJinjaParser.OPEN_EXPR, 0); }
		public TerminalNode EXPR_CONTENT() { return getToken(HtmlJinjaParser.EXPR_CONTENT, 0); }
		public TerminalNode CLOSE_EXPR() { return getToken(HtmlJinjaParser.CLOSE_EXPR, 0); }
		public TerminalNode TAG_OPEN_EXPR() { return getToken(HtmlJinjaParser.TAG_OPEN_EXPR, 0); }
		public TerminalNode SCRIPT_OPEN_EXPR() { return getToken(HtmlJinjaParser.SCRIPT_OPEN_EXPR, 0); }
		public TerminalNode STYLE_OPEN_EXPR() { return getToken(HtmlJinjaParser.STYLE_OPEN_EXPR, 0); }
		public TerminalNode SCRIPT_JINJA_EXPR() { return getToken(HtmlJinjaParser.SCRIPT_JINJA_EXPR, 0); }
		public TerminalNode STYLE_JINJA_EXPR() { return getToken(HtmlJinjaParser.STYLE_JINJA_EXPR, 0); }
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jinjaExpr);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_EXPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(OPEN_EXPR);
				setState(310);
				match(EXPR_CONTENT);
				setState(311);
				match(CLOSE_EXPR);
				}
				break;
			case TAG_OPEN_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(TAG_OPEN_EXPR);
				setState(313);
				match(EXPR_CONTENT);
				setState(314);
				match(CLOSE_EXPR);
				}
				break;
			case SCRIPT_OPEN_EXPR:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(SCRIPT_OPEN_EXPR);
				setState(316);
				match(EXPR_CONTENT);
				setState(317);
				match(CLOSE_EXPR);
				}
				break;
			case STYLE_OPEN_EXPR:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(STYLE_OPEN_EXPR);
				setState(319);
				match(EXPR_CONTENT);
				setState(320);
				match(CLOSE_EXPR);
				}
				break;
			case SCRIPT_JINJA_EXPR:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(SCRIPT_JINJA_EXPR);
				setState(322);
				match(EXPR_CONTENT);
				setState(323);
				match(CLOSE_EXPR);
				}
				break;
			case STYLE_JINJA_EXPR:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				match(STYLE_JINJA_EXPR);
				setState(325);
				match(EXPR_CONTENT);
				setState(326);
				match(CLOSE_EXPR);
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
	public static class JinjaStmtContext extends ParserRuleContext {
		public TerminalNode OPEN_STMT() { return getToken(HtmlJinjaParser.OPEN_STMT, 0); }
		public TerminalNode STMT_CONTENT() { return getToken(HtmlJinjaParser.STMT_CONTENT, 0); }
		public TerminalNode CLOSE_STMT() { return getToken(HtmlJinjaParser.CLOSE_STMT, 0); }
		public TerminalNode TAG_OPEN_STMT() { return getToken(HtmlJinjaParser.TAG_OPEN_STMT, 0); }
		public TerminalNode SCRIPT_OPEN_STMT() { return getToken(HtmlJinjaParser.SCRIPT_OPEN_STMT, 0); }
		public TerminalNode STYLE_OPEN_STMT() { return getToken(HtmlJinjaParser.STYLE_OPEN_STMT, 0); }
		public TerminalNode SCRIPT_JINJA_STMT() { return getToken(HtmlJinjaParser.SCRIPT_JINJA_STMT, 0); }
		public TerminalNode STYLE_JINJA_STMT() { return getToken(HtmlJinjaParser.STYLE_JINJA_STMT, 0); }
		public JinjaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStmtContext jinjaStmt() throws RecognitionException {
		JinjaStmtContext _localctx = new JinjaStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jinjaStmt);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_STMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(OPEN_STMT);
				setState(330);
				match(STMT_CONTENT);
				setState(331);
				match(CLOSE_STMT);
				}
				break;
			case TAG_OPEN_STMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(TAG_OPEN_STMT);
				setState(333);
				match(STMT_CONTENT);
				setState(334);
				match(CLOSE_STMT);
				}
				break;
			case SCRIPT_OPEN_STMT:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(SCRIPT_OPEN_STMT);
				setState(336);
				match(STMT_CONTENT);
				setState(337);
				match(CLOSE_STMT);
				}
				break;
			case STYLE_OPEN_STMT:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				match(STYLE_OPEN_STMT);
				setState(339);
				match(STMT_CONTENT);
				setState(340);
				match(CLOSE_STMT);
				}
				break;
			case SCRIPT_JINJA_STMT:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(SCRIPT_JINJA_STMT);
				setState(342);
				match(STMT_CONTENT);
				setState(343);
				match(CLOSE_STMT);
				}
				break;
			case STYLE_JINJA_STMT:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				match(STYLE_JINJA_STMT);
				setState(345);
				match(STMT_CONTENT);
				setState(346);
				match(CLOSE_STMT);
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
	public static class JinjaCommentContext extends ParserRuleContext {
		public TerminalNode OPEN_COMMENT() { return getToken(HtmlJinjaParser.OPEN_COMMENT, 0); }
		public TerminalNode COMMENT_CONTENT() { return getToken(HtmlJinjaParser.COMMENT_CONTENT, 0); }
		public TerminalNode CLOSE_COMMENT() { return getToken(HtmlJinjaParser.CLOSE_COMMENT, 0); }
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jinjaComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OPEN_COMMENT);
			setState(350);
			match(COMMENT_CONTENT);
			setState(351);
			match(CLOSE_COMMENT);
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
		"\u0004\u0001S\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"?\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003Z\b\u0003\n\u0003\f\u0003]\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"d\b\u0003\n\u0003\f\u0003g\t\u0003\u0001\u0003\u0003\u0003j\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b"+
		"\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0081\b\u0005\n\u0005\f\u0005\u0084\t\u0005"+
		"\u0001\u0005\u0003\u0005\u0087\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u008e\b\u0006\n\u0006\f\u0006\u0091"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0098\b\u0006\n\u0006\f\u0006\u009b\t\u0006\u0001\u0006\u0003\u0006"+
		"\u009e\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00a2\b\u0007\n\u0007"+
		"\f\u0007\u00a5\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00ae\b\b\n\b\f\b\u00b1\t\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c3"+
		"\b\u000b\n\u000b\f\u000b\u00c6\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u00cf\b\r\n\r\f\r\u00d2\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d8\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00dd\b\u000f\u0001\u000f\u0003\u000f"+
		"\u00e0\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u00e4\b\u0010\n\u0010"+
		"\f\u0010\u00e7\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00ec\b\u0010\n\u0010\f\u0010\u00ef\t\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00f3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00fc\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0105\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010a"+
		"\b\u0013\u0001\u0013\u0003\u0013\u010d\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0111\b\u0014\n\u0014\f\u0014\u0114\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0119\b\u0014\n\u0014\f\u0014\u011c\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0120\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0129\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0132\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0148\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u015c\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.024\u0000\u0001\u0001\u0000\u0011\u0012\u0193\u0000>\u0001\u0000"+
		"\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000"+
		"\u0006i\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\n\u0086\u0001"+
		"\u0000\u0000\u0000\f\u009d\u0001\u0000\u0000\u0000\u000e\u009f\u0001\u0000"+
		"\u0000\u0000\u0010\u00af\u0001\u0000\u0000\u0000\u0012\u00b2\u0001\u0000"+
		"\u0000\u0000\u0014\u00b4\u0001\u0000\u0000\u0000\u0016\u00c4\u0001\u0000"+
		"\u0000\u0000\u0018\u00c7\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000"+
		"\u0000\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000"+
		"\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000\"\u00fb\u0001\u0000\u0000"+
		"\u0000$\u0104\u0001\u0000\u0000\u0000&\u010c\u0001\u0000\u0000\u0000("+
		"\u011f\u0001\u0000\u0000\u0000*\u0128\u0001\u0000\u0000\u0000,\u0131\u0001"+
		"\u0000\u0000\u0000.\u0133\u0001\u0000\u0000\u00000\u0147\u0001\u0000\u0000"+
		"\u00002\u015b\u0001\u0000\u0000\u00004\u015d\u0001\u0000\u0000\u00006"+
		"8\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0005\u0000\u0000\u0001=?\u0005"+
		"\u0000\u0000\u0001>9\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?\u0001\u0001\u0000\u0000\u0000@F\u00030\u0018\u0000AF\u00032\u0019\u0000"+
		"BF\u00034\u001a\u0000CF\u0003\u0004\u0002\u0000DF\u0003.\u0017\u0000E"+
		"@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0003\u0001"+
		"\u0000\u0000\u0000GS\u0003\f\u0006\u0000HI\u0003\u0006\u0003\u0000IJ\u0003"+
		"\u001a\r\u0000JK\u0003\b\u0004\u0000KS\u0001\u0000\u0000\u0000LM\u0003"+
		"\u0006\u0003\u0000MN\u0003\b\u0004\u0000NS\u0001\u0000\u0000\u0000OS\u0003"+
		"\n\u0005\u0000PS\u0003\u000e\u0007\u0000QS\u0003\u0014\n\u0000RG\u0001"+
		"\u0000\u0000\u0000RH\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S\u0005\u0001\u0000\u0000\u0000TU\u0005\r\u0000\u0000U[\u0005\u0011"+
		"\u0000\u0000VZ\u0003\u001c\u000e\u0000WZ\u00030\u0018\u0000XZ\u00032\u0019"+
		"\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^j\u0005\u0017\u0000\u0000_e\u0005\u000b\u0000\u0000`d\u0003\u001c\u000e"+
		"\u0000ad\u00030\u0018\u0000bd\u00032\u0019\u0000c`\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0005\u0017\u0000\u0000iT\u0001"+
		"\u0000\u0000\u0000i_\u0001\u0000\u0000\u0000j\u0007\u0001\u0000\u0000"+
		"\u0000km\u0005\f\u0000\u0000ln\u0005\u0011\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\u0017"+
		"\u0000\u0000p\t\u0001\u0000\u0000\u0000qr\u0005\r\u0000\u0000rx\u0005"+
		"\u0011\u0000\u0000sw\u0003\u001c\u000e\u0000tw\u00030\u0018\u0000uw\u0003"+
		"2\u0019\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{\u0087\u0005\u0018\u0000\u0000|\u0082\u0005\u000b\u0000\u0000}"+
		"\u0081\u0003\u001c\u000e\u0000~\u0081\u00030\u0018\u0000\u007f\u0081\u0003"+
		"2\u0019\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0005\u0018\u0000\u0000\u0086q\u0001\u0000\u0000\u0000"+
		"\u0086|\u0001\u0000\u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\r\u0000\u0000\u0089\u008f\u0005\u0011\u0000\u0000\u008a\u008e"+
		"\u0003\u001c\u000e\u0000\u008b\u008e\u00030\u0018\u0000\u008c\u008e\u0003"+
		"2\u0019\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u009e\u0005\u0017\u0000\u0000\u0093\u0099\u0005\u000b"+
		"\u0000\u0000\u0094\u0098\u0003\u001c\u000e\u0000\u0095\u0098\u00030\u0018"+
		"\u0000\u0096\u0098\u00032\u0019\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u0017\u0000\u0000"+
		"\u009d\u0088\u0001\u0000\u0000\u0000\u009d\u0093\u0001\u0000\u0000\u0000"+
		"\u009e\r\u0001\u0000\u0000\u0000\u009f\u00a3\u0005\t\u0000\u0000\u00a0"+
		"\u00a2\u0003\u001e\u000f\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\"\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0010\b\u0000\u00a8\u00a9\u0005/\u0000\u0000\u00a9\u000f\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ae\u0003\u0012\t\u0000\u00ab\u00ae\u00030"+
		"\u0018\u0000\u00ac\u00ae\u00032\u0019\u0000\u00ad\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0011\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u00050\u0000\u0000"+
		"\u00b3\u0013\u0001\u0000\u0000\u0000\u00b4\u00b8\u0005\n\u0000\u0000\u00b5"+
		"\u00b7\u0003&\u0013\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005:\u0000\u0000\u00bc\u00bd\u0003"+
		"\u0016\u000b\u0000\u00bd\u00be\u0005G\u0000\u0000\u00be\u0015\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c3\u0003\u0018\f\u0000\u00c0\u00c3\u00030\u0018"+
		"\u0000\u00c1\u00c3\u00032\u0019\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005H\u0000\u0000\u00c8"+
		"\u0019\u0001\u0000\u0000\u0000\u00c9\u00cf\u0003\u0004\u0002\u0000\u00ca"+
		"\u00cf\u00030\u0018\u0000\u00cb\u00cf\u00032\u0019\u0000\u00cc\u00cf\u0003"+
		"4\u001a\u0000\u00cd\u00cf\u0003.\u0017\u0000\u00ce\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u001b\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0013\u0000\u0000\u00d5\u00d8\u0005\u0014\u0000"+
		"\u0000\u00d6\u00d8\u0007\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0005\u001b\u0000\u0000\u00da\u00db\u0005\u001d\u0000"+
		"\u0000\u00db\u00dd\u0003 \u0010\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000"+
		"\u00de\u00e0\u0005\u001b\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000"+
		"\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u001f\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e5\u0005\u001e\u0000\u0000\u00e2\u00e4\u0003\"\u0011\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00f3\u0005$\u0000\u0000\u00e9\u00ed\u0005\u001f\u0000\u0000\u00ea\u00ec"+
		"\u0003$\u0012\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0005(\u0000\u0000\u00f1\u00f3\u0005 \u0000"+
		"\u0000\u00f2\u00e1\u0001\u0000\u0000\u0000\u00f2\u00e9\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3!\u0001\u0000\u0000\u0000"+
		"\u00f4\u00fc\u0005\'\u0000\u0000\u00f5\u00f6\u0005%\u0000\u0000\u00f6"+
		"\u00f7\u0005J\u0000\u0000\u00f7\u00fc\u0005K\u0000\u0000\u00f8\u00f9\u0005"+
		"&\u0000\u0000\u00f9\u00fa\u0005N\u0000\u0000\u00fa\u00fc\u0005M\u0000"+
		"\u0000\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fc#\u0001\u0000\u0000\u0000"+
		"\u00fd\u0105\u0005+\u0000\u0000\u00fe\u00ff\u0005)\u0000\u0000\u00ff\u0100"+
		"\u0005J\u0000\u0000\u0100\u0105\u0005K\u0000\u0000\u0101\u0102\u0005*"+
		"\u0000\u0000\u0102\u0103\u0005N\u0000\u0000\u0103\u0105\u0005M\u0000\u0000"+
		"\u0104\u00fd\u0001\u0000\u0000\u0000\u0104\u00fe\u0001\u0000\u0000\u0000"+
		"\u0104\u0101\u0001\u0000\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u00053\u0000\u0000\u0107\u0108\u00055\u0000\u0000\u0108\u010a\u0003"+
		"(\u0014\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u010d\u00053\u0000"+
		"\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\'\u0001\u0000\u0000\u0000\u010e\u0112\u00056\u0000\u0000"+
		"\u010f\u0111\u0003*\u0015\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u0120\u0005<\u0000\u0000\u0116\u011a"+
		"\u00057\u0000\u0000\u0117\u0119\u0003,\u0016\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0120\u0005@\u0000"+
		"\u0000\u011e\u0120\u00058\u0000\u0000\u011f\u010e\u0001\u0000\u0000\u0000"+
		"\u011f\u0116\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120)\u0001\u0000\u0000\u0000\u0121\u0129\u0005?\u0000\u0000\u0122\u0123"+
		"\u0005=\u0000\u0000\u0123\u0124\u0005J\u0000\u0000\u0124\u0129\u0005K"+
		"\u0000\u0000\u0125\u0126\u0005>\u0000\u0000\u0126\u0127\u0005N\u0000\u0000"+
		"\u0127\u0129\u0005M\u0000\u0000\u0128\u0121\u0001\u0000\u0000\u0000\u0128"+
		"\u0122\u0001\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0129"+
		"+\u0001\u0000\u0000\u0000\u012a\u0132\u0005C\u0000\u0000\u012b\u012c\u0005"+
		"A\u0000\u0000\u012c\u012d\u0005J\u0000\u0000\u012d\u0132\u0005K\u0000"+
		"\u0000\u012e\u012f\u0005B\u0000\u0000\u012f\u0130\u0005N\u0000\u0000\u0130"+
		"\u0132\u0005M\u0000\u0000\u0131\u012a\u0001\u0000\u0000\u0000\u0131\u012b"+
		"\u0001\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0132-\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005\u000e\u0000\u0000\u0134/\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005\u0006\u0000\u0000\u0136\u0137\u0005J\u0000"+
		"\u0000\u0137\u0148\u0005K\u0000\u0000\u0138\u0139\u0005\u000f\u0000\u0000"+
		"\u0139\u013a\u0005J\u0000\u0000\u013a\u0148\u0005K\u0000\u0000\u013b\u013c"+
		"\u0005\u0019\u0000\u0000\u013c\u013d\u0005J\u0000\u0000\u013d\u0148\u0005"+
		"K\u0000\u0000\u013e\u013f\u00051\u0000\u0000\u013f\u0140\u0005J\u0000"+
		"\u0000\u0140\u0148\u0005K\u0000\u0000\u0141\u0142\u0005,\u0000\u0000\u0142"+
		"\u0143\u0005J\u0000\u0000\u0143\u0148\u0005K\u0000\u0000\u0144\u0145\u0005"+
		"D\u0000\u0000\u0145\u0146\u0005J\u0000\u0000\u0146\u0148\u0005K\u0000"+
		"\u0000\u0147\u0135\u0001\u0000\u0000\u0000\u0147\u0138\u0001\u0000\u0000"+
		"\u0000\u0147\u013b\u0001\u0000\u0000\u0000\u0147\u013e\u0001\u0000\u0000"+
		"\u0000\u0147\u0141\u0001\u0000\u0000\u0000\u0147\u0144\u0001\u0000\u0000"+
		"\u0000\u01481\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0007\u0000\u0000"+
		"\u014a\u014b\u0005N\u0000\u0000\u014b\u015c\u0005M\u0000\u0000\u014c\u014d"+
		"\u0005\u0010\u0000\u0000\u014d\u014e\u0005N\u0000\u0000\u014e\u015c\u0005"+
		"M\u0000\u0000\u014f\u0150\u0005\u001a\u0000\u0000\u0150\u0151\u0005N\u0000"+
		"\u0000\u0151\u015c\u0005M\u0000\u0000\u0152\u0153\u00052\u0000\u0000\u0153"+
		"\u0154\u0005N\u0000\u0000\u0154\u015c\u0005M\u0000\u0000\u0155\u0156\u0005"+
		"-\u0000\u0000\u0156\u0157\u0005N\u0000\u0000\u0157\u015c\u0005M\u0000"+
		"\u0000\u0158\u0159\u0005E\u0000\u0000\u0159\u015a\u0005N\u0000\u0000\u015a"+
		"\u015c\u0005M\u0000\u0000\u015b\u0149\u0001\u0000\u0000\u0000\u015b\u014c"+
		"\u0001\u0000\u0000\u0000\u015b\u014f\u0001\u0000\u0000\u0000\u015b\u0152"+
		"\u0001\u0000\u0000\u0000\u015b\u0155\u0001\u0000\u0000\u0000\u015b\u0158"+
		"\u0001\u0000\u0000\u0000\u015c3\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"\b\u0000\u0000\u015e\u015f\u0005P\u0000\u0000\u015f\u0160\u0005Q\u0000"+
		"\u0000\u01605\u0001\u0000\u0000\u0000-9>ERY[ceimvx\u0080\u0082\u0086\u008d"+
		"\u008f\u0097\u0099\u009d\u00a3\u00ad\u00af\u00b8\u00c2\u00c4\u00ce\u00d0"+
		"\u00d7\u00dc\u00df\u00e5\u00ed\u00f2\u00fb\u0104\u0109\u010c\u0112\u011a"+
		"\u011f\u0128\u0131\u0147\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}