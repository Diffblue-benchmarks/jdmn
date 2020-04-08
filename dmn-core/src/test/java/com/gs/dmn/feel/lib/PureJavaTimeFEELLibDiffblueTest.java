package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PureJavaTimeFEELLibDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PureJavaTimeFEELLib actualPureJavaTimeFEELLib = new PureJavaTimeFEELLib();

    // Assert
    assertTrue(actualPureJavaTimeFEELLib.stringType instanceof com.gs.dmn.feel.lib.type.string.DefaultStringType);
    assertTrue(actualPureJavaTimeFEELLib.numericType instanceof com.gs.dmn.feel.lib.type.numeric.DefaultNumericType);
    assertTrue(actualPureJavaTimeFEELLib.timeType instanceof com.gs.dmn.feel.lib.type.time.pure.TemporalTimeType);
    assertTrue(
        actualPureJavaTimeFEELLib.dateTimeType instanceof com.gs.dmn.feel.lib.type.time.pure.TemporalDateTimeType);
    assertTrue(actualPureJavaTimeFEELLib.listType instanceof com.gs.dmn.feel.lib.type.list.DefaultListType);
    assertTrue(
        actualPureJavaTimeFEELLib.durationType instanceof com.gs.dmn.feel.lib.type.time.pure.TemporalAmountDurationType);
    assertTrue(actualPureJavaTimeFEELLib.dateType instanceof com.gs.dmn.feel.lib.type.time.pure.LocalDateType);
    assertTrue(actualPureJavaTimeFEELLib.booleanType instanceof com.gs.dmn.feel.lib.type.logic.DefaultBooleanType);
    assertTrue(actualPureJavaTimeFEELLib.contextType instanceof com.gs.dmn.feel.lib.type.context.DefaultContextType);
  }

  @Test
  public void testNumber() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void testNumber10() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(","));
  }

  @Test
  public void testNumber2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void testNumber3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", null, ","));
  }

  @Test
  public void testNumber4() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void testNumber5() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void testNumber6() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void testNumber7() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", null));
  }

  @Test
  public void testNumber8() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void testNumber9() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void testString() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).string(","));
  }

  @Test
  public void testDate() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).date(","));
  }

  @Test
  public void testDate2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).date((String) null));
  }

  @Test
  public void testDate3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).date((Temporal) null));
  }

  @Test
  public void testTime() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.time(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L), BigDecimal.valueOf(1L), null));
  }

  @Test
  public void testTime2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).time((String) null));
  }

  @Test
  public void testTime3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).time(","));
  }

  @Test
  public void testTime4() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).time((Temporal) null));
  }

  @Test
  public void testDateAndTime() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(null, null));
  }

  @Test
  public void testDateAndTime2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void testDateAndTime3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void testDuration() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void testDuration2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void testYearsAndMonthsDuration() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).yearsAndMonthsDuration(null, null));
  }

  @Test
  public void testToDate() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).toDate(","));
  }

  @Test
  public void testToTime() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).toTime(","));
  }

  @Test
  public void testDecimal() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new PureJavaTimeFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void testFloor() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new PureJavaTimeFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void testCeiling() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new PureJavaTimeFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void testAbs() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new PureJavaTimeFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void testIntModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void testIntModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new PureJavaTimeFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void testModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new PureJavaTimeFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void testModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void testSqrt() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new PureJavaTimeFEELLib()).sqrt(number).toString());
  }

  @Test
  public void testSqrt2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sqrt(number));
  }

  @Test
  public void testLog() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).log(number));
  }

  @Test
  public void testLog2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new PureJavaTimeFEELLib()).log(number).toString());
  }

  @Test
  public void testExp() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new PureJavaTimeFEELLib()).exp(number).toString());
  }

  @Test
  public void testExp2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(9223372036854775807L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).exp(number));
  }

  @Test
  public void testOdd() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).odd(number));
  }

  @Test
  public void testEven() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new PureJavaTimeFEELLib()).even(number));
  }

  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void testMin2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void testMin3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).min((List) null));
  }

  @Test
  public void testMax() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).max((List) null));
  }

  @Test
  public void testMax2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void testMax3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sum((List) null));
  }

  @Test
  public void testSum2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void testSum3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void testSublist() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testSublist2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist3() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist4() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new PureJavaTimeFEELLib()).sublist(null, startPosition, startPosition).size());
  }

  @Test
  public void testSublist5() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new PureJavaTimeFEELLib()).sublist(null, startPosition).size());
  }

  @Test
  public void testSublist6() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist7() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist8() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testInsertBefore() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.insertBefore(null, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testInsertBefore2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.insertBefore(null, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testInsertBefore3() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, pureJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testInsertBefore4() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, pureJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testRemove() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    BigDecimal valueOfResult = BigDecimal.valueOf(1L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(valueOfResult);

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.remove(objectList, valueOfResult).size());
  }

  @Test
  public void testReverse() {
    // Arrange, Act and Assert
    assertEquals(0, (new PureJavaTimeFEELLib()).reverse(null).size());
  }

  @Test
  public void testReverse2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void testIndexOf() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add(null);

    // Act
    List actualIndexOfResult = pureJavaTimeFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    List actualIndexOfResult = pureJavaTimeFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf3() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act
    List actualIndexOfResult = pureJavaTimeFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf4() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.indexOf(null, "foo").size());
  }

  @Test
  public void testDistinctValues() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testFlatten() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).flatten(null));
  }

  @Test
  public void testFlatten2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void testProduct() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void testProduct2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).product((List) null));
  }

  @Test
  public void testProduct3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void testMedian() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void testMedian2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).median((List) null));
  }

  @Test
  public void testMedian3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void testStddev() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void testStddev2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).stddev((List) null));
  }

  @Test
  public void testStddev3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void testMean2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void testStartsWith() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void testEndsWith() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void testStringLength() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new PureJavaTimeFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void testSubstring() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void testSubstring2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).substring(",", startPosition));
  }

  @Test
  public void testUpperCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).upperCase(","));
  }

  @Test
  public void testLowerCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void testSubstringBefore() {
    // Arrange, Act and Assert
    assertEquals("", (new PureJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void testSubstringAfter() {
    // Arrange, Act and Assert
    assertEquals("", (new PureJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void testReplace() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void testReplace2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void testReplace3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void testMatches() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void testMatches2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void testMatches3() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void testSplit() {
    // Arrange, Act and Assert
    assertEquals(2, (new PureJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void testAnd() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).and((List) null));
  }

  @Test
  public void testAnd3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void testAll() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void testAll2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void testOr() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void testOr2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void testAny() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void testAny2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).any((List) null));
  }

  @Test
  public void testAny3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void testNot() {
    // Arrange, Act and Assert
    assertFalse((new PureJavaTimeFEELLib()).not(true));
  }

  @Test
  public void testYear() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test
  public void testYear2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).year((Temporal) null));
  }

  @Test
  public void testMonth() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test
  public void testMonth2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).month((Temporal) null));
  }

  @Test
  public void testDay() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test
  public void testDay2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).day((Temporal) null));
  }

  @Test
  public void testWeekday() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).weekday((Temporal) null));
  }

  @Test
  public void testWeekday2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test
  public void testHour() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).hour(null));
  }

  @Test
  public void testMinute() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).minute(null));
  }

  @Test
  public void testSecond() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).second(null));
  }

  @Test
  public void testTimeOffset() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).timeOffset(null));
  }

  @Test
  public void testTimezone() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).timezone(null));
  }

  @Test
  public void testYears() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).years(null));
  }

  @Test
  public void testMonths() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).months(null));
  }

  @Test
  public void testDays() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).days(null));
  }

  @Test
  public void testHours() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).hours(null));
  }

  @Test
  public void testMinutes() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).minutes(null));
  }

  @Test
  public void testSeconds() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).seconds(null));
  }

  @Test
  public void testListContains() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(pureJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void testListContains2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.listContains(null, "foo"));
  }

  @Test
  public void testAppend() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, pureJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void testAppend2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(3, pureJavaTimeFEELLib.append(null, "foo", "foo", "foo").size());
  }

  @Test
  public void testCount() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    BigDecimal actualCountResult = pureJavaTimeFEELLib.count(objectList);

    // Assert
    assertSame(actualCountResult.ONE, actualCountResult);
    assertEquals("1", actualCountResult.toString());
  }

  @Test
  public void testCount2() {
    // Arrange and Act
    BigDecimal actualCountResult = (new PureJavaTimeFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
    assertEquals("0", actualCountResult.toString());
  }

  @Test
  public void testMode() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void testMode2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void testSort() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.<Object>sort(objectList, null).size());
  }
}

