package com.gs.dmn.feel.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class JavaFunctionInfoDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    JavaFunctionInfo actualJavaFunctionInfo = new JavaFunctionInfo("byte", "byte", stringList);

    // Assert
    assertSame(stringList, actualJavaFunctionInfo.getParamTypes());
    assertEquals("byte", actualJavaFunctionInfo.getMethodName());
    assertEquals("byte", actualJavaFunctionInfo.getClassName());
  }

  @Test
  public void convertArgumentsTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    JavaFunctionInfo javaFunctionInfo = new JavaFunctionInfo("byte", "byte", stringList);
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals(1, javaFunctionInfo.convertArguments(objectList).size());
  }
}

