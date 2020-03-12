package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ExpressionIteratorDomainDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionIteratorDomain.accept(new CloneVisitor(), params);

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualAcceptResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualAcceptResult.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act
    expressionIteratorDomain.deriveType(null);

    // Assert
    assertTrue(expressionIteratorDomain.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }
}

