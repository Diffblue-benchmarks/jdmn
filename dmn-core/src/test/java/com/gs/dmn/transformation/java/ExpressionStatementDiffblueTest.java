package com.gs.dmn.transformation.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ExpressionStatementDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    ExpressionStatement actualExpressionStatement = new ExpressionStatement("expression", anyType);

    // Assert
    assertEquals("expression", actualExpressionStatement.getExpression());
    assertSame(anyType, actualExpressionStatement.getExpressionType());
  }
}

