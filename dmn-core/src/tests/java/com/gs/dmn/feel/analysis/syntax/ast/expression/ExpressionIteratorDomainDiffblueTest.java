package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ExpressionIteratorDomainDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = expressionIteratorDomain.accept(visitor, FEELContext.makeContext(null));

    // Assert
    String actualToStringResult = actualAcceptResult.toString();
    Expression expression = ((ExpressionIteratorDomain) actualAcceptResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualToStringResult);
    Type type = expression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test(timeout=10000)
  public void getExpressionTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new ExpressionIteratorDomain(expressionList)).getExpression());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act
    expressionIteratorDomain.deriveType(null);

    // Assert
    assertTrue(expressionIteratorDomain.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ExpressionIteratorDomain(new ExpressionList())).getType());
  }
}

