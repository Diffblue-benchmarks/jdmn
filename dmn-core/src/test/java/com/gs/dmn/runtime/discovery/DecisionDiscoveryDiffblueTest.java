package com.gs.dmn.runtime.discovery;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecisionDiscoveryDiffblueTest {
  @Test
  public void discoverTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DecisionDiscovery()).discover("packagePrefix").size());
  }
}

