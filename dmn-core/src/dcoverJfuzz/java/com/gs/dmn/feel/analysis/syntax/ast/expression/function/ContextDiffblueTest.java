package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ContextDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    Context context = new Context(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = context.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((Context) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Context()", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void toMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context(null)).toMap().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Context actualContext = new Context(null);

    // Assert
    Type type = actualContext.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Context()", actualContext.toString());
  }

  @Test(timeout=10000)
  public void getEntriesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context(null)).getEntries().size());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Context()", (new Context(null)).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    Context context = new Context(null);

    // Act
    context.deriveType(null);

    // Assert
    Type type = context.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ContextType);
    assertEquals("ContextType()", type.toString());
  }

  @Test(timeout=10000)
  public void entryTest() {
    // Arrange, Act and Assert
    assertNull((new Context(null)).entry("name"));
  }
}

