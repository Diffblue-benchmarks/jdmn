package com.gs.dmn.feel.lib;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void dateTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtil.date("foo");
  }
  @Test(timeout=10000)
  public void dateTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtil.date(null, null, null);
  }
}

