package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class LogicNegationDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = logicNegation.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression actualRightOperand = ((LogicNegation) actualAcceptResult).getRightOperand();
    Type type = ((LogicNegation) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand = ((LogicNegation) actualAcceptResult).getLeftOperand();
    assertNull(actualRightOperand);
    assertEquals("not", ((LogicNegation) actualAcceptResult).getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualToStringResult);
    Type actualType = leftOperand.getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, actualType);
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    LogicNegation actualLogicNegation = new LogicNegation(new ExpressionList());

    // Assert
    Expression actualRightOperand = actualLogicNegation.getRightOperand();
    Type type = actualLogicNegation.getType();
    String actualToStringResult = actualLogicNegation.toString();
    assertNull(actualRightOperand);
    assertEquals("not", actualLogicNegation.getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualToStringResult);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("LogicNegation(ExpressionList())", (new LogicNegation(new ExpressionList())).toString());
  }
}

