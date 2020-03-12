package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArithmeticNegationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void acceptTest() {
    // Arrange
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = arithmeticNegation.accept(new CloneVisitor(), params);

    // Assert
    assertNull(((ArithmeticNegation) actualAcceptResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualAcceptResult).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualAcceptResult.toString());
    Expression leftOperand = ((ArithmeticNegation) actualAcceptResult).getLeftOperand();
    Type type = ((ArithmeticNegation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(new ExpressionList());

    // Assert
    assertNull(actualArithmeticNegation.getRightOperand());
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualArithmeticNegation.toString());
    assertTrue(actualArithmeticNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new ArithmeticNegation(new ExpressionList())).deriveType(null);
  }
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ArithmeticNegation(ExpressionList())", (new ArithmeticNegation(new ExpressionList())).toString());
  }
}

