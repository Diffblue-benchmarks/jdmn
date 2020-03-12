package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DoubleMixedJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).abs(2.0).doubleValue(), 0.0);
  }

  @Test
  public void allTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void andTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void anyTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void appendTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    (new ArrayList<Object>()).add("foo");

    // Act and Assert
    assertEquals(3, doubleMixedJavaTimeFEELLib.append(null, "foo", "foo", "foo").size());
  }

  @Test
  public void appendTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, doubleMixedJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).ceiling(Double.NaN));
  }

  @Test
  public void ceilingTest2() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).ceiling(2.0).doubleValue(), 0.0);
  }

  @Test
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test
  public void constructorTest() {
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
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void countTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1.0, doubleMixedJavaTimeFEELLib.count(objectList).doubleValue(), 0.0);
  }

  @Test
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime((LocalDate) null, null));
  }

  @Test
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime("2020-03-01", null));
  }

  @Test
  public void dateAndTimeTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void dateAndTimeTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((LocalDate) null));
  }

  @Test
  public void dateTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(","));
  }

  @Test
  public void dateTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date(""));
  }

  @Test
  public void dayTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test
  public void dayTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).day((ZonedDateTime) null));
  }

  @Test
  public void decimalTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).decimal(Double.NaN, 2.0));
  }

  @Test
  public void decimalTest2() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).decimal(2.0, 2.0).doubleValue(), 0.0);
  }

  @Test
  public void distinctValuesTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void evenTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).even(2.0));
  }

  @Test
  public void expTest() {
    // Arrange, Act and Assert
    assertEquals(7.38905609893065, (new DoubleMixedJavaTimeFEELLib()).exp(2.0).doubleValue(), 0.0);
  }

  @Test
  public void flattenTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void floorTest() {
    // Arrange, Act and Assert
    assertEquals(2.0, (new DoubleMixedJavaTimeFEELLib()).floor(2.0).doubleValue(), 0.0);
  }

  @Test
  public void floorTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).floor(Double.NaN));
  }

  @Test
  public void indexOfTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.indexOf(objectList, "foo").size());
  }

  @Test
  public void insertBeforeTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.insertBefore(objectList, 2.0, "foo").size());
  }

  @Test
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).intModulo(2.0, 0.5));
  }

  @Test
  public void intModuloTest2() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new DoubleMixedJavaTimeFEELLib()).intModulo(2.0, 2.0).doubleValue(), 0.0);
  }

  @Test
  public void listContainsTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(doubleMixedJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void logTest() {
    // Arrange, Act and Assert
    assertEquals(0.6931471805599453, (new DoubleMixedJavaTimeFEELLib()).log(2.0).doubleValue(), 0.0);
  }

  @Test
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void matchesTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void matchesTest3() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void maxTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void maxTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void meanTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void meanTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void medianTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void minTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void minTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void modeTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).modulo(Double.NaN, 2.0));
  }

  @Test
  public void moduloTest2() {
    // Arrange, Act and Assert
    assertEquals(0.0, (new DoubleMixedJavaTimeFEELLib()).modulo(2.0, 2.0).doubleValue(), 0.0);
  }

  @Test
  public void monthTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).month((ZonedDateTime) null));
  }

  @Test
  public void monthTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test
  public void notTest() {
    // Arrange, Act and Assert
    assertFalse((new DoubleMixedJavaTimeFEELLib()).not(true));
  }

  @Test
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(" ", ",", ","));
  }

  @Test
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void numberTest8() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(","));
  }

  @Test
  public void oddTest() {
    // Arrange, Act and Assert
    assertFalse((new DoubleMixedJavaTimeFEELLib()).odd(2.0));
  }

  @Test
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void orTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void productTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void removeTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    doubleMixedJavaTimeFEELLib.remove(objectList, "foo");
  }

  @Test
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void reverseTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, doubleMixedJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new DoubleMixedJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertEquals(1.4142135623730951, (new DoubleMixedJavaTimeFEELLib()).sqrt(2.0).doubleValue(), 0.0);
  }

  @Test
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void stddevTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void stringLengthTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, (new DoubleMixedJavaTimeFEELLib()).stringLength(",").doubleValue(), 0.0);
  }

  @Test
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).string(","));
  }

  @Test
  public void sublistTest() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.sublist(objectList, 0.5, 2.0).size());
  }

  @Test
  public void sublistTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.sublist(objectList, 2.0, 2.0).size());
  }

  @Test
  public void sublistTest3() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, doubleMixedJavaTimeFEELLib.sublist(objectList, 2.0).size());
  }

  @Test
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void substringTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substring(",", 2.0, 2.0));
  }

  @Test
  public void substringTest2() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substring(",", 2.0));
  }

  @Test
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void sumTest2() {
    // Arrange
    DoubleMixedJavaTimeFEELLib doubleMixedJavaTimeFEELLib = new DoubleMixedJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(doubleMixedJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((LocalDate) null));
  }

  @Test
  public void timeTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time(","));
  }

  @Test
  public void timeTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((OffsetTime) null));
  }

  @Test
  public void timeTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).toDate(",");
  }

  @Test
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).toTime(",");
  }

  @Test
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new DoubleMixedJavaTimeFEELLib()).upperCase(","));
  }

  @Test
  public void weekdayTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test
  public void weekdayTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).weekday((ZonedDateTime) null));
  }

  @Test
  public void yearTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).year((ZonedDateTime) null));
  }

  @Test
  public void yearTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test
  public void yearsAndMonthsDurationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (ZonedDateTime) null));
  }

  @Test
  public void yearsAndMonthsDurationTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (ZonedDateTime) null));
  }

  @Test
  public void yearsAndMonthsDurationTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (LocalDate) null));
  }

  @Test
  public void yearsAndMonthsDurationTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (LocalDate) null));
  }
}

