package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContextDependentFEELLexerDiffblueTest {
  @Test
  public void testIsNameStartChar() {
    // Arrange, Act and Assert
    assertFalse(ContextDependentFEELLexer.isNameStartChar(-1));
  }

  @Test
  public void testIsNameStartChar2() {
    // Arrange, Act and Assert
    assertTrue(ContextDependentFEELLexer.isNameStartChar(63));
  }

  @Test
  public void testIsNamePartChar() {
    // Arrange
    boolean actualIsNamePartCharResult = ContextDependentFEELLexer.isNamePartChar(-1);
    boolean actualIsNamePartCharResult1 = ContextDependentFEELLexer.isNamePartChar(63);
    boolean actualIsNamePartCharResult2 = ContextDependentFEELLexer.isNamePartChar(95);
    boolean actualIsNamePartCharResult3 = ContextDependentFEELLexer.isNamePartChar(192);
    boolean actualIsNamePartCharResult4 = ContextDependentFEELLexer.isNamePartChar(216);

    // Act and Assert
    assertFalse(actualIsNamePartCharResult);
    assertTrue(actualIsNamePartCharResult1);
    assertTrue(actualIsNamePartCharResult2);
    assertTrue(actualIsNamePartCharResult3);
    assertTrue(actualIsNamePartCharResult4);
    assertTrue(ContextDependentFEELLexer.isNamePartChar(248));
  }
}

