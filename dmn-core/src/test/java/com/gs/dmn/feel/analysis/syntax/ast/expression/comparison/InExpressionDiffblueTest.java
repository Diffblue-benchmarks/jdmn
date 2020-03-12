package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import java.util.ArrayList;
import org.junit.Test;

public class InExpressionDiffblueTest {
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
  public void toStringTest() {
    // Arrange
    ExpressionList value = new ExpressionList();

    // Act and Assert
    assertEquals("InExpression(ExpressionList(), NullTest())", (new InExpression(value, new NullTest())).toString());
  }
}

