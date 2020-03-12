package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExpressionIteratorDomainDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }
}

