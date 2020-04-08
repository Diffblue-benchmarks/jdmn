package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class StringTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    StringType actualStringType = new StringType();

    // Assert
    assertEquals("string", actualStringType.getName());
    assertNull(actualStringType.getConversionFunction());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    StringType stringType = new StringType();

    // Act and Assert
    assertFalse(stringType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    StringType stringType = new StringType();

    // Act and Assert
    assertFalse(stringType.equivalentTo(new AnyType()));
  }
}

