package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

public class CssAtRuleNode extends AstNode {
    private String atRuleName;
    private List<String> values;
    private List<AstNode> body;

    public CssAtRuleNode(String atRuleName) {
        this.atRuleName = atRuleName;
        this.values = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public String getAtRuleName() {
        return atRuleName;
    }

    public void setAtRuleName(String atRuleName) {
        this.atRuleName = atRuleName;
    }

    public List<String> getValues() {
        return values;
    }

    public void addValue(String value) {
        if (value != null) {
            values.add(value);
        }
    }

    public List<AstNode> getBody() {
        return body;
    }

    public void addBodyNode(AstNode node) {
        if (node != null) {
            body.add(node);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssAtRule(this);
    }
}

