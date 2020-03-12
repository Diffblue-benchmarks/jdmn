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
  @Test
  public void acceptTest() {
    // Arrange
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = logicNegation.accept(new CloneVisitor(), params);

    // Assert
    assertNull(((LogicNegation) actualAcceptResult).getRightOperand());
    assertEquals("not", ((LogicNegation) actualAcceptResult).getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualAcceptResult.toString());
    Expression leftOperand = ((LogicNegation) actualAcceptResult).getLeftOperand();
    Type type = ((LogicNegation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    LogicNegation actualLogicNegation = new LogicNegation(new ExpressionList());

    // Assert
    assertNull(actualLogicNegation.getRightOperand());
    assertEquals("not", actualLogicNegation.getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualLogicNegation.toString());
    assertTrue(actualLogicNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("LogicNegation(ExpressionList())", (new LogicNegation(new ExpressionList())).toString());
  }
}

