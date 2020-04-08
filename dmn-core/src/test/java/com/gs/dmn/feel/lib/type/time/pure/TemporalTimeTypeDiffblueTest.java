package com.gs.dmn.feel.lib.type.time.pure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class TemporalTimeTypeDiffblueTest {
  @Test
  public void testTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue(
        (new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeEqual(null, null));
  }

  @Test
  public void testTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeNotEqual(null, null));
  }

  @Test
  public void testTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeLessThan(null, null));
  }

  @Test
  public void testTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeGreaterThan(null, null));
  }

  @Test
  public void testTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeLessEqualThan(null, null));
  }

  @Test
  public void testTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeGreaterEqualThan(null, null));
  }

  @Test
  public void testTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).timeSubtract(null, null));
  }

  @Test
  public void testTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeAddDuration(null, null));
  }

  @Test
  public void testTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .timeSubtractDuration(null, null));
  }

  @Test
  public void testTemporalTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalTimeEqual(null, null));
  }

  @Test
  public void testTemporalTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalTimeLessThan(null, null));
  }

  @Test
  public void testTemporalTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalTimeGreaterThan(null, null));
  }

  @Test
  public void testTemporalTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalTimeLessEqualThan(null, null));
  }

  @Test
  public void testTemporalTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalTimeGreaterEqualThan(null, null));
  }

  @Test
  public void testCompare() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new TemporalTimeType(new SubstituteLogger("log", substituteLoggingEventList, true))).compare(null, null));
  }
}

