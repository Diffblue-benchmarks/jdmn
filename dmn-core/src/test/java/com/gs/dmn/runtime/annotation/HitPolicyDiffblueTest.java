package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HitPolicyDiffblueTest {
  @Test
  public void testFromValue() {
    // Arrange, Act and Assert
    assertEquals(HitPolicy.UNIQUE, HitPolicy.fromValue("UNIQUE"));
    assertEquals(HitPolicy.UNIQUE, HitPolicy.fromValue("UNIQUE"));
    assertEquals(HitPolicy.UNIQUE, HitPolicy.fromValue("UNIQUE"));
  }
}

