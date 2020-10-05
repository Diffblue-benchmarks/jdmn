package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DateTimeTypeDiffblueTest {
  @Test
  public void testGetMemberType() {
    // Arrange and Act
    Type actualMemberType = DateTimeType.getMemberType("hour");

    // Assert
    assertSame(((NumberType) actualMemberType).NUMBER, actualMemberType);
  }

  @Test
  public void testGetMemberType2() {
    // Arrange and Act
    Type actualMemberType = DateTimeType.getMemberType("minute");

    // Assert
    assertSame(((NumberType) actualMemberType).NUMBER, actualMemberType);
  }

  @Test
  public void testGetMemberType3() {
    // Arrange and Act
    Type actualMemberType = DateTimeType.getMemberType("time offset");

    // Assert
    assertSame(((DurationType) actualMemberType).DAYS_AND_TIME_DURATION, actualMemberType);
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    DateTimeType dateTimeType = new DateTimeType("date and time");

    // Act and Assert
    assertFalse(dateTimeType.equivalentTo(new StringType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    DateTimeType dateTimeType = new DateTimeType("date and time");

    // Act and Assert
    assertFalse(dateTimeType.equivalentTo(new DateType()));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange, Act and Assert
    assertFalse((new DateTimeType("date and time")).equivalentTo(new DateTimeType("date and time")));
  }
}

