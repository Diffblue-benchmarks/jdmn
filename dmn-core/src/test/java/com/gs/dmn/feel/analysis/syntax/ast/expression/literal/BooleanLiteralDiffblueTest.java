package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BooleanLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    BooleanLiteral actualBooleanLiteral = new BooleanLiteral("true");

    // Assert
    assertTrue(actualBooleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("true", actualBooleanLiteral.getLexeme());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    BooleanLiteral actualBooleanLiteral = new BooleanLiteral("true");

    // Assert
    assertTrue(actualBooleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("true", actualBooleanLiteral.getLexeme());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    BooleanLiteral actualBooleanLiteral = new BooleanLiteral("true");

    // Assert
    assertTrue(actualBooleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("true", actualBooleanLiteral.getLexeme());
  }
}

