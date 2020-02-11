package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringEscapeUtilDiffblueTest {
  @Test(timeout=10000)
  public void unescapeFEELTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringEscapeUtil.unescapeFEEL("foo"));
  }

  @Test(timeout=10000)
  public void escapeFEELTest() {
    // Arrange, Act and Assert
    assertEquals("value", StringEscapeUtil.escapeFEEL("value"));
  }

  @Test(timeout=10000)
  public void escapeInStringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringEscapeUtil.escapeInString("foo"));
  }
}

