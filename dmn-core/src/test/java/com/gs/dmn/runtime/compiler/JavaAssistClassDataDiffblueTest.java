package com.gs.dmn.runtime.compiler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaAssistClassDataDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    JavaAssistClassData actualJavaAssistClassData = new JavaAssistClassData("java.text", "className", "methodText",
        "bridgeMethodText");

    // Assert
    assertEquals("className", actualJavaAssistClassData.getClassName());
    assertEquals("methodText", actualJavaAssistClassData.getMethodText());
    assertEquals("bridgeMethodText", actualJavaAssistClassData.getBridgeMethodText());
    assertEquals("java.text", actualJavaAssistClassData.getPackageName());
  }
}

