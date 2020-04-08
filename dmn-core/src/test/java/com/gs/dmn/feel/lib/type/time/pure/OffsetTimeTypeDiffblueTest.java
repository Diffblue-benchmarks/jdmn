package com.gs.dmn.feel.lib.type.time.pure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class OffsetTimeTypeDiffblueTest {
  @Test
  public void testTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue(
        (new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeEqual(null, null));
  }

  @Test
  public void testTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeNotEqual(null, null));
  }

  @Test
  public void testTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeLessThan(null, null));
  }

  @Test
  public void testTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeGreaterThan(null, null));
  }

  @Test
  public void testTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeLessEqualThan(null, null));
  }

  @Test
  public void testTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeGreaterEqualThan(null, null));
  }

  @Test
  public void testTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeSubtract(null, null));
  }

  @Test
  public void testTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeAddDuration(null,
        null));
  }

  @Test
  public void testTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeSubtractDuration(null, null));
  }

  @Test
  public void testOffsetTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).offsetTimeEqual(null,
        null));
  }

  @Test
  public void testOffsetTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .offsetTimeLessThan(null, null));
  }

  @Test
  public void testOffsetTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .offsetTimeGreaterThan(null, null));
  }

  @Test
  public void testOffsetTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .offsetTimeLessEqualThan(null, null));
  }

  @Test
  public void testOffsetTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new OffsetTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .offsetTimeGreaterEqualThan(null, null));
  }
}

