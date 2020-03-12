package com.gs.dmn.runtime.compiler;

import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JavaxToolsCompilerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void compileTest() throws Exception {
    // Arrange
    JavaxToolsClassData classData = new JavaxToolsClassData("packageName", "className", "-d");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new JavaxToolsCompiler()).compile(classData);
  }
  @Test
  public void compileTest2() throws Exception {
    // Arrange
    JavaxToolsClassData classData = new JavaxToolsClassData("packageName", "className", "classText");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new JavaxToolsCompiler()).compile(classData);
  }
  @Test
  public void compileTest3() throws Exception {
    // Arrange
    JavaxToolsClassData classData = new JavaxToolsClassData("packageName", "className", "");

    // Act and Assert
    thrown.expect(ClassNotFoundException.class);
    (new JavaxToolsCompiler()).compile(classData);
  }
  @Test
  public void compileTest4() throws Exception {
    // Arrange
    JavaxToolsClassData classData = new JavaxToolsClassData("", "className", "classText");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new JavaxToolsCompiler()).compile(classData);
  }
}

