package com.gs.dmn.feel.lib.type.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultStringTypeDiffblueTest {
  @Test
  public void testStringEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringEqual("log", "second"));
  }

  @Test
  public void testStringNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringNotEqual("log", "second"));
  }

  @Test
  public void testStringNotEqual2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger(null, substituteLoggingEventList, true)))
        .stringNotEqual(null, "second"));
  }

  @Test
  public void testStringAdd() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultStringType(new SubstituteLogger(null, substituteLoggingEventList, true))).stringAdd(null,
        "second"));
  }

  @Test
  public void testStringAdd2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals("logsecond", (new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringAdd("log", "second"));
  }

  @Test
  public void testStringLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultStringType(new SubstituteLogger(null, substituteLoggingEventList, true)))
        .stringLessThan(null, "second"));
  }

  @Test
  public void testStringLessThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringLessThan("log", "second"));
  }

  @Test
  public void testStringGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringGreaterThan("log", "second"));
  }

  @Test
  public void testStringGreaterThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultStringType(new SubstituteLogger(null, substituteLoggingEventList, true)))
        .stringGreaterThan(null, "second"));
  }

  @Test
  public void testStringLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringLessEqualThan("log", "second"));
  }

  @Test
  public void testStringLessEqualThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultStringType(new SubstituteLogger(null, substituteLoggingEventList, true)))
        .stringLessEqualThan(null, "second"));
  }

  @Test
  public void testStringGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringGreaterEqualThan("log", "second"));
  }

  @Test
  public void testStringGreaterEqualThan2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultStringType(new SubstituteLogger(null, substituteLoggingEventList, true)))
        .stringGreaterEqualThan(null, "second"));
  }
}

