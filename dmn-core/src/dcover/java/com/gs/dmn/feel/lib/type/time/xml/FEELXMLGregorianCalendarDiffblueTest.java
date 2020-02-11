package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.DMNRuntimeException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.zone.ZoneRulesException;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FEELXMLGregorianCalendarDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getDayTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getDay());
  }

  @Test(timeout=10000)
  public void getFractionalSecondTest() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getFractionalSecond());
  }

  @Test(timeout=10000)
  public void getMonthTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getMonth());
  }

  @Test(timeout=10000)
  public void setTimeTest3() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(1, 1, 1, 1);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertEquals(1, feelxmlGregorianCalendar.getMillisecond());
    assertEquals(1, actualMinute);
    assertEquals(1, actualSecond);
    assertEquals(1, actualHour);
  }

  @Test(timeout=10000)
  public void setMillisecondTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setHourTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(1, true);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getHour());
  }

  @Test(timeout=10000)
  public void normalizeToTimezoneTest() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    (new FEELXMLGregorianCalendar()).normalizeToTimezone("foo");
  }

  @Test(timeout=10000)
  public void setZoneIDTest() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    (new FEELXMLGregorianCalendar()).setZoneID("foo");
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    FEELXMLGregorianCalendar actualFeelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Assert
    int actualYear = actualFeelxmlGregorianCalendar.getYear();
    int actualHour = actualFeelxmlGregorianCalendar.getHour();
    int actualSecond = actualFeelxmlGregorianCalendar.getSecond();
    int actualTimezone = actualFeelxmlGregorianCalendar.getTimezone();
    int actualMonth = actualFeelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = actualFeelxmlGregorianCalendar.getEon();
    int actualMinute = actualFeelxmlGregorianCalendar.getMinute();
    BigDecimal actualFractionalSecond = actualFeelxmlGregorianCalendar.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, actualFeelxmlGregorianCalendar.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(-2147483648, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertEquals(-2147483648, actualTimezone);
    assertEquals(-2147483648, actualSecond);
    assertEquals(-2147483648, actualHour);
  }

  @Test(timeout=10000)
  public void setHourTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getHour());
  }

  @Test(timeout=10000)
  public void setYearTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear((BigInteger) null);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    assertEquals(-2147483648, actualYear);
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test(timeout=10000)
  public void sameTest() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).same("foo"));
  }

  @Test(timeout=10000)
  public void setMonthTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMonth(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMonth());
  }

  @Test(timeout=10000)
  public void makeDateTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void setEonTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setEon(null);

    // Assert
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test(timeout=10000)
  public void setMinuteTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMinute(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMinute());
  }

  @Test(timeout=10000)
  public void sanitizeTest2() {
    // Arrange and Act
    BigInteger actualSanitizeResult = FEELXMLGregorianCalendar.sanitize((Number) null, 10);

    // Assert
    assertSame(actualSanitizeResult.ZERO, actualSanitizeResult);
  }

  @Test(timeout=10000)
  public void getEonAndYearTest() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getEonAndYear());
  }

  @Test(timeout=10000)
  public void setTimeTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(1, 1, 1);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(1, actualMinute);
    assertEquals(1, actualSecond);
    assertEquals(1, actualHour);
  }

  @Test(timeout=10000)
  public void makeTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeTime(1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void toXMLFormatTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new FEELXMLGregorianCalendar()).toXMLFormat();
  }

  @Test(timeout=10000)
  public void setFractionalSecondTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setFractionalSecond(null);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
  }

  @Test(timeout=10000)
  public void getSecondTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getSecond());
  }

  @Test(timeout=10000)
  public void cloneTest() {
    // Arrange, Act and Assert
    int actualYear = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getYear();
    int actualHour = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getHour();
    int actualSecond = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getSecond();
    int actualTimezone = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getTimezone();
    String actualZoneID = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getZoneID();
    int actualMonth = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getMonth();
    BigInteger actualEon = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getEon();
    int actualMinute = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getMinute();
    BigDecimal actualFractionalSecond = ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone())
        .getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, ((FEELXMLGregorianCalendar) (new FEELXMLGregorianCalendar()).clone()).getDay());
    assertNull(actualFractionalSecond);
    assertEquals(-2147483648, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualTimezone);
    assertEquals(-2147483648, actualSecond);
    assertEquals(-2147483648, actualHour);
  }

  @Test(timeout=10000)
  public void normalizeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new FEELXMLGregorianCalendar()).normalize();
  }

  @Test(timeout=10000)
  public void getMillisecondTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getMillisecond());
  }

  @Test(timeout=10000)
  public void getEonTest() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getEon());
  }

  @Test(timeout=10000)
  public void setTimezoneTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new FEELXMLGregorianCalendar()).setTimezone(2);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new FEELXMLGregorianCalendar()).toString();
  }

  @Test(timeout=10000)
  public void getYearTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getYear());
  }

  @Test(timeout=10000)
  public void getXMLSchemaTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new FEELXMLGregorianCalendar()).getXMLSchemaType();
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).isValid());
  }

  @Test(timeout=10000)
  public void getMinuteTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getMinute());
  }

  @Test(timeout=10000)
  public void clearTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.clear();

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualTimezone = feelxmlGregorianCalendar.getTimezone();
    String actualZoneID = feelxmlGregorianCalendar.getZoneID();
    int actualMonth = feelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = feelxmlGregorianCalendar.getEon();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    BigDecimal actualFractionalSecond = feelxmlGregorianCalendar.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(-2147483648, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualTimezone);
    assertEquals(-2147483648, actualSecond);
    assertEquals(-2147483648, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(1, 1, 1, (BigDecimal) null);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(1, actualMinute);
    assertEquals(1, actualSecond);
    assertEquals(1, actualHour);
  }

  @Test(timeout=10000)
  public void getZoneIDTest() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getZoneID());
  }

  @Test(timeout=10000)
  public void getTimezoneTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getTimezone());
  }

  @Test(timeout=10000)
  public void setDayTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setDay(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getDay());
  }

  @Test(timeout=10000)
  public void getTimeZoneTest() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(2) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test(timeout=10000)
  public void setYearTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(1);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    assertEquals(1, actualYear);
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test(timeout=10000)
  public void makeDateTest() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(null, 1, 1);

    // Assert
    int actualYear = actualMakeDateResult.getYear();
    int actualHour = actualMakeDateResult.getHour();
    int actualSecond = actualMakeDateResult.getSecond();
    int actualTimezone = actualMakeDateResult.getTimezone();
    String actualZoneID = ((FEELXMLGregorianCalendar) actualMakeDateResult).getZoneID();
    int actualMonth = actualMakeDateResult.getMonth();
    BigInteger actualEon = actualMakeDateResult.getEon();
    int actualMinute = actualMakeDateResult.getMinute();
    BigDecimal actualFractionalSecond = actualMakeDateResult.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(1, actualMakeDateResult.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(-2147483648, actualMinute);
    assertNull(actualEon);
    assertEquals(1, actualMonth);
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualTimezone);
    assertEquals(-2147483648, actualSecond);
    assertEquals(-2147483648, actualHour);
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELXMLGregorianCalendar()).hashCode());
  }

  @Test(timeout=10000)
  public void setSecondTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setSecond(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getSecond());
  }

  @Test(timeout=10000)
  public void getHourTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new FEELXMLGregorianCalendar()).getHour());
  }

  @Test(timeout=10000)
  public void sanitizeTest() {
    // Arrange and Act
    BigDecimal actualSanitizeResult = FEELXMLGregorianCalendar.sanitize((BigDecimal) null, 10);

    // Assert
    assertSame(actualSanitizeResult.ZERO, actualSanitizeResult);
  }
}

