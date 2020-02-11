package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class RuntimeEnvironmentFactoryDiffblueTest {
  @Test(timeout=10000)
  public void makeEnvironmentTest2() {
    // Arrange, Act and Assert
    assertNull((new RuntimeEnvironmentFactory()).makeEnvironment().getParent());
  }

  @Test(timeout=10000)
  public void makeEnvironmentTest() {
    // Arrange
    RuntimeEnvironmentFactory runtimeEnvironmentFactory = new RuntimeEnvironmentFactory();
    RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(runtimeEnvironment, runtimeEnvironmentFactory.makeEnvironment(runtimeEnvironment).getParent());
  }
}

