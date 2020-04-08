package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import org.junit.Test;

public class IteratorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Iterator actualIterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Assert
    assertEquals("name", actualIterator.getName());
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualIterator.toString());
  }

  @Test
  public void testAccept() {
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
  public void testAccept2() {
    // Arrange
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(iterator, iterator.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))",
        (new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()))).toString());
  }
}

