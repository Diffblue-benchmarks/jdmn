package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ContextEntryKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("key", (new ContextEntryKey("key")).getKey());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    new ContextEntryKey("\"");
  }
}

