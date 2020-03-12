package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NamedTypeExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    NamedTypeExpression actualNamedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Assert
    assertEquals("qualifiedName", actualNamedTypeExpression.getQualifiedName());
    assertTrue(actualNamedTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedTypeExpression(qualifiedName)", (new NamedTypeExpression("qualifiedName")).toString());
  }
}

