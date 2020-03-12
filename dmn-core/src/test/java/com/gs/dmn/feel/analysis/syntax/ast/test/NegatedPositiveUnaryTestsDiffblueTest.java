package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import java.util.ArrayList;
import org.junit.Test;

public class NegatedPositiveUnaryTestsDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = negatedPositiveUnaryTests.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualAcceptResult).getPositiveUnaryTests();
    String actualToStringResult = positiveUnaryTests.toString();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))", actualAcceptResult.toString());
    assertEquals("PositiveUnaryTests(NullTest())", actualToStringResult);
    assertSame(type, positiveUnaryTests.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act
    NegatedPositiveUnaryTests actualNegatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Assert
    assertTrue(actualNegatedPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))", actualNegatedPositiveUnaryTests.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Act
    negatedPositiveUnaryTests.deriveType(null);

    // Assert
    assertTrue(negatedPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act and Assert
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))",
        (new NegatedPositiveUnaryTests(new PositiveUnaryTests(positiveUnaryTestList))).toString());
  }
}

