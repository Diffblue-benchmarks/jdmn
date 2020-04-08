package com.gs.dmn.runtime.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.fasterxml.jackson.databind.util.AccessPattern;
import org.junit.Test;

public class XMLGregorianCalendarDeserializerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    XMLGregorianCalendarDeserializer actualXmlGregorianCalendarDeserializer = new XMLGregorianCalendarDeserializer();

    // Assert
    assertNull(actualXmlGregorianCalendarDeserializer.getObjectIdReader());
    assertNull(actualXmlGregorianCalendarDeserializer.getDelegatee());
    assertFalse(actualXmlGregorianCalendarDeserializer.isCachable());
    assertNull(actualXmlGregorianCalendarDeserializer.getKnownPropertyNames());
    assertNull(actualXmlGregorianCalendarDeserializer.getNullValue());
    assertEquals(AccessPattern.CONSTANT, actualXmlGregorianCalendarDeserializer.getNullAccessPattern());
    assertNull(actualXmlGregorianCalendarDeserializer.getEmptyValue());
    assertEquals(AccessPattern.DYNAMIC, actualXmlGregorianCalendarDeserializer.getEmptyAccessPattern());
  }
}

