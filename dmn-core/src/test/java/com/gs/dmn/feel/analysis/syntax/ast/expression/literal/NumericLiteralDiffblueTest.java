package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NumericLiteralDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    NumericLiteral actualNumericLiteral = new NumericLiteral("value");

    // Assert
    assertTrue(actualNumericLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualNumericLiteral.getLexeme());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NumericLiteral(value)", (new NumericLiteral("value")).toString());
  }
}

