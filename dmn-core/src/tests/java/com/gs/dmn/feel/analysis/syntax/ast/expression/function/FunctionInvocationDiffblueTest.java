package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FunctionInvocationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList function = new ExpressionList();
    FunctionInvocation functionInvocation = new FunctionInvocation(function, new NamedParameters(null));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = functionInvocation.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualAcceptResult).getFunction();
    Type type = ((FunctionInvocation) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Parameters parameters = ((FunctionInvocation) actualAcceptResult).getParameters();
    Type actualType = function1.getType();
    String actualToStringResult1 = function1.toString();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(ExpressionList() ->" + " NamedParameters())", actualToStringResult);
    assertTrue(parameters.isEmpty());
    assertSame(type, actualType);
    assertEquals("ExpressionList()", actualToStringResult1);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList function = new ExpressionList();

    // Act
    FunctionInvocation actualFunctionInvocation = new FunctionInvocation(function, new NamedParameters(null));

    // Assert
    Type type = actualFunctionInvocation.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(ExpressionList() ->" + " NamedParameters())", actualFunctionInvocation.toString());
  }

  @Test(timeout=10000)
  public void getParametersTest() {
    // Arrange
    ExpressionList function = new ExpressionList();
    NamedParameters namedParameters = new NamedParameters(null);

    // Act and Assert
    assertSame(namedParameters, (new FunctionInvocation(function, namedParameters)).getParameters());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList function = new ExpressionList();

    // Act and Assert
    assertEquals("FunctionInvocation(ExpressionList() ->" + " NamedParameters())",
        (new FunctionInvocation(function, new NamedParameters(null))).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList function = new ExpressionList();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    (new FunctionInvocation(function, new NamedParameters(null))).deriveType(null);
  }

  @Test(timeout=10000)
  public void getFunctionTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new FunctionInvocation(expressionList, new NamedParameters(null))).getFunction());
  }
}

