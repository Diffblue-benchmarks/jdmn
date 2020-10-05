package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RangeTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new RangeType(new NumberType())).toString());
    assertEquals("RangeType(string)", (new RangeType(new StringType())).toString());
    assertEquals("RangeType(date)", (new RangeType(new DateType())).toString());
  }
}

