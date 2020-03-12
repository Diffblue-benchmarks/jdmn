package com.gs.dmn.feel.lib.type.time.mixed;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class ZonedDateTimeTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DatatypeFactoryImpl datatypeFactoryImpl = new DatatypeFactoryImpl();

    // Act and Assert
    assertSame(datatypeFactoryImpl, (new ZonedDateTimeType(logger, datatypeFactoryImpl)).datatypeFactory);
  }

  @Test
  public void dateTimeAddDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedDateTimeType zonedDateTimeType = new ZonedDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedDateTimeType.dateTimeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void dateTimeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeEqual(null, null));
  }

  @Test
  public void dateTimeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeGreaterEqualThan(null, null));
  }

  @Test
  public void dateTimeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeGreaterThan(null, null));
  }

  @Test
  public void dateTimeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeLessEqualThan(null, null));
  }

  @Test
  public void dateTimeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeLessThan(null, null));
  }

  @Test
  public void dateTimeNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeNotEqual(null, null));
  }

  @Test
  public void dateTimeSubtractDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedDateTimeType zonedDateTimeType = new ZonedDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedDateTimeType.dateTimeSubtractDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void dateTimeSubtractTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeSubtract(null, null));
  }

  @Test
  public void zonedDateTimeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeEqual(null, null));
  }

  @Test
  public void zonedDateTimeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeGreaterEqualThan(null, null));
  }

  @Test
  public void zonedDateTimeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeGreaterThan(null, null));
  }

  @Test
  public void zonedDateTimeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeLessEqualThan(null, null));
  }

  @Test
  public void zonedDateTimeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedDateTimeType(logger, new DatatypeFactoryImpl())).zonedDateTimeLessThan(null, null));
  }
}

