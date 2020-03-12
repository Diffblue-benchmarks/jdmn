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
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import java.util.ArrayList;
import org.junit.Test;

public class InExpressionDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    InExpression inExpression = new InExpression(value, new NullTest());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = inExpression.accept(new CloneVisitor(), params);

    // Assert
    Expression value1 = ((InExpression) actualAcceptResult).getValue();
    String actualToStringResult = value1.toString();
    Type type = ((InExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act
    InExpression actualInExpression = new InExpression(value, new NullTest());

    // Assert
    assertTrue(actualInExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualInExpression.toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ExpressionList value = new ExpressionList();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act
    InExpression actualInExpression = new InExpression(value, new PositiveUnaryTests(positiveUnaryTestList));

    // Assert
    assertTrue(actualInExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualInExpression.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    ExpressionList value = new ExpressionList();
    InExpression inExpression = new InExpression(value, new NullTest());

    // Act
    inExpression.deriveType(null);

    // Assert
    assertTrue(inExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void toStringTest() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act and Assert
    assertEquals("InExpression(ExpressionList(), NullTest())", (new InExpression(value, new NullTest())).toString());
  }
}

