package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class NamedArgumentsDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    Map<String, Object> arguments = (new NamedArguments(null)).getArguments();
    assertTrue(arguments instanceof java.util.LinkedHashMap);
    assertEquals(0, arguments.size());
  }

  @Test(timeout=10000)
  public void getArgumentsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NamedArguments()).getArguments().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    Map<String, Object> arguments = (new NamedArguments()).getArguments();
    assertTrue(arguments instanceof java.util.LinkedHashMap);
    assertEquals(0, arguments.size());
  }
}

