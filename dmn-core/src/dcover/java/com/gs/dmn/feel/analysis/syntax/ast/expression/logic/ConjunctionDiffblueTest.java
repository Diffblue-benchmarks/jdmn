package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

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

public class ConjunctionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    Conjunction conjunction = new Conjunction(leftOperand, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = conjunction.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualAcceptResult).getRightOperand();
    Type type = ((Conjunction) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand1 = ((Conjunction) actualAcceptResult).getLeftOperand();
    assertEquals("and", ((Conjunction) actualAcceptResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act
    Conjunction actualConjunction = new Conjunction(leftOperand, new ExpressionList());

    // Assert
    Type type = actualConjunction.getType();
    String actualToStringResult = actualConjunction.toString();
    assertEquals("and", actualConjunction.getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    assertEquals("Conjunction(ExpressionList(),ExpressionList())",
        (new Conjunction(leftOperand, new ExpressionList())).toString());
  }
}

