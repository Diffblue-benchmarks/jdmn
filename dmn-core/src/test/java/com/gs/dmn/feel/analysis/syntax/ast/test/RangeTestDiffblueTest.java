package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import org.junit.Test;

public class RangeTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    NumericLiteral start = new NumericLiteral("18");

    // Act
    RangeTest actualRangeTest = new RangeTest(false, start, false, new NumericLiteral("21"));

    // Assert
    assertTrue(actualRangeTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(false,NumericLiteral(18),false,NumericLiteral(21))", actualRangeTest.toString());
    assertFalse(actualRangeTest.isOpenStart());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    NumericLiteral start = new NumericLiteral("22");

    // Act
    RangeTest actualRangeTest = new RangeTest(false, start, false, new NumericLiteral("25"));

    // Assert
    assertTrue(actualRangeTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(false,NumericLiteral(22),false,NumericLiteral(25))", actualRangeTest.toString());
    assertFalse(actualRangeTest.isOpenStart());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    NumericLiteral start = new NumericLiteral("26");

    // Act
    RangeTest actualRangeTest = new RangeTest(false, start, false, new NumericLiteral("35"));

    // Assert
    assertTrue(actualRangeTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(false,NumericLiteral(26),false,NumericLiteral(35))", actualRangeTest.toString());
    assertFalse(actualRangeTest.isOpenStart());
  }
}

