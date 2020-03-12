package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NamedTypeExpressionDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("qualifiedName",
        ((NamedTypeExpression) namedTypeExpression.accept(new CloneVisitor(), params)).getQualifiedName());
    assertTrue(((NamedTypeExpression) namedTypeExpression.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NamedTypeExpression actualNamedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Assert
    assertEquals("qualifiedName", actualNamedTypeExpression.getQualifiedName());
    assertTrue(actualNamedTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedTypeExpression(qualifiedName)", (new NamedTypeExpression("qualifiedName")).toString());
  }
}

