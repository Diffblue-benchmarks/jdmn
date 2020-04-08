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
  public void testBooleanNot() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue(
        (new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanNot(false));
  }

  @Test
  public void testBooleanNot2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull(
        (new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanNot("operand"));
  }

  @Test
  public void testBooleanNot3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanNot(true));
  }

  @Test
  public void testBooleanOr() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanOr("foo",
        "foo", "foo"));
  }

  @Test
  public void testBooleanOr2() {
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

  @Test
  public void testBooleanOr3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultBooleanType defaultBooleanType = new DefaultBooleanType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultBooleanType.booleanOr(objectList));
  }

  @Test
  public void testBinaryBooleanOr() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanOr(false, false));
  }

  @Test
  public void testBinaryBooleanOr2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanOr(true, true));
  }

  @Test
  public void testBinaryBooleanOr3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanOr("first", "first"));
  }

  @Test
  public void testBooleanAnd() {
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
  public void testBooleanAnd2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultBooleanType defaultBooleanType = new DefaultBooleanType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>(1);
    objectList.add("foo");
    objectList.add("foo");

    // Act and Assert
    assertNull(defaultBooleanType.booleanAnd(objectList));
  }

  @Test
  public void testBooleanAnd3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true))).booleanAnd("foo",
        "foo", "foo"));
  }

  @Test
  public void testBinaryBooleanAnd() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanAnd(false, false));
  }

  @Test
  public void testBinaryBooleanAnd2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanAnd(true, true));
  }

  @Test
  public void testBinaryBooleanAnd3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertNull((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .binaryBooleanAnd("first", "first"));
  }

  @Test
  public void testBooleanEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanEqual(true, null));
  }

  @Test
  public void testBooleanEqual2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanEqual(true, true));
  }

  @Test
  public void testBooleanEqual3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanEqual(null, true));
  }

  @Test
  public void testBooleanEqual4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanEqual(null, null));
  }

  @Test
  public void testBooleanNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultBooleanType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .booleanNotEqual(true, true));
  }
}

