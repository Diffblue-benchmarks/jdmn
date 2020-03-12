package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class DisjunctionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Disjunction actualDisjunction = new Disjunction(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("or", actualDisjunction.getOperator());
    assertTrue(actualDisjunction.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualDisjunction.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Disjunction(ExpressionList(),ExpressionList())",
        (new Disjunction(new ExpressionList(), new ExpressionList())).toString());
  }
}

