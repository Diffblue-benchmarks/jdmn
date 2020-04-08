package com.gs.dmn.runtime.listener;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArgumentsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new Arguments()).size());
  }

  @Test
  public void testToString() {
    // Arrange
    Arguments arguments = new Arguments();
    arguments.put("foo", "foo");

    // Act and Assert
    assertEquals("foo='foo'", arguments.toString());
  }
}

