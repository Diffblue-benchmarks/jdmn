package com.gs.dmn.runtime.listener;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RuleDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Rule actualRule = new Rule(1, "annotation");

    // Assert
    assertEquals("annotation", actualRule.getAnnotation());
    assertEquals(1, actualRule.getIndex());
  }
}

