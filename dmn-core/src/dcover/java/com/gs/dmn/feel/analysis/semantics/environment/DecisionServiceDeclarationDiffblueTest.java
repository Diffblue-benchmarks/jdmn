package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import org.junit.Test;

public class DecisionServiceDeclarationDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    DecisionServiceDeclaration actualDecisionServiceDeclaration = new DecisionServiceDeclaration("name",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter));

    // Assert
    String actualToStringResult = actualDecisionServiceDeclaration.toString();
    assertEquals("name -> BuiltinFunctionType(name -> Any, false," + " false), name -> Any, false, false), name -> Any,"
        + " false, false), Any) ", actualToStringResult);
    assertEquals("name", actualDecisionServiceDeclaration.getName());
  }
}

