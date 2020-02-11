package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PositionalParameterTypesDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new PositionalParameterTypes(null)).equals("foo"));
  }

  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterTypes(null)).size());
  }

  @Test(timeout=10000)
  public void getTypesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterTypes(null)).getTypes().size());
  }

  @Test(timeout=10000)
  public void candidatesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterTypes(null)).candidates().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterTypes()", (new PositionalParameterTypes(null)).toString());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(32, (new PositionalParameterTypes(null)).hashCode());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterTypes()", (new PositionalParameterTypes(null)).toString());
  }
}

