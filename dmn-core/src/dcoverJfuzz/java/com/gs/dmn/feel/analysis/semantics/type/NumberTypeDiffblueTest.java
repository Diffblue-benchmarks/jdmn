package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NumberTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    NumberType numberType = new NumberType();

    // Act and Assert
    assertFalse(numberType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NumberType actualNumberType = new NumberType();

    // Assert
    String actualName = actualNumberType.getName();
    assertEquals("number", actualName);
    assertEquals("number", actualNumberType.getConversionFunction());
  }
}

