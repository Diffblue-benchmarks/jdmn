package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DateTypeDiffblueTest {
  @Test
  public void testGetMemberType() {
    // Arrange and Act
    Type actualMemberType = DateType.getMemberType("day");

    // Assert
    assertSame(((NumberType) actualMemberType).NUMBER, actualMemberType);
  }

  @Test
  public void testGetMemberType2() {
    // Arrange and Act
    Type actualMemberType = DateType.getMemberType("month");

    // Assert
    assertSame(((NumberType) actualMemberType).NUMBER, actualMemberType);
  }

  @Test
  public void testGetMemberType3() {
    // Arrange and Act
    Type actualMemberType = DateType.getMemberType("year");

    // Assert
    assertSame(((NumberType) actualMemberType).NUMBER, actualMemberType);
  }

  @Test
  public void testEquivalentTo() {
    // Arrange, Act and Assert
    assertFalse((new DateType()).equivalentTo(new DateType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    ListType other = new ListType(new NumberType());

    // Act and Assert
    assertFalse((new DateType()).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    ListType other = new ListType(new StringType());

    // Act and Assert
    assertFalse((new DateType()).equivalentTo(other));
  }

  @Test
  public void testConformsTo() {
    // Arrange, Act and Assert
    assertFalse((new DateType()).conformsTo(new DateType()));
  }
}

