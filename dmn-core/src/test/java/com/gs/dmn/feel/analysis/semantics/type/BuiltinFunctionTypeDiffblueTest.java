package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import java.util.ArrayList;
import org.junit.Test;

public class BuiltinFunctionTypeDiffblueTest {
  @Test
  public void testMatch() {
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
  public void testEquivalentTo() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    AnyType anyType1 = new AnyType();

    // Act and Assert
    assertFalse((new BuiltinFunctionType(anyType, parameter, new Parameter("name", anyType1), parameter))
        .equivalentTo(anyType1));
  }

  @Test
  public void testEquals() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act and Assert
    assertFalse(
        (new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter)).equals("o"));
  }
}

