package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;
import org.junit.Test;

public class InstanceOfExpressionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression instanceOfExpression = new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = instanceOfExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand1 = ((InstanceOfExpression) actualAcceptResult).getLeftOperand();
    TypeExpression rightOperand = ((InstanceOfExpression) actualAcceptResult).getRightOperand();
    assertTrue(type instanceof AnyType);
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(name))", actualToStringResult);
    Type actualType1 = leftOperand1.getType();
    assertEquals("NamedTypeExpression(name)", actualToStringResult1);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act
    InstanceOfExpression actualInstanceOfExpression = new InstanceOfExpression(leftOperand,
        new NamedTypeExpression("name"));

    // Assert
    Type type = actualInstanceOfExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(name))",
        actualInstanceOfExpression.toString());
  }

  @Test(timeout=10000)
  public void getRightOperandTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act and Assert
    assertSame(namedTypeExpression, (new InstanceOfExpression(leftOperand, namedTypeExpression)).getRightOperand());
  }

  @Test(timeout=10000)
  public void getLeftOperandTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList,
        (new InstanceOfExpression(expressionList, new NamedTypeExpression("name"))).getLeftOperand());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(name))",
        (new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"))).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression instanceOfExpression = new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"));

    // Act
    instanceOfExpression.deriveType(null);

    // Assert
    assertTrue(instanceOfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
}

