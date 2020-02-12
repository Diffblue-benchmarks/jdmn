package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.time.OffsetTime;
import java.time.format.DateTimeParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateTimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void makeLocalDateTest2() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeLocalDate(""));
  }
  @Test(timeout=10000)
  public void makeLocalDateTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeLocalDate("foo");
  }
  @Test(timeout=10000)
  public void timeHasOffsetTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.timeHasOffset("foo"));
  }
  @Test(timeout=10000)
  public void isTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isTime("foo"));
  }
  @Test(timeout=10000)
  public void isValidTimeTest() {
    // Arrange
    boolean actualIsValidTimeResult = DateTimeUtil.isValidTime(1, 1, 1, Integer.valueOf(1));
    boolean actualIsValidTimeResult1 = DateTimeUtil.isValidTime(-1, 1, 1, Integer.valueOf(1));
    boolean actualIsValidTimeResult2 = DateTimeUtil.isValidTime(1, -1, 1, Integer.valueOf(1));
    boolean actualIsValidTimeResult3 = DateTimeUtil.isValidTime(1, 1, -1, Integer.valueOf(1));
    boolean actualIsValidTimeResult4 = DateTimeUtil.isValidTime(1, 1, 1, Integer.valueOf(-2147483648));

    // Act and Assert
    assertTrue(actualIsValidTimeResult);
    assertFalse(actualIsValidTimeResult1);
    assertFalse(actualIsValidTimeResult2);
    assertFalse(actualIsValidTimeResult3);
    assertTrue(actualIsValidTimeResult4);
    assertFalse(DateTimeUtil.isValidTime(1, 1, 1, Integer.valueOf(64800)));
  }
  @Test(timeout=10000)
  public void isValidDateTest() {
    // Arrange
    boolean actualIsValidDateResult = DateTimeUtil.isValidDate(1L, 1L, 1L);
    boolean actualIsValidDateResult1 = DateTimeUtil.isValidDate(9223372036854775807L, 1L, 1L);

    // Act and Assert
    assertTrue(actualIsValidDateResult);
    assertFalse(actualIsValidDateResult1);
    assertFalse(DateTimeUtil.isValidDate(1L, 1L, -999999999L));
  }
  @Test(timeout=10000)
  public void hasOffsetTest() {
    // Arrange
    boolean actualHasOffsetResult = DateTimeUtil.hasOffset("foo");

    // Act and Assert
    assertFalse(actualHasOffsetResult);
    assertFalse(DateTimeUtil.hasOffset("-"));
  }
  @Test(timeout=10000)
  public void invalidYearTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.invalidYear("foo"));
  }
  @Test(timeout=10000)
  public void makeOffsetTimeTest() {
    // Arrange
    OffsetTime actualMakeOffsetTimeResult = DateTimeUtil.makeOffsetTime("foo");

    // Act and Assert
    assertNull(actualMakeOffsetTimeResult);
    assertNull(DateTimeUtil.makeOffsetTime("T"));
  }
  @Test(timeout=10000)
  public void isValidDateTimeTest() {
    // Arrange
    boolean actualIsValidDateTimeResult = DateTimeUtil.isValidDateTime(1L, 1L, 1L, 1, 1, 1, Integer.valueOf(1));
    boolean actualIsValidDateTimeResult1 = DateTimeUtil.isValidDateTime(-2147483648L, 1L, 1L, 1, 1, 1,
        Integer.valueOf(1));
    boolean actualIsValidDateTimeResult2 = DateTimeUtil.isValidDateTime(1L, -999999999L, 1L, 1, 1, 1,
        Integer.valueOf(1));
    boolean actualIsValidDateTimeResult3 = DateTimeUtil.isValidDateTime(1L, 1L, 1L, -999999999, 1, 1,
        Integer.valueOf(1));
    boolean actualIsValidDateTimeResult4 = DateTimeUtil.isValidDateTime(1L, 1L, 1L, 1, -999999999, 1,
        Integer.valueOf(1));
    boolean actualIsValidDateTimeResult5 = DateTimeUtil.isValidDateTime(1L, 1L, 1L, 1, 999999999, 1,
        Integer.valueOf(1));
    boolean actualIsValidDateTimeResult6 = DateTimeUtil.isValidDateTime(1L, 1L, 1L, 1, 1, 1,
        Integer.valueOf(-999999999));

    // Act and Assert
    assertTrue(actualIsValidDateTimeResult);
    assertFalse(actualIsValidDateTimeResult1);
    assertFalse(actualIsValidDateTimeResult2);
    assertFalse(actualIsValidDateTimeResult3);
    assertFalse(actualIsValidDateTimeResult4);
    assertFalse(actualIsValidDateTimeResult5);
    assertFalse(actualIsValidDateTimeResult6);
    assertTrue(DateTimeUtil.isValidDateTime(1L, 1L, 1L, 1, 1, 1, Integer.valueOf(-2147483648)));
  }
  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", DateTimeUtil.string("foo"));
  }
  @Test(timeout=10000)
  public void hasZoneTest() {
    // Arrange
    boolean actualHasZoneResult = DateTimeUtil.hasZone("foo");

    // Act and Assert
    assertFalse(actualHasZoneResult);
    assertTrue(DateTimeUtil.hasZone("Z"));
  }
  @Test(timeout=10000)
  public void fixDateTimeFormatTest() {
    // Arrange
    String actualFixDateTimeFormatResult = DateTimeUtil.fixDateTimeFormat("foo");

    // Act and Assert
    assertEquals("foo", actualFixDateTimeFormatResult);
    assertEquals("", DateTimeUtil.fixDateTimeFormat("T"));
  }
  @Test(timeout=10000)
  public void hasTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasTime("foo"));
  }
  @Test(timeout=10000)
  public void makeDateTimeTest3() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeDateTime(""));
  }
  @Test(timeout=10000)
  public void makeDateTimeTest2() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("foo");
  }
  @Test(timeout=10000)
  public void makeDateTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("Z");
  }
}

