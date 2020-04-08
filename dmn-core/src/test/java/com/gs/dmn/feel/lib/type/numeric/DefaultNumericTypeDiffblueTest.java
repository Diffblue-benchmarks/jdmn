package com.gs.dmn.feel.lib.type.numeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultNumericTypeDiffblueTest {
  @Test
  public void testNumericAdd() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertEquals("2", defaultNumericType.numericAdd(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testNumericSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act
    BigDecimal actualNumericSubtractResult = defaultNumericType.numericSubtract(BigDecimal.valueOf(1L),
        BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualNumericSubtractResult.ZERO, actualNumericSubtractResult);
    assertEquals("0", actualNumericSubtractResult.toString());
  }

  @Test
  public void testNumericMultiply() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act
    BigDecimal actualNumericMultiplyResult = defaultNumericType.numericMultiply(BigDecimal.valueOf(1L),
        BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualNumericMultiplyResult.ONE, actualNumericMultiplyResult);
    assertEquals("1", actualNumericMultiplyResult.toString());
  }

  @Test
  public void testNumericDivide() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act
    BigDecimal actualNumericDivideResult = defaultNumericType.numericDivide(BigDecimal.valueOf(1L),
        BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualNumericDivideResult.ONE, actualNumericDivideResult);
    assertEquals("1", actualNumericDivideResult.toString());
  }

  @Test
  public void testNumericUnaryMinus() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertEquals("-1", defaultNumericType.numericUnaryMinus(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testNumericExponentiation() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertEquals("-1",
        defaultNumericType.numericExponentiation(BigDecimal.valueOf(-1L), BigDecimal.valueOf(-1L)).toString());
  }

  @Test
  public void testNumericExponentiation2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act
    BigDecimal actualNumericExponentiationResult = defaultNumericType.numericExponentiation(BigDecimal.valueOf(1L),
        BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualNumericExponentiationResult.ONE, actualNumericExponentiationResult);
    assertEquals("1", actualNumericExponentiationResult.toString());
  }

  @Test
  public void testNumericExponentiation3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act
    BigDecimal actualNumericExponentiationResult = defaultNumericType.numericExponentiation(BigDecimal.valueOf(0L),
        BigDecimal.valueOf(0L));

    // Assert
    assertSame(actualNumericExponentiationResult.ONE, actualNumericExponentiationResult);
    assertEquals("1", actualNumericExponentiationResult.toString());
  }

  @Test
  public void testNumericExponentiation4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(defaultNumericType.numericExponentiation(BigDecimal.valueOf(1L), -2147483648));
  }

  @Test
  public void testNumericExponentiation5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act
    BigDecimal actualNumericExponentiationResult = defaultNumericType.numericExponentiation(BigDecimal.valueOf(1L), 1);

    // Assert
    assertSame(actualNumericExponentiationResult.ONE, actualNumericExponentiationResult);
    assertEquals("1", actualNumericExponentiationResult.toString());
  }

  @Test
  public void testNumericExponentiation6() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(defaultNumericType.numericExponentiation(BigDecimal.valueOf(0L), 1));
  }

  @Test
  public void testNumericEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertTrue(defaultNumericType.numericEqual(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void testNumericNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertFalse(defaultNumericType.numericNotEqual(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void testNumericLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertFalse(defaultNumericType.numericLessThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void testNumericGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertFalse(defaultNumericType.numericGreaterThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void testNumericLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertTrue(defaultNumericType.numericLessEqualThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void testNumericGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertTrue(defaultNumericType.numericGreaterEqualThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }
}

