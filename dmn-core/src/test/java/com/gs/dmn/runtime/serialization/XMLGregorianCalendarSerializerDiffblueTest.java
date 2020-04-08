package com.gs.dmn.runtime.serialization;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class XMLGregorianCalendarSerializerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    XMLGregorianCalendarSerializer actualXmlGregorianCalendarSerializer = new XMLGregorianCalendarSerializer();

    // Assert
    assertNull(actualXmlGregorianCalendarSerializer.getDelegatee());
    assertFalse(actualXmlGregorianCalendarSerializer.isUnwrappingSerializer());
  }
}

