package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class QuantifiedExpressionDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    QuantifiedExpression actualQuantifiedExpression = new QuantifiedExpression("foo", null, expressionList);

    // Assert
    Type type = actualQuantifiedExpression.getType();
    String actualPredicate = actualQuantifiedExpression.getPredicate();
    Expression actualBody = actualQuantifiedExpression.getBody();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualQuantifiedExpression.getIterators());
    assertSame(expressionList, actualBody);
    assertEquals("foo", actualPredicate);
  }

  @Test(timeout=10000)
  public void getIteratorsTest() {
    // Arrange, Act and Assert
    assertNull((new QuantifiedExpression("foo", null, new ExpressionList())).getIterators());
  }

  @Test(timeout=10000)
  public void getBodyTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new QuantifiedExpression("foo", null, expressionList)).getBody());
  }

  @Test(timeout=10000)
  public void getPredicateTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new QuantifiedExpression("foo", null, new ExpressionList())).getPredicate());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    QuantifiedExpression quantifiedExpression = new QuantifiedExpression("foo", null, new ExpressionList());

    // Act
    quantifiedExpression.deriveType(null);

    // Assert
    assertTrue(quantifiedExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toForExpressionTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    ForExpression actualToForExpressionResult = (new QuantifiedExpression("foo", null, expressionList))
        .toForExpression();

    // Assert
    Type type = actualToForExpressionResult.getType();
    Expression actualBody = actualToForExpressionResult.getBody();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualToForExpressionResult.getIterators());
    assertSame(expressionList, actualBody);
  }
}

