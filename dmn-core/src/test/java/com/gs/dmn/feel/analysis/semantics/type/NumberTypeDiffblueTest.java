package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NumberTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange, Act and Assert
    assertFalse((new NumberType()).equivalentTo(new NumberType()));
    assertFalse((new NumberType()).equivalentTo(new NumberType()));
    assertFalse((new NumberType()).equivalentTo(new NumberType()));
  }
}

