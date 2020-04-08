package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
  public void testEquals3() {
    // Arrange
    Pair pair = new Pair(0, 1);

    // Act and Assert
    assertFalse(pair.equals(new Pair(0, 0)));
  }

  @Test
  public void testEquals4() {
    // Arrange
    Pair pair = new Pair(0, 0);

    // Act and Assert
    assertTrue(pair.equals(new Pair(0, 0)));
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

