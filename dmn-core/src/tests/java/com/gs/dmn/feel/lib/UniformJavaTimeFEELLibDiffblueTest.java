package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UniformJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).toTime("foo");
  }

  @Test(timeout=10000)
  public void absTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).abs(null));
  }

  @Test(timeout=10000)
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void modeTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mode((List) null));
  }

  @Test(timeout=10000)
  public void evenTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).even(null));
  }

  @Test(timeout=10000)
  public void oddTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).odd(null));
  }

  @Test(timeout=10000)
  public void indexOfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).indexOf(null, "foo").size());
  }

  @Test(timeout=10000)
  public void substringTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).substring("foo", null));
  }

  @Test(timeout=10000)
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).ceiling(null));
  }

  @Test(timeout=10000)
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new UniformJavaTimeFEELLib()).substringAfter("foo", "foo"));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime(null, null));
  }

  @Test(timeout=10000)
  public void monthTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).month(null));
  }

  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new UniformJavaTimeFEELLib()).string("foo"));
  }

  @Test(timeout=10000)
  public void dayTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).day(null));
  }

  @Test(timeout=10000)
  public void makeZonedDateTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).makeZonedDateTime(""));
  }

  @Test(timeout=10000)
  public void makeZonedDateTimeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).makeZonedDateTime("foo"));
  }

  @Test(timeout=10000)
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new UniformJavaTimeFEELLib()).contains("foo", "foo"));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).dateAndTime("foo"));
  }

  @Test(timeout=10000)
  public void substringTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).substring("foo", null, null));
  }

  @Test(timeout=10000)
  public void timeTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).time("foo"));
  }

  @Test(timeout=10000)
  public void numberTest10() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo"));
  }

  @Test(timeout=10000)
  public void numberTest9() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(""));
  }

  @Test(timeout=10000)
  public void orTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).or((List) null));
  }

  @Test(timeout=10000)
  public void expTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).exp(null));
  }

  @Test(timeout=10000)
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).toDate("foo");
  }

  @Test(timeout=10000)
  public void dateTest3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void allTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).all((List) null));
  }

  @Test(timeout=10000)
  public void yearTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).year(null));
  }

  @Test(timeout=10000)
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new UniformJavaTimeFEELLib()).matches("foo", "foo"));
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).remove(null, "foo");
  }

  @Test(timeout=10000)
  public void notTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new UniformJavaTimeFEELLib()).not(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).time((ZonedDateTime) null));
  }

  @Test(timeout=10000)
  public void listContainsTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).listContains(null, "foo"));
  }

  @Test(timeout=10000)
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new UniformJavaTimeFEELLib()).startsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void anyTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).any((List) null));
  }

  @Test(timeout=10000)
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).stddev((List) null));
  }

  @Test(timeout=10000)
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new UniformJavaTimeFEELLib()).substringBefore("foo", "foo"));
  }

  @Test(timeout=10000)
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new UniformJavaTimeFEELLib()).lowerCase("foo"));
  }

  @Test(timeout=10000)
  public void flattenTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).flatten(null));
  }

  @Test(timeout=10000)
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sqrt(null));
  }

  @Test(timeout=10000)
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).duration(""));
  }

  @Test(timeout=10000)
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).duration("foo"));
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void minTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).min((List) null));
  }

  @Test(timeout=10000)
  public void countTest() {
    // Arrange and Act
    BigDecimal actualCountResult = (new UniformJavaTimeFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
  }

  @Test(timeout=10000)
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date("foo"));
  }

  @Test(timeout=10000)
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).replace("foo", "foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).median((List) null));
  }

  @Test(timeout=10000)
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void distinctValuesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).distinctValues(null).size());
  }

  @Test(timeout=10000)
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new UniformJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void floorTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).floor(null));
  }

  @Test(timeout=10000)
  public void numberTest8() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo", ".", ","));
  }

  @Test(timeout=10000)
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(".", ".", ","));
  }

  @Test(timeout=10000)
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo", " ", ","));
  }

  @Test(timeout=10000)
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number(" ", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo", " ", "."));
  }

  @Test(timeout=10000)
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo", ",", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).number("foo", " ", "foo"));
  }

  @Test(timeout=10000)
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).intModulo(null, null));
  }

  @Test(timeout=10000)
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void matchesTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).matches("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("FOO", (new UniformJavaTimeFEELLib()).upperCase("foo"));
  }

  @Test(timeout=10000)
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void yearsAndMonthsDurationTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).yearsAndMonthsDuration(null, null));
  }

  @Test(timeout=10000)
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new UniformJavaTimeFEELLib()).replace("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void reverseTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new UniformJavaTimeFEELLib()).reverse(null).size());
  }

  @Test(timeout=10000)
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new UniformJavaTimeFEELLib()).endsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void appendTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new UniformJavaTimeFEELLib()).append(null, "foo", "foo", "foo").size());
  }

  @Test(timeout=10000)
  public void meanTest2() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mean((List) null));
  }

  @Test(timeout=10000)
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new UniformJavaTimeFEELLib()).split("foo", "foo").size());
  }

  @Test(timeout=10000)
  public void productTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).product((List) null));
  }

  @Test(timeout=10000)
  public void weekdayTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).weekday(null));
  }

  @Test(timeout=10000)
  public void moduloTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).modulo(null, null));
  }

  @Test(timeout=10000)
  public void andTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).and((List) null));
  }

  @Test(timeout=10000)
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void decimalTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).decimal(null, null));
  }

  @Test(timeout=10000)
  public void maxTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).max((List) null));
  }

  @Test(timeout=10000)
  public void logTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).log(null));
  }

  @Test(timeout=10000)
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).date(null, null, null));
  }

  @Test(timeout=10000)
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).sum((List) null));
  }

  @Test(timeout=10000)
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }
}

