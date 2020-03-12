package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RangeTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new RangeType(new AnyType())).isValid());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new RangeType()).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.equivalentTo(new AnyType()));
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new RangeType()).isValid());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType()).toString());
  }
}

