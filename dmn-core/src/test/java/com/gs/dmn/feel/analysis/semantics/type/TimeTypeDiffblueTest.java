package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TimeTypeDiffblueTest {
  @Test
  public void testGetMemberType() {
    // Arrange, Act and Assert
    assertNull(TimeType.getMemberType("time"));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    TimeType actualTimeType = new TimeType();

    // Assert
    assertEquals("time", actualTimeType.getName());
    assertEquals("time", actualTimeType.getConversionFunction());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    TimeType timeType = new TimeType();

    // Act and Assert
    assertFalse(timeType.equivalentTo(new AnyType()));
  }
}

