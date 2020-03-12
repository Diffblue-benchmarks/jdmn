package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.environment.BusinessKnowledgeModelDeclaration;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.HashMap;
import org.junit.Test;

public class DeclarationMatchDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    BusinessKnowledgeModelDeclaration businessKnowledgeModelDeclaration = new BusinessKnowledgeModelDeclaration(
        "functionName", new BuiltinFunctionType(anyType, parameter, new Parameter("name", null), parameter));
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("functionName", anyType);
    NamedParameterTypes namedParameterTypes = new NamedParameterTypes(stringTypeMap);
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();

    // Act
    DeclarationMatch actualDeclarationMatch = new DeclarationMatch(businessKnowledgeModelDeclaration,
        namedParameterTypes, namedParameterConversions);

    // Assert
    assertSame(namedParameterConversions, actualDeclarationMatch.getParameterConversions());
    assertSame(namedParameterTypes, actualDeclarationMatch.getParameterTypes());
    assertSame(businessKnowledgeModelDeclaration, actualDeclarationMatch.getDeclaration());
  }
}

