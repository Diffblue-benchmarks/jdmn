package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import org.junit.Test;

public class DefaultFEELLibDiffblueTest {
  @Test
  public void testConstructor() {
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

  @Test
  public void testConstructor2() {
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

  @Test
  public void testConstructor3() {
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

  @Test
  public void testString() {
    // Arrange
    BigDecimal from = new BigDecimal("10000");

    // Act and Assert
    assertEquals("10000", (new DefaultFEELLib()).string(from));
  }

  @Test
  public void testString2() {
    // Arrange
    BigDecimal from = new BigDecimal("120000");

    // Act and Assert
    assertEquals("120000", (new DefaultFEELLib()).string(from));
  }

  @Test
  public void testString3() {
    // Arrange
    BigDecimal from = new BigDecimal("18");

    // Act and Assert
    assertEquals("18", (new DefaultFEELLib()).string(from));
  }
}

