package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.FEELFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class FunctionDefinitionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    FunctionDefinition functionDefinition = new FunctionDefinition(null, new ExpressionList(), true);
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertSame(functionDefinition, functionDefinition.accept(visitor, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void getFormalParametersTest() {
    // Arrange, Act and Assert
    assertNull((new FunctionDefinition(null, new ExpressionList(), true)).getFormalParameters());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    FunctionDefinition actualFunctionDefinition = new FunctionDefinition(null, expressionList, true);

    // Assert
    Type type = actualFunctionDefinition.getType();
    Expression actualBody = actualFunctionDefinition.getBody();
    boolean actualIsExternalResult = actualFunctionDefinition.isExternal();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualFunctionDefinition.getFormalParameters());
    assertTrue(actualIsExternalResult);
    assertSame(expressionList, actualBody);
  }

  @Test(timeout=10000)
  public void isExternalTest() {
    // Arrange, Act and Assert
    assertTrue((new FunctionDefinition(null, new ExpressionList(), true)).isExternal());
  }

  @Test(timeout=10000)
  public void getBodyTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new FunctionDefinition(null, expressionList, true)).getBody());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    FunctionDefinition functionDefinition = new FunctionDefinition(null, new ExpressionList(), true);

    // Act
    functionDefinition.deriveType(null);

    // Assert
    Type type = functionDefinition.getType();
    assertTrue(type instanceof FEELFunctionType);
    String actualToStringResult = type.toString();
    boolean actualIsExternalResult = ((FEELFunctionType) type).isExternal();
    assertEquals("FEELFunctionType(, Any, true)", actualToStringResult);
    assertSame(functionDefinition, ((FEELFunctionType) type).getFunctionDefinition());
    assertTrue(actualIsExternalResult);
  }
}

