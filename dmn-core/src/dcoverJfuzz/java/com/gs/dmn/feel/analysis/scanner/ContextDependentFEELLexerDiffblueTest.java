package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContextDependentFEELLexerDiffblueTest {
  @Test(timeout=10000)
  public void isNameStartCharTest() {
    // Arrange
    boolean actualIsNameStartCharResult = ContextDependentFEELLexer.isNameStartChar(1);
    boolean actualIsNameStartCharResult1 = ContextDependentFEELLexer.isNameStartChar(63);
    boolean actualIsNameStartCharResult2 = ContextDependentFEELLexer.isNameStartChar(65);

    // Act and Assert
    assertFalse(actualIsNameStartCharResult);
    assertTrue(actualIsNameStartCharResult1);
    assertTrue(actualIsNameStartCharResult2);
    assertTrue(ContextDependentFEELLexer.isNameStartChar(95));
  }

  @Test(timeout=10000)
  public void isNamePartCharTest() {
    // Arrange
    boolean actualIsNamePartCharResult = ContextDependentFEELLexer.isNamePartChar(1);
    boolean actualIsNamePartCharResult1 = ContextDependentFEELLexer.isNamePartChar(63);
    boolean actualIsNamePartCharResult2 = ContextDependentFEELLexer.isNamePartChar(65);
    boolean actualIsNamePartCharResult3 = ContextDependentFEELLexer.isNamePartChar(95);

    // Act and Assert
    assertFalse(actualIsNamePartCharResult);
    assertTrue(actualIsNamePartCharResult1);
    assertTrue(actualIsNamePartCharResult2);
    assertTrue(actualIsNamePartCharResult3);
    assertTrue(ContextDependentFEELLexer.isNamePartChar(48));
  }
}

