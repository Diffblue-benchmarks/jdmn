package com.gs.dmn.feel.lib.type.time.pure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class TemporalDateTimeTypeDiffblueTest {
  @Test
  public void testDateTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeEqual(null, null));
  }

  @Test
  public void testDateTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeNotEqual(null, null));
  }

  @Test
  public void testDateTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeLessThan(null, null));
  }

  @Test
  public void testDateTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeGreaterThan(null, null));
  }

  @Test
  public void testDateTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeLessEqualThan(null, null));
  }

  @Test
  public void testDateTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeGreaterEqualThan(null, null));
  }

  @Test
  public void testDateTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeSubtract(null, null));
  }

  @Test
  public void testDateTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeAddDuration(null, null));
  }

  @Test
  public void testDateTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateTimeSubtractDuration(null, null));
  }

  @Test
  public void testTemporalDateTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalDateTimeEqual(null, null));
  }

  @Test
  public void testTemporalDateTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalDateTimeLessThan(null, null));
  }

  @Test
  public void testTemporalDateTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalDateTimeGreaterThan(null, null));
  }

  @Test
  public void testTemporalDateTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalDateTimeLessEqualThan(null, null));
  }

  @Test
  public void testTemporalDateTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalDateTimeType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .temporalDateTimeGreaterEqualThan(null, null));
  }
}

