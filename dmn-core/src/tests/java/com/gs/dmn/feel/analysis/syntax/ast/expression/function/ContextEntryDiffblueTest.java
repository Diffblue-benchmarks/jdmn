package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ContextEntryDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ContextEntryKey key = new ContextEntryKey("foo");
    ContextEntry contextEntry = new ContextEntry(key, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = contextEntry.accept(visitor, FEELContext.makeContext(null));

    // Assert
    String actualToStringResult = actualAcceptResult.toString();
    ContextEntryKey key1 = ((ContextEntry) actualAcceptResult).getKey();
    Expression expression = ((ContextEntry) actualAcceptResult).getExpression();
    assertEquals("ContextEntry(ContextEntryKey(foo) =" + " ExpressionList())", actualToStringResult);
    String actualToStringResult1 = key1.toString();
    Type type = expression.getType();
    assertEquals("ContextEntryKey(foo)", actualToStringResult1);
    assertEquals("ExpressionList()", expression.toString());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ContextEntryKey key = new ContextEntryKey("foo");

    // Act and Assert
    assertEquals("ContextEntry(ContextEntryKey(foo) =" + " ExpressionList())",
        (new ContextEntry(key, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void getExpressionTest() {
    // Arrange
    ContextEntryKey key = new ContextEntryKey("foo");
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new ContextEntry(key, expressionList)).getExpression());
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange
    ContextEntryKey contextEntryKey = new ContextEntryKey("foo");

    // Act and Assert
    assertSame(contextEntryKey, (new ContextEntry(contextEntryKey, new ExpressionList())).getKey());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ContextEntryKey key = new ContextEntryKey("foo");

    // Act and Assert
    assertEquals("ContextEntry(ContextEntryKey(foo) =" + " ExpressionList())",
        (new ContextEntry(key, new ExpressionList())).toString());
  }
}

