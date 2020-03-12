package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NullLiteralDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((NullLiteral) nullLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new NullLiteral()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();

    // Act
    nullLiteral.deriveType(null);

    // Assert
    assertTrue(nullLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NullLiteral()", (new NullLiteral()).toString());
  }
}

