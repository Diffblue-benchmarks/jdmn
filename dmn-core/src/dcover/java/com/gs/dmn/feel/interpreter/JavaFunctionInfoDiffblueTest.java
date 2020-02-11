package com.gs.dmn.feel.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Test;

public class JavaFunctionInfoDiffblueTest {
  @Test(timeout=10000)
  public void getMethodNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new JavaFunctionInfo("name", "name", null)).getMethodName());
  }

  @Test(timeout=10000)
  public void getClassNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new JavaFunctionInfo("name", "name", null)).getClassName());
  }

  @Test(timeout=10000)
  public void getParamTypesTest() {
    // Arrange, Act and Assert
    assertNull((new JavaFunctionInfo("name", "name", null)).getParamTypes());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    JavaFunctionInfo actualJavaFunctionInfo = new JavaFunctionInfo("name", "name", null);

    // Assert
    List<String> actualParamTypes = actualJavaFunctionInfo.getParamTypes();
    String actualClassName = actualJavaFunctionInfo.getClassName();
    assertNull(actualParamTypes);
    assertEquals("name", actualJavaFunctionInfo.getMethodName());
    assertEquals("name", actualClassName);
  }
}

