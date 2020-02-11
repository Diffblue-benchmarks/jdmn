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
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "foo");
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = pathExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    String actualMember = ((PathExpression) actualAcceptResult).getMember();
    Expression source = ((PathExpression) actualAcceptResult).getSource();
    assertTrue(type instanceof AnyType);
    Type actualType = source.getType();
    assertEquals("PathExpression(ExpressionList(), foo)", actualToStringResult);
    assertEquals("foo", actualMember);
    assertEquals("ExpressionList()", source.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getSourceTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new PathExpression(expressionList, "foo")).getSource());
  }

  @Test(timeout=10000)
  public void getMemberTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new PathExpression(new ExpressionList(), "foo")).getMember());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new ExpressionList(), "foo");

    // Assert
    Type type = actualPathExpression.getType();
    String actualToStringResult = actualPathExpression.toString();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(ExpressionList(), foo)", actualToStringResult);
    assertEquals("foo", actualPathExpression.getMember());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PathExpression(ExpressionList(), foo)", (new PathExpression(new ExpressionList(), "foo")).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "foo");

    // Act
    pathExpression.deriveType(null);

    // Assert
    assertTrue(pathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
}

