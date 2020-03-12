package com.gs.dmn.feel.lib;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void dateTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtil.date("^-?(([1-9]\\d\\d\\d+)|(0\\d\\d\\d))-");
  }
}

