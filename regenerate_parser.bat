@echo off
echo Regenerating Parsers from grammar files...
echo.

REM Check if ANTLR JAR exists
if not exist "lib\antlr4.jar" (
    echo Error: lib\antlr4.jar not found!
    echo Please download ANTLR 4.13.1 or later and place it in the lib folder.
    exit /b 1
)

REM Create gen directory if it doesn't exist
if not exist "gen" (
    mkdir "gen" 2>nul
)

REM Generate HTML lexer first
echo Generating HtmlJinjaLexer...
java -cp "lib\antlr4.jar" org.antlr.v4.Tool -package Grammar.HTML -o gen Grammar\HTML\HtmlJinjaLexer.g4

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo HTML lexer regeneration failed!
    exit /b 1
)

REM Move files from gen\src\Grammar\HTML\ to gen\Grammar\HTML\ (ANTLR preserves src directory)
if exist "gen\src\Grammar\HTML\*.*" (
    if not exist "gen\Grammar\HTML" (
        mkdir "gen\Grammar\HTML" 2>nul
    )
    move /Y "gen\src\Grammar\HTML\*.*" "gen\Grammar\HTML\" >nul 2>&1
    rmdir /s /q "gen\src" 2>nul
)

REM Copy tokens file to grammar directory so parser can find it
if exist "gen\Grammar\HTML\HtmlJinjaLexer.tokens" (
    copy /Y "gen\Grammar\HTML\HtmlJinjaLexer.tokens" "Grammar\HTML\" >nul 2>&1
)

REM Generate HTML parser
echo Generating HtmlJinjaParser...
REM Use -o gen so ANTLR creates the package structure correctly (Grammar/HTML/)
java -cp "lib\antlr4.jar" org.antlr.v4.Tool -visitor -listener -package Grammar.HTML -o gen Grammar\HTML\HtmlJinjaParser.g4

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo HTML parser regeneration failed!
    exit /b 1
)

REM Move parser files from gen\src\Grammar\HTML\ to gen\Grammar\HTML\ if they were created there
if exist "gen\src\Grammar\HTML\*.*" (
    move /Y "gen\src\Grammar\HTML\*.*" "gen\Grammar\HTML\" >nul 2>&1
    rmdir /s /q "gen\src" 2>nul
)

REM Clean up tokens file from grammar directory
if exist "Grammar\HTML\HtmlJinjaLexer.tokens" (
    del /Q "Grammar\HTML\HtmlJinjaLexer.tokens" >nul 2>&1
)

echo   [OK] HTML parser regenerated

REM Generate CSS parser if grammar exists
if exist "Grammar\CSS\CssLexer.g4" (
    echo Generating CssParser...
    java -cp "lib\antlr4.jar" org.antlr.v4.Tool -visitor -listener -package Grammar.CSS -o gen Grammar\CSS\CssLexer.g4 Grammar\CSS\CssParser.g4
    if %ERRORLEVEL% EQU 0 (
        REM Move files from gen\src\Grammar\CSS\ to gen\Grammar\CSS\ (ANTLR preserves src directory)
        if exist "gen\src\Grammar\CSS\*.*" (
            if not exist "gen\Grammar\CSS" (
                mkdir "gen\Grammar\CSS" 2>nul
            )
            move /Y "gen\src\Grammar\CSS\*.*" "gen\Grammar\CSS\" >nul 2>&1
            rmdir /s /q "gen\src" 2>nul
        )
        echo   [OK] CSS parser regenerated
    ) else (
        echo   [WARNING] CSS parser regeneration failed (may not be critical)
    )
)

echo.
echo Parser regeneration complete!
echo Generated files are in gen\Grammar\HTML\ and gen\Grammar\CSS\

