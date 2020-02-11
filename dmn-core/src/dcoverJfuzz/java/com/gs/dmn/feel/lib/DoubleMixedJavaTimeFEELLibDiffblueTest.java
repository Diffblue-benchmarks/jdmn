package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DoubleMixedJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void logTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(2.302585092994046), (new DoubleMixedJavaTimeFEELLib()).log(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void dayTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).day((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(3.1622776601683795), (new DoubleMixedJavaTimeFEELLib()).sqrt(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void modeTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mode((List) null));
  }

  @Test(timeout=10000)
  public void yearTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test(timeout=10000)
  public void indexOfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleMixedJavaTimeFEELLib()).indexOf(null, "foo").size());
  }

  @Test(timeout=10000)
  public void stringLengthTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(3.0), (new DoubleMixedJavaTimeFEELLib()).stringLength("foo"));
  }

  @Test(timeout=10000)
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substringAfter("foo", "foo"));
  }

  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DoubleMixedJavaTimeFEELLib()).string("foo"));
  }

  @Test(timeout=10000)
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void dateTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date("foo"));
  }

  @Test(timeout=10000)
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void yearTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).year((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DoubleMixedJavaTimeFEELLib()).contains("foo", "foo"));
  }

  @Test(timeout=10000)
  public void expTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(22026.465794806718), (new DoubleMixedJavaTimeFEELLib()).exp(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void timeTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime("foo"));
  }

  @Test(timeout=10000)
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).sum((List) null));
  }

  @Test(timeout=10000)
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).max((List) null));
  }

  @Test(timeout=10000)
  public void minTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).median((List) null));
  }

  @Test(timeout=10000)
  public void substringTest2() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substring("foo", Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void sublistTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleMixedJavaTimeFEELLib()).sublist(null, Double.valueOf(10.0)).size());
  }

  @Test(timeout=10000)
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), (new DoubleMixedJavaTimeFEELLib()).ceiling(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).toTime("foo");
  }

  @Test(timeout=10000)
  public void orTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).or((List) null));
  }

  @Test(timeout=10000)
  public void decimalTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0),
        (new DoubleMixedJavaTimeFEELLib()).decimal(Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void insertBeforeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleMixedJavaTimeFEELLib()).insertBefore(null, Double.valueOf(10.0), "foo").size());
  }

  @Test(timeout=10000)
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void meanTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void weekdayTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).weekday((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void moduloTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(0.0),
        (new DoubleMixedJavaTimeFEELLib()).modulo(Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (LocalDate) null));
  }

  @Test(timeout=10000)
  public void monthTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test(timeout=10000)
  public void allTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).all((List) null));
  }

  @Test(timeout=10000)
  public void substringTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substring("foo", Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((LocalDate) null));
  }

  @Test(timeout=10000)
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DoubleMixedJavaTimeFEELLib()).matches("foo", "foo"));
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).remove(null, "foo");
  }

  @Test(timeout=10000)
  public void notTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new DoubleMixedJavaTimeFEELLib()).not(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void listContainsTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).listContains(null, "foo"));
  }

  @Test(timeout=10000)
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DoubleMixedJavaTimeFEELLib()).startsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).toDate("foo");
  }

  @Test(timeout=10000)
  public void anyTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).any((List) null));
  }

  @Test(timeout=10000)
  public void countTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(0.0), (new DoubleMixedJavaTimeFEELLib()).count(null));
  }

  @Test(timeout=10000)
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DoubleMixedJavaTimeFEELLib()).substringBefore("foo", "foo"));
  }

  @Test(timeout=10000)
  public void intModuloTest2() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(0.0),
        (new DoubleMixedJavaTimeFEELLib()).intModulo(Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).intModulo(Double.valueOf(10.0), Double.valueOf(0.5)));
  }

  @Test(timeout=10000)
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void productTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).product((List) null));
  }

  @Test(timeout=10000)
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DoubleMixedJavaTimeFEELLib()).lowerCase("foo"));
  }

  @Test(timeout=10000)
  public void flattenTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).flatten(null));
  }

  @Test(timeout=10000)
  public void absTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), (new DoubleMixedJavaTimeFEELLib()).abs(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).duration(""));
  }

  @Test(timeout=10000)
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).duration("foo"));
  }

  @Test(timeout=10000)
  public void maxTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime("foo", null));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (LocalDate) null));
  }

  @Test(timeout=10000)
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).stddev((List) null));
  }

  @Test(timeout=10000)
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void weekdayTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((LocalDate) null, (ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).replace("foo", "foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).min((List) null));
  }

  @Test(timeout=10000)
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mean((List) null));
  }

  @Test(timeout=10000)
  public void distinctValuesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleMixedJavaTimeFEELLib()).distinctValues(null).size());
  }

  @Test(timeout=10000)
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DoubleMixedJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).dateAndTime((LocalDate) null, null));
  }

  @Test(timeout=10000)
  public void monthTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).month((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void matchesTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).matches("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("FOO", (new DoubleMixedJavaTimeFEELLib()).upperCase("foo"));
  }

  @Test(timeout=10000)
  public void timeTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((OffsetTime) null));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).yearsAndMonthsDuration((ZonedDateTime) null, (ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void evenTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DoubleMixedJavaTimeFEELLib()).even(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DoubleMixedJavaTimeFEELLib()).replace("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).replace("foo", "", "foo"));
  }

  @Test(timeout=10000)
  public void floorTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), (new DoubleMixedJavaTimeFEELLib()).floor(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void reverseTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DoubleMixedJavaTimeFEELLib()).reverse(null).size());
  }

  @Test(timeout=10000)
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DoubleMixedJavaTimeFEELLib()).endsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void appendTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new DoubleMixedJavaTimeFEELLib()).append(null, "foo", "foo", "foo").size());
  }

  @Test(timeout=10000)
  public void sublistTest() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new DoubleMixedJavaTimeFEELLib()).sublist(null, Double.valueOf(10.0), Double.valueOf(10.0)).size());
  }

  @Test(timeout=10000)
  public void oddTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new DoubleMixedJavaTimeFEELLib()).odd(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new DoubleMixedJavaTimeFEELLib()).split("foo", "foo").size());
  }

  @Test(timeout=10000)
  public void timeTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time("foo"));
  }

  @Test(timeout=10000)
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void dayTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test(timeout=10000)
  public void andTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).and((List) null));
  }

  @Test(timeout=10000)
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).time((LocalDate) null));
  }

  @Test(timeout=10000)
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number("foo"));
  }

  @Test(timeout=10000)
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number("foo", " ", "."));
  }

  @Test(timeout=10000)
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number("foo", ".", "."));
  }

  @Test(timeout=10000)
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number("foo", " ", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).number(" ", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }
}

