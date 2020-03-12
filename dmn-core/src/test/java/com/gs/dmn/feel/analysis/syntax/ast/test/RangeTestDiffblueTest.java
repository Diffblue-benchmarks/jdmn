package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class RangeTestDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    RangeTest actualRangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());

    // Assert
    assertTrue(actualRangeTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualRangeTest.toString());
    assertTrue(actualRangeTest.isOpenStart());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())",
        (new RangeTest(true, new ExpressionList(), true, new ExpressionList())).toString());
  }
}

