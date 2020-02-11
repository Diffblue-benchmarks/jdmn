package com.gs.dmn.feel.lib;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void timeTest2() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    TimeUtil.time(null, null, null, null);
  }
  @Test(timeout=10000)
  public void timeTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    TimeUtil.time("foo");
  }
}

