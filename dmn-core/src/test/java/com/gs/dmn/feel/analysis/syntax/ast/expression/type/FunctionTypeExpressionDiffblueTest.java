package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import java.util.ArrayList;
import org.junit.Test;

public class FunctionTypeExpressionDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);
    FunctionTypeExpression functionTypeExpression = new FunctionTypeExpression(typeExpressionList, namedTypeExpression);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = functionTypeExpression.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(((FunctionTypeExpression) actualAcceptResult)
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName)" + " -> NamedTypeExpression(qualifiedName))",
        actualAcceptResult.toString());
  }

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

