package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.math.BigDecimal;
import org.junit.Test;

public class AssertDiffblueTest {
  @Test
  public void roundUpTest() {
    // Arrange and Act
    Object actualRoundUpResult = Assert.roundUp(BigDecimal.valueOf(1L));

    // Assert
    assertSame(((BigDecimal) actualRoundUpResult).ONE, actualRoundUpResult);
    assertEquals("1", actualRoundUpResult.toString());
  }
}

