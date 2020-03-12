package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.List;
import org.junit.Test;

public class SemanticErrorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    SemanticError actualSemanticError = new SemanticError(expressionList, "An error occurred");

    // Assert
    assertEquals("com.gs.dmn.feel.analysis.semantics.SemanticError:" + " 'ExpressionList': An error occurred",
        actualSemanticError.toString());
    assertEquals("'ExpressionList': An error occurred", actualSemanticError.getLocalizedMessage());
    assertNull(actualSemanticError.getCause());
    assertEquals("'ExpressionList': An error occurred", actualSemanticError.getMessage());
    assertEquals(0, actualSemanticError.getSuppressed().length);
    assertTrue(expressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    List<Expression> expressionList1 = expressionList.getExpressionList();
    assertTrue(expressionList1 instanceof java.util.ArrayList);
    assertEquals(0, expressionList1.size());
    assertEquals("ExpressionList()", expressionList.toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ExpressionList expression = new ExpressionList();
    Exception exception = new Exception();

    // Act and Assert
    assertSame((new SemanticError(expression, "An error occurred", exception)).getCause(), exception);
  }
}

