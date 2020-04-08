package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class NamedArgumentsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    Map<String, Object> arguments = (new NamedArguments()).getArguments();
    assertTrue(arguments instanceof java.util.LinkedHashMap);
    assertEquals(0, arguments.size());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    Map<String, Object> arguments = (new NamedArguments(null)).getArguments();
    assertTrue(arguments instanceof java.util.LinkedHashMap);
    assertEquals(0, arguments.size());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertSame(stringObjectMap, (new NamedArguments(stringObjectMap)).getArguments());
  }
}

