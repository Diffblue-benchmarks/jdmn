package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class InputClausePairDiffblueTest {
  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals("value", (new InputClausePair(new ExpressionList(), "value")).getValue());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    InputClausePair actualInputClausePair = new InputClausePair(expressionList, "value");

    // Assert
    Expression actualExpression = actualInputClausePair.getExpression();
    assertSame(expressionList, actualExpression);
    assertTrue(actualInputClausePair.getValue() instanceof String);
  }

  @Test(timeout=10000)
  public void getExpressionTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new InputClausePair(expressionList, "value")).getExpression());
  }
}

