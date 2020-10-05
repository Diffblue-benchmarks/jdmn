package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class BooleanTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange, Act and Assert
    assertFalse((new BooleanType()).equivalentTo(new BooleanType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    NumberType other = new NumberType();

    // Act and Assert
    assertFalse((new BooleanType()).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    NumberType other = new NumberType();

    // Act and Assert
    assertFalse((new BooleanType()).equivalentTo(other));
  }
}

