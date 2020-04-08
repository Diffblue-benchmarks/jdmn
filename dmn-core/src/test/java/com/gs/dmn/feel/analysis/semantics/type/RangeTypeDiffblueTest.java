package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RangeTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType()).toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    RangeType rangeType = new RangeType(new AnyType());

    // Act
    RangeType actualRangeType = new RangeType(null);

    // Assert
    assertTrue(rangeType.isValid());
    assertEquals("RangeType(number)", actualRangeType.toString());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertTrue(rangeType.equivalentTo(new RangeType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.equivalentTo(new RangeType(new AnyType())));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.conformsTo(new RangeType(new AnyType())));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertFalse(rangeType.conformsTo(new AnyType()));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    RangeType rangeType = new RangeType();

    // Act and Assert
    assertTrue(rangeType.conformsTo(new RangeType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new RangeType()).isValid());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new RangeType()).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new RangeType()).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(1994452726, (new RangeType()).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType()).toString());
  }
}

