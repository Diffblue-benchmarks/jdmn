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
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = arithmeticNegation.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression actualRightOperand = ((ArithmeticNegation) actualAcceptResult).getRightOperand();
    Type type = ((ArithmeticNegation) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand = ((ArithmeticNegation) actualAcceptResult).getLeftOperand();
    assertNull(actualRightOperand);
    assertEquals("-", ((ArithmeticNegation) actualAcceptResult).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualToStringResult);
    Type actualType = leftOperand.getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, actualType);
    assertEquals("ExpressionList()", leftOperand.toString());
  }
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(new ExpressionList());

    // Assert
    Expression actualRightOperand = actualArithmeticNegation.getRightOperand();
    Type type = actualArithmeticNegation.getType();
    String actualToStringResult = actualArithmeticNegation.toString();
    assertNull(actualRightOperand);
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualToStringResult);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ArithmeticNegation(ExpressionList())", (new ArithmeticNegation(new ExpressionList())).toString());
  }
  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new ArithmeticNegation(new ExpressionList())).deriveType(null);
  }
}

