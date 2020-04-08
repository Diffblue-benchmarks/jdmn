package com.gs.dmn.feel.lib.type.context;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultContextTypeDiffblueTest {
  @Test
  public void testContextEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultContextType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .contextEqual(null, null));
  }

  @Test
  public void testContextEqual2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertTrue((new DefaultContextType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .contextEqual("c1", "c1"));
  }

  @Test
  public void testContextNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());

    // Act and Assert
    assertFalse((new DefaultContextType(new SubstituteLogger("log", substituteLoggingEventList, true)))
        .contextNotEqual("c1", "c1"));
  }
}

