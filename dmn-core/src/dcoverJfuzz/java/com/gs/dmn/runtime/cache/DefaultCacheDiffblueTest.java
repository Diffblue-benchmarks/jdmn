package com.gs.dmn.runtime.cache;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DefaultCacheDiffblueTest {
  @Test(timeout=10000)
  public void lookupTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultCache()).lookup("foo"));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertFalse((new DefaultCache()).contains("foo"));
  }
}

