package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.ListType;
import com.gs.dmn.feel.analysis.semantics.type.NullType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import org.junit.Test;

public class VariableDeclarationDiffblueTest {
  @Test
  public void testSetType() {
    // Arrange
    VariableDeclaration variableDeclaration = new VariableDeclaration("partial", new ListType(new NullType()));
    ListType listType = new ListType(new NumberType());

    // Act
    variableDeclaration.setType(listType);

    // Assert
    assertSame(listType, variableDeclaration.getType());
  }
}

