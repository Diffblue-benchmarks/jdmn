package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ListTypeExpressionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ListTypeExpression listTypeExpression = new ListTypeExpression(new NamedTypeExpression("name"));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = listTypeExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListTypeExpression) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression(name))", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void getElementTypeExpressionTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act and Assert
    assertSame(namedTypeExpression, (new ListTypeExpression(namedTypeExpression)).getElementTypeExpression());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ListTypeExpression actualListTypeExpression = new ListTypeExpression(new NamedTypeExpression("name"));

    // Assert
    Type type = actualListTypeExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression(name))", actualListTypeExpression.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListTypeExpression(NamedTypeExpression(name))",
        (new ListTypeExpression(new NamedTypeExpression("name"))).toString());
  }
}

