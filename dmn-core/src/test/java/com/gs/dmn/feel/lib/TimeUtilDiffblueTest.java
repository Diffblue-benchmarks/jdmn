package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TimeUtilDiffblueTest {
  @Test
  public void testTime() {
    // Arrange, Act and Assert
    assertTrue(TimeUtil.time(new Integer(1), new Integer(1), new Integer(1), null) instanceof java.time.LocalTime);
  }
}

