package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DoubleDefaultDurationTypeDiffblueTest {
  @Test
  public void testDurationNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationNotEqual(null, null));
  }

  @Test
  public void testDurationLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationLessThan(null, null));
  }

  @Test
  public void testDurationGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationGreaterThan(null, null));
  }

  @Test
  public void testDurationLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationLessEqualThan(null, null));
  }

  @Test
  public void testDurationGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationGreaterEqualThan(null, null));
  }

  @Test
  public void testDurationAdd() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationAdd(null, null));
  }

  @Test
  public void testDurationSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationSubtract(null, null));
  }

  @Test
  public void testDurationMultiply() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationMultiply(null, 10.0));
  }

  @Test
  public void testDurationMultiply2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DoubleDefaultDurationType doubleDefaultDurationType = new DoubleDefaultDurationType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(doubleDefaultDurationType.durationMultiply(new SaxonDuration(null), null));
  }

  @Test
  public void testDurationDivide() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DoubleDefaultDurationType doubleDefaultDurationType = new DoubleDefaultDurationType(
        new SubstituteLogger("log", substituteLoggingEventList, true));

    // Act and Assert
    assertNull(doubleDefaultDurationType.durationDivide(new SaxonDuration(null), null));
  }

  @Test
  public void testDurationDivide2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DoubleDefaultDurationType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .durationDivide(null, 10.0));
  }
}

