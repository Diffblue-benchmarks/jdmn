package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class PositiveUnaryTestsDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = positiveUnaryTests.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((PositiveUnaryTests) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(null);

    // Assert
    Type type = actualPositiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualPositiveUnaryTests.toString());
  }

  @Test(timeout=10000)
  public void getPositiveUnaryTestsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositiveUnaryTests(null)).getPositiveUnaryTests().size());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PositiveUnaryTests()", (new PositiveUnaryTests(null)).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(null);

    // Act
    positiveUnaryTests.deriveType(null);

    // Assert
    Type type = positiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
}

