package com.gs.dmn.feel.lib.type.time.mixed;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class ZonedDateTimeTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue(
        (new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).datatypeFactory instanceof DatatypeFactoryImpl);
  }

  @Test
  public void testDateTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeEqual(null, null));
  }

  @Test
  public void testDateTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeNotEqual(null, null));
  }

  @Test
  public void testDateTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeLessThan(null, null));
  }

  @Test
  public void testDateTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeGreaterThan(null, null));
  }

  @Test
  public void testDateTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeLessEqualThan(null, null));
  }

  @Test
  public void testDateTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeGreaterEqualThan(null, null));
  }

  @Test
  public void testDateTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeSubtract(null, null));
  }

  @Test
  public void testDateTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedDateTimeType zonedDateTimeType = new ZonedDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedDateTimeType.dateTimeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testDateTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedDateTimeType zonedDateTimeType = new ZonedDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedDateTimeType.dateTimeSubtractDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testZonedDateTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeEqual(null, null));
  }

  @Test
  public void testZonedDateTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeLessThan(null, null));
  }

  @Test
  public void testZonedDateTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeGreaterThan(null, null));
  }

  @Test
  public void testZonedDateTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeLessEqualThan(null, null));
  }

  @Test
  public void testZonedDateTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeGreaterEqualThan(null, null));
  }
}

