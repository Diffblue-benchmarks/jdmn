package com.gs.dmn.serialization;

import static org.junit.Assert.assertTrue;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Test;

public class XMLUtilDiffblueTest {
  @Test
  public void makeDocumentBuilderFactoryTest() throws ParserConfigurationException {
    // Arrange, Act and Assert
    assertTrue(XMLUtil
        .makeDocumentBuilderFactory() instanceof com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl);
  }
}

