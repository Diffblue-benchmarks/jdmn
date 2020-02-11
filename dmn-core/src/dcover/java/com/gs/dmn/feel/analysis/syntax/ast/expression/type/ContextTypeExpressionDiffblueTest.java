package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ContextTypeExpressionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ContextTypeExpression contextTypeExpression = new ContextTypeExpression(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    Type type = ((ContextTypeExpression) contextTypeExpression.accept(visitor, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(
        ((ContextTypeExpression) contextTypeExpression.accept(visitor, FEELContext.makeContext(null))).getMembers());
  }

  @Test(timeout=10000)
  public void getMembersTest() {
    // Arrange, Act and Assert
    assertNull((new ContextTypeExpression(null)).getMembers());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ContextTypeExpression actualContextTypeExpression = new ContextTypeExpression(null);

    // Assert
    Type type = actualContextTypeExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualContextTypeExpression.getMembers());
  }
}

