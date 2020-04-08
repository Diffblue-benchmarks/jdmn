package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ParameterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType(), true, false);

    // Assert
    assertTrue(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("name -> Any, true, false)", actualParameter.toString());
    assertEquals("name", actualParameter.getName());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType(), false, true);

    // Assert
    assertFalse(actualParameter.isOptional());
    assertTrue(actualParameter.isVarArg());
    assertEquals("name -> Any, false, true)", actualParameter.toString());
    assertEquals("name", actualParameter.getName());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType());

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("name -> Any, false, false)", actualParameter.toString());
    assertEquals("name", actualParameter.getName());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("name -> Any, false, false)", (new Parameter("name", new AnyType())).toString());
  }
}

