package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringEscapeUtilDiffblueTest {
  @Test
  public void escapeFEELTest() {
    // Arrange
    String actualEscapeFEELResult = StringEscapeUtil.escapeFEEL("value");
    String actualEscapeFEELResult1 = StringEscapeUtil.escapeFEEL("\\");
    String actualEscapeFEELResult2 = StringEscapeUtil.escapeFEEL("\\X");

    // Act and Assert
    assertEquals("value", actualEscapeFEELResult);
    assertEquals("\\\\", actualEscapeFEELResult1);
    assertEquals("\\\\X", actualEscapeFEELResult2);
    assertEquals("", StringEscapeUtil.escapeFEEL(""));
  }

  @Test
  public void escapeInStringTest() {
    // Arrange
    String actualEscapeInStringResult = StringEscapeUtil.escapeInString("\\");
    String actualEscapeInStringResult1 = StringEscapeUtil.escapeInString("\\X");
    String actualEscapeInStringResult2 = StringEscapeUtil.escapeInString("\\\\");
    String actualEscapeInStringResult3 = StringEscapeUtil.escapeInString("\\\\X");

    // Act and Assert
    assertEquals("\\\\", actualEscapeInStringResult);
    assertEquals("\\\\X", actualEscapeInStringResult1);
    assertEquals("\\\\", actualEscapeInStringResult2);
    assertEquals("\\\\X", actualEscapeInStringResult3);
    assertEquals("", StringEscapeUtil.escapeInString(""));
  }

  @Test
  public void unescapeFEELTest() {
    // Arrange
    String actualUnescapeFEELResult = StringEscapeUtil.unescapeFEEL("\\");
    String actualUnescapeFEELResult1 = StringEscapeUtil.unescapeFEEL("\\X");
    String actualUnescapeFEELResult2 = StringEscapeUtil.unescapeFEEL("\\\\X");

    // Act and Assert
    assertEquals("\\", actualUnescapeFEELResult);
    assertEquals("\\X", actualUnescapeFEELResult1);
    assertEquals("\\X", actualUnescapeFEELResult2);
    assertEquals("", StringEscapeUtil.unescapeFEEL(""));
  }
}

