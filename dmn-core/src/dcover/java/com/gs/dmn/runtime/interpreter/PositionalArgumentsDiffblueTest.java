package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PositionalArgumentsDiffblueTest {
  @Test(timeout=10000)
  public void argumentListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalArguments()).argumentList(null).size());
  }

  @Test(timeout=10000)
  public void getArgumentsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalArguments()).getArguments().size());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    List<Object> arguments = (new PositionalArguments(null)).getArguments();
    assertTrue(arguments instanceof ArrayList);
    assertEquals(0, arguments.size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    List<Object> arguments = (new PositionalArguments()).getArguments();
    assertTrue(arguments instanceof java.util.ArrayList);
    assertEquals(0, arguments.size());
  }
}

