package com.gs.dmn.feel.lib.type.numeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DoubleNumericTypeDiffblueTest {
  @Test
  public void testNumericAdd() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericAdd(null, 10.0));
  }

  @Test
  public void testNumericAdd2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericAdd(10.0, null));
  }

  @Test
  public void testNumericAdd3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(20.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericAdd(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void testNumericSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericSubtract(10.0, null));
  }

  @Test
  public void testNumericSubtract2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericSubtract(null, 10.0));
  }

  @Test
  public void testNumericSubtract3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(0.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericSubtract(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void testNumericMultiply() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericMultiply(10.0, null));
  }

  @Test
  public void testNumericMultiply2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericMultiply(null, 10.0));
  }

  @Test
  public void testNumericMultiply3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(100.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericMultiply(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void testNumericDivide() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(1.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericDivide(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void testNumericUnaryMinus() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(-10.0, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericUnaryMinus(10.0).doubleValue(), 0.0);
  }

  @Test
  public void testNumericUnaryMinus2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericUnaryMinus(null));
  }

  @Test
  public void testNumericExponentiation() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericExponentiation(null, 10.0));
  }

  @Test
  public void testNumericExponentiation2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals(1.0E10, (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericExponentiation(10.0, 10.0).doubleValue(), 0.0);
  }

  @Test
  public void testNumericEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericEqual(null, 10.0));
  }

  @Test
  public void testNumericEqual2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericEqual(0.5, 10.0));
  }

  @Test
  public void testNumericEqual3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericEqual(10.0,
        10.0));
  }

  @Test
  public void testNumericEqual4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true))).numericEqual(null,
        null));
  }

  @Test
  public void testNumericEqual5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericEqual(10.0, null));
  }

  @Test
  public void testNumericNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericNotEqual(10.0, 10.0));
  }

  @Test
  public void testNumericLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(10.0, null));
  }

  @Test
  public void testNumericLessThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(null, 10.0));
  }

  @Test
  public void testNumericLessThan3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(null, null));
  }

  @Test
  public void testNumericLessThan4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(0.5, 10.0));
  }

  @Test
  public void testNumericLessThan5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessThan(10.0, 10.0));
  }

  @Test
  public void testNumericGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(null, null));
  }

  @Test
  public void testNumericGreaterThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(null, 10.0));
  }

  @Test
  public void testNumericGreaterThan3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(10.0, 0.5));
  }

  @Test
  public void testNumericGreaterThan4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(10.0, 10.0));
  }

  @Test
  public void testNumericGreaterThan5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterThan(10.0, null));
  }

  @Test
  public void testNumericLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(null, 10.0));
  }

  @Test
  public void testNumericLessEqualThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(10.0, null));
  }

  @Test
  public void testNumericLessEqualThan3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(null, null));
  }

  @Test
  public void testNumericLessEqualThan4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(10.0, 10.0));
  }

  @Test
  public void testNumericLessEqualThan5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericLessEqualThan(10.0, 0.5));
  }

  @Test
  public void testNumericGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(10.0, 10.0));
  }

  @Test
  public void testNumericGreaterEqualThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(null, null));
  }

  @Test
  public void testNumericGreaterEqualThan3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(10.0, null));
  }

  @Test
  public void testNumericGreaterEqualThan4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(0.5, 10.0));
  }

  @Test
  public void testNumericGreaterEqualThan5() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleNumericType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .numericGreaterEqualThan(null, 10.0));
  }
}

