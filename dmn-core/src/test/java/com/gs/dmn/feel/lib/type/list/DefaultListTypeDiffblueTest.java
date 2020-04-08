package com.gs.dmn.feel.lib.type.list;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultListTypeDiffblueTest {
  @Test
  public void testListEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultListType defaultListType = new DefaultListType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");
    ArrayList<Object> objectList1 = new ArrayList<Object>();
    objectList1.add("foo");

    // Act and Assert
    assertTrue(defaultListType.listEqual(objectList, objectList1));
  }

  @Test
  public void testListNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultListType defaultListType = new DefaultListType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");
    ArrayList<Object> objectList1 = new ArrayList<Object>();
    objectList1.add("foo");

    // Act and Assert
    assertFalse(defaultListType.listNotEqual(objectList, objectList1));
  }

  @Test
  public void testListNotEqual2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse(
        (new DefaultListType(new SubstituteLogger("log", substituteLoggingEventList, true))).listNotEqual(null, null));
  }

  @Test
  public void testListNotEqual3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultListType defaultListType = new DefaultListType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(defaultListType.listNotEqual(objectList, null));
  }

  @Test
  public void testListNotEqual4() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultListType defaultListType = new DefaultListType(
        new SubstituteLogger("log", substituteLoggingEventList, true));
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertTrue(defaultListType.listNotEqual(null, objectList));
  }
}

