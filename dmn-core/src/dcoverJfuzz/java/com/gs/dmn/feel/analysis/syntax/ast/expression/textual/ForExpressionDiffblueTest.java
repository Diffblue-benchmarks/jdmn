package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ForExpressionDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    ForExpression actualForExpression = new ForExpression(null, expressionList);

    // Assert
    Type type = actualForExpression.getType();
    Expression actualBody = actualForExpression.getBody();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualForExpression.getIterators());
    assertSame(expressionList, actualBody);
  }

  @Test(timeout=10000)
  public void getIteratorsTest() {
    // Arrange, Act and Assert
    assertNull((new ForExpression(null, new ExpressionList())).getIterators());
  }

  @Test(timeout=10000)
  public void getBodyTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new ForExpression(null, expressionList)).getBody());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ForExpression forExpression = new ForExpression(null, new ExpressionList());

    // Act
    forExpression.deriveType(null);

    // Assert
    Type type = forExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }
}

