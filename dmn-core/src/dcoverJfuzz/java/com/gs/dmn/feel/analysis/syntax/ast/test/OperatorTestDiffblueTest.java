package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class OperatorTestDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    OperatorTest operatorTest = new OperatorTest("foo", new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = operatorTest.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((OperatorTest) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression endpoint = ((OperatorTest) actualAcceptResult).getEndpoint();
    assertTrue(type instanceof AnyType);
    assertEquals("foo", ((OperatorTest) actualAcceptResult).getOperator());
    assertEquals("OperatorTest(foo,ExpressionList())", actualToStringResult);
    Type actualType = endpoint.getType();
    assertEquals("ExpressionList()", endpoint.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    OperatorTest actualOperatorTest = new OperatorTest("foo", new ExpressionList());

    // Assert
    Type type = actualOperatorTest.getType();
    String actualToStringResult = actualOperatorTest.toString();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", actualOperatorTest.getOperator());
    assertEquals("OperatorTest(foo,ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void getOperatorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new OperatorTest("foo", new ExpressionList())).getOperator());
  }

  @Test(timeout=10000)
  public void getEndpointTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new OperatorTest("foo", expressionList)).getEndpoint());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("OperatorTest(foo,ExpressionList())", (new OperatorTest("foo", new ExpressionList())).toString());
  }
}

