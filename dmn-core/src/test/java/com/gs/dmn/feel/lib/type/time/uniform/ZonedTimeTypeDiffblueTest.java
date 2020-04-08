package com.gs.dmn.feel.lib.type.time.uniform;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class ZonedTimeTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).datatypeFactory instanceof DatatypeFactoryImpl);
  }

  @Test
  public void testTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeEqual(null, null));
  }

  @Test
  public void testTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeNotEqual(null, null));
  }

  @Test
  public void testTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeLessThan(null, null));
  }

  @Test
  public void testTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeGreaterThan(null, null));
  }

  @Test
  public void testTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeLessEqualThan(null, null));
  }

  @Test
  public void testTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeGreaterEqualThan(null, null));
  }

  @Test
  public void testTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeSubtract(null, null));
  }

  @Test
  public void testTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedTimeType zonedTimeType = new ZonedTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedTimeType.timeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedTimeType zonedTimeType = new ZonedTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedTimeType.timeSubtractDuration(null, new SaxonDuration(null)));
  }
}

