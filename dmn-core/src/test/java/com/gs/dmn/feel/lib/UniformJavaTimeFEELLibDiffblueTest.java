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

public class UniformJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualAbsResult = (new UniformJavaTimeFEELLib()).abs(number);

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void allTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.all(objectList));
  }

  @Test
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test
  public void andTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.and(objectList));
  }

  @Test
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test
  public void anyTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.any(objectList));
  }

  @Test
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test
  public void appendTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(4, uniformJavaTimeFEELLib.append(objectList, "foo", "foo", "foo").size());
  }

  @Test
  public void ceilingTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualCeilingResult = (new UniformJavaTimeFEELLib()).ceiling(number);

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test
  public void constructorTest() {
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
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).contains(",", ","));
  }

  @Test
  public void countTest() {
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
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(","));
  }

  @Test
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date(""));
  }

  @Test
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date(","));
  }

  @Test
  public void decimalTest() {
    // Arrange
    BigDecimal n = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new UniformJavaTimeFEELLib()).decimal(n, n).toString());
  }

  @Test
  public void distinctValuesTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.distinctValues(objectList).size());
  }

  @Test
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).duration(""));
  }

  @Test
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).duration(","));
  }

  @Test
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).endsWith(",", ","));
  }

  @Test
  public void evenTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertFalse((new UniformJavaTimeFEELLib()).even(number));
  }

  @Test
  public void expTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1406L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).exp(number));
  }

  @Test
  public void expTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("2.718281828459045", (new UniformJavaTimeFEELLib()).exp(number).toString());
  }

  @Test
  public void flattenTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.flatten(objectList).size());
  }

  @Test
  public void floorTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualFloorResult = (new UniformJavaTimeFEELLib()).floor(number);

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void indexOfTest() {
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
  public void insertBeforeTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, uniformJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(-1L), ",").size());
  }

  @Test
  public void insertBeforeTest2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1406L), ",").size());
  }

  @Test
  public void insertBeforeTest3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(2, uniformJavaTimeFEELLib.insertBefore(objectList, BigDecimal.valueOf(1L), ",").size());
  }

  @Test
  public void intModuloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).intModulo(dividend, dividend));
  }

  @Test
  public void intModuloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0", (new UniformJavaTimeFEELLib()).intModulo(dividend, dividend).toString());
  }

  @Test
  public void listContainsTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(uniformJavaTimeFEELLib.listContains(objectList, "foo"));
  }

  @Test
  public void logTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).log(number));
  }

  @Test
  public void logTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("0.0", (new UniformJavaTimeFEELLib()).log(number).toString());
  }

  @Test
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).lowerCase(","));
  }

  @Test
  public void makeZonedDateTimeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).makeZonedDateTime(""));
  }

  @Test
  public void makeZonedDateTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).makeZonedDateTime(","));
  }

  @Test
  public void matchesTest() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).matches(",", ",", ""));
  }

  @Test
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).matches(",", ",", ","));
  }

  @Test
  public void matchesTest3() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).matches(",", ","));
  }

  @Test
  public void maxTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.max(objectList));
  }

  @Test
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test
  public void meanTest2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.mean(objectList));
  }

  @Test
  public void medianTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.median(objectList));
  }

  @Test
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test
  public void minTest2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.min(objectList));
  }

  @Test
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }

  @Test
  public void modeTest2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(0L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).modulo(dividend, dividend));
  }

  @Test
  public void moduloTest2() {
    // Arrange
    BigDecimal dividend = BigDecimal.valueOf(1L);

    // Act
    BigDecimal actualModuloResult = (new UniformJavaTimeFEELLib()).modulo(dividend, dividend);

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void notTest() {
    // Arrange, Act and Assert
    assertFalse((new UniformJavaTimeFEELLib()).not(true));
  }

  @Test
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", "."));
  }

  @Test
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", "groupingSeparator", ","));
  }

  @Test
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", " "));
  }

  @Test
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ",", ","));
  }

  @Test
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", ".", ","));
  }

  @Test
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(",", " ", ","));
  }

  @Test
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(","));
  }

  @Test
  public void oddTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).odd(number));
  }

  @Test
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test
  public void orTest2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.or(objectList));
  }

  @Test
  public void productTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.product(objectList));
  }

  @Test
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test
  public void removeTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    uniformJavaTimeFEELLib.remove(objectList, "foo");
  }

  @Test
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).replace(",", "", ","));
  }

  @Test
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).replace(",", ",", ","));
  }

  @Test
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).replace(",", ",", ",", ","));
  }

  @Test
  public void reverseTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.reverse(objectList).size());
  }

  @Test
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new UniformJavaTimeFEELLib()).split(",", ",").size());
  }

  @Test
  public void sqrtTest() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(-1L);

    // Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sqrt(number));
  }

  @Test
  public void sqrtTest2() {
    // Arrange
    BigDecimal number = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals("1.0", (new UniformJavaTimeFEELLib()).sqrt(number).toString());
  }

  @Test
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeFEELLib()).startsWith(",", ","));
  }

  @Test
  public void stddevTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.stddev(objectList));
  }

  @Test
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test
  public void stringLengthTest() {
    // Arrange and Act
    BigDecimal actualStringLengthResult = (new UniformJavaTimeFEELLib()).stringLength(",");

    // Assert
    assertSame(actualStringLengthResult.ONE, actualStringLengthResult);
    assertEquals("1", actualStringLengthResult.toString());
  }

  @Test
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).string(","));
  }

  @Test
  public void sublistTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0,
        uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void sublistTest2() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0,
        uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1406L), BigDecimal.valueOf(1406L)).size());
  }

  @Test
  public void sublistTest3() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void sublistTest4() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)).size());
  }

  @Test
  public void sublistTest5() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(-1L)).size());
  }

  @Test
  public void sublistTest6() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(0, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1406L)).size());
  }

  @Test
  public void sublistTest7() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, uniformJavaTimeFEELLib.sublist(objectList, BigDecimal.valueOf(1L)).size());
  }

  @Test
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new UniformJavaTimeFEELLib()).substringAfter(",", ","));
  }

  @Test
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new UniformJavaTimeFEELLib()).substringBefore(",", ","));
  }

  @Test
  public void substringTest() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).substring(",", startPosition, startPosition));
  }

  @Test
  public void substringTest2() {
    // Arrange
    BigDecimal startPosition = BigDecimal.valueOf(1L);

    // Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).substring(",", startPosition));
  }

  @Test
  public void sumTest() {
    // Arrange
    UniformJavaTimeFEELLib uniformJavaTimeFEELLib = new UniformJavaTimeFEELLib();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(uniformJavaTimeFEELLib.sum(objectList));
  }

  @Test
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).time(","));
  }

  @Test
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).toDate(",");
  }

  @Test
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).toTime(",");
  }

  @Test
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals(",", (new UniformJavaTimeFEELLib()).upperCase(","));
  }
}

