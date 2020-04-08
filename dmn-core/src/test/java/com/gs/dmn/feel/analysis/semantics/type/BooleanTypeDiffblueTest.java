package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class BooleanTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    BooleanType actualBooleanType = new BooleanType();

    // Assert
    assertEquals("boolean", actualBooleanType.getName());
    assertNull(actualBooleanType.getConversionFunction());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    BooleanType booleanType = new BooleanType();

    // Act and Assert
    assertFalse(booleanType.equivalentTo(new AnyType()));
  }
}

