package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DateTimeTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    DateTimeType dateTimeType = new DateTimeType("foo");

    // Act and Assert
    assertFalse(dateTimeType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DateTimeType actualDateTimeType = new DateTimeType("foo");

    // Assert
    String actualName = actualDateTimeType.getName();
    assertEquals("foo", actualName);
    assertEquals("date and time", actualDateTimeType.getConversionFunction());
  }

  @Test(timeout=10000)
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(DateTimeType.getMemberType("foo"));
  }
}

