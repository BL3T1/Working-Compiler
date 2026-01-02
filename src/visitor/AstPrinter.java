package visitor;

import ast.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Visitor for printing AST in a beautiful tree format with Unicode box-drawing characters
 */
public class AstPrinter implements AstVisitor<String> {
    private StringBuilder output;
    // Using ASCII characters for better compatibility across all terminals
    private static final String TREE_EDGE = "+-- ";
    private static final String TREE_LAST = "\\-- ";
    private static final String TREE_PIPE = "|   ";
    private static final String TREE_SPACE = "    ";
    
    private List<Boolean> isLastStack;

    public AstPrinter() {
        this.output = new StringBuilder();
        this.isLastStack = new ArrayList<>();
    }

    /**
     * Print a single node with its name and line number
     * This function prints the node details: Node name, line number
     */
    public String printNode(AstNode node) {
        if (node == null) {
            return "null";
        }
        String nodeName = node.getNodeName();
        int lineNumber = node.getLineNumber();
        if (lineNumber >= 0) {
            return String.format("Node: %s, Line: %d", nodeName, lineNumber);
        } else {
            return String.format("Node: %s, Line: not set", nodeName);
        }
    }
    
    /**
     * Print the entire AST tree starting from a root node
     * This function calls printNode for each node and recursively prints the entire tree
     */
    public String printTree(AstNode root) {
        output.setLength(0);
        isLastStack.clear();
        if (root != null) {
            printTreeRecursive(root);
        }
        return output.toString();
    }
    
    /**
     * Recursively print the tree structure
     */
    private void printTreeRecursive(AstNode node) {
        if (node == null) {
            return;
        }
        
        // Print this node with tree formatting
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String nodeName = node.getNodeName();
        int lineNumber = node.getLineNumber();
        
        // Get node-specific information
        String nodeInfo = getNodeInfo(node);
        printNodeFormatted(prefix, connector, nodeName, nodeInfo, lineNumber);
        
            // Get children and recursively print them
        List<AstNode> children = getNodeChildren(node);
        if (children != null && !children.isEmpty()) {
            for (int i = 0; i < children.size(); i++) {
                AstNode child = children.get(i);
                boolean isLast = (i == children.size() - 1);
                pushIsLast(isLast);
                
                // Handle virtual nodes specially - print them inline
                if (child instanceof IdNode) {
                    String childPrefix = getPrefix();
                    String childConnector = isLast ? TREE_LAST : TREE_EDGE;
                    IdNode idNode = (IdNode) child;
                    printNodeFormatted(childPrefix, childConnector, "ID", "[ID] #" + idNode.getId(), -1);
                } else if (child instanceof TypeSelectorNode) {
                    String childPrefix = getPrefix();
                    String childConnector = isLast ? TREE_LAST : TREE_EDGE;
                    TypeSelectorNode typeNode = (TypeSelectorNode) child;
                    printNodeFormatted(childPrefix, childConnector, "CssTypeSelector", "[TYPE] " + typeNode.getElementName(), -1);
                } else if (child instanceof ClassSelectorNode) {
                    String childPrefix = getPrefix();
                    String childConnector = isLast ? TREE_LAST : TREE_EDGE;
                    ClassSelectorNode classNode = (ClassSelectorNode) child;
                    printNodeFormatted(childPrefix, childConnector, "CssClassSelector", "[CLASS] ." + classNode.getClassName(), -1);
                } else if (child instanceof UniversalSelectorNode) {
                    String childPrefix = getPrefix();
                    String childConnector = isLast ? TREE_LAST : TREE_EDGE;
                    printNodeFormatted(childPrefix, childConnector, "CssUniversalSelector", "⭐ *", -1);
                } else if (child instanceof CombinatorNode) {
                    String childPrefix = getPrefix();
                    String childConnector = isLast ? TREE_LAST : TREE_EDGE;
                    CombinatorNode combNode = (CombinatorNode) child;
                    String comb = combNode.getCombinator();
                    String combDisplay = comb.equals(" ") ? "[space]" : comb;
                    printNodeFormatted(childPrefix, childConnector, "CssCombinator", "[COMB] " + combDisplay, -1);
                } else if (child instanceof ValuePartNode) {
                    String childPrefix = getPrefix();
                    String childConnector = isLast ? TREE_LAST : TREE_EDGE;
                    ValuePartNode partNode = (ValuePartNode) child;
                    CssValueNode.ValuePart part = partNode.getPart();
                    printNodeFormatted(childPrefix, childConnector, "CssValuePart", "[VAL-PART] " + part.getValue() + " (" + part.getType() + ")", -1);
                } else {
                    printTreeRecursive(child);
                }
                
                popIsLast();
            }
        }
    }
    
    /**
     * Get additional information about a node (for display)
     */
    private String getNodeInfo(AstNode node) {
        if (node instanceof HtmlTagNode) {
            HtmlTagNode tag = (HtmlTagNode) node;
            String info = "<" + tag.getTagName() + ">";
            if (tag.isSelfClosing()) {
                info += " (self-closing)";
            }
            return "[TAG] " + info;
        } else if (node instanceof HtmlTextNode) {
            HtmlTextNode text = (HtmlTextNode) node;
            String content = text.getText();
            if (content.length() > 40) {
                content = content.substring(0, 40) + "...";
            }
            return "[TEXT] \"" + escapeQuotes(content) + "\"";
        } else if (node instanceof JinjaExpressionNode) {
            JinjaExpressionNode expr = (JinjaExpressionNode) node;
            return "{{ " + expr.getExpression() + " }}";
        } else if (node instanceof JinjaStatementNode) {
            JinjaStatementNode stmt = (JinjaStatementNode) node;
            return "{% " + stmt.getStatement() + " %}";
        } else if (node instanceof JinjaCommentNode) {
            JinjaCommentNode comment = (JinjaCommentNode) node;
            return "{# " + comment.getComment() + " #}";
        } else if (node instanceof AttributeNode) {
            AttributeNode attr = (AttributeNode) node;
            String info = "[ATTR] ";
            if (attr.getValue() != null) {
                info += attr.getName() + "=\"" + escapeQuotes(attr.getValue()) + "\"";
            } else {
                info += attr.getName();
            }
            return info;
        } else if (node instanceof CssRuleNode) {
            CssRuleNode rule = (CssRuleNode) node;
            return "[RULE] Rule (" + rule.getDeclarations().size() + " declarations)";
        // TypeSelector and ClassSelector are now strings in CssSimpleSelectorNode - handled there
        } else if (node instanceof CssPropertyNode) {
            CssPropertyNode prop = (CssPropertyNode) node;
            String info = "[PROP] " + prop.getPropertyName();
            if (prop.isVariable()) {
                info += " (var)";
            }
            return info;
        } else if (node instanceof CssDeclarationNode) {
            CssDeclarationNode decl = (CssDeclarationNode) node;
            String info = "[DECL] Declaration";
            if (decl.isImportant()) {
                info += " !important";
            }
            return info;
        } else if (node instanceof CssStylesheetNode) {
            CssStylesheetNode sheet = (CssStylesheetNode) node;
            return "[STYLE] Stylesheet (" + sheet.getRules().size() + " rules)";
        } else if (node instanceof CssAtRuleNode) {
            CssAtRuleNode atRule = (CssAtRuleNode) node;
            String info = "[AT-RULE] @" + atRule.getAtRuleName();
            if (!atRule.getValues().isEmpty()) {
                info += " " + String.join(" ", atRule.getValues());
            }
            return info;
        }
        return null;
    }
    
    /**
     * Get children of a node (if any)
     */
    private List<AstNode> getNodeChildren(AstNode node) {
        if (node instanceof HtmlDocumentNode) {
            return ((HtmlDocumentNode) node).getChildren();
        } else if (node instanceof HtmlTagNode) {
            HtmlTagNode tag = (HtmlTagNode) node;
            List<AstNode> children = new ArrayList<>();
            children.addAll(tag.getAttributes());
            children.addAll(tag.getChildren());
            return children;
        } else if (node instanceof ScriptTagNode) {
            ScriptTagNode script = (ScriptTagNode) node;
            List<AstNode> children = new ArrayList<>();
            children.addAll(script.getAttributes());
            children.addAll(script.getChildren());  // Include Jinja nodes and text nodes
            return children;
        } else if (node instanceof StyleTagNode) {
            StyleTagNode style = (StyleTagNode) node;
            List<AstNode> children = new ArrayList<>();
            children.addAll(style.getAttributes());
            children.addAll(style.getChildren());  // Include Jinja nodes and text nodes
            return children;
        } else if (node instanceof CssStylesheetNode) {
            return ((CssStylesheetNode) node).getRules();
        } else if (node instanceof CssRuleNode) {
            CssRuleNode rule = (CssRuleNode) node;
            List<AstNode> children = new ArrayList<>();
            if (rule.getSelector() != null) {
                children.add(rule.getSelector());
            }
            children.addAll(rule.getDeclarations());
            return children;
        } else if (node instanceof CssSelectorNode) {
            CssSelectorNode selector = (CssSelectorNode) node;
            List<AstNode> children = new ArrayList<>();
            children.addAll(selector.getSimpleSelectors());
            // Combinators are now strings - create virtual nodes for display
            for (String comb : selector.getCombinators()) {
                children.add(new CombinatorNode(comb));
            }
            return children;
        } else if (node instanceof CssSimpleSelectorNode) {
            CssSimpleSelectorNode simple = (CssSimpleSelectorNode) node;
            List<AstNode> children = new ArrayList<>();
            // Type selector is now a string - create virtual node for display
            if (simple.getTypeSelector() != null) {
                children.add(new TypeSelectorNode(simple.getTypeSelector()));
            }
            // Universal selector is now a boolean - create virtual node if present
            if (simple.hasUniversalSelector()) {
                children.add(new UniversalSelectorNode());
            }
            // IDs are strings - create virtual nodes for tree printing
            for (String id : simple.getIds()) {
                children.add(new IdNode(id));
            }
            // Classes are now strings - create virtual nodes for display
            for (String className : simple.getClasses()) {
                children.add(new ClassSelectorNode(className));
            }
            children.addAll(simple.getAttributes());
            children.addAll(simple.getPseudos());
            return children;
        } else if (node instanceof CssDeclarationNode) {
            CssDeclarationNode decl = (CssDeclarationNode) node;
            List<AstNode> children = new ArrayList<>();
            if (decl.getProperty() != null) {
                children.add(decl.getProperty());
            }
            if (decl.getValue() != null) {
                children.add(decl.getValue());
            }
            return children;
        } else if (node instanceof CssValueNode) {
            // Value parts are now ValuePart objects (not AstNodes) - create virtual nodes for display
            CssValueNode valueNode = (CssValueNode) node;
            List<AstNode> children = new ArrayList<>();
            for (CssValueNode.ValuePart part : valueNode.getParts()) {
                children.add(new ValuePartNode(part));
            }
            return children;
        } else if (node instanceof CssAtRuleNode) {
            return ((CssAtRuleNode) node).getBody();
        } else if (node instanceof IdNode) {
            return null; // Leaf node, no children
        }
        return null;
    }
    
    /**
     * Print the entire AST starting from a node (alias for printTree for backward compatibility)
     */
    public String print(AstNode node) {
        return printTree(node);
    }

    /**
     * Internal method to print a node with tree formatting
     */
    private void printNodeFormatted(String prefix, String connector, String nodeName, String info, int lineNumber) {
        String lineInfo = lineNumber >= 0 ? String.format(" [Line: %d]", lineNumber) : " [Line: not set]";
        output.append(prefix).append(connector).append(nodeName).append(lineInfo);
        if (info != null && !info.isEmpty()) {
            output.append(" ").append(info);
        }
        output.append("\n");
    }
    
    private String getPrefix() {
        StringBuilder prefix = new StringBuilder();
        for (Boolean isLast : isLastStack) {
            prefix.append(isLast ? TREE_SPACE : TREE_PIPE);
        }
        return prefix.toString();
    }
    
    private void pushIsLast(boolean isLast) {
        isLastStack.add(isLast);
    }
    
    private void popIsLast() {
        if (!isLastStack.isEmpty()) {
            isLastStack.remove(isLastStack.size() - 1);
        }
    }
    
    private String escapeQuotes(String str) {
        return str.replace("\"", "\\\"").replace("\n", "\\n");
    }

    @Override
    public String visitHtmlDocument(HtmlDocumentNode node) {
        String prefix = getPrefix();
        printNodeFormatted(prefix, "", "[DOC] HtmlDocument", "Document", node.getLineNumber());
        
        List<AstNode> children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitHtmlTag(HtmlTagNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[TAG] <" + node.getTagName() + ">";
        if (node.isSelfClosing()) {
            info += " (self-closing)";
        }
        printNodeFormatted(prefix, connector, "HtmlTag", info, node.getLineNumber());
        
        List<AstNode> children = new ArrayList<>();
        children.addAll(node.getAttributes());
        children.addAll(node.getChildren());
        
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitHtmlText(HtmlTextNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String text = node.getText();
        if (text.length() > 40) {
            text = text.substring(0, 40) + "...";
        }
        String info = "[TEXT] \"" + escapeQuotes(text) + "\"";
        printNodeFormatted(prefix, connector, "HtmlText", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitJinjaExpression(JinjaExpressionNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "{{ " + node.getExpression() + " }}";
        printNodeFormatted(prefix, connector, "JinjaExpression", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitJinjaStatement(JinjaStatementNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "{% " + node.getStatement() + " %}";
        printNodeFormatted(prefix, connector, "JinjaStatement", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitJinjaComment(JinjaCommentNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "{# " + node.getComment() + " #}";
        printNodeFormatted(prefix, connector, "JinjaComment", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitScriptTag(ScriptTagNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[SCRIPT] <script>";
        if (node.getContent() != null && !node.getContent().isEmpty()) {
            info += " [has content]";
        }
        if (!node.getChildren().isEmpty()) {
            info += " (" + node.getChildren().size() + " children)";
        }
        printNodeFormatted(prefix, connector, "ScriptTag", info, node.getLineNumber());
        
        List<AstNode> children = new ArrayList<>();
        children.addAll(node.getAttributes());
        children.addAll(node.getChildren());
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitStyleTag(StyleTagNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[STYLE] <style>";
        if (node.getContent() != null && !node.getContent().isEmpty()) {
            info += " [has content]";
        }
        if (!node.getChildren().isEmpty()) {
            info += " (" + node.getChildren().size() + " children)";
        }
        printNodeFormatted(prefix, connector, "StyleTag", info, node.getLineNumber());
        
        List<AstNode> children = new ArrayList<>();
        children.addAll(node.getAttributes());
        children.addAll(node.getChildren());
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitAttribute(AttributeNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[ATTR] ";
        if (node.getValue() != null) {
            info += node.getName() + "=\"" + escapeQuotes(node.getValue()) + "\"";
        } else {
            info += node.getName();
        }
        printNodeFormatted(prefix, connector, "Attribute", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitCssStylesheet(CssStylesheetNode node) {
        String prefix = getPrefix();
        printNodeFormatted(prefix, "", "[STYLE] CssStylesheet", 
            "Stylesheet (" + node.getRules().size() + " rules)", node.getLineNumber());
        
        List<AstNode> children = node.getRules();
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitCssRule(CssRuleNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[RULE] Rule (" + node.getDeclarations().size() + " declarations)";
        printNodeFormatted(prefix, connector, "CssRule", info, node.getLineNumber());
        
        List<AstNode> children = new ArrayList<>();
        if (node.getSelector() != null) {
            children.add(node.getSelector());
        }
        children.addAll(node.getDeclarations());
        
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitCssSelector(CssSelectorNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        printNodeFormatted(prefix, connector, "CssSelector", "🎯 Selector", node.getLineNumber());
        
        // Use getNodeChildren which handles virtual nodes for combinators
        List<AstNode> children = getNodeChildren(node);
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            // Virtual nodes (CombinatorNode) are handled in printTreeRecursive
            printTreeRecursive(children.get(i));
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitCssSimpleSelector(CssSimpleSelectorNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        printNodeFormatted(prefix, connector, "CssSimpleSelector", "🎯 SimpleSelector", node.getLineNumber());
        
        // Use getNodeChildren which handles virtual nodes for type, classes, universal, IDs
        List<AstNode> children = getNodeChildren(node);
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            // Virtual nodes are handled in printTreeRecursive
            printTreeRecursive(children.get(i));
            popIsLast();
        }
        return output.toString();
    }

    // Removed visitCssTypeSelector, visitCssUniversalSelector, visitCssClassSelector
    // These are now simplified/integrated into CssSimpleSelectorNode

    @Override
    public String visitCssAttributeSelector(CssAttributeSelectorNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[ATTR] [" + node.getAttributeName();
        if (node.getOperator() != null) {
            info += " " + node.getOperator();
        }
        if (node.getValue() != null) {
            info += " \"" + escapeQuotes(node.getValue()) + "\"";
        }
        info += "]";
        printNodeFormatted(prefix, connector, "CssAttributeSelector", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitCssPseudoSelector(CssPseudoSelectorNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[PSEUDO] :" + node.getPseudoName();
        if (node.getPseudoExpression() != null) {
            info += "(" + node.getPseudoExpression() + ")";
        }
        printNodeFormatted(prefix, connector, "CssPseudoSelector", info, node.getLineNumber());
        return output.toString();
    }

    // Removed visitCssCombinator - combinators are now strings in CssSelectorNode

    @Override
    public String visitCssDeclaration(CssDeclarationNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[DECL] Declaration";
        if (node.isImportant()) {
            info += " !important";
        }
        printNodeFormatted(prefix, connector, "CssDeclaration", info, node.getLineNumber());
        
        List<AstNode> children = new ArrayList<>();
        if (node.getProperty() != null) {
            children.add(node.getProperty());
        }
        if (node.getValue() != null) {
            children.add(node.getValue());
        }
        
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }

    @Override
    public String visitCssProperty(CssPropertyNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[PROP] " + node.getPropertyName();
        if (node.isVariable()) {
            info += " (var)";
        }
        printNodeFormatted(prefix, connector, "CssProperty", info, node.getLineNumber());
        return output.toString();
    }

    @Override
    public String visitCssValue(CssValueNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[VALUE] Value (" + node.getParts().size() + " parts)";
        printNodeFormatted(prefix, connector, "CssValue", info, node.getLineNumber());
        
        // Use getNodeChildren which creates virtual ValuePartNode objects
        List<AstNode> children = getNodeChildren(node);
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            // Virtual ValuePartNode is handled in printTreeRecursive
            printTreeRecursive(children.get(i));
            popIsLast();
        }
        return output.toString();
    }

    // Removed visitCssValuePart - value parts are now ValuePart objects (inner class) in CssValueNode

    @Override
    public String visitCssAtRule(CssAtRuleNode node) {
        String prefix = getPrefix();
        String connector = isLastStack.isEmpty() ? "" : (isLastStack.get(isLastStack.size() - 1) ? TREE_LAST : TREE_EDGE);
        
        String info = "[AT-RULE] @" + node.getAtRuleName();
        if (!node.getValues().isEmpty()) {
            info += " " + String.join(" ", node.getValues());
        }
        printNodeFormatted(prefix, connector, "CssAtRule", info, node.getLineNumber());
        
        List<AstNode> children = node.getBody();
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            pushIsLast(isLast);
            children.get(i).accept(this);
            popIsLast();
        }
        return output.toString();
    }
    
    /**
     * Helper classes for simplified nodes (stored as strings/primitives, displayed as virtual nodes)
     */
    private static class IdNode extends AstNode {
        private String id;
        
        IdNode(String id) {
            this.id = id;
            this.nodeName = "ID";
            this.lineNumber = -1;
        }
        
        String getId() {
            return id;
        }
        
        @Override
        public <T> T accept(AstVisitor<T> visitor) {
            // Virtual node - handled in printTreeRecursive
            return null;
        }
    }
    
    private static class TypeSelectorNode extends AstNode {
        private String elementName;
        
        TypeSelectorNode(String elementName) {
            this.elementName = elementName;
            this.nodeName = "CssTypeSelector";
            this.lineNumber = -1;
        }
        
        String getElementName() {
            return elementName;
        }
        
        @Override
        public <T> T accept(AstVisitor<T> visitor) {
            // Virtual node - handled in printTreeRecursive
            return null;
        }
    }
    
    private static class ClassSelectorNode extends AstNode {
        private String className;
        
        ClassSelectorNode(String className) {
            this.className = className;
            this.nodeName = "CssClassSelector";
            this.lineNumber = -1;
        }
        
        String getClassName() {
            return className;
        }
        
        @Override
        public <T> T accept(AstVisitor<T> visitor) {
            // Virtual node - handled in printTreeRecursive
            return null;
        }
    }
    
    private static class UniversalSelectorNode extends AstNode {
        UniversalSelectorNode() {
            this.nodeName = "CssUniversalSelector";
            this.lineNumber = -1;
        }
        
        @Override
        public <T> T accept(AstVisitor<T> visitor) {
            // Virtual node - handled in printTreeRecursive
            return null;
        }
    }
    
    private static class CombinatorNode extends AstNode {
        private String combinator;
        
        CombinatorNode(String combinator) {
            this.combinator = combinator;
            this.nodeName = "CssCombinator";
            this.lineNumber = -1;
        }
        
        String getCombinator() {
            return combinator;
        }
        
        @Override
        public <T> T accept(AstVisitor<T> visitor) {
            // Virtual node - handled in printTreeRecursive
            return null;
        }
    }
    
    private static class ValuePartNode extends AstNode {
        private CssValueNode.ValuePart part;
        
        ValuePartNode(CssValueNode.ValuePart part) {
            this.part = part;
            this.nodeName = "CssValuePart";
            this.lineNumber = -1;
        }
        
        CssValueNode.ValuePart getPart() {
            return part;
        }
        
        @Override
        public <T> T accept(AstVisitor<T> visitor) {
            // Virtual node - handled in printTreeRecursive
            return null;
        }
    }
}
