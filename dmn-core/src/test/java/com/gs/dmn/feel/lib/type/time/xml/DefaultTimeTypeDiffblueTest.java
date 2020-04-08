package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.GDayValue;
import net.sf.saxon.value.SaxonDuration;
import net.sf.saxon.value.SaxonXMLGregorianCalendar;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultTimeTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new DefaultTimeType(logger, new DatatypeFactoryImpl())).datatypeFactory instanceof DatatypeFactoryImpl);
  }

  @Test
  public void testTimeEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultTimeType.timeEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimeNotEqual() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultTimeType.timeNotEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimeLessThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultTimeType.timeLessThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimeGreaterThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultTimeType.timeGreaterThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimeLessEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultTimeType.timeLessEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimeGreaterEqualThan() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultTimeType.timeGreaterEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void testTimeSubtract() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultTimeType defaultTimeType = new DefaultTimeType(new SubstituteLogger("log", substituteLoggingEventList, true),
        null);

    // Act and Assert
    assertNull(defaultTimeType.timeSubtract(new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1)),
        new SaxonXMLGregorianCalendar(new GDayValue((byte) 16, 1))));
  }

  @Test
  public void testTimeSubtract2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new DefaultTimeType(logger, new DatatypeFactoryImpl())).timeSubtract(null, null));
  }

  @Test
  public void testTimeSubtract3() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    DefaultTimeType defaultTimeType = new DefaultTimeType(new SubstituteLogger("log", substituteLoggingEventList, true),
        null);

    // Act and Assert
    assertNull(defaultTimeType.timeSubtract(new SaxonXMLGregorianCalendar(new GDayValue((byte) 0, 1)),
        new SaxonXMLGregorianCalendar(new GDayValue((byte) 0, 1))));
  }

  @Test
  public void testTimeAddDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultTimeType.timeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testTimeAddDuration2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultTimeType.timeAddDuration(new FEELXMLGregorianCalendar(), null));
  }

  @Test
  public void testTimeSubtractDuration() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultTimeType.timeSubtractDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void testTimeSubtractDuration2() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(defaultTimeType.timeSubtractDuration(new FEELXMLGregorianCalendar(), null));
  }
}

