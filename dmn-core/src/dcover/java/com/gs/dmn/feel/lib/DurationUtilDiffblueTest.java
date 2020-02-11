package com.gs.dmn.feel.lib;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DurationUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void durationTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DurationUtil.duration("foo");
  }
}

