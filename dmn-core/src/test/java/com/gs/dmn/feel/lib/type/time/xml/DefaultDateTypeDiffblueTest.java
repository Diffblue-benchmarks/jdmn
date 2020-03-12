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

public class DefaultDateTypeDiffblueTest {
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
    assertSame(datatypeFactoryImpl, (new DefaultDateType(logger, datatypeFactoryImpl)).datatypeFactory);
  }

  @Test
  public void dateAddDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());
    SaxonDuration duration = new SaxonDuration(null);

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    defaultDateType.dateAddDuration(new FEELXMLGregorianCalendar(), duration);
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

  @Test
  public void dateSubtractDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DefaultDateType defaultDateType = new DefaultDateType(logger, new DatatypeFactoryImpl());
    SaxonDuration duration = new SaxonDuration(null);

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    defaultDateType.dateSubtractDuration(new FEELXMLGregorianCalendar(), duration);
  }
}

