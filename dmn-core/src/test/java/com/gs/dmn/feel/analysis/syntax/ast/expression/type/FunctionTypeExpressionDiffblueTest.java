package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import java.util.ArrayList;
import org.junit.Test;

public class FunctionTypeExpressionDiffblueTest {
  @Test
  public void testConstructor() {
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
  public void testAccept() {
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
  public void testAccept2() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);
    FunctionTypeExpression functionTypeExpression = new FunctionTypeExpression(typeExpressionList, namedTypeExpression);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(functionTypeExpression, functionTypeExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>(1);
    typeExpressionList.add(new NamedTypeExpression("qualifiedName"));
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    typeExpressionList.add(namedTypeExpression);

    // Act and Assert
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName),"
            + " NamedTypeExpression(qualifiedName) -> NamedTypeExpression" + "(qualifiedName))",
        (new FunctionTypeExpression(typeExpressionList, namedTypeExpression)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList1 = new ArrayList<TypeExpression>();
    typeExpressionList1.add(namedTypeExpression);
    FunctionTypeExpression functionTypeExpression = new FunctionTypeExpression(typeExpressionList1,
        namedTypeExpression);
    typeExpressionList.add(functionTypeExpression);

    // Act and Assert
    assertEquals(
        "FunctionTypeExpression(FunctionTypeExpression" + "(NamedTypeExpression(qualifiedName) -> NamedTypeExpression"
            + "(qualifiedName)) -> FunctionTypeExpression"
            + "(NamedTypeExpression(qualifiedName) -> NamedTypeExpression" + "(qualifiedName)))",
        (new FunctionTypeExpression(typeExpressionList, functionTypeExpression)).toString());
  }

  @Test
  public void testToString3() {
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

