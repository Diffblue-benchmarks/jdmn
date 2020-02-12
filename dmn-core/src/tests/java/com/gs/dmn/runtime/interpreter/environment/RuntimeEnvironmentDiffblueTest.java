package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class RuntimeEnvironmentDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    Environment<String, Object> environment = new Environment<String, Object>(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(environment, (new RuntimeEnvironment(environment)).getParent());
  }
}

