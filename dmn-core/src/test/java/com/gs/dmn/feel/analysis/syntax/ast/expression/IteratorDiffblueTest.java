package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IteratorDiffblueTest {
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

