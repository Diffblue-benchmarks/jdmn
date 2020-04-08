package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

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

public class AdditionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Addition actualAddition = new Addition("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualAddition.getOperator());
    assertTrue(actualAddition.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(operator,ExpressionList(),ExpressionList" + "())", actualAddition.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    Addition addition = new Addition("operator", new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = addition.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("operator", ((Addition) actualAcceptResult).getOperator());
    Expression rightOperand = ((Addition) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Addition) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Addition(operator,ExpressionList(),ExpressionList" + "())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Addition(operator,ExpressionList(),ExpressionList" + "())",
        (new Addition("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

