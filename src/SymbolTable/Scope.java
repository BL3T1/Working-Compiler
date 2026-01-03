package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Scope parent;
    private Map<String, Symbol> symbols = new HashMap<>();
    private String scopeName;

    public Scope(String name, Scope parent) {
        this.scopeName = name;
        this.parent = parent;
    }

    public void define(Symbol sym) {
        symbols.put(sym.name, sym);
    }

    public Symbol resolve(String name) {

        Symbol s = symbols.get(name);
        if (s != null) return s;

        if (parent != null) return parent.resolve(name);
        return null;
    }

    public Scope getParent() { return parent; }

    public void print() {
        System.out.println("\n--- Scope: " + scopeName + " ---");
        for (Symbol s : symbols.values()) {
            System.out.println(s.name + " (" + s.type + ") at line " + s.line);
        }
    }
}