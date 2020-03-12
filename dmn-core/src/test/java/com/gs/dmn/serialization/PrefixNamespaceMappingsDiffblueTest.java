package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class PrefixNamespaceMappingsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Map<String, String> stringStringMap = (new PrefixNamespaceMappings()).mappings;
    assertTrue(stringStringMap instanceof java.util.LinkedHashMap);
    assertEquals(0, stringStringMap.size());
  }

  @Test
  public void getPrefixTest() {
    // Arrange, Act and Assert
    assertNull((new PrefixNamespaceMappings()).getPrefix("namespace"));
  }

  @Test
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new PrefixNamespaceMappings()).get("prefix"));
  }
}

