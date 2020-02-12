package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DefaultFEELLibDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void absTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).abs(null));
  }

  @Test(timeout=10000)
  public void anyTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).any("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void modeTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mode((List) null));
  }

  @Test(timeout=10000)
  public void evenTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).even(null));
  }

  @Test(timeout=10000)
  public void oddTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).odd(null));
  }

  @Test(timeout=10000)
  public void indexOfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DefaultFEELLib()).indexOf(null, "foo").size());
  }

  @Test(timeout=10000)
  public void substringTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).substring("foo", null));
  }

  @Test(timeout=10000)
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).ceiling(null));
  }

  @Test(timeout=10000)
  public void toDateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).toDate("foo");
  }

  @Test(timeout=10000)
  public void substringAfterTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultFEELLib()).substringAfter("foo", "foo"));
  }

  @Test(timeout=10000)
  public void stringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DefaultFEELLib()).string("foo"));
  }

  @Test(timeout=10000)
  public void timeTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).time("foo"));
  }

  @Test(timeout=10000)
  public void allTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).all("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DefaultFEELLib()).contains("foo", "foo"));
  }

  @Test(timeout=10000)
  public void substringTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).substring("foo", null, null));
  }

  @Test(timeout=10000)
  public void numberTest7() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(""));
  }

  @Test(timeout=10000)
  public void numberTest6() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number("foo"));
  }

  @Test(timeout=10000)
  public void orTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).or((List) null));
  }

  @Test(timeout=10000)
  public void expTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).exp(null));
  }

  @Test(timeout=10000)
  public void unionTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).union("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void allTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).all((List) null));
  }

  @Test(timeout=10000)
  public void matchesTest2() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DefaultFEELLib()).matches("foo", "foo"));
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).remove(null, "foo");
  }

  @Test(timeout=10000)
  public void notTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new DefaultFEELLib()).not(Boolean.valueOf(true)));
  }

  @Test(timeout=10000)
  public void listContainsTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).listContains(null, "foo"));
  }

  @Test(timeout=10000)
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DefaultFEELLib()).startsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).median("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void anyTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).any((List) null));
  }

  @Test(timeout=10000)
  public void stddevTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).stddev("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).stddev((List) null));
  }

  @Test(timeout=10000)
  public void substringBeforeTest() {
    // Arrange, Act and Assert
    assertEquals("", (new DefaultFEELLib()).substringBefore("foo", "foo"));
  }

  @Test(timeout=10000)
  public void andTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).and("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void toTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).toTime("foo");
  }

  @Test(timeout=10000)
  public void dateTest3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date("foo"));
  }

  @Test(timeout=10000)
  public void dateTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date(""));
  }

  @Test(timeout=10000)
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DefaultFEELLib()).lowerCase("foo"));
  }

  @Test(timeout=10000)
  public void flattenTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).flatten(null));
  }

  @Test(timeout=10000)
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).sqrt(null));
  }

  @Test(timeout=10000)
  public void durationTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).duration(""));
  }

  @Test(timeout=10000)
  public void durationTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).duration("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DefaultFEELLib actualDefaultFEELLib = new DefaultFEELLib();

    // Assert
    assertTrue(actualDefaultFEELLib.stringType instanceof com.gs.dmn.feel.lib.type.string.DefaultStringType);
    assertTrue(actualDefaultFEELLib.numericType instanceof com.gs.dmn.feel.lib.type.numeric.DefaultNumericType);
    assertTrue(actualDefaultFEELLib.timeType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultTimeType);
    assertTrue(actualDefaultFEELLib.dateTimeType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDateTimeType);
    assertTrue(actualDefaultFEELLib.listType instanceof com.gs.dmn.feel.lib.type.list.DefaultListType);
    assertTrue(actualDefaultFEELLib.durationType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDurationType);
    assertTrue(actualDefaultFEELLib.dateType instanceof com.gs.dmn.feel.lib.type.time.xml.DefaultDateType);
    assertTrue(actualDefaultFEELLib.booleanType instanceof com.gs.dmn.feel.lib.type.logic.DefaultBooleanType);
    assertTrue(actualDefaultFEELLib.contextType instanceof com.gs.dmn.feel.lib.type.context.DefaultContextType);
  }

  @Test(timeout=10000)
  public void minTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).min((List) null));
  }

  @Test(timeout=10000)
  public void countTest() {
    // Arrange and Act
    BigDecimal actualCountResult = (new DefaultFEELLib()).count(null);

    // Assert
    assertSame(actualCountResult.ZERO, actualCountResult);
  }

  @Test(timeout=10000)
  public void replaceTest3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).replace("foo", "foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).median((List) null));
  }

  @Test(timeout=10000)
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).dateAndTime("foo"));
  }

  @Test(timeout=10000)
  public void maxTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).max("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void distinctValuesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DefaultFEELLib()).distinctValues(null).size());
  }

  @Test(timeout=10000)
  public void concatenateTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new DefaultFEELLib()).concatenate("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void floorTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).floor(null));
  }

  @Test(timeout=10000)
  public void numberTest5() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number(" ", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest4() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number("foo", " ", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest3() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void numberTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number("foo", ".", "."));
  }

  @Test(timeout=10000)
  public void numberTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).number("foo", " ", "."));
  }

  @Test(timeout=10000)
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).intModulo(null, null));
  }

  @Test(timeout=10000)
  public void sumTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).sum("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void matchesTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).matches("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("FOO", (new DefaultFEELLib()).upperCase("foo"));
  }

  @Test(timeout=10000)
  public void minTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).min("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void productTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).product("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void orTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).or("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DefaultFEELLib()).replace("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).replace("foo", "", "foo"));
  }

  @Test(timeout=10000)
  public void reverseTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DefaultFEELLib()).reverse(null).size());
  }

  @Test(timeout=10000)
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new DefaultFEELLib()).endsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void appendTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new DefaultFEELLib()).append(null, "foo", "foo", "foo").size());
  }

  @Test(timeout=10000)
  public void meanTest2() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mean((List) null));
  }

  @Test(timeout=10000)
  public void splitTest() {
    // Arrange, Act and Assert
    assertEquals(2, (new DefaultFEELLib()).split("foo", "foo").size());
  }

  @Test(timeout=10000)
  public void productTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).product((List) null));
  }

  @Test(timeout=10000)
  public void dateTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).date(null, null, null));
  }

  @Test(timeout=10000)
  public void moduloTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).modulo(null, null));
  }

  @Test(timeout=10000)
  public void andTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).and((List) null));
  }

  @Test(timeout=10000)
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mean("foo", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void decimalTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).decimal(null, null));
  }

  @Test(timeout=10000)
  public void maxTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).max((List) null));
  }

  @Test(timeout=10000)
  public void logTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).log(null));
  }

  @Test(timeout=10000)
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).sum((List) null));
  }

  @Test(timeout=10000)
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultFEELLib()).mode("foo", "foo", "foo"));
  }
}

