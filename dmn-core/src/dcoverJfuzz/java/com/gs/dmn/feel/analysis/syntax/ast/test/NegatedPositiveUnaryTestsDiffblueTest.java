package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NegatedPositiveUnaryTestsDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = negatedPositiveUnaryTests.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualAcceptResult).getPositiveUnaryTests();
    assertTrue(type instanceof AnyType);
    Type actualType = positiveUnaryTests.getType();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests())", actualToStringResult);
    assertEquals("PositiveUnaryTests()", positiveUnaryTests.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getPositiveUnaryTestsTest() {
    // Arrange
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(null);

    // Act and Assert
    assertSame(positiveUnaryTests, (new NegatedPositiveUnaryTests(positiveUnaryTests)).getPositiveUnaryTests());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NegatedPositiveUnaryTests actualNegatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(null));

    // Assert
    Type type = actualNegatedPositiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedUnaryTests(PositiveUnaryTests())", actualNegatedPositiveUnaryTests.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NegatedUnaryTests(PositiveUnaryTests())",
        (new NegatedPositiveUnaryTests(new PositiveUnaryTests(null))).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act
    negatedPositiveUnaryTests.deriveType(null);

    // Assert
    assertTrue(negatedPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
}

