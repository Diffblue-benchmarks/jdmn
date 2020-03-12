package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BooleanLiteralDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    BooleanLiteral actualBooleanLiteral = new BooleanLiteral("value");

    // Assert
    assertTrue(actualBooleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualBooleanLiteral.getLexeme());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("BooleanLiteral(value)", (new BooleanLiteral("value")).toString());
  }
}

