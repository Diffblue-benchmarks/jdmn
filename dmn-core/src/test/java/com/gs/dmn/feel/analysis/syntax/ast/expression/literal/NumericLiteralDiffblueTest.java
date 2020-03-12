package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NumericLiteralDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    NumericLiteral numericLiteral = new NumericLiteral("value");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((NumericLiteral) numericLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((NumericLiteral) numericLiteral.accept(new CloneVisitor(), params)).getLexeme());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NumericLiteral actualNumericLiteral = new NumericLiteral("value");

    // Assert
    assertTrue(actualNumericLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualNumericLiteral.getLexeme());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    NumericLiteral numericLiteral = new NumericLiteral("value");

    // Act
    numericLiteral.deriveType(null);

    // Assert
    assertTrue(numericLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NumericLiteral(value)", (new NumericLiteral("value")).toString());
  }
}

