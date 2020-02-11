package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

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

public class RelationalDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    Relational relational = new Relational("foo", leftOperand, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = relational.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualAcceptResult).getRightOperand();
    Type type = ((Relational) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftOperand1 = ((Relational) actualAcceptResult).getLeftOperand();
    assertEquals("foo", ((Relational) actualAcceptResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Relational(foo,ExpressionList(),ExpressionList())", actualToStringResult);
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
    Relational actualRelational = new Relational("foo", leftOperand, new ExpressionList());

    // Assert
    Type type = actualRelational.getType();
    String actualToStringResult = actualRelational.toString();
    assertEquals("foo", actualRelational.getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(foo,ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void getOperatorTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    assertEquals("foo", (new Relational("foo", leftOperand, new ExpressionList())).getOperator());
  }

  @Test(timeout=10000)
  public void getLeftOperandTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new Relational("foo", expressionList, new ExpressionList())).getLeftOperand());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    assertEquals("Relational(foo,ExpressionList(),ExpressionList())",
        (new Relational("foo", leftOperand, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new Relational("foo", leftOperand, new ExpressionList())).deriveType(null);
  }

  @Test(timeout=10000)
  public void getRightOperandTest() {
    // Arrange
    ExpressionList leftOperand = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new Relational("foo", leftOperand, expressionList)).getRightOperand());
  }
}

