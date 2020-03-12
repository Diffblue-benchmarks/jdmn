package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class BetweenExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    BetweenExpression actualBetweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualBetweenExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualBetweenExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new BetweenExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).toString());
  }
}

