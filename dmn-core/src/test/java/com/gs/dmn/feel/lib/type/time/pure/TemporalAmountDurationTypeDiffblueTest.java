package com.gs.dmn.feel.lib.type.time.pure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class TemporalAmountDurationTypeDiffblueTest {
  @Test
  public void testDurationEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationEqual(null, null));
  }

  @Test
  public void testDurationNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationNotEqual(null, null));
  }

  @Test
  public void testDurationLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationLessThan(null, null));
  }

  @Test
  public void testDurationGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationGreaterThan(null, null));
  }

  @Test
  public void testDurationLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationLessEqualThan(null, null));
  }

  @Test
  public void testDurationGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationGreaterEqualThan(null, null));
  }

  @Test
  public void testDurationAdd() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationAdd(null, null));
  }

  @Test
  public void testDurationSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new TemporalAmountDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationSubtract(null, null));
  }

  @Test
  public void testDurationMultiply() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    TemporalAmountDurationType temporalAmountDurationType = new TemporalAmountDurationType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(temporalAmountDurationType.durationMultiply(null, BigDecimal.valueOf(1L)));
  }

  @Test
  public void testDurationDivide() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    TemporalAmountDurationType temporalAmountDurationType = new TemporalAmountDurationType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(temporalAmountDurationType.durationDivide(null, BigDecimal.valueOf(1L)));
  }
}

