package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DurationTypeDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange, Act and Assert
    assertFalse((new DurationType("days and time duration")).equivalentTo(new DurationType("days and time duration")));
    assertFalse((new DurationType("days and time duration")).equivalentTo(new DurationType("days and time duration")));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    DurationType other = new DurationType("days and time duration");

    // Act and Assert
    assertFalse((new DurationType("yearMonthDuration")).equivalentTo(other));
  }

  @Test
  public void testConformsTo() {
    // Arrange, Act and Assert
    assertFalse((new DurationType("days and time duration")).conformsTo(new DurationType("days and time duration")));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    DurationType durationType = new DurationType("days and time duration");

    // Act and Assert
    assertFalse(durationType.conformsTo(new NumberType()));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    DurationType durationType = new DurationType("days and time duration");

    // Act and Assert
    assertFalse(durationType.conformsTo(new DurationType("years and months duration")));
  }

  @Test
  public void testGetMemberType() {
    // Arrange, Act and Assert
    assertNull(DurationType.getMemberType(new DurationType("days and time duration"), "seconds"));
    assertNull(DurationType.getMemberType(new DurationType("years and months duration"), "years"));
  }
}

