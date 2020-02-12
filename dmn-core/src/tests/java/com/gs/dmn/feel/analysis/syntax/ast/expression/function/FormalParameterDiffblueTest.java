package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import org.junit.Test;

public class FormalParameterDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertSame(formalParameter, formalParameter.accept(visitor, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    FormalParameter actualFormalParameter = new FormalParameter("name", new AnyType());

    // Assert
    String actualName = actualFormalParameter.getName();
    assertEquals("FormalParameter(name, Any)", actualFormalParameter.toString());
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new FormalParameter("name", new AnyType())).equals("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act
    FormalParameter actualFormalParameter = new FormalParameter("name", namedTypeExpression);

    // Assert
    String actualName = actualFormalParameter.getName();
    assertSame(namedTypeExpression, actualFormalParameter.getTypeExpression());
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void getTypeExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FormalParameter("name", new AnyType())).getTypeExpression());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("FormalParameter(name, Any)", (new FormalParameter("name", new AnyType())).toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new FormalParameter("name", new AnyType())).getName());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter.type, formalParameter.getType());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act
    formalParameter.setType(new AnyType());

    // Assert
    assertEquals("FormalParameter(name, Any)", formalParameter.toString());
  }
}

