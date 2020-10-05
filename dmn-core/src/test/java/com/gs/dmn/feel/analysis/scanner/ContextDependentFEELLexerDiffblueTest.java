package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContextDependentFEELLexerDiffblueTest {
  @Test
  public void testIsNameStartChar() {
    // Arrange, Act and Assert
    assertFalse(ContextDependentFEELLexer.isNameStartChar(32));
    assertFalse(ContextDependentFEELLexer.isNameStartChar(43));
    assertFalse(ContextDependentFEELLexer.isNameStartChar(32));
  }

  @Test
  public void testIsNamePartChar() {
    // Arrange, Act and Assert
    assertTrue(ContextDependentFEELLexer.isNamePartChar(114));
    assertTrue(ContextDependentFEELLexer.isNamePartChar(105));
    assertTrue(ContextDependentFEELLexer.isNamePartChar(110));
  }
}

