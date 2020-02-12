package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TimeTypeDiffblueTest {
  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    TimeType timeType = new TimeType();

    // Act and Assert
    assertFalse(timeType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TimeType actualTimeType = new TimeType();

    // Assert
    String actualName = actualTimeType.getName();
    assertEquals("time", actualName);
    assertEquals("time", actualTimeType.getConversionFunction());
  }

  @Test(timeout=10000)
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull(TimeType.getMemberType("foo"));
  }
}

