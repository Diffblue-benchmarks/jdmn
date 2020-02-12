package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import org.junit.Test;

public class FunctionDeclarationDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    FunctionDeclaration actualFunctionDeclaration = new FunctionDeclaration("name",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter));

    // Assert
    String actualToStringResult = actualFunctionDeclaration.toString();
    assertEquals("name -> BuiltinFunctionType(name -> Any, false," + " false), name -> Any, false, false), name -> Any,"
        + " false, false), Any) ", actualToStringResult);
    assertEquals("name", actualFunctionDeclaration.getName());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(anyType, parameter, new Parameter("name", null),
        parameter);

    // Act and Assert
    assertSame(builtinFunctionType, (new FunctionDeclaration("name", builtinFunctionType)).getType());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act and Assert
    assertEquals(
        "name -> BuiltinFunctionType(name -> Any, false," + " false), name -> null, false, false), name -> Any,"
            + " false, false), Any) ",
        (new FunctionDeclaration("name",
            new BuiltinFunctionType(anyType, parameter, new Parameter("name", null), parameter))).toString());
  }

  @Test(timeout=10000)
  public void matchTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    FunctionDeclaration functionDeclaration = new FunctionDeclaration("name",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", null), parameter));

    // Act and Assert
    assertFalse(functionDeclaration.match(new NamedParameterTypes(null)));
  }
}

