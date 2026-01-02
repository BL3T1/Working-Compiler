package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

public class HtmlTagNode extends AstNode {
    private String tagName;
    private List<AttributeNode> attributes;
    private List<AstNode> children;
    private boolean selfClosing;

    public HtmlTagNode(String tagName) {
        this.tagName = tagName;
        this.attributes = new ArrayList<>();
        this.children = new ArrayList<>();
        this.selfClosing = false;
    }

    public HtmlTagNode(String tagName, boolean selfClosing) {
        this.tagName = tagName;
        this.attributes = new ArrayList<>();
        this.children = new ArrayList<>();
        this.selfClosing = selfClosing;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<AttributeNode> getAttributes() {
        return attributes;
    }

    public void addAttribute(AttributeNode attribute) {
        if (attribute != null) {
            attributes.add(attribute);
        }
    }

    public List<AstNode> getChildren() {
        return children;
    }

    public void addChild(AstNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitHtmlTag(this);
    }
}
