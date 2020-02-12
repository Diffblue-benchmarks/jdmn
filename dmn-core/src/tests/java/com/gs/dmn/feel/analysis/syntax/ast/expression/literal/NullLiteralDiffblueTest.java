package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NullLiteralDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertTrue(((NullLiteral) nullLiteral.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new NullLiteral()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NullLiteral()", (new NullLiteral()).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();

    // Act
    nullLiteral.deriveType(null);

    // Assert
    assertTrue(nullLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }
}

