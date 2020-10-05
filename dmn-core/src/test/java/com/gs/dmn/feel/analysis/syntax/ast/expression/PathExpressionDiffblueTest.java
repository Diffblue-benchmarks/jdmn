package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PathExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new Name("loan"), "principal");

    // Assert
    assertTrue(actualPathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Name(loan), principal)", actualPathExpression.toString());
    assertEquals("principal", actualPathExpression.getMember());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new Name("loan"), "rate");

    // Assert
    assertTrue(actualPathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Name(loan), rate)", actualPathExpression.toString());
    assertEquals("rate", actualPathExpression.getMember());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new Name("loan"), "rate");

    // Assert
    assertTrue(actualPathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Name(loan), rate)", actualPathExpression.toString());
    assertEquals("rate", actualPathExpression.getMember());
  }
}

