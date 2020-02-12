package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NullTestDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NullTest nullTest = new NullTest();
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertSame(nullTest, nullTest.accept(visitor, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new NullTest()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NullTest()", (new NullTest()).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    NullTest nullTest = new NullTest();

    // Act
    nullTest.deriveType(null);

    // Assert
    assertTrue(nullTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
}

