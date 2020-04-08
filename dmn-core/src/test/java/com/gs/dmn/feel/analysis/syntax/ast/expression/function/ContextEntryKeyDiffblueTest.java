package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContextEntryKeyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("key", (new ContextEntryKey("key")).getKey());
  }
}

