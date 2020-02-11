package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InterpretedRuleOutputDiffblueTest {
  @Test(timeout=10000)
  public void getResultTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new InterpretedRuleOutput(true, "foo")).getResult());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new InterpretedRuleOutput(true, "foo")).equals("foo"));
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(140696, (new InterpretedRuleOutput(true, "foo")).hashCode());
  }

  @Test(timeout=10000)
  public void sortTest() {
    // Arrange, Act and Assert
    assertNull((new InterpretedRuleOutput(true, "foo")).sort(null));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("(matched=true, result='foo')", (new InterpretedRuleOutput(true, "foo")).toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    InterpretedRuleOutput actualInterpretedRuleOutput = new InterpretedRuleOutput(true, "foo");

    // Assert
    String actualToStringResult = actualInterpretedRuleOutput.toString();
    assertEquals("(matched=true, result='foo')", actualToStringResult);
    assertTrue(actualInterpretedRuleOutput.isMatched());
  }
}

