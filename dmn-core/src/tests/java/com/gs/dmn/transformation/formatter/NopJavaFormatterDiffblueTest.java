package com.gs.dmn.transformation.formatter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NopJavaFormatterDiffblueTest {
  @Test(timeout=10000)
  public void formatSourceTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NopJavaFormatter()).formatSource("foo"));
  }
}

