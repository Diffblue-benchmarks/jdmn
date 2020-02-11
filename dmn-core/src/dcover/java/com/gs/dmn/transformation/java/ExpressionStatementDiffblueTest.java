package com.gs.dmn.transformation.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ExpressionStatementDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    ExpressionStatement actualExpressionStatement = new ExpressionStatement("foo", anyType);

    // Assert
    String actualExpression = actualExpressionStatement.getExpression();
    assertEquals("foo", actualExpression);
    assertSame(anyType, actualExpressionStatement.getExpressionType());
  }

  @Test(timeout=10000)
  public void getExpressionTypeTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, (new ExpressionStatement("foo", anyType)).getExpressionType());
  }

  @Test(timeout=10000)
  public void getExpressionTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ExpressionStatement("foo", new AnyType())).getExpression());
  }
}

