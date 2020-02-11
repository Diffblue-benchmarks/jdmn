package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import org.junit.Test;

public class VariableDeclarationDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    VariableDeclaration actualVariableDeclaration = new VariableDeclaration("name", anyType);

    // Assert
    Type actualType = actualVariableDeclaration.getType();
    assertSame(anyType, actualType);
    assertEquals("name", actualVariableDeclaration.getName());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, (new VariableDeclaration("name", anyType)).getType());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    VariableDeclaration variableDeclaration = new VariableDeclaration("name", new AnyType());
    AnyType anyType = new AnyType();

    // Act
    variableDeclaration.setType(anyType);

    // Assert
    assertSame(anyType, variableDeclaration.getType());
  }
}

