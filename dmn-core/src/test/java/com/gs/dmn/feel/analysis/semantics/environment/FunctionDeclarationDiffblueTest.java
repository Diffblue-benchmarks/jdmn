package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.DMNFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameterTypes;
import java.util.ArrayList;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;

public class FunctionDeclarationDiffblueTest {
  @Test
  public void testMatch() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel drgElement = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();
    BusinessKnowledgeModelDeclaration businessKnowledgeModelDeclaration = new BusinessKnowledgeModelDeclaration("PMT",
        new DMNFunctionType(new ArrayList<FormalParameter>(), returnType, drgElement, functionDefinition));

    // Act and Assert
    assertTrue(businessKnowledgeModelDeclaration.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch2() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    FunctionDeclaration functionDeclaration = new FunctionDeclaration("starts with",
        new BuiltinFunctionType(new BooleanType(), parameter, new Parameter("match", stringType)));

    // Act and Assert
    assertFalse(functionDeclaration.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch3() {
    // Arrange
    StringType stringType = new StringType();
    Parameter parameter = new Parameter("string", stringType);
    FunctionDeclaration functionDeclaration = new FunctionDeclaration("starts with",
        new BuiltinFunctionType(new BooleanType(), parameter, new Parameter("match", stringType)));

    // Act and Assert
    assertFalse(functionDeclaration.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }
}

