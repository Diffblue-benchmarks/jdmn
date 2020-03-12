package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class BooleanTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    BooleanType actualBooleanType = new BooleanType();

    // Assert
    assertEquals("boolean", actualBooleanType.getName());
    assertNull(actualBooleanType.getConversionFunction());
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    BooleanType booleanType = new BooleanType();

    // Act and Assert
    assertFalse(booleanType.equivalentTo(new AnyType()));
  }
}

