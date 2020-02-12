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
    // Arrange
    HitPolicy actualFromValueResult = HitPolicy.fromValue("foo");

    // Act and Assert
    assertEquals(HitPolicy.UNKNOWN, actualFromValueResult);
    assertEquals(HitPolicy.UNIQUE, HitPolicy.fromValue("UNIQUE"));
  }
}

