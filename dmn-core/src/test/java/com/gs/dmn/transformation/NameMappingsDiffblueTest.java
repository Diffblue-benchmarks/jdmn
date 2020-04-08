package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NameMappingsDiffblueTest {
  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull((new NameMappings()).get("name"));
  }

  @Test
  public void testKeys() {
    // Arrange, Act and Assert
    assertEquals(0, (new NameMappings()).keys().size());
  }

  @Test
  public void testValues() {
    // Arrange, Act and Assert
    assertEquals(0, (new NameMappings()).values().size());
  }
}

