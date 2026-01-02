package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents a CSS value. This node directly holds a list of value parts
 * (simplified from the previous CssValueNode -> CssValuePartNode structure).
 * 
 * Value parts are semantic values only - no delimiter tokens (syntax leakage removed).
 */
public class CssValueNode extends AstNode {
    /**
     * Represents a single part of a CSS value.
     * Only semantic values are stored - no delimiter tokens.
     */
    public static class ValuePart {
        private String value;
        private String type; // "ident", "number", "string", "hash", "url", "var", "important"
        
        public ValuePart(String value, String type) {
            this.value = value;
            this.type = type;
        }
        
        public String getValue() {
            return value;
        }
        
        public String getType() {
            return type;
        }
    }
    
    private List<ValuePart> parts;

    public CssValueNode() {
        this.parts = new ArrayList<>();
    }

    public CssValueNode(List<ValuePart> parts) {
        this.parts = parts != null ? parts : new ArrayList<>();
    }

    public List<ValuePart> getParts() {
        return parts;
    }

    public void addPart(ValuePart part) {
        if (part != null) {
            parts.add(part);
        }
    }
    
    public void addPart(String value, String type) {
        if (value != null && type != null) {
            parts.add(new ValuePart(value, type));
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssValue(this);
    }
}
