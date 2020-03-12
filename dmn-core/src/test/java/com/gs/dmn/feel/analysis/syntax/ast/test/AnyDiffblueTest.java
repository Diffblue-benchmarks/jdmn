package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class AnyDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    Any any = new Any();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(any, any.accept(new CloneVisitor(), params));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    Any any = new Any();

    // Act
    any.deriveType(null);

    // Assert
    assertTrue(any.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Any()", (new Any()).toString());
  }
}

