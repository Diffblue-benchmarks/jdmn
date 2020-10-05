package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.DRGElementFilter;
import com.gs.dmn.DRGElementReference;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.synthesis.FEELTranslator;
import com.gs.dmn.feel.synthesis.FEELTranslatorImpl;
import com.gs.dmn.feel.synthesis.expression.NativeExpressionFactory;
import com.gs.dmn.feel.synthesis.type.NativeTypeFactory;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.interpreter.ImportPath;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.java.ExpressionStatement;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionRule;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;

public class BasicDMN2JavaTransformerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testAbstractRuleOutputClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).abstractRuleOutputClassName());
  }

  @Test
  public void testAbstractRuleOutputClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).abstractRuleOutputClassName());
  }

  @Test
  public void testAbstractRuleOutputClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).abstractRuleOutputClassName());
  }

  @Test
  public void testAnnotation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(new TDecision(), (String) null));
  }

  @Test
  public void testAnnotation2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(new TDecision(), (String) null));
  }

  @Test
  public void testAnnotation3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(new TDecision(), (String) null));
  }

  @Test
  public void testAnnotation4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    TDecision element = new TDecision();

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotation5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    TDecision element = new TDecision();

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotation6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    TDecision element = new TDecision();

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testAnnotationSetClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).annotationSetClassName());
  }

  @Test
  public void testAnnotationSetClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).annotationSetClassName());
  }

  @Test
  public void testAnnotationSetClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).annotationSetClassName());
  }

  @Test
  public void testAnnotationSetVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).annotationSetVariableName());
  }

  @Test
  public void testAnnotationSetVariableName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).annotationSetVariableName());
  }

  @Test
  public void testAnnotationSetVariableName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).annotationSetVariableName());
  }

  @Test
  public void testArgumentsClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Arguments", (new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).argumentsClassName());
  }

  @Test
  public void testArgumentsClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Arguments", (new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).argumentsClassName());
  }

  @Test
  public void testArgumentsClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Arguments", (new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).argumentsClassName());
  }

  @Test
  public void testAssertClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).assertClassName());
  }

  @Test
  public void testAssertClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).assertClassName());
  }

  @Test
  public void testAssertClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).assertClassName());
  }

  @Test
  public void testAugmentArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName, annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).augmentArgumentList("fullName"));
  }

  @Test
  public void testAugmentArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName, annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).augmentArgumentList("fullName"));
  }

  @Test
  public void testAugmentArgumentList3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName, annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).augmentArgumentList("fullName"));
  }

  @Test
  public void testAugmentSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).augmentSignature("String fullName"));
  }

  @Test
  public void testAugmentSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).augmentSignature("String fullName"));
  }

  @Test
  public void testAugmentSignature3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).augmentSignature("String fullName"));
  }

  @Test
  public void testBkmFEELParameters() {
    // Arrange
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(0, (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).bkmFEELParameters(tBusinessKnowledgeModel).size());
  }

  @Test
  public void testCacheInterfaceName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).cacheInterfaceName());
  }

  @Test
  public void testCacheInterfaceName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).cacheInterfaceName());
  }

  @Test
  public void testCacheInterfaceName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).cacheInterfaceName());
  }

  @Test
  public void testCacheVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("cache_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).cacheVariableName());
  }

  @Test
  public void testCacheVariableName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("cache_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).cacheVariableName());
  }

  @Test
  public void testCacheVariableName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("cache_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).cacheVariableName());
  }

  @Test
  public void testConstructor() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act
    BasicDMN2JavaTransformer actualBasicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Assert
    DMNModelRepository expectedDMNModelRepository = actualBasicDMN2JavaTransformer.dmnModelRepository;
    DMNModelRepository dMNModelRepository = actualBasicDMN2JavaTransformer.getDMNModelRepository();
    assertSame(expectedDMNModelRepository, dMNModelRepository);
    FEELTranslator expectedFEELTranslator = actualBasicDMN2JavaTransformer.feelTranslator;
    FEELTranslator fEELTranslator = actualBasicDMN2JavaTransformer.getFEELTranslator();
    assertSame(expectedFEELTranslator, fEELTranslator);
    assertTrue(actualBasicDMN2JavaTransformer.isCaching());
    assertFalse(actualBasicDMN2JavaTransformer.isParallelStream());
    EnvironmentFactory expectedEnvironmentFactory = actualBasicDMN2JavaTransformer.environmentFactory;
    EnvironmentFactory environmentFactory1 = actualBasicDMN2JavaTransformer.getEnvironmentFactory();
    assertSame(expectedEnvironmentFactory, environmentFactory1);
    DMNExpressionToNativeTransformer expectedExpressionToNativeTransformer = actualBasicDMN2JavaTransformer.expressionToNativeTransformer;
    assertSame(expectedExpressionToNativeTransformer,
        actualBasicDMN2JavaTransformer.getExpressionToNativeTransformer());
    assertFalse(actualBasicDMN2JavaTransformer.isOnePackage());
    DMNEnvironmentFactory expectedDMNEnvironmentFactory = actualBasicDMN2JavaTransformer.dmnEnvironmentFactory;
    DMNEnvironmentFactory dMNEnvironmentFactory = actualBasicDMN2JavaTransformer.getDMNEnvironmentFactory();
    assertSame(expectedDMNEnvironmentFactory, dMNEnvironmentFactory);
    DRGElementFilter expectedDrgElementFilter = actualBasicDMN2JavaTransformer.drgElementFilter;
    assertSame(expectedDrgElementFilter, actualBasicDMN2JavaTransformer.getDrgElementFilter());
    NativeTypeFactory expectedNativeTypeFactory = actualBasicDMN2JavaTransformer.nativeTypeFactory;
    assertSame(expectedNativeTypeFactory, actualBasicDMN2JavaTransformer.getNativeTypeFactory());
    assertTrue(actualBasicDMN2JavaTransformer.isSingletonInputData());
    NativeExpressionFactory expectedNativeExpressionFactory = actualBasicDMN2JavaTransformer.nativeExpressionFactory;
    assertSame(expectedNativeExpressionFactory, actualBasicDMN2JavaTransformer.getNativeExpressionFactory());
    assertSame(actualBasicDMN2JavaTransformer, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnTransformer);
    assertSame(dMNModelRepository, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnModelRepository);
    assertSame(environmentFactory1, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).environmentFactory);
    assertSame(fEELTranslator, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).feelTranslator);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act
    BasicDMN2JavaTransformer actualBasicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Assert
    DMNModelRepository expectedDMNModelRepository = actualBasicDMN2JavaTransformer.dmnModelRepository;
    DMNModelRepository dMNModelRepository = actualBasicDMN2JavaTransformer.getDMNModelRepository();
    assertSame(expectedDMNModelRepository, dMNModelRepository);
    FEELTranslator expectedFEELTranslator = actualBasicDMN2JavaTransformer.feelTranslator;
    FEELTranslator fEELTranslator = actualBasicDMN2JavaTransformer.getFEELTranslator();
    assertSame(expectedFEELTranslator, fEELTranslator);
    assertTrue(actualBasicDMN2JavaTransformer.isCaching());
    assertFalse(actualBasicDMN2JavaTransformer.isParallelStream());
    EnvironmentFactory expectedEnvironmentFactory = actualBasicDMN2JavaTransformer.environmentFactory;
    EnvironmentFactory environmentFactory1 = actualBasicDMN2JavaTransformer.getEnvironmentFactory();
    assertSame(expectedEnvironmentFactory, environmentFactory1);
    DMNExpressionToNativeTransformer expectedExpressionToNativeTransformer = actualBasicDMN2JavaTransformer.expressionToNativeTransformer;
    assertSame(expectedExpressionToNativeTransformer,
        actualBasicDMN2JavaTransformer.getExpressionToNativeTransformer());
    assertFalse(actualBasicDMN2JavaTransformer.isOnePackage());
    DMNEnvironmentFactory expectedDMNEnvironmentFactory = actualBasicDMN2JavaTransformer.dmnEnvironmentFactory;
    DMNEnvironmentFactory dMNEnvironmentFactory = actualBasicDMN2JavaTransformer.getDMNEnvironmentFactory();
    assertSame(expectedDMNEnvironmentFactory, dMNEnvironmentFactory);
    DRGElementFilter expectedDrgElementFilter = actualBasicDMN2JavaTransformer.drgElementFilter;
    assertSame(expectedDrgElementFilter, actualBasicDMN2JavaTransformer.getDrgElementFilter());
    NativeTypeFactory expectedNativeTypeFactory = actualBasicDMN2JavaTransformer.nativeTypeFactory;
    assertSame(expectedNativeTypeFactory, actualBasicDMN2JavaTransformer.getNativeTypeFactory());
    assertTrue(actualBasicDMN2JavaTransformer.isSingletonInputData());
    NativeExpressionFactory expectedNativeExpressionFactory = actualBasicDMN2JavaTransformer.nativeExpressionFactory;
    assertSame(expectedNativeExpressionFactory, actualBasicDMN2JavaTransformer.getNativeExpressionFactory());
    assertSame(actualBasicDMN2JavaTransformer, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnTransformer);
    assertSame(dMNModelRepository, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnModelRepository);
    assertSame(environmentFactory1, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).environmentFactory);
    assertSame(fEELTranslator, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).feelTranslator);
  }

  @Test
  public void testConstructor3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act
    BasicDMN2JavaTransformer actualBasicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Assert
    DMNModelRepository expectedDMNModelRepository = actualBasicDMN2JavaTransformer.dmnModelRepository;
    DMNModelRepository dMNModelRepository = actualBasicDMN2JavaTransformer.getDMNModelRepository();
    assertSame(expectedDMNModelRepository, dMNModelRepository);
    FEELTranslator expectedFEELTranslator = actualBasicDMN2JavaTransformer.feelTranslator;
    FEELTranslator fEELTranslator = actualBasicDMN2JavaTransformer.getFEELTranslator();
    assertSame(expectedFEELTranslator, fEELTranslator);
    assertTrue(actualBasicDMN2JavaTransformer.isCaching());
    assertFalse(actualBasicDMN2JavaTransformer.isParallelStream());
    EnvironmentFactory expectedEnvironmentFactory = actualBasicDMN2JavaTransformer.environmentFactory;
    EnvironmentFactory environmentFactory1 = actualBasicDMN2JavaTransformer.getEnvironmentFactory();
    assertSame(expectedEnvironmentFactory, environmentFactory1);
    DMNExpressionToNativeTransformer expectedExpressionToNativeTransformer = actualBasicDMN2JavaTransformer.expressionToNativeTransformer;
    assertSame(expectedExpressionToNativeTransformer,
        actualBasicDMN2JavaTransformer.getExpressionToNativeTransformer());
    assertFalse(actualBasicDMN2JavaTransformer.isOnePackage());
    DMNEnvironmentFactory expectedDMNEnvironmentFactory = actualBasicDMN2JavaTransformer.dmnEnvironmentFactory;
    DMNEnvironmentFactory dMNEnvironmentFactory = actualBasicDMN2JavaTransformer.getDMNEnvironmentFactory();
    assertSame(expectedDMNEnvironmentFactory, dMNEnvironmentFactory);
    DRGElementFilter expectedDrgElementFilter = actualBasicDMN2JavaTransformer.drgElementFilter;
    assertSame(expectedDrgElementFilter, actualBasicDMN2JavaTransformer.getDrgElementFilter());
    NativeTypeFactory expectedNativeTypeFactory = actualBasicDMN2JavaTransformer.nativeTypeFactory;
    assertSame(expectedNativeTypeFactory, actualBasicDMN2JavaTransformer.getNativeTypeFactory());
    assertTrue(actualBasicDMN2JavaTransformer.isSingletonInputData());
    NativeExpressionFactory expectedNativeExpressionFactory = actualBasicDMN2JavaTransformer.nativeExpressionFactory;
    assertSame(expectedNativeExpressionFactory, actualBasicDMN2JavaTransformer.getNativeExpressionFactory());
    assertSame(actualBasicDMN2JavaTransformer, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnTransformer);
    assertSame(dMNModelRepository, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnModelRepository);
    assertSame(environmentFactory1, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).environmentFactory);
    assertSame(fEELTranslator, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).feelTranslator);
  }

  @Test
  public void testConstructor4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER)",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .constructor("com.gs.dmn.runtime.listener.LoggingEventListener", "LOGGER"));
  }

  @Test
  public void testConstructor5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER)",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .constructor("com.gs.dmn.runtime.listener.LoggingEventListener", "LOGGER"));
  }

  @Test
  public void testConstructor6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER)",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .constructor("com.gs.dmn.runtime.listener.LoggingEventListener", "LOGGER"));
  }

  @Test
  public void testConvertExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    StringType stringType = new StringType();
    ExpressionStatement expressionStatement = new ExpressionStatement("stringAdd(\"Hello \", fullName)", stringType);

    // Act and Assert
    assertSame(expressionStatement, basicDMN2JavaTransformer.convertExpression(expressionStatement, stringType));
  }

  @Test
  public void testConvertExpression2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    NumberType numberType = new NumberType();
    ExpressionStatement expressionStatement = new ExpressionStatement("numericMultiply(number(\"12\"), monthlySalary)",
        numberType);

    // Act and Assert
    assertSame(expressionStatement, basicDMN2JavaTransformer.convertExpression(expressionStatement, numberType));
  }

  @Test
  public void testConvertExpression3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    StringType stringType = new StringType();
    ExpressionStatement expressionStatement = new ExpressionStatement("stringAdd(\"You are \", employmentStatus)",
        stringType);

    // Act and Assert
    assertSame(expressionStatement, basicDMN2JavaTransformer.convertExpression(expressionStatement, stringType));
  }

  @Test
  public void testDefaultCacheClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultCacheClassName());
  }

  @Test
  public void testDefaultCacheClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultCacheClassName());
  }

  @Test
  public void testDefaultCacheClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultCacheClassName());
  }

  @Test
  public void testDefaultConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .defaultConstructor("com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor"));
  }

  @Test
  public void testDefaultConstructor2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.cache.DefaultCache()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .defaultConstructor("com.gs.dmn.runtime.cache.DefaultCache"));
  }

  @Test
  public void testDefaultConstructor3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .defaultConstructor("com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor"));
  }

  @Test
  public void testDefaultEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultEventListenerClassName());
  }

  @Test
  public void testDefaultEventListenerClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultEventListenerClassName());
  }

  @Test
  public void testDefaultEventListenerClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultEventListenerClassName());
  }

  @Test
  public void testDefaultExternalExecutorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultExternalExecutorClassName());
  }

  @Test
  public void testDefaultExternalExecutorClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultExternalExecutorClassName());
  }

  @Test
  public void testDefaultExternalExecutorClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).defaultExternalExecutorClassName());
  }

  @Test
  public void testDirectInformationRequirements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.directInformationRequirements(new TDecision()).size());
  }

  @Test
  public void testDirectInformationRequirements2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.directInformationRequirements(new TDecision()).size());
  }

  @Test
  public void testDirectInformationRequirements3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.directInformationRequirements(new TDecision()).size());
  }

  @Test
  public void testDrgElementAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElement",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementAnnotationClassName());
  }

  @Test
  public void testDrgElementAnnotationClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElement",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementAnnotationClassName());
  }

  @Test
  public void testDrgElementAnnotationClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElement",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementAnnotationClassName());
  }

  @Test
  public void testDrgElementArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentList(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())));
  }

  @Test
  public void testDrgElementArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentList(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())));
  }

  @Test
  public void testDrgElementArgumentList3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentList(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0002-input-data-number", new TDecision())));
  }

  @Test
  public void testDrgElementArgumentList4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentList5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentList6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentListWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentListWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentListWithConversionFromString2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentListWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentListWithConversionFromString3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentListWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentNameList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testDrgElementArgumentNameList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0002-input-data-number", new TDecision())).size());
  }

  @Test
  public void testDrgElementArgumentNameList3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0,
        basicDMN2JavaTransformer
            .drgElementArgumentNameList(new DRGElementReference<TDRGElement>(importPath,
                "https://github.com/agilepro/dmn-tck", "0003-input-data-string-allowed-values", new TDecision()))
            .size());
  }

  @Test
  public void testDrgElementArgumentNameList4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), true).size());
  }

  @Test
  public void testDrgElementArgumentNameList5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0002-input-data-number", new TDecision()), true).size());
  }

  @Test
  public void testDrgElementArgumentNameList6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0,
        basicDMN2JavaTransformer
            .drgElementArgumentNameList(new DRGElementReference<TDRGElement>(importPath,
                "https://github.com/agilepro/dmn-tck", "0003-input-data-string-allowed-values", new TDecision()), true)
            .size());
  }

  @Test
  public void testDrgElementArgumentNameList7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new TDecision()).size());
  }

  @Test
  public void testDrgElementArgumentNameList8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new TDecision()).size());
  }

  @Test
  public void testDrgElementArgumentNameList9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new TDecision()).size());
  }

  @Test
  public void testDrgElementArgumentsExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName, annotationSet_, eventListener_, externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementArgumentsExtra("fullName, annotationSet_"));
  }

  @Test
  public void testDrgElementArgumentsExtra2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName, annotationSet_, eventListener_, externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementArgumentsExtra("fullName, annotationSet_"));
  }

  @Test
  public void testDrgElementArgumentsExtra3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_, eventListener_,"
            + " externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .drgElementArgumentsExtra("(monthlySalary != null ? number(monthlySalary) : null), annotationSet_"));
  }

  @Test
  public void testDrgElementArgumentsExtraCache() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("fullName, annotationSet_, eventListener_, externalExecutor_, cache_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap))
                .drgElementArgumentsExtraCache("fullName, annotationSet_, eventListener_, externalExecutor_"));
  }

  @Test
  public void testDrgElementArgumentsExtraCache2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("fullName, annotationSet_, eventListener_, externalExecutor_, cache_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap))
                .drgElementArgumentsExtraCache("fullName, annotationSet_, eventListener_, externalExecutor_"));
  }

  @Test
  public void testDrgElementArgumentsExtraCache3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_, eventListener_, externalExecutor_,"
            + " cache_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementArgumentsExtraCache(
                "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_, eventListener_,"
                    + " externalExecutor_"));
  }

  @Test
  public void testDrgElementArgumentsExtraCacheWithConversionFromString() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_, cache_",
        basicDMN2JavaTransformer.drgElementArgumentsExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentsExtraCacheWithConversionFromString2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_, cache_",
        basicDMN2JavaTransformer.drgElementArgumentsExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentsExtraCacheWithConversionFromString3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_, cache_",
        basicDMN2JavaTransformer.drgElementArgumentsExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementClassName() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("GreetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementClassName(tDecision));
  }

  @Test
  public void testDrgElementClassName2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("GreetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementClassName(tDecision));
  }

  @Test
  public void testDrgElementClassName3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Yearly Salary");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("YearlySalary", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementClassName(tDecision));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "fullName, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new"
            + " com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .drgElementDefaultArgumentsExtra("fullName, annotationSet_"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtra2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_, new com.gs.dmn.runtime.listener"
            + ".LoggingEventListener(LOGGER), new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementDefaultArgumentsExtra(
                "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtra3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "monthlySalary, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new"
            + " com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .drgElementDefaultArgumentsExtra("monthlySalary, annotationSet_"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("fullName, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new"
        + " com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache"
        + "()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementDefaultArgumentsExtraCache(
                "fullName, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new"
                    + " com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_, new com.gs.dmn.runtime.listener"
            + ".LoggingEventListener(LOGGER), new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor(), new"
            + " com.gs.dmn.runtime.cache.DefaultCache()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementDefaultArgumentsExtraCache(
                "(monthlySalary != null ? number(monthlySalary) : null), annotationSet_, new com.gs.dmn.runtime.listener"
                    + ".LoggingEventListener(LOGGER), new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "monthlySalary, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new"
            + " com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache"
            + ".DefaultCache()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementDefaultArgumentsExtraCache(
                "monthlySalary, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new"
                    + " com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache4() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime"
            + ".external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache()",
        basicDMN2JavaTransformer.drgElementDefaultArgumentsExtraCache(new TDecision()));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache5() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime"
            + ".external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache()",
        basicDMN2JavaTransformer.drgElementDefaultArgumentsExtraCache(new TDecision()));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache6() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime"
            + ".external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache()",
        basicDMN2JavaTransformer.drgElementDefaultArgumentsExtraCache(new TDecision()));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCacheWithConversionFromString() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime"
            + ".external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache()",
        basicDMN2JavaTransformer.drgElementDefaultArgumentsExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCacheWithConversionFromString2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime"
            + ".external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache()",
        basicDMN2JavaTransformer.drgElementDefaultArgumentsExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCacheWithConversionFromString3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime"
            + ".external.DefaultExternalFunctionExecutor(), new com.gs.dmn.runtime.cache.DefaultCache()",
        basicDMN2JavaTransformer.drgElementDefaultArgumentsExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementDirectArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementDirectArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementDirectArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementDirectArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementDirectArgumentList3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementDirectArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementDirectSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementDirectSignature(new TDecision()));
  }

  @Test
  public void testDrgElementDirectSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementDirectSignature(new TDecision()));
  }

  @Test
  public void testDrgElementDirectSignature3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementDirectSignature(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateArgumentList() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_, cache_",
        basicDMN2JavaTransformer.drgElementEvaluateArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateArgumentList2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_, cache_",
        basicDMN2JavaTransformer.drgElementEvaluateArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateArgumentList3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_, cache_",
        basicDMN2JavaTransformer.drgElementEvaluateArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateSignature() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
        + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
        + ".runtime.cache.Cache cache_", basicDMN2JavaTransformer.drgElementEvaluateSignature(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateSignature2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
        + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
        + ".runtime.cache.Cache cache_", basicDMN2JavaTransformer.drgElementEvaluateSignature(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateSignature3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
        + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
        + ".runtime.cache.Cache cache_", basicDMN2JavaTransformer.drgElementEvaluateSignature(new TDecision()));
  }

  @Test
  public void testDrgElementMetadataClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.DRGElement",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementMetadataClassName());
  }

  @Test
  public void testDrgElementMetadataClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.DRGElement",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementMetadataClassName());
  }

  @Test
  public void testDrgElementMetadataClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.DRGElement",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementMetadataClassName());
  }

  @Test
  public void testDrgElementMetadataFieldName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("DRG_ELEMENT_METADATA", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementMetadataFieldName());
  }

  @Test
  public void testDrgElementMetadataFieldName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("DRG_ELEMENT_METADATA", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementMetadataFieldName());
  }

  @Test
  public void testDrgElementMetadataFieldName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("DRG_ELEMENT_METADATA", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementMetadataFieldName());
  }

  @Test
  public void testDrgElementOutputFEELType() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualDrgElementOutputFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementOutputFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualDrgElementOutputFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementOutputFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualDrgElementOutputFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementOutputFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputType() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).drgElementOutputType(tDecision));
  }

  @Test
  public void testDrgElementOutputType2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).drgElementOutputType(tDecision));
  }

  @Test
  public void testDrgElementOutputType3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).drgElementOutputType(tDecision));
  }

  @Test
  public void testDrgElementSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())));
  }

  @Test
  public void testDrgElementSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())));
  }

  @Test
  public void testDrgElementSignature3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0002-input-data-number", new TDecision())));
  }

  @Test
  public void testDrgElementSignature4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new TDecision()));
  }

  @Test
  public void testDrgElementSignature5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new TDecision()));
  }

  @Test
  public void testDrgElementSignature6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
            + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
            + " externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementSignatureExtra(
                "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_"));
  }

  @Test
  public void testDrgElementSignatureExtra2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
            + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
            + " externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementSignatureExtra(
                "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_"));
  }

  @Test
  public void testDrgElementSignatureExtra3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "String monthlySalary, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
            + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
            + " externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgElementSignatureExtra(
                "String monthlySalary, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_"));
  }

  @Test
  public void testDrgElementSignatureExtra4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementSignatureExtra(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtra5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementSignatureExtra(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtra6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementSignatureExtra(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraCache() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener"
            + ".EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_,"
            + " com.gs.dmn.runtime.cache.Cache cache_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementSignatureExtraCache(
                "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
                    + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
                    + " externalExecutor_"));
  }

  @Test
  public void testDrgElementSignatureExtraCache2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener"
            + ".EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_,"
            + " com.gs.dmn.runtime.cache.Cache cache_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementSignatureExtraCache(
                "String fullName, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
                    + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
                    + " externalExecutor_"));
  }

  @Test
  public void testDrgElementSignatureExtraCache3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "String monthlySalary, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
            + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
            + " externalExecutor_, com.gs.dmn.runtime.cache.Cache cache_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).drgElementSignatureExtraCache(
                "String monthlySalary, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime"
                    + ".listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor"
                    + " externalExecutor_"));
  }

  @Test
  public void testDrgElementSignatureExtraCache4() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
        + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
        + ".runtime.cache.Cache cache_", basicDMN2JavaTransformer.drgElementSignatureExtraCache(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraCache5() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
        + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
        + ".runtime.cache.Cache cache_", basicDMN2JavaTransformer.drgElementSignatureExtraCache(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraCache6() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
        + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
        + ".runtime.cache.Cache cache_", basicDMN2JavaTransformer.drgElementSignatureExtraCache(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraCacheWithConversionFromString() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
            + ".runtime.cache.Cache cache_",
        basicDMN2JavaTransformer.drgElementSignatureExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraCacheWithConversionFromString2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
            + ".runtime.cache.Cache cache_",
        basicDMN2JavaTransformer.drgElementSignatureExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraCacheWithConversionFromString3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), stringStringMap);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_, com.gs.dmn"
            + ".runtime.cache.Cache cache_",
        basicDMN2JavaTransformer.drgElementSignatureExtraCacheWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementSignatureExtraWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraWithConversionFromString2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementSignatureExtraWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtraWithConversionFromString3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementSignatureExtraWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignatureWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureWithConversionFromString2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignatureWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureWithConversionFromString3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.drgElementSignatureWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementVariableFEELType() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualDrgElementVariableFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementVariableFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableFEELType2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualDrgElementVariableFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementVariableFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableFEELType3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualDrgElementVariableFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementVariableFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableName() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("greetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementVariableName(tDecision));
  }

  @Test
  public void testDrgElementVariableName2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("greetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementVariableName(tDecision));
  }

  @Test
  public void testDrgElementVariableName3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("greetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgElementVariableName(tDecision));
  }

  @Test
  public void testDrgReferenceQualifiedName() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("fullName",
        basicDMN2JavaTransformer
            .drgReferenceQualifiedName(new DRGElementReference<TDRGElement>(new ImportPath(new ImportPath(), null),
                "https://github.com/agilepro/dmn-tck", "0001-input-data-string", tInputData)));
  }

  @Test
  public void testDrgReferenceQualifiedName2() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("fullName",
        basicDMN2JavaTransformer
            .drgReferenceQualifiedName(new DRGElementReference<TDRGElement>(new ImportPath(new ImportPath(), null),
                "https://github.com/agilepro/dmn-tck", "0001-input-data-string", tInputData)));
  }

  @Test
  public void testDrgReferenceQualifiedName3() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("fullName",
        basicDMN2JavaTransformer
            .drgReferenceQualifiedName(new DRGElementReference<TDRGElement>(new ImportPath(new ImportPath(), null),
                "https://github.com/agilepro/dmn-tck", "0001-input-data-string", tInputData)));
  }

  @Test
  public void testDrgRuleMetadataClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Rule",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgRuleMetadataClassName());
  }

  @Test
  public void testDrgRuleMetadataClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Rule",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgRuleMetadataClassName());
  }

  @Test
  public void testDrgRuleMetadataClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Rule",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).drgRuleMetadataClassName());
  }

  @Test
  public void testDrgRuleMetadataFieldName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("drgRuleMetadata", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgRuleMetadataFieldName());
  }

  @Test
  public void testDrgRuleMetadataFieldName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("drgRuleMetadata", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgRuleMetadataFieldName());
  }

  @Test
  public void testDrgRuleMetadataFieldName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("drgRuleMetadata", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).drgRuleMetadataFieldName());
  }

  @Test
  public void testElementKind() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(DRGElementKind.DECISION, basicDMN2JavaTransformer.elementKind(new TDecision()));
  }

  @Test
  public void testElementKind2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(DRGElementKind.DECISION, basicDMN2JavaTransformer.elementKind(new TDecision()));
  }

  @Test
  public void testElementKind3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals(DRGElementKind.DECISION, basicDMN2JavaTransformer.elementKind(new TDecision()));
  }

  @Test
  public void testElementKindAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElementKind",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).elementKindAnnotationClassName());
  }

  @Test
  public void testElementKindAnnotationClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElementKind",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).elementKindAnnotationClassName());
  }

  @Test
  public void testElementKindAnnotationClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElementKind",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).elementKindAnnotationClassName());
  }

  @Test
  public void testEndElementCommentText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("End decision 'null'", basicDMN2JavaTransformer.endElementCommentText(new TDecision()));
  }

  @Test
  public void testEndElementCommentText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("End decision 'null'", basicDMN2JavaTransformer.endElementCommentText(new TDecision()));
  }

  @Test
  public void testEndElementCommentText3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("End decision 'null'", basicDMN2JavaTransformer.endElementCommentText(new TDecision()));
  }

  @Test
  public void testEvaluateElementCommentText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Evaluate decision 'null'", basicDMN2JavaTransformer.evaluateElementCommentText(new TDecision()));
  }

  @Test
  public void testEvaluateElementCommentText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Evaluate decision 'null'", basicDMN2JavaTransformer.evaluateElementCommentText(new TDecision()));
  }

  @Test
  public void testEvaluateElementCommentText3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Evaluate decision 'null'", basicDMN2JavaTransformer.evaluateElementCommentText(new TDecision()));
  }

  @Test
  public void testEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).eventListenerClassName());
  }

  @Test
  public void testEventListenerClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).eventListenerClassName());
  }

  @Test
  public void testEventListenerClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).eventListenerClassName());
  }

  @Test
  public void testEventListenerVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("eventListener_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).eventListenerVariableName());
  }

  @Test
  public void testEventListenerVariableName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("eventListener_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).eventListenerVariableName());
  }

  @Test
  public void testEventListenerVariableName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("eventListener_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).eventListenerVariableName());
  }

  @Test
  public void testExpressionKindAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.ExpressionKind",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).expressionKindAnnotationClassName());
  }

  @Test
  public void testExpressionKindAnnotationClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.ExpressionKind",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).expressionKindAnnotationClassName());
  }

  @Test
  public void testExpressionKindAnnotationClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.ExpressionKind",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).expressionKindAnnotationClassName());
  }

  @Test
  public void testExternalExecutorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFunctionExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).externalExecutorClassName());
  }

  @Test
  public void testExternalExecutorClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFunctionExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).externalExecutorClassName());
  }

  @Test
  public void testExternalExecutorClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFunctionExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).externalExecutorClassName());
  }

  @Test
  public void testExternalExecutorVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).externalExecutorVariableName());
  }

  @Test
  public void testExternalExecutorVariableName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).externalExecutorVariableName());
  }

  @Test
  public void testExternalExecutorVariableName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).externalExecutorVariableName());
  }

  @Test
  public void testGetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("getApprovalStatus()", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).getter("approvalStatus"));
  }

  @Test
  public void testGetter2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("getApprovalStatus()", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).getter("approvalStatus"));
  }

  @Test
  public void testGetter3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("getApprovalStatus()", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).getter("approvalStatus"));
  }

  @Test
  public void testGetterName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("getApprovalStatus", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).getterName("approvalStatus"));
  }

  @Test
  public void testGetterName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("getApprovalStatus", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).getterName("approvalStatus"));
  }

  @Test
  public void testGetterName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("getApprovalStatus", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).getterName("approvalStatus"));
  }

  @Test
  public void testHasDirectSubDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.hasDirectSubDecisions(new TDecision()));
  }

  @Test
  public void testHasDirectSubDecisions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.hasDirectSubDecisions(new TDecision()));
  }

  @Test
  public void testHasDirectSubDecisions3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.hasDirectSubDecisions(new TDecision()));
  }

  @Test
  public void testHitPolicyAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).hitPolicyAnnotationClassName());
  }

  @Test
  public void testHitPolicyAnnotationClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).hitPolicyAnnotationClassName());
  }

  @Test
  public void testHitPolicyAnnotationClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).hitPolicyAnnotationClassName());
  }

  @Test
  public void testInputDataParametersClosure() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new DRGElementReference<TDecision>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testInputDataParametersClosure2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new DRGElementReference<TDecision>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testInputDataParametersClosure3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new DRGElementReference<TDecision>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testInputDataParametersClosure4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new DRGElementReference<TDecision>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), true).size());
  }

  @Test
  public void testInputDataParametersClosure5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new DRGElementReference<TDecision>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), true).size());
  }

  @Test
  public void testInputDataParametersClosure6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new DRGElementReference<TDecision>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), true).size());
  }

  @Test
  public void testInputDataVariableName() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("fullName",
        basicDMN2JavaTransformer
            .inputDataVariableName(new DRGElementReference<TDRGElement>(new ImportPath(new ImportPath(), null),
                "https://github.com/agilepro/dmn-tck", "0001-input-data-string", tInputData)));
  }

  @Test
  public void testInputDataVariableName2() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("fullName",
        basicDMN2JavaTransformer
            .inputDataVariableName(new DRGElementReference<TDRGElement>(new ImportPath(new ImportPath(), null),
                "https://github.com/agilepro/dmn-tck", "0001-input-data-string", tInputData)));
  }

  @Test
  public void testInputDataVariableName3() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("fullName",
        basicDMN2JavaTransformer
            .inputDataVariableName(new DRGElementReference<TDRGElement>(new ImportPath(new ImportPath(), null),
                "https://github.com/agilepro/dmn-tck", "0001-input-data-string", tInputData)));
  }

  @Test
  public void testIsCached() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), stringStringMap)).isCached("'Greeting Message'"));
  }

  @Test
  public void testIsCached2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), stringStringMap)).isCached("'Full Name'"));
  }

  @Test
  public void testIsCached3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), stringStringMap)).isCached("'Yearly Salary'"));
  }

  @Test
  public void testIsCompoundStatement() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer
        .isCompoundStatement(new ExpressionStatement("stringAdd(\"Hello \", fullName)", new StringType())));
  }

  @Test
  public void testIsCompoundStatement2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isCompoundStatement(
        new ExpressionStatement("numericMultiply(number(\"12\"), monthlySalary)", new NumberType())));
  }

  @Test
  public void testIsCompoundStatement3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer
        .isCompoundStatement(new ExpressionStatement("stringAdd(\"You are \", employmentStatus)", new StringType())));
  }

  @Test
  public void testIsLazyEvaluated() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).isLazyEvaluated("'Full Name'"));
  }

  @Test
  public void testIsLazyEvaluated2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).isLazyEvaluated("'Monthly Salary'"));
  }

  @Test
  public void testIsLazyEvaluated3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).isLazyEvaluated("'Employment Status'"));
  }

  @Test
  public void testIsLazyEvaluated4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isLazyEvaluated(new TInputData()));
  }

  @Test
  public void testIsLazyEvaluated5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isLazyEvaluated(new TInputData()));
  }

  @Test
  public void testIsLazyEvaluated6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isLazyEvaluated(new TInputData()));
  }

  @Test
  public void testItemDefinitionNativeSimpleInterfaceName() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setIsCollection((Boolean) false);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).itemDefinitionNativeSimpleInterfaceName(tItemDefinition);
  }

  @Test
  public void testJavaModelName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).javaModelName(""));
  }

  @Test
  public void testJavaModelName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).javaModelName(""));
  }

  @Test
  public void testJavaModelName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).javaModelName(""));
  }

  @Test
  public void testLazyEvaluation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).lazyEvaluation("'Full Name'", "fullName"));
  }

  @Test
  public void testLazyEvaluation2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("monthlySalary",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).lazyEvaluation("'Monthly Salary'", "monthlySalary"));
  }

  @Test
  public void testLazyEvaluation3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("employmentStatus",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).lazyEvaluation("'Employment Status'",
                "employmentStatus"));
  }

  @Test
  public void testLazyEvaluationType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("java.math.BigDecimal",
        basicDMN2JavaTransformer.lazyEvaluationType(new TInputData(), "java.math.BigDecimal"));
  }

  @Test
  public void testLazyEvaluationType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.lazyEvaluationType(new TInputData(), "String"));
  }

  @Test
  public void testLazyEvaluationType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Boolean", basicDMN2JavaTransformer.lazyEvaluationType(new TInputData(), "Boolean"));
  }

  @Test
  public void testLoggingEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.LoggingEventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).loggingEventListenerClassName());
  }

  @Test
  public void testLoggingEventListenerClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.LoggingEventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).loggingEventListenerClassName());
  }

  @Test
  public void testLoggingEventListenerClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.LoggingEventListener",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).loggingEventListenerClassName());
  }

  @Test
  public void testLowerCaseFirst() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).lowerCaseFirst("'Full Name'"));
  }

  @Test
  public void testLowerCaseFirst2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).lowerCaseFirst("'Full Name'"));
  }

  @Test
  public void testLowerCaseFirst3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).lowerCaseFirst("'Full Name'"));
  }

  @Test
  public void testMakeEnvironment() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertNull((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).makeEnvironment(tInputData).getInputExpression());
  }

  @Test
  public void testMakeEnvironment2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertNull((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).makeEnvironment(tInputData).getInputExpression());
  }

  @Test
  public void testMakeEnvironment3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertNull((new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).makeEnvironment(tDecision).getInputExpression());
  }

  @Test
  public void testMakeListType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("List<com.gs.dmn.generated.tck.cl3_0001_filter.type.TEmployees>",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).makeListType("List",
                "com.gs.dmn.generated.tck.cl3_0001_filter.type.TEmployees"));
  }

  @Test
  public void testMakeOutputEntryEnvironment() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Approval Status");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Environment actualMakeOutputEntryEnvironmentResult = (new BasicDMN2JavaTransformer(dmnModelRepository,
        instanceResult, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))
            .makeOutputEntryEnvironment(tDecision, instanceResult);

    // Assert
    assertNull(actualMakeOutputEntryEnvironmentResult.getInputExpression());
    assertNull(actualMakeOutputEntryEnvironmentResult.getParent().getInputExpressionType());
  }

  @Test
  public void testMakeOutputEntryEnvironment2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Approval Status");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Environment actualMakeOutputEntryEnvironmentResult = (new BasicDMN2JavaTransformer(dmnModelRepository,
        instanceResult, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))
            .makeOutputEntryEnvironment(tDecision, instanceResult);

    // Assert
    assertNull(actualMakeOutputEntryEnvironmentResult.getInputExpression());
    assertNull(actualMakeOutputEntryEnvironmentResult.getParent().getInputExpressionType());
  }

  @Test
  public void testMakeOutputEntryEnvironment3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Approval Status");
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Environment actualMakeOutputEntryEnvironmentResult = (new BasicDMN2JavaTransformer(dmnModelRepository,
        instanceResult, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))
            .makeOutputEntryEnvironment(tDecision, instanceResult);

    // Assert
    assertNull(actualMakeOutputEntryEnvironmentResult.getInputExpression());
    assertNull(actualMakeOutputEntryEnvironmentResult.getParent().getInputExpressionType());
  }

  @Test
  public void testNativeFriendlyName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("GreetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).nativeFriendlyName("Greeting Message"));
  }

  @Test
  public void testNativeFriendlyName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).nativeFriendlyName("full Name"));
  }

  @Test
  public void testNativeFriendlyName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("fullName", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).nativeFriendlyName("full Name"));
  }

  @Test
  public void testNativeModelPackageName() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("javaRootPackage", "com.gs.dmn.generated.tck.cl2_0001_input_data_string");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0001_input_data_string.p_0001_input_data_string",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).nativeModelPackageName("0001-input-data-string"));
  }

  @Test
  public void testNativeModelPackageName2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("javaRootPackage", "com.gs.dmn.generated.tck.cl2_0001_input_data_string");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0001_input_data_string.p_0001_input_data_string",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).nativeModelPackageName("0001-input-data-string.dmn"));
  }

  @Test
  public void testNativeModelPackageName3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("javaRootPackage", "com.gs.dmn.generated.tck.cl2_0001_input_data_string");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0001_input_data_string.p_0001_input_data_string",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).nativeModelPackageName("0001-input-data-string.dmn"));
  }

  @Test
  public void testNativeTypePackageName() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("javaRootPackage", "com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic.literal_arithmetic.type",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).nativeTypePackageName("literal - arithmetic"));
  }

  @Test
  public void testNativeTypePackageName2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("javaRootPackage", "com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic.literal_arithmetic.type",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), stringStringMap)).nativeTypePackageName("literal - arithmetic"));
  }

  @Test
  public void testPairClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Pair", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).pairClassName());
  }

  @Test
  public void testPairClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Pair", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).pairClassName());
  }

  @Test
  public void testPairClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Pair", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).pairClassName());
  }

  @Test
  public void testPairComparatorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.PairComparator",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).pairComparatorClassName());
  }

  @Test
  public void testPairComparatorClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.PairComparator",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).pairComparatorClassName());
  }

  @Test
  public void testParameterNativeType() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.number");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("java.math.BigDecimal", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).parameterNativeType(tInputData));
  }

  @Test
  public void testParameterNativeType2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).parameterNativeType(tInputData));
  }

  @Test
  public void testParameterNativeType3() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.boolean");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
        new NopLazyEvaluationDetector(), inputParameters)).parameterNativeType(tInputData));
  }

  @Test
  public void testQualifiedName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0001_input_data_string.GreetingMessage",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .qualifiedName("com.gs.dmn.generated.tck.cl2_0001_input_data_string", "GreetingMessage"));
  }

  @Test
  public void testQualifiedName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0001_input_data_string.GreetingMessage",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .qualifiedName("com.gs.dmn.generated.tck.cl2_0001_input_data_string", "GreetingMessage"));
  }

  @Test
  public void testQualifiedName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0002_input_data_number.YearlySalary",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))
                .qualifiedName("com.gs.dmn.generated.tck.cl2_0002_input_data_number", "YearlySalary"));
  }

  @Test
  public void testRuleAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.Rule",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).ruleAnnotationClassName());
  }

  @Test
  public void testRuleAnnotationClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.Rule",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).ruleAnnotationClassName());
  }

  @Test
  public void testRuleAnnotationClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.Rule",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).ruleAnnotationClassName());
  }

  @Test
  public void testRuleArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentList3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleOutputClassName() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Approval Status");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("ApprovalStatusRuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).ruleOutputClassName(tDecision));
  }

  @Test
  public void testRuleOutputClassName2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Approval Status");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("ApprovalStatusRuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).ruleOutputClassName(tDecision));
  }

  @Test
  public void testRuleOutputClassName3() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Approval Status");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("ApprovalStatusRuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).ruleOutputClassName(tDecision));
  }

  @Test
  public void testRuleOutputListClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutputList",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).ruleOutputListClassName());
  }

  @Test
  public void testRuleOutputListClassName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutputList",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).ruleOutputListClassName());
  }

  @Test
  public void testRuleOutputListClassName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutputList",
        (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters)).ruleOutputListClassName());
  }

  @Test
  public void testRuleSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testRuleSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testRuleSignature3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        basicDMN2JavaTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testSetDMNEnvironmentFactory() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act
    basicDMN2JavaTransformer.setDMNEnvironmentFactory(basicDMN2JavaTransformer);

    // Assert
    DMNEnvironmentFactory expectedDMNEnvironmentFactory = basicDMN2JavaTransformer.dmnEnvironmentFactory;
    DMNEnvironmentFactory dMNEnvironmentFactory = basicDMN2JavaTransformer.getDMNEnvironmentFactory();
    assertSame(expectedDMNEnvironmentFactory, dMNEnvironmentFactory);
    assertSame(basicDMN2JavaTransformer, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnTransformer);
    assertSame(basicDMN2JavaTransformer.getDMNModelRepository(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnModelRepository);
    assertSame(basicDMN2JavaTransformer.getEnvironmentFactory(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).environmentFactory);
    assertSame(basicDMN2JavaTransformer.getFEELTranslator(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).feelTranslator);
  }

  @Test
  public void testSetDMNEnvironmentFactory2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act
    basicDMN2JavaTransformer.setDMNEnvironmentFactory(basicDMN2JavaTransformer);

    // Assert
    DMNEnvironmentFactory expectedDMNEnvironmentFactory = basicDMN2JavaTransformer.dmnEnvironmentFactory;
    DMNEnvironmentFactory dMNEnvironmentFactory = basicDMN2JavaTransformer.getDMNEnvironmentFactory();
    assertSame(expectedDMNEnvironmentFactory, dMNEnvironmentFactory);
    assertSame(basicDMN2JavaTransformer, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnTransformer);
    assertSame(basicDMN2JavaTransformer.getDMNModelRepository(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnModelRepository);
    assertSame(basicDMN2JavaTransformer.getEnvironmentFactory(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).environmentFactory);
    assertSame(basicDMN2JavaTransformer.getFEELTranslator(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).feelTranslator);
  }

  @Test
  public void testSetDMNEnvironmentFactory3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act
    basicDMN2JavaTransformer.setDMNEnvironmentFactory(basicDMN2JavaTransformer);

    // Assert
    DMNEnvironmentFactory expectedDMNEnvironmentFactory = basicDMN2JavaTransformer.dmnEnvironmentFactory;
    DMNEnvironmentFactory dMNEnvironmentFactory = basicDMN2JavaTransformer.getDMNEnvironmentFactory();
    assertSame(expectedDMNEnvironmentFactory, dMNEnvironmentFactory);
    assertSame(basicDMN2JavaTransformer, ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnTransformer);
    assertSame(basicDMN2JavaTransformer.getDMNModelRepository(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).dmnModelRepository);
    assertSame(basicDMN2JavaTransformer.getEnvironmentFactory(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).environmentFactory);
    assertSame(basicDMN2JavaTransformer.getFEELTranslator(),
        ((StandardDMNEnvironmentFactory) dMNEnvironmentFactory).feelTranslator);
  }

  @Test
  public void testSetNativeExpressionFactory() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act
    basicDMN2JavaTransformer.setNativeExpressionFactory(basicDMN2JavaTransformer);

    // Assert
    NativeExpressionFactory expectedNativeExpressionFactory = basicDMN2JavaTransformer.nativeExpressionFactory;
    assertSame(expectedNativeExpressionFactory, basicDMN2JavaTransformer.getNativeExpressionFactory());
  }

  @Test
  public void testSetNativeExpressionFactory2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act
    basicDMN2JavaTransformer.setNativeExpressionFactory(basicDMN2JavaTransformer);

    // Assert
    NativeExpressionFactory expectedNativeExpressionFactory = basicDMN2JavaTransformer.nativeExpressionFactory;
    assertSame(expectedNativeExpressionFactory, basicDMN2JavaTransformer.getNativeExpressionFactory());
  }

  @Test
  public void testSetNativeExpressionFactory3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act
    basicDMN2JavaTransformer.setNativeExpressionFactory(basicDMN2JavaTransformer);

    // Assert
    NativeExpressionFactory expectedNativeExpressionFactory = basicDMN2JavaTransformer.nativeExpressionFactory;
    assertSame(expectedNativeExpressionFactory, basicDMN2JavaTransformer.getNativeExpressionFactory());
  }

  @Test
  public void testSetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("setApprovalStatus", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).setter("approvalStatus"));
  }

  @Test
  public void testSetter2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("setApprovalStatus", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).setter("approvalStatus"));
  }

  @Test
  public void testSetter3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("setApprovalStatus", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).setter("approvalStatus"));
  }

  @Test
  public void testShouldGenerateApplyWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.shouldGenerateApplyWithConversionFromString(new TDecision()));
  }

  @Test
  public void testShouldGenerateApplyWithConversionFromString2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.shouldGenerateApplyWithConversionFromString(new TDecision()));
  }

  @Test
  public void testShouldGenerateApplyWithConversionFromString3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.shouldGenerateApplyWithConversionFromString(new TDecision()));
  }

  @Test
  public void testStartElementCommentText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Start decision 'null'", basicDMN2JavaTransformer.startElementCommentText(new TDecision()));
  }

  @Test
  public void testStartElementCommentText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Start decision 'null'", basicDMN2JavaTransformer.startElementCommentText(new TDecision()));
  }

  @Test
  public void testStartElementCommentText3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("Start decision 'null'", basicDMN2JavaTransformer.startElementCommentText(new TDecision()));
  }

  @Test
  public void testToFEELType() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).toFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).toFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType3() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).toFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType4() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setIsCollection((Boolean) false);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).toFEELType(tItemDefinition);

    // Assert
    assertSame(((AnyType) actualToFEELTypeResult).ANY, actualToFEELTypeResult);
  }

  @Test
  public void testToNativeType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toNativeType(new StringType()));
  }

  @Test
  public void testToNativeType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toNativeType(new StringType()));
  }

  @Test
  public void testToNativeType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toNativeType(new StringType()));
  }

  @Test
  public void testToStringNativeType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toStringNativeType(new NumberType()));
  }

  @Test
  public void testToStringNativeType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toStringNativeType(new NumberType()));
  }

  @Test
  public void testToStringNativeType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toStringNativeType(new NumberType()));
  }

  @Test
  public void testUpperCaseFirst() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("GreetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).upperCaseFirst("'Greeting Message'"));
  }

  @Test
  public void testUpperCaseFirst2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("GreetingMessage", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).upperCaseFirst("'Greeting Message'"));
  }

  @Test
  public void testUpperCaseFirst3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("YearlySalary", (new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)).upperCaseFirst("'Yearly Salary'"));
  }
}

