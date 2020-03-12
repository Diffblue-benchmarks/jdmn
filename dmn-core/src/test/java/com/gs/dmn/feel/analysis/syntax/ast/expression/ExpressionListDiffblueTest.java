package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class ExpressionListDiffblueTest {
  @Test
  public void addTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    expressionList.add(new ExpressionList());

    // Assert
    assertEquals("ExpressionList(ExpressionList())", expressionList.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ExpressionList actualExpressionList = new ExpressionList();

    // Assert
    assertTrue(actualExpressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualExpressionList.toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ExpressionList actualExpressionList = new ExpressionList(expressionList);

    // Assert
    assertTrue(actualExpressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList(ExpressionList())", actualExpressionList.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionList()", (new ExpressionList()).toString());
  }
}

