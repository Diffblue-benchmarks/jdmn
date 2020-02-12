package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HitPolicyDiffblueTest {
  @Test(timeout=10000)
  public void valueTest() {
    // Arrange, Act and Assert
    assertEquals("UNIQUE", HitPolicy.UNIQUE.value());
  }

  @Test(timeout=10000)
  public void fromValueTest() {
    // Arrange, Act and Assert
    assertEquals(HitPolicy.UNKNOWN, HitPolicy.fromValue("foo"));
  }
}

