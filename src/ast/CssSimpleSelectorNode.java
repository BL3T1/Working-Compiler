package ast;

import visitor.AstVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents a simple selector (type, class, ID, attributes, pseudo).
 * Simplified:
 * - Type selector stored as string directly (not CssTypeSelectorNode wrapper)
 * - Universal selector stored as boolean flag
 * - Class selectors stored as strings directly (not CssClassSelectorNode wrappers)
 */
public class CssSimpleSelectorNode extends AstNode {
    private String typeSelector; // Element type (e.g., "div", "p", "body") - null if not present
    private boolean hasUniversalSelector; // True if universal selector (*) is present
    private List<String> ids; // ID selectors (#id) - stored as strings directly
    private List<String> classes; // Class selectors (.class) - stored as strings directly
    private List<CssAttributeSelectorNode> attributes; // Attribute selectors [attr]
    private List<CssPseudoSelectorNode> pseudos; // Pseudo selectors (:hover, ::before)

    public CssSimpleSelectorNode() {
        this.ids = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.attributes = new ArrayList<>();
        this.pseudos = new ArrayList<>();
        this.typeSelector = null;
        this.hasUniversalSelector = false;
    }

    public String getTypeSelector() {
        return typeSelector;
    }

    public void setTypeSelector(String typeSelector) {
        this.typeSelector = typeSelector;
    }

    public boolean hasUniversalSelector() {
        return hasUniversalSelector;
    }

    public void setUniversalSelector(boolean hasUniversal) {
        this.hasUniversalSelector = hasUniversal;
    }

    public List<String> getIds() {
        return ids;
    }

    public void addId(String id) {
        if (id != null) {
            ids.add(id);
        }
    }

    public List<String> getClasses() {
        return classes;
    }

    public void addClass(String className) {
        if (className != null) {
            classes.add(className);
        }
    }

    public List<CssAttributeSelectorNode> getAttributes() {
        return attributes;
    }

    public void addAttribute(CssAttributeSelectorNode attribute) {
        if (attribute != null) {
            attributes.add(attribute);
        }
    }

    public List<CssPseudoSelectorNode> getPseudos() {
        return pseudos;
    }

    public void addPseudo(CssPseudoSelectorNode pseudo) {
        if (pseudo != null) {
            pseudos.add(pseudo);
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitCssSimpleSelector(this);
    }
}
