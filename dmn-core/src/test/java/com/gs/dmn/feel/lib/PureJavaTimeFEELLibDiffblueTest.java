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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PureJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new PureJavaTimeFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void allTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void andTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void anyTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void appendTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, pureJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void appendTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(3, pureJavaTimeFEELLib.append(null, "foo", "foo", "foo").size());
  }

  @Test
  public void ceilingTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new PureJavaTimeFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new PureJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test
  public void constructorTest() {
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
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void countTest() {
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
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(null, null));
  }

  @Test
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void dateAndTimeTest3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).date(","));
  }

  @Test
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).date((Temporal) null));
  }

  @Test
  public void dayTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test
  public void dayTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).day((Temporal) null));
  }

  @Test
  public void daysTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).days(null));
  }

  @Test
  public void decimalTest() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new PureJavaTimeFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void distinctValuesTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void evenTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new PureJavaTimeFEELLib()).even(number));
  }

  @Test
  public void expTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(2630L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).exp(number));
  }

  @Test
  public void expTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new PureJavaTimeFEELLib()).exp(number).toString());
  }

  @Test
  public void flattenTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void floorTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new PureJavaTimeFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void hourTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).hour(null));
  }

  @Test
  public void hoursTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).hours(null));
  }

  @Test
  public void indexOfTest() {
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
  public void insertBeforeTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, pureJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void insertBeforeTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, pureJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void insertBeforeTest3() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(2630L), ",").size());
  }

  @Test
  public void intModuloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void intModuloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new PureJavaTimeFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void listContainsTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(pureJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void logTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new PureJavaTimeFEELLib()).log(number).toString());
  }

  @Test
  public void logTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).log(number));
  }

  @Test
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void matchesTest() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void matchesTest3() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void maxTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void meanTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void medianTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void minTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void minuteTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).minute(null));
  }

  @Test
  public void minutesTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).minutes(null));
  }

  @Test
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void modeTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new PureJavaTimeFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void moduloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void monthTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test
  public void monthTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).month((Temporal) null));
  }

  @Test
  public void monthsTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).months(null));
  }

  @Test
  public void notTest() {
    // Arrange, Act and Assert
    assertFalse((new PureJavaTimeFEELLib()).not(true));
  }

  @Test
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void numberTest8() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(","));
  }

  @Test
  public void oddTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).odd(number));
  }

  @Test
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void orTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void productTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void removeTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    pureJavaTimeFEELLib.remove(objectList, "foo");
  }

  @Test
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void reverseTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void secondTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).second(null));
  }

  @Test
  public void secondsTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).seconds(null));
  }

  @Test
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new PureJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void sqrtTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sqrt(number));
  }

  @Test
  public void sqrtTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new PureJavaTimeFEELLib()).sqrt(number).toString());
  }

  @Test
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void stddevTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void stringLengthTest() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new PureJavaTimeFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).string(","));
  }

  @Test
  public void sublistTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0,
        pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(2630L), BigDecimal.valueOf(2630L)).size());
  }

  @Test
  public void sublistTest2() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void sublistTest3() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void sublistTest4() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void sublistTest5() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void sublistTest6() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(2630L)).size());
  }

  @Test
  public void sublistTest7() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, pureJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new PureJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new PureJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void substringTest() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void substringTest2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).substring(",", startPosition));
  }

  @Test
  public void sumTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void timeOffsetTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).timeOffset(null));
  }

  @Test
  public void timeTest() {
    // Arrange
    PureJavaTimeFEELLib pureJavaTimeFEELLib = new PureJavaTimeFEELLib();

    // Act and Assert
    assertNull(pureJavaTimeFEELLib.time(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L), BigDecimal.valueOf(1L), null));
  }

  @Test
  public void timeTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).time(","));
  }

  @Test
  public void timeTest3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).time((Temporal) null));
  }

  @Test
  public void timezoneTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).timezone(null));
  }

  @Test
  public void toDateTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).toDate(","));
  }

  @Test
  public void toTimeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).toTime(","));
  }

  @Test
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new PureJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new PureJavaTimeFEELLib()).upperCase(","));
  }

  @Test
  public void weekdayTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).weekday((Temporal) null));
  }

  @Test
  public void weekdayTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test
  public void yearTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test
  public void yearTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).year((Temporal) null));
  }

  @Test
  public void yearsAndMonthsDurationTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).yearsAndMonthsDuration(null, null));
  }

  @Test
  public void yearsTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).years(null));
  }
}

