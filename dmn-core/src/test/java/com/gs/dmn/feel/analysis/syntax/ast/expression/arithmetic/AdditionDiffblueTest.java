package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class AdditionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Addition actualAddition = new Addition("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualAddition.getOperator());
    assertTrue(actualAddition.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(operator,ExpressionList(),ExpressionList" + "())", actualAddition.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Addition(operator,ExpressionList(),ExpressionList" + "())",
        (new Addition("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

