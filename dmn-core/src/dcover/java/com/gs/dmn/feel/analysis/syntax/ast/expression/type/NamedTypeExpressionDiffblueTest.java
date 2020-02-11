package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NamedTypeExpressionDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    String actualQualifiedName = ((NamedTypeExpression) namedTypeExpression.accept(visitor,
        FEELContext.makeContext(null))).getQualifiedName();
    assertEquals("name", actualQualifiedName);
    assertTrue(((NamedTypeExpression) namedTypeExpression.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NamedTypeExpression actualNamedTypeExpression = new NamedTypeExpression("name");

    // Assert
    String actualQualifiedName = actualNamedTypeExpression.getQualifiedName();
    assertEquals("name", actualQualifiedName);
    assertTrue(actualNamedTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedTypeExpression(name)", (new NamedTypeExpression("name")).toString());
  }

  @Test(timeout=10000)
  public void getQualifiedNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new NamedTypeExpression("name")).getQualifiedName());
  }
}

