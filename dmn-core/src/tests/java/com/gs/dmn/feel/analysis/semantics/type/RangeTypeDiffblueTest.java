package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RangeTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new RangeType()).equals("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new RangeType(new AnyType())).isValid());
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new RangeType()).isValid());
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void getRangeTypeTest() {
    // Arrange and Act
    Type actualRangeType = (new RangeType()).getRangeType();

    // Assert
    assertSame(((NumberType) actualRangeType).NUMBER, actualRangeType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType()).toString());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType()).toString());
  }
}

