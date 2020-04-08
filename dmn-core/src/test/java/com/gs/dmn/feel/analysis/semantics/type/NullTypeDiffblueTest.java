package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NullTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange
    NullType nullType = new NullType();

    // Act and Assert
    assertFalse(nullType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    NullType nullType = new NullType();

    // Act and Assert
    assertFalse(nullType.equivalentTo(new AnyType()));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    NullType nullType = new NullType();

    // Act and Assert
    assertTrue(nullType.conformsTo(new AnyType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new NullType()).isValid());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    NullType actualNullType = new NullType();

    // Assert
    assertEquals("NullType", actualNullType.toString());
    assertTrue(actualNullType.isValid());
  }
}

