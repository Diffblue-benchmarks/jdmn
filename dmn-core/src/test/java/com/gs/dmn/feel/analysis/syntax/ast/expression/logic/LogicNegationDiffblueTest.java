package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class LogicNegationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    LogicNegation actualLogicNegation = new LogicNegation(new ExpressionList());

    // Assert
    assertNull(actualLogicNegation.getRightOperand());
    assertEquals("not", actualLogicNegation.getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualLogicNegation.toString());
    assertTrue(actualLogicNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("LogicNegation(ExpressionList())", (new LogicNegation(new ExpressionList())).toString());
  }
}

