package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class DoubleMixedJavaTimeFEELLibDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DoubleMixedJavaTimeFEELLib actualDoubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();

    // Assert
    assertTrue(
        actualDoubleMixedJavaTimeFEELLib.stringType instanceof com.gs.dmn.feel.lib.type.string.DefaultStringType);
    assertTrue(
        actualDoubleMixedJavaTimeFEELLib.numericType instanceof com.gs.dmn.feel.lib.type.numeric.DoubleNumericType);
    assertTrue(actualDoubleMixedJavaTimeFEELLib.timeType instanceof com.gs.dmn.feel.lib.type.time.mixed.OffsetTimeType);
    assertTrue(
        actualDoubleMixedJavaTimeFEELLib.dateTimeType instanceof com.gs.dmn.feel.lib.type.time.mixed.ZonedDateTimeType);
    assertTrue(actualDoubleMixedJavaTimeFEELLib.listType instanceof com.gs.dmn.feel.lib.type.list.DefaultListType);
    assertTrue(
        actualDoubleMixedJavaTimeFEELLib.durationType instanceof com.gs.dmn.feel.lib.type.time.xml.DoubleDefaultDurationType);
    assertTrue(actualDoubleMixedJavaTimeFEELLib.dateType instanceof com.gs.dmn.feel.lib.type.time.mixed.LocalDateType);
    assertTrue(
        actualDoubleMixedJavaTimeFEELLib.booleanType instanceof com.gs.dmn.feel.lib.type.logic.DefaultBooleanType);
    assertTrue(
        actualDoubleMixedJavaTimeFEELLib.contextType instanceof com.gs.dmn.feel.lib.type.context.DefaultContextType);
  }

  @Test
  public void testNumber() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void testNumber10() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(","));
  }

  @Test
  public void testNumber2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", null, ","));
  }

  @Test
  public void testNumber3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void testNumber4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void testNumber5() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void testNumber6() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", null));
  }

  @Test
  public void testNumber7() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void testNumber8() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void testNumber9() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void testString() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).string(","));
  }

  @Test
  public void testDate() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test
  public void testDate2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(2.0, 2.0, null));
  }

  @Test
  public void testDate3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(2.0, null, 2.0));
  }

  @Test
  public void testDate4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(null, 2.0, 2.0));
  }

  @Test
  public void testDate5() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((LocalDate) null));
  }

  @Test
  public void testDate6() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(","));
  }

  @Test
  public void testDate7() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(""));
  }

  @Test
  public void testDate8() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((String) null));
  }

  @Test
  public void testTime() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((LocalDate) null));
  }

  @Test
  public void testTime2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time(","));
  }

  @Test
  public void testTime3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((String) null));
  }

  @Test
  public void testTime4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((OffsetTime) null));
  }

  @Test
  public void testTime5() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test
  public void testTime6() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time(1.0E9, 2.0, 2.0, null));
  }

  @Test
  public void testTime7() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time(2.0, null, 2.0, null));
  }

  @Test
  public void testTime8() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time(null, 2.0, 2.0, null));
  }

  @Test
  public void testTime9() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time(2.0, 2.0, null, null));
  }

  @Test
  public void testDateAndTime() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime((LocalDate) null, null));
  }

  @Test
  public void testDateAndTime2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime((Object) null, null));
  }

  @Test
  public void testDateAndTime3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime("2020-03-01", null));
  }

  @Test
  public void testDateAndTime4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime(null));
  }

  @Test
  public void testDateAndTime5() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void testDateAndTime6() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void testDuration() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void testDuration2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void testYearsAndMonthsDuration() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (ZonedDateTime) null));
  }

  @Test
  public void testYearsAndMonthsDuration2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (ZonedDateTime) null));
  }

  @Test
  public void testYearsAndMonthsDuration3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (LocalDate) null));
  }

  @Test
  public void testYearsAndMonthsDuration4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (LocalDate) null));
  }

  @Test
  public void testDecimal() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).decimal(Double.NaN, 2.0));
  }

  @Test
  public void testDecimal2() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).decimal(2.0, 2.0).doubleValue(), 0.0);
  }

  @Test
  public void testFloor() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).floor(2.0).doubleValue(), 0.0);
  }

  @Test
  public void testFloor2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).floor(Double.NaN));
  }

  @Test
  public void testCeiling() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).ceiling(2.0).doubleValue(), 0.0);
  }

  @Test
  public void testCeiling2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).ceiling(Double.NaN));
  }

  @Test
  public void testAbs() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).abs(2.0).doubleValue(), 0.0);
  }

  @Test
  public void testIntModulo() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).intModulo(2.0, 0.5));
  }

  @Test
  public void testIntModulo2() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new DoubleMixedJavaTimeFEELLib()).intModulo(2.0, 2.0).doubleValue(), 0.0);
  }

  @Test
  public void testModulo() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new DoubleMixedJavaTimeFEELLib()).modulo(2.0, 2.0).doubleValue(), 0.0);
  }

  @Test
  public void testModulo2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).modulo(Double.NaN, 2.0));
  }

  @Test
  public void testSqrt() {
    // Arrange, Act and Assert
    assertEquals(1.4142135623730951, (new DoubleMixedJavaTimeFEELLib()).sqrt(2.0).doubleValue(), 0.0);
  }

  @Test
  public void testLog() {
    // Arrange, Act and Assert
    assertEquals(0.6931471805599453, (new DoubleMixedJavaTimeFEELLib()).log(2.0).doubleValue(), 0.0);
  }

  @Test
  public void testExp() {
    // Arrange, Act and Assert
    assertEquals(7.38905609893065, (new DoubleMixedJavaTimeFEELLib()).exp(2.0).doubleValue(), 0.0);
  }

  @Test
  public void testOdd() {
    // Arrange, Act and Assert
    assertFalse((new DoubleMixedJavaTimeFEELLib()).odd(2.0));
  }

  @Test
  public void testEven() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).even(2.0));
  }

  @Test
  public void testMin() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void testMin2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).min((List) null));
  }

  @Test
  public void testMin3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void testMax() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void testMax2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void testMax3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void testMax4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).max((List) null));
  }

  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void testSum2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).sum((List) null));
  }

  @Test
  public void testSum3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mean((List) null));
  }

  @Test
  public void testMean2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void testMean3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void testStartsWith() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void testEndsWith() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void testStringLength() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).stringLength(null));
  }

  @Test
  public void testStringLength2() {
    // Arrange, Act and Assert
    assertEquals(1.0, (new DoubleMixedJavaTimeFEELLib()).stringLength(",").doubleValue(), 0.0);
  }

  @Test
  public void testSubstring() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substring(",", 2.0, 2.0));
  }

  @Test
  public void testSubstring2() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substring(",", 2.0));
  }

  @Test
  public void testUpperCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).upperCase(","));
  }

  @Test
  public void testLowerCase() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void testSubstringBefore() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void testSubstringAfter() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void testReplace() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void testReplace2() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void testReplace3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void testMatches() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void testMatches2() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void testMatches3() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void testSplit() {
    // Arrange, Act and Assert
    assertEquals(2, (new DoubleMixedJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void testAnd() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).and((List) null));
  }

  @Test
  public void testAnd3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void testAnd4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void testAll() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void testAll2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void testOr() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void testOr2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void testAny() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).any((List) null));
  }

  @Test
  public void testAny2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void testAny3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void testNot() {
    // Arrange, Act and Assert
    assertFalse((new DoubleMixedJavaTimeFEELLib()).not(true));
  }

  @Test
  public void testYear() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).year((ZonedDateTime) null));
  }

  @Test
  public void testYear2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test
  public void testMonth() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).month((ZonedDateTime) null));
  }

  @Test
  public void testMonth2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test
  public void testDay() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test
  public void testDay2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).day((ZonedDateTime) null));
  }

  @Test
  public void testWeekday() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test
  public void testWeekday2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).weekday((ZonedDateTime) null));
  }

  @Test
  public void testListContains() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(doubleMixedJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void testListContains2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.listContains(null, "foo"));
  }

  @Test
  public void testAppend() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(3, doubleMixedJavaTimeFEELLib.append(null, "foo", "foo", "foo").size());
  }

  @Test
  public void testAppend2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, doubleMixedJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void testCount() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new DoubleMixedJavaTimeFEELLib()).count(null).doubleValue(), 0.0);
  }

  @Test
  public void testCount2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1.0, doubleMixedJavaTimeFEELLib.count(objectList).doubleValue(), 0.0);
  }

  @Test
  public void testSublist() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.sublist(objectList, 0.5, 2.0).size());
  }

  @Test
  public void testSublist2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.sublist(objectList, 2.0, 2.0).size());
  }

  @Test
  public void testSublist3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");
    ArrayList<Object> objectList1 = new ArrayList<Object>(objectList);
    objectList1.add("foo");
    objectList1.add("foo");

    // Act and Assert
    assertEquals(2, doubleMixedJavaTimeFEELLib.sublist(objectList1, 2.0, 2.0).size());
  }

  @Test
  public void testSublist4() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.sublist(objectList, 2.0).size());
  }

  @Test
  public void testSublist5() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.sublist(objectList, 2.0).size());
  }

  @Test
  public void testInsertBefore() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertEquals(3, doubleMixedJavaTimeFEELLib.insertBefore(objectList, 2.0, "foo").size());
  }

  @Test
  public void testInsertBefore2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.insertBefore(objectList, 2.0, "foo").size());
  }

  @Test
  public void testInsertBefore3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.insertBefore(null, 2.0, "foo").size());
  }

  @Test
  public void testRemove() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add(2.0);

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.remove(objectList, 2.0).size());
  }

  @Test
  public void testReverse() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleMixedJavaTimeFEELLib()).reverse(null).size());
  }

  @Test
  public void testReverse2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void testIndexOf() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.indexOf(objectList, "foo").size());
  }

  @Test
  public void testIndexOf2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add(null);

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.indexOf(objectList, null).size());
  }

  @Test
  public void testIndexOf3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.indexOf(objectList, "foo").size());
  }

  @Test
  public void testIndexOf4() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.indexOf(objectList, null).size());
  }

  @Test
  public void testDistinctValues() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testDistinctValues2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void testFlatten() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void testFlatten2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).flatten(null));
  }

  @Test
  public void testProduct() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).product((List) null));
  }

  @Test
  public void testProduct2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void testProduct3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void testMedian() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void testMedian2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void testMedian3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).median((List) null));
  }

  @Test
  public void testStddev() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void testStddev2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void testStddev3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).stddev((List) null));
  }

  @Test
  public void testMode() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void testMode2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void testSort() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.<Object>sort(objectList, null).size());
  }
}

