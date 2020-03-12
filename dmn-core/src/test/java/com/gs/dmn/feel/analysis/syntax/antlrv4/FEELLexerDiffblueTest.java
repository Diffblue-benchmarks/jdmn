package com.gs.dmn.feel.analysis.syntax.antlrv4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.VocabularyImpl;
import org.junit.Test;

public class FEELLexerDiffblueTest {
  @Test
  public void getATNTest() {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act and Assert
    assertSame(feelLexer._ATN, feelLexer.getATN());
  }

  @Test
  public void getChannelNamesTest() {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act
    String[] actualChannelNames = feelLexer.getChannelNames();

    // Assert
    assertSame(feelLexer.channelNames, actualChannelNames);
    assertEquals(2, actualChannelNames.length);
  }

  @Test
  public void getGrammarFileNameTest() {
    // Arrange, Act and Assert
    assertEquals("FEELLexer.g4", (new FEELLexer(new ANTLRInputStream())).getGrammarFileName());
  }

  @Test
  public void getModeNamesTest() {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act
    String[] actualModeNames = feelLexer.getModeNames();

    // Assert
    assertSame(feelLexer.modeNames, actualModeNames);
    assertEquals(1, actualModeNames.length);
  }

  @Test
  public void getRuleNamesTest() {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act
    String[] actualRuleNames = feelLexer.getRuleNames();

    // Assert
    assertSame(feelLexer.ruleNames, actualRuleNames);
    assertEquals(57, actualRuleNames.length);
    assertEquals("BLOCK_COMMENT", actualRuleNames[0]);
    assertEquals("LINE_COMMENT", actualRuleNames[1]);
    assertEquals("WS", actualRuleNames[2]);
    assertEquals("STRING", actualRuleNames[3]);
    assertEquals("NUMBER", actualRuleNames[4]);
    assertEquals("EQ", actualRuleNames[5]);
    assertEquals("NamePartChar", actualRuleNames[51]);
    assertEquals("Digit", actualRuleNames[52]);
    assertEquals("HexDigit", actualRuleNames[53]);
    assertEquals("Digits", actualRuleNames[54]);
    assertEquals("WhiteSpace", actualRuleNames[55]);
    assertEquals("VerticalSpace", actualRuleNames[56]);
  }

  @Test
  public void getTokenNamesTest() {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act
    String[] actualTokenNames = feelLexer.getTokenNames();

    // Assert
    assertSame(feelLexer.tokenNames, actualTokenNames);
    assertEquals(48, actualTokenNames.length);
    assertEquals("<INVALID>", actualTokenNames[0]);
    assertEquals("BLOCK_COMMENT", actualTokenNames[1]);
    assertEquals("LINE_COMMENT", actualTokenNames[2]);
    assertEquals("WS", actualTokenNames[3]);
    assertEquals("STRING", actualTokenNames[4]);
    assertEquals("NUMBER", actualTokenNames[5]);
    assertEquals("'satisfies'", actualTokenNames[42]);
    assertEquals("'and'", actualTokenNames[43]);
    assertEquals("'or'", actualTokenNames[44]);
    assertEquals("'between'", actualTokenNames[45]);
    assertEquals("'instance of'", actualTokenNames[46]);
    assertEquals("NAME", actualTokenNames[47]);
  }

  @Test
  public void getVocabularyTest() {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act and Assert
    assertSame(feelLexer.VOCABULARY, feelLexer.getVocabulary());
  }
}

