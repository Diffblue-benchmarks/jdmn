package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParameterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType(), false, true);

    // Assert
    assertFalse(actualParameter.isOptional());
    assertTrue(actualParameter.isVarArg());
    assertEquals("name -> Any, false, true)", actualParameter.toString());
    assertEquals("name", actualParameter.getName());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType(), true, false);

    // Assert
    assertTrue(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("name -> Any, true, false)", actualParameter.toString());
    assertEquals("name", actualParameter.getName());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    new Parameter("name", new AnyType(), true, true);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType());

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("name -> Any, false, false)", actualParameter.toString());
    assertEquals("name", actualParameter.getName());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("name -> Any, false, false)", (new Parameter("name", new AnyType())).toString());
  }
}

