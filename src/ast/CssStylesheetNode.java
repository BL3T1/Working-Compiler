package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

public class CssStylesheetNode extends AstNode {
    private List<AstNode> rules;

    public CssStylesheetNode() {
        this.rules = new ArrayList<>();
    }

    public CssStylesheetNode(List<AstNode> rules) {
        this.rules = rules != null ? rules : new ArrayList<>();
    }

    public List<AstNode> getRules() {
        return rules;
    }

    public void addRule(AstNode rule) {
        if (rule != null) {
            rules.add(rule);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssStylesheet(this);
    }
}

