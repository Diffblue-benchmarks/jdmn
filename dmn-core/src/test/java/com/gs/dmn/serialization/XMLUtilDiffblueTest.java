package com.gs.dmn.serialization;

import static org.junit.Assert.assertTrue;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Test;

public class XMLUtilDiffblueTest {
  @Test
  public void testMakeDocumentBuilderFactory() throws ParserConfigurationException {
    // Arrange, Act and Assert
    assertTrue(XMLUtil
        .makeDocumentBuilderFactory() instanceof com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl);
    assertTrue(XMLUtil
        .makeDocumentBuilderFactory() instanceof com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl);
    assertTrue(XMLUtil
        .makeDocumentBuilderFactory() instanceof com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl);
  }
}

