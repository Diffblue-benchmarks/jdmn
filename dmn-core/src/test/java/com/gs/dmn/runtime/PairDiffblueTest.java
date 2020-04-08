package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PairDiffblueTest {
  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Pair<Object, Object>("left", "left")).equals("left"));
  }

  @Test
  public void testEquals2() {
    // Arrange
    Pair pair = new Pair("left", "left");

    // Act and Assert
    assertFalse((new Pair<Object, Object>(pair, pair)).equals(pair));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Pair(left, left)", (new Pair<Object, Object>("left", "left")).toString());
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(106169505, (new Pair<Object, Object>("left", "left")).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Pair(left, left)", (new Pair<Object, Object>("left", "left")).toString());
  }
}

