package ast;

import visitor.AstVisitor;

public class AttributeNode extends AstNode {
    private String name;
    private String value;

    public AttributeNode(String name) {
        this.name = name;
        this.value = null;
    }

    public AttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAttribute(this);
    }
}
