package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MixedJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new MixedJavaTimeFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void allTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void andTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void anyTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void appendTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, mixedJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void ceilingTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new MixedJavaTimeFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test
  public void constructorTest() {
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
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void countTest() {
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
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date(""));
  }

  @Test
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date(","));
  }

  @Test
  public void decimalTest() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new MixedJavaTimeFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void distinctValuesTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void evenTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new MixedJavaTimeFEELLib()).even(number));
  }

  @Test
  public void expTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new MixedJavaTimeFEELLib()).exp(number).toString());
  }

  @Test
  public void expTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1360L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).exp(number));
  }

  @Test
  public void flattenTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void floorTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new MixedJavaTimeFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void indexOfTest() {
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
  public void insertBeforeTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, mixedJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void insertBeforeTest2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1360L), ",").size());
  }

  @Test
  public void insertBeforeTest3() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, mixedJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void intModuloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void intModuloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new MixedJavaTimeFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void listContainsTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(mixedJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void logTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).log(number));
  }

  @Test
  public void logTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new MixedJavaTimeFEELLib()).log(number).toString());
  }

  @Test
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void matchesTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void matchesTest3() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void maxTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void meanTest2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void medianTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void minTest2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void modeTest2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void moduloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new MixedJavaTimeFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void notTest() {
    // Arrange, Act and Assert
    assertFalse((new MixedJavaTimeFEELLib()).not(true));
  }

  @Test
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void numberTest8() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number(","));
  }

  @Test
  public void oddTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).odd(number));
  }

  @Test
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void orTest2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void productTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void removeTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    mixedJavaTimeFEELLib.remove(objectList, "foo");
  }

  @Test
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void reverseTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new MixedJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void sqrtTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sqrt(number));
  }

  @Test
  public void sqrtTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new MixedJavaTimeFEELLib()).sqrt(number).toString());
  }

  @Test
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void stddevTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void stringLengthTest() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new MixedJavaTimeFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).string(","));
  }

  @Test
  public void sublistTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void sublistTest2() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0,
        mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1360L), BigDecimal.valueOf(1360L)).size());
  }

  @Test
  public void sublistTest3() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void sublistTest4() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void sublistTest5() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1360L)).size());
  }

  @Test
  public void sublistTest6() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void sublistTest7() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, mixedJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new MixedJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new MixedJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void substringTest() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void substringTest2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).substring(",", startPosition));
  }

  @Test
  public void sumTest() {
    // Arrange
    MixedJavaTimeFEELLib mixedJavaTimeFEELLib = new MixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(mixedJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time(","));
  }

  @Test
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).toDate(",");
  }

  @Test
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).toTime(",");
  }

  @Test
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new MixedJavaTimeFEELLib()).upperCase(","));
  }
}

