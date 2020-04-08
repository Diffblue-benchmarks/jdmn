package com.gs.dmn.runtime.cache;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DefaultCacheDiffblueTest {
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertFalse((new DefaultCache()).contains("key"));
  }

  @Test
  public void testLookup() {
    // Arrange, Act and Assert
    assertNull((new DefaultCache()).lookup("key"));
  }
}

