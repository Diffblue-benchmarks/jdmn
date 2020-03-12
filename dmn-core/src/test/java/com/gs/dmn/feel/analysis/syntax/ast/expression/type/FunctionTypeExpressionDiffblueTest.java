package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class FunctionTypeExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);

    // Act
    FunctionTypeExpression actualFunctionTypeExpression = new FunctionTypeExpression(typeExpressionList,
        namedTypeExpression);

    // Assert
    assertTrue(actualFunctionTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName)" + " -> NamedTypeExpression(qualifiedName))",
        actualFunctionTypeExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);

    // Act and Assert
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName)" + " -> NamedTypeExpression(qualifiedName))",
        (new FunctionTypeExpression(typeExpressionList, namedTypeExpression)).toString());
  }
}

