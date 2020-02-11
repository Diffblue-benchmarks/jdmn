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
  public void setTimeTest36() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, 1, -1);
  }

  @Test(timeout=10000)
  public void setTimeTest35() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 1, 1, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest34() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, 0);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMonth = feelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = feelxmlGregorianCalendar.getEon();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    BigDecimal actualFractionalSecond = feelxmlGregorianCalendar.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(0, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertEquals(0, actualSecond);
    assertEquals(0, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest33() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 0, 1, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest32() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(0, 1, 60, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest31() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, 60, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest30() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(0, 0, 60, 1);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertEquals(1, feelxmlGregorianCalendar.getMillisecond());
    assertEquals(0, actualMinute);
    assertEquals(60, actualSecond);
    assertEquals(0, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest29() {
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
  public void setTimeTest28() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(1, 1, -2147483648, 1);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertEquals(1, feelxmlGregorianCalendar.getMillisecond());
    assertEquals(1, actualMinute);
    assertEquals(-2147483648, actualSecond);
    assertEquals(1, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest27() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 60, 1, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest26() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, -2147483648);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMonth = feelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = feelxmlGregorianCalendar.getEon();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    BigDecimal actualFractionalSecond = feelxmlGregorianCalendar.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(0, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertEquals(0, actualSecond);
    assertEquals(0, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest25() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(59, 1, 1, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest24() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(23, 1, 60, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest23() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, 1);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMonth = feelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = feelxmlGregorianCalendar.getEon();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    int actualMillisecond = feelxmlGregorianCalendar.getMillisecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertEquals(1, actualMillisecond);
    assertEquals(0, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertEquals(0, actualSecond);
    assertEquals(0, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest22() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, 999, 1);
  }

  @Test(timeout=10000)
  public void setMillisecondTest4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMillisecond());
  }

  @Test(timeout=10000)
  public void setMillisecondTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setMillisecond(2147483647);
  }

  @Test(timeout=10000)
  public void setMillisecondTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMillisecond(-2147483648);

    // Assert
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
  }

  @Test(timeout=10000)
  public void setMillisecondTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setMillisecond(-1);
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new FEELXMLGregorianCalendar()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setHourTest7() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setHour(-1, true);
  }

  @Test(timeout=10000)
  public void setHourTest6() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setHour(24, true);
  }

  @Test(timeout=10000)
  public void setHourTest5() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(1, true);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getHour());
  }

  @Test(timeout=10000)
  public void setHourTest4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(1, false);

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
  public void setHourTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setHour(24);
  }

  @Test(timeout=10000)
  public void setHourTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setHour(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getHour());
  }

  @Test(timeout=10000)
  public void setHourTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setHour(-1);
  }

  @Test(timeout=10000)
  public void setYearTest4() {
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
  public void setMonthTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMonth(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getMonth());
  }

  @Test(timeout=10000)
  public void setMonthTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setMonth(-1);
  }

  @Test(timeout=10000)
  public void makeDateTimeTest27() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 24, 0, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest26() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 0, 1, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest25() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, -2147483648, 1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest24() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest23() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 2, 1, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest22() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, -2147483648, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest21() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, -2147483648, 1, 1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest20() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 12, 31, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest19() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 23, 1, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest18() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 6, 31, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest17() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 31, 1, 1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest16() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, -2147483648, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest15() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 60, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest14() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 2, 31, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest13() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 31, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest12() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 0, 1, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest11() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 23, 59, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest10() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 31, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest9() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, -2147483648, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest8() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, -2147483648, 1, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest7() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 1, 2147483647, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest6() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 24, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest5() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 0, 0, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest4() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 1, -1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest2() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 1, -2147483648, null, "foo");
  }

  @Test(timeout=10000)
  public void makeDateTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDateTime(null, 1, 1, 1, 1, 60, null, "foo");
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
  public void setMinuteTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setMinute(-1);
  }

  @Test(timeout=10000)
  public void setMinuteTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setMinute(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getMinute());
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
    // Arrange
    BigInteger sanitizeResult = FEELXMLGregorianCalendar.sanitize((Number) null, 10);

    // Act
    BigInteger actualSanitizeResult = FEELXMLGregorianCalendar.sanitize((Number) null, 0);

    // Assert
    assertSame(sanitizeResult.ZERO, sanitizeResult);
    assertSame(actualSanitizeResult.ZERO, actualSanitizeResult);
  }

  @Test(timeout=10000)
  public void getEonAndYearTest() {
    // Arrange, Act and Assert
    assertNull((new FEELXMLGregorianCalendar()).getEonAndYear());
  }

  @Test(timeout=10000)
  public void setTimeTest21() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 0, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest20() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(59, 1, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest19() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 60, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest18() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, 60);
  }

  @Test(timeout=10000)
  public void setTimeTest17() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(0, 0, 60);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(0, actualMinute);
    assertEquals(60, actualSecond);
    assertEquals(0, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest16() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, 2147483647);
  }

  @Test(timeout=10000)
  public void setTimeTest15() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMonth = feelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = feelxmlGregorianCalendar.getEon();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    BigDecimal actualFractionalSecond = feelxmlGregorianCalendar.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(0, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertEquals(0, actualSecond);
    assertEquals(0, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest14() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(0, 1, 60);
  }

  @Test(timeout=10000)
  public void setTimeTest13() {
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
  public void setTimeTest12() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 1, 1);
  }

  @Test(timeout=10000)
  public void setTimeTest11() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, -1);
  }

  @Test(timeout=10000)
  public void makeTimeTest10() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeTime(59, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest9() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeTime(1, -2147483648, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest8() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeTime(1, 1, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest7() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeTime(24, 0, 0, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest6() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeTime(24, 1, 1, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest5() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeTime(23, 1, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest4() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeTime(1, 1, -2147483648, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest3() {
    // Arrange, Act and Assert
    thrown.expect(ZoneRulesException.class);
    FEELXMLGregorianCalendar.makeTime(23, 59, 60, null, "foo");
  }

  @Test(timeout=10000)
  public void makeTimeTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeTime(24, 0, 1, null, "foo");
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
  public void setTimeTest10() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(23, 59, 60, (BigDecimal) null);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(59, actualMinute);
    assertEquals(60, actualSecond);
    assertEquals(23, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest9() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, -1, (BigDecimal) null);
  }

  @Test(timeout=10000)
  public void setTimeTest8() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 0, 1, (BigDecimal) null);
  }

  @Test(timeout=10000)
  public void setTimeTest7() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 60, 1, (BigDecimal) null);
  }

  @Test(timeout=10000)
  public void setTimeTest6() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(24, 1, 1, (BigDecimal) null);
  }

  @Test(timeout=10000)
  public void setTimeTest5() {
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
  public void setTimeTest4() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(1, 1, -2147483648, (BigDecimal) null);

    // Assert
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    assertNull(feelxmlGregorianCalendar.getFractionalSecond());
    assertEquals(1, actualMinute);
    assertEquals(-2147483648, actualSecond);
    assertEquals(1, actualHour);
  }

  @Test(timeout=10000)
  public void setTimeTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(23, 1, 60, (BigDecimal) null);
  }

  @Test(timeout=10000)
  public void setTimeTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setTime(1, 1, 60, (BigDecimal) null);
  }

  @Test(timeout=10000)
  public void setTimeTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setTime(24, 0, 0, (BigDecimal) null);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    int actualHour = feelxmlGregorianCalendar.getHour();
    int actualSecond = feelxmlGregorianCalendar.getSecond();
    int actualMonth = feelxmlGregorianCalendar.getMonth();
    BigInteger actualEon = feelxmlGregorianCalendar.getEon();
    int actualMinute = feelxmlGregorianCalendar.getMinute();
    BigDecimal actualFractionalSecond = feelxmlGregorianCalendar.getFractionalSecond();
    assertEquals(-2147483648, actualYear);
    assertEquals(-2147483648, feelxmlGregorianCalendar.getDay());
    assertNull(actualFractionalSecond);
    assertEquals(0, actualMinute);
    assertNull(actualEon);
    assertEquals(-2147483648, actualMonth);
    assertEquals(0, actualSecond);
    assertEquals(0, actualHour);
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
  public void setDayTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setDay(2147483647);
  }

  @Test(timeout=10000)
  public void setDayTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setDay(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getDay());
  }

  @Test(timeout=10000)
  public void setDayTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setDay(-1);
  }

  @Test(timeout=10000)
  public void getTimeZoneTest3() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(-2147483648) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test(timeout=10000)
  public void getTimeZoneTest2() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(2) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test(timeout=10000)
  public void getTimeZoneTest() {
    // Arrange, Act and Assert
    assertTrue((new FEELXMLGregorianCalendar()).getTimeZone(-1) instanceof sun.util.calendar.ZoneInfo);
  }

  @Test(timeout=10000)
  public void setYearTest3() {
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
  public void setYearTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(1000000000);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    BigInteger actualEonAndYear = feelxmlGregorianCalendar.getEonAndYear();
    assertEquals(0, actualYear);
    assertSame(feelxmlGregorianCalendar.getEon(), actualEonAndYear);
  }

  @Test(timeout=10000)
  public void setYearTest() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setYear(-2147483648);

    // Assert
    int actualYear = feelxmlGregorianCalendar.getYear();
    assertEquals(-2147483648, actualYear);
    assertNull(feelxmlGregorianCalendar.getEon());
  }

  @Test(timeout=10000)
  public void makeDateTest7() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(null, 2, 1);

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
    assertEquals(2, actualMonth);
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualTimezone);
    assertEquals(-2147483648, actualSecond);
    assertEquals(-2147483648, actualHour);
  }

  @Test(timeout=10000)
  public void makeDateTest6() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    FEELXMLGregorianCalendar.makeDate(null, 2, 31);
  }

  @Test(timeout=10000)
  public void makeDateTest5() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDate(null, 31, 1);
  }

  @Test(timeout=10000)
  public void makeDateTest4() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FEELXMLGregorianCalendar.makeDate(null, 1, 0);
  }

  @Test(timeout=10000)
  public void makeDateTest3() {
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
  public void makeDateTest2() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(null, -2147483648, 1);

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
    assertEquals(-2147483648, actualMonth);
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualTimezone);
    assertEquals(-2147483648, actualSecond);
    assertEquals(-2147483648, actualHour);
  }

  @Test(timeout=10000)
  public void makeDateTest() {
    // Arrange and Act
    XMLGregorianCalendar actualMakeDateResult = FEELXMLGregorianCalendar.makeDate(null, 1, -2147483648);

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
    assertEquals(-2147483648, actualMakeDateResult.getDay());
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
  public void setSecondTest3() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setSecond(-2147483648);

    // Assert
    assertEquals(-2147483648, feelxmlGregorianCalendar.getSecond());
  }

  @Test(timeout=10000)
  public void setSecondTest2() {
    // Arrange
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act
    feelxmlGregorianCalendar.setSecond(1);

    // Assert
    assertEquals(1, feelxmlGregorianCalendar.getSecond());
  }

  @Test(timeout=10000)
  public void setSecondTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new FEELXMLGregorianCalendar()).setSecond(-1);
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

