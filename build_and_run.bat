@echo off
setlocal enabledelayedexpansion

REM ============================================
REM Complete Build and Run Script
REM ============================================
REM This script:
REM   1. Regenerates the parser from grammar files
REM   2. Compiles all Java source files
REM   3. Runs the compiler with provided HTML and CSS files
REM ============================================

echo.
echo ============================================
echo   Compiler Project - Complete Build and Run
echo ============================================
echo.

REM Initialize variables
set RUN_MODE=build_only
set HTML_FILE=
set CSS_FILE=

REM Check if arguments provided
if "%~1"=="" goto :no_args
if "%~2"=="" (
    echo.
    echo ERROR: CSS file not provided!
    echo.
    echo Usage: build_and_run.bat [html_file] [css_file]
    echo.
    echo Examples:
    echo   build_and_run.bat example.html example.css
    echo   build_and_run.bat tests\HTML\index.html tests\CSS\style.css
    echo.
    exit /b 1
)

REM Both arguments provided
set RUN_MODE=build_and_run
REM Normalize paths - remove .\ prefix if present
set "HTML_FILE=%~1"
set "CSS_FILE=%~2"
REM Remove leading .\ if present
if "!HTML_FILE:~0,2!"==".\" set "HTML_FILE=!HTML_FILE:~2!"
if "!CSS_FILE:~0,2!"==".\" set "CSS_FILE=!CSS_FILE:~2!"

echo HTML File: !HTML_FILE!
echo CSS File:  !CSS_FILE!
echo.
goto :args_ok

:no_args
echo Note: No files provided - will only build (regenerate + compile)
echo       To run after build, use: run.bat example.html example.css
echo.

:args_ok

REM ============================================
REM Step 1: Verify Prerequisites
REM ============================================
echo [Step 1/4] Verifying prerequisites...
echo.

REM Check Java
java -version >nul 2>&1
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Java is not installed or not in PATH!
    echo Please install Java JDK 8 or higher.
    exit /b 1
)
echo   [OK] Java found

REM Check ANTLR JAR
if not exist "lib\antlr4.jar" (
    echo ERROR: lib\antlr4.jar not found!
    echo Please ensure ANTLR4 JAR is in the lib directory.
    exit /b 1
)
echo   [OK] ANTLR4 JAR found

REM Check grammar files
if not exist "src\Grammar\HTML\HtmlJinjaLexer.g4" (
    echo ERROR: Grammar file not found: src\Grammar\HTML\HtmlJinjaLexer.g4
    exit /b 1
)
if not exist "src\Grammar\HTML\HtmlJinjaParser.g4" (
    echo ERROR: Grammar file not found: src\Grammar\HTML\HtmlJinjaParser.g4
    exit /b 1
)
echo   [OK] Grammar files found
echo.

REM ============================================
REM Step 2: Regenerate Parser
REM ============================================
echo [Step 2/4] Regenerating parser from grammar files...
echo.

REM Create gen directory if it doesn't exist
if not exist "gen" (
    mkdir "gen" 2>nul
)

REM Regenerate HTML lexer first
echo   Regenerating HtmlJinjaLexer...
java -cp "lib\antlr4.jar" org.antlr.v4.Tool -package Grammar.HTML -o gen src\Grammar\HTML\HtmlJinjaLexer.g4 >nul 2>&1

REM Regenerate HTML parser (with -lib to find tokens file)
echo   Regenerating HtmlJinjaParser...
REM Use -o gen so ANTLR creates the package structure correctly
REM Use -lib to tell parser where to find lexer tokens file
java -cp "lib\antlr4.jar" org.antlr.v4.Tool -visitor -listener -package Grammar.HTML -lib gen\Grammar\HTML -o gen src\Grammar\HTML\HtmlJinjaParser.g4 >nul 2>&1

if %ERRORLEVEL% NEQ 0 (
    echo   [ERROR] Failed to regenerate HTML parser!
    echo   Trying with verbose output...
    java -cp "lib\antlr4.jar" org.antlr.v4.Tool -visitor -listener -package Grammar.HTML -lib gen\Grammar\HTML -o gen src\Grammar\HTML\HtmlJinjaParser.g4
    exit /b 1
)

REM Clean up any incorrectly placed files (shouldn't happen with root Grammar folder)
if exist "gen\src\Grammar\HTML\*.*" (
    if not exist "gen\Grammar\HTML" (
        mkdir "gen\Grammar\HTML" 2>nul
    )
    move /Y "gen\src\Grammar\HTML\*.*" "gen\Grammar\HTML\" >nul 2>&1
    rmdir /s /q "gen\src" 2>nul
)
if exist "gen\src\Grammar\CSS\*.*" (
    if not exist "gen\Grammar\CSS" (
        mkdir "gen\Grammar\CSS" 2>nul
    )
    move /Y "gen\src\Grammar\CSS\*.*" "gen\Grammar\CSS\" >nul 2>&1
    rmdir /s /q "gen\src" 2>nul
)

echo   [OK] HTML parser regenerated

REM Regenerate CSS parser if grammar exists
if exist "src\Grammar\CSS\CssLexer.g4" (
    echo   Regenerating CssParser...
    java -cp "lib\antlr4.jar" org.antlr.v4.Tool -visitor -listener -package Grammar.CSS -o gen src\Grammar\CSS\CssLexer.g4 src\Grammar\CSS\CssParser.g4 >nul 2>&1
    if %ERRORLEVEL% EQU 0 (
        echo   [OK] CSS parser regenerated
        REM Clean up any incorrectly placed CSS files
        if exist "gen\src\Grammar\CSS\*.*" (
            if not exist "gen\Grammar\CSS" (
                mkdir "gen\Grammar\CSS" 2>nul
            )
            move /Y "gen\src\Grammar\CSS\*.*" "gen\Grammar\CSS\" >nul 2>&1
        )
    ) else (
        echo   [WARNING] CSS parser regeneration failed (may not be critical)
    )
)

REM Final cleanup - remove gen\src directory structure if it still exists
if exist "gen\src" (
    rmdir /s /q "gen\src" 2>nul
)

echo.

REM ============================================
REM Step 3: Compile Project
REM ============================================
echo [Step 3/4] Compiling Java source files...
echo.

REM Create out directory if it doesn't exist
if not exist "out" (
    mkdir "out" 2>nul
)

REM Compile all source files
REM Note: AST and visitor classes have circular dependencies, so compile them together
echo   Compiling AST and visitor classes...
javac -cp "lib\antlr4.jar;gen" -d out src\ast\*.java src\visitor\*.java 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo   [ERROR] Failed to compile AST and visitor classes
    javac -cp "lib\antlr4.jar;gen" -d out src\ast\*.java src\visitor\*.java
    exit /b 1
)

echo   Compiling symbol classes...
javac -cp "lib\antlr4.jar;gen;out" -d out src\symbol\*.java 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo   [ERROR] Failed to compile symbol classes
    javac -cp "lib\antlr4.jar;gen;out" -d out src\symbol\*.java
    exit /b 1
)

echo   Compiling Main class...
javac -cp "lib\antlr4.jar;gen;out" -d out src\Main.java 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo   [ERROR] Failed to compile Main class
    javac -cp "lib\antlr4.jar;gen;out" -d out src\Main.java
    exit /b 1
)

echo   Compiling generated parser classes...
javac -cp "lib\antlr4.jar;out" -d out gen\Grammar\HTML\*.java 2>nul
if %ERRORLEVEL% NEQ 0 (
    echo   [ERROR] Failed to compile HTML parser classes
    javac -cp "lib\antlr4.jar;out" -d out gen\Grammar\HTML\*.java
    exit /b 1
)

if exist "gen\Grammar\CSS\*.java" (
    javac -cp "lib\antlr4.jar;out" -d out gen\Grammar\CSS\*.java 2>nul
    if %ERRORLEVEL% EQU 0 (
        echo   [OK] CSS parser classes compiled
    )
)

echo   [OK] Compilation successful!
echo.

REM ============================================
REM Step 4: Run Compiler (if files provided)
REM ============================================
REM Check if we should run (files were provided)
if "%~1"=="" goto :skip_run
if "%~2"=="" goto :skip_run
goto :do_run

:skip_run
echo [Step 4/4] Build complete! (No files to run)
echo.
echo To run the compiler, use:
echo   build_and_run.bat example.html example.css
echo   OR
echo   run.bat example.html example.css
echo.
exit /b 0

:do_run

echo [Step 4/4] Running compiler...
echo.

REM Check if files exist (try both with and without .\ prefix)
set "HTML_CHECK=!HTML_FILE!"
if not exist "!HTML_CHECK!" (
    set "HTML_CHECK=.\!HTML_FILE!"
    if not exist "!HTML_CHECK!" (
        echo ERROR: HTML file not found: !HTML_FILE!
        echo   Tried: !HTML_FILE!
        echo   Tried: .\!HTML_FILE!
        exit /b 1
    )
)
set "HTML_FILE=!HTML_CHECK!"

set "CSS_CHECK=!CSS_FILE!"
if not exist "!CSS_CHECK!" (
    set "CSS_CHECK=.\!CSS_FILE!"
    if not exist "!CSS_CHECK!" (
        echo ERROR: CSS file not found: !CSS_FILE!
        echo   Tried: !CSS_FILE!
        echo   Tried: .\!CSS_FILE!
        exit /b 1
    )
)
set "CSS_FILE=!CSS_CHECK!"

echo   Running: Main !HTML_FILE! !CSS_FILE!
echo.
echo ============================================
echo   OUTPUT
echo ============================================
echo.

REM Run the compiler directly (not through run.bat)
java -cp "out;lib\antlr4.jar;gen" Main "!HTML_FILE!" "!CSS_FILE!"

set RUN_EXIT_CODE=%ERRORLEVEL%

echo.
echo ============================================
if %RUN_EXIT_CODE% EQU 0 (
    echo   Execution completed successfully!
) else (
    echo   Execution completed with errors (exit code: %RUN_EXIT_CODE%)
)
echo ============================================
echo.

exit /b %RUN_EXIT_CODE%
