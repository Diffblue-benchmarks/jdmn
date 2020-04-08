package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class VariableDeclarationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    VariableDeclaration actualVariableDeclaration = new VariableDeclaration("name", anyType);

    // Assert
    assertSame(anyType, actualVariableDeclaration.getType());
    assertEquals("name", actualVariableDeclaration.getName());
  }

  @Test
  public void testSetType() {
    // Arrange
    AnyType anyType = new AnyType();
    VariableDeclaration variableDeclaration = new VariableDeclaration("name", anyType);

    // Act
    variableDeclaration.setType(anyType);

    // Assert
    assertSame(anyType, variableDeclaration.getType());
  }
}

