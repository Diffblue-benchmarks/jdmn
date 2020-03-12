package com.gs.dmn.runtime.serialization;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.gs.dmn.feel.lib.type.time.xml.FEELXMLGregorianCalendar;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XMLGregorianCalendarSerializerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange and Act
    XMLGregorianCalendarSerializer actualXmlGregorianCalendarSerializer = new XMLGregorianCalendarSerializer();

    // Assert
    assertNull(actualXmlGregorianCalendarSerializer.getDelegatee());
    assertFalse(actualXmlGregorianCalendarSerializer.isUnwrappingSerializer());
  }

  @Test
  public void serializeTest() throws IOException {
    // Arrange
    XMLGregorianCalendarSerializer xmlGregorianCalendarSerializer = new XMLGregorianCalendarSerializer();
    FEELXMLGregorianCalendar value = new FEELXMLGregorianCalendar();
    JsonGeneratorDelegate gen = new JsonGeneratorDelegate(
        new JsonGeneratorDelegate(new JsonGeneratorDelegate(new JsonGeneratorDelegate(null))));

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    xmlGregorianCalendarSerializer.serialize(value, gen, new DefaultSerializerProvider.Impl());
  }
}

