package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.time.format.DateTimeParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateTimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
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
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.isValidTime(1, 1, 1, Integer.valueOf(1)));
  }
  @Test(timeout=10000)
  public void isValidDateTest() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.isValidDate(1L, 1L, 1L));
  }
  @Test(timeout=10000)
  public void hasOffsetTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasOffset("foo"));
  }
  @Test(timeout=10000)
  public void invalidYearTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.invalidYear("foo"));
  }
  @Test(timeout=10000)
  public void makeOffsetTimeTest() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeOffsetTime("foo"));
  }
  @Test(timeout=10000)
  public void isValidDateTimeTest() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.isValidDateTime(1L, 1L, 1L, 1, 1, 1, Integer.valueOf(1)));
  }
  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", DateTimeUtil.string("foo"));
  }
  @Test(timeout=10000)
  public void hasZoneTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasZone("foo"));
  }
  @Test(timeout=10000)
  public void fixDateTimeFormatTest() {
    // Arrange, Act and Assert
    assertEquals("foo", DateTimeUtil.fixDateTimeFormat("foo"));
  }
  @Test(timeout=10000)
  public void hasTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasTime("foo"));
  }
  @Test(timeout=10000)
  public void makeDateTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("foo");
  }
}

