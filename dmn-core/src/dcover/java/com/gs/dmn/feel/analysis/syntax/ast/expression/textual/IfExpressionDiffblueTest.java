package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

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

public class IfExpressionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();
    IfExpression ifExpression = new IfExpression(condition, thenExpression, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = ifExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualAcceptResult).getType();
    Expression thenExpression1 = ((IfExpression) actualAcceptResult).getThenExpression();
    String actualToStringResult = actualAcceptResult.toString();
    Expression elseExpression = ((IfExpression) actualAcceptResult).getElseExpression();
    Expression condition1 = ((IfExpression) actualAcceptResult).getCondition();
    assertTrue(type instanceof AnyType);
    Type actualType = condition1.getType();
    String actualToStringResult1 = condition1.toString();
    Type actualType1 = thenExpression1.getType();
    String actualToStringResult2 = thenExpression1.toString();
    Type actualType2 = elseExpression.getType();
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", elseExpression.toString());
    assertSame(type, actualType2);
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getConditionTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new IfExpression(expressionList, thenExpression, new ExpressionList())).getCondition());
  }

  @Test(timeout=10000)
  public void getElseExpressionTest() {
    // Arrange
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new IfExpression(condition, thenExpression, expressionList)).getElseExpression());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();

    // Act and Assert
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new IfExpression(condition, thenExpression, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new IfExpression(condition, thenExpression, new ExpressionList())).deriveType(null);
  }

  @Test(timeout=10000)
  public void getThenExpressionTest() {
    // Arrange
    ExpressionList condition = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new IfExpression(condition, expressionList, new ExpressionList())).getThenExpression());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();

    // Act
    IfExpression actualIfExpression = new IfExpression(condition, thenExpression, new ExpressionList());

    // Assert
    Type type = actualIfExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualIfExpression.toString());
  }
}

