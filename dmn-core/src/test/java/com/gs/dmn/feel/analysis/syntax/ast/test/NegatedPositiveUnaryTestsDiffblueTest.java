package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class NegatedPositiveUnaryTestsDiffblueTest {
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
  public void toStringTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act and Assert
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))",
        (new NegatedPositiveUnaryTests(new PositiveUnaryTests(positiveUnaryTestList))).toString());
  }
}

