package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ArithmeticNegationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(new ExpressionList());

    // Assert
    assertNull(actualArithmeticNegation.getRightOperand());
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualArithmeticNegation.toString());
    assertTrue(actualArithmeticNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ArithmeticNegation(ExpressionList())", (new ArithmeticNegation(new ExpressionList())).toString());
  }
}

