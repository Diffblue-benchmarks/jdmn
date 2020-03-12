package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class PathExpressionDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = pathExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((PathExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualAcceptResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("PathExpression(ExpressionList(), member)", actualAcceptResult.toString());
    assertEquals("member", ((PathExpression) actualAcceptResult).getMember());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, source.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new ExpressionList(), "member");

    // Assert
    assertTrue(actualPathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(ExpressionList(), member)", actualPathExpression.toString());
    assertEquals("member", actualPathExpression.getMember());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");

    // Act
    pathExpression.deriveType(null);

    // Assert
    assertTrue(pathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PathExpression(ExpressionList(), member)",
        (new PathExpression(new ExpressionList(), "member")).toString());
  }
}

