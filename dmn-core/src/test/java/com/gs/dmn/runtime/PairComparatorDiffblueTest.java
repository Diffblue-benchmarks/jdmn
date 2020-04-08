package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PairComparatorDiffblueTest {
  @Test
  public void testCompare() {
    // Arrange
    PairComparator<Object> pairComparator = new PairComparator<Object>();
    Pair<Object, Integer> o1 = new Pair<Object, Integer>("left", null);

    // Act and Assert
    assertEquals(1, pairComparator.compare(o1, new Pair<Object, Integer>("left", 1)));
  }

  @Test
  public void testCompare2() {
    // Arrange
    PairComparator<Object> pairComparator = new PairComparator<Object>();
    Pair<Object, Integer> o1 = new Pair<Object, Integer>("left", 1);

    // Act and Assert
    assertEquals(-1, pairComparator.compare(o1, new Pair<Object, Integer>("left", null)));
  }

  @Test
  public void testCompare3() {
    // Arrange
    PairComparator<Object> pairComparator = new PairComparator<Object>();
    Pair<Object, Integer> o1 = new Pair<Object, Integer>("left", null);

    // Act and Assert
    assertEquals(0, pairComparator.compare(o1, new Pair<Object, Integer>("left", null)));
  }

  @Test
  public void testCompare4() {
    // Arrange
    PairComparator<Object> pairComparator = new PairComparator<Object>();
    Pair<Object, Integer> o1 = new Pair<Object, Integer>("left", 1);

    // Act and Assert
    assertEquals(0, pairComparator.compare(o1, new Pair<Object, Integer>("left", 1)));
  }
}

