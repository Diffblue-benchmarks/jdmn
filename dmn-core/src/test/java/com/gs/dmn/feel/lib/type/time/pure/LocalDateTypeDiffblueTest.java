package com.gs.dmn.feel.lib.type.time.pure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class LocalDateTypeDiffblueTest {
  @Test
  public void testDateEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).dateEqual(null, null));
  }

  @Test
  public void testDateNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).dateNotEqual(null, null));
  }

  @Test
  public void testDateLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).dateLessThan(null, null));
  }

  @Test
  public void testDateGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).dateGreaterThan(null, null));
  }

  @Test
  public void testDateLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateLessEqualThan(null, null));
  }

  @Test
  public void testDateGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateGreaterEqualThan(null, null));
  }

  @Test
  public void testDateSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).dateSubtract(null, null));
  }

  @Test
  public void testDateAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).dateAddDuration(null, null));
  }

  @Test
  public void testDateSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .dateSubtractDuration(null, null));
  }

  @Test
  public void testLocalDateEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue(
        (new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true))).localDateEqual(null, null));
  }

  @Test
  public void testLocalDateLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .localDateLessThan(null, null));
  }

  @Test
  public void testLocalDateGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .localDateGreaterThan(null, null));
  }

  @Test
  public void testLocalDateLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .localDateLessEqualThan(null, null));
  }

  @Test
  public void testLocalDateGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new LocalDateType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .localDateGreaterEqualThan(null, null));
  }
}

