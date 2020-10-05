package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.ArrayList;
import org.junit.Test;

public class PositionalParameterTypesDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterTypes()", (new PositionalParameterTypes(new ArrayList<Type>())).toString());
    assertEquals("PositionalParameterTypes()", (new PositionalParameterTypes(new ArrayList<Type>())).toString());
    assertEquals("PositionalParameterTypes()", (new PositionalParameterTypes(new ArrayList<Type>())).toString());
  }

  @Test
  public void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterTypes(new ArrayList<Type>())).size());
    assertEquals(0, (new PositionalParameterTypes(new ArrayList<Type>())).size());
    assertEquals(0, (new PositionalParameterTypes(new ArrayList<Type>())).size());
  }

  @Test
  public void testCompatible() {
    // Arrange
    PositionalParameterTypes positionalParameterTypes = new PositionalParameterTypes(new ArrayList<Type>());

    // Act and Assert
    assertTrue(positionalParameterTypes.compatible(new ArrayList<FormalParameter>()));
  }

  @Test
  public void testCompatible2() {
    // Arrange
    PositionalParameterTypes positionalParameterTypes = new PositionalParameterTypes(new ArrayList<Type>());

    // Act and Assert
    assertTrue(positionalParameterTypes.compatible(new ArrayList<FormalParameter>()));
  }

  @Test
  public void testCompatible3() {
    // Arrange
    PositionalParameterTypes positionalParameterTypes = new PositionalParameterTypes(new ArrayList<Type>());

    // Act and Assert
    assertTrue(positionalParameterTypes.compatible(new ArrayList<FormalParameter>()));
  }

  @Test
  public void testCandidates() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterTypes(new ArrayList<Type>())).candidates().size());
    assertEquals(0, (new PositionalParameterTypes(new ArrayList<Type>())).candidates().size());
    assertEquals(0, (new PositionalParameterTypes(new ArrayList<Type>())).candidates().size());
  }
}

