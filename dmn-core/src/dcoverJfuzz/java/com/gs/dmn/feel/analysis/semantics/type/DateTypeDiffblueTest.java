package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DateTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DateType actualDateType = new DateType();

    // Assert
    String actualName = actualDateType.getName();
    assertEquals("date", actualName);
    assertEquals("date", actualDateType.getConversionFunction());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(DateType.getMemberType("foo"));
  }
}

