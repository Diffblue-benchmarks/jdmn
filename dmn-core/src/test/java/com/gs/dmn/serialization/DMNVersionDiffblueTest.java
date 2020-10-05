package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.LinkedHashMap;
import org.junit.Test;

public class DMNVersionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DMNVersion actualDmnVersion = new DMNVersion("1.1", "dmn/1.1/dmn.xsd", null,
        "http://www.omg.org/spec/DMN/20151101/dmn.xsd", "feel", "http://www.omg.org/spec/FEEL/20140401",
        new LinkedHashMap<String, String>(), "org.omg.spec.dmn._20151101.model");

    // Assert
    assertEquals("http://www.omg.org/spec/DMN/20151101/dmn.xsd", actualDmnVersion.getNamespace());
    assertEquals("1.1", actualDmnVersion.getVersion());
    assertEquals("http://www.omg.org/spec/FEEL/20140401", actualDmnVersion.getFeelNamespace());
    assertEquals("feel", actualDmnVersion.getFeelPrefix());
    assertNull(actualDmnVersion.getPrefix());
    assertEquals("org.omg.spec.dmn._20151101.model", actualDmnVersion.getJavaPackage());
    assertEquals("dmn/1.1/dmn.xsd", actualDmnVersion.getSchemaLocation());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    DMNVersion actualDmnVersion = new DMNVersion("1.2", "dmn/1.2/dmn.xsd", null,
        "http://www.omg.org/spec/DMN/20180521/MODEL/", "feel", "http://www.omg.org/spec/DMN/20180521/FEEL/",
        new LinkedHashMap<String, String>(), "org.omg.spec.dmn._20180521.model");

    // Assert
    assertEquals("http://www.omg.org/spec/DMN/20180521/MODEL/", actualDmnVersion.getNamespace());
    assertEquals("1.2", actualDmnVersion.getVersion());
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", actualDmnVersion.getFeelNamespace());
    assertEquals("feel", actualDmnVersion.getFeelPrefix());
    assertNull(actualDmnVersion.getPrefix());
    assertEquals("org.omg.spec.dmn._20180521.model", actualDmnVersion.getJavaPackage());
    assertEquals("dmn/1.2/dmn.xsd", actualDmnVersion.getSchemaLocation());
  }
}

