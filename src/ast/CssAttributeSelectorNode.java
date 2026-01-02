package ast;

import visitor.AstVisitor;

public class CssAttributeSelectorNode extends AstNode {
    private String attributeName;
    private String operator;
    private String value;

    public CssAttributeSelectorNode(String attributeName) {
        this.attributeName = attributeName;
        this.operator = null;
        this.value = null;
    }

    public CssAttributeSelectorNode(String attributeName, String operator, String value) {
        this.attributeName = attributeName;
        this.operator = operator;
        this.value = value;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssAttributeSelector(this);
    }
}

