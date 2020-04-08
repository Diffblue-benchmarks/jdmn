package com.gs.dmn.transformation.formatter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GoogleJavaFormatterDiffblueTest {
  @Test
  public void testFormatSource() {
    // Arrange, Act and Assert
    assertEquals("\n", (new GoogleJavaFormatter()).formatSource(""));
  }
}

