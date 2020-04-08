package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PositionalParameterConversionsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new PositionalParameterConversions()).equals("o"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new PositionalParameterConversions()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(32, (new PositionalParameterConversions()).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
  }
}

