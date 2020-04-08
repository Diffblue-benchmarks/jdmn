package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import org.junit.Test;

public class NamedTypeExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    NamedTypeExpression actualNamedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Assert
    assertEquals("qualifiedName", actualNamedTypeExpression.getQualifiedName());
    assertTrue(actualNamedTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
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
  public void testAccept2() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(namedTypeExpression, namedTypeExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NamedTypeExpression(qualifiedName)", (new NamedTypeExpression("qualifiedName")).toString());
  }
}

