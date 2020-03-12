package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NullTestDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    NullTest nullTest = new NullTest();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(nullTest, nullTest.accept(new CloneVisitor(), params));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new NullTest()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    NullTest nullTest = new NullTest();

    // Act
    nullTest.deriveType(null);

    // Assert
    assertTrue(nullTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NullTest()", (new NullTest()).toString());
  }
}

