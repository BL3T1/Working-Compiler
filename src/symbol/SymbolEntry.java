package symbol;

/**
 * Represents a symbol entry in the symbol table
 */
public class SymbolEntry {
    private String name;
    private SymbolType type;
    private Object value;
    private int lineNumber;
    private String scope;

    public SymbolEntry(String name, SymbolType type) {
        this(name, type, null, -1, null);
    }

    public SymbolEntry(String name, SymbolType type, Object value) {
        this(name, type, value, -1, null);
    }

    public SymbolEntry(String name, SymbolType type, Object value, int lineNumber) {
        this(name, type, value, lineNumber, null);
    }

    public SymbolEntry(String name, SymbolType type, Object value, int lineNumber, String scope) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.lineNumber = lineNumber;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SymbolType getType() {
        return type;
    }

    public void setType(SymbolType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SymbolEntry{name='").append(name).append("'");
        sb.append(", type=").append(type);
        if (value != null) {
            sb.append(", value=").append(value);
        }
        if (lineNumber >= 0) {
            sb.append(", line=").append(lineNumber);
        }
        if (scope != null) {
            sb.append(", scope='").append(scope).append("'");
        }
        sb.append("}");
        return sb.toString();
    }
}

