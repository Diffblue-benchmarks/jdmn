package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Map;
import org.junit.Test;

public class NamedParameterConversionsDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new NamedParameterConversions()).equals("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})",
        (new NamedParameterConversions((Map<String, Conversion>) null)).toString());
  }

  @Test(timeout=10000)
  public void getConversionsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NamedParameterConversions()).getConversions().size());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new NamedParameterConversions()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})", (new NamedParameterConversions()).toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})", (new NamedParameterConversions()).toString());
  }
}

