package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringEscapeUtilDiffblueTest {
  @Test(timeout=10000)
  public void unescapeFEELTest() {
    // Arrange
    String actualUnescapeFEELResult = StringEscapeUtil.unescapeFEEL("foo");

    // Act and Assert
    assertEquals("foo", actualUnescapeFEELResult);
    assertEquals("", StringEscapeUtil.unescapeFEEL(""));
  }

  @Test(timeout=10000)
  public void escapeFEELTest() {
    // Arrange
    String actualEscapeFEELResult = StringEscapeUtil.escapeFEEL("value");

    // Act and Assert
    assertEquals("value", actualEscapeFEELResult);
    assertEquals("", StringEscapeUtil.escapeFEEL(""));
  }

  @Test(timeout=10000)
  public void escapeInStringTest() {
    // Arrange
    String actualEscapeInStringResult = StringEscapeUtil.escapeInString("foo");

    // Act and Assert
    assertEquals("foo", actualEscapeInStringResult);
    assertEquals("", StringEscapeUtil.escapeInString(""));
  }
}

