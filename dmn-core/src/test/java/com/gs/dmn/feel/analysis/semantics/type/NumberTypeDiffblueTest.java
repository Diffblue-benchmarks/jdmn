package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NumberTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    NumberType actualNumberType = new NumberType();

    // Assert
    assertEquals("number", actualNumberType.getName());
    assertEquals("number", actualNumberType.getConversionFunction());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    NumberType numberType = new NumberType();

    // Act and Assert
    assertFalse(numberType.equivalentTo(new AnyType()));
  }
}

