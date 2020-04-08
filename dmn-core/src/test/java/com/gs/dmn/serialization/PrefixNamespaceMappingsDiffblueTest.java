package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class PrefixNamespaceMappingsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    Map<String, String> stringStringMap = (new PrefixNamespaceMappings()).mappings;
    assertTrue(stringStringMap instanceof java.util.LinkedHashMap);
    assertEquals(0, stringStringMap.size());
  }

  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull((new PrefixNamespaceMappings()).get("prefix"));
  }

  @Test
  public void testGetPrefix() {
    // Arrange, Act and Assert
    assertNull((new PrefixNamespaceMappings()).getPrefix("namespace"));
  }
}

