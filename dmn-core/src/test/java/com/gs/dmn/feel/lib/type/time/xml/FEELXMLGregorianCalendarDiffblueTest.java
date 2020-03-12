package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.DMNRuntimeException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DateTimeException;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FEELXMLGregorianCalendarDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void clearTest() {
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
  public void cloneTest() {
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
  public void compareTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act and Assert
    assertEquals(0, feelxmlGregorianCalendar.compare(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void constructorTest() {
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
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).equals("%Y-%M-%D%z"));
  }

  @Test
  public void getEonAndYearTest() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getEonAndYear());
  }

  @Test
  public void getMillisecondTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getMillisecond());
  }

  @Test
  public void getTimeZoneTest() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(235) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void getTimeZoneTest2() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(-64800) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void getTimeZoneTest3() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(-2147483648) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void getTimeZoneTest4() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(2) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test
  public void getXMLSchemaTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new FEELXMLGregorianCalendar()).getXMLSchemaType();
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELXMLGregorianCalendar()).hashCode());
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).isValid());
  }

  @Test
  public void makeDateTest() {
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
  public void makeDateTest2() {
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
  public void makeDateTest3() {
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
  public void makeDateTest4() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(1L), 235, -2147483648);
  }

  @Test
  public void makeDateTest5() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(0L), -2147483648, -2147483648);
  }

  @Test
  public void makeDateTest6() {
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
  public void makeDateTest7() {
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
  public void makeDateTest8() {
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
  public void makeDateTest9() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDate(BigInteger.valueOf(1L), -2147483648, 235);
  }

  @Test
  public void makeDateTimeTest() {
    // Arrange
    BigInteger year = BigInteger.valueOf(1L);

    // Act and Assert
    thrown.expect(DateTimeException.class);
    FEELXMLGregorianCalendar.makeDateTime(year, -2147483648, -2147483648, -2147483648, 1, -2147483648,
        BigDecimal.valueOf(1L), "%Y-%M-%D%z");
  }

  @Test
  public void makeTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeException.class);
    FEELXMLGregorianCalendar.makeTime(-2147483648, 1, -2147483648, BigDecimal.valueOf(1L), "%Y-%M-%D%z");
  }

  @Test
  public void normalizeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new FEELXMLGregorianCalendar()).normalize();
  }

  @Test
  public void normalizeToTimezoneTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeException.class);
    (new FEELXMLGregorianCalendar()).normalizeToTimezone("%Y-%M-%D%z");
  }

  @Test
  public void normalizeToTimezoneTest2() {
    // Arrange and Act
    XMLGregorianCalendar actualNormalizeToTimezoneResult = (new FEELXMLGregorianCalendar()).normalizeToTimezone("Z");

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualNormalizeToTimezoneResult).getZoneID();
    assertEquals(-2147483648, actualNormalizeToTimezoneResult.getYear());
    assertEquals(-2147483648, actualNormalizeToTimezoneResult.getDay());
    assertNull(actualNormalizeToTimezoneResult.getFractionalSecond());
    assertEquals(-2147483648, actualNormalizeToTimezoneResult.getMinute());
    assertNull(actualNormalizeToTimezoneResult.getEon());
    assertEquals(-2147483648, actualNormalizeToTimezoneResult.getMonth());
    assertEquals("Z", actualZoneID);
    assertEquals(0, actualNormalizeToTimezoneResult.getTimezone());
    assertEquals(-2147483648, actualNormalizeToTimezoneResult.getSecond());
    assertEquals(-2147483648, actualNormalizeToTimezoneResult.getHour());
  }

  @Test
  public void sameTest() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).same("%Y-%M-%D%z"));
  }

  @Test
  public void sanitizeTest() {
    // Arrange, Act and Assert
    assertEquals("-1", FEELXMLGregorianCalendar.sanitize(BigDecimal.valueOf(1L), -2147483648).toString());
  }

  @Test
  public void sanitizeTest2() {
    // Arrange and Act
    BigDecimal actualSanitizeResult = FEELXMLGregorianCalendar.sanitize(BigDecimal.valueOf(1L), 10);

    // Assert
    assertSame(actualSanitizeResult.ONE, actualSanitizeResult);
    assertEquals("1", actualSanitizeResult.toString());
  }

  @Test
  public void sanitizeTest3() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    FEELXMLGregorianCalendar.sanitize(new Integer(1), 10);
  }

  @Test
  public void sanitizeTest4() {
    // Arrange and Act
    BigInteger actualSanitizeResult = FEELXMLGregorianCalendar.sanitize((Number) null, 10);

    // Assert
    assertSame(actualSanitizeResult.ZERO, actualSanitizeResult);
    assertEquals("0", actualSanitizeResult.toString());
  }

  @Test
  public void sanitizeTest5() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    FEELXMLGregorianCalendar.sanitize(new Integer(1), -2147483648);
  }

  @Test
  public void setDayTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setDay(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
  }

  @Test
  public void setEonTest() {
    // Arrange
    BigInteger valueOfResult = BigInteger.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setEon(valueOfResult);

    // Assert
    assertSame(valueOfResult, feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void setFractionalSecondTest() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setFractionalSecond(fractional);

    // Assert
    assertEquals(1000, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test
  public void setHourTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void setHourTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(-2147483648, true);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getHour());
  }

  @Test
  public void setMillisecondTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setMillisecond(14081);
  }

  @Test
  public void setMillisecondTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(-2147483648);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
  }

  @Test
  public void setMillisecondTest3() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(235);

    // Assert
    assertEquals(235, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test
  public void setMinuteTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMinute(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
  }

  @Test
  public void setMonthTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMonth(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMonth());
  }

  @Test
  public void setSecondTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setSecond(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
  }

  @Test
  public void setSecondTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setSecond(235);
  }

  @Test
  public void setTimeTest() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(-2147483648, 1, 60, fractional);
  }

  @Test
  public void setTimeTest10() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 0, -2147483648, fractional);
  }

  @Test
  public void setTimeTest11() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(0, 1, 60, fractional);
  }

  @Test
  public void setTimeTest12() {
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
  public void setTimeTest13() {
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
  public void setTimeTest14() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(-2147483648, 1, 60, -2147483648);
  }

  @Test
  public void setTimeTest2() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(235L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(-2147483648, 1, -2147483648, fractional);
  }

  @Test
  public void setTimeTest3() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(235, 1, -2147483648, fractional);
  }

  @Test
  public void setTimeTest4() {
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
  public void setTimeTest5() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(-2147483648L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(-2147483648, 1, -2147483648, fractional);
  }

  @Test
  public void setTimeTest6() {
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
  public void setTimeTest7() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(-2147483648, 235, -2147483648, fractional);
  }

  @Test
  public void setTimeTest8() {
    // Arrange
    BigDecimal fractional = BigDecimal.valueOf(1L);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 1, -2147483648, fractional);
  }

  @Test
  public void setTimeTest9() {
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
  public void setTimezoneTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new FEELXMLGregorianCalendar()).setTimezone(2);
  }

  @Test
  public void setYearTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(235);

    // Assert
    assertEquals(235, feelxmlGregorianCalendar.getYear());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void setYearTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getYear());
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test
  public void setYearTest3() {
    // Arrange
    BigInteger year = BigInteger.valueOf(9223372036854775807L);
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(year);

    // Assert
    assertEquals(854775807, feelxmlGregorianCalendar.getYear());
  }

  @Test
  public void setYearTest4() {
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
  public void setZoneIDTest() {
    // Arrange, Act and Assert
    thrown.expect(DateTimeException.class);
    (new FEELXMLGregorianCalendar()).setZoneID("%Y-%M-%D%z");
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new FEELXMLGregorianCalendar()).toString();
  }

  @Test
  public void toXMLFormatTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new FEELXMLGregorianCalendar()).toXMLFormat();
  }
}

