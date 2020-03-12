package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PathExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new ExpressionList(), "member");

    // Assert
    assertTrue(actualPathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(ExpressionList(), member)", actualPathExpression.toString());
    assertEquals("member", actualPathExpression.getMember());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PathExpression(ExpressionList(), member)",
        (new PathExpression(new ExpressionList(), "member")).toString());
  }
}

