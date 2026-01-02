# Compiler Project - HTML/CSS Parser with Jinja2 Support

## Project Overview

This project implements a compiler for HTML and CSS files with Jinja2 template syntax support. It uses ANTLR4 for lexical analysis and parsing, builds Abstract Syntax Trees (AST), maintains symbol tables, and provides comprehensive AST printing functionality.

## Table of Contents

1. [Project Structure](#project-structure)
2. [Requirements](#requirements)
3. [Installation & Setup](#installation--setup)
4. [Usage](#usage)
5. [Architecture](#architecture)
6. [Grammar Definitions](#grammar-definitions)
7. [AST Structure](#ast-structure)
8. [Visitor Pattern](#visitor-pattern)
9. [Symbol Table](#symbol-table)
10. [AST Printing](#ast-printing)
11. [Code Examples](#code-examples)
12. [API Reference](#api-reference)

---

## Project Structure

```
Compiler/
├── Grammar/                    # ANTLR4 grammar files
│   ├── CSS/
│   │   ├── CssLexer.g4        # CSS lexer grammar
│   │   └── CssParser.g4       # CSS parser grammar
│   └── HTML/
│       ├── HtmlJinjaLexer.g4  # HTML+Jinja2 lexer grammar
│       └── HtmlJinjaParser.g4 # HTML+Jinja2 parser grammar
├── gen/                        # Generated ANTLR parser classes
│   ├── Grammar/
│   │   ├── CSS/               # Generated CSS parser classes
│   │   └── HTML/              # Generated HTML parser classes
├── src/
│   ├── ast/                   # AST node classes
│   │   ├── AstNode.java       # Base AST node class
│   │   ├── HtmlDocumentNode.java
│   │   ├── HtmlTagNode.java
│   │   ├── CssStylesheetNode.java
│   │   └── ...                # Other AST node classes
│   ├── visitor/               # Visitor pattern implementation
│   │   ├── AstVisitor.java    # Visitor interface
│   │   ├── HtmlAstBuilder.java # HTML AST builder visitor
│   │   ├── CssAstBuilder.java  # CSS AST builder visitor
│   │   └── AstPrinter.java     # AST printer visitor
│   ├── symbol/                # Symbol table implementation
│   │   ├── SymbolTable.java    # Symbol table class
│   │   ├── SymbolEntry.java   # Symbol entry class
│   │   └── SymbolType.java     # Symbol type enumeration
│   └── Main.java              # Main entry point
├── lib/
│   └── antlr4.jar             # ANTLR4 runtime library
├── out/                        # Compiled class files
├── build_and_run.bat           # All-in-one build and run script (recommended)
├── regenerate_parser.bat       # Parser regeneration script (standalone option)
└── README.md                   # This file
```

---

## Requirements

- **Java JDK** (version 8 or higher)
- **ANTLR4** (included as `lib/antlr4.jar`)
- **Windows** (for batch scripts) or compatible shell

---

## Installation & Setup

1. **Clone or download the project**
   ```bash
   cd D:\Programming\Java\Compiler
   ```

2. **Verify ANTLR4 JAR is present**
   - Check that `lib/antlr4.jar` exists

3. **Build and Run (Recommended)**
   
   **Quick method - does everything:**
   
   **Command Prompt:**
   ```cmd
   build_and_run.bat example.html example.css
   ```
   
   **PowerShell:**
   ```powershell
   .\build_and_run.bat example.html example.css
   ```
   
   This will automatically:
   - Verify prerequisites
   - Regenerate parser from grammar
   - Compile all source files
   - Run the compiler
   
   **To build only (without running):**
   ```cmd
   build_and_run.bat
   ```

4. **Manual Build (Alternative)**
   
   If you prefer step-by-step:
   
   **a. Regenerate Parser** (if grammar modified):
   ```cmd
   regenerate_parser.bat
   ```
   
   **b. Build and Run:**
   
   **In Command Prompt (CMD):**
   ```bash
   build_and_run.bat example.html example.css
   ```
   
   **In PowerShell:**
   ```powershell
   .\build_and_run.bat example.html example.css
   ```
   
   This will:
   - Verify prerequisites
   - Regenerate parser from grammar
   - Compile all source files (AST, visitor, symbol, Main, parser classes)
   - Run the compiler with your files

---

## Usage

### Quick Start: All-in-One Script (Recommended)

**The easiest way - builds and runs everything:**

**Command Prompt (CMD):**
```cmd
build_and_run.bat example.html example.css
```

**PowerShell:**
```powershell
.\build_and_run.bat example.html example.css
```

This single command will:
1. ✅ Verify prerequisites
2. ✅ Regenerate parser from grammar
3. ✅ Compile all source files
4. ✅ Run the compiler with your files

**To build only (without running):**
```cmd
build_and_run.bat
```

---

### Manual Usage (Step-by-Step)

If you prefer to run each step separately:

**Step 1: Regenerate Parser** (if grammar modified)
```cmd
regenerate_parser.bat
```

**Step 2: Build and Run**
```cmd
build_and_run.bat example.html example.css
```

**Or build only (without running):**
```cmd
build_and_run.bat
```

**Or manually:**
```bash
java -cp "out;lib\antlr4.jar;gen" Main example.html example.css
```

**Note**: In PowerShell, you must prefix batch files with `.\` (e.g., `.\build_and_run.bat` instead of `build_and_run.bat`)

### Command Line Arguments

```
Usage: java Main <html_file> <css_file>
Example: java Main example.html example.css
```

### Output

The program produces:
1. **HTML AST** - Complete abstract syntax tree for the HTML file
2. **CSS AST** - Complete abstract syntax tree for the CSS file
3. **HTML Symbol Table** - All symbols found in HTML (tags, attributes, Jinja2 variables)
4. **CSS Symbol Table** - All symbols found in CSS (selectors, properties, at-rules)
5. **Summary Statistics** - Counts of different node types

---

## Architecture

### High-Level Architecture

```
Source Files (HTML/CSS)
    ↓
Lexer (ANTLR4)
    ↓
Parser (ANTLR4)
    ↓
Parse Tree
    ↓
AST Builder Visitor
    ↓
Abstract Syntax Tree (AST)
    ↓
Symbol Table Builder
    ↓
AST Printer
    ↓
Output (Formatted AST + Symbol Tables)
```

### Design Patterns Used

1. **Visitor Pattern**: For traversing and building ASTs
2. **Composite Pattern**: AST nodes form a tree structure
3. **Factory Pattern**: AST nodes created by visitors
4. **OOP Principles**: Inheritance, polymorphism, encapsulation

---

## Grammar Definitions

### HTML Grammar with Jinja2

The HTML grammar supports:
- Standard HTML tags (opening, closing, self-closing)
- HTML attributes (with and without values)
- Jinja2 expressions: `{{ expression }}`
- Jinja2 statements: `{% statement %}`
- Jinja2 comments: `{# comment #}`
- Script tags with content
- Style tags with content
- HTML text content

**Key Rules:**
- `html`: Root rule containing elements, text, and Jinja2 constructs
- `element`: HTML tags, self-closing tags, script/style tags
- `tagOpen`: Opening tag with attributes
- `tagContent`: Content between opening and closing tags
- `jinjaExpr`: Jinja2 expression `{{ ... }}`
- `jinjaStmt`: Jinja2 statement `{% ... %}`

### CSS Grammar

The CSS grammar supports:
- CSS rules with selectors and declarations
- Complex selectors (type, class, ID, attribute, pseudo-classes/elements)
- Combinators (child `>`, adjacent sibling `+`, general sibling `~`)
- CSS declarations (property: value)
- CSS values (identifiers, numbers, strings, URLs, functions, etc.)
- At-rules (`@media`, `@keyframes`, `@import`, etc.)
- CSS variables (`var()`)
- Important declarations

**Key Rules:**
- `stylesheet`: Root rule containing rules and at-rules
- `rule`: Selector with declaration block
- `selector`: Simple selectors with combinators
- `declaration`: Property-value pairs
- `atRule`: At-rules like `@media`, `@keyframes`

---

## AST Structure

### Base AST Node

All AST nodes extend `AstNode` which provides:
- `nodeName`: Name of the node (automatically set to class name)
- `lineNumber`: Line number where the node appears in source
- `accept(visitor)`: Visitor pattern acceptance method

### HTML AST Nodes

#### HtmlDocumentNode
- **Purpose**: Root node for HTML document
- **Children**: List of top-level elements (tags, text, Jinja2 constructs)
- **Methods**: `getChildren()`, `addChild(AstNode)`

#### HtmlTagNode
- **Purpose**: Represents HTML tags
- **Properties**:
  - `tagName`: Name of the tag
  - `attributes`: List of attributes
  - `children`: Child elements
  - `selfClosing`: Whether tag is self-closing
- **Methods**: `getTagName()`, `getAttributes()`, `getChildren()`, `isSelfClosing()`

#### HtmlTextNode
- **Purpose**: Represents text content
- **Properties**: `text`: Text content
- **Methods**: `getText()`

#### JinjaExpressionNode
- **Purpose**: Represents Jinja2 expressions `{{ ... }}`
- **Properties**: `expression`: Expression content
- **Methods**: `getExpression()`

#### JinjaStatementNode
- **Purpose**: Represents Jinja2 statements `{% ... %}`
- **Properties**: `statement`: Statement content
- **Methods**: `getStatement()`

#### AttributeNode
- **Purpose**: Represents HTML attributes
- **Properties**: `name`, `value` (optional)
- **Methods**: `getName()`, `getValue()`

### CSS AST Nodes

#### CssStylesheetNode
- **Purpose**: Root node for CSS stylesheet
- **Properties**: `rules`: List of rules and at-rules
- **Methods**: `getRules()`, `addRule(AstNode)`

#### CssRuleNode
- **Purpose**: Represents CSS rules
- **Properties**:
  - `selector`: Selector node
  - `declarations`: List of declarations
- **Methods**: `getSelector()`, `getDeclarations()`, `addDeclaration()`

#### CssSelectorNode
- **Purpose**: Represents CSS selectors
- **Properties**:
  - `simpleSelectors`: List of simple selectors
  - `combinators`: List of combinators between selectors
- **Methods**: `getSimpleSelectors()`, `getCombinators()`

#### CssSimpleSelectorNode
- **Purpose**: Represents simple selectors
- **Properties**:
  - `typeSelector`: Element type selector
  - `universalSelector`: Universal selector `*`
  - `ids`: List of ID selectors
  - `classes`: List of class selectors
  - `attributes`: List of attribute selectors
  - `pseudos`: List of pseudo-selectors
- **Methods**: Various getters and adders

#### CssDeclarationNode
- **Purpose**: Represents CSS declarations (property: value)
- **Properties**:
  - `property`: Property node
  - `value`: Value node
  - `important`: Whether `!important` is present
- **Methods**: `getProperty()`, `getValue()`, `isImportant()`

#### CssAtRuleNode
- **Purpose**: Represents CSS at-rules
- **Properties**:
  - `atRuleName`: Name of at-rule (e.g., `@media`)
  - `values`: List of values
  - `body`: Body content (rules, declarations)
- **Methods**: `getAtRuleName()`, `getValues()`, `getBody()`

### AST Node Hierarchy

```
AstNode (abstract base class)
├── HTML Nodes
│   ├── HtmlDocumentNode
│   ├── HtmlTagNode
│   ├── HtmlTextNode
│   ├── JinjaExpressionNode
│   ├── JinjaStatementNode
│   ├── JinjaCommentNode
│   ├── ScriptTagNode
│   ├── StyleTagNode
│   └── AttributeNode
└── CSS Nodes
    ├── CssStylesheetNode
    ├── CssRuleNode
    ├── CssSelectorNode
    ├── CssSimpleSelectorNode
    ├── CssTypeSelectorNode
    ├── CssUniversalSelectorNode
    ├── CssClassSelectorNode
    ├── CssAttributeSelectorNode
    ├── CssPseudoSelectorNode
    ├── CssCombinatorNode
    ├── CssDeclarationNode
    ├── CssPropertyNode
    ├── CssValueNode
    ├── CssValuePartNode
    └── CssAtRuleNode
```

---

## Visitor Pattern

The project uses the Visitor pattern for:
1. **Building ASTs** from parse trees
2. **Printing ASTs** in readable format
3. **Extensibility** for future operations (type checking, optimization, etc.)

### AstVisitor Interface

```java
public interface AstVisitor<T> {
    // HTML node visitors
    T visitHtmlDocument(HtmlDocumentNode node);
    T visitHtmlTag(HtmlTagNode node);
    T visitHtmlText(HtmlTextNode node);
    // ... other visit methods
}
```

### HtmlAstBuilder

**Purpose**: Builds HTML AST from parse tree

**Key Methods**:
- `enterHtml()`: Creates root document node
- `enterElement()`: Handles HTML elements (tags, script, style)
- `enterHtmlText()`: Handles text content
- `enterJinjaExpr()`: Handles Jinja2 expressions
- `enterJinjaStmt()`: Handles Jinja2 statements
- `getDocument()`: Returns built AST

**How it works**:
1. Uses a stack to track current parent node
2. On entering a rule, creates corresponding AST node
3. Sets line number from parser context
4. Pushes node onto stack
5. On exiting, pops node and adds to parent

### CssAstBuilder

**Purpose**: Builds CSS AST from parse tree

**Key Methods**:
- `enterStylesheet()`: Creates root stylesheet node
- `enterRule()`: Handles CSS rules
- `enterSelector()`: Handles selectors
- `enterDeclaration()`: Handles declarations
- `enterAtRule()`: Handles at-rules
- `getStylesheet()`: Returns built AST

**How it works**:
- Similar stack-based approach as HTML builder
- Handles complex CSS constructs (selectors, values, at-rules)

### AstPrinter

**Purpose**: Prints AST in human-readable format

**Features**:
- Indented tree structure
- Shows node name and line number
- Displays node-specific information
- Recursively prints all children

**Output Format**:
```
NodeName [Line: X]: Information
  ChildNode [Line: Y]: Information
    GrandChildNode [Line: Z]: Information
```

---

## Symbol Table

### SymbolTable Class

**Purpose**: Manages symbols (variables, functions, tags, selectors, etc.)

**Key Features**:
- **Nested Scopes**: Supports scope hierarchy
- **Symbol Lookup**: Recursive lookup in parent scopes
- **Symbol Insertion**: Prevents duplicate symbols in same scope
- **Scope Management**: Enter/exit scopes

**Main Methods**:

```java
// Insert a symbol
boolean insert(String name, SymbolEntry entry)

// Lookup symbol (current and parent scopes)
SymbolEntry lookup(String name)

// Lookup only in current scope
SymbolEntry lookupLocal(String name)

// Remove symbol
boolean remove(String name)

// Check existence
boolean contains(String name)
boolean containsRecursive(String name)

// Scope management
SymbolTable enterScope(String scopeName)
SymbolTable exitScope()

// Information
int size()                    // Symbols in current scope
int totalSize()               // All symbols including parents
Map<String, SymbolEntry> getSymbols()
void print()                  // Print symbol table
```

**Example Usage**:
```java
SymbolTable global = new SymbolTable("global", null);
SymbolEntry var = new SymbolEntry("x", SymbolType.VARIABLE, "value", 10, "global");
global.insert("x", var);

SymbolTable local = global.enterScope("function");
SymbolEntry localVar = new SymbolEntry("y", SymbolType.VARIABLE, null, 20, "function");
local.insert("y", localVar);

// Lookup in local scope
SymbolEntry found = local.lookup("x");  // Finds in parent scope
```

### SymbolEntry Class

**Purpose**: Represents a single symbol entry

**Properties**:
- `name`: Symbol name
- `type`: Symbol type (VARIABLE, FUNCTION, HTML_TAG, CSS_SELECTOR, etc.)
- `value`: Optional value
- `lineNumber`: Line where symbol is defined
- `scope`: Scope name where symbol is defined

### SymbolType Enum

**Types**:
- `VARIABLE`: Variable
- `FUNCTION`: Function
- `CLASS`: Class
- `TEMPLATE_VAR`: Jinja2 template variable
- `CSS_SELECTOR`: CSS selector
- `CSS_PROPERTY`: CSS property
- `HTML_TAG`: HTML tag
- `HTML_ATTRIBUTE`: HTML attribute
- `UNKNOWN`: Unknown type

### Symbol Table Building

The project automatically builds symbol tables for:
- **HTML**: Tags, attributes, Jinja2 variables and statements
- **CSS**: Selectors, properties, at-rules

Symbols are extracted during AST traversal and stored with their line numbers and types.

---

## AST Printing

### AstPrinter Class

**Purpose**: Formats and prints AST in readable tree structure

**Features**:
- Indented hierarchical display
- Shows node names and line numbers
- Displays node-specific information
- Handles all node types

**Usage**:
```java
AstPrinter printer = new AstPrinter();
String output = printer.print(astNode);
System.out.println(output);
```

**Output Example**:
```
HtmlDocumentNode [Line: 1]: Document
  HtmlTagNode [Line: 3]: <head> [6 children]
    HtmlTagNode [Line: 6]: <title> [1 children]
      JinjaExpressionNode [Line: 6]: {{  page_title  }}
  HtmlTagNode [Line: 9]: <body> [10 children]
    HtmlTagNode [Line: 11]: <h1> [2 children]
      HtmlTextNode [Line: 11]: "Welcome to "
      JinjaExpressionNode [Line: 11]: {{  site_name  }}
```

---

## Code Examples

### Example 1: Basic Usage

```java
// Parse HTML file
HtmlDocumentNode htmlAst = parseHtmlFile("example.html");

// Parse CSS file
CssStylesheetNode cssAst = parseCssFile("example.css");

// Print ASTs
AstPrinter printer = new AstPrinter();
System.out.println(printer.print(htmlAst));
System.out.println(printer.print(cssAst));
```

### Example 2: Building Symbol Table

```java
// Build symbol table from AST
SymbolTable symbolTable = buildHtmlSymbolTable(htmlAst);

// Insert a symbol
SymbolEntry entry = new SymbolEntry(
    "myVar", 
    SymbolType.VARIABLE, 
    "value", 
    10, 
    "global"
);
symbolTable.insert("myVar", entry);

// Lookup symbol
SymbolEntry found = symbolTable.lookup("myVar");
if (found != null) {
    System.out.println("Found: " + found.getName() + " at line " + found.getLineNumber());
}

// Print symbol table
symbolTable.print();
```

### Example 3: Traversing AST

```java
// Using visitor pattern
AstVisitor<Void> visitor = new AstVisitor<Void>() {
    @Override
    public Void visitHtmlTag(HtmlTagNode node) {
        System.out.println("Tag: " + node.getTagName() + " at line " + node.getLineNumber());
        // Visit children
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }
    // ... implement other visit methods
};

htmlAst.accept(visitor);
```

### Example 4: Custom AST Operation

```java
// Count all HTML tags
class TagCounter implements AstVisitor<Integer> {
    private int count = 0;
    
    @Override
    public Integer visitHtmlTag(HtmlTagNode node) {
        count++;
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return count;
    }
    
    @Override
    public Integer visitHtmlDocument(HtmlDocumentNode node) {
        for (AstNode child : node.getChildren()) {
            child.accept(this);
        }
        return count;
    }
    
    // ... implement other methods returning count
}

TagCounter counter = new TagCounter();
int tagCount = htmlAst.accept(counter);
System.out.println("Total tags: " + tagCount);
```

---

## API Reference

### Main Class

#### Methods

**`main(String[] args)`**
- Entry point
- Parameters: `args[0]` = HTML file path, `args[1]` = CSS file path
- Throws: `IOException`, general `Exception`

**`parseHtmlFile(String filePath)`**
- Parses HTML file and builds AST
- Returns: `HtmlDocumentNode`
- Throws: `IOException`

**`parseCssFile(String filePath)`**
- Parses CSS file and builds AST
- Returns: `CssStylesheetNode`
- Throws: `IOException`

**`buildHtmlSymbolTable(HtmlDocumentNode htmlAst)`**
- Builds symbol table from HTML AST
- Returns: `SymbolTable`

**`buildCssSymbolTable(CssStylesheetNode cssAst)`**
- Builds symbol table from CSS AST
- Returns: `SymbolTable`

### AstNode Class

#### Fields
- `protected String nodeName`: Name of the node
- `protected int lineNumber`: Line number (-1 if not set)

#### Methods
- `String getNodeName()`: Get node name
- `void setNodeName(String name)`: Set node name
- `int getLineNumber()`: Get line number
- `void setLineNumber(int line)`: Set line number
- `abstract <T> T accept(AstVisitor<T> visitor)`: Accept visitor

### SymbolTable Class

#### Constructors
- `SymbolTable()`: Creates global scope
- `SymbolTable(String scopeName, SymbolTable parent)`: Creates named scope

#### Methods
- `boolean insert(String name, SymbolEntry entry)`: Insert symbol
- `SymbolEntry lookup(String name)`: Lookup symbol recursively
- `SymbolEntry lookupLocal(String name)`: Lookup in current scope only
- `boolean remove(String name)`: Remove symbol
- `boolean contains(String name)`: Check in current scope
- `boolean containsRecursive(String name)`: Check recursively
- `SymbolTable enterScope(String name)`: Create child scope
- `SymbolTable exitScope()`: Return to parent scope
- `int size()`: Count in current scope
- `int totalSize()`: Count including parents
- `void print()`: Print symbol table

### AstPrinter Class

#### Methods
- `String print(AstNode node)`: Print AST starting from node
- Returns formatted string representation

---

## Error Handling

The parser includes error listeners that report:
- **Syntax errors**: Line number and character position
- **Parse errors**: Description of what went wrong

Errors are printed to stderr but don't stop execution. The parser attempts to recover and continue parsing.

---

## Limitations

1. **Grammar Coverage**: Some edge cases in HTML/CSS may not be fully supported
2. **Error Recovery**: Basic error recovery; may not handle all malformed input gracefully
3. **Performance**: Not optimized for very large files
4. **Jinja2 Parsing**: Only extracts Jinja2 syntax; doesn't validate or execute it

---

## Future Enhancements

Possible improvements:
1. Type checking for CSS properties
2. HTML validation (checking tag nesting, required attributes)
3. CSS minification
4. Code generation (HTML/CSS output from AST)
5. Better error messages with suggestions
6. Support for more CSS features (calc(), custom properties, etc.)
7. Support for more Jinja2 features

---

## Troubleshooting

### PowerShell Issues

**Problem**: `build_and_run.bat` not recognized in PowerShell
**Solution**: Use `.\build_and_run.bat` instead of `build_and_run.bat` in PowerShell

**Problem**: Batch files don't run
**Solution**: 
- In PowerShell: Use `.\build_and_run.bat` and `.\regenerate_parser.bat`
- In CMD: Use `build_and_run.bat` and `regenerate_parser.bat` directly
- Or use Command Prompt instead of PowerShell

### Compilation Errors

**Problem**: "cannot find symbol" errors
**Solution**: 
- Ensure `gen/` directory contains generated parser classes
- Run `.\build_and_run.bat` (PowerShell) or `build_and_run.bat` (CMD) to regenerate parser and compile
- Check that `lib/antlr4.jar` exists
- Verify parser was regenerated: `.\regenerate_parser.bat`

**Problem**: "package does not exist" errors
**Solution**:
- Verify all source files are in correct package directories
- Regenerate parser: `.\regenerate_parser.bat`
- Ensure parser uses correct output path (`-o gen` not `-o gen\Grammar\HTML`)
- Rebuild: `.\build_and_run.bat`

### Runtime Errors

**Problem**: "ClassNotFoundException" or "NoClassDefFoundError"
**Solution**:
- Ensure classpath includes `out`, `lib\antlr4.jar`, and `gen`
- Check that compilation was successful
- Verify Main.class exists in `out` directory
- Use correct classpath separator: `;` on Windows, `:` on Linux/Mac

**Problem**: "Main method not found"
**Solution**:
- Ensure Main class has `public static void main(String[] args)`
- Check Main class is in default package (no package declaration)
- Verify Main.class is in `out` directory root

**Problem**: Parse errors in output
**Solution**:
- Check that input files are valid HTML/CSS
- Some parse errors are expected for edge cases (e.g., DOCTYPE)
- AST will still be built for successfully parsed portions
- Parse errors don't stop execution

See [TROUBLESHOOTING.md](docs/TROUBLESHOOTING.md) for detailed troubleshooting guide.

---

## Documentation

Comprehensive documentation is available in the `docs/` directory:

- **[QUICK_START.md](docs/QUICK_START.md)** - Get started in 5 minutes
- **[BUILD_GUIDE.md](docs/BUILD_GUIDE.md)** - Complete build and AST construction guide
- **[USER_GUIDE.md](docs/USER_GUIDE.md)** - Detailed usage instructions
- **[API_REFERENCE.md](docs/API_REFERENCE.md)** - Complete API documentation
- **[TROUBLESHOOTING.md](docs/TROUBLESHOOTING.md)** - Common issues and solutions
- **[POWERSHELL_GUIDE.md](docs/POWERSHELL_GUIDE.md)** - PowerShell-specific instructions
- **[OUTPUT_VERIFICATION.md](docs/OUTPUT_VERIFICATION.md)** - How to verify output is correct

### Quick Links

- **First time user?** → See [QUICK_START.md](docs/QUICK_START.md)
- **How to build and run?** → See [BUILD_GUIDE.md](docs/BUILD_GUIDE.md)
- **Having trouble compiling?** → See [TROUBLESHOOTING.md](docs/TROUBLESHOOTING.md)
- **PowerShell errors?** → See [POWERSHELL_GUIDE.md](docs/POWERSHELL_GUIDE.md)
- **Need API details?** → See [API_REFERENCE.md](docs/API_REFERENCE.md)
- **Is the output correct?** → See [OUTPUT_VERIFICATION.md](docs/OUTPUT_VERIFICATION.md)

---

## License

This project is part of a compiler course assignment.

---

## Authors

Project developed for compiler course requirements.

---

## Version History

- **v1.0** - Initial implementation with:
  - HTML and CSS parsing
  - AST building with line numbers
  - Symbol table implementation
  - AST printing functionality

#   C o m p i l e r  
 