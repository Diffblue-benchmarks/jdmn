package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class RuntimeEnvironmentDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Environment<String, Object> environment = new Environment<String, Object>(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(environment, (new RuntimeEnvironment(environment)).getParent());
  }
}

