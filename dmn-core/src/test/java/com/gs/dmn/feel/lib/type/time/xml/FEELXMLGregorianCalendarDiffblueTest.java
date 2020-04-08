package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Test;

public class FEELXMLGregorianCalendarDiffblueTest {
  @Test
  public void testMakeDate() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(1L), -2147483648,
        1);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(1, actualMakeDateResult.getYear());
    assertEquals(1, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    assertNull(actualMakeDateResult.getEon());
    assertEquals(-2147483648, actualMakeDateResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    String actualToStringResult = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    assertEquals("1", actualToStringResult);
  }

  @Test
  public void testMakeDate2() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(1L), -2147483648,
        -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(1, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    assertNull(actualMakeDateResult.getEon());
    assertEquals(-2147483648, actualMakeDateResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    String actualToStringResult = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    assertEquals("1", actualToStringResult);
  }

  @Test
  public void testMakeDate3() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar
        .makeDate(BigInteger.valueOf(9223372036854775807L), 2, -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(854775807, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    String actualToStringResult = actualMakeDateResult.getEon().toString();
    assertEquals(2, actualMakeDateResult.getMonth());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    String actualToStringResult1 = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertNull(actualZoneID);
    assertEquals("9223372036854775807", actualToStringResult1);
    assertEquals("9223372036000000000", actualToStringResult);
  }

  @Test
  public void testMakeDate4() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(-2147483648L), 2,
        -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(-147483648, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    String actualToStringResult = actualMakeDateResult.getEon().toString();
    assertEquals(2, actualMakeDateResult.getMonth());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    String actualToStringResult1 = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertNull(actualZoneID);
    assertEquals("-2147483648", actualToStringResult1);
    assertEquals("-2000000000", actualToStringResult);
  }

  @Test
  public void testMakeDate5() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(-2147483648L),
        -2147483648, -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(-147483648, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    String actualToStringResult = actualMakeDateResult.getEon().toString();
    assertEquals(-2147483648, actualMakeDateResult.getMonth());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    String actualToStringResult1 = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertNull(actualZoneID);
    assertEquals("-2147483648", actualToStringResult1);
    assertEquals("-2000000000", actualToStringResult);
  }

  @Test
  public void testMakeDate6() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(100L), 2,
        -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(100, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    assertNull(actualMakeDateResult.getEon());
    assertEquals(2, actualMakeDateResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    String actualToStringResult = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    assertEquals("100", actualToStringResult);
  }

  @Test
  public void testMakeDate7() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(1L), 2,
        -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(1, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    assertNull(actualMakeDateResult.getEon());
    assertEquals(2, actualMakeDateResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    String actualToStringResult = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    assertEquals("1", actualToStringResult);
  }

  @Test
  public void testMakeDate8() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(1L), 1,
        -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(1, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    assertNull(actualMakeDateResult.getEon());
    assertEquals(1, actualMakeDateResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    String actualToStringResult = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    assertEquals("1", actualToStringResult);
  }

  @Test
  public void testMakeDate9() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(12L), 2,
        -2147483648);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    assertEquals(12, actualMakeDateResult.getYear());
    assertEquals(-2147483648, actualMakeDateResult.getDay());
    assertNull(actualMakeDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualMakeDateResult.getMinute());
    assertNull(actualMakeDateResult.getEon());
    assertEquals(2, actualMakeDateResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateResult.getTimezone());
    String actualToStringResult = actualMakeDateResult.getEonAndYear().toString();
    assertEquals(-2147483648, actualMakeDateResult.getSecond());
    assertEquals(-2147483648, actualMakeDateResult.getHour());
    assertEquals("12", actualToStringResult);
  }

  @Test
  public void testMakeTime() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeTimeResult = FEELXMLGregorianCalendar.makeTime(-2147483648, 1, -2147483648,
        BigDecimal.valueOf(1L), null);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeTimeResult).getZoneID();
    assertEquals(-2147483648, actualMakeTimeResult.getYear());
    assertEquals(-2147483648, actualMakeTimeResult.getDay());
    String actualToStringResult = actualMakeTimeResult.getFractionalSecond().toString();
    assertEquals(1000, actualMakeTimeResult.getMillisecond());
    assertEquals(-2147483648, actualMakeTimeResult.getHour());
    assertNull(actualMakeTimeResult.getEon());
    assertEquals(1, actualMakeTimeResult.getMinute());
    assertEquals(-2147483648, actualMakeTimeResult.getTimezone());
    assertEquals(-2147483648, actualMakeTimeResult.getMonth());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeTimeResult.getSecond());
    assertEquals("1", actualToStringResult);
  }

  @Test
  public void testMakeDateTime() {
    // Arrange
    BigInteger year = BigInteger.valueOf(1L);

    // Act
    XMLGregorianCalendar actualMakeDateTimeResult = FEELXMLGregorianCalendar.makeDateTime(year, -2147483648,
        -2147483648, -2147483648, 1, -2147483648, BigDecimal.valueOf(1L), null);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateTimeResult).getZoneID();
    assertEquals(1, actualMakeDateTimeResult.getYear());
    assertEquals(-2147483648, actualMakeDateTimeResult.getDay());
    String actualToStringResult = actualMakeDateTimeResult.getFractionalSecond().toString();
    assertEquals(1000, actualMakeDateTimeResult.getMillisecond());
    assertEquals(-2147483648, actualMakeDateTimeResult.getHour());
    BigInteger eonAndYear = actualMakeDateTimeResult.getEonAndYear();
    assertNull(actualMakeDateTimeResult.getEon());
    assertEquals(1, actualMakeDateTimeResult.getMinute());
    assertEquals(-2147483648, actualMakeDateTimeResult.getTimezone());
    assertEquals(-2147483648, actualMakeDateTimeResult.getSecond());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualMakeDateTimeResult.getMonth());
    assertEquals("1", actualToStringResult);
    assertEquals("1", eonAndYear.toString());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    FEELXMLGregorianCalendar actualFeelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Assert
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getYear());
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getDay());
    assertNull(actualFeelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getMinute());
    assertNull(actualFeelxmlGregorianCalendar.getEon());
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getMonth());
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getTimezone());
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testGetEonAndYear() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getEonAndYear());
  }

  @Test
  public void testSetYear() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getYear());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void testSetYear2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(0);

    // Assert
    assertEquals(0, feelxmlGregorianCalendar.getYear());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void testSetYear3() {
    // Arrange
    BigInteger year = BigInteger.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(year);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getYear());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void testSetEon() {
    // Arrange
    BigInteger valueOfResult = BigInteger.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setEon(valueOfResult);

    // Assert
    assertSame(valueOfResult, feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void testSetMonth() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMonth(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMonth());
  }

  @Test
  public void testSetDay() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setDay(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
  }

  @Test
  public void testSetHour() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetHour2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(-2147483648, true);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetMinute() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMinute(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
  }

  @Test
  public void testGetMillisecond() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setMillisecond(0);

    // Act and Assert
    assertEquals(0, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test
  public void testGetMillisecond2() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getMillisecond());
  }

  @Test
  public void testSetSecond() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setSecond(0);

    // Assert
    assertEquals(0, feelxmlGregorianCalendar.getSecond());
  }

  @Test
  public void testSetSecond2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setSecond(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
  }

  @Test
  public void testSetMillisecond() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(-2147483648);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
  }

  @Test
  public void testSetMillisecond2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(0);

    // Assert
    assertEquals(0, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test
  public void testSetFractionalSecond() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setFractionalSecond(fractional);

    // Assert
    assertEquals(1000, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test
  public void testSetTime() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(0);

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, BigDecimal.valueOf(1L));

    // Assert
    assertEquals(0, feelxmlGregorianCalendar.getYear());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(0, feelxmlGregorianCalendar.getMinute());
    assertNull(feelxmlGregorianCalendar.getEon());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMonth());
    assertEquals(1, feelxmlGregorianCalendar.getSecond());
    assertEquals(0, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetTime10() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(-2147483648, 1, -2147483648, -2147483648);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetTime2() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(-2147483648, 1, -2147483648, fractional);

    // Assert
    assertEquals(1000, feelxmlGregorianCalendar.getMillisecond());
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetTime3() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, fractional);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getYear());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertEquals(0, feelxmlGregorianCalendar.getHour());
    assertEquals(1, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMonth());
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(0, feelxmlGregorianCalendar.getMinute());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void testSetTime4() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(0, 1, -2147483648, fractional);

    // Assert
    assertEquals(1000, feelxmlGregorianCalendar.getMillisecond());
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
    assertEquals(0, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetTime5() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(23, 59, 60, fractional);

    // Assert
    assertEquals(23, feelxmlGregorianCalendar.getHour());
    assertEquals(60, feelxmlGregorianCalendar.getSecond());
    assertEquals(1000, feelxmlGregorianCalendar.getMillisecond());
    assertEquals(59, feelxmlGregorianCalendar.getMinute());
  }

  @Test
  public void testSetTime6() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(0L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(-2147483648, 1, -2147483648, fractional);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetTime7() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(0L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, fractional);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getYear());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertEquals(0, feelxmlGregorianCalendar.getHour());
    assertEquals(0, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMonth());
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(0, feelxmlGregorianCalendar.getMinute());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void testSetTime8() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(-2147483648, 1, -2147483648);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSetTime9() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(0, 0, 60, -2147483648);

    // Assert
    assertEquals(0, feelxmlGregorianCalendar.getHour());
    assertEquals(60, feelxmlGregorianCalendar.getSecond());
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(0, feelxmlGregorianCalendar.getMinute());
  }

  @Test
  public void testCompare() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act and Assert
    assertEquals(0, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testCompare10() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    FEELXMLGregorianCalendar feelxmlGregorianCalendar1 = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar1.setMillisecond(0);

    // Act and Assert
    assertEquals(0, feelxmlGregorianCalendar.compare(feelxmlGregorianCalendar1));
  }

  @Test
  public void testCompare2() {
    // Arrange
    BigInteger year = BigInteger.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(year);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar1 = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar1.setYear(0);

    // Act and Assert
    assertEquals(1, feelxmlGregorianCalendar.compare(feelxmlGregorianCalendar1));
  }

  @Test
  public void testCompare3() {
    // Arrange
    BigInteger year = BigInteger.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(year);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar1 = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar1.setYear(2);

    // Act and Assert
    assertEquals(-1, feelxmlGregorianCalendar.compare(feelxmlGregorianCalendar1));
  }

  @Test
  public void testCompare4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setMillisecond(0);

    // Act and Assert
    assertEquals(0, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testCompare5() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setSecond(0);

    // Act and Assert
    assertEquals(2, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testCompare6() {
    // Arrange
    BigInteger year = BigInteger.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(year);

    // Act and Assert
    assertEquals(2, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testCompare7() {
    // Arrange
    BigInteger year = BigInteger.valueOf(-2147483648L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(year);

    // Act and Assert
    assertEquals(2, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testCompare8() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    FEELXMLGregorianCalendar feelxmlGregorianCalendar1 = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar1.setMinute(1);

    // Act and Assert
    assertEquals(2, feelxmlGregorianCalendar.compare(feelxmlGregorianCalendar1));
  }

  @Test
  public void testCompare9() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setMinute(1);

    // Act and Assert
    assertEquals(2, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testNormalize() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setMillisecond(0);
    feelxmlGregorianCalendar.setZoneID("Z");

    // Act
    XMLGregorianCalendar actualNormalizeResult = feelxmlGregorianCalendar.normalize();

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualNormalizeResult).getZoneID();
    assertEquals(-2147483648, actualNormalizeResult.getYear());
    assertEquals(-2147483648, actualNormalizeResult.getDay());
    assertNull(actualNormalizeResult.getFractionalSecond());
    assertEquals(-2147483648, actualNormalizeResult.getMinute());
    assertNull(actualNormalizeResult.getEon());
    assertEquals(-2147483648, actualNormalizeResult.getMonth());
    assertEquals("Z", actualZoneID);
    assertEquals(0, actualNormalizeResult.getTimezone());
    assertEquals(-2147483648, actualNormalizeResult.getSecond());
    assertEquals(-2147483648, actualNormalizeResult.getHour());
  }

  @Test
  public void testNormalize2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setZoneID("Z");

    // Act
    XMLGregorianCalendar actualNormalizeResult = feelxmlGregorianCalendar.normalize();

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualNormalizeResult).getZoneID();
    assertEquals(-2147483648, actualNormalizeResult.getYear());
    assertEquals(-2147483648, actualNormalizeResult.getDay());
    assertNull(actualNormalizeResult.getFractionalSecond());
    assertEquals(-2147483648, actualNormalizeResult.getMinute());
    assertNull(actualNormalizeResult.getEon());
    assertEquals(-2147483648, actualNormalizeResult.getMonth());
    assertEquals("Z", actualZoneID);
    assertEquals(0, actualNormalizeResult.getTimezone());
    assertEquals(-2147483648, actualNormalizeResult.getSecond());
    assertEquals(-2147483648, actualNormalizeResult.getHour());
  }

  @Test
  public void testSame() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).same(null));
  }

  @Test
  public void testSame2() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).same("%Y-%M-%D%z"));
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).equals("%Y-%M-%D%z"));
  }

  @Test
  public void testEquals2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act and Assert
    assertTrue(feelxmlGregorianCalendar.equals(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testEquals3() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).equals(null));
  }

  @Test
  public void testEquals4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setMinute(1);

    // Act and Assert
    assertFalse(feelxmlGregorianCalendar.equals(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELXMLGregorianCalendar()).hashCode());
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).isValid());
  }

  @Test
  public void testGetTimeZone() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(2) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void testGetTimeZone2() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(-64800) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void testGetTimeZone3() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(-2147483648) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void testGetTimeZone4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setZoneID("GMT");

    // Act and Assert
    assertTrue(feelxmlGregorianCalendar.getTimeZone(2) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void testGetTimeZone5() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(60) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void testClone() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getYear());
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getDay());
    assertNull(((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getFractionalSecond());
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getMinute());
    assertNull(((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getEon());
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getMonth());
    assertNull(((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getZoneID());
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getTimezone());
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getSecond());
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getHour());
  }

  @Test
  public void testClear() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.clear();

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getYear());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMinute());
    assertNull(feelxmlGregorianCalendar.getEon());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMonth());
    assertNull(feelxmlGregorianCalendar.getZoneID());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getTimezone());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void testSanitize() {
    // Arrange and Act
    BigDecimal actualSanitizeResult = FEELXMLGregorianCalendar.sanitize(BigDecimal.valueOf(1L), 10);

    // Assert
    assertSame(actualSanitizeResult.ONE, actualSanitizeResult);
    assertEquals("1", actualSanitizeResult.toString());
  }

  @Test
  public void testSanitize2() {
    // Arrange, Act and Assert
    assertEquals("-1", FEELXMLGregorianCalendar.sanitize(BigDecimal.valueOf(1L), -2147483648).toString());
  }

  @Test
  public void testSanitize3() {
    // Arrange and Act
    BigDecimal actualSanitizeResult = FEELXMLGregorianCalendar.sanitize(BigDecimal.valueOf(1L), 0);

    // Assert
    assertSame(actualSanitizeResult.ZERO, actualSanitizeResult);
    assertEquals("0", actualSanitizeResult.toString());
  }
}

