package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NullTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    NullType nullType = new NullType();

    // Act and Assert
    assertTrue(nullType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NullType actualNullType = new NullType();

    // Assert
    assertEquals("NullType", actualNullType.toString());
    assertTrue(actualNullType.isValid());
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    NullType nullType = new NullType();

    // Act and Assert
    assertFalse(nullType.equivalentTo(new AnyType()));
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new NullType()).isValid());
  }
}

