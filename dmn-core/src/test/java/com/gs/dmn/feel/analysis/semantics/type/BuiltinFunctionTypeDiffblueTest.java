package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class BuiltinFunctionTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    AnyType anyType1 = new AnyType();

    // Act and Assert
    assertFalse(
        (new BuiltinFunctionType(anyType, parameter, new Parameter("name", anyType1), parameter)).conformsTo(anyType1));
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<Parameter> parameterList = new ArrayList<Parameter>();
    AnyType anyType = new AnyType();
    parameterList.add(new Parameter("name", anyType));

    // Act
    BuiltinFunctionType actualBuiltinFunctionType = new BuiltinFunctionType(parameterList, anyType);

    // Assert
    assertEquals("BuiltinFunctionType(name -> Any, false," + " false), Any)", actualBuiltinFunctionType.toString());
    List<Type> expectedParameterTypes = actualBuiltinFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualBuiltinFunctionType.getParameterTypes());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    BuiltinFunctionType actualBuiltinFunctionType = new BuiltinFunctionType(anyType, parameter,
        new Parameter("name", new AnyType()), parameter);

    // Assert
    assertEquals("BuiltinFunctionType(name -> Any, false, false)," + " name -> Any, false, false), name -> Any, false,"
        + " false), Any)", actualBuiltinFunctionType.toString());
    List<Type> expectedParameterTypes = actualBuiltinFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualBuiltinFunctionType.getParameterTypes());
  }

  @Test
  public void equalsTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act and Assert
    assertFalse(
        (new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter)).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    AnyType anyType1 = new AnyType();

    // Act and Assert
    assertFalse((new BuiltinFunctionType(anyType, parameter, new Parameter("name", anyType1), parameter))
        .equivalentTo(anyType1));
  }

  @Test
  public void matchTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(anyType, parameter,
        new Parameter("name", new AnyType()), parameter);
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", anyType);

    // Act and Assert
    assertFalse(builtinFunctionType.match(new NamedParameterTypes(stringTypeMap)));
  }

  @Test
  public void matchTest2() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(anyType, parameter,
        new Parameter("name", new AnyType()), parameter);
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(anyType);

    // Act and Assert
    assertFalse(builtinFunctionType.match(typeList));
  }

  @Test
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
}

