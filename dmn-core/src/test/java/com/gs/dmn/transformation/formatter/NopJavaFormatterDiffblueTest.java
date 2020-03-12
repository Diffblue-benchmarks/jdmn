package com.gs.dmn.transformation.formatter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NopJavaFormatterDiffblueTest {
  @Test
  public void formatSourceTest() {
    // Arrange, Act and Assert
    assertEquals("code", (new NopJavaFormatter()).formatSource("code"));
  }
}

