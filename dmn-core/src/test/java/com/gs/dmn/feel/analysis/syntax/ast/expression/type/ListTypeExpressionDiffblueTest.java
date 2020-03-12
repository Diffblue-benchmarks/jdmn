package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ListTypeExpressionDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ListTypeExpression listTypeExpression = new ListTypeExpression(new NamedTypeExpression("qualifiedName"));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = listTypeExpression.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(
        ((ListTypeExpression) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))", actualAcceptResult.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ListTypeExpression actualListTypeExpression = new ListTypeExpression(new NamedTypeExpression("qualifiedName"));

    // Assert
    assertTrue(actualListTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))", actualListTypeExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))",
        (new ListTypeExpression(new NamedTypeExpression("qualifiedName"))).toString());
  }
}

