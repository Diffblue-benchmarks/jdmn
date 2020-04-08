package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DateAndTimeUtilDiffblueTest {
  @Test
  public void testDateAndTime() {
    // Arrange, Act and Assert
    assertTrue(DateAndTimeUtil.dateAndTime(new Integer(1), new Integer(1), new Integer(1), new Integer(1),
        new Integer(1), new Integer(1)) instanceof java.time.LocalDateTime);
  }

  @Test
  public void testDateAndTime2() {
    // Arrange, Act and Assert
    assertTrue(DateAndTimeUtil.dateAndTime(new Integer(1), new Integer(1), new Integer(1), new Integer(1),
        new Integer(1), new Integer(1), "T") instanceof java.time.ZonedDateTime);
  }

  @Test
  public void testDateAndTime3() {
    // Arrange, Act and Assert
    assertTrue(DateAndTimeUtil.dateAndTime(new Integer(1), new Integer(1), new Integer(1), new Integer(1),
        new Integer(1), new Integer(1), new Integer(1)) instanceof java.time.OffsetDateTime);
  }
}

