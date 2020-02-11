package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class FunctionTypeExpressionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");
    FunctionTypeExpression functionTypeExpression = new FunctionTypeExpression(null, namedTypeExpression);
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    Type type = ((FunctionTypeExpression) functionTypeExpression.accept(visitor, FEELContext.makeContext(null)))
        .getType();
    TypeExpression actualReturnType = ((FunctionTypeExpression) functionTypeExpression.accept(visitor,
        FEELContext.makeContext(null))).getReturnType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((FunctionTypeExpression) functionTypeExpression.accept(visitor, FEELContext.makeContext(null)))
        .getParameters());
    assertSame(namedTypeExpression, actualReturnType);
  }

  @Test(timeout=10000)
  public void getParametersTest() {
    // Arrange, Act and Assert
    assertNull((new FunctionTypeExpression(null, new NamedTypeExpression("name"))).getParameters());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act
    FunctionTypeExpression actualFunctionTypeExpression = new FunctionTypeExpression(null, namedTypeExpression);

    // Assert
    Type type = actualFunctionTypeExpression.getType();
    TypeExpression actualReturnType = actualFunctionTypeExpression.getReturnType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualFunctionTypeExpression.getParameters());
    assertSame(namedTypeExpression, actualReturnType);
  }

  @Test(timeout=10000)
  public void getReturnTypeTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act and Assert
    assertSame(namedTypeExpression, (new FunctionTypeExpression(null, namedTypeExpression)).getReturnType());
  }
}

