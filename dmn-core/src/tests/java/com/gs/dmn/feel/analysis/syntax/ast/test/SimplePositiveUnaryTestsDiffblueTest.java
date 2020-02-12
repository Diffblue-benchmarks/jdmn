package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class SimplePositiveUnaryTestsDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = simplePositiveUnaryTests.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((SimplePositiveUnaryTests) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("SimplePositiveUnaryTests()", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SimplePositiveUnaryTests actualSimplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Assert
    Type type = actualSimplePositiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("SimplePositiveUnaryTests()", actualSimplePositiveUnaryTests.toString());
  }

  @Test(timeout=10000)
  public void getSimplePositiveUnaryTestsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimplePositiveUnaryTests(null)).getSimplePositiveUnaryTests().size());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("SimplePositiveUnaryTests()", (new SimplePositiveUnaryTests(null)).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Act
    simplePositiveUnaryTests.deriveType(null);

    // Assert
    Type type = simplePositiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
}

