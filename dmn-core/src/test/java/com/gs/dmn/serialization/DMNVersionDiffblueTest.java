package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import org.junit.Test;

public class DMNVersionDiffblueTest {
  @Test
  public void testFromVersion() {
    // Arrange
    DMNVersion fromVersionResult = DMNVersion.fromVersion("1.1");

    // Act
    DMNVersion actualFromVersionResult = DMNVersion.fromVersion("1.2");

    // Assert
    assertSame(fromVersionResult.DMN_11, fromVersionResult);
    assertSame(actualFromVersionResult.LATEST, actualFromVersionResult);
  }

  @Test
  public void testConstructor() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("1.1", "1.1");

    // Act
    DMNVersion actualDmnVersion = new DMNVersion("0.8.9", "1.1", "1.1", "1.1", "1.1", "0.8.9", stringStringMap,
        "0.8.9");

    // Assert
    assertEquals("1.1", actualDmnVersion.getNamespace());
    assertEquals("0.8.9", actualDmnVersion.getVersion());
    assertEquals("0.8.9", actualDmnVersion.getFeelNamespace());
    assertEquals("1.1", actualDmnVersion.getFeelPrefix());
    assertEquals("1.1", actualDmnVersion.getPrefix());
    assertEquals("0.8.9", actualDmnVersion.getJavaPackage());
    assertEquals("1.1", actualDmnVersion.getSchemaLocation());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("1.1", "1.1");

    // Act
    DMNVersion actualDmnVersion = new DMNVersion("0.8.9", "1.1", "", "1.1", "1.1", "0.8.9", stringStringMap, "0.8.9");

    // Assert
    assertEquals("1.1", actualDmnVersion.getNamespace());
    assertEquals("0.8.9", actualDmnVersion.getVersion());
    assertEquals("0.8.9", actualDmnVersion.getFeelNamespace());
    assertEquals("1.1", actualDmnVersion.getFeelPrefix());
    assertEquals("", actualDmnVersion.getPrefix());
    assertEquals("0.8.9", actualDmnVersion.getJavaPackage());
    assertEquals("1.1", actualDmnVersion.getSchemaLocation());
  }
}

