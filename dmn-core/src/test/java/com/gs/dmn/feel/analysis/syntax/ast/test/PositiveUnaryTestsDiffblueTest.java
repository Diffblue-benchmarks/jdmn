package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class PositiveUnaryTestsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);

    // Assert
    assertTrue(actualPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests(NullTest())", actualPositiveUnaryTests.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act and Assert
    assertEquals("PositiveUnaryTests(NullTest())", (new PositiveUnaryTests(positiveUnaryTestList)).toString());
  }
}

