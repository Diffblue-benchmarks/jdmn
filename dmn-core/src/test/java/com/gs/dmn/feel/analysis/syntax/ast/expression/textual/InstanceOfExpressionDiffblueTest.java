package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import org.junit.Test;

public class InstanceOfExpressionDiffblueTest {
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
  public void toStringTest() {
    // Arrange
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");

    // Act and Assert
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(qualifiedName))",
        (new InstanceOfExpression(new ExpressionList(), rightOperand)).toString());
  }
}

