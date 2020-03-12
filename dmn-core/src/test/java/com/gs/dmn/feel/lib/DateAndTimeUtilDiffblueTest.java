package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateAndTimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateAndTimeUtil.dateAndTime("T");
  }
  @Test
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DateAndTimeUtil.dateAndTime(new Integer(0), new Integer(0), new Integer(0), new Integer(0), new Integer(0),
        new Integer(0), new Integer(0));
  }
  @Test
  public void dateAndTimeTest3() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DateAndTimeUtil.dateAndTime(new Integer(1143), new Integer(1143), new Integer(1143), new Integer(1143),
        new Integer(1143), new Integer(1143), new Integer(1143));
  }
  @Test
  public void dateAndTimeTest4() {
    // Arrange, Act and Assert
    assertTrue(DateAndTimeUtil.dateAndTime(new Integer(1), new Integer(1), new Integer(1), new Integer(1),
        new Integer(1), new Integer(1), new Integer(1)) instanceof java.time.OffsetDateTime);
  }
}

