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
  @Test
  public void acceptTest() {
    // Arrange
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression instanceOfExpression = new InstanceOfExpression(new ExpressionList(), rightOperand);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = instanceOfExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((InstanceOfExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(qualifiedName))",
        actualAcceptResult.toString());
    Expression leftOperand = ((InstanceOfExpression) actualAcceptResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertSame(type, rightOperand1.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");

    // Act
    InstanceOfExpression actualInstanceOfExpression = new InstanceOfExpression(new ExpressionList(), rightOperand);

    // Assert
    assertTrue(actualInstanceOfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(qualifiedName))",
        actualInstanceOfExpression.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression instanceOfExpression = new InstanceOfExpression(new ExpressionList(), rightOperand);

    // Act
    instanceOfExpression.deriveType(null);

    // Assert
    assertTrue(instanceOfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void toStringTest() {
    // Arrange
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");

    // Act and Assert
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(qualifiedName))",
        (new InstanceOfExpression(new ExpressionList(), rightOperand)).toString());
  }
}

