package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DateTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DateType actualDateType = new DateType();

    // Assert
    assertEquals("date", actualDateType.getName());
    assertEquals("date", actualDateType.getConversionFunction());
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.equivalentTo(new AnyType()));
  }

  @Test
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(DateType.getMemberType("date"));
  }
}

