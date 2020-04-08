package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.HashMap;
import org.junit.Test;

public class FunctionDeclarationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    FunctionDeclaration actualFunctionDeclaration = new FunctionDeclaration("name",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter));

    // Assert
    assertEquals("name -> BuiltinFunctionType(name -> Any, false," + " false), name -> Any, false, false), name -> Any,"
        + " false, false), Any) ", actualFunctionDeclaration.toString());
    assertEquals("name", actualFunctionDeclaration.getName());
  }

  @Test
  public void testMatch() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    FunctionDeclaration functionDeclaration = new FunctionDeclaration("name",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", null), parameter));
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("name", anyType);

    // Act and Assert
    assertFalse(functionDeclaration.match(new NamedParameterTypes(stringTypeMap)));
  }

  @Test
  public void testToString() {
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
}

