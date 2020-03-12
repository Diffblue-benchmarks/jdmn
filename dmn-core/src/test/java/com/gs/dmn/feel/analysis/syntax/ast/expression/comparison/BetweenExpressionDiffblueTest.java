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

public class BetweenExpressionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void acceptTest() {
    // Arrange
    BetweenExpression betweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = betweenExpression.accept(new CloneVisitor(), params);

    // Assert
    Expression value = ((BetweenExpression) actualAcceptResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualAcceptResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualAcceptResult).getLeftEndpoint();
    String actualToStringResult2 = leftEndpoint.toString();
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, leftEndpoint.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    BetweenExpression actualBetweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualBetweenExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualBetweenExpression.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new BetweenExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).deriveType(null);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new BetweenExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).toString());
  }
}

