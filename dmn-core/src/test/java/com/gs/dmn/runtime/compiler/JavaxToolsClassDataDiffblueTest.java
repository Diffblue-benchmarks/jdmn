package com.gs.dmn.runtime.compiler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaxToolsClassDataDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    JavaxToolsClassData actualJavaxToolsClassData = new JavaxToolsClassData("java.text", "className", "classText");

    // Assert
    assertEquals("className", actualJavaxToolsClassData.getClassName());
    assertEquals("classText", actualJavaxToolsClassData.getClassText());
    assertEquals("java.text", actualJavaxToolsClassData.getPackageName());
  }
}

