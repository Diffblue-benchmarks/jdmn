package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class OperatorTestDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    OperatorTest actualOperatorTest = new OperatorTest("operator", new ExpressionList());

    // Assert
    assertTrue(actualOperatorTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("operator", actualOperatorTest.getOperator());
    assertEquals("OperatorTest(operator,ExpressionList())", actualOperatorTest.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("OperatorTest(operator,ExpressionList())",
        (new OperatorTest("operator", new ExpressionList())).toString());
  }
}

