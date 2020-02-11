package com.gs.dmn.runtime.discovery;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecisionDiscoveryDiffblueTest {
  @Test(timeout=10000)
  public void discoverTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DecisionDiscovery()).discover("foo").size());
  }
}

