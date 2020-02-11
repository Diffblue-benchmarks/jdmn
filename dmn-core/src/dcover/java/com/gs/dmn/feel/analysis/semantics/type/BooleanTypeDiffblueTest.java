package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class BooleanTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    BooleanType booleanType = new BooleanType();

    // Act and Assert
    assertFalse(booleanType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    BooleanType actualBooleanType = new BooleanType();

    // Assert
    String actualName = actualBooleanType.getName();
    assertEquals("boolean", actualName);
    assertNull(actualBooleanType.getConversionFunction());
  }
}

