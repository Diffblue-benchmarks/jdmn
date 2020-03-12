package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DateTimeTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DateTimeType actualDateTimeType = new DateTimeType("2020-03-01");

    // Assert
    assertEquals("2020-03-01", actualDateTimeType.getName());
    assertEquals("date and time", actualDateTimeType.getConversionFunction());
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    DateTimeType dateTimeType = new DateTimeType("2020-03-01");

    // Act and Assert
    assertFalse(dateTimeType.equivalentTo(new AnyType()));
  }

  @Test
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(DateTimeType.getMemberType("dateTime"));
  }
}

