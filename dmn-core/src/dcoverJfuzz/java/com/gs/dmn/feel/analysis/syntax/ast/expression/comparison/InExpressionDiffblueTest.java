package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import org.junit.Test;

public class InExpressionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    InExpression inExpression = new InExpression(value, new NullTest());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = inExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualAcceptResult).getValue();
    Type type = ((InExpression) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Type actualType = value1.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualToStringResult);
    assertEquals("ExpressionList()", value1.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getTestsTest() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act and Assert
    assertEquals(1, (new InExpression(value, new NullTest())).getTests().size());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act
    InExpression actualInExpression = new InExpression(value, new PositiveUnaryTests(null));

    // Assert
    Type type = actualInExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InExpression(ExpressionList(), )", actualInExpression.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act
    InExpression actualInExpression = new InExpression(value, new NullTest());

    // Assert
    Type type = actualInExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualInExpression.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act and Assert
    assertEquals("InExpression(ExpressionList(), NullTest())", (new InExpression(value, new NullTest())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    InExpression inExpression = new InExpression(value, new NullTest());

    // Act
    inExpression.deriveType(null);

    // Assert
    assertTrue(inExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new InExpression(expressionList, new NullTest())).getValue());
  }
}

