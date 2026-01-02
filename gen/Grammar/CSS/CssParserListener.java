// Generated from src/Grammar/CSS/CssParser.g4 by ANTLR 4.13.2
package Grammar.CSS;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(CssParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(CssParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelectorWithType}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorWithType(CssParser.SimpleSelectorWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelectorWithType}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorWithType(CssParser.SimpleSelectorWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelectorModifiersOnly}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorModifiersOnly(CssParser.SimpleSelectorModifiersOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelectorModifiersOnly}
	 * labeled alternative in {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorModifiersOnly(CssParser.SimpleSelectorModifiersOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 */
	void enterUniversal(CssParser.UniversalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 */
	void exitUniversal(CssParser.UniversalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(CssParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(CssParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribWithValue}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttribWithValue(CssParser.AttribWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribWithValue}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttribWithValue(CssParser.AttribWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribWithoutValue}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttribWithoutValue(CssParser.AttribWithoutValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribWithoutValue}
	 * labeled alternative in {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttribWithoutValue(CssParser.AttribWithoutValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClass}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClass}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(CssParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoElement}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoElement}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElement(CssParser.PseudoElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notPseudo}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterNotPseudo(CssParser.NotPseudoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notPseudo}
	 * labeled alternative in {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitNotPseudo(CssParser.NotPseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#pseudoExpr}.
	 * @param ctx the parse tree
	 */
	void enterPseudoExpr(CssParser.PseudoExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#pseudoExpr}.
	 * @param ctx the parse tree
	 */
	void exitPseudoExpr(CssParser.PseudoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterChildCombinator(CssParser.ChildCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitChildCombinator(CssParser.ChildCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adjacentSiblingCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterAdjacentSiblingCombinator(CssParser.AdjacentSiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adjacentSiblingCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitAdjacentSiblingCombinator(CssParser.AdjacentSiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalSiblingCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterGeneralSiblingCombinator(CssParser.GeneralSiblingCombinatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalSiblingCombinator}
	 * labeled alternative in {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitGeneralSiblingCombinator(CssParser.GeneralSiblingCombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identProperty}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterIdentProperty(CssParser.IdentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identProperty}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitIdentProperty(CssParser.IdentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varProperty}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterVarProperty(CssParser.VarPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varProperty}
	 * labeled alternative in {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitVarProperty(CssParser.VarPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CssParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CssParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterIdentValue(CssParser.IdentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitIdentValue(CssParser.IdentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(CssParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(CssParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(CssParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(CssParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(CssParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(CssParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterHashValue(CssParser.HashValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitHashValue(CssParser.HashValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importantValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterImportantValue(CssParser.ImportantValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importantValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitImportantValue(CssParser.ImportantValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code urlValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterUrlValue(CssParser.UrlValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urlValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitUrlValue(CssParser.UrlValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterParenValue(CssParser.ParenValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitParenValue(CssParser.ParenValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterCommaValue(CssParser.CommaValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitCommaValue(CssParser.CommaValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterDotValue(CssParser.DotValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitDotValue(CssParser.DotValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colonValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterColonValue(CssParser.ColonValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colonValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitColonValue(CssParser.ColonValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterSlashValue(CssParser.SlashValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitSlashValue(CssParser.SlashValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterGreaterValue(CssParser.GreaterValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitGreaterValue(CssParser.GreaterValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterPlusValue(CssParser.PlusValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitPlusValue(CssParser.PlusValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterMinusValue(CssParser.MinusValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitMinusValue(CssParser.MinusValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterStarValue(CssParser.StarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitStarValue(CssParser.StarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tildeValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterTildeValue(CssParser.TildeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tildeValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitTildeValue(CssParser.TildeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterEqualsValue(CssParser.EqualsValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitEqualsValue(CssParser.EqualsValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(CssParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionValue}
	 * labeled alternative in {@link CssParser#valuePart}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(CssParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleWithBlock}
	 * labeled alternative in {@link CssParser#atRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleWithBlock(CssParser.AtRuleWithBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleWithBlock}
	 * labeled alternative in {@link CssParser#atRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleWithBlock(CssParser.AtRuleWithBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleWithoutBlock}
	 * labeled alternative in {@link CssParser#atRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleWithoutBlock(CssParser.AtRuleWithoutBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleWithoutBlock}
	 * labeled alternative in {@link CssParser#atRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleWithoutBlock(CssParser.AtRuleWithoutBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleIdent}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleIdent(CssParser.AtRuleIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleIdent}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleIdent(CssParser.AtRuleIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleVar}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleVar(CssParser.AtRuleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleVar}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleVar(CssParser.AtRuleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleString}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleString(CssParser.AtRuleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleString}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleString(CssParser.AtRuleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleNumber}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleNumber(CssParser.AtRuleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleNumber}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleNumber(CssParser.AtRuleNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleHash}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleHash(CssParser.AtRuleHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleHash}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleHash(CssParser.AtRuleHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleComma}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleComma(CssParser.AtRuleCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleComma}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleComma(CssParser.AtRuleCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleLParen}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleLParen(CssParser.AtRuleLParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleLParen}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleLParen(CssParser.AtRuleLParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleRParen}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleRParen(CssParser.AtRuleRParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleRParen}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleRParen(CssParser.AtRuleRParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleColon}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleColon(CssParser.AtRuleColonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleColon}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleColon(CssParser.AtRuleColonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleUrl}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleUrl(CssParser.AtRuleUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleUrl}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleUrl(CssParser.AtRuleUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleGreater}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleGreater(CssParser.AtRuleGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleGreater}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleGreater(CssParser.AtRuleGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRulePlus}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRulePlus(CssParser.AtRulePlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRulePlus}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRulePlus(CssParser.AtRulePlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleTilde}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleTilde(CssParser.AtRuleTildeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleTilde}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleTilde(CssParser.AtRuleTildeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleSlash}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleSlash(CssParser.AtRuleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleSlash}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleSlash(CssParser.AtRuleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleDot}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleDot(CssParser.AtRuleDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleDot}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleDot(CssParser.AtRuleDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleEquals}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleEquals(CssParser.AtRuleEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleEquals}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleEquals(CssParser.AtRuleEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleMinus}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleMinus(CssParser.AtRuleMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleMinus}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleMinus(CssParser.AtRuleMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleStar}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleStar(CssParser.AtRuleStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleStar}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleStar(CssParser.AtRuleStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleAnd}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleAnd(CssParser.AtRuleAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleAnd}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleAnd(CssParser.AtRuleAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atRuleQuestion}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void enterAtRuleQuestion(CssParser.AtRuleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atRuleQuestion}
	 * labeled alternative in {@link CssParser#atRuleValue}.
	 * @param ctx the parse tree
	 */
	void exitAtRuleQuestion(CssParser.AtRuleQuestionContext ctx);
}