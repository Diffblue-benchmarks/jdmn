package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RangeIteratorDomainDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(new ExpressionList(), new ExpressionList())).toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(new ExpressionList(), new ExpressionList())).toString());
  }
}

