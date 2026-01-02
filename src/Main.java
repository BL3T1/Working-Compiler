import ast.*;
import visitor.HtmlAstBuilder;
import visitor.CssAstBuilder;
import visitor.AstPrinter;
import symbol.*;
import Grammar.HTML.*;
import Grammar.CSS.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Use default files if arguments not provided
        String htmlFilePath;
        String cssFilePath;

        if (args.length >= 2) {
            htmlFilePath = args[0];
            cssFilePath = args[1];
        } else {
            // Use default test files
            htmlFilePath = "tests\\HTML\\index.html";
            cssFilePath = "tests\\CSS\\style.css";
            System.out.println("No arguments provided. Using default files:");
            System.out.println("  HTML: " + htmlFilePath);
            System.out.println("  CSS:  " + cssFilePath);
            System.out.println();
        }

        try {
            HtmlDocumentNode htmlAst = parseHtmlFile(htmlFilePath);

            CssStylesheetNode cssAst = parseCssFile(cssFilePath);

            SymbolTable htmlSymbolTable = buildHtmlSymbolTable(htmlAst);
            SymbolTable cssSymbolTable = buildCssSymbolTable(cssAst);

            System.out.println("═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("HTML AST");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════");
            AstPrinter htmlPrinter = new AstPrinter();
            System.out.println(htmlPrinter.print(htmlAst));
            System.out.println();

            System.out.println("═══════════════════════════════════════════════════════════════════════════════");
            System.out.println("CSS AST");
            System.out.println("═══════════════════════════════════════════════════════════════════════════════");
            AstPrinter cssPrinter = new AstPrinter();
            System.out.println(cssPrinter.print(cssAst));
            System.out.println();

            printSymbolTable("HTML Symbol Table", htmlSymbolTable);
            System.out.println();
            printSymbolTable("CSS Symbol Table", cssSymbolTable);



        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error parsing file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static HtmlDocumentNode parseHtmlFile(String filePath) throws IOException {
        // Read file content
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        // Create lexer
        CharStream charStream = CharStreams.fromString(content);
        HtmlJinjaLexer lexer = new HtmlJinjaLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        HtmlJinjaParser parser = new HtmlJinjaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("HTML Parse error at line " + line + ":" + charPositionInLine + " - " + msg);
            }
        });

        // Parse
        HtmlJinjaParser.HtmlContext tree = parser.html();

        // Build AST
        HtmlAstBuilder astBuilder = new HtmlAstBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astBuilder, tree);

        return astBuilder.getDocument();
    }

    private static CssStylesheetNode parseCssFile(String filePath) throws IOException {
        // Read file content
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        // Create lexer
        CharStream charStream = CharStreams.fromString(content);
        CssLexer lexer = new CssLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        CssParser parser = new CssParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("CSS Parse error at line " + line + ":" + charPositionInLine + " - " + msg);
            }
        });

        // Parse
        CssParser.StylesheetContext tree = parser.stylesheet();

//        // print parse tree
//        System.out.println("--- CSS PARSE TREE ---");
//        System.out.println(tree.toStringTree(parser));
//        System.out.println();

        // Build AST
        CssAstBuilder astBuilder = new CssAstBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(astBuilder, tree);

        return astBuilder.getStylesheet();
    }

    private static void printSymbolTable(String title, SymbolTable symbolTable) {
        String border = repeatString("═", 78);
        System.out.println("╔" + border + "╗");
        System.out.println("║ " + String.format("%-76s", title) + "║");
        System.out.println("╠" + border + "╣");
        printSymbolTableRecursive(symbolTable, 0);
        System.out.println("╚" + border + "╝");
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static void printSymbolTableRecursive(SymbolTable symbolTable, int indent) {
        String indentStr = repeatString("  ", indent);
        String scopePrefix = indent == 0 ? "║ " : "│ ";
        
        // Print scope header
        String scopeInfo = String.format("Scope: %s (Level: %d)", 
            symbolTable.getScopeName(), symbolTable.getScopeLevel());
        System.out.println(scopePrefix + indentStr + scopeInfo);
        
        // Print symbols
        Map<String, SymbolEntry> symbols = symbolTable.getSymbols();
        if (symbols.isEmpty()) {
            System.out.println(scopePrefix + indentStr + "  (empty)");
        } else {
            for (Map.Entry<String, SymbolEntry> entry : symbols.entrySet()) {
                SymbolEntry symbol = entry.getValue();
                String symbolLine = formatSymbolEntry(symbol);
                System.out.println(scopePrefix + indentStr + "  " + symbolLine);
            }
        }
        
        // Print child scopes
        for (SymbolTable child : symbolTable.getChildScopes()) {
            printSymbolTableRecursive(child, indent + 1);
        }
    }

    private static String formatSymbolEntry(SymbolEntry entry) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-30s", entry.getName()));
        sb.append(" │ ");
        sb.append(String.format("%-20s", entry.getType().toString()));
        sb.append(" │ ");
        if (entry.getValue() != null) {
            String value = entry.getValue().toString();
            if (value.length() > 25) {
                value = value.substring(0, 22) + "...";
            }
            sb.append(String.format("%-25s", value));
        } else {
            sb.append(String.format("%-25s", ""));
        }
        if (entry.getLineNumber() >= 0) {
            sb.append(" │ Line: ").append(entry.getLineNumber());
        }
        return sb.toString();
    }

    private static SymbolTable buildHtmlSymbolTable(HtmlDocumentNode htmlAst) {
        SymbolTable symbolTable = new SymbolTable("HTML Document", null);
        buildHtmlSymbolTableRecursive(htmlAst, symbolTable);
        return symbolTable;
    }

    private static void buildHtmlSymbolTableRecursive(AstNode node, SymbolTable symbolTable) {
        if (node instanceof HtmlTagNode) {
            HtmlTagNode tag = (HtmlTagNode) node;
            String symbolName = "tag_" + tag.getTagName();
            SymbolEntry entry = new SymbolEntry(symbolName, SymbolType.HTML_TAG, 
                tag.getTagName(), tag.getLineNumber(), symbolTable.getScopeName());
            symbolTable.insert(symbolName, entry);

            // Add attributes
            for (AttributeNode attr : tag.getAttributes()) {
                String attrName = "attr_" + attr.getName();
                SymbolEntry attrEntry = new SymbolEntry(attrName, SymbolType.HTML_ATTRIBUTE,
                    attr.getValue(), attr.getLineNumber(), symbolTable.getScopeName());
                symbolTable.insert(attrName, attrEntry);
            }

            // Process children
            for (AstNode child : tag.getChildren()) {
                buildHtmlSymbolTableRecursive(child, symbolTable);
            }
        } else if (node instanceof JinjaExpressionNode) {
            JinjaExpressionNode expr = (JinjaExpressionNode) node;
            String exprStr = expr.getExpression();
            if (exprStr != null && !exprStr.trim().isEmpty()) {
                String varName = "jinja_var_" + exprStr.trim().replaceAll("[^a-zA-Z0-9_]", "_");
                SymbolEntry entry = new SymbolEntry(varName, SymbolType.TEMPLATE_VAR,
                    exprStr, expr.getLineNumber(), symbolTable.getScopeName());
                symbolTable.insert(varName, entry);
            }
        } else if (node instanceof JinjaStatementNode) {
            JinjaStatementNode stmt = (JinjaStatementNode) node;
            String stmtStr = stmt.getStatement();
            if (stmtStr != null && !stmtStr.trim().isEmpty()) {
                String stmtName = "jinja_stmt_" + stmtStr.trim().replaceAll("[^a-zA-Z0-9_]", "_");
                SymbolEntry entry = new SymbolEntry(stmtName, SymbolType.FUNCTION,
                    stmtStr, stmt.getLineNumber(), symbolTable.getScopeName());
                symbolTable.insert(stmtName, entry);
            }
        } else if (node instanceof HtmlDocumentNode) {
            HtmlDocumentNode doc = (HtmlDocumentNode) node;
            for (AstNode child : doc.getChildren()) {
                buildHtmlSymbolTableRecursive(child, symbolTable);
            }
        }
    }

    private static SymbolTable buildCssSymbolTable(CssStylesheetNode cssAst) {
        SymbolTable symbolTable = new SymbolTable("CSS Stylesheet", null);
        buildCssSymbolTableRecursive(cssAst, symbolTable);
        return symbolTable;
    }

    private static void buildCssSymbolTableRecursive(AstNode node, SymbolTable symbolTable) {
        if (node instanceof CssRuleNode) {
            CssRuleNode rule = (CssRuleNode) node;
            if (rule.getSelector() != null) {
                String selectorStr = extractSelectorString(rule.getSelector());
                String selectorName = "selector_" + selectorStr.replaceAll("[^a-zA-Z0-9_]", "_");
                SymbolEntry entry = new SymbolEntry(selectorName, SymbolType.CSS_SELECTOR,
                    selectorStr, rule.getLineNumber(), symbolTable.getScopeName());
                symbolTable.insert(selectorName, entry);
            }

            // Add properties
            for (CssDeclarationNode decl : rule.getDeclarations()) {
                if (decl.getProperty() != null) {
                    String propName = decl.getProperty().getPropertyName();
                    String symbolName = "property_" + propName.replaceAll("[^a-zA-Z0-9_]", "_");
                    SymbolEntry propEntry = new SymbolEntry(symbolName, SymbolType.CSS_PROPERTY,
                        propName, decl.getLineNumber(), symbolTable.getScopeName());
                    symbolTable.insert(symbolName, propEntry);
                }
            }
        } else if (node instanceof CssAtRuleNode) {
            CssAtRuleNode atRule = (CssAtRuleNode) node;
            String atRuleName = "atrule_" + atRule.getAtRuleName().replaceAll("[^a-zA-Z0-9_]", "_");
            SymbolEntry entry = new SymbolEntry(atRuleName, SymbolType.FUNCTION,
                atRule.getAtRuleName(), atRule.getLineNumber(), symbolTable.getScopeName());
            symbolTable.insert(atRuleName, entry);

            for (AstNode bodyNode : atRule.getBody()) {
                buildCssSymbolTableRecursive(bodyNode, symbolTable);
            }
        } else if (node instanceof CssStylesheetNode) {
            CssStylesheetNode stylesheet = (CssStylesheetNode) node;
            for (AstNode rule : stylesheet.getRules()) {
                buildCssSymbolTableRecursive(rule, symbolTable);
            }
        }
    }

    private static String extractSelectorString(CssSelectorNode selector) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < selector.getSimpleSelectors().size(); i++) {
            if (i > 0 && i <= selector.getCombinators().size()) {
                String combinator = selector.getCombinators().get(i - 1);
                sb.append(combinator.equals(" ") ? " " : combinator);
            }
            CssSimpleSelectorNode simple = selector.getSimpleSelectors().get(i);
            if (simple.getTypeSelector() != null) {
                sb.append(simple.getTypeSelector());
            } else if (simple.hasUniversalSelector()) {
                sb.append("*");
            }
            for (String id : simple.getIds()) {
                sb.append("#").append(id);
            }
            for (String className : simple.getClasses()) {
                sb.append(".").append(className);
            }
        }
        return sb.length() > 0 ? sb.toString() : "selector";
    }
}
