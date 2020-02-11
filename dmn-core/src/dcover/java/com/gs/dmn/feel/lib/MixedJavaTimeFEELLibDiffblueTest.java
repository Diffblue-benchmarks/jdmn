package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MixedJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void absTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).abs(null));
  }

  @Test(timeout=10000)
  public void weekdayTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test(timeout=10000)
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void modeTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mode((List) null));
  }

  @Test(timeout=10000)
  public void evenTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).even(null));
  }

  @Test(timeout=10000)
  public void oddTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).odd(null));
  }

  @Test(timeout=10000)
  public void indexOfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MixedJavaTimeFEELLib()).indexOf(null, "foo").size());
  }

  @Test(timeout=10000)
  public void substringTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).substring("foo", null));
  }

  @Test(timeout=10000)
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).ceiling(null));
  }

  @Test(timeout=10000)
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new MixedJavaTimeFEELLib()).substringAfter("foo", "foo"));
  }

  @Test(timeout=10000)
  public void monthTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).month((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new MixedJavaTimeFEELLib()).string("foo"));
  }

  @Test(timeout=10000)
  public void dayTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).day((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void dateTest4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date("foo"));
  }

  @Test(timeout=10000)
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new MixedJavaTimeFEELLib()).contains("foo", "foo"));
  }

  @Test(timeout=10000)
  public void timeTest4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime("foo"));
  }

  @Test(timeout=10000)
  public void substringTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).substring("foo", null, null));
  }

  @Test(timeout=10000)
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).toTime("foo");
  }

  @Test(timeout=10000)
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number("foo"));
  }

  @Test(timeout=10000)
  public void orTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).or((List) null));
  }

  @Test(timeout=10000)
  public void expTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).exp(null));
  }

  @Test(timeout=10000)
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest4() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (LocalDate) null));
  }

  @Test(timeout=10000)
  public void allTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).all((List) null));
  }

  @Test(timeout=10000)
  public void yearTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).year((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void monthTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test(timeout=10000)
  public void dateTest3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date((LocalDate) null));
  }

  @Test(timeout=10000)
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new MixedJavaTimeFEELLib()).matches("foo", "foo"));
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).remove(null, "foo");
  }

  @Test(timeout=10000)
  public void notTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new MixedJavaTimeFEELLib()).not(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void listContainsTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).listContains(null, "foo"));
  }

  @Test(timeout=10000)
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new MixedJavaTimeFEELLib()).startsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).toDate("foo");
  }

  @Test(timeout=10000)
  public void anyTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).any((List) null));
  }

  @Test(timeout=10000)
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).stddev((List) null));
  }

  @Test(timeout=10000)
  public void yearTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test(timeout=10000)
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new MixedJavaTimeFEELLib()).substringBefore("foo", "foo"));
  }

  @Test(timeout=10000)
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new MixedJavaTimeFEELLib()).lowerCase("foo"));
  }

  @Test(timeout=10000)
  public void flattenTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).flatten(null));
  }

  @Test(timeout=10000)
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sqrt(null));
  }

  @Test(timeout=10000)
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).duration("foo"));
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void minTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).min((List) null));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime("foo", null));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (LocalDate) null));
  }

  @Test(timeout=10000)
  public void countTest() {
    // Arrange and Act
    BigDecimal actualCountResult = (new MixedJavaTimeFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).replace("foo", "foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).median((List) null));
  }

  @Test(timeout=10000)
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void distinctValuesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MixedJavaTimeFEELLib()).distinctValues(null).size());
  }

  @Test(timeout=10000)
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new MixedJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void floorTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).floor(null));
  }

  @Test(timeout=10000)
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).number("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date(null, null, null));
  }

  @Test(timeout=10000)
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).intModulo(null, null));
  }

  @Test(timeout=10000)
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).dateAndTime((LocalDate) null, null));
  }

  @Test(timeout=10000)
  public void matchesTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).matches("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("FOO", (new MixedJavaTimeFEELLib()).upperCase("foo"));
  }

  @Test(timeout=10000)
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void timeTest3() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time((OffsetTime) null));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new MixedJavaTimeFEELLib()).replace("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void reverseTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new MixedJavaTimeFEELLib()).reverse(null).size());
  }

  @Test(timeout=10000)
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new MixedJavaTimeFEELLib()).endsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void appendTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new MixedJavaTimeFEELLib()).append(null, "foo", "foo", "foo").size());
  }

  @Test(timeout=10000)
  public void meanTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mean((List) null));
  }

  @Test(timeout=10000)
  public void dayTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test(timeout=10000)
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new MixedJavaTimeFEELLib()).split("foo", "foo").size());
  }

  @Test(timeout=10000)
  public void productTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).product((List) null));
  }

  @Test(timeout=10000)
  public void weekdayTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).weekday((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void timeTest2() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time("foo"));
  }

  @Test(timeout=10000)
  public void moduloTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).modulo(null, null));
  }

  @Test(timeout=10000)
  public void andTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).and((List) null));
  }

  @Test(timeout=10000)
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).time((LocalDate) null));
  }

  @Test(timeout=10000)
  public void decimalTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).decimal(null, null));
  }

  @Test(timeout=10000)
  public void maxTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).max((List) null));
  }

  @Test(timeout=10000)
  public void logTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).log(null));
  }

  @Test(timeout=10000)
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).sum((List) null));
  }

  @Test(timeout=10000)
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }
}

