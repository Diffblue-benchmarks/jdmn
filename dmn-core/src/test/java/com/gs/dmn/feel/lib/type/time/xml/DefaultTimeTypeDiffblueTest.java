package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultTimeTypeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DatatypeFactoryImpl datatypeFactoryImpl = new DatatypeFactoryImpl();

    // Act and Assert
    assertSame(datatypeFactoryImpl, (new DefaultTimeType(logger, datatypeFactoryImpl)).datatypeFactory);
  }

  @Test
  public void timeAddDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());
    SaxonDuration duration = new SaxonDuration(null);

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    defaultTimeType.timeAddDuration(new FEELXMLGregorianCalendar(), duration);
  }

  @Test
  public void timeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultTimeType.timeEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultTimeType.timeGreaterEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultTimeType.timeGreaterThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultTimeType.timeLessEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultTimeType.timeLessThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultTimeType.timeNotEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void timeSubtractDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultTimeType defaultTimeType = new DefaultTimeType(logger, new DatatypeFactoryImpl());
    SaxonDuration duration = new SaxonDuration(null);

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    defaultTimeType.timeSubtractDuration(new FEELXMLGregorianCalendar(), duration);
  }
}

