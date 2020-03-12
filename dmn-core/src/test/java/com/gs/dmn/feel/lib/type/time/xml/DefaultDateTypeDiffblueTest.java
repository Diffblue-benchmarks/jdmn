package com.gs.dmn.feel.lib.type.time.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class DefaultDateTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new DefaultDateType(logger, new DatatypeFactoryImpl())).datatypeFactory instanceof DatatypeFactoryImpl);
  }

  @Test
  public void dateEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultDateType.dateEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultDateType.dateGreaterEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateType.dateGreaterThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertTrue(defaultDateType.dateLessEqualThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateType.dateLessThan(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }

  @Test
  public void dateNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertFalse(defaultDateType.dateNotEqual(new FEELXMLGregorianCalendar(), new FEELXMLGregorianCalendar()));
  }
}

