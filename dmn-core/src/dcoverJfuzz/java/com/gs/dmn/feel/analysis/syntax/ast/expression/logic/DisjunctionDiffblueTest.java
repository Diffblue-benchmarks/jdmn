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

public class DisjunctionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    Disjunction disjunction = new Disjunction(leftOperand, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = disjunction.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualAcceptResult).getRightOperand();
    Type type = ((Disjunction) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand1 = ((Disjunction) actualAcceptResult).getLeftOperand();
    assertEquals("or", ((Disjunction) actualAcceptResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualToStringResult);
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
    Disjunction actualDisjunction = new Disjunction(leftOperand, new ExpressionList());

    // Assert
    Type type = actualDisjunction.getType();
    String actualToStringResult = actualDisjunction.toString();
    assertEquals("or", actualDisjunction.getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    assertEquals("Disjunction(ExpressionList(),ExpressionList())",
        (new Disjunction(leftOperand, new ExpressionList())).toString());
  }
}

