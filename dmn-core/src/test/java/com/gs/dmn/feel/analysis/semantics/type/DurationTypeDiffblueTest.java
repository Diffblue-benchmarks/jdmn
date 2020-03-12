package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DurationTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    DurationType durationType = new DurationType("dayTimeDuration");

    // Act and Assert
    assertFalse(durationType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DurationType actualDurationType = new DurationType("dayTimeDuration");

    // Assert
    assertEquals("dayTimeDuration", actualDurationType.getName());
    assertEquals("duration", actualDurationType.getConversionFunction());
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    DurationType durationType = new DurationType("dayTimeDuration");

    // Act and Assert
    assertFalse(durationType.equivalentTo(new AnyType()));
  }

  @Test
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(DurationType.getMemberType(new AnyType(), "dayTimeDuration"));
  }
}

