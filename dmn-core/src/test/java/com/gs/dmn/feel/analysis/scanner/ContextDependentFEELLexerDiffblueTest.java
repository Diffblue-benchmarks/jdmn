package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContextDependentFEELLexerDiffblueTest {
  @Test
  public void isNamePartCharTest() {
    // Arrange
    boolean actualIsNamePartCharResult = ContextDependentFEELLexer.isNamePartChar(-1);
    boolean actualIsNamePartCharResult1 = ContextDependentFEELLexer.isNamePartChar(1489);
    boolean actualIsNamePartCharResult2 = ContextDependentFEELLexer.isNamePartChar(63);
    boolean actualIsNamePartCharResult3 = ContextDependentFEELLexer.isNamePartChar(65);
    boolean actualIsNamePartCharResult4 = ContextDependentFEELLexer.isNamePartChar(95);
    boolean actualIsNamePartCharResult5 = ContextDependentFEELLexer.isNamePartChar(97);
    boolean actualIsNamePartCharResult6 = ContextDependentFEELLexer.isNamePartChar(216);
    boolean actualIsNamePartCharResult7 = ContextDependentFEELLexer.isNamePartChar(248);
    boolean actualIsNamePartCharResult8 = ContextDependentFEELLexer.isNamePartChar(880);
    boolean actualIsNamePartCharResult9 = ContextDependentFEELLexer.isNamePartChar(8204);
    boolean actualIsNamePartCharResult10 = ContextDependentFEELLexer.isNamePartChar(8304);
    boolean actualIsNamePartCharResult11 = ContextDependentFEELLexer.isNamePartChar(11264);
    boolean actualIsNamePartCharResult12 = ContextDependentFEELLexer.isNamePartChar(12289);
    boolean actualIsNamePartCharResult13 = ContextDependentFEELLexer.isNamePartChar(63744);
    boolean actualIsNamePartCharResult14 = ContextDependentFEELLexer.isNamePartChar(65008);
    boolean actualIsNamePartCharResult15 = ContextDependentFEELLexer.isNamePartChar(48);
    boolean actualIsNamePartCharResult16 = ContextDependentFEELLexer.isNamePartChar(183);

    // Act and Assert
    assertFalse(actualIsNamePartCharResult);
    assertTrue(actualIsNamePartCharResult1);
    assertTrue(actualIsNamePartCharResult2);
    assertTrue(actualIsNamePartCharResult3);
    assertTrue(actualIsNamePartCharResult4);
    assertTrue(actualIsNamePartCharResult5);
    assertTrue(actualIsNamePartCharResult6);
    assertTrue(actualIsNamePartCharResult7);
    assertTrue(actualIsNamePartCharResult8);
    assertTrue(actualIsNamePartCharResult9);
    assertTrue(actualIsNamePartCharResult10);
    assertTrue(actualIsNamePartCharResult11);
    assertTrue(actualIsNamePartCharResult12);
    assertTrue(actualIsNamePartCharResult13);
    assertTrue(actualIsNamePartCharResult14);
    assertTrue(actualIsNamePartCharResult15);
    assertTrue(actualIsNamePartCharResult16);
    assertTrue(ContextDependentFEELLexer.isNamePartChar(768));
  }

  @Test
  public void isNameStartCharTest() {
    // Arrange, Act and Assert
    assertFalse(ContextDependentFEELLexer.isNameStartChar(-1));
  }
}

