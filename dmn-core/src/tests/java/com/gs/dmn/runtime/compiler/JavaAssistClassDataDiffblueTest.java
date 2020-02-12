package com.gs.dmn.runtime.compiler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaAssistClassDataDiffblueTest {
  @Test(timeout=10000)
  public void getMethodTextTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new JavaAssistClassData("name", "name", "foo", "foo")).getMethodText());
  }

  @Test(timeout=10000)
  public void getBridgeMethodTextTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new JavaAssistClassData("name", "name", "foo", "foo")).getBridgeMethodText());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    JavaAssistClassData actualJavaAssistClassData = new JavaAssistClassData("name", "name", "foo", "foo");

    // Assert
    String actualClassName = actualJavaAssistClassData.getClassName();
    String actualPackageName = actualJavaAssistClassData.getPackageName();
    String actualBridgeMethodText = actualJavaAssistClassData.getBridgeMethodText();
    assertEquals("name", actualClassName);
    assertEquals("foo", actualJavaAssistClassData.getMethodText());
    assertEquals("foo", actualBridgeMethodText);
    assertEquals("name", actualPackageName);
  }
}

