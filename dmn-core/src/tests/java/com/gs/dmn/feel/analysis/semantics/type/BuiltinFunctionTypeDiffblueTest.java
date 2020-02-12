package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.List;
import org.junit.Test;

public class BuiltinFunctionTypeDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    BuiltinFunctionType actualBuiltinFunctionType = new BuiltinFunctionType(anyType, parameter,
        new Parameter("name", new AnyType()), parameter);

    // Assert
    List<Type> expectedParameterTypes = actualBuiltinFunctionType.parameterTypes;
    String actualToStringResult = actualBuiltinFunctionType.toString();
    assertEquals("BuiltinFunctionType(name -> Any, false, false)," + " name -> Any, false, false), name -> Any, false,"
        + " false), Any)", actualToStringResult);
    assertSame(expectedParameterTypes, actualBuiltinFunctionType.getParameterTypes());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act and Assert
    assertFalse(
        (new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter)).equals("foo"));
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    AnyType anyType1 = new AnyType();

    // Act and Assert
    assertFalse((new BuiltinFunctionType(anyType, parameter, new Parameter("name", anyType1), parameter))
        .equivalentTo(anyType1));
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    AnyType anyType1 = new AnyType();

    // Act and Assert
    assertFalse(
        (new BuiltinFunctionType(anyType, parameter, new Parameter("name", anyType1), parameter)).conformsTo(anyType1));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act and Assert
    assertEquals(
        "BuiltinFunctionType(name -> Any, false, false)," + " name -> Any, false, false), name -> Any, false,"
            + " false), Any)",
        (new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter)).toString());
  }

  @Test(timeout=10000)
  public void matchTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(anyType, parameter,
        new Parameter("name", new AnyType()), parameter);

    // Act and Assert
    assertFalse(builtinFunctionType.match(new NamedParameterTypes(null)));
  }
}

