package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import org.junit.Test;

public class DecisionServiceDeclarationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    DecisionServiceDeclaration actualDecisionServiceDeclaration = new DecisionServiceDeclaration("functionName",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter));

    // Assert
    assertEquals("functionName -> BuiltinFunctionType(name -> Any,"
        + " false, false), name -> Any, false, false), name ->" + " Any, false, false), Any) ",
        actualDecisionServiceDeclaration.toString());
    assertEquals("functionName", actualDecisionServiceDeclaration.getName());
  }
}

