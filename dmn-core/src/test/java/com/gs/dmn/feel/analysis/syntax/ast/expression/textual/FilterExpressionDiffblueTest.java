package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class FilterExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    FilterExpression actualFilterExpression = new FilterExpression(new ExpressionList(), new ExpressionList());

    // Assert
    assertTrue(actualFilterExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualFilterExpression.toString());
  }

  @Test
  public void setFilterTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    FilterExpression filterExpression = new FilterExpression(expressionList, expressionList);

    // Act
    filterExpression.setFilter(expressionList);

    // Assert
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", filterExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())",
        (new FilterExpression(new ExpressionList(), new ExpressionList())).toString());
  }
}

