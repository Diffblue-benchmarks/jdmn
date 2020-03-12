package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ExpressionTestDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ExpressionTest actualExpressionTest = new ExpressionTest(new ExpressionList());

    // Assert
    assertTrue(actualExpressionTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualExpressionTest.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionTest(ExpressionList())", (new ExpressionTest(new ExpressionList())).toString());
  }
}

