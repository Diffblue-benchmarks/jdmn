package com.gs.dmn.feel.lib;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateAndTimeUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void dateAndTimeTest4() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DateAndTimeUtil.dateAndTime(null, null, null, null, null, null, (Number) null);
  }
  @Test(timeout=10000)
  public void dateAndTimeTest3() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DateAndTimeUtil.dateAndTime(null, null, null, null, null, null, "foo");
  }
  @Test(timeout=10000)
  public void dateAndTimeTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateAndTimeUtil.dateAndTime("foo");
  }
  @Test(timeout=10000)
  public void dateAndTimeTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DateAndTimeUtil.dateAndTime(null, null, null, null, null, null);
  }
}

