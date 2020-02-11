package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
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

public class ExponentiationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    Exponentiation exponentiation = new Exponentiation(leftOperand, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = exponentiation.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualAcceptResult).getRightOperand();
    Type type = ((Exponentiation) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand1 = ((Exponentiation) actualAcceptResult).getLeftOperand();
    assertEquals("**", ((Exponentiation) actualAcceptResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualToStringResult);
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
    Exponentiation actualExponentiation = new Exponentiation(leftOperand, new ExpressionList());

    // Assert
    Type type = actualExponentiation.getType();
    String actualToStringResult = actualExponentiation.toString();
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualToStringResult);
  }
  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())",
        (new Exponentiation(leftOperand, new ExpressionList())).toString());
  }
  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new Exponentiation(leftOperand, new ExpressionList())).deriveType(null);
  }
}

