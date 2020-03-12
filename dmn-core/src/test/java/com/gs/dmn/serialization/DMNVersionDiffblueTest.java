package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DMNVersionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("1.1", "1.1");

    // Act
    DMNVersion actualDmnVersion = new DMNVersion("1.1", "1.1", "", "1.1", "1.1", "1.1", stringStringMap, "1.1");

    // Assert
    assertEquals("1.1", actualDmnVersion.getNamespace());
    assertEquals("1.1", actualDmnVersion.getVersion());
    assertEquals("1.1", actualDmnVersion.getFeelNamespace());
    assertEquals("1.1", actualDmnVersion.getFeelPrefix());
    assertEquals("", actualDmnVersion.getPrefix());
    assertEquals("1.1", actualDmnVersion.getJavaPackage());
    assertEquals("1.1", actualDmnVersion.getSchemaLocation());
  }
  @Test
  public void constructorTest2() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("1.1", "1.1");

    // Act
    DMNVersion actualDmnVersion = new DMNVersion("1.1", "1.1", "1.1", "1.1", "1.1", "1.1", stringStringMap, "1.1");

    // Assert
    assertEquals("1.1", actualDmnVersion.getNamespace());
    assertEquals("1.1", actualDmnVersion.getVersion());
    assertEquals("1.1", actualDmnVersion.getFeelNamespace());
    assertEquals("1.1", actualDmnVersion.getFeelPrefix());
    assertEquals("1.1", actualDmnVersion.getPrefix());
    assertEquals("1.1", actualDmnVersion.getJavaPackage());
    assertEquals("1.1", actualDmnVersion.getSchemaLocation());
  }
  @Test
  public void fromVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DMNVersion.fromVersion("di");
  }
  @Test
  public void fromVersionTest2() {
    // Arrange
    DMNVersion fromVersionResult = DMNVersion.fromVersion("1.1");

    // Act
    DMNVersion actualFromVersionResult = DMNVersion.fromVersion("1.2");

    // Assert
    assertSame(fromVersionResult.DMN_11, fromVersionResult);
    assertSame(actualFromVersionResult.DMN_12, actualFromVersionResult);
  }
}

