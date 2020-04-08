package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.ArrayList;
import org.junit.Test;

public class ContextDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Context actualContext = new Context(null);

    // Assert
    assertTrue(actualContext.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Context()", actualContext.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<ContextEntry> contextEntryList = new ArrayList<ContextEntry>();
    contextEntryList.add(new ContextEntry(null, new ExpressionList()));

    // Act and Assert
    assertTrue((new Context(contextEntryList)).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testEntry() {
    // Arrange, Act and Assert
    assertNull((new Context(null)).entry("name"));
  }

  @Test
  public void testToMap() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context(null)).toMap().size());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    Context context = new Context(null);

    // Act
    context.deriveType(null);

    // Assert
    Type type = context.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ContextType);
    assertEquals("ContextType()", type.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    Context context = new Context(null);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = context.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(((Context) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Context()", actualAcceptResult.toString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Context()", (new Context(null)).toString());
  }
}

