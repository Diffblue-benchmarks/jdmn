package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class RelationalDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Relational actualRelational = new Relational("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualRelational.getOperator());
    assertTrue(actualRelational.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())", actualRelational.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())",
        (new Relational("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

