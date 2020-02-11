package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class NameDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    Name name = new Name("name");
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = name.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((Name) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    Name name = new Name("name");

    // Act
    name.setName("name");

    // Assert
    assertEquals("Name(name)", name.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Name actualName = new Name("name");

    // Assert
    Type type = actualName.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualName.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Name(name)", (new Name("name")).toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new Name("name")).getName());
  }
}

