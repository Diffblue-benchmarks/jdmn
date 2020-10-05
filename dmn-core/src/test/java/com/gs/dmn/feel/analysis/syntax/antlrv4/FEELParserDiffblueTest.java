package com.gs.dmn.feel.analysis.syntax.antlrv4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.ASTFactory;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CodePointBuffer;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ParseInfo;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.junit.Test;

public class FEELParserDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(22).build();

    // Act
    FEELParser actualFeelParser = new FEELParser(new CommonTokenStream(new FEELLexer(CodePointCharStream
        .fromBuffer(codePointBuffer, String.join("", "<", System.getProperty("sun.os.patch.level"), ">")))));

    // Assert
    PredictionContextCache expectedSharedContextCache = actualFeelParser._sharedContextCache;
    ParseInfo actualParseInfo = actualFeelParser.getParseInfo();
    ParserATNSimulator interpreter = actualFeelParser.getInterpreter();
    boolean actualBuildParseTree = actualFeelParser.getBuildParseTree();
    int actualState = actualFeelParser.getState();
    boolean actualIsTraceResult = actualFeelParser.isTrace();
    ATN expectedAtn = actualFeelParser.getATN();
    ANTLRErrorListener errorListenerDispatch = actualFeelParser.getErrorListenerDispatch();
    String actualSourceName = actualFeelParser.getSourceName();
    assertNull(actualParseInfo);
    assertEquals(0, actualFeelParser.getNumberOfSyntaxErrors());
    assertFalse(actualFeelParser.isMatchedEOF());
    assertNull(actualFeelParser.getContext());
    assertTrue(actualFeelParser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualFeelParser.getPrecedence());
    assertEquals(String.join("", "<", System.getProperty("sun.os.patch.level"), ">"), actualSourceName);
    assertFalse(actualIsTraceResult);
    assertTrue(actualBuildParseTree);
    assertEquals(-1, actualState);
    assertTrue(errorListenerDispatch instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertSame(actualFeelParser, interpreter.getParser());
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
    assertEquals(57, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(expectedAtn, interpreter.atn);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(21).build();

    // Act
    FEELParser actualFeelParser = new FEELParser(new CommonTokenStream(new FEELLexer(CodePointCharStream
        .fromBuffer(codePointBuffer, String.join("", "<", System.getProperty("sun.os.patch.level"), ">")))));

    // Assert
    PredictionContextCache expectedSharedContextCache = actualFeelParser._sharedContextCache;
    ParseInfo actualParseInfo = actualFeelParser.getParseInfo();
    ParserATNSimulator interpreter = actualFeelParser.getInterpreter();
    boolean actualBuildParseTree = actualFeelParser.getBuildParseTree();
    int actualState = actualFeelParser.getState();
    boolean actualIsTraceResult = actualFeelParser.isTrace();
    ATN expectedAtn = actualFeelParser.getATN();
    ANTLRErrorListener errorListenerDispatch = actualFeelParser.getErrorListenerDispatch();
    String actualSourceName = actualFeelParser.getSourceName();
    assertNull(actualParseInfo);
    assertEquals(0, actualFeelParser.getNumberOfSyntaxErrors());
    assertFalse(actualFeelParser.isMatchedEOF());
    assertNull(actualFeelParser.getContext());
    assertTrue(actualFeelParser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualFeelParser.getPrecedence());
    assertEquals(String.join("", "<", System.getProperty("sun.os.patch.level"), ">"), actualSourceName);
    assertFalse(actualIsTraceResult);
    assertTrue(actualBuildParseTree);
    assertEquals(-1, actualState);
    assertTrue(errorListenerDispatch instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertSame(actualFeelParser, interpreter.getParser());
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
    assertEquals(57, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(expectedAtn, interpreter.atn);
  }

  @Test
  public void testConstructor3() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(32).build();

    // Act
    FEELParser actualFeelParser = new FEELParser(new CommonTokenStream(new FEELLexer(CodePointCharStream
        .fromBuffer(codePointBuffer, String.join("", "<", System.getProperty("sun.os.patch.level"), ">")))));

    // Assert
    PredictionContextCache expectedSharedContextCache = actualFeelParser._sharedContextCache;
    ParseInfo actualParseInfo = actualFeelParser.getParseInfo();
    ParserATNSimulator interpreter = actualFeelParser.getInterpreter();
    boolean actualBuildParseTree = actualFeelParser.getBuildParseTree();
    int actualState = actualFeelParser.getState();
    boolean actualIsTraceResult = actualFeelParser.isTrace();
    ATN expectedAtn = actualFeelParser.getATN();
    ANTLRErrorListener errorListenerDispatch = actualFeelParser.getErrorListenerDispatch();
    String actualSourceName = actualFeelParser.getSourceName();
    assertNull(actualParseInfo);
    assertEquals(0, actualFeelParser.getNumberOfSyntaxErrors());
    assertFalse(actualFeelParser.isMatchedEOF());
    assertNull(actualFeelParser.getContext());
    assertTrue(actualFeelParser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualFeelParser.getPrecedence());
    assertEquals(String.join("", "<", System.getProperty("sun.os.patch.level"), ">"), actualSourceName);
    assertFalse(actualIsTraceResult);
    assertTrue(actualBuildParseTree);
    assertEquals(-1, actualState);
    assertTrue(errorListenerDispatch instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertSame(actualFeelParser, interpreter.getParser());
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
    assertEquals(57, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(expectedAtn, interpreter.atn);
  }

  @Test
  public void testConstructor4() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(22).build();
    CommonTokenStream input = new CommonTokenStream(new FEELLexer(CodePointCharStream.fromBuffer(codePointBuffer,
        String.join("", "<", System.getProperty("sun.os.patch.level"), ">"))));
    ASTFactory astFactory = new ASTFactory();

    // Act
    FEELParser actualFeelParser = new FEELParser(input, astFactory);

    // Assert
    PredictionContextCache expectedSharedContextCache = actualFeelParser._sharedContextCache;
    ParseInfo actualParseInfo = actualFeelParser.getParseInfo();
    ParserATNSimulator interpreter = actualFeelParser.getInterpreter();
    boolean actualBuildParseTree = actualFeelParser.getBuildParseTree();
    int actualState = actualFeelParser.getState();
    boolean actualIsTraceResult = actualFeelParser.isTrace();
    ATN expectedAtn = actualFeelParser.getATN();
    ANTLRErrorListener errorListenerDispatch = actualFeelParser.getErrorListenerDispatch();
    ASTFactory actualASTFactory = actualFeelParser.getASTFactory();
    String actualSourceName = actualFeelParser.getSourceName();
    assertNull(actualParseInfo);
    assertEquals(0, actualFeelParser.getNumberOfSyntaxErrors());
    assertFalse(actualFeelParser.isMatchedEOF());
    assertNull(actualFeelParser.getContext());
    assertTrue(actualFeelParser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualFeelParser.getPrecedence());
    assertEquals(String.join("", "<", System.getProperty("sun.os.patch.level"), ">"), actualSourceName);
    assertFalse(actualIsTraceResult);
    assertSame(astFactory, actualASTFactory);
    assertTrue(actualBuildParseTree);
    assertEquals(-1, actualState);
    assertTrue(errorListenerDispatch instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertSame(actualFeelParser, interpreter.getParser());
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
    assertEquals(57, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(expectedAtn, interpreter.atn);
  }

  @Test
  public void testConstructor5() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(21).build();
    CommonTokenStream input = new CommonTokenStream(new FEELLexer(CodePointCharStream.fromBuffer(codePointBuffer,
        String.join("", "<", System.getProperty("sun.os.patch.level"), ">"))));
    ASTFactory astFactory = new ASTFactory();

    // Act
    FEELParser actualFeelParser = new FEELParser(input, astFactory);

    // Assert
    PredictionContextCache expectedSharedContextCache = actualFeelParser._sharedContextCache;
    ParseInfo actualParseInfo = actualFeelParser.getParseInfo();
    ParserATNSimulator interpreter = actualFeelParser.getInterpreter();
    boolean actualBuildParseTree = actualFeelParser.getBuildParseTree();
    int actualState = actualFeelParser.getState();
    boolean actualIsTraceResult = actualFeelParser.isTrace();
    ATN expectedAtn = actualFeelParser.getATN();
    ANTLRErrorListener errorListenerDispatch = actualFeelParser.getErrorListenerDispatch();
    ASTFactory actualASTFactory = actualFeelParser.getASTFactory();
    String actualSourceName = actualFeelParser.getSourceName();
    assertNull(actualParseInfo);
    assertEquals(0, actualFeelParser.getNumberOfSyntaxErrors());
    assertFalse(actualFeelParser.isMatchedEOF());
    assertNull(actualFeelParser.getContext());
    assertTrue(actualFeelParser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualFeelParser.getPrecedence());
    assertEquals(String.join("", "<", System.getProperty("sun.os.patch.level"), ">"), actualSourceName);
    assertFalse(actualIsTraceResult);
    assertSame(astFactory, actualASTFactory);
    assertTrue(actualBuildParseTree);
    assertEquals(-1, actualState);
    assertTrue(errorListenerDispatch instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertSame(actualFeelParser, interpreter.getParser());
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
    assertEquals(57, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(expectedAtn, interpreter.atn);
  }

  @Test
  public void testConstructor6() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(32).build();
    CommonTokenStream input = new CommonTokenStream(new FEELLexer(CodePointCharStream.fromBuffer(codePointBuffer,
        String.join("", "<", System.getProperty("sun.os.patch.level"), ">"))));
    ASTFactory astFactory = new ASTFactory();

    // Act
    FEELParser actualFeelParser = new FEELParser(input, astFactory);

    // Assert
    PredictionContextCache expectedSharedContextCache = actualFeelParser._sharedContextCache;
    ParseInfo actualParseInfo = actualFeelParser.getParseInfo();
    ParserATNSimulator interpreter = actualFeelParser.getInterpreter();
    boolean actualBuildParseTree = actualFeelParser.getBuildParseTree();
    int actualState = actualFeelParser.getState();
    boolean actualIsTraceResult = actualFeelParser.isTrace();
    ATN expectedAtn = actualFeelParser.getATN();
    ANTLRErrorListener errorListenerDispatch = actualFeelParser.getErrorListenerDispatch();
    ASTFactory actualASTFactory = actualFeelParser.getASTFactory();
    String actualSourceName = actualFeelParser.getSourceName();
    assertNull(actualParseInfo);
    assertEquals(0, actualFeelParser.getNumberOfSyntaxErrors());
    assertFalse(actualFeelParser.isMatchedEOF());
    assertNull(actualFeelParser.getContext());
    assertTrue(actualFeelParser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualFeelParser.getPrecedence());
    assertEquals(String.join("", "<", System.getProperty("sun.os.patch.level"), ">"), actualSourceName);
    assertFalse(actualIsTraceResult);
    assertSame(astFactory, actualASTFactory);
    assertTrue(actualBuildParseTree);
    assertEquals(-1, actualState);
    assertTrue(errorListenerDispatch instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertSame(actualFeelParser, interpreter.getParser());
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
    assertEquals(57, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(expectedAtn, interpreter.atn);
  }

  @Test
  public void testGetATN() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(22).build();
    CommonTokenStream input = new CommonTokenStream(new FEELLexer(CodePointCharStream.fromBuffer(codePointBuffer,
        String.join("", "<", System.getProperty("sun.os.patch.level"), ">"))));
    FEELParser feelParser = new FEELParser(input, new ASTFactory());

    // Act and Assert
    assertSame(feelParser._ATN, feelParser.getATN());
  }

  @Test
  public void testGetATN2() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(22).build();
    CommonTokenStream input = new CommonTokenStream(new FEELLexer(CodePointCharStream.fromBuffer(codePointBuffer,
        String.join("", "<", System.getProperty("sun.os.patch.level"), ">"))));
    FEELParser feelParser = new FEELParser(input, new ASTFactory());

    // Act and Assert
    assertSame(feelParser._ATN, feelParser.getATN());
  }

  @Test
  public void testGetATN3() {
    // Arrange
    CodePointBuffer codePointBuffer = CodePointBuffer.builder(22).build();
    CommonTokenStream input = new CommonTokenStream(new FEELLexer(CodePointCharStream.fromBuffer(codePointBuffer,
        String.join("", "<", System.getProperty("sun.os.patch.level"), ">"))));
    FEELParser feelParser = new FEELParser(input, new ASTFactory());

    // Act and Assert
    assertSame(feelParser._ATN, feelParser.getATN());
  }
}

