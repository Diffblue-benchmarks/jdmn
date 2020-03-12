package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PairDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("Pair(left, left)", (new Pair<Object, Object>("left", "left")).toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Pair<Object, Object>("left", "left")).equals("left"));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(106169505, (new Pair<Object, Object>("left", "left")).hashCode());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Pair(left, left)", (new Pair<Object, Object>("left", "left")).toString());
  }
}

