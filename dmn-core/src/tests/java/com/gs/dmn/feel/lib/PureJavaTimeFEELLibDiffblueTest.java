package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PureJavaTimeFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void absTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).abs(null));
  }

  @Test(timeout=10000)
  public void weekdayTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).weekday((LocalDate) null));
  }

  @Test(timeout=10000)
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).any("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void modeTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mode((List) null));
  }

  @Test(timeout=10000)
  public void evenTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).even(null));
  }

  @Test(timeout=10000)
  public void oddTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).odd(null));
  }

  @Test(timeout=10000)
  public void indexOfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PureJavaTimeFEELLib()).indexOf(null, "foo").size());
  }

  @Test(timeout=10000)
  public void substringTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).substring("foo", null));
  }

  @Test(timeout=10000)
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).ceiling(null));
  }

  @Test(timeout=10000)
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new PureJavaTimeFEELLib()).substringAfter("foo", "foo"));
  }

  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new PureJavaTimeFEELLib()).string("foo"));
  }

  @Test(timeout=10000)
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).date("foo"));
  }

  @Test(timeout=10000)
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).all("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new PureJavaTimeFEELLib()).contains("foo", "foo"));
  }

  @Test(timeout=10000)
  public void substringTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).substring("foo", null, null));
  }

  @Test(timeout=10000)
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(""));
  }

  @Test(timeout=10000)
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number("foo"));
  }

  @Test(timeout=10000)
  public void orTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).or((List) null));
  }

  @Test(timeout=10000)
  public void expTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).exp(null));
  }

  @Test(timeout=10000)
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new PureJavaTimeFEELLib()).union("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void allTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).all((List) null));
  }

  @Test(timeout=10000)
  public void monthTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).month((LocalDate) null));
  }

  @Test(timeout=10000)
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).time("foo"));
  }

  @Test(timeout=10000)
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new PureJavaTimeFEELLib()).matches("foo", "foo"));
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new PureJavaTimeFEELLib()).remove(null, "foo");
  }

  @Test(timeout=10000)
  public void notTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new PureJavaTimeFEELLib()).not(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void listContainsTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).listContains(null, "foo"));
  }

  @Test(timeout=10000)
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new PureJavaTimeFEELLib()).startsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).median("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void toDateTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).toDate("foo"));
  }

  @Test(timeout=10000)
  public void anyTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).any((List) null));
  }

  @Test(timeout=10000)
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).stddev((List) null));
  }

  @Test(timeout=10000)
  public void yearTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).year((LocalDate) null));
  }

  @Test(timeout=10000)
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new PureJavaTimeFEELLib()).substringBefore("foo", "foo"));
  }

  @Test(timeout=10000)
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).duration(""));
  }

  @Test(timeout=10000)
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).duration("foo"));
  }

  @Test(timeout=10000)
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).and("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new PureJavaTimeFEELLib()).lowerCase("foo"));
  }

  @Test(timeout=10000)
  public void flattenTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).flatten(null));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime("foo"));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).dateAndTime(""));
  }

  @Test(timeout=10000)
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sqrt(null));
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void minTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).min((List) null));
  }

  @Test(timeout=10000)
  public void countTest() {
    // Arrange and Act
    BigDecimal actualCountResult = (new PureJavaTimeFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
  }

  @Test(timeout=10000)
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).replace("foo", "foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).median((List) null));
  }

  @Test(timeout=10000)
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).max("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void distinctValuesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PureJavaTimeFEELLib()).distinctValues(null).size());
  }

  @Test(timeout=10000)
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new PureJavaTimeFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void floorTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).floor(null));
  }

  @Test(timeout=10000)
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number("foo", " ", "."));
  }

  @Test(timeout=10000)
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number("foo", ".", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number("foo", " ", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).number(" ", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).intModulo(null, null));
  }

  @Test(timeout=10000)
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void matchesTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).matches("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("FOO", (new PureJavaTimeFEELLib()).upperCase("foo"));
  }

  @Test(timeout=10000)
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).min("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).product("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).or("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", (new PureJavaTimeFEELLib()).replace("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).replace("foo", "", "foo"));
  }

  @Test(timeout=10000)
  public void reverseTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PureJavaTimeFEELLib()).reverse(null).size());
  }

  @Test(timeout=10000)
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new PureJavaTimeFEELLib()).endsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void appendTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new PureJavaTimeFEELLib()).append(null, "foo", "foo", "foo").size());
  }

  @Test(timeout=10000)
  public void meanTest2() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mean((List) null));
  }

  @Test(timeout=10000)
  public void dayTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).day((LocalDate) null));
  }

  @Test(timeout=10000)
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new PureJavaTimeFEELLib()).split("foo", "foo").size());
  }

  @Test(timeout=10000)
  public void productTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).product((List) null));
  }

  @Test(timeout=10000)
  public void moduloTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).modulo(null, null));
  }

  @Test(timeout=10000)
  public void andTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).and((List) null));
  }

  @Test(timeout=10000)
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void decimalTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).decimal(null, null));
  }

  @Test(timeout=10000)
  public void maxTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).max((List) null));
  }

  @Test(timeout=10000)
  public void logTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).log(null));
  }

  @Test(timeout=10000)
  public void toTimeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).toTime("foo"));
  }

  @Test(timeout=10000)
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).sum((List) null));
  }

  @Test(timeout=10000)
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELLib()).mode("foo", "foo", "foo"));
  }
}

