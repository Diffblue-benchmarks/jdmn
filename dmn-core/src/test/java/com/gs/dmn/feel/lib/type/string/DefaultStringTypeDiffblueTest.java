package com.gs.dmn.feel.lib.type.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultStringTypeDiffblueTest {
  @Test
  public void stringAddTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertEquals("logsecond", (new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringAdd("log", "second"));
  }

  @Test
  public void stringEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringEqual("log", "second"));
  }

  @Test
  public void stringGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringGreaterEqualThan("log", ""));
  }

  @Test
  public void stringGreaterEqualThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringGreaterEqualThan("log", "second"));
  }

  @Test
  public void stringGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringGreaterThan("log", ""));
  }

  @Test
  public void stringGreaterThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringGreaterThan("log", "second"));
  }

  @Test
  public void stringLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringLessEqualThan("log", "second"));
  }

  @Test
  public void stringLessEqualThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringLessEqualThan("log", ""));
  }

  @Test
  public void stringLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringLessThan("log", ""));
  }

  @Test
  public void stringLessThanTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringLessThan("log", "second"));
  }

  @Test
  public void stringNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultStringType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .stringNotEqual("log", "second"));
  }
}

