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

  @Test
  public void acceptTest() {
    // Arrange
    IfExpression ifExpression = new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = ifExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((IfExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualAcceptResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression thenExpression = ((IfExpression) actualAcceptResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    Expression elseExpression = ((IfExpression) actualAcceptResult).getElseExpression();
    String actualToStringResult2 = elseExpression.toString();
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, elseExpression.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    IfExpression actualIfExpression = new IfExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualIfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualIfExpression.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).deriveType(null);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).toString());
  }
}

