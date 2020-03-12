package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class InputClausePairDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    InputClausePair actualInputClausePair = new InputClausePair(expressionList, "value");

    // Assert
    assertSame(expressionList, actualInputClausePair.getExpression());
    assertTrue(actualInputClausePair.getValue() instanceof String);
  }
}

