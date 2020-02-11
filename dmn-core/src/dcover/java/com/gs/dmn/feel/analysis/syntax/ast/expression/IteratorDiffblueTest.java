package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class IteratorDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = iterator.accept(visitor, FEELContext.makeContext(null));

    // Assert
    String actualName = ((Iterator) actualAcceptResult).getName();
    String actualToStringResult = actualAcceptResult.toString();
    IteratorDomain domain = ((Iterator) actualAcceptResult).getDomain();
    assertEquals("name", actualName);
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualToStringResult);
    String actualToStringResult1 = domain.toString();
    Expression expression = ((ExpressionIteratorDomain) domain).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualToStringResult1);
    Type type = expression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test(timeout=10000)
  public void getDomainTest() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act and Assert
    assertSame(expressionIteratorDomain, (new Iterator("name", expressionIteratorDomain)).getDomain());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))",
        (new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()))).toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()))).getName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Iterator actualIterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Assert
    String actualName = actualIterator.getName();
    assertEquals("name", actualName);
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualIterator.toString());
  }
}

