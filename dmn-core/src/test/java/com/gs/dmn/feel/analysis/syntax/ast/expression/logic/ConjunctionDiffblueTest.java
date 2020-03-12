package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ConjunctionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Conjunction actualConjunction = new Conjunction(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("and", actualConjunction.getOperator());
    assertTrue(actualConjunction.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualConjunction.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Conjunction(ExpressionList(),ExpressionList())",
        (new Conjunction(new ExpressionList(), new ExpressionList())).toString());
  }
}

