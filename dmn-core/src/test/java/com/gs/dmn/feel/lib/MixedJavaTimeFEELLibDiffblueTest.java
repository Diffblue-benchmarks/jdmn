package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MixedJavaTimeFEELLibDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    MixedJavaTimeFEELLib actualMixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();

    // Assert
    assertTrue(actualMixedJavaTimeFEELLib.stringType instanceof com.gs.dmn.feel.lib.type.string.DefaultStringType);
    assertTrue(actualMixedJavaTimeFEELLib.numericType instanceof com.gs.dmn.feel.lib.type.numeric.DefaultNumericType);
    assertTrue(actualMixedJavaTimeFEELLib.timeType instanceof com.gs.dmn.feel.lib.type.time.mixed.OffsetTimeType);
    assertTrue(
        actualMixedJavaTimeFEELLib.dateTimeType instanceof com.gs.dmn.feel.lib.type.time.mixed.ZonedDateTimeType);
    assertTrue(actualMixedJavaTimeFEELLib.listType instanceof com.gs.dmn.feel.lib.type.list.DefaultListType);
    assertTrue(
        actualMixedJavaTimeFEELLib.durationType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDurationType);
    assertTrue(actualMixedJavaTimeFEELLib.dateType instanceof com.gs.dmn.feel.lib.type.time.mixed.LocalDateType);
    assertTrue(actualMixedJavaTimeFEELLib.booleanType instanceof com.gs.dmn.feel.lib.type.logic.DefaultBooleanType);
    assertTrue(actualMixedJavaTimeFEELLib.contextType instanceof com.gs.dmn.feel.lib.type.context.DefaultContextType);
  }

  @Test
  public void testNumber() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void testNumber10() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(","));
  }

  @Test
  public void testNumber2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void testNumber3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void testNumber4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", null, ","));
  }

  @Test
  public void testNumber5() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void testNumber6() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", null));
  }

  @Test
  public void testNumber7() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void testNumber8() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void testNumber9() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void testString() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).string(","));
  }

  @Test
  public void testDate() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test
  public void testDate2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date((LocalDate) null));
  }

  @Test
  public void testDate3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date(","));
  }

  @Test
  public void testDate4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date((String) null));
  }

  @Test
  public void testDate5() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date(""));
  }

  @Test
  public void testTime() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time((LocalDate) null));
  }

  @Test
  public void testTime2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time(","));
  }

  @Test
  public void testTime3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time((OffsetTime) null));
  }

  @Test
  public void testTime4() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();

    // Act and Assert
    assertNull(
        mixedJavaTimeFEELLib.time(BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L), null));
  }

  @Test
  public void testTime5() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test
  public void testDateAndTime() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime((LocalDate) null, null));
  }

  @Test
  public void testDateAndTime2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime("2020-03-01", null));
  }

  @Test
  public void testDateAndTime3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime((Object) null, null));
  }

  @Test
  public void testDateAndTime4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void testDateAndTime5() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime(null));
  }

  @Test
  public void testDateAndTime6() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void testDuration() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void testDuration2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void testYearsAndMonthsDuration() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (ZonedDateTime) null));
  }

  @Test
  public void testYearsAndMonthsDuration2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (ZonedDateTime) null));
  }

  @Test
  public void testYearsAndMonthsDuration3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (LocalDate) null));
  }

  @Test
  public void testYearsAndMonthsDuration4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (LocalDate) null));
  }

  @Test
  public void testDecimal() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new MixedJavaTimeFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void testFloor() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new MixedJavaTimeFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void testCeiling() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new MixedJavaTimeFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void testAbs() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new MixedJavaTimeFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void testIntModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void testIntModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new MixedJavaTimeFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void testModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void testModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new MixedJavaTimeFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void testSqrt() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sqrt(number));
  }

  @Test
  public void testSqrt2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new MixedJavaTimeFEELLib()).sqrt(number).toString());
  }

  @Test
  public void testLog() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).log(number));
  }

  @Test
  public void testLog2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new MixedJavaTimeFEELLib()).log(number).toString());
  }

  @Test
  public void testExp() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new MixedJavaTimeFEELLib()).exp(number).toString());
  }

  @Test
  public void testExp2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(9223372036854775807L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).exp(number));
  }

  @Test
  public void testOdd() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).odd(number));
  }

  @Test
  public void testEven() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new MixedJavaTimeFEELLib()).even(number));
  }

  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void testMin2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void testMin3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).min((List) null));
  }

  @Test
  public void testMax() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void testMax2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).max((List) null));
  }

  @Test
  public void testMax3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void testSum() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void testSum2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sum((List) null));
  }

  @Test
  public void testSum3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void testSublist() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist3() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new MixedJavaTimeFEELLib()).sublist(null, startPosition, startPosition).size());
  }

  @Test
  public void testSublist4() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testSublist5() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new MixedJavaTimeFEELLib()).sublist(null, startPosition).size());
  }

  @Test
  public void testSublist6() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist7() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testSublist8() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testInsertBefore() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, mixedJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testInsertBefore2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, mixedJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testInsertBefore3() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.insertBefore(null, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testInsertBefore4() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.insertBefore(null, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testRemove() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    BigDecimal valueOfResult = BigDecimal.valueOf(1L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(valueOfResult);

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.remove(objectList, valueOfResult).size());
  }

  @Test
  public void testReverse() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void testIndexOf() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);
    objectList.add("foo");

    // Act
    List actualIndexOfResult = mixedJavaTimeFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    List actualIndexOfResult = mixedJavaTimeFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf3() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add(null);

    // Act
    List actualIndexOfResult = mixedJavaTimeFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf4() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act
    List actualIndexOfResult = mixedJavaTimeFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testDistinctValues() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testDistinctValues2() {
    // Arrange, Act and Assert
    assertEquals(0, (new MixedJavaTimeFEELLib()).distinctValues(null).size());
  }

  @Test
  public void testDistinctValues3() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testFlatten() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).flatten(null));
  }

  @Test
  public void testFlatten2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void testProduct() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void testProduct2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).product((List) null));
  }

  @Test
  public void testProduct3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void testMedian() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void testMedian2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).median((List) null));
  }

  @Test
  public void testMedian3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void testStddev() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void testStddev2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).stddev((List) null));
  }

  @Test
  public void testStddev3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void testMean2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void testMean3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mean((List) null));
  }

  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void testStartsWith() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void testEndsWith() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void testStringLength() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).stringLength(null));
  }

  @Test
  public void testStringLength2() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new MixedJavaTimeFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void testSubstring() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void testSubstring2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).substring(",", startPosition));
  }

  @Test
  public void testUpperCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).upperCase(","));
  }

  @Test
  public void testLowerCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void testSubstringBefore() {
    // Arrange, Act and Assert
    assertEquals("", (new MixedJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void testSubstringAfter() {
    // Arrange, Act and Assert
    assertEquals("", (new MixedJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void testReplace() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void testReplace2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void testReplace3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void testMatches() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void testMatches2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void testMatches3() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void testSplit() {
    // Arrange, Act and Assert
    assertEquals(2, (new MixedJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void testAnd() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).and((List) null));
  }

  @Test
  public void testAnd3() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void testAll() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void testAll2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void testOr() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void testOr2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void testAny() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).any((List) null));
  }

  @Test
  public void testAny2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void testAny3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void testNot() {
    // Arrange, Act and Assert
    assertFalse((new MixedJavaTimeFEELLib()).not(true));
  }

  @Test
  public void testYear() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test
  public void testYear2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).year((ZonedDateTime) null));
  }

  @Test
  public void testMonth() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test
  public void testMonth2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).month((ZonedDateTime) null));
  }

  @Test
  public void testDay() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test
  public void testDay2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).day((ZonedDateTime) null));
  }

  @Test
  public void testWeekday() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).weekday((ZonedDateTime) null));
  }

  @Test
  public void testWeekday2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test
  public void testListContains() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(mixedJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void testListContains2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.listContains(null, "foo"));
  }

  @Test
  public void testAppend() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(3, mixedJavaTimeFEELLib.append(null, "foo", "foo", "foo").size());
  }

  @Test
  public void testAppend2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, mixedJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void testCount() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    BigDecimal actualCountResult = mixedJavaTimeFEELLib.count(objectList);

    // Assert
    assertSame(actualCountResult.ONE, actualCountResult);
    assertEquals("1", actualCountResult.toString());
  }

  @Test
  public void testCount2() {
    // Arrange and Act
    BigDecimal actualCountResult = (new MixedJavaTimeFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
    assertEquals("0", actualCountResult.toString());
  }

  @Test
  public void testMode() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void testMode2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void testSort() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.<Object>sort(objectList, null).size());
  }
}

