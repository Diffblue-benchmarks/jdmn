package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class StringLiteralDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    Type type = ((StringLiteral) stringLiteral.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((StringLiteral) stringLiteral.accept(visitor, FEELContext.makeContext(null))).getLexeme());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    StringLiteral actualStringLiteral = new StringLiteral("value");

    // Assert
    Type type = actualStringLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualStringLiteral.getLexeme());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("StringLiteral(value)", (new StringLiteral("value")).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act
    stringLiteral.deriveType(null);

    // Assert
    assertTrue(stringLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }
}

