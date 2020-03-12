package com.gs.dmn.feel.lib.type.numeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DoubleNumericTypeDiffblueTest {
  @Test
  public void numericAddTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(20.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericAdd(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void numericDivideTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(1.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericDivide(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void numericEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericEqual(10.0,
        10.0));
  }

  @Test
  public void numericEqualTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericEqual(0.5, 10.0));
  }

  @Test
  public void numericExponentiationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(1.0E10, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericExponentiation(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void numericGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(0.5, 10.0));
  }

  @Test
  public void numericGreaterEqualThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(10.0, 10.0));
  }

  @Test
  public void numericGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(10.0, 10.0));
  }

  @Test
  public void numericGreaterThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(Double.NaN, 10.0));
  }

  @Test
  public void numericLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(Double.NaN, 10.0));
  }

  @Test
  public void numericLessEqualThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(10.0, 10.0));
  }

  @Test
  public void numericLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(10.0, 10.0));
  }

  @Test
  public void numericLessThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(0.5, 10.0));
  }

  @Test
  public void numericMultiplyTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(100.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericMultiply(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void numericNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericNotEqual(10.0, 10.0));
  }

  @Test
  public void numericSubtractTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(0.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericSubtract(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void numericUnaryMinusTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(-10.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericUnaryMinus(10.0).doubleValue(), 0.0);
  }
}

