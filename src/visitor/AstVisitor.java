package visitor;

import ast.*;

public interface AstVisitor<T> {
    // HTML nodes
    T visitHtmlDocument(HtmlDocumentNode node);
    T visitHtmlTag(HtmlTagNode node);
    T visitAttribute(AttributeNode node);
    T visitHtmlText(HtmlTextNode node);
    T visitJinjaExpression(JinjaExpressionNode node);
    T visitJinjaStatement(JinjaStatementNode node);
    T visitJinjaComment(JinjaCommentNode node);
    T visitScriptTag(ScriptTagNode node);
    T visitStyleTag(StyleTagNode node);

    // CSS nodes
    T visitCssStylesheet(CssStylesheetNode node);
    T visitCssRule(CssRuleNode node);
    T visitCssSelector(CssSelectorNode node);
    T visitCssSimpleSelector(CssSimpleSelectorNode node);
    // Removed: visitCssTypeSelector, visitCssClassSelector, visitCssUniversalSelector
    //          visitCssCombinator, visitCssValuePart - these are now simplified/integrated
    T visitCssAttributeSelector(CssAttributeSelectorNode node);
    T visitCssPseudoSelector(CssPseudoSelectorNode node);
    T visitCssDeclaration(CssDeclarationNode node);
    T visitCssProperty(CssPropertyNode node);
    T visitCssValue(CssValueNode node);
    T visitCssAtRule(CssAtRuleNode node);

    @Deprecated
    default T visitCssTypeSelector(ast.CssTypeSelectorNode node) { return null; }
    @Deprecated
    default T visitCssClassSelector(ast.CssClassSelectorNode node) { return null; }
    @Deprecated
    default T visitCssUniversalSelector(ast.CssUniversalSelectorNode node) { return null; }
    @Deprecated
    default T visitCssCombinator(ast.CssCombinatorNode node) { return null; }
    @Deprecated
    default T visitCssValuePart(ast.CssValuePartNode node) { return null; }
}
