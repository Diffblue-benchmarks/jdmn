package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange
    NumberType other = new NumberType();

    // Act and Assert
    assertFalse((new StringType()).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    NumberType other = new NumberType();

    // Act and Assert
    assertFalse((new StringType()).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    DurationType other = new DurationType("years and months duration");

    // Act and Assert
    assertFalse((new StringType()).equivalentTo(other));
  }
}

