package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.DRGElementReference;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.runtime.interpreter.ImportPath;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.java.ExpressionStatement;
import com.gs.dmn.transformation.lazy.CompositeLazyEvaluationDetector;
import com.gs.dmn.transformation.lazy.LazyEvaluationDetector;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionRule;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInputData;

public class DMNExpressionToNativeTransformerDiffblueTest {
  @Test
  public void testAbstractRuleOutputClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).abstractRuleOutputClassName());
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
    assertEquals("com.gs.dmn.runtime.RuleOutput",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).abstractRuleOutputClassName());
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
    assertEquals("com.gs.dmn.runtime.RuleOutput",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).abstractRuleOutputClassName());
  }

  @Test
  public void testAnnotation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    TDecision element = new TDecision();

    // Act and Assert
    assertEquals("\"\"", dmnExpressionToNativeTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotation2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    TDecision element = new TDecision();

    // Act and Assert
    assertEquals("\"\"", dmnExpressionToNativeTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotation3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    TDecision element = new TDecision();

    // Act and Assert
    assertEquals("\"\"", dmnExpressionToNativeTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("", dmnExpressionToNativeTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("", dmnExpressionToNativeTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("", dmnExpressionToNativeTransformer.annotationEscapedText(new TDecisionRule()));
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).hitPolicyAnnotationClassName());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).hitPolicyAnnotationClassName());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).hitPolicyAnnotationClassName());
  }

  @Test
  public void testLiteralExpressionToNative() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Greeting Message");
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("stringAdd(\"Hello \", fullName)",
        ((ExpressionStatement) (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository,
            environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .literalExpressionToNative(tDecision, "\"Hello \" + 'Full Name'")).getExpression());
    assertTrue(
        ((ExpressionStatement) (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository,
            environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .literalExpressionToNative(tDecision, "\"Hello \" + 'Full Name'"))
                    .getExpressionType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testLiteralExpressionToNative2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Yearly Salary");
    tInformationItem.setTypeRef("feel.number");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("numericMultiply(number(\"12\"), monthlySalary)",
        ((ExpressionStatement) (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository,
            environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .literalExpressionToNative(tDecision, "12 * 'Monthly Salary'")).getExpression());
    assertTrue(
        ((ExpressionStatement) (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository,
            environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .literalExpressionToNative(tDecision, "12 * 'Monthly Salary'"))
                    .getExpressionType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testLiteralExpressionToNative3() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Employment Status Statement");
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("stringAdd(\"You are \", employmentStatus)",
        ((ExpressionStatement) (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository,
            environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .literalExpressionToNative(tDecision, "\"You are \" + 'Employment Status'")).getExpression());
    assertTrue(
        ((ExpressionStatement) (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository,
            environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .literalExpressionToNative(tDecision, "\"You are \" + 'Employment Status'"))
                    .getExpressionType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testLiteralExpressionToNative4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Full Name'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);

    // Act and Assert
    assertEquals("stringAdd(\"Hello \", fullName)",
        ((ExpressionStatement) dmnExpressionToNativeTransformer.literalExpressionToNative(tDecision,
            "\"Hello \" + 'Full Name'", environmentMemoizer.get(tDecision))).getExpression());
    StringType expectedExpressionType = stringType.STRING;
    assertSame(expectedExpressionType,
        ((ExpressionStatement) dmnExpressionToNativeTransformer.literalExpressionToNative(tDecision,
            "\"Hello \" + 'Full Name'", environmentMemoizer.get(tDecision))).getExpressionType());
  }

  @Test
  public void testLiteralExpressionToNative5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    NumberType numberType = new NumberType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Monthly Salary'", numberType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);

    // Act and Assert
    assertEquals("numericMultiply(number(\"12\"), monthlySalary)",
        ((ExpressionStatement) dmnExpressionToNativeTransformer.literalExpressionToNative(tDecision,
            "12 * 'Monthly Salary'", environmentMemoizer.get(tDecision))).getExpression());
    NumberType expectedExpressionType = numberType.NUMBER;
    assertSame(expectedExpressionType,
        ((ExpressionStatement) dmnExpressionToNativeTransformer.literalExpressionToNative(tDecision,
            "12 * 'Monthly Salary'", environmentMemoizer.get(tDecision))).getExpressionType());
  }

  @Test
  public void testLiteralExpressionToNative6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Employment Status'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);

    // Act and Assert
    assertEquals("stringAdd(\"You are \", employmentStatus)",
        ((ExpressionStatement) dmnExpressionToNativeTransformer.literalExpressionToNative(tDecision,
            "\"You are \" + 'Employment Status'", environmentMemoizer.get(tDecision))).getExpression());
    StringType expectedExpressionType = stringType.STRING;
    assertSame(expectedExpressionType,
        ((ExpressionStatement) dmnExpressionToNativeTransformer.literalExpressionToNative(tDecision,
            "\"You are \" + 'Employment Status'", environmentMemoizer.get(tDecision))).getExpressionType());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleAnnotationClassName());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleAnnotationClassName());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleAnnotationClassName());
  }

  @Test
  public void testRuleArgumentList() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("annotationSet_",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleArgumentList(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleArgumentList2() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("annotationSet_",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleArgumentList(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleArgumentList3() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("annotationSet_",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleArgumentList(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleArgumentList4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("annotationSet_", dmnExpressionToNativeTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentList5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("annotationSet_", dmnExpressionToNativeTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentList6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("annotationSet_", dmnExpressionToNativeTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentName() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Age");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("age",
        dmnExpressionToNativeTransformer.ruleArgumentName(new DRGElementReference<TDRGElement>(new ImportPath(null),
            "http://www.trisotech.com/definitions/_edbd2d8e-a5a8-4660-9bb9-adaa792d900c", "simple U table",
            tInputData)));
  }

  @Test
  public void testRuleArgumentName2() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("RiskCategory");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("riskCategory",
        dmnExpressionToNativeTransformer.ruleArgumentName(new DRGElementReference<TDRGElement>(new ImportPath(null),
            "http://www.trisotech.com/definitions/_edbd2d8e-a5a8-4660-9bb9-adaa792d900c", "simple U table",
            tInputData)));
  }

  @Test
  public void testRuleArgumentName3() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("isAffordable");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("isAffordable",
        dmnExpressionToNativeTransformer.ruleArgumentName(new DRGElementReference<TDRGElement>(new ImportPath(null),
            "http://www.trisotech.com/definitions/_edbd2d8e-a5a8-4660-9bb9-adaa792d900c", "simple U table",
            tInputData)));
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
    assertEquals("ApprovalStatusRuleOutput",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleOutputClassName(tDecision));
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
    assertEquals("ApprovalStatusRuleOutput",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleOutputClassName(tDecision));
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
    assertEquals("ApprovalStatusRuleOutput",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleOutputClassName(tDecision));
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleOutputListClassName());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleOutputListClassName());
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
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).ruleOutputListClassName());
  }

  @Test
  public void testRuleParameterName() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Age");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("age",
        dmnExpressionToNativeTransformer.ruleParameterName(new DRGElementReference<TDRGElement>(new ImportPath(null),
            "http://www.trisotech.com/definitions/_edbd2d8e-a5a8-4660-9bb9-adaa792d900c", "simple U table",
            tInputData)));
  }

  @Test
  public void testRuleParameterName2() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("RiskCategory");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("riskCategory",
        dmnExpressionToNativeTransformer.ruleParameterName(new DRGElementReference<TDRGElement>(new ImportPath(null),
            "http://www.trisotech.com/definitions/_edbd2d8e-a5a8-4660-9bb9-adaa792d900c", "simple U table",
            tInputData)));
  }

  @Test
  public void testRuleParameterName3() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("isAffordable");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("isAffordable",
        dmnExpressionToNativeTransformer.ruleParameterName(new DRGElementReference<TDRGElement>(new ImportPath(null),
            "http://www.trisotech.com/definitions/_edbd2d8e-a5a8-4660-9bb9-adaa792d900c", "simple U table",
            tInputData)));
  }

  @Test
  public void testRuleParameterName4() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Age");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("age",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleParameterName(tInformationItem));
  }

  @Test
  public void testRuleParameterName5() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("MaritalStatus");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("maritalStatus",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleParameterName(tInformationItem));
  }

  @Test
  public void testRuleParameterName6() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("EmploymentStatus");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("employmentStatus",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleParameterName(tInformationItem));
  }

  @Test
  public void testRuleSignature() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleSignature(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleSignature2() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleSignature(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleSignature3() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new DMNExpressionToNativeTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .ruleSignature(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleSignature4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        dmnExpressionToNativeTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testRuleSignature5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        dmnExpressionToNativeTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testRuleSignature6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    DMNExpressionToNativeTransformer dmnExpressionToNativeTransformer = new DMNExpressionToNativeTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        dmnExpressionToNativeTransformer.ruleSignature(new TDecision()));
  }
}

