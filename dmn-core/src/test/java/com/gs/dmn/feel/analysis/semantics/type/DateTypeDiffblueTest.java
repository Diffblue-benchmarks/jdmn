package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DateTypeDiffblueTest {
  @Test
  public void testGetMemberType() {
    // Arrange, Act and Assert
    assertNull(DateType.getMemberType("date"));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    DateType actualDateType = new DateType();

    // Assert
    assertEquals("date", actualDateType.getName());
    assertEquals("date", actualDateType.getConversionFunction());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.equivalentTo(new AnyType()));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.conformsTo(new BooleanType()));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    DateType dateType = new DateType();

    // Act and Assert
    assertFalse(dateType.conformsTo(new AnyType()));
  }
}

