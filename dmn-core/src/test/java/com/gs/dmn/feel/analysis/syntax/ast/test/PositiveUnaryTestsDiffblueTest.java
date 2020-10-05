package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class PositiveUnaryTestsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(new ArrayList<PositiveUnaryTest>());

    // Assert
    assertTrue(actualPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualPositiveUnaryTests.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(new ArrayList<PositiveUnaryTest>());

    // Assert
    assertTrue(actualPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualPositiveUnaryTests.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(new ArrayList<PositiveUnaryTest>());

    // Assert
    assertTrue(actualPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualPositiveUnaryTests.toString());
  }
}

