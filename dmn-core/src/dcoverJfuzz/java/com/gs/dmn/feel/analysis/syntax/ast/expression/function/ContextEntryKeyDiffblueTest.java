package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ContextEntryKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ContextEntryKey contextEntryKey = new ContextEntryKey("foo");
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertEquals("foo", ((ContextEntryKey) contextEntryKey.accept(visitor, FEELContext.makeContext(null))).getKey());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ContextEntryKey("foo")).getKey());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    new ContextEntryKey("\"");
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ContextEntryKey(foo)", (new ContextEntryKey("foo")).toString());
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ContextEntryKey("foo")).getKey());
  }
}

