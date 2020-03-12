package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class EnumerationTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("enumeration", (new EnumerationType()).getName());
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    EnumerationType enumerationType = new EnumerationType();

    // Act and Assert
    assertFalse(enumerationType.equivalentTo(new AnyType()));
  }
}

