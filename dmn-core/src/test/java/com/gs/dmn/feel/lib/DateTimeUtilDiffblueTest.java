package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.lib.type.time.xml.FEELXMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.Calendar;
import net.sf.saxon.value.DateTimeValue;
import net.sf.saxon.value.DateValue;
import net.sf.saxon.value.GYearMonthValue;
import net.sf.saxon.value.SaxonXMLGregorianCalendar;
import org.junit.Test;

public class DateTimeUtilDiffblueTest {
  @Test
  public void testFixDateTimeFormat() {
    // Arrange
    String actualFixDateTimeFormatResult = DateTimeUtil.fixDateTimeFormat("+");

    // Act and Assert
    assertEquals("+", actualFixDateTimeFormatResult);
    assertNull(DateTimeUtil.fixDateTimeFormat(null));
  }

  @Test
  public void testFixDateTimeFormat2() {
    // Arrange, Act and Assert
    assertEquals("BvSSRS BY[", DateTimeUtil.fixDateTimeFormat("BvSSRS BY["));
  }

  @Test
  public void testFixDateTimeFormat3() {
    // Arrange, Act and Assert
    assertEquals("iehh@+`j:I[", DateTimeUtil.fixDateTimeFormat("iehh@+`jI["));
  }

  @Test
  public void testIsTime() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isTime("+"));
  }

  @Test
  public void testIsTime2() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isTime("!!!000"));
  }

  @Test
  public void testIsTime3() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.isTime(":::+++"));
  }

  @Test
  public void testHasTime() {
    // Arrange
    boolean actualHasTimeResult = DateTimeUtil.hasTime("+");

    // Act and Assert
    assertFalse(actualHasTimeResult);
    assertFalse(DateTimeUtil.hasTime(null));
  }

  @Test
  public void testHasTime2() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.hasTime("               T!!"));
  }

  @Test
  public void testHasZone() {
    // Arrange
    boolean actualHasZoneResult = DateTimeUtil.hasZone("+");

    // Act and Assert
    assertFalse(actualHasZoneResult);
    assertFalse(DateTimeUtil.hasZone(null));
  }

  @Test
  public void testHasOffset() {
    // Arrange
    boolean actualHasOffsetResult = DateTimeUtil.hasOffset("+");
    boolean actualHasOffsetResult1 = DateTimeUtil.hasOffset(null);

    // Act and Assert
    assertFalse(actualHasOffsetResult);
    assertFalse(actualHasOffsetResult1);
    assertFalse(DateTimeUtil.hasOffset("@"));
  }

  @Test
  public void testHasOffset2() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasOffset("=]\\\\\\\\\\\\\\\\8]YYZR["));
  }

  @Test
  public void testHasOffset3() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasOffset(")]]]]]-5YY]]["));
  }

  @Test
  public void testHasOffset4() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.hasOffset("+,-,---YIiZY[@"));
  }

  @Test
  public void testTimeHasOffset() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.timeHasOffset("+"));
  }

  @Test
  public void testTimeHasOffset2() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.timeHasOffset("$$$$$$$$$"));
  }

  @Test
  public void testTimeHasOffset3() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.timeHasOffset("---------"));
  }

  @Test
  public void testTimeHasOffset4() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.timeHasOffset("+++++++++"));
  }

  @Test
  public void testMakeLocalDate() {
    // Arrange
    LocalDate actualMakeLocalDateResult = DateTimeUtil.makeLocalDate(null);

    // Act and Assert
    assertNull(actualMakeLocalDateResult);
    assertNull(DateTimeUtil.makeLocalDate("T"));
  }

  @Test
  public void testMakeLocalDate2() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeLocalDate(""));
  }

  @Test
  public void testMakeOffsetTime() {
    // Arrange
    OffsetTime actualMakeOffsetTimeResult = DateTimeUtil.makeOffsetTime("+");
    OffsetTime actualMakeOffsetTimeResult1 = DateTimeUtil.makeOffsetTime(null);

    // Act and Assert
    assertNull(actualMakeOffsetTimeResult);
    assertNull(actualMakeOffsetTimeResult1);
    assertNull(DateTimeUtil.makeOffsetTime("0.######"));
  }

  @Test
  public void testMakeDateTime() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeDateTime(null));
  }

  @Test
  public void testMakeDateTime2() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtil.makeDateTime(""));
  }

  @Test
  public void testString() {
    // Arrange
    String actualStringResult = DateTimeUtil.string("+");
    String actualStringResult1 = DateTimeUtil.string(null);

    // Act and Assert
    assertEquals("+", actualStringResult);
    assertEquals("null", actualStringResult1);
    assertEquals("10", DateTimeUtil.string(10.0));
  }

  @Test
  public void testString2() {
    // Arrange, Act and Assert
    assertEquals("1", DateTimeUtil.string(BigDecimal.valueOf(1L)));
  }

  @Test
  public void testInvalidYear() {
    // Arrange
    boolean actualInvalidYearResult = DateTimeUtil.invalidYear("+");
    boolean actualInvalidYearResult1 = DateTimeUtil.invalidYear("0.######");

    // Act and Assert
    assertFalse(actualInvalidYearResult);
    assertFalse(actualInvalidYearResult1);
    assertTrue(DateTimeUtil.invalidYear(""));
  }

  @Test
  public void testInvalidYear2() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.invalidYear("--"));
  }

  @Test
  public void testInvalidYear3() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.invalidYear(""));
  }

  @Test
  public void testIsValidDate() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(new SaxonXMLGregorianCalendar(new GYearMonthValue(0, (byte) 16, 0, true))));
  }

  @Test
  public void testIsValidDate10() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(-2147483648L, -2147483648L, -2147483648L));
  }

  @Test
  public void testIsValidDate2() {
    // Arrange, Act and Assert
    assertTrue(DateTimeUtil.isValidDate(new SaxonXMLGregorianCalendar(new DateValue(-720, (byte) 8, (byte) 8))));
  }

  @Test
  public void testIsValidDate3() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(new SaxonXMLGregorianCalendar(new DateValue(-720, (byte) 8, (byte) 0))));
  }

  @Test
  public void testIsValidDate4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(0);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDate(feelxmlGregorianCalendar));
  }

  @Test
  public void testIsValidDate5() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(new SaxonXMLGregorianCalendar(new DateValue(-720, (byte) 8, (byte) 47))));
  }

  @Test
  public void testIsValidDate6() {
    // Arrange
    boolean actualIsValidDateResult = DateTimeUtil.isValidDate(new FEELXMLGregorianCalendar());

    // Act and Assert
    assertFalse(actualIsValidDateResult);
    assertFalse(DateTimeUtil.isValidDate(null));
  }

  @Test
  public void testIsValidDate7() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateValue(-720, (byte) 8, (byte) 8));
    saxonXMLGregorianCalendar.setMinute(1);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDate(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDate8() {
    // Arrange, Act and Assert
    assertFalse(
        DateTimeUtil.isValidDate(new SaxonXMLGregorianCalendar(new DateTimeValue(Calendar.getInstance(), true))));
  }

  @Test
  public void testIsValidDate9() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDate(new SaxonXMLGregorianCalendar(new DateTimeValue(-2147483648, (byte) 9,
        (byte) 9, (byte) 9, (byte) 9, (byte) 9, -2147483648, -2147483648, true))));
  }

  @Test
  public void testIsValidTime() {
    // Arrange
    boolean actualIsValidTimeResult = DateTimeUtil.isValidTime(new FEELXMLGregorianCalendar());

    // Act and Assert
    assertFalse(actualIsValidTimeResult);
    assertFalse(DateTimeUtil.isValidTime(null));
  }

  @Test
  public void testIsValidTime2() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidTime(-64800, 1, -64800, -64800));
  }

  @Test
  public void testIsValidDateTime() {
    // Arrange
    boolean actualIsValidDateTimeResult = DateTimeUtil.isValidDateTime(new FEELXMLGregorianCalendar());

    // Act and Assert
    assertFalse(actualIsValidDateTimeResult);
    assertFalse(DateTimeUtil.isValidDateTime(null));
  }

  @Test
  public void testIsValidDateTime10() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateValue(-720, (byte) 8, (byte) 8));
    saxonXMLGregorianCalendar.setHour(0);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDateTime11() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(-2147483648L, -2147483648L, -2147483648L, -64800, 1, -64800, -64800));
  }

  @Test
  public void testIsValidDateTime2() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateTimeValue(Calendar.getInstance(), true));
    saxonXMLGregorianCalendar.setTimezone(999999999);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDateTime3() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateValue(-720, (byte) 8, (byte) 8));
    saxonXMLGregorianCalendar.setHour(999999999);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDateTime4() {
    // Arrange, Act and Assert
    assertTrue(
        DateTimeUtil.isValidDateTime(new SaxonXMLGregorianCalendar(new DateTimeValue(Calendar.getInstance(), true))));
  }

  @Test
  public void testIsValidDateTime5() {
    // Arrange, Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(new SaxonXMLGregorianCalendar(new DateValue(-720, (byte) 8, (byte) 8))));
  }

  @Test
  public void testIsValidDateTime6() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateValue(-720, (byte) 8, (byte) 8));
    saxonXMLGregorianCalendar.setMinute(999999999);
    saxonXMLGregorianCalendar.setHour(0);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDateTime7() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateTimeValue(Calendar.getInstance(), true));
    saxonXMLGregorianCalendar.setTimezone(-999999999);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDateTime8() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateTimeValue(Calendar.getInstance(), true));
    saxonXMLGregorianCalendar.setTimezone(2);

    // Act and Assert
    assertTrue(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }

  @Test
  public void testIsValidDateTime9() {
    // Arrange
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new DateValue(-720, (byte) 8, (byte) 8));
    saxonXMLGregorianCalendar.setMinute(1);
    saxonXMLGregorianCalendar.setHour(0);

    // Act and Assert
    assertFalse(DateTimeUtil.isValidDateTime(saxonXMLGregorianCalendar));
  }
}

