package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringLiteralDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    StringLiteral actualStringLiteral = new StringLiteral("value");

    // Assert
    assertTrue(actualStringLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualStringLiteral.getLexeme());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("StringLiteral(value)", (new StringLiteral("value")).toString());
  }
}

