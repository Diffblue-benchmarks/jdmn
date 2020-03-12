package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class MultiplicationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Multiplication actualMultiplication = new Multiplication("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualMultiplication.getOperator());
    assertTrue(actualMultiplication.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(operator,ExpressionList(),ExpressionList" + "())", actualMultiplication.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Multiplication(operator,ExpressionList(),ExpressionList" + "())",
        (new Multiplication("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

