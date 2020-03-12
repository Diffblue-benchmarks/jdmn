package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class IteratorDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = iterator.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("name", ((Iterator) actualAcceptResult).getName());
    IteratorDomain domain = ((Iterator) actualAcceptResult).getDomain();
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualAcceptResult.toString());
    Expression expression = ((ExpressionIteratorDomain) domain).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", domain.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Iterator actualIterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Assert
    assertEquals("name", actualIterator.getName());
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualIterator.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))",
        (new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()))).toString());
  }
}

