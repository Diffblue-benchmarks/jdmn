package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class IfExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    IfExpression actualIfExpression = new IfExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualIfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualIfExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).toString());
  }
}

