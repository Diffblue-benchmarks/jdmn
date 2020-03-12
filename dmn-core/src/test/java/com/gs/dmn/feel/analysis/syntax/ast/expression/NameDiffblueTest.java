package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NameDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    Name name = new Name("name");
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = name.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(((Name) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualAcceptResult.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Name actualName = new Name("name");

    // Assert
    assertTrue(actualName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualName.toString());
  }

  @Test
  public void setNameTest() {
    // Arrange
    Name name = new Name("name");

    // Act
    name.setName("name");

    // Assert
    assertEquals("Name(name)", name.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Name(name)", (new Name("name")).toString());
  }
}

