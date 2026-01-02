package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

public class StyleTagNode extends AstNode {
    private List<AttributeNode> attributes;
    private String content;  // Raw text content (without Jinja nodes)
    private List<AstNode> children;  // Jinja expressions/statements and text nodes

    public StyleTagNode() {
        this.attributes = new ArrayList<>();
        this.content = null;
        this.children = new ArrayList<>();
    }

    public StyleTagNode(String content) {
        this.attributes = new ArrayList<>();
        this.content = content;
        this.children = new ArrayList<>();
    }

    public List<AttributeNode> getAttributes() {
        return attributes;
    }

    public void addAttribute(AttributeNode attribute) {
        if (attribute != null) {
            attributes.add(attribute);
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<AstNode> getChildren() {
        return children;
    }

    public void addChild(AstNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitStyleTag(this);
    }
}

