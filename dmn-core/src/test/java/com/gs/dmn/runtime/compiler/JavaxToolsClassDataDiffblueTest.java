package com.gs.dmn.runtime.compiler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaxToolsClassDataDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    JavaxToolsClassData actualJavaxToolsClassData = new JavaxToolsClassData("packageName", "className", "classText");

    // Assert
    assertEquals("className", actualJavaxToolsClassData.getClassName());
    assertEquals("classText", actualJavaxToolsClassData.getClassText());
    assertEquals("packageName", actualJavaxToolsClassData.getPackageName());
  }
}

