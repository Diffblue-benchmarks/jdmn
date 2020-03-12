package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ExponentiationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Exponentiation actualExponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(actualExponentiation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualExponentiation.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())",
        (new Exponentiation(new ExpressionList(), new ExpressionList())).toString());
  }
}

