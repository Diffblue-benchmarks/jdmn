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
  @Test
  public void acceptTest() {
    // Arrange
    Exponentiation exponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = exponentiation.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("**", ((Exponentiation) actualAcceptResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    Exponentiation actualExponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(actualExponentiation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualExponentiation.toString());
  }
  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new Exponentiation(new ExpressionList(), new ExpressionList())).deriveType(null);
  }
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())",
        (new Exponentiation(new ExpressionList(), new ExpressionList())).toString());
  }
}

