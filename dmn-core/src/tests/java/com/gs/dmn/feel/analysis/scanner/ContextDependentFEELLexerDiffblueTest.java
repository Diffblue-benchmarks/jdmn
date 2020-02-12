package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ContextDependentFEELLexerDiffblueTest {
  @Test(timeout=10000)
  public void isNameStartCharTest() {
    // Arrange, Act and Assert
    assertFalse(ContextDependentFEELLexer.isNameStartChar(1));
  }

  @Test(timeout=10000)
  public void isNamePartCharTest() {
    // Arrange, Act and Assert
    assertFalse(ContextDependentFEELLexer.isNamePartChar(1));
  }
}

