package com.gs.dmn.runtime.compiler;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaxToolsClassDataDiffblueTest {
  @Test(timeout=10000)
  public void getClassTextTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new JavaxToolsClassData("name", "name", "foo")).getClassText());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    JavaxToolsClassData actualJavaxToolsClassData = new JavaxToolsClassData("name", "name", "foo");

    // Assert
    String actualClassName = actualJavaxToolsClassData.getClassName();
    String actualPackageName = actualJavaxToolsClassData.getPackageName();
    assertEquals("name", actualClassName);
    assertEquals("foo", actualJavaxToolsClassData.getClassText());
    assertEquals("name", actualPackageName);
  }
}

