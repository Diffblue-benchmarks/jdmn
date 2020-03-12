package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RuntimeEnvironmentFactoryDiffblueTest {
  @Test
  public void makeEnvironmentTest() {
    // Arrange, Act and Assert
    assertNull((new RuntimeEnvironmentFactory()).makeEnvironment().getParent());
  }
}

