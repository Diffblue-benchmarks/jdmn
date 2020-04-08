package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DateUtilDiffblueTest {
  @Test
  public void testDate() {
    // Arrange, Act and Assert
    assertTrue(DateUtil.date(new Integer(1), new Integer(1), new Integer(1)) instanceof java.time.LocalDate);
  }
}

