package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ContextEntryDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    ContextEntry actualContextEntry = new ContextEntry(null, expressionList);

    // Assert
    assertNull(actualContextEntry.getKey());
    assertSame(expressionList, actualContextEntry.getExpression());
  }

  @Test
  public void testAccept() {
    // Arrange
    ContextEntry contextEntry = new ContextEntry(null, new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(contextEntry, contextEntry.accept(new NopVisitor(), params));
  }
}

