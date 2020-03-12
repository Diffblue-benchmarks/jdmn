package com.gs.dmn.feel.lib.type.time.uniform;

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

public class ZonedTimeTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DatatypeFactoryImpl datatypeFactoryImpl = new DatatypeFactoryImpl();

    // Act and Assert
    assertSame(datatypeFactoryImpl, (new ZonedTimeType(logger, datatypeFactoryImpl)).datatypeFactory);
  }

  @Test
  public void timeAddDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedTimeType zonedTimeType = new ZonedTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedTimeType.timeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void timeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeEqual(null, null));
  }

  @Test
  public void timeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeGreaterEqualThan(null, null));
  }

  @Test
  public void timeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeGreaterThan(null, null));
  }

  @Test
  public void timeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeLessEqualThan(null, null));
  }

  @Test
  public void timeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeLessThan(null, null));
  }

  @Test
  public void timeNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeNotEqual(null, null));
  }

  @Test
  public void timeSubtractDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    ZonedTimeType zonedTimeType = new ZonedTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(zonedTimeType.timeSubtractDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void timeSubtractTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new ZonedTimeType(logger, new DatatypeFactoryImpl())).timeSubtract(null, null));
  }
}

