package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class BooleanLiteralDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    Type type = ((BooleanLiteral) booleanLiteral.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((BooleanLiteral) booleanLiteral.accept(visitor, FEELContext.makeContext(null))).getLexeme());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    BooleanLiteral actualBooleanLiteral = new BooleanLiteral("value");

    // Assert
    Type type = actualBooleanLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualBooleanLiteral.getLexeme());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("BooleanLiteral(value)", (new BooleanLiteral("value")).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");

    // Act
    booleanLiteral.deriveType(null);

    // Assert
    assertTrue(booleanLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
}

