package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NegatedSimplePositiveUnaryTestsDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = negatedSimplePositiveUnaryTests.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedSimplePositiveUnaryTests) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    SimplePositiveUnaryTests simplePositiveUnaryTests = ((NegatedSimplePositiveUnaryTests) actualAcceptResult)
        .getSimplePositiveUnaryTests();
    assertTrue(type instanceof AnyType);
    Type actualType = simplePositiveUnaryTests.getType();
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())", actualToStringResult);
    assertEquals("SimplePositiveUnaryTests()", simplePositiveUnaryTests.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getSimplePositiveUnaryTestsTest() {
    // Arrange
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertSame(simplePositiveUnaryTests,
        (new NegatedSimplePositiveUnaryTests(simplePositiveUnaryTests)).getSimplePositiveUnaryTests());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NegatedSimplePositiveUnaryTests actualNegatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));

    // Assert
    Type type = actualNegatedSimplePositiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())",
        actualNegatedSimplePositiveUnaryTests.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())",
        (new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(null))).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));

    // Act
    negatedSimplePositiveUnaryTests.deriveType(null);

    // Assert
    assertTrue(negatedSimplePositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
}

