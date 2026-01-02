package symbol;

import java.util.*;

/**
 * Symbol Table for storing and managing symbols (variables, functions, etc.)
 * Supports nested scopes for proper symbol resolution
 */
public class SymbolTable {
    private Map<String, SymbolEntry> symbols;
    private SymbolTable parentScope;
    private List<SymbolTable> childScopes;
    private String scopeName;
    private int scopeLevel;

    public SymbolTable() {
        this("global", null);
    }

    public SymbolTable(String scopeName, SymbolTable parentScope) {
        this.symbols = new HashMap<>();
        this.parentScope = parentScope;
        this.childScopes = new ArrayList<>();
        this.scopeName = scopeName;
        this.scopeLevel = parentScope != null ? parentScope.scopeLevel + 1 : 0;
    }

    /**
     * Insert a symbol into the current scope
     */
    public boolean insert(String name, SymbolEntry entry) {
        if (symbols.containsKey(name)) {
            return false;
        }
        symbols.put(name, entry);
        return true;
    }

    /**
     * Look up a symbol in the current scope and parent scopes
     */
    public SymbolEntry lookup(String name) {
        SymbolEntry entry = symbols.get(name);
        if (entry != null) {
            return entry;
        }
        if (parentScope != null) {
            return parentScope.lookup(name);
        }
        return null;
    }

    /**
     * Look up a symbol only in the current scope (not in parent scopes)
     */
    public SymbolEntry lookupLocal(String name) {
        return symbols.get(name);
    }

    /**
     * Remove a symbol from the current scope
     */
    public boolean remove(String name) {
        return symbols.remove(name) != null;
    }

    /**
     * Check if a symbol exists in the current scope
     */
    public boolean contains(String name) {
        return symbols.containsKey(name);
    }

    /**
     * Check if a symbol exists in current or parent scopes
     */
    public boolean containsRecursive(String name) {
        return lookup(name) != null;
    }

    /**
     * Create a new child scope
     */
    public SymbolTable enterScope(String scopeName) {
        SymbolTable child = new SymbolTable(scopeName, this);
        childScopes.add(child);
        return child;
    }

    /**
     * Exit current scope and return parent scope
     */
    public SymbolTable exitScope() {
        return parentScope;
    }

    /**
     * Get all symbols in the current scope
     */
    public Map<String, SymbolEntry> getSymbols() {
        return new HashMap<>(symbols);
    }

    /**
     * Get all symbols recursively (current and parent scopes)
     */
    public Map<String, SymbolEntry> getAllSymbols() {
        Map<String, SymbolEntry> allSymbols = new HashMap<>();
        if (parentScope != null) {
            allSymbols.putAll(parentScope.getAllSymbols());
        }
        allSymbols.putAll(symbols);
        return allSymbols;
    }

    /**
     * Get the number of symbols in the current scope
     */
    public int size() {
        return symbols.size();
    }

    /**
     * Get the total number of symbols including parent scopes
     */
    public int totalSize() {
        return getAllSymbols().size();
    }

    /**
     * Clear all symbols from the current scope
     */
    public void clear() {
        symbols.clear();
    }

    /**
     * Get the scope name
     */
    public String getScopeName() {
        return scopeName;
    }

    /**
     * Get the scope level (0 for global, 1 for first nested, etc.)
     */
    public int getScopeLevel() {
        return scopeLevel;
    }

    /**
     * Get parent scope
     */
    public SymbolTable getParentScope() {
        return parentScope;
    }

    /**
     * Get child scopes
     */
    public List<SymbolTable> getChildScopes() {
        return new ArrayList<>(childScopes);
    }

    /**
     * Print the symbol table in a readable format
     */
    public void print() {
        print(0);
    }

    private String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    private void print(int indent) {
        String indentStr = repeatString("  ", indent);
        System.out.println(indentStr + "Scope: " + scopeName + " (Level: " + scopeLevel + ")");
        if (symbols.isEmpty()) {
            System.out.println(indentStr + "  (empty)");
        } else {
            for (Map.Entry<String, SymbolEntry> entry : symbols.entrySet()) {
                System.out.println(indentStr + "  " + entry.getKey() + " -> " + entry.getValue());
            }
        }
        for (SymbolTable child : childScopes) {
            child.print(indent + 1);
        }
    }

    /**
     * Get a string representation of the symbol table
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scope: ").append(scopeName).append(" (Level: ").append(scopeLevel).append(")\n");
        if (symbols.isEmpty()) {
            sb.append("  (empty)\n");
        } else {
            for (Map.Entry<String, SymbolEntry> entry : symbols.entrySet()) {
                sb.append("  ").append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}

