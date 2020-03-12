package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertTrue;
import java.time.temporal.TemporalAccessor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    TimeUtil.time("literal");
  }
  @Test
  public void timeTest2() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    TimeUtil.time((TemporalAccessor) null);
  }
  @Test
  public void timeTest3() {
    // Arrange, Act and Assert
    assertTrue(TimeUtil.time(new Integer(1), new Integer(1), new Integer(1), null) instanceof java.time.LocalTime);
  }
  @Test
  public void timeTest4() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    TimeUtil.time(null, null, null, null);
  }
  @Test
  public void timeTest5() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    TimeUtil.time(new Integer(1145), new Integer(1145), new Integer(1145), null);
  }
}

