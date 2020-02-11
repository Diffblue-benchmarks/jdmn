package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PairDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Pair<Object, Object>("foo", "foo")).equals("foo"));
  }

  @Test(timeout=10000)
  public void getRightTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Pair<Object, Object>("foo", "foo")).getRight());
  }

  @Test(timeout=10000)
  public void getLeftTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Pair<Object, Object>("foo", "foo")).getLeft());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("Pair(foo, foo)", (new Pair<Object, Object>("foo", "foo")).toString());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(3251329, (new Pair<Object, Object>("foo", "foo")).hashCode());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Pair(foo, foo)", (new Pair<Object, Object>("foo", "foo")).toString());
  }
}

