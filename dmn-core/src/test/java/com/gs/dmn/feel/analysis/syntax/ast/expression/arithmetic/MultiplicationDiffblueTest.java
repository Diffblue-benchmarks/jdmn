package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class MultiplicationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Multiplication actualMultiplication = new Multiplication("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualMultiplication.getOperator());
    assertTrue(actualMultiplication.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(operator,ExpressionList(),ExpressionList" + "())", actualMultiplication.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    Multiplication multiplication = new Multiplication("operator", new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = multiplication.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("operator", ((Multiplication) actualAcceptResult).getOperator());
    Expression rightOperand = ((Multiplication) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Multiplication) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Multiplication(operator,ExpressionList(),ExpressionList" + "())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    Multiplication multiplication = new Multiplication("operator", new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(multiplication, multiplication.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Multiplication(operator,ExpressionList(),ExpressionList" + "())",
        (new Multiplication("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

