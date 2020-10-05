package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameterTypes;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BuiltinFunctionTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    BuiltinFunctionType actualBuiltinFunctionType = new BuiltinFunctionType(new DateType(),
        new Parameter("from", new StringType()));

    // Assert
    assertEquals("BuiltinFunctionType(from -> string, false, false), date)", actualBuiltinFunctionType.toString());
    List<Type> expectedParameterTypes = actualBuiltinFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualBuiltinFunctionType.getParameterTypes());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    DateType dateType = new DateType();

    // Act
    BuiltinFunctionType actualBuiltinFunctionType = new BuiltinFunctionType(dateType, new Parameter("from", dateType));

    // Assert
    assertEquals("BuiltinFunctionType(from -> date, false, false), date)", actualBuiltinFunctionType.toString());
    List<Type> expectedParameterTypes = actualBuiltinFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualBuiltinFunctionType.getParameterTypes());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    BuiltinFunctionType actualBuiltinFunctionType = new BuiltinFunctionType(new DateType(),
        new Parameter("from", new DateTimeType("date and time")));

    // Assert
    assertEquals("BuiltinFunctionType(from -> date and time, false, false), date)",
        actualBuiltinFunctionType.toString());
    List<Type> expectedParameterTypes = actualBuiltinFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualBuiltinFunctionType.getParameterTypes());
  }

  @Test
  public void testMatch() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(new BooleanType(), parameter,
        new Parameter("match", stringType));

    // Act and Assert
    assertFalse(builtinFunctionType.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch2() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(new BooleanType(), parameter,
        new Parameter("match", stringType));

    // Act and Assert
    assertFalse(builtinFunctionType.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch3() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(new BooleanType(), parameter,
        new Parameter("match", stringType));

    // Act and Assert
    assertFalse(builtinFunctionType.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch4() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(new BooleanType(), parameter,
        new Parameter("match", stringType));

    // Act and Assert
    assertFalse(builtinFunctionType.match(new ArrayList<Type>()));
  }

  @Test
  public void testMatch5() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(new BooleanType(), parameter,
        new Parameter("match", stringType));

    // Act and Assert
    assertFalse(builtinFunctionType.match(new ArrayList<Type>()));
  }

  @Test
  public void testMatch6() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    BuiltinFunctionType builtinFunctionType = new BuiltinFunctionType(new BooleanType(), parameter,
        new Parameter("match", stringType));

    // Act and Assert
    assertFalse(builtinFunctionType.match(new ArrayList<Type>()));
  }
}

