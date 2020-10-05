package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AnyTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertFalse(anyType.equivalentTo(new ListType(anyType)));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertFalse(anyType.equivalentTo(new ListType(anyType)));
  }
}

