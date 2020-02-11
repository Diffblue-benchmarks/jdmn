package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NumericLiteralDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NumericLiteral numericLiteral = new NumericLiteral("value");
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    Type type = ((NumericLiteral) numericLiteral.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((NumericLiteral) numericLiteral.accept(visitor, FEELContext.makeContext(null))).getLexeme());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NumericLiteral actualNumericLiteral = new NumericLiteral("value");

    // Assert
    Type type = actualNumericLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualNumericLiteral.getLexeme());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NumericLiteral(value)", (new NumericLiteral("value")).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    NumericLiteral numericLiteral = new NumericLiteral("value");

    // Act
    numericLiteral.deriveType(null);

    // Assert
    assertTrue(numericLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }
}

