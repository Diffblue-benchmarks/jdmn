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

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType());

    // Assert
    String actualToStringResult = actualParameter.toString();
    String actualName = actualParameter.getName();
    boolean actualIsVarArgResult = actualParameter.isVarArg();
    assertFalse(actualParameter.isOptional());
    assertFalse(actualIsVarArgResult);
    assertEquals("name -> Any, false, false)", actualToStringResult);
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void isOptionalTest() {
    // Arrange, Act and Assert
    assertFalse((new Parameter("name", new AnyType())).isOptional());
  }

  @Test(timeout=10000)
  public void isVarArgTest() {
    // Arrange, Act and Assert
    assertFalse((new Parameter("name", new AnyType())).isVarArg());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("name -> Any, false, false)", (new Parameter("name", new AnyType())).toString());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    new Parameter("name", new AnyType(), true, true);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("name", new AnyType(), false, true);

    // Assert
    String actualToStringResult = actualParameter.toString();
    String actualName = actualParameter.getName();
    boolean actualIsVarArgResult = actualParameter.isVarArg();
    assertFalse(actualParameter.isOptional());
    assertTrue(actualIsVarArgResult);
    assertEquals("name -> Any, false, true)", actualToStringResult);
    assertEquals("name", actualName);
  }
}

