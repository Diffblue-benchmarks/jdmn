package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class StringTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    StringType stringType = new StringType();

    // Act and Assert
    assertFalse(stringType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    StringType actualStringType = new StringType();

    // Assert
    String actualName = actualStringType.getName();
    assertEquals("string", actualName);
    assertNull(actualStringType.getConversionFunction());
  }
}

