package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import org.junit.Test;

public class BusinessKnowledgeModelDeclarationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act
    BusinessKnowledgeModelDeclaration actualBusinessKnowledgeModelDeclaration = new BusinessKnowledgeModelDeclaration(
        "functionName", new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter));

    // Assert
    assertEquals("functionName -> BuiltinFunctionType(name -> Any,"
        + " false, false), name -> Any, false, false), name ->" + " Any, false, false), Any) ",
        actualBusinessKnowledgeModelDeclaration.toString());
    assertEquals("functionName", actualBusinessKnowledgeModelDeclaration.getName());
  }
}

