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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DefaultFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new DefaultFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void allTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.all(objectList));
  }

  @Test
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void andTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.and(objectList));
  }

  @Test
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void anyTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.any(objectList));
  }

  @Test
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void appendTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, defaultFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void ceilingTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new DefaultFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test
  public void constructorTest() {
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
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).contains(",", ","));
  }

  @Test
  public void countTest() {
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
  public void dateAndTimeTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.dateAndTime(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).dateAndTime(","));
  }

  @Test
  public void dateTest() {
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
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date(","));
  }

  @Test
  public void dateTest3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date(""));
  }

  @Test
  public void dateTest4() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.date(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dayTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.day(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void decimalTest() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new DefaultFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void distinctValuesTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).duration(","));
  }

  @Test
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).duration(""));
  }

  @Test
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).endsWith(",", ","));
  }

  @Test
  public void evenTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new DefaultFEELLib()).even(number));
  }

  @Test
  public void expTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new DefaultFEELLib()).exp(number).toString());
  }

  @Test
  public void expTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(12869L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).exp(number));
  }

  @Test
  public void flattenTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.flatten(objectList).size());
  }

  @Test
  public void floorTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new DefaultFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void hourTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.hour(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void indexOfTest() {
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
  public void insertBeforeTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.insertBefore(objectList, BigDecimal.valueOf(222L), ",").size());
  }

  @Test
  public void insertBeforeTest2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, defaultFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void insertBeforeTest3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, defaultFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void intModuloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void intModuloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new DefaultFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void listContainsTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(defaultFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void logTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).log(number));
  }

  @Test
  public void logTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new DefaultFEELLib()).log(number).toString());
  }

  @Test
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).lowerCase(","));
  }

  @Test
  public void matchesTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void matchesTest3() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).matches(",", ","));
  }

  @Test
  public void maxTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.max(objectList));
  }

  @Test
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void meanTest2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.mean(objectList));
  }

  @Test
  public void medianTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.median(objectList));
  }

  @Test
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void minTest2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.min(objectList));
  }

  @Test
  public void minuteTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.minute(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void modeTest2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void moduloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new DefaultFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void monthTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.month(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void notTest() {
    // Arrange, Act and Assert
    assertFalse((new DefaultFEELLib()).not(true));
  }

  @Test
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", "."));
  }

  @Test
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ".", ","));
  }

  @Test
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", "Z", ","));
  }

  @Test
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", ","));
  }

  @Test
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", " ", ","));
  }

  @Test
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(",", ",", " "));
  }

  @Test
  public void numberTest8() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(","));
  }

  @Test
  public void oddTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new DefaultFEELLib()).odd(number));
  }

  @Test
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void orTest2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.or(objectList));
  }

  @Test
  public void productTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.product(objectList));
  }

  @Test
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void removeTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    defaultFEELLib.remove(objectList, "foo");
  }

  @Test
  public void replaceTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).replace(",", "", ","));
  }

  @Test
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void reverseTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.reverse(objectList).size());
  }

  @Test
  public void secondTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.second(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new DefaultFEELLib()).split(",", ",").size());
  }

  @Test
  public void sqrtTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new DefaultFEELLib()).sqrt(number).toString());
  }

  @Test
  public void sqrtTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new DefaultFEELLib()).sqrt(number));
  }

  @Test
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultFEELLib()).startsWith(",", ","));
  }

  @Test
  public void stddevTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.stddev(objectList));
  }

  @Test
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void stringLengthTest() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new DefaultFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).string(","));
  }

  @Test
  public void sublistTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void sublistTest2() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void sublistTest3() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(222L), BigDecimal.valueOf(222L)).size());
  }

  @Test
  public void sublistTest4() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void sublistTest5() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(222L)).size());
  }

  @Test
  public void sublistTest6() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void sublistTest7() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, defaultFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void substringTest() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new DefaultFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void substringTest2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new DefaultFEELLib()).substring(",", startPosition));
  }

  @Test
  public void sumTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultFEELLib.sum(objectList));
  }

  @Test
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void timeOffsetTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.timeOffset(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    defaultFEELLib.time(new FEELXMLGregorianCalendar());
  }

  @Test
  public void timeTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).time(","));
  }

  @Test
  public void timezoneTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertNull(defaultFEELLib.timezone(new FEELXMLGregorianCalendar()));
  }

  @Test
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).toDate(",");
  }

  @Test
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).toTime(",");
  }

  @Test
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).union("foo", "foo", "foo");
  }

  @Test
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DefaultFEELLib()).upperCase(","));
  }

  @Test
  public void weekdayTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("4", defaultFEELLib.weekday(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void yearTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertEquals("-2147483648", defaultFEELLib.year(new FEELXMLGregorianCalendar()).toString());
  }

  @Test
  public void yearsAndMonthsDurationTest() {
    // Arrange
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    defaultFEELLib.yearsAndMonthsDuration(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar());
  }
}

