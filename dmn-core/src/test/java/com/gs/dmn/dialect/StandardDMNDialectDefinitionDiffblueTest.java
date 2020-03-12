package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.interpreter.DMNInterpreter;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class StandardDMNDialectDefinitionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test
  public void createBasicTransformerTest() {
    // Arrange
    StandardDMNDialectDefinition standardDMNDialectDefinition = new StandardDMNDialectDefinition();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    BasicDMN2JavaTransformer actualCreateBasicTransformerResult = standardDMNDialectDefinition
        .createBasicTransformer(dmnModelRepository, lazyEvaluationDetector, stringStringMap);

    // Assert
    assertSame(dmnModelRepository, actualCreateBasicTransformerResult.getDMNModelRepository());
    assertTrue(actualCreateBasicTransformerResult
        .getEnvironmentFactory() instanceof com.gs.dmn.feel.analysis.semantics.environment.DefaultDMNEnvironmentFactory);
    assertTrue(
        actualCreateBasicTransformerResult.getFEELTranslator() instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
    assertFalse(actualCreateBasicTransformerResult.isCaching());
    assertTrue(actualCreateBasicTransformerResult
        .getFEELTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.StandardFEELTypeTranslator);
  }

  @Test
  public void createDMNInterpreterTest() {
    // Arrange
    StandardDMNDialectDefinition standardDMNDialectDefinition = new StandardDMNDialectDefinition();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    DMNInterpreter actualCreateDMNInterpreterResult = standardDMNDialectDefinition
        .createDMNInterpreter(dmnModelRepository);

    // Assert
    BasicDMN2JavaTransformer basicDMNTransformer = actualCreateDMNInterpreterResult.getBasicDMNTransformer();
    assertTrue(actualCreateDMNInterpreterResult.getFeelLib() instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
    assertTrue(basicDMNTransformer.getFEELTranslator() instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
    assertFalse(basicDMNTransformer.isCaching());
    assertTrue(basicDMNTransformer
        .getFEELTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.StandardFEELTypeTranslator);
    assertTrue(basicDMNTransformer
        .getEnvironmentFactory() instanceof com.gs.dmn.feel.analysis.semantics.environment.DefaultDMNEnvironmentFactory);
    assertSame(dmnModelRepository, basicDMNTransformer.getDMNModelRepository());
  }

  @Test
  public void createFEELLibTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
  }

  @Test
  public void createTypeTranslatorTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.StandardFEELTypeTranslator);
  }

  @Test
  public void getDecisionBaseClassTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
  }
}

