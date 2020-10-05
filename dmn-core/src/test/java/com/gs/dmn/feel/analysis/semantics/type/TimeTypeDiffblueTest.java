package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TimeTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange, Act and Assert
    assertFalse((new TimeType()).equivalentTo(new TimeType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    ListType other = new ListType(new NumberType());

    // Act and Assert
    assertFalse((new TimeType()).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    ListType other = new ListType(new StringType());

    // Act and Assert
    assertFalse((new TimeType()).equivalentTo(other));
  }
}

