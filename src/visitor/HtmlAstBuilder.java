package visitor;

import ast.*;
import Grammar.HTML.HtmlJinjaParser;
import Grammar.HTML.HtmlJinjaParserBaseListener;

import java.util.Stack;

public class HtmlAstBuilder extends HtmlJinjaParserBaseListener {
    private Stack<AstNode> nodeStack;
    private HtmlDocumentNode document;

    public HtmlAstBuilder() {
        this.nodeStack = new Stack<>();
    }

    public HtmlDocumentNode getDocument() {
        return document;
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
    public void enterHtml(HtmlJinjaParser.HtmlContext ctx) {
        document = new HtmlDocumentNode();
        document.setLineNumber(getLineNumber(ctx));
        nodeStack.push(document);
    }

    @Override
    public void exitHtml(HtmlJinjaParser.HtmlContext ctx) {
        nodeStack.pop();
    }

    @Override
    public void enterScriptElement(HtmlJinjaParser.ScriptElementContext ctx) {
        ScriptTagNode scriptNode = new ScriptTagNode();
        scriptNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(scriptNode);
    }

    @Override
    public void exitScriptElement(HtmlJinjaParser.ScriptElementContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof ScriptTagNode) {
            ScriptTagNode scriptNode = (ScriptTagNode) nodeStack.pop();
            if (!nodeStack.isEmpty()) {
                AstNode parent = nodeStack.peek();
                if (parent instanceof HtmlDocumentNode) {
                    ((HtmlDocumentNode) parent).addChild(scriptNode);
                } else if (parent instanceof HtmlTagNode) {
                    ((HtmlTagNode) parent).addChild(scriptNode);
                }
            }
        }
    }

    @Override
    public void enterStyleElement(HtmlJinjaParser.StyleElementContext ctx) {
        StyleTagNode styleNode = new StyleTagNode();
        styleNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(styleNode);
    }

    @Override
    public void exitStyleElement(HtmlJinjaParser.StyleElementContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof StyleTagNode) {
            StyleTagNode styleNode = (StyleTagNode) nodeStack.pop();
            if (!nodeStack.isEmpty()) {
                AstNode parent = nodeStack.peek();
                if (parent instanceof HtmlDocumentNode) {
                    ((HtmlDocumentNode) parent).addChild(styleNode);
                } else if (parent instanceof HtmlTagNode) {
                    ((HtmlTagNode) parent).addChild(styleNode);
                }
            }
        }
    }

    @Override
    public void enterSelfClosingElement(HtmlJinjaParser.SelfClosingElementContext ctx) {
        HtmlJinjaParser.SelfClosingTagContext selfClosingCtx = ctx.selfClosingTag();
        String tagName = "";
        
        if (selfClosingCtx instanceof HtmlJinjaParser.LinkSelfClosingContext) {
            tagName = "link";
        } else if (selfClosingCtx instanceof HtmlJinjaParser.RegularSelfClosingContext) {
            HtmlJinjaParser.RegularSelfClosingContext regularCtx = (HtmlJinjaParser.RegularSelfClosingContext) selfClosingCtx;
            if (regularCtx.TAG_NAME() != null) {
                tagName = regularCtx.TAG_NAME().getText();
            }
        }
        
        HtmlTagNode tagNode = new HtmlTagNode(tagName, true);
        tagNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(tagNode);
    }

    @Override
    public void exitSelfClosingElement(HtmlJinjaParser.SelfClosingElementContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.pop();
            if (!nodeStack.isEmpty()) {
                AstNode parent = nodeStack.peek();
                if (parent instanceof HtmlDocumentNode) {
                    ((HtmlDocumentNode) parent).addChild(tagNode);
                } else if (parent instanceof HtmlTagNode) {
                    ((HtmlTagNode) parent).addChild(tagNode);
                }
            }
        }
    }

    @Override
    public void enterTagElementWithContent(HtmlJinjaParser.TagElementWithContentContext ctx) {
        HtmlJinjaParser.TagOpenContext tagOpenCtx = ctx.tagOpen();
        String tagName = "";
        
        if (tagOpenCtx instanceof HtmlJinjaParser.LinkTagContext) {
            tagName = "link";
        } else if (tagOpenCtx instanceof HtmlJinjaParser.RegularTagContext) {
            HtmlJinjaParser.RegularTagContext regularCtx = (HtmlJinjaParser.RegularTagContext) tagOpenCtx;
            if (regularCtx.TAG_NAME() != null) {
                tagName = regularCtx.TAG_NAME().getText();
            }
        }
        
        HtmlTagNode tagNode = new HtmlTagNode(tagName);
        tagNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(tagNode);
    }

    @Override
    public void exitTagElementWithContent(HtmlJinjaParser.TagElementWithContentContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.pop();
            if (!nodeStack.isEmpty()) {
                AstNode parent = nodeStack.peek();
                if (parent instanceof HtmlDocumentNode) {
                    ((HtmlDocumentNode) parent).addChild(tagNode);
                } else if (parent instanceof HtmlTagNode) {
                    ((HtmlTagNode) parent).addChild(tagNode);
                }
            }
        }
    }

    @Override
    public void enterTagElementEmpty(HtmlJinjaParser.TagElementEmptyContext ctx) {
        HtmlJinjaParser.TagOpenContext tagOpenCtx = ctx.tagOpen();
        String tagName = "";
        
        if (tagOpenCtx instanceof HtmlJinjaParser.LinkTagContext) {
            tagName = "link";
        } else if (tagOpenCtx instanceof HtmlJinjaParser.RegularTagContext) {
            HtmlJinjaParser.RegularTagContext regularCtx = (HtmlJinjaParser.RegularTagContext) tagOpenCtx;
            if (regularCtx.TAG_NAME() != null) {
                tagName = regularCtx.TAG_NAME().getText();
            }
        }
        
        HtmlTagNode tagNode = new HtmlTagNode(tagName);
        tagNode.setLineNumber(getLineNumber(ctx));
        nodeStack.push(tagNode);
    }

    @Override
    public void exitTagElementEmpty(HtmlJinjaParser.TagElementEmptyContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.pop();
            if (!nodeStack.isEmpty()) {
                AstNode parent = nodeStack.peek();
                if (parent instanceof HtmlDocumentNode) {
                    ((HtmlDocumentNode) parent).addChild(tagNode);
                } else if (parent instanceof HtmlTagNode) {
                    ((HtmlTagNode) parent).addChild(tagNode);
                }
            }
        }
    }

    @Override
    public void enterTagContent(HtmlJinjaParser.TagContentContext ctx) {
        // Tag content is handled by visiting children
    }

    @Override
    public void exitTagContent(HtmlJinjaParser.TagContentContext ctx) {
        // Tag content is handled by visiting children
    }

    @Override
    public void enterHtmlText(HtmlJinjaParser.HtmlTextContext ctx) {
        String text = ctx.HTML_TEXT() != null ? ctx.HTML_TEXT().getText() : "";
        text = removeNewlines(text);
        HtmlTextNode textNode = new HtmlTextNode(text);
        textNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty()) {
            AstNode parent = nodeStack.peek();
            if (parent instanceof HtmlDocumentNode) {
                ((HtmlDocumentNode) parent).addChild(textNode);
            } else if (parent instanceof HtmlTagNode) {
                ((HtmlTagNode) parent).addChild(textNode);
            }
        }
    }

    @Override
    public void enterJinjaExpr(HtmlJinjaParser.JinjaExprContext ctx) {
        String expr = ctx.EXPR_CONTENT() != null ? ctx.EXPR_CONTENT().getText() : "";
        expr = removeNewlines(expr);
        JinjaExpressionNode exprNode = new JinjaExpressionNode(expr);
        exprNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty()) {
            AstNode parent = nodeStack.peek();
            if (parent instanceof HtmlDocumentNode) {
                ((HtmlDocumentNode) parent).addChild(exprNode);
            } else if (parent instanceof HtmlTagNode) {
                ((HtmlTagNode) parent).addChild(exprNode);
            } else if (parent instanceof ScriptTagNode) {
                ((ScriptTagNode) parent).addChild(exprNode);
            } else if (parent instanceof StyleTagNode) {
                ((StyleTagNode) parent).addChild(exprNode);
            }
        }
    }

    @Override
    public void enterJinjaStmt(HtmlJinjaParser.JinjaStmtContext ctx) {
        String stmt = ctx.STMT_CONTENT() != null ? ctx.STMT_CONTENT().getText() : "";
        stmt = removeNewlines(stmt);
        JinjaStatementNode stmtNode = new JinjaStatementNode(stmt);
        stmtNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty()) {
            AstNode parent = nodeStack.peek();
            if (parent instanceof HtmlDocumentNode) {
                ((HtmlDocumentNode) parent).addChild(stmtNode);
            } else if (parent instanceof HtmlTagNode) {
                ((HtmlTagNode) parent).addChild(stmtNode);
            } else if (parent instanceof ScriptTagNode) {
                ((ScriptTagNode) parent).addChild(stmtNode);
            } else if (parent instanceof StyleTagNode) {
                ((StyleTagNode) parent).addChild(stmtNode);
            }
        }
    }

    @Override
    public void enterJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx) {
        String comment = ctx.COMMENT_CONTENT() != null ? ctx.COMMENT_CONTENT().getText() : "";
        comment = removeNewlines(comment);
        JinjaCommentNode commentNode = new JinjaCommentNode(comment);
        commentNode.setLineNumber(getLineNumber(ctx));
        
        if (!nodeStack.isEmpty()) {
            AstNode parent = nodeStack.peek();
            if (parent instanceof HtmlDocumentNode) {
                ((HtmlDocumentNode) parent).addChild(commentNode);
            } else if (parent instanceof HtmlTagNode) {
                ((HtmlTagNode) parent).addChild(commentNode);
            }
        }
    }

    @Override
    public void enterScriptTag(HtmlJinjaParser.ScriptTagContext ctx) {
        // Attributes are handled in enterScriptAttrWithValue/enterScriptAttrWithoutValue
    }

    @Override
    public void exitScriptTag(HtmlJinjaParser.ScriptTagContext ctx) {
        // Content is handled in exitScriptContent
    }

    @Override
    public void exitScriptContent(HtmlJinjaParser.ScriptContentContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof ScriptTagNode) {
            ScriptTagNode scriptNode = (ScriptTagNode) nodeStack.peek();
            // Build content string from text parts (Jinja nodes are already added as children)
            StringBuilder content = new StringBuilder();
            for (HtmlJinjaParser.ScriptContentTextContext textCtx : ctx.scriptContentText()) {
                if (textCtx.SCRIPT_CONTENT_TEXT() != null) {
                    content.append(textCtx.SCRIPT_CONTENT_TEXT().getText());
                }
            }
            scriptNode.setContent(removeNewlines(content.toString()));
        }
    }

    @Override
    public void enterScriptContentText(HtmlJinjaParser.ScriptContentTextContext ctx) {
        // Create text nodes for script content text parts
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof ScriptTagNode) {
            ScriptTagNode scriptNode = (ScriptTagNode) nodeStack.peek();
            String text = ctx.SCRIPT_CONTENT_TEXT() != null ? ctx.SCRIPT_CONTENT_TEXT().getText() : "";
            text = removeNewlines(text);
            if (!text.isEmpty()) {
                HtmlTextNode textNode = new HtmlTextNode(text);
                textNode.setLineNumber(getLineNumber(ctx));
                scriptNode.addChild(textNode);
            }
        }
    }

    @Override
    public void enterStyleTag(HtmlJinjaParser.StyleTagContext ctx) {
        // Attributes are handled in enterStyleAttrWithValue/enterStyleAttrWithoutValue
    }

    @Override
    public void exitStyleTag(HtmlJinjaParser.StyleTagContext ctx) {
        // Content is handled in exitStyleContent
    }

    @Override
    public void exitStyleContent(HtmlJinjaParser.StyleContentContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof StyleTagNode) {
            StyleTagNode styleNode = (StyleTagNode) nodeStack.peek();
            // Build content string from text parts (Jinja nodes are already added as children)
            StringBuilder content = new StringBuilder();
            for (HtmlJinjaParser.StyleContentTextContext textCtx : ctx.styleContentText()) {
                if (textCtx.STYLE_CONTENT_TEXT() != null) {
                    content.append(textCtx.STYLE_CONTENT_TEXT().getText());
                }
            }
            styleNode.setContent(removeNewlines(content.toString()));
        }
    }

    @Override
    public void enterStyleContentText(HtmlJinjaParser.StyleContentTextContext ctx) {
        // Create text nodes for style content text parts
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof StyleTagNode) {
            StyleTagNode styleNode = (StyleTagNode) nodeStack.peek();
            String text = ctx.STYLE_CONTENT_TEXT() != null ? ctx.STYLE_CONTENT_TEXT().getText() : "";
            text = removeNewlines(text);
            if (!text.isEmpty()) {
                HtmlTextNode textNode = new HtmlTextNode(text);
                textNode.setLineNumber(getLineNumber(ctx));
                styleNode.addChild(textNode);
            }
        }
    }

    @Override
    public void enterScriptAttrWithValue(HtmlJinjaParser.ScriptAttrWithValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof ScriptTagNode) {
            ScriptTagNode scriptNode = (ScriptTagNode) nodeStack.peek();
            String attrName = ctx.SCRIPT_ATTR_NAME() != null ? ctx.SCRIPT_ATTR_NAME().getText() : "";
            String attrValue = extractScriptAttrValue(ctx.scriptAttrValue());
            attrValue = removeNewlines(attrValue);
            AttributeNode attrNode = new AttributeNode(attrName, attrValue);
            attrNode.setLineNumber(getLineNumber(ctx));
            scriptNode.addAttribute(attrNode);
        }
    }

    private String extractScriptAttrValue(HtmlJinjaParser.ScriptAttrValueContext ctx) {
        if (ctx == null) {
            return "";
        }
        
        if (ctx instanceof HtmlJinjaParser.ScriptAttrValueDoubleContext) {
            HtmlJinjaParser.ScriptAttrValueDoubleContext doubleCtx = (HtmlJinjaParser.ScriptAttrValueDoubleContext) ctx;
            StringBuilder value = new StringBuilder();
            for (HtmlJinjaParser.ScriptAttrValueContentContext contentCtx : doubleCtx.scriptAttrValueContent()) {
                if (contentCtx.SCRIPT_ATTR_VALUE_TEXT() != null) {
                    value.append(contentCtx.SCRIPT_ATTR_VALUE_TEXT().getText());
                } else if (contentCtx.SCRIPT_ATTR_VALUE_OPEN_EXPR() != null && contentCtx.EXPR_CONTENT() != null) {
                    value.append("{{").append(contentCtx.EXPR_CONTENT().getText()).append("}}");
                } else if (contentCtx.SCRIPT_ATTR_VALUE_OPEN_STMT() != null && contentCtx.STMT_CONTENT() != null) {
                    value.append("{%").append(contentCtx.STMT_CONTENT().getText()).append("%}");
                }
            }
            return value.toString();
        } else if (ctx instanceof HtmlJinjaParser.ScriptAttrValueSingleContext) {
            HtmlJinjaParser.ScriptAttrValueSingleContext singleCtx = (HtmlJinjaParser.ScriptAttrValueSingleContext) ctx;
            StringBuilder value = new StringBuilder();
            for (HtmlJinjaParser.ScriptAttrValueContentSingleContext contentCtx : singleCtx.scriptAttrValueContentSingle()) {
                if (contentCtx.SCRIPT_ATTR_VALUE_TEXT_SINGLE() != null) {
                    value.append(contentCtx.SCRIPT_ATTR_VALUE_TEXT_SINGLE().getText());
                } else if (contentCtx.SCRIPT_ATTR_VALUE_OPEN_EXPR_SINGLE() != null && contentCtx.EXPR_CONTENT() != null) {
                    value.append("{{").append(contentCtx.EXPR_CONTENT().getText()).append("}}");
                } else if (contentCtx.SCRIPT_ATTR_VALUE_OPEN_STMT_SINGLE() != null && contentCtx.STMT_CONTENT() != null) {
                    value.append("{%").append(contentCtx.STMT_CONTENT().getText()).append("%}");
                }
            }
            return value.toString();
        } else if (ctx instanceof HtmlJinjaParser.ScriptAttrValueUnquotedContext) {
            HtmlJinjaParser.ScriptAttrValueUnquotedContext unquotedCtx = (HtmlJinjaParser.ScriptAttrValueUnquotedContext) ctx;
            return unquotedCtx.SCRIPT_ATTR_VALUE_UNQUOTED() != null ? unquotedCtx.SCRIPT_ATTR_VALUE_UNQUOTED().getText() : "";
        }
        
        return "";
    }

    @Override
    public void enterScriptAttrWithoutValue(HtmlJinjaParser.ScriptAttrWithoutValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof ScriptTagNode) {
            ScriptTagNode scriptNode = (ScriptTagNode) nodeStack.peek();
            String attrName = ctx.SCRIPT_ATTR_NAME() != null ? ctx.SCRIPT_ATTR_NAME().getText() : "";
            AttributeNode attrNode = new AttributeNode(attrName, null);
            attrNode.setLineNumber(getLineNumber(ctx));
            scriptNode.addAttribute(attrNode);
        }
    }

    @Override
    public void enterStyleAttrWithValue(HtmlJinjaParser.StyleAttrWithValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof StyleTagNode) {
            StyleTagNode styleNode = (StyleTagNode) nodeStack.peek();
            String attrName = ctx.STYLE_ATTR_NAME() != null ? ctx.STYLE_ATTR_NAME().getText() : "";
            String attrValue = extractStyleAttrValue(ctx.styleAttrValue());
            attrValue = removeNewlines(attrValue);
            AttributeNode attrNode = new AttributeNode(attrName, attrValue);
            attrNode.setLineNumber(getLineNumber(ctx));
            styleNode.addAttribute(attrNode);
        }
    }

    private String extractStyleAttrValue(HtmlJinjaParser.StyleAttrValueContext ctx) {
        if (ctx == null) {
            return "";
        }
        
        if (ctx instanceof HtmlJinjaParser.StyleAttrValueDoubleContext) {
            HtmlJinjaParser.StyleAttrValueDoubleContext doubleCtx = (HtmlJinjaParser.StyleAttrValueDoubleContext) ctx;
            StringBuilder value = new StringBuilder();
            for (HtmlJinjaParser.StyleAttrValueContentContext contentCtx : doubleCtx.styleAttrValueContent()) {
                if (contentCtx.STYLE_ATTR_VALUE_TEXT() != null) {
                    value.append(contentCtx.STYLE_ATTR_VALUE_TEXT().getText());
                } else if (contentCtx.STYLE_ATTR_VALUE_OPEN_EXPR() != null && contentCtx.EXPR_CONTENT() != null) {
                    value.append("{{").append(contentCtx.EXPR_CONTENT().getText()).append("}}");
                } else if (contentCtx.STYLE_ATTR_VALUE_OPEN_STMT() != null && contentCtx.STMT_CONTENT() != null) {
                    value.append("{%").append(contentCtx.STMT_CONTENT().getText()).append("%}");
                }
            }
            return value.toString();
        } else if (ctx instanceof HtmlJinjaParser.StyleAttrValueSingleContext) {
            HtmlJinjaParser.StyleAttrValueSingleContext singleCtx = (HtmlJinjaParser.StyleAttrValueSingleContext) ctx;
            StringBuilder value = new StringBuilder();
            for (HtmlJinjaParser.StyleAttrValueContentSingleContext contentCtx : singleCtx.styleAttrValueContentSingle()) {
                if (contentCtx.STYLE_ATTR_VALUE_TEXT_SINGLE() != null) {
                    value.append(contentCtx.STYLE_ATTR_VALUE_TEXT_SINGLE().getText());
                } else if (contentCtx.STYLE_ATTR_VALUE_OPEN_EXPR_SINGLE() != null && contentCtx.EXPR_CONTENT() != null) {
                    value.append("{{").append(contentCtx.EXPR_CONTENT().getText()).append("}}");
                } else if (contentCtx.STYLE_ATTR_VALUE_OPEN_STMT_SINGLE() != null && contentCtx.STMT_CONTENT() != null) {
                    value.append("{%").append(contentCtx.STMT_CONTENT().getText()).append("%}");
                }
            }
            return value.toString();
        } else if (ctx instanceof HtmlJinjaParser.StyleAttrValueUnquotedContext) {
            HtmlJinjaParser.StyleAttrValueUnquotedContext unquotedCtx = (HtmlJinjaParser.StyleAttrValueUnquotedContext) ctx;
            return unquotedCtx.STYLE_ATTR_VALUE_UNQUOTED() != null ? unquotedCtx.STYLE_ATTR_VALUE_UNQUOTED().getText() : "";
        }
        
        return "";
    }

    @Override
    public void enterStyleAttrWithoutValue(HtmlJinjaParser.StyleAttrWithoutValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof StyleTagNode) {
            StyleTagNode styleNode = (StyleTagNode) nodeStack.peek();
            String attrName = ctx.STYLE_ATTR_NAME() != null ? ctx.STYLE_ATTR_NAME().getText() : "";
            AttributeNode attrNode = new AttributeNode(attrName, null);
            attrNode.setLineNumber(getLineNumber(ctx));
            styleNode.addAttribute(attrNode);
        }
    }

    @Override
    public void enterRegularTag(HtmlJinjaParser.RegularTagContext ctx) {
        // Tag node already created in enterTagElement
        // Handle attributes
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.peek();
            if (ctx.attribute() != null) {
                for (HtmlJinjaParser.AttributeContext attrCtx : ctx.attribute()) {
                    handleAttribute(attrCtx, tagNode);
                }
            }
        }
    }

    @Override
    public void exitRegularTag(HtmlJinjaParser.RegularTagContext ctx) {
        // Tag node already handled in exitTagElement
    }

    @Override
    public void enterLinkTag(HtmlJinjaParser.LinkTagContext ctx) {
        // Tag node already created in enterTagElement
        // Handle attributes
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.peek();
            if (ctx.attribute() != null) {
                for (HtmlJinjaParser.AttributeContext attrCtx : ctx.attribute()) {
                    handleAttribute(attrCtx, tagNode);
                }
            }
        }
    }

    @Override
    public void exitLinkTag(HtmlJinjaParser.LinkTagContext ctx) {
        // Tag node already handled in exitTagElement
    }

    @Override
    public void enterRegularSelfClosing(HtmlJinjaParser.RegularSelfClosingContext ctx) {
        // Tag node already created in enterSelfClosingElement
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.peek();
            if (ctx.attribute() != null) {
                for (HtmlJinjaParser.AttributeContext attrCtx : ctx.attribute()) {
                    handleAttribute(attrCtx, tagNode);
                }
            }
        }
    }

    @Override
    public void enterLinkSelfClosing(HtmlJinjaParser.LinkSelfClosingContext ctx) {
        // Tag node already created in enterSelfClosingElement
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.peek();
            if (ctx.attribute() != null) {
                for (HtmlJinjaParser.AttributeContext attrCtx : ctx.attribute()) {
                    handleAttribute(attrCtx, tagNode);
                }
            }
        }
    }

    @Override
    public void enterAttrWithValue(HtmlJinjaParser.AttrWithValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.peek();
            handleAttribute(ctx, tagNode);
        }
    }

    @Override
    public void enterAttrWithoutValue(HtmlJinjaParser.AttrWithoutValueContext ctx) {
        if (!nodeStack.isEmpty() && nodeStack.peek() instanceof HtmlTagNode) {
            HtmlTagNode tagNode = (HtmlTagNode) nodeStack.peek();
            handleAttribute(ctx, tagNode);
        }
    }

    private void handleAttribute(HtmlJinjaParser.AttributeContext attrCtx, HtmlTagNode tagNode) {
        String attrName = "";
        String attrValue = null;
        
        if (attrCtx instanceof HtmlJinjaParser.AttrWithValueContext) {
            HtmlJinjaParser.AttrWithValueContext withValueCtx = (HtmlJinjaParser.AttrWithValueContext) attrCtx;
            if (withValueCtx.ATTR_NAME() != null) {
                attrName = withValueCtx.ATTR_NAME().getText();
            } else if (withValueCtx.TAG_NAME() != null) {
                attrName = withValueCtx.TAG_NAME().getText();
            }
            if (withValueCtx.ATTR_EQ() != null && withValueCtx.ATTR_VALUE() != null) {
                attrValue = withValueCtx.ATTR_VALUE().getText();
                // Remove quotes if present (both single and double quotes)
                if (attrValue.length() >= 2) {
                    if ((attrValue.startsWith("\"") && attrValue.endsWith("\"")) ||
                        (attrValue.startsWith("'") && attrValue.endsWith("'"))) {
                        attrValue = attrValue.substring(1, attrValue.length() - 1);
                    }
                }
                attrValue = removeNewlines(attrValue);
            }
        } else if (attrCtx instanceof HtmlJinjaParser.AttrWithoutValueContext) {
            HtmlJinjaParser.AttrWithoutValueContext withoutValueCtx = (HtmlJinjaParser.AttrWithoutValueContext) attrCtx;
            if (withoutValueCtx.ATTR_NAME() != null) {
                attrName = withoutValueCtx.ATTR_NAME().getText();
            } else if (withoutValueCtx.TAG_NAME() != null) {
                attrName = withoutValueCtx.TAG_NAME().getText();
            }
        }
        
        AttributeNode attrNode = new AttributeNode(attrName, attrValue);
        attrNode.setLineNumber(getLineNumber(attrCtx));
        tagNode.addAttribute(attrNode);
    }
}
