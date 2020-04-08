package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class BooleanLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    BooleanLiteral actualBooleanLiteral = new BooleanLiteral("value");

    // Assert
    assertTrue(actualBooleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualBooleanLiteral.getLexeme());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");

    // Act
    booleanLiteral.deriveType(null);

    // Assert
    assertTrue(booleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testAccept() {
    // Arrange
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((BooleanLiteral) booleanLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((BooleanLiteral) booleanLiteral.accept(new CloneVisitor(), params)).getLexeme());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("BooleanLiteral(value)", (new BooleanLiteral("value")).toString());
  }
}

