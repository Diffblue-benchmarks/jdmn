package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StandardNativeTypeFactoryDiffblueTest {
  @Test
  public void testToNativeType() {
    // Arrange, Act and Assert
    assertEquals("String", (new StandardNativeTypeFactory()).toNativeType("string"));
    assertEquals("String", (new StandardNativeTypeFactory()).toNativeType("string"));
    assertEquals("java.math.BigDecimal", (new StandardNativeTypeFactory()).toNativeType("number"));
  }
}

