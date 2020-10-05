package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringEscapeUtilDiffblueTest {
  @Test
  public void testEscapeFEEL() {
    // Arrange, Act and Assert
    assertEquals("Hello ", StringEscapeUtil.escapeFEEL("Hello "));
    assertEquals("You are ", StringEscapeUtil.escapeFEEL("You are "));
    assertEquals("Medium", StringEscapeUtil.escapeFEEL("Medium"));
  }

  @Test
  public void testEscapeInString() {
    // Arrange, Act and Assert
    assertEquals("principal", StringEscapeUtil.escapeInString("principal"));
    assertEquals("rate", StringEscapeUtil.escapeInString("rate"));
    assertEquals("termMonths", StringEscapeUtil.escapeInString("termMonths"));
  }

  @Test
  public void testStripQuotes() {
    // Arrange, Act and Assert
    assertEquals("Hello ", StringEscapeUtil.stripQuotes("\"Hello \""));
    assertEquals("You are ", StringEscapeUtil.stripQuotes("\"You are \""));
    assertEquals("Medium", StringEscapeUtil.stripQuotes("\"Medium\""));
  }

  @Test
  public void testUnescapeFEEL() {
    // Arrange, Act and Assert
    assertEquals("Hello ", StringEscapeUtil.unescapeFEEL("\"Hello \""));
    assertEquals("You are ", StringEscapeUtil.unescapeFEEL("\"You are \""));
    assertEquals("Medium", StringEscapeUtil.unescapeFEEL("\"Medium\""));
  }
}

