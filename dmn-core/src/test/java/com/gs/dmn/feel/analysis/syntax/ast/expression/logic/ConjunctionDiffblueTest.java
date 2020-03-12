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
  @Test
  public void acceptTest() {
    // Arrange
    Conjunction conjunction = new Conjunction(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = conjunction.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("and", ((Conjunction) actualAcceptResult).getOperator());
    Expression rightOperand = ((Conjunction) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Conjunction) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Conjunction) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Conjunction actualConjunction = new Conjunction(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("and", actualConjunction.getOperator());
    assertTrue(actualConjunction.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualConjunction.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Conjunction(ExpressionList(),ExpressionList())",
        (new Conjunction(new ExpressionList(), new ExpressionList())).toString());
  }
}

