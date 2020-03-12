package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AnyDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Any()", (new Any()).toString());
  }
}

