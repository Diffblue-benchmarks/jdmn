package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NamedParameterTypesDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new NamedParameterTypes(null)).equals("foo"));
  }

  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NamedParameterTypes(null)).size());
  }

  @Test(timeout=10000)
  public void candidatesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NamedParameterTypes(null)).candidates().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterTypes()", (new NamedParameterTypes(null)).toString());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new NamedParameterTypes(null)).hashCode());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new NamedParameterTypes(null)).getType("name"));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterTypes()", (new NamedParameterTypes(null)).toString());
  }
}

