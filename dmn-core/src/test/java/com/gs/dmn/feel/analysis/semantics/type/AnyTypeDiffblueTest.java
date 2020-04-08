package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AnyTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Any", (new AnyType()).getName());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertFalse(anyType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertFalse(anyType.equivalentTo(new AnyType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new AnyType()).isValid());
  }
}

