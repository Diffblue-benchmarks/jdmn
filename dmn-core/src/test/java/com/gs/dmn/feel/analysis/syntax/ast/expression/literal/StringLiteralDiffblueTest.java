package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class StringLiteralDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((StringLiteral) stringLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((StringLiteral) stringLiteral.accept(new CloneVisitor(), params)).getLexeme());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    StringLiteral actualStringLiteral = new StringLiteral("value");

    // Assert
    assertTrue(actualStringLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualStringLiteral.getLexeme());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act
    stringLiteral.deriveType(null);

    // Assert
    assertTrue(stringLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("StringLiteral(value)", (new StringLiteral("value")).toString());
  }
}

