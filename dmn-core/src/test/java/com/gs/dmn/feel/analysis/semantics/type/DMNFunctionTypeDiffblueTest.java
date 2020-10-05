package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameterTypes;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TFunctionKind;

public class DMNFunctionTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();

    // Act
    DMNFunctionType actualDmnFunctionType = new DMNFunctionType(new ArrayList<FormalParameter>(), returnType,
        tBusinessKnowledgeModel, functionDefinition);

    // Assert
    assertSame(tBusinessKnowledgeModel, actualDmnFunctionType.getDRGElement());
    assertEquals(TFunctionKind.FEEL, actualDmnFunctionType.getKind());
    List<Type> expectedParameterTypes = actualDmnFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualDmnFunctionType.getParameterTypes());
    assertEquals("DMNFunctionType(, number)", actualDmnFunctionType.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();

    // Act
    DMNFunctionType actualDmnFunctionType = new DMNFunctionType(new ArrayList<FormalParameter>(), returnType,
        tBusinessKnowledgeModel, functionDefinition);

    // Assert
    assertSame(tBusinessKnowledgeModel, actualDmnFunctionType.getDRGElement());
    assertEquals(TFunctionKind.FEEL, actualDmnFunctionType.getKind());
    List<Type> expectedParameterTypes = actualDmnFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualDmnFunctionType.getParameterTypes());
    assertEquals("DMNFunctionType(, number)", actualDmnFunctionType.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();

    // Act
    DMNFunctionType actualDmnFunctionType = new DMNFunctionType(new ArrayList<FormalParameter>(), returnType,
        tBusinessKnowledgeModel, functionDefinition);

    // Assert
    assertSame(tBusinessKnowledgeModel, actualDmnFunctionType.getDRGElement());
    assertEquals(TFunctionKind.FEEL, actualDmnFunctionType.getKind());
    List<Type> expectedParameterTypes = actualDmnFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualDmnFunctionType.getParameterTypes());
    assertEquals("DMNFunctionType(, number)", actualDmnFunctionType.toString());
  }

  @Test
  public void testMatch() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel drgElement = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();
    DMNFunctionType dmnFunctionType = new DMNFunctionType(new ArrayList<FormalParameter>(), returnType, drgElement,
        functionDefinition);

    // Act and Assert
    assertTrue(dmnFunctionType.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch2() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel drgElement = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();
    DMNFunctionType dmnFunctionType = new DMNFunctionType(new ArrayList<FormalParameter>(), returnType, drgElement,
        functionDefinition);

    // Act and Assert
    assertTrue(dmnFunctionType.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }

  @Test
  public void testMatch3() {
    // Arrange
    NumberType returnType = new NumberType();
    TBusinessKnowledgeModel drgElement = new TBusinessKnowledgeModel();
    TFunctionDefinition functionDefinition = new TFunctionDefinition();
    DMNFunctionType dmnFunctionType = new DMNFunctionType(new ArrayList<FormalParameter>(), returnType, drgElement,
        functionDefinition);

    // Act and Assert
    assertTrue(dmnFunctionType.match(new PositionalParameterTypes(new ArrayList<Type>())));
  }
}

