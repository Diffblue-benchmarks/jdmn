package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultDateTimeTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue(
        (new DefaultDateTimeType(logger, new DatatypeFactoryImpl())).datatypeFactory instanceof DatatypeFactoryImpl);
  }

  @Test
  public void testDateTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultDateTimeType.dateTimeEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testDateTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateTimeType.dateTimeNotEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testDateTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateTimeType.dateTimeLessThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testDateTimeGreaterThan() {
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
  public void testDateTimeLessEqualThan() {
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
  public void testDateTimeGreaterEqualThan() {
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
  public void testDateTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new DefaultDateTimeType(logger, new DatatypeFactoryImpl())).dateTimeSubtract(null, null));
  }

  @Test
  public void testDateTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultDateTimeType.dateTimeAddDuration(new FEELXMLGregorianCalendar(), null));
  }

  @Test
  public void testDateTimeAddDuration2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultDateTimeType.dateTimeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testDateTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultDateTimeType.dateTimeSubtractDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testDateTimeSubtractDuration2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateTimeType defaultDateTimeType = new DefaultDateTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultDateTimeType.dateTimeSubtractDuration(new FEELXMLGregorianCalendar(), null));
  }
}

