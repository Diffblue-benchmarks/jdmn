package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.List;
import org.junit.Test;

public class FEELFunctionTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new FEELFunctionType(null, new AnyType(), true)).equals("foo"));
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    FEELFunctionType feelFunctionType = new FEELFunctionType(null, new AnyType(), true);

    // Act and Assert
    assertFalse(feelFunctionType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void getFunctionDefinitionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELFunctionType(null, new AnyType(), true)).getFunctionDefinition());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    AnyType returnType = new AnyType();
    FunctionDefinition functionDefinition = new FunctionDefinition(null, new ExpressionList(), true);

    // Act
    FEELFunctionType actualFeelFunctionType = new FEELFunctionType(null, returnType, true, functionDefinition);

    // Assert
    List<Type> expectedParameterTypes = actualFeelFunctionType.parameterTypes;
    String actualToStringResult = actualFeelFunctionType.toString();
    boolean actualIsExternalResult = actualFeelFunctionType.isExternal();
    FunctionDefinition actualFunctionDefinition = actualFeelFunctionType.getFunctionDefinition();
    assertEquals("FEELFunctionType(, Any, true)", actualToStringResult);
    assertSame(expectedParameterTypes, actualFeelFunctionType.getParameterTypes());
    assertSame(functionDefinition, actualFunctionDefinition);
    assertTrue(actualIsExternalResult);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    FEELFunctionType actualFeelFunctionType = new FEELFunctionType(null, new AnyType(), true);

    // Assert
    List<Type> expectedParameterTypes = actualFeelFunctionType.parameterTypes;
    String actualToStringResult = actualFeelFunctionType.toString();
    boolean actualIsExternalResult = actualFeelFunctionType.isExternal();
    FunctionDefinition actualFunctionDefinition = actualFeelFunctionType.getFunctionDefinition();
    assertEquals("FEELFunctionType(, Any, true)", actualToStringResult);
    assertSame(expectedParameterTypes, actualFeelFunctionType.getParameterTypes());
    assertNull(actualFunctionDefinition);
    assertTrue(actualIsExternalResult);
  }

  @Test(timeout=10000)
  public void isExternalTest() {
    // Arrange, Act and Assert
    assertTrue((new FEELFunctionType(null, new AnyType(), true)).isExternal());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("FEELFunctionType(, Any, true)", (new FEELFunctionType(null, new AnyType(), true)).toString());
  }

  @Test(timeout=10000)
  public void matchTest() {
    // Arrange
    FEELFunctionType feelFunctionType = new FEELFunctionType(null, new AnyType(), true);

    // Act and Assert
    assertTrue(feelFunctionType.match(new NamedParameterTypes(null)));
  }
}

