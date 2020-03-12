package com.gs.dmn.feel.lib.type.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultBooleanTypeDiffblueTest {
  @Test
  public void binaryBooleanAndTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanAnd("first", "first"));
  }

  @Test
  public void binaryBooleanOrTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanOr("first", "first"));
  }

  @Test
  public void booleanAndTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultBooleanType defaultBooleanType = new DefaultBooleanType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultBooleanType.booleanAnd(objectList));
  }

  @Test
  public void booleanAndTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanAnd("foo",
        "foo", "foo"));
  }

  @Test
  public void booleanEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanEqual(true, true));
  }

  @Test
  public void booleanNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanNotEqual(true, true));
  }

  @Test
  public void booleanNotEqualTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanNotEqual(false, true));
  }

  @Test
  public void booleanNotTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanNot("operand"));
  }

  @Test
  public void booleanOrTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanOr("foo",
        "foo", "foo"));
  }

  @Test
  public void booleanOrTest2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultBooleanType defaultBooleanType = new DefaultBooleanType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultBooleanType.booleanOr(objectList));
  }
}

