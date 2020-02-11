package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.lib.FEELLib;
import com.gs.dmn.feel.synthesis.FEELTranslator;
import com.gs.dmn.feel.synthesis.type.FEELTypeTranslator;
import com.gs.dmn.runtime.interpreter.DMNInterpreter;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Test;

public class StandardDMNDialectDefinitionDiffblueTest {
  @Test(timeout=10000)
  public void createBasicTransformerTest() {
    // Arrange
    StandardDMNDialectDefinition standardDMNDialectDefinition = new StandardDMNDialectDefinition();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    BasicDMN2JavaTransformer actualCreateBasicTransformerResult = standardDMNDialectDefinition
        .createBasicTransformer(dmnModelRepository, new NopLazyEvaluationDetector(), null);

    // Assert
    DMNModelRepository actualDMNModelRepository = actualCreateBasicTransformerResult.getDMNModelRepository();
    FEELTranslator fEELTranslator = actualCreateBasicTransformerResult.getFEELTranslator();
    FEELTypeTranslator fEELTypeTranslator = actualCreateBasicTransformerResult.getFEELTypeTranslator();
    boolean actualIsCachingResult = actualCreateBasicTransformerResult.isCaching();
    assertSame(dmnModelRepository, actualDMNModelRepository);
    assertTrue(actualCreateBasicTransformerResult
        .getEnvironmentFactory() instanceof com.gs.dmn.feel.analysis.semantics.environment.DefaultDMNEnvironmentFactory);
    assertTrue(fEELTranslator instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
    assertFalse(actualIsCachingResult);
    assertTrue(fEELTypeTranslator instanceof com.gs.dmn.feel.synthesis.type.StandardFEELTypeTranslator);
  }

  @Test(timeout=10000)
  public void createTypeTranslatorTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.StandardFEELTypeTranslator);
  }

  @Test(timeout=10000)
  public void getDecisionBaseClassTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test(timeout=10000)
  public void createDMNInterpreterTest() {
    // Arrange
    StandardDMNDialectDefinition standardDMNDialectDefinition = new StandardDMNDialectDefinition();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    DMNInterpreter actualCreateDMNInterpreterResult = standardDMNDialectDefinition
        .createDMNInterpreter(dmnModelRepository);

    // Assert
    BasicDMN2JavaTransformer basicDMNTransformer = actualCreateDMNInterpreterResult.getBasicDMNTransformer();
    FEELLib feelLib = actualCreateDMNInterpreterResult.getFeelLib();
    DMNModelRepository actualDMNModelRepository = basicDMNTransformer.getDMNModelRepository();
    FEELTranslator fEELTranslator = basicDMNTransformer.getFEELTranslator();
    FEELTypeTranslator fEELTypeTranslator = basicDMNTransformer.getFEELTypeTranslator();
    boolean actualIsCachingResult = basicDMNTransformer.isCaching();
    assertTrue(feelLib instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
    assertTrue(fEELTranslator instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
    assertFalse(actualIsCachingResult);
    assertTrue(fEELTypeTranslator instanceof com.gs.dmn.feel.synthesis.type.StandardFEELTypeTranslator);
    assertTrue(basicDMNTransformer
        .getEnvironmentFactory() instanceof com.gs.dmn.feel.analysis.semantics.environment.DefaultDMNEnvironmentFactory);
    assertSame(dmnModelRepository, actualDMNModelRepository);
  }

  @Test(timeout=10000)
  public void createFEELLibTest() {
    // Arrange, Act and Assert
    assertTrue((new StandardDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
  }
}

