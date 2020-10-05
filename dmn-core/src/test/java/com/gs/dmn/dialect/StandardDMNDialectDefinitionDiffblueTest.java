package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class StandardDMNDialectDefinitionDiffblueTest {
  @Test
  public void testCreateBasicTransformer() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    StandardDMNDialectDefinition standardDMNDialectDefinition = new StandardDMNDialectDefinition();

    // Act
    BasicDMN2JavaTransformer actualCreateBasicTransformerResult = standardDMNDialectDefinition
        .createBasicTransformer(dmnModelRepository, new NopLazyEvaluationDetector(), stringStringMap);

    // Assert
    assertSame(dmnModelRepository, actualCreateBasicTransformerResult.getDMNModelRepository());
    assertTrue(actualCreateBasicTransformerResult
        .getEnvironmentFactory() instanceof com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory);
    assertTrue(
        actualCreateBasicTransformerResult.getFEELTranslator() instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
    assertTrue(actualCreateBasicTransformerResult.isCaching());
    assertFalse(actualCreateBasicTransformerResult.isParallelStream());
    assertTrue(actualCreateBasicTransformerResult
        .getDMNEnvironmentFactory() instanceof com.gs.dmn.transformation.basic.StandardDMNEnvironmentFactory);
    assertFalse(actualCreateBasicTransformerResult.isOnePackage());
    assertTrue(actualCreateBasicTransformerResult
        .getNativeTypeFactory() instanceof com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory);
    assertTrue(actualCreateBasicTransformerResult
        .getNativeExpressionFactory() instanceof com.gs.dmn.feel.synthesis.expression.JavaExpressionFactory);
    assertTrue(actualCreateBasicTransformerResult.isSingletonInputData());
  }

  @Test
  public void testCreateFEELLib() {
    // Arrange, Act and Assert
    assertTrue((new StandardDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
    assertTrue((new StandardDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
    assertTrue((new StandardDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.DefaultFEELLib);
  }

  @Test
  public void testCreateNativeTypeFactory() {
    // Arrange, Act and Assert
    assertTrue((new StandardDMNDialectDefinition())
        .createNativeTypeFactory() instanceof com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory);
  }

  @Test
  public void testGetDecisionBaseClass() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
    assertEquals("com.gs.dmn.runtime.DefaultDMNBaseDecision",
        (new StandardDMNDialectDefinition()).getDecisionBaseClass());
  }
}

