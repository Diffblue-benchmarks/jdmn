package com.gs.dmn.runtime.serialization;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.junit.Test;

public class XMLGregorianCalendarSerializerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    XMLGregorianCalendarSerializer actualXmlGregorianCalendarSerializer = new XMLGregorianCalendarSerializer();

    // Assert
    JsonSerializer<?> actualDelegatee = actualXmlGregorianCalendarSerializer.getDelegatee();
    assertNull(actualDelegatee);
    assertFalse(actualXmlGregorianCalendarSerializer.isUnwrappingSerializer());
  }
}

