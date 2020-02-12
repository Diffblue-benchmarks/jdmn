package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class AnyDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    Any any = new Any();
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertSame(any, any.accept(visitor, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Any()", (new Any()).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    Any any = new Any();

    // Act
    any.deriveType(null);

    // Assert
    assertTrue(any.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
}

