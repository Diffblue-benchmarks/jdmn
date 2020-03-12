package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ListTypeExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ListTypeExpression actualListTypeExpression = new ListTypeExpression(new NamedTypeExpression("qualifiedName"));

    // Assert
    assertTrue(actualListTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))", actualListTypeExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))",
        (new ListTypeExpression(new NamedTypeExpression("qualifiedName"))).toString());
  }
}

