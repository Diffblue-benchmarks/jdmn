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
  public void numericAddTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertEquals("2", defaultNumericType.numericAdd(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void numericDivideTest() {
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
  public void numericEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertTrue(defaultNumericType.numericEqual(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void numericExponentiationTest() {
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
  public void numericExponentiationTest2() {
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
  public void numericExponentiationTest3() {
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
  public void numericExponentiationTest4() {
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
  public void numericExponentiationTest5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(defaultNumericType.numericExponentiation(BigDecimal.valueOf(0L), 1));
  }

  @Test
  public void numericExponentiationTest6() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(defaultNumericType.numericExponentiation(BigDecimal.valueOf(1L), -2147483648));
  }

  @Test
  public void numericGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertTrue(defaultNumericType.numericGreaterEqualThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void numericGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertFalse(defaultNumericType.numericGreaterThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void numericLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertTrue(defaultNumericType.numericLessEqualThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void numericLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertFalse(defaultNumericType.numericLessThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void numericMultiplyTest() {
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
  public void numericNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertFalse(defaultNumericType.numericNotEqual(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)));
  }

  @Test
  public void numericSubtractTest() {
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
  public void numericUnaryMinusTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultNumericType defaultNumericType = new DefaultNumericType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertEquals("-1", defaultNumericType.numericUnaryMinus(BigDecimal.valueOf(1L)).toString());
  }
}

