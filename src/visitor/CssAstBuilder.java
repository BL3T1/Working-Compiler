package visitor;

import ast.*;
import Grammar.CSS.CssParser;
import Grammar.CSS.CssParserBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;


public class CssAstBuilder extends CssParserBaseListener {
    private Stack<AstNode> nodeStack;
    private CssStylesheetNode stylesheet;

    public CssAstBuilder() {
        this.nodeStack = new Stack<>();
    }

    public CssStylesheetNode getStylesheet() {
        return stylesheet;
    }

    // Helper method to extract line number from parser context
    private int getLineNumber(org.antlr.v4.runtime.ParserRuleContext ctx) {
        if (ctx != null && ctx.getStart() != null) {
            return ctx.getStart().getLine();
        }
        return -1;
    }

    // Helper method to remove newlines from text content
    private String removeNewlines(String text) {
        if (text == null) {
            return null;
        }
        return text.replace("\n", "").replace("\r", "");
    }

    @Override
    public void enterStylesheet(CssParser.StylesheetContext ctx) {
        stylesheet = new CssStylesheetNode();
        stylesheet.setLineNumber(getLineNumber(ctx));
        nodeStack.push(stylesheet);
    }

    @Override
    public void exitStylesheet(CssParser.StylesheetContext ctx) {
        nodeStack.pop();
    }

    @Override
    public void enterRule(CssParser.RuleContext ctx) {
        CssRuleNode ruleNode = new CssRuleNode(null);
        ruleNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(ruleNode);
    }

    @Override
    public void exitRule(CssParser.RuleContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssRuleNode) {
            CssRuleNode ruleNode = (CssRuleNode) nodeStack.pop();
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssStylesheetNode) {
                ((CssStylesheetNode) nodeStack.peek()).addRule(ruleNode);
            } else if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssAtRuleNode) {
                ((CssAtRuleNode) nodeStack.peek()).addBodyNode(ruleNode);
            }
        }
    }

    @Override
    public void enterSelector(CssParser.SelectorContext ctx) {
        CssSelectorNode selectorNode = new CssSelectorNode();
        selectorNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(selectorNode);
    }

    @Override
    public void exitSelector(CssParser.SelectorContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSelectorNode) {
            CssSelectorNode selectorNode = (CssSelectorNode) nodeStack.pop();
            
            // Handle implicit descendant combinators
            // If we have more simpleSelectors than combinators, insert implicit descendant combinators (" ")
            int simpleSelectorCount = selectorNode.getSimpleSelectors().size();
            int combinatorCount = selectorNode.getCombinators().size();
            int expectedCombinators = simpleSelectorCount > 0 ? simpleSelectorCount - 1 : 0;
            
            if (combinatorCount < expectedCombinators) {
                java.util.List<String> orderedCombinators = new java.util.ArrayList<>();
                
                // For each gap between simpleSelectors, check if there's an explicit combinator
                // If not, insert an implicit descendant combinator
                for (int i = 0; i < expectedCombinators; i++) {
                    if (i < combinatorCount) {
                        // Use existing explicit combinator
                        orderedCombinators.add(selectorNode.getCombinators().get(i));
                    } else {
                        // Insert implicit descendant combinator
                        orderedCombinators.add(" ");
                    }
                }
                
                // Update combinators list
                selectorNode.getCombinators().clear();
                selectorNode.getCombinators().addAll(orderedCombinators);
            }
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssRuleNode) {
                ((CssRuleNode) nodeStack.peek()).setSelector(selectorNode);
            }
        }
    }

    @Override
    public void enterSimpleSelectorWithType(CssParser.SimpleSelectorWithTypeContext ctx) {
        CssSimpleSelectorNode simpleSelectorNode = new CssSimpleSelectorNode();
        simpleSelectorNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(simpleSelectorNode);
    }

    @Override
    public void exitSimpleSelectorWithType(CssParser.SimpleSelectorWithTypeContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            CssSimpleSelectorNode simpleSelectorNode = (CssSimpleSelectorNode) nodeStack.pop();
            
            // Handle type selector - check if present
            if (ctx.typeSelector() != null && ctx.typeSelector().IDENT() != null) {
                String elementName = ctx.typeSelector().IDENT().getText();
                simpleSelectorNode.setTypeSelector(elementName);
            }
            
            // Handle universal selector - check if present
            if (ctx.universal() != null) {
                simpleSelectorNode.setUniversalSelector(true);
            }
            
            // Handle IDs - can appear in this alternative
            if (ctx.HASH() != null && !ctx.HASH().isEmpty()) {
                for (TerminalNode hashNode : ctx.HASH()) {
                    String id = hashNode.getText().substring(1); // Remove #
                    simpleSelectorNode.addId(id);
                }
            }
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSelectorNode) {
                ((CssSelectorNode) nodeStack.peek()).addSimpleSelector(simpleSelectorNode);
            }
        }
    }

    @Override
    public void enterSimpleSelectorModifiersOnly(CssParser.SimpleSelectorModifiersOnlyContext ctx) {
        CssSimpleSelectorNode simpleSelectorNode = new CssSimpleSelectorNode();
        simpleSelectorNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(simpleSelectorNode);
    }

    @Override
    public void exitSimpleSelectorModifiersOnly(CssParser.SimpleSelectorModifiersOnlyContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            CssSimpleSelectorNode simpleSelectorNode = (CssSimpleSelectorNode) nodeStack.pop();
            
            // Handle IDs - can appear in this alternative
            if (ctx.HASH() != null && !ctx.HASH().isEmpty()) {
                for (TerminalNode hashNode : ctx.HASH()) {
                    String id = hashNode.getText().substring(1); // Remove #
                    simpleSelectorNode.addId(id);
                }
            }
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSelectorNode) {
                ((CssSelectorNode) nodeStack.peek()).addSimpleSelector(simpleSelectorNode);
            }
        }
    }

    @Override
    public void enterClass(CssParser.ClassContext ctx) {
        if (ctx.DOT() != null && ctx.IDENT() != null) {
            String className = ctx.IDENT().getText();
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
                ((CssSimpleSelectorNode) nodeStack.peek()).addClass(className);
            }
        }
    }

    @Override
    public void enterAttribWithValue(CssParser.AttribWithValueContext ctx) {
        // Skip intermediate rule - directly build attribute selector
        String attrName = ctx.IDENT(0) != null ? ctx.IDENT(0).getText() : "";
        String operator = null;
        String value = null;
        
        // Check for operator
        if (ctx.EQUALS() != null) {
            operator = "=";
        } else if (ctx.TILDE_EQUALS() != null) {
            operator = "~=";
        } else if (ctx.PIPE_EQUALS() != null) {
            operator = "|=";
        } else if (ctx.CARET_EQUALS() != null) {
            operator = "^=";
        } else if (ctx.DOLLAR_EQUALS() != null) {
            operator = "$=";
        } else if (ctx.STAR_EQUALS() != null) {
            operator = "*=";
        }
        
        // Get value
        if (ctx.IDENT().size() > 1) {
            value = ctx.IDENT(1).getText();
        } else if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
        }
        
        CssAttributeSelectorNode attrNode = new CssAttributeSelectorNode(attrName, operator, value);
        attrNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            ((CssSimpleSelectorNode) nodeStack.peek()).addAttribute(attrNode);
        }
    }

    @Override
    public void enterAttribWithoutValue(CssParser.AttribWithoutValueContext ctx) {
        // Skip intermediate rule - directly build attribute selector
        String attrName = ctx.IDENT() != null ? ctx.IDENT().getText() : "";
        CssAttributeSelectorNode attrNode = new CssAttributeSelectorNode(attrName);
        attrNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            ((CssSimpleSelectorNode) nodeStack.peek()).addAttribute(attrNode);
        }
    }

    @Override
    public void enterPseudoClass(CssParser.PseudoClassContext ctx) {
        // Skip intermediate rule - directly build pseudo selector
        String pseudoName = ctx.IDENT() != null ? ctx.IDENT().getText() : "";
        String pseudoExpr = null;
        
        if (ctx.pseudoExpr() != null) {
            if (!ctx.pseudoExpr().IDENT().isEmpty()) {
                pseudoExpr = ctx.pseudoExpr().IDENT(0).getText();
            } else if (!ctx.pseudoExpr().NUMBER().isEmpty()) {
                pseudoExpr = ctx.pseudoExpr().NUMBER(0).getText();
            }
        }
        
        CssPseudoSelectorNode pseudoNode = new CssPseudoSelectorNode(pseudoName, pseudoExpr);
        pseudoNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            ((CssSimpleSelectorNode) nodeStack.peek()).addPseudo(pseudoNode);
        }
    }

    @Override
    public void enterPseudoElement(CssParser.PseudoElementContext ctx) {
        // Skip intermediate rule - directly build pseudo selector
        String pseudoName = "::" + (ctx.IDENT() != null ? ctx.IDENT().getText() : "");
        String pseudoExpr = null;
        
        if (ctx.pseudoExpr() != null) {
            if (!ctx.pseudoExpr().IDENT().isEmpty()) {
                pseudoExpr = ctx.pseudoExpr().IDENT(0).getText();
            } else if (!ctx.pseudoExpr().NUMBER().isEmpty()) {
                pseudoExpr = ctx.pseudoExpr().NUMBER(0).getText();
            }
        }
        
        CssPseudoSelectorNode pseudoNode = new CssPseudoSelectorNode(pseudoName, pseudoExpr);
        pseudoNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            ((CssSimpleSelectorNode) nodeStack.peek()).addPseudo(pseudoNode);
        }
    }

    @Override
    public void enterNotPseudo(CssParser.NotPseudoContext ctx) {
        // Skip intermediate rule - directly build pseudo selector
        String pseudoName = "not";
        String pseudoExpr = null;
        
        if (ctx.pseudoExpr() != null) {
            if (!ctx.pseudoExpr().IDENT().isEmpty()) {
                pseudoExpr = ctx.pseudoExpr().IDENT(0).getText();
            } else if (!ctx.pseudoExpr().NUMBER().isEmpty()) {
                pseudoExpr = ctx.pseudoExpr().NUMBER(0).getText();
            }
        }
        
        CssPseudoSelectorNode pseudoNode = new CssPseudoSelectorNode(pseudoName, pseudoExpr);
        pseudoNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSimpleSelectorNode) {
            ((CssSimpleSelectorNode) nodeStack.peek()).addPseudo(pseudoNode);
        }
    }

    @Override
    public void enterChildCombinator(CssParser.ChildCombinatorContext ctx) {
        // Skip intermediate rule - directly add combinator string
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSelectorNode) {
            ((CssSelectorNode) nodeStack.peek()).addCombinator(">");
        }
    }

    @Override
    public void enterAdjacentSiblingCombinator(CssParser.AdjacentSiblingCombinatorContext ctx) {
        // Skip intermediate rule - directly add combinator string
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSelectorNode) {
            ((CssSelectorNode) nodeStack.peek()).addCombinator("+");
        }
    }

    @Override
    public void enterGeneralSiblingCombinator(CssParser.GeneralSiblingCombinatorContext ctx) {
        // Skip intermediate rule - directly add combinator string
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssSelectorNode) {
            ((CssSelectorNode) nodeStack.peek()).addCombinator("~");
        }
    }

    @Override
    public void enterDeclaration(CssParser.DeclarationContext ctx) {
        CssDeclarationNode declarationNode = new CssDeclarationNode(null, null);
        declarationNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(declarationNode);
    }

    @Override
    public void exitDeclaration(CssParser.DeclarationContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssDeclarationNode) {
            CssDeclarationNode declarationNode = (CssDeclarationNode) nodeStack.pop();
            
            // Check for important in value parts
            if (ctx.value() != null) {
                for (CssParser.ValuePartContext valuePartCtx : ctx.value().valuePart()) {
                    if (valuePartCtx instanceof CssParser.ImportantValueContext) {
                        declarationNode.setImportant(true);
                        break;
                    }
                }
            }
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssRuleNode) {
                ((CssRuleNode) nodeStack.peek()).addDeclaration(declarationNode);
            }
        }
    }

    @Override
    public void enterIdentProperty(CssParser.IdentPropertyContext ctx) {
        // Skip intermediate rule - directly build property
        String propertyName = ctx.IDENT() != null ? ctx.IDENT().getText() : "";
        CssPropertyNode propertyNode = new CssPropertyNode(propertyName, false);
        propertyNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssDeclarationNode) {
            ((CssDeclarationNode) nodeStack.peek()).setProperty(propertyNode);
        }
    }

    @Override
    public void enterVarProperty(CssParser.VarPropertyContext ctx) {
        // Skip intermediate rule - directly build property
        String propertyName = ctx.VAR() != null ? ctx.VAR().getText() : "";
        CssPropertyNode propertyNode = new CssPropertyNode(propertyName, true);
        propertyNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssDeclarationNode) {
            ((CssDeclarationNode) nodeStack.peek()).setProperty(propertyNode);
        }
    }

    @Override
    public void enterValue(CssParser.ValueContext ctx) {
        CssValueNode valueNode = new CssValueNode();
        valueNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(valueNode);
    }

    @Override
    public void exitValue(CssParser.ValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            CssValueNode valueNode = (CssValueNode) nodeStack.pop();
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssDeclarationNode) {
                ((CssDeclarationNode) nodeStack.peek()).setValue(valueNode);
            }
        }
    }

    // Value part handlers - only semantic values, NO delimiter tokens (syntax leakage removed)
    
    @Override
    public void enterIdentValue(CssParser.IdentValueContext ctx) {
        String value = ctx.IDENT() != null ? ctx.IDENT().getText() : "";
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "ident");
        }
    }

    @Override
    public void enterVarValue(CssParser.VarValueContext ctx) {
        String value = ctx.VAR() != null ? ctx.VAR().getText() : "";
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "var");
        }
    }

    @Override
    public void enterNumberValue(CssParser.NumberValueContext ctx) {
        String value = ctx.NUMBER() != null ? ctx.NUMBER().getText() : "";
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "number");
        }
    }

    @Override
    public void enterStringValue(CssParser.StringValueContext ctx) {
        String value = ctx.STRING() != null ? ctx.STRING().getText() : "";
        value = removeNewlines(value);
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "string");
        }
    }

    @Override
    public void enterHashValue(CssParser.HashValueContext ctx) {
        String value = ctx.HASH() != null ? ctx.HASH().getText() : "";
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "hash");
        }
    }

    @Override
    public void enterImportantValue(CssParser.ImportantValueContext ctx) {
        String value = ctx.IMPORTANT() != null ? ctx.IMPORTANT().getText() : "";
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "important");
        }
    }

    @Override
    public void enterUrlValue(CssParser.UrlValueContext ctx) {
        // Build URL value - combine URL token and content
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(ctx.URL() != null ? ctx.URL().getText() : "");
        if (ctx.STRING() != null && !ctx.STRING().isEmpty()) {
            for (TerminalNode str : ctx.STRING()) {
                urlBuilder.append(str.getText());
            }
        }
        if (ctx.IDENT() != null && !ctx.IDENT().isEmpty()) {
            for (TerminalNode ident : ctx.IDENT()) {
                urlBuilder.append(ident.getText());
            }
        }
        if (ctx.NUMBER() != null && !ctx.NUMBER().isEmpty()) {
            for (TerminalNode num : ctx.NUMBER()) {
                urlBuilder.append(num.getText());
            }
        }
        // RPAREN is syntax - don't store it (removed syntax leakage)
        String value = urlBuilder.toString();
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssValueNode) {
            ((CssValueNode) nodeStack.peek()).addPart(value, "url");
        }
    }

    @Override
    public void enterParenValue(CssParser.ParenValueContext ctx) {
        // Parentheses are syntax - skip them. Only process the inner value recursively.
        // The nested value() rule will be handled separately.
        // This handler is intentionally empty - we skip the paren wrapper.
    }

    // DELIMITER TOKEN HANDLERS REMOVED - These are syntax leakage and should not be in the AST
    // Removed: enterCommaValue, enterDotValue, enterColonValue, enterSlashValue,
    //          enterGreaterValue, enterPlusValue, enterMinusValue, enterStarValue,
    //          enterTildeValue, enterEqualsValue, enterQuestionValue

    @Override
    public void enterAtRule(CssParser.AtRuleContext ctx) {
        String atRuleName = ctx.AT_RULE() != null ? ctx.AT_RULE().getText() : "";
        CssAtRuleNode atRuleNode = new CssAtRuleNode(atRuleName);
        atRuleNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(atRuleNode);
    }

    @Override
    public void exitAtRule(CssParser.AtRuleContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssAtRuleNode) {
            CssAtRuleNode atRuleNode = (CssAtRuleNode) nodeStack.pop();
            
            // Collect values - only semantic values, skip delimiter tokens
            collectAtRuleValues(ctx, atRuleNode);
            
            if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssStylesheetNode) {
                ((CssStylesheetNode) nodeStack.peek()).addRule(atRuleNode);
            } else if (!nodeStack.isEmpty() && nodeStack.peek() instanceof CssAtRuleNode) {
                ((CssAtRuleNode) nodeStack.peek()).addBodyNode(atRuleNode);
            }
        }
    }

    /**
     * Collect at-rule values, but skip delimiter tokens (syntax leakage removed).
     * Only collect semantic values: IDENT, STRING, NUMBER, URL, VAR, HASH, AND.
     */
    private void collectAtRuleValues(CssParser.AtRuleContext ctx, CssAtRuleNode atRuleNode) {
        // Collect values from atRuleValue contexts (labeled alternatives)
        if (ctx.atRuleValue() != null) {
            for (CssParser.AtRuleValueContext valueCtx : ctx.atRuleValue()) {
                // Only collect semantic values - skip delimiter tokens
                if (valueCtx instanceof CssParser.AtRuleIdentContext) {
                    atRuleNode.addValue(((CssParser.AtRuleIdentContext) valueCtx).IDENT().getText());
                } else if (valueCtx instanceof CssParser.AtRuleStringContext) {
                    atRuleNode.addValue(((CssParser.AtRuleStringContext) valueCtx).STRING().getText());
                } else if (valueCtx instanceof CssParser.AtRuleNumberContext) {
                    atRuleNode.addValue(((CssParser.AtRuleNumberContext) valueCtx).NUMBER().getText());
                } else if (valueCtx instanceof CssParser.AtRuleUrlContext) {
                    atRuleNode.addValue(((CssParser.AtRuleUrlContext) valueCtx).URL().getText());
                } else if (valueCtx instanceof CssParser.AtRuleVarContext) {
                    atRuleNode.addValue(((CssParser.AtRuleVarContext) valueCtx).VAR().getText());
                } else if (valueCtx instanceof CssParser.AtRuleHashContext) {
                    atRuleNode.addValue(((CssParser.AtRuleHashContext) valueCtx).HASH().getText());
                } else if (valueCtx instanceof CssParser.AtRuleAndContext) {
                    // "and" is semantic in media queries
                    atRuleNode.addValue("and");
                }
                // DELIMITER TOKENS SKIPPED: COMMA, LPAREN, RPAREN, COLON, GREATER, PLUS,
                // TILDE, SLASH, DOT, EQUALS, MINUS, STAR, QUESTION - these are syntax, not semantics
            }
        }
        
        // Add URL values from direct URL tokens in atRule
        if (ctx.URL() != null && !ctx.URL().isEmpty()) {
            for (TerminalNode urlNode : ctx.URL()) {
                atRuleNode.addValue(urlNode.getText());
            }
        }
        
        // Add STRING values from direct STRING tokens in atRule
        if (ctx.STRING() != null && !ctx.STRING().isEmpty()) {
            for (TerminalNode stringNode : ctx.STRING()) {
                atRuleNode.addValue(stringNode.getText());
            }
        }
        
        // Add IDENT values from direct IDENT tokens in atRule
        if (ctx.IDENT() != null && !ctx.IDENT().isEmpty()) {
            for (TerminalNode identNode : ctx.IDENT()) {
                atRuleNode.addValue(identNode.getText());
            }
        }
        
        // Add NUMBER values from direct NUMBER tokens in atRule
        if (ctx.NUMBER() != null && !ctx.NUMBER().isEmpty()) {
            for (TerminalNode numberNode : ctx.NUMBER()) {
                atRuleNode.addValue(numberNode.getText());
            }
        }
    }
}
