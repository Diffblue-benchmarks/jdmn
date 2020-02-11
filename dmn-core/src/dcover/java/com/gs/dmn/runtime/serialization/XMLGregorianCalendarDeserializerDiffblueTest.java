package com.gs.dmn.runtime.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Test;

public class XMLGregorianCalendarDeserializerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    XMLGregorianCalendarDeserializer actualXmlGregorianCalendarDeserializer = new XMLGregorianCalendarDeserializer();

    // Assert
    ObjectIdReader actualObjectIdReader = actualXmlGregorianCalendarDeserializer.getObjectIdReader();
    AccessPattern actualEmptyAccessPattern = actualXmlGregorianCalendarDeserializer.getEmptyAccessPattern();
    Object actualEmptyValue = actualXmlGregorianCalendarDeserializer.getEmptyValue();
    AccessPattern actualNullAccessPattern = actualXmlGregorianCalendarDeserializer.getNullAccessPattern();
    XMLGregorianCalendar actualNullValue = actualXmlGregorianCalendarDeserializer.getNullValue();
    Collection<Object> actualKnownPropertyNames = actualXmlGregorianCalendarDeserializer.getKnownPropertyNames();
    boolean actualIsCachableResult = actualXmlGregorianCalendarDeserializer.isCachable();
    assertNull(actualObjectIdReader);
    assertNull(actualXmlGregorianCalendarDeserializer.getDelegatee());
    assertFalse(actualIsCachableResult);
    assertNull(actualKnownPropertyNames);
    assertNull(actualNullValue);
    assertEquals(AccessPattern.CONSTANT, actualNullAccessPattern);
    assertNull(actualEmptyValue);
    assertEquals(AccessPattern.DYNAMIC, actualEmptyAccessPattern);
  }
}

