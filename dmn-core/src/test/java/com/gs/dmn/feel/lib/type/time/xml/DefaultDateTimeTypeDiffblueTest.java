package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultDateTimeTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DatatypeFactoryImpl datatypeFactoryImpl = new DatatypeFactoryImpl();

    // Act and Assert
    assertSame(datatypeFactoryImpl, (new DefaultDateTimeType(logger, datatypeFactoryImpl)).datatypeFactory);
  }

  @Test
  public void dateTimeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultDateTimeType.dateTimeEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateTimeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(
        defaultDateTimeType.dateTimeGreaterEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateTimeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(
        defaultDateTimeType.dateTimeGreaterThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateTimeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(
        defaultDateTimeType.dateTimeLessEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateTimeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateTimeType.dateTimeLessThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateTimeNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateTimeType.dateTimeNotEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }
}

