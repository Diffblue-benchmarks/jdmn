package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PairComparatorDiffblueTest {
  @Test(timeout=10000)
  public void compareTest() {
    // Arrange
    PairComparator<Object> pairComparator = new PairComparator<Object>();
    Pair<Object, Integer> o1 = new Pair<Object, Integer>("foo", Integer.valueOf(1));

    // Act and Assert
    assertEquals(0, pairComparator.compare(o1, new Pair<Object, Integer>("foo", Integer.valueOf(1))));
  }
}

