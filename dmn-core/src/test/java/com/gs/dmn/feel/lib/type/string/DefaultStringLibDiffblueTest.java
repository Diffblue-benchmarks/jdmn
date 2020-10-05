package com.gs.dmn.feel.lib.type.string;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;

public class DefaultStringLibDiffblueTest {
  @Test
  public void testString() {
    // Arrange
    BigDecimal from = new BigDecimal("10000");

    // Act and Assert
    assertEquals("10000", (new DefaultStringLib()).string(from));
  }

  @Test
  public void testString2() {
    // Arrange
    BigDecimal from = new BigDecimal("120000");

    // Act and Assert
    assertEquals("120000", (new DefaultStringLib()).string(from));
  }

  @Test
  public void testString3() {
    // Arrange
    BigDecimal from = new BigDecimal("18");

    // Act and Assert
    assertEquals("18", (new DefaultStringLib()).string(from));
  }
}

