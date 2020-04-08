package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.lib.type.time.xml.FEELXMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import net.sf.saxon.value.DateValue;
import net.sf.saxon.value.GDayValue;
import net.sf.saxon.value.SaxonXMLGregorianCalendar;
import org.junit.Test;

public class DefaultFEELLibDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DefaultFEELLib actualDefaultFEELLib = new DefaultFEELLib();

    // Assert
    assertTrue(actualDefaultFEELLib.stringType instanceof com.gs.dmn.feel.lib.type.string.DefaultStringType);
    assertTrue(actualDefaultFEELLib.numericType instanceof com.gs.dmn.feel.lib.type.numeric.DefaultNumericType);
    assertTrue(actualDefaultFEELLib.timeType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultTimeType);
    assertTrue(actualDefaultFEELLib.dateTimeType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDateTimeType);
    assertTrue(actualDefaultFEELLib.listType instanceof com.gs.dmn.feel.lib.type.list.DefaultListType);
    assertTrue(actualDefaultFEELLib.durationType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDurationType);
    assertTrue(actualDefaultFEELLib.dateType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDateType);
    assertTrue(actualDefaultFEELLib.booleanType instanceof com.gs.dmn.feel.lib.type.logic.DefaultBooleanType);
    assertTrue(actualDefaultFEELLib.contextType instanceof com.gs.dmn.feel.lib.type.context.DefaultContextType);
  }

  @Test
  public void testNumber() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", " "));
  }

  @Test
  public void testNumber10() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(","));
  }

  @Test
  public void testNumber2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", "."));
  }

  @Test
  public void testNumber3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", "Z", ","));
  }

  @Test
  public void testNumber4() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", null, ","));
  }

  @Test
  public void testNumber5() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", ","));
  }

  @Test
  public void testNumber6() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void testNumber7() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ".", ","));
  }

  @Test
  public void testNumber8() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", null));
  }

  @Test
  public void testNumber9() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", " ", ","));
  }

  @Test
  public void testString() {
    // Arrange, Act and Assert
    assertEquals("null", (new DefaultFEELLib()).string(null));
  }

  @Test
  public void testString2() {
    // Arrange
    BigDecimal from = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1", (new DefaultFEELLib()).string(from));
  }

  @Test
  public void testString3() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).string(","));
  }

  @Test
  public void testString4() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("---16+00:01", defaultFEELLib.string(new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1))));
  }

  @Test
  public void testDate() {
    // Arrange
    BigDecimal year = BigDecimal.valueOf(1L);

    // Act
    XMLGregorianCalendar actualDateResult = (new DefaultFEELLib()).date(year, year, year);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualDateResult).getZoneID();
    assertEquals(1, actualDateResult.getYear());
    assertEquals(1, actualDateResult.getDay());
    assertEquals(-2147483648, actualDateResult.getHour());
    assertEquals(-2147483648, actualDateResult.getSecond());
    assertNull(actualZoneID);
    assertEquals(1, actualDateResult.getMonth());
    assertNull(actualDateResult.getFractionalSecond());
    assertEquals(-2147483648, actualDateResult.getMinute());
    assertNull(actualDateResult.getEon());
    assertEquals(-2147483648, actualDateResult.getTimezone());
    assertEquals("1", actualDateResult.getEonAndYear().toString());
  }

  @Test
  public void testDate2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date(""));
  }

  @Test
  public void testDate3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date(","));
  }

  @Test
  public void testDate4() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date((XMLGregorianCalendar) null));
  }

  @Test
  public void testDate5() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.date(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTime() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act
    XMLGregorianCalendar actualTimeResult = defaultFEELLib.time(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L),
        BigDecimal.valueOf(1L), null);

    // Assert
    String actualZoneID = ((FEELXMLGregorianCalendar) actualTimeResult).getZoneID();
    assertEquals(-2147483648, actualTimeResult.getYear());
    assertEquals(-2147483648, actualTimeResult.getDay());
    assertEquals(1, actualTimeResult.getHour());
    assertEquals(1, actualTimeResult.getSecond());
    assertNull(actualZoneID);
    assertEquals(-2147483648, actualTimeResult.getMonth());
    assertNull(actualTimeResult.getFractionalSecond());
    assertEquals(1, actualTimeResult.getMinute());
    assertNull(actualTimeResult.getEon());
    assertEquals(-2147483648, actualTimeResult.getTimezone());
  }

  @Test
  public void testTime2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.time(BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L), null));
  }

  @Test
  public void testTime3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).time((XMLGregorianCalendar) null));
  }

  @Test
  public void testTime4() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).time((String) null));
  }

  @Test
  public void testTime5() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).time(","));
  }

  @Test
  public void testDateAndTime() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    XMLGregorianCalendar actualDateAndTimeResult = defaultFEELLib.dateAndTime(new FEELXMLGregorianCalendar(),
        new FEELXMLGregorianCalendar());

    // Act and Assert
    assertNull(actualDateAndTimeResult);
    assertNull((new DefaultFEELLib()).dateAndTime(null, null));
  }

  @Test
  public void testDateAndTime2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();
    feelxmlGregorianCalendar.setYear(0);

    // Act and Assert
    assertNull(defaultFEELLib.dateAndTime(feelxmlGregorianCalendar, feelxmlGregorianCalendar));
  }

  @Test
  public void testDateAndTime3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.dateAndTime(new SaxonXMLGregorianCalendar(new DateValue(-720, (byte) 8, (byte) 8)),
        new SaxonXMLGregorianCalendar(new DateValue(-720, (byte) 8, (byte) 8))));
  }

  @Test
  public void testDateAndTime4() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.dateAndTime(new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1)),
        new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1))));
  }

  @Test
  public void testDateAndTime5() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).dateAndTime(null));
  }

  @Test
  public void testDateAndTime6() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).dateAndTime(","));
  }

  @Test
  public void testDuration() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).duration(","));
  }

  @Test
  public void testDuration2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).duration(""));
  }

  @Test
  public void testYearsAndMonthsDuration() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.yearsAndMonthsDuration(new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1)),
        new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1))));
  }

  @Test
  public void testYearsAndMonthsDuration2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    SaxonXMLGregorianCalendar saxonXMLGregorianCalendar = new SaxonXMLGregorianCalendar(
        new GDayValue((byte) 16, 1, null));
    saxonXMLGregorianCalendar.setYear(0);

    // Act and Assert
    assertNull(defaultFEELLib.yearsAndMonthsDuration(saxonXMLGregorianCalendar, saxonXMLGregorianCalendar));
  }

  @Test
  public void testYearsAndMonthsDuration3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).yearsAndMonthsDuration(null, null));
  }

  @Test
  public void testToDate() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act and Assert
    assertSame(feelxmlGregorianCalendar, defaultFEELLib.toDate(feelxmlGregorianCalendar));
  }

  @Test
  public void testToTime() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    FEELXMLGregorianCalendar feelxmlGregorianCalendar = new FEELXMLGregorianCalendar();

    // Act and Assert
    assertSame(feelxmlGregorianCalendar, defaultFEELLib.toTime(feelxmlGregorianCalendar));
  }

  @Test
  public void testDecimal() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new DefaultFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void testFloor() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new DefaultFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void testCeiling() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new DefaultFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void testAbs() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new DefaultFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void testIntModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new DefaultFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void testIntModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void testModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new DefaultFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void testModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void testSqrt() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new DefaultFEELLib()).sqrt(number).toString());
  }

  @Test
  public void testSqrt2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).sqrt(number));
  }

  @Test
  public void testLog() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new DefaultFEELLib()).log(number).toString());
  }

  @Test
  public void testLog2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).log(number));
  }

  @Test
  public void testExp() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(9223372036854775807L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).exp(number));
  }

  @Test
  public void testExp2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new DefaultFEELLib()).exp(number).toString());
  }

  @Test
  public void testOdd() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new DefaultFEELLib()).odd(number));
  }

  @Test
  public void testEven() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new DefaultFEELLib()).even(number));
  }

  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void testMin2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.min(objectList));
  }

  @Test
  public void testMin3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).min((List) null));
  }

  @Test
  public void testMax() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).max((List) null));
  }

  @Test
  public void testMax2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.max(objectList));
  }

  @Test
  public void testMax3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void testSum() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.sum(objectList));
  }

  @Test
  public void testSum2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).sum((List) null));
  }

  @Test
  public void testSum3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void testSublist() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testSublist4() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new DefaultFEELLib()).sublist(null, startPosition, startPosition).size());
  }

  @Test
  public void testSublist5() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist6() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new DefaultFEELLib()).sublist(null, startPosition).size());
  }

  @Test
  public void testSublist7() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testSublist8() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testInsertBefore() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals(0, defaultFEELLib.insertBefore(null, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testInsertBefore2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, defaultFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testInsertBefore3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, defaultFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testInsertBefore4() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals(0, defaultFEELLib.insertBefore(null, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testRemove() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    BigDecimal valueOfResult = BigDecimal.valueOf(1L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(valueOfResult);

    // Act and Assert
    assertEquals(0, defaultFEELLib.remove(objectList, valueOfResult).size());
  }

  @Test
  public void testReverse() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.reverse(objectList).size());
  }

  @Test
  public void testReverse2() {
    // Arrange, Act and Assert
    assertEquals(0, (new DefaultFEELLib()).reverse(null).size());
  }

  @Test
  public void testIndexOf() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    List actualIndexOfResult = defaultFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.indexOf(null, "foo").size());
  }

  @Test
  public void testIndexOf3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add(null);

    // Act
    List actualIndexOfResult = defaultFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf4() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);
    objectList.add("foo");

    // Act
    List actualIndexOfResult = defaultFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf5() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act
    List actualIndexOfResult = defaultFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testDistinctValues() {
    // Arrange, Act and Assert
    assertEquals(0, (new DefaultFEELLib()).distinctValues(null).size());
  }

  @Test
  public void testDistinctValues2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testDistinctValues3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testFlatten() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).flatten(null));
  }

  @Test
  public void testFlatten2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.flatten(objectList).size());
  }

  @Test
  public void testProduct() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).product((List) null));
  }

  @Test
  public void testProduct2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.product(objectList));
  }

  @Test
  public void testProduct3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void testMedian() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).median((List) null));
  }

  @Test
  public void testMedian2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.median(objectList));
  }

  @Test
  public void testMedian3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void testStddev() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.stddev(objectList));
  }

  @Test
  public void testStddev2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).stddev((List) null));
  }

  @Test
  public void testStddev3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void testMean2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.mean(objectList));
  }

  @Test
  public void testMean3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mean((List) null));
  }

  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).contains(",", ","));
  }

  @Test
  public void testStartsWith() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).startsWith(",", ","));
  }

  @Test
  public void testEndsWith() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).endsWith(",", ","));
  }

  @Test
  public void testStringLength() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).stringLength(null));
  }

  @Test
  public void testStringLength2() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new DefaultFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void testSubstring() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new DefaultFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void testSubstring2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new DefaultFEELLib()).substring(",", startPosition));
  }

  @Test
  public void testUpperCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).upperCase(","));
  }

  @Test
  public void testLowerCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).lowerCase(","));
  }

  @Test
  public void testSubstringBefore() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void testSubstringAfter() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void testReplace() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void testReplace2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).replace(",", "", ","));
  }

  @Test
  public void testReplace3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void testMatches() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void testMatches2() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void testMatches3() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).matches(",", ","));
  }

  @Test
  public void testSplit() {
    // Arrange, Act and Assert
    assertEquals(2, (new DefaultFEELLib()).split(",", ",").size());
  }

  @Test
  public void testAnd() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.and(objectList));
  }

  @Test
  public void testAnd2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).and((List) null));
  }

  @Test
  public void testAnd3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.and(objectList));
  }

  @Test
  public void testAnd4() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void testAll() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.all(objectList));
  }

  @Test
  public void testAll2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void testOr() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void testOr2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.or(objectList));
  }

  @Test
  public void testAny() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.any(objectList));
  }

  @Test
  public void testAny2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).any((List) null));
  }

  @Test
  public void testAny3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void testNot() {
    // Arrange, Act and Assert
    assertFalse((new DefaultFEELLib()).not(true));
  }

  @Test
  public void testYear() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.year(new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1))));
  }

  @Test
  public void testYear2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.year(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testYear3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).year(null));
  }

  @Test
  public void testMonth() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.month(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testMonth2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).month(null));
  }

  @Test
  public void testDay() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).day(null));
  }

  @Test
  public void testDay2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.day(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testWeekday() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).weekday(null));
  }

  @Test
  public void testWeekday2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("4", defaultFEELLib.weekday(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testHour() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.hour(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testHour2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).hour(null));
  }

  @Test
  public void testMinute() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.minute(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testMinute2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).minute(null));
  }

  @Test
  public void testSecond() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.second(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void testSecond2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).second(null));
  }

  @Test
  public void testTimeOffset() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).timeOffset(null));
  }

  @Test
  public void testTimeOffset2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.timeOffset(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimezone() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.timezone(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimezone2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).timezone(null));
  }

  @Test
  public void testYears() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).years(null));
  }

  @Test
  public void testMonths() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).months(null));
  }

  @Test
  public void testDays() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).days(null));
  }

  @Test
  public void testHours() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).hours(null));
  }

  @Test
  public void testMinutes() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).minutes(null));
  }

  @Test
  public void testSeconds() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).seconds(null));
  }

  @Test
  public void testListContains() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.listContains(null, "foo"));
  }

  @Test
  public void testListContains2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(defaultFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void testAppend() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, defaultFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void testCount() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    BigDecimal actualCountResult = defaultFEELLib.count(objectList);

    // Assert
    assertSame(actualCountResult.ONE, actualCountResult);
    assertEquals("1", actualCountResult.toString());
  }

  @Test
  public void testCount2() {
    // Arrange and Act
    BigDecimal actualCountResult = (new DefaultFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
    assertEquals("0", actualCountResult.toString());
  }

  @Test
  public void testMode() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void testMode2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.mode(objectList));
  }

  @Test
  public void testSort() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.<Object>sort(objectList, null).size());
  }
}

