package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import org.junit.Test;

public class FormalParameterDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(formalParameter, formalParameter.accept(new CloneVisitor(), params));
  }

  @Test
  public void constructorTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Act
    FormalParameter actualFormalParameter = new FormalParameter("name", namedTypeExpression);

    // Assert
    assertSame(namedTypeExpression, actualFormalParameter.getTypeExpression());
    assertEquals("name", actualFormalParameter.getName());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    FormalParameter actualFormalParameter = new FormalParameter("name", new AnyType());

    // Assert
    assertEquals("FormalParameter(name, Any)", actualFormalParameter.toString());
    assertEquals("name", actualFormalParameter.getName());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new FormalParameter("name", new AnyType())).equals("o"));
  }

  @Test
  public void setTypeTest() {
    // Arrange
    AnyType anyType = new AnyType();
    FormalParameter formalParameter = new FormalParameter("name", anyType);

    // Act
    formalParameter.setType(anyType);

    // Assert
    assertEquals("FormalParameter(name, Any)", formalParameter.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("FormalParameter(name, Any)", (new FormalParameter("name", new AnyType())).toString());
  }
}

