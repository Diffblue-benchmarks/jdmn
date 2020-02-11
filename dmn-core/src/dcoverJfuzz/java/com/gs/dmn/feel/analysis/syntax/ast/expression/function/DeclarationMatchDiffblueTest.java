package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.environment.BusinessKnowledgeModelDeclaration;
import com.gs.dmn.feel.analysis.semantics.environment.Declaration;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import org.junit.Test;

public class DeclarationMatchDiffblueTest {
  @Test(timeout=10000)
  public void getParameterTypesTest() {
    // Arrange
    BusinessKnowledgeModelDeclaration declaration = new BusinessKnowledgeModelDeclaration("name", null);
    NamedParameterTypes namedParameterTypes = new NamedParameterTypes(null);

    // Act and Assert
    assertSame(namedParameterTypes,
        (new DeclarationMatch(declaration, namedParameterTypes, new NamedParameterConversions())).getParameterTypes());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);
    BusinessKnowledgeModelDeclaration businessKnowledgeModelDeclaration = new BusinessKnowledgeModelDeclaration("name",
        new BuiltinFunctionType(anyType, parameter, new Parameter("name", null), parameter));
    NamedParameterTypes namedParameterTypes = new NamedParameterTypes(null);
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();

    // Act
    DeclarationMatch actualDeclarationMatch = new DeclarationMatch(businessKnowledgeModelDeclaration,
        namedParameterTypes, namedParameterConversions);

    // Assert
    ParameterConversions actualParameterConversions = actualDeclarationMatch.getParameterConversions();
    Declaration actualDeclaration = actualDeclarationMatch.getDeclaration();
    assertSame(namedParameterConversions, actualParameterConversions);
    assertSame(namedParameterTypes, actualDeclarationMatch.getParameterTypes());
    assertSame(businessKnowledgeModelDeclaration, actualDeclaration);
  }

  @Test(timeout=10000)
  public void getDeclarationTest() {
    // Arrange
    BusinessKnowledgeModelDeclaration businessKnowledgeModelDeclaration = new BusinessKnowledgeModelDeclaration("name",
        null);
    NamedParameterTypes parameterTypes = new NamedParameterTypes(null);

    // Act and Assert
    assertSame(businessKnowledgeModelDeclaration,
        (new DeclarationMatch(businessKnowledgeModelDeclaration, parameterTypes, new NamedParameterConversions()))
            .getDeclaration());
  }

  @Test(timeout=10000)
  public void getParameterConversionsTest() {
    // Arrange
    BusinessKnowledgeModelDeclaration declaration = new BusinessKnowledgeModelDeclaration("name", null);
    NamedParameterTypes parameterTypes = new NamedParameterTypes(null);
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();

    // Act and Assert
    assertSame(namedParameterConversions,
        (new DeclarationMatch(declaration, parameterTypes, namedParameterConversions)).getParameterConversions());
  }
}

