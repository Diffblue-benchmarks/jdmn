package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NameDiffblueTest {
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

