package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
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
  public void testConstructor2() {
    // Arrange, Act and Assert
    Map<String, String> stringStringMap = (new PrefixNamespaceMappings()).mappings;
    assertTrue(stringStringMap instanceof java.util.LinkedHashMap);
    assertEquals(0, stringStringMap.size());
  }

  @Test
  public void testConstructor3() {
    // Arrange, Act and Assert
    Map<String, String> stringStringMap = (new PrefixNamespaceMappings()).mappings;
    assertTrue(stringStringMap instanceof java.util.LinkedHashMap);
    assertEquals(0, stringStringMap.size());
  }
}

