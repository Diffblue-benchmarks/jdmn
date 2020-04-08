package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class UniformJavaTimeFEELLibDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    UniformJavaTimeFEELLib actualUniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();

    // Assert
    assertTrue(actualUniformJavaTimeFEELLib.stringType instanceof com.gs.dmn.feel.lib.type.string.DefaultStringType);
    assertTrue(actualUniformJavaTimeFEELLib.numericType instanceof com.gs.dmn.feel.lib.type.numeric.DefaultNumericType);
    assertTrue(actualUniformJavaTimeFEELLib.timeType instanceof com.gs.dmn.feel.lib.type.time.uniform.ZonedTimeType);
    assertTrue(
        actualUniformJavaTimeFEELLib.dateTimeType instanceof com.gs.dmn.feel.lib.type.time.uniform.ZonedDateTimeType);
    assertTrue(actualUniformJavaTimeFEELLib.listType instanceof com.gs.dmn.feel.lib.type.list.DefaultListType);
    assertTrue(
        actualUniformJavaTimeFEELLib.durationType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDurationType);
    assertTrue(actualUniformJavaTimeFEELLib.dateType instanceof com.gs.dmn.feel.lib.type.time.uniform.ZonedDateType);
    assertTrue(actualUniformJavaTimeFEELLib.booleanType instanceof com.gs.dmn.feel.lib.type.logic.DefaultBooleanType);
    assertTrue(actualUniformJavaTimeFEELLib.contextType instanceof com.gs.dmn.feel.lib.type.context.DefaultContextType);
  }

  @Test
  public void testNumber() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void testNumber10() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(","));
  }

  @Test
  public void testNumber2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void testNumber3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void testNumber4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void testNumber5() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void testNumber6() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void testNumber7() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", null, ","));
  }

  @Test
  public void testNumber8() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void testNumber9() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", null));
  }

  @Test
  public void testString() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).string(","));
  }

  @Test
  public void testDate() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date(""));
  }

  @Test
  public void testDate2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date(","));
  }

  @Test
  public void testDate3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date((String) null));
  }

  @Test
  public void testDate4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test
  public void testTime() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();

    // Act and Assert
    assertNull(
        uniformJavaTimeFEELLib.time(BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L), null));
  }

  @Test
  public void testTime2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test
  public void testTime3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).time((String) null));
  }

  @Test
  public void testTime4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).time(","));
  }

  @Test
  public void testDateAndTime() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(null));
  }

  @Test
  public void testDateAndTime2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void testDateAndTime3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void testDateAndTime4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(null, null));
  }

  @Test
  public void testDuration() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void testDuration2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void testYearsAndMonthsDuration() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).yearsAndMonthsDuration(null, null));
  }

  @Test
  public void testMakeZonedDateTime() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).makeZonedDateTime(""));
  }

  @Test
  public void testMakeZonedDateTime2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).makeZonedDateTime(","));
  }

  @Test
  public void testDecimal() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new UniformJavaTimeFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void testFloor() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new UniformJavaTimeFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void testCeiling() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new UniformJavaTimeFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void testAbs() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new UniformJavaTimeFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void testIntModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void testIntModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new UniformJavaTimeFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void testModulo() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new UniformJavaTimeFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void testModulo2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void testSqrt() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sqrt(number));
  }

  @Test
  public void testSqrt2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new UniformJavaTimeFEELLib()).sqrt(number).toString());
  }

  @Test
  public void testLog() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).log(number));
  }

  @Test
  public void testLog2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new UniformJavaTimeFEELLib()).log(number).toString());
  }

  @Test
  public void testExp() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(9223372036854775807L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).exp(number));
  }

  @Test
  public void testExp2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new UniformJavaTimeFEELLib()).exp(number).toString());
  }

  @Test
  public void testOdd() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).odd(number));
  }

  @Test
  public void testEven() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new UniformJavaTimeFEELLib()).even(number));
  }

  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void testMin2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).min((List) null));
  }

  @Test
  public void testMin3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void testMax() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void testMax2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).max((List) null));
  }

  @Test
  public void testMax3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void testSum() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void testSum2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sum((List) null));
  }

  @Test
  public void testSum3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void testSublist() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0,
        uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testSublist3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist4() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).sublist(null, startPosition, startPosition).size());
  }

  @Test
  public void testSublist5() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void testSublist6() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void testSublist7() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).sublist(null, startPosition).size());
  }

  @Test
  public void testSublist8() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void testInsertBefore() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, uniformJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testInsertBefore2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.insertBefore(null, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void testInsertBefore3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, uniformJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testInsertBefore4() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.insertBefore(null, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void testRemove() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    BigDecimal valueOfResult = BigDecimal.valueOf(1L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(valueOfResult);

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.remove(objectList, valueOfResult).size());
  }

  @Test
  public void testReverse() {
    // Arrange, Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).reverse(null).size());
  }

  @Test
  public void testReverse2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void testIndexOf() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add(null);

    // Act
    List actualIndexOfResult = uniformJavaTimeFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.indexOf(null, "foo").size());
  }

  @Test
  public void testIndexOf3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);
    objectList.add("foo");

    // Act
    List actualIndexOfResult = uniformJavaTimeFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("2", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf4() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    List actualIndexOfResult = uniformJavaTimeFEELLib.indexOf(objectList, "foo");

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testIndexOf5() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act
    List actualIndexOfResult = uniformJavaTimeFEELLib.indexOf(objectList, null);

    // Assert
    assertEquals(1, actualIndexOfResult.size());
    assertEquals("1", actualIndexOfResult.get(0).toString());
  }

  @Test
  public void testDistinctValues() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testDistinctValues2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testDistinctValues3() {
    // Arrange, Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).distinctValues(null).size());
  }

  @Test
  public void testFlatten() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).flatten(null));
  }

  @Test
  public void testFlatten2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void testProduct() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).product((List) null));
  }

  @Test
  public void testProduct2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void testProduct3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void testMedian() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).median((List) null));
  }

  @Test
  public void testMedian2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void testMedian3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void testStddev() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void testStddev2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).stddev((List) null));
  }

  @Test
  public void testStddev3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void testMean2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mean((List) null));
  }

  @Test
  public void testMean3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void testStartsWith() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void testEndsWith() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void testStringLength() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).stringLength(null));
  }

  @Test
  public void testStringLength2() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new UniformJavaTimeFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void testSubstring() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void testSubstring2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).substring(",", startPosition));
  }

  @Test
  public void testUpperCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).upperCase(","));
  }

  @Test
  public void testLowerCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void testSubstringBefore() {
    // Arrange, Act and Assert
    assertEquals("", (new UniformJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void testSubstringAfter() {
    // Arrange, Act and Assert
    assertEquals("", (new UniformJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void testReplace() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void testReplace2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void testReplace3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void testMatches() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void testMatches2() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void testMatches3() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void testSplit() {
    // Arrange, Act and Assert
    assertEquals(2, (new UniformJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void testAnd() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).and((List) null));
  }

  @Test
  public void testAnd4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void testAll() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void testAll2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void testOr() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void testOr2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void testAny() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).any((List) null));
  }

  @Test
  public void testAny2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void testAny3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void testNot() {
    // Arrange, Act and Assert
    assertFalse((new UniformJavaTimeFEELLib()).not(true));
  }

  @Test
  public void testYear() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).year(null));
  }

  @Test
  public void testMonth() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).month(null));
  }

  @Test
  public void testDay() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).day(null));
  }

  @Test
  public void testWeekday() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).weekday(null));
  }

  @Test
  public void testListContains() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(uniformJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void testListContains2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.listContains(null, "foo"));
  }

  @Test
  public void testAppend() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(3, uniformJavaTimeFEELLib.append(null, "foo", "foo", "foo").size());
  }

  @Test
  public void testAppend2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, uniformJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void testCount() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    BigDecimal actualCountResult = uniformJavaTimeFEELLib.count(objectList);

    // Assert
    assertSame(actualCountResult.ONE, actualCountResult);
    assertEquals("1", actualCountResult.toString());
  }

  @Test
  public void testCount2() {
    // Arrange and Act
    BigDecimal actualCountResult = (new UniformJavaTimeFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
    assertEquals("0", actualCountResult.toString());
  }

  @Test
  public void testMode() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void testMode2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void testSort() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.<Object>sort(objectList, null).size());
  }
}

