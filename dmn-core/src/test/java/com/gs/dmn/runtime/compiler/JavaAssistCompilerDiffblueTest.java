package com.gs.dmn.runtime.compiler;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JavaAssistCompilerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void compileTest() throws Exception {
    // Arrange
    JavaxToolsClassData classData = new JavaxToolsClassData("packageName", "className", "classText");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    (new JavaAssistCompiler()).compile(classData);
  }
}

