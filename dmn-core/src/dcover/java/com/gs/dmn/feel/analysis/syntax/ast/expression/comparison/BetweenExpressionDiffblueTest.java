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

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();
    BetweenExpression betweenExpression = new BetweenExpression(value, leftEndpoint, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = betweenExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((BetweenExpression) actualAcceptResult).getValue();
    Type type = ((BetweenExpression) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression leftEndpoint1 = ((BetweenExpression) actualAcceptResult).getLeftEndpoint();
    Expression rightEndpoint = ((BetweenExpression) actualAcceptResult).getRightEndpoint();
    Type actualType = value1.getType();
    String actualToStringResult1 = value1.toString();
    Type actualType1 = rightEndpoint.getType();
    String actualToStringResult2 = rightEndpoint.toString();
    assertTrue(type instanceof AnyType);
    Type actualType2 = leftEndpoint1.getType();
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftEndpoint1.toString());
    assertSame(type, actualType2);
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getRightEndpointTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new BetweenExpression(value, leftEndpoint, expressionList)).getRightEndpoint());
  }

  @Test(timeout=10000)
  public void getLeftEndpointTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new BetweenExpression(value, expressionList, new ExpressionList())).getLeftEndpoint());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();

    // Act and Assert
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new BetweenExpression(value, leftEndpoint, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new BetweenExpression(value, leftEndpoint, new ExpressionList())).deriveType(null);
  }

  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new BetweenExpression(expressionList, leftEndpoint, new ExpressionList())).getValue());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();

    // Act
    BetweenExpression actualBetweenExpression = new BetweenExpression(value, leftEndpoint, new ExpressionList());

    // Assert
    Type type = actualBetweenExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualBetweenExpression.toString());
  }
}

