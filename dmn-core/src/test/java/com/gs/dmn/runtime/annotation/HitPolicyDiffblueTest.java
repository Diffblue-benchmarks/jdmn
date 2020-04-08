package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HitPolicyDiffblueTest {
  @Test
  public void testFromValue() {
    // Arrange
    HitPolicy actualFromValueResult = HitPolicy.fromValue("ANY");

    // Act and Assert
    assertEquals(HitPolicy.ANY, actualFromValueResult);
    assertEquals(HitPolicy.UNKNOWN, HitPolicy.fromValue("OUTPUT_ORDER"));
  }

  @Test
  public void testValue() {
    // Arrange, Act and Assert
    assertEquals("UNIQUE", HitPolicy.UNIQUE.value());
  }
}

