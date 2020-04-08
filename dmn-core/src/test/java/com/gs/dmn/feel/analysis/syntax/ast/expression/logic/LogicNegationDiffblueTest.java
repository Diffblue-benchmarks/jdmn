package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
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

public class LogicNegationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    LogicNegation actualLogicNegation = new LogicNegation(new ExpressionList());

    // Assert
    assertNull(actualLogicNegation.getRightOperand());
    assertEquals("not", actualLogicNegation.getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualLogicNegation.toString());
    assertTrue(actualLogicNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(logicNegation, logicNegation.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    LogicNegation logicNegation = new LogicNegation(new LogicNegation(new ExpressionList()));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = logicNegation.accept(new CloneVisitor(), params);

    // Assert
    assertNull(((LogicNegation) actualAcceptResult).getRightOperand());
    assertEquals("not", ((LogicNegation) actualAcceptResult).getOperator());
    Expression leftOperand = ((LogicNegation) actualAcceptResult).getLeftOperand();
    assertEquals("LogicNegation(LogicNegation(ExpressionList()))", actualAcceptResult.toString());
    Type type = ((LogicNegation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testAccept3() {
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
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("LogicNegation(LogicNegation(ExpressionList()))",
        (new LogicNegation(new LogicNegation(new ExpressionList()))).toString());
  }

  @Test
  public void testToString2() {
    // Arrange, Act and Assert
    assertEquals("LogicNegation(ExpressionList())", (new LogicNegation(new ExpressionList())).toString());
  }
}

