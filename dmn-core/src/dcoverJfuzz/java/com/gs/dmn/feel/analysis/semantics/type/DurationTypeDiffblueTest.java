package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DurationTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    DurationType durationType = new DurationType("name");

    // Act and Assert
    assertFalse(durationType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DurationType actualDurationType = new DurationType("name");

    // Assert
    String actualName = actualDurationType.getName();
    assertEquals("name", actualName);
    assertEquals("duration", actualDurationType.getConversionFunction());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    DurationType durationType = new DurationType("name");

    // Act and Assert
    assertFalse(durationType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(DurationType.getMemberType(new AnyType(), "foo"));
  }
}

