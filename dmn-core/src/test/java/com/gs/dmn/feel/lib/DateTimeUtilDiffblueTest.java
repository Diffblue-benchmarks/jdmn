package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.lib.type.time.xml.FEELXMLGregorianCalendar;
import java.time.OffsetTime;
import java.time.format.DateTimeParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateTimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fixDateTimeFormatTest() {
    // Arrange, Act and Assert
    assertEquals("+", DateTimeUtil.fixDateTimeFormat("+"));
  }
  @Test
  public void hasOffsetTest() {
    // Arrange
    boolean actualHasOffsetResult = DateTimeUtil.hasOffset("+");

    // Act and Assert
    assertFalse(actualHasOffsetResult);
    assertFalse(DateTimeUtil.hasOffset("@"));
  }
  @Test
  public void hasTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasTime("+"));
  }
  @Test
  public void hasZoneTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasZone("+"));
  }
  @Test
  public void invalidYearTest() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    DateTimeUtil.invalidYear("-");
  }
  @Test
  public void invalidYearTest2() {
    // Arrange
    boolean actualInvalidYearResult = DateTimeUtil.invalidYear("+");
    boolean actualInvalidYearResult1 = DateTimeUtil.invalidYear("0.######");

    // Act and Assert
    assertFalse(actualInvalidYearResult);
    assertFalse(actualInvalidYearResult1);
    assertTrue(DateTimeUtil.invalidYear(""));
  }
  @Test
  public void isTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isTime("+"));
  }
  @Test
  public void isValidDateTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(new FEELXMLGregorianCalendar()));
  }
  @Test
  public void isValidDateTest2() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(-2147483648L, -2147483648L, -2147483648L));
  }
  @Test
  public void isValidDateTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(new FEELXMLGregorianCalendar()));
  }
  @Test
  public void isValidDateTimeTest2() {
    // Arrange
    boolean actualIsValidDateTimeResult = DateTimeUtil.isValidDateTime(-2147483648L, -2147483648L, -2147483648L, -64800,
        1, -64800, -64800);
    boolean actualIsValidDateTimeResult1 = DateTimeUtil.isValidDateTime(252L, -2147483648L, -2147483648L, -64800, 1,
        -64800, -64800);
    boolean actualIsValidDateTimeResult2 = DateTimeUtil.isValidDateTime(9223372036854775807L, -2147483648L,
        -2147483648L, -64800, 1, -64800, -64800);
    boolean actualIsValidDateTimeResult3 = DateTimeUtil.isValidDateTime(252L, 252L, -2147483648L, -64800, 1, -64800,
        -64800);

    // Act and Assert
    assertFalse(actualIsValidDateTimeResult);
    assertFalse(actualIsValidDateTimeResult1);
    assertFalse(actualIsValidDateTimeResult2);
    assertFalse(actualIsValidDateTimeResult3);
    assertFalse(DateTimeUtil.isValidDateTime(252L, 1L, -2147483648L, -64800, 1, -64800, -64800));
  }
  @Test
  public void isValidTimeTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidTime(new FEELXMLGregorianCalendar()));
  }
  @Test
  public void isValidTimeTest2() {
    // Arrange
    boolean actualIsValidTimeResult = DateTimeUtil.isValidTime(-64800, 1, -64800, -64800);
    boolean actualIsValidTimeResult1 = DateTimeUtil.isValidTime(252, 1, -64800, -64800);
    boolean actualIsValidTimeResult2 = DateTimeUtil.isValidTime(0, 1, -64800, -64800);
    boolean actualIsValidTimeResult3 = DateTimeUtil.isValidTime(0, 252, -64800, -64800);
    boolean actualIsValidTimeResult4 = DateTimeUtil.isValidTime(0, -1, -64800, -64800);
    boolean actualIsValidTimeResult5 = DateTimeUtil.isValidTime(0, 1, 252, -64800);
    boolean actualIsValidTimeResult6 = DateTimeUtil.isValidTime(0, 1, 0, -64800);
    boolean actualIsValidTimeResult7 = DateTimeUtil.isValidTime(0, 1, 0, -2147483648);

    // Act and Assert
    assertFalse(actualIsValidTimeResult);
    assertFalse(actualIsValidTimeResult1);
    assertFalse(actualIsValidTimeResult2);
    assertFalse(actualIsValidTimeResult3);
    assertFalse(actualIsValidTimeResult4);
    assertFalse(actualIsValidTimeResult5);
    assertTrue(actualIsValidTimeResult6);
    assertTrue(actualIsValidTimeResult7);
    assertFalse(DateTimeUtil.isValidTime(0, 1, 0, 64800));
  }
  @Test
  public void makeDateTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("]");
  }
  @Test
  public void makeDateTimeTest2() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeDateTime(""));
  }
  @Test
  public void makeDateTimeTest3() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("T");
  }
  @Test
  public void makeDateTimeTest4() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("@");
  }
  @Test
  public void makeDateTimeTest5() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("-");
  }
  @Test
  public void makeDateTimeTest6() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("0.######");
  }
  @Test
  public void makeDateTimeTest7() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("Z");
  }
  @Test
  public void makeDateTimeTest8() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("+");
  }
  @Test
  public void makeDateTimeTest9() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeDateTime("UTC");
  }
  @Test
  public void makeLocalDateTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeParseException.class);
    DateTimeUtil.makeLocalDate("+");
  }
  @Test
  public void makeLocalDateTest2() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeLocalDate("T"));
  }
  @Test
  public void makeOffsetTimeTest() {
    // Arrange
    OffsetTime actualMakeOffsetTimeResult = DateTimeUtil.makeOffsetTime("+");

    // Act and Assert
    assertNull(actualMakeOffsetTimeResult);
    assertNull(DateTimeUtil.makeOffsetTime("0.######"));
  }
  @Test
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("+", DateTimeUtil.string("+"));
  }
  @Test
  public void timeHasOffsetTest() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.timeHasOffset("+"));
  }
}

