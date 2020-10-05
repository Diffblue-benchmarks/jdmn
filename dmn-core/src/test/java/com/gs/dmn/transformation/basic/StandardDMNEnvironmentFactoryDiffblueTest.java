package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.environment.Declaration;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.lazy.CompositeLazyEvaluationDetector;
import com.gs.dmn.transformation.lazy.LazyEvaluationDetector;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TContextEntry;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TLiteralExpression;

public class StandardDMNEnvironmentFactoryDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    StandardDMNEnvironmentFactory actualStandardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Assert
    assertTrue(actualStandardDMNEnvironmentFactory.dmnTransformer instanceof BasicDMN2JavaTransformer);
    assertTrue(actualStandardDMNEnvironmentFactory.environmentFactory instanceof StandardEnvironmentFactory);
    assertTrue(
        actualStandardDMNEnvironmentFactory.feelTranslator instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    StandardDMNEnvironmentFactory actualStandardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Assert
    assertTrue(actualStandardDMNEnvironmentFactory.dmnTransformer instanceof BasicDMN2JavaTransformer);
    assertTrue(actualStandardDMNEnvironmentFactory.environmentFactory instanceof StandardEnvironmentFactory);
    assertTrue(
        actualStandardDMNEnvironmentFactory.feelTranslator instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
  }

  @Test
  public void testConstructor3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    StandardDMNEnvironmentFactory actualStandardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Assert
    assertTrue(actualStandardDMNEnvironmentFactory.dmnTransformer instanceof BasicDMN2JavaTransformer);
    assertTrue(actualStandardDMNEnvironmentFactory.environmentFactory instanceof StandardEnvironmentFactory);
    assertTrue(
        actualStandardDMNEnvironmentFactory.feelTranslator instanceof com.gs.dmn.feel.synthesis.FEELTranslatorImpl);
  }

  @Test
  public void testDrgElementOutputFEELType() {
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

    // Act
    Type actualDrgElementOutputFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .drgElementOutputFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType2() {
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

    // Act
    Type actualDrgElementOutputFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .drgElementOutputFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType3() {
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

    // Act
    Type actualDrgElementOutputFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .drgElementOutputFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType4() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualDrgElementOutputFEELTypeResult = standardDMNEnvironmentFactory.drgElementOutputFEELType(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType5() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualDrgElementOutputFEELTypeResult = standardDMNEnvironmentFactory.drgElementOutputFEELType(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
  }

  @Test
  public void testDrgElementOutputFEELType6() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualDrgElementOutputFEELTypeResult = standardDMNEnvironmentFactory.drgElementOutputFEELType(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertSame(((StringType) actualDrgElementOutputFEELTypeResult).STRING, actualDrgElementOutputFEELTypeResult);
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
    Type actualDrgElementVariableFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .drgElementVariableFEELType(tInputData);

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
    Type actualDrgElementVariableFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .drgElementVariableFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableFEELType3() {
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

    // Act
    Type actualDrgElementVariableFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .drgElementVariableFEELType(tDecision);

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableFEELType4() {
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
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualDrgElementVariableFEELTypeResult = standardDMNEnvironmentFactory.drgElementVariableFEELType(tInputData,
        (new EnvironmentMemoizer()).get(tInputData));

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableFEELType5() {
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
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualDrgElementVariableFEELTypeResult = standardDMNEnvironmentFactory.drgElementVariableFEELType(tInputData,
        (new EnvironmentMemoizer()).get(tInputData));

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testDrgElementVariableFEELType6() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualDrgElementVariableFEELTypeResult = standardDMNEnvironmentFactory.drgElementVariableFEELType(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertSame(((StringType) actualDrgElementVariableFEELTypeResult).STRING, actualDrgElementVariableFEELTypeResult);
  }

  @Test
  public void testEntryType() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.number");
    TContextEntry tContextEntry = new TContextEntry();
    tContextEntry.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory, lazyEvaluationDetector,
            new TreeMap<String, String>()));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();

    // Act
    Type actualEntryTypeResult = standardDMNEnvironmentFactory.entryType(tBusinessKnowledgeModel, tContextEntry,
        instanceResult.makeEnvironment(
            instanceResult.makeEnvironment(environmentMemoizer.get(tBusinessKnowledgeModel), null), null));

    // Assert
    assertSame(((NumberType) actualEntryTypeResult).NUMBER, actualEntryTypeResult);
  }

  @Test
  public void testEntryType2() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.number");
    TContextEntry tContextEntry = new TContextEntry();
    tContextEntry.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory, lazyEvaluationDetector,
            new TreeMap<String, String>()));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();

    // Act
    Type actualEntryTypeResult = standardDMNEnvironmentFactory.entryType(tBusinessKnowledgeModel, tContextEntry,
        instanceResult.makeEnvironment(
            instanceResult.makeEnvironment(environmentMemoizer.get(tBusinessKnowledgeModel), null), null));

    // Assert
    assertSame(((NumberType) actualEntryTypeResult).NUMBER, actualEntryTypeResult);
  }

  @Test
  public void testEntryType3() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.boolean");
    TContextEntry tContextEntry = new TContextEntry();
    tContextEntry.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory, lazyEvaluationDetector,
            new TreeMap<String, String>()));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();

    // Act
    Type actualEntryTypeResult = standardDMNEnvironmentFactory.entryType(tBusinessKnowledgeModel, tContextEntry,
        instanceResult.makeEnvironment(
            instanceResult.makeEnvironment(environmentMemoizer.get(tBusinessKnowledgeModel), null), null));

    // Assert
    assertSame(((BooleanType) actualEntryTypeResult).BOOLEAN, actualEntryTypeResult);
  }

  @Test
  public void testExpressionType() {
    // Arrange
    TLiteralExpression tLiteralExpression = new TLiteralExpression();
    tLiteralExpression.setText("\"Approved\"");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();

    // Act
    Type actualExpressionTypeResult = standardDMNEnvironmentFactory.expressionType(tDecision, tLiteralExpression,
        environmentMemoizer.get(tDecision));

    // Assert
    assertSame(((StringType) actualExpressionTypeResult).STRING, actualExpressionTypeResult);
  }

  @Test
  public void testExpressionType2() {
    // Arrange
    TLiteralExpression tLiteralExpression = new TLiteralExpression();
    tLiteralExpression.setText("\"Approved\"");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();

    // Act
    Type actualExpressionTypeResult = standardDMNEnvironmentFactory.expressionType(tDecision, tLiteralExpression,
        environmentMemoizer.get(tDecision));

    // Assert
    assertSame(((StringType) actualExpressionTypeResult).STRING, actualExpressionTypeResult);
  }

  @Test
  public void testExpressionType3() {
    // Arrange
    TLiteralExpression tLiteralExpression = new TLiteralExpression();
    tLiteralExpression.setText("\"Approved\"");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();

    // Act
    Type actualExpressionTypeResult = standardDMNEnvironmentFactory.expressionType(tDecision, tLiteralExpression,
        environmentMemoizer.get(tDecision));

    // Assert
    assertSame(((StringType) actualExpressionTypeResult).STRING, actualExpressionTypeResult);
  }

  @Test
  public void testLookupPrimitiveType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualLookupPrimitiveTypeResult = standardDMNEnvironmentFactory
        .lookupPrimitiveType(QualifiedName.toQualifiedName(new TDefinitions(), "feel.string"));

    // Assert
    assertSame(((StringType) actualLookupPrimitiveTypeResult).STRING, actualLookupPrimitiveTypeResult);
  }

  @Test
  public void testLookupPrimitiveType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualLookupPrimitiveTypeResult = standardDMNEnvironmentFactory
        .lookupPrimitiveType(QualifiedName.toQualifiedName(new TDefinitions(), "feel.string"));

    // Assert
    assertSame(((StringType) actualLookupPrimitiveTypeResult).STRING, actualLookupPrimitiveTypeResult);
  }

  @Test
  public void testLookupPrimitiveType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Type actualLookupPrimitiveTypeResult = standardDMNEnvironmentFactory
        .lookupPrimitiveType(QualifiedName.toQualifiedName(new TDefinitions(), "feel.number"));

    // Assert
    assertSame(((NumberType) actualLookupPrimitiveTypeResult).NUMBER, actualLookupPrimitiveTypeResult);
  }

  @Test
  public void testMakeDeclaration() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Declaration actualMakeDeclarationResult = standardDMNEnvironmentFactory.makeDeclaration(tInputData,
        instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null), tInputData);

    // Assert
    assertTrue(actualMakeDeclarationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertEquals("Full Name", actualMakeDeclarationResult.getName());
  }

  @Test
  public void testMakeDeclaration2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    Environment parentEnvironment = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);

    // Act
    Declaration actualMakeDeclarationResult = standardDMNEnvironmentFactory.makeDeclaration(new TDecision(),
        parentEnvironment, tInputData);

    // Assert
    assertTrue(actualMakeDeclarationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertEquals("Full Name", actualMakeDeclarationResult.getName());
  }

  @Test
  public void testMakeDeclaration3() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Greeting Message");
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act
    Declaration actualMakeDeclarationResult = standardDMNEnvironmentFactory.makeDeclaration(tDecision,
        instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null), tDecision);

    // Assert
    assertTrue(actualMakeDeclarationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertEquals("Greeting Message", actualMakeDeclarationResult.getName());
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
    assertNull((new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeEnvironment(tInputData)
            .getInputExpression());
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
    assertNull((new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeEnvironment(tInputData)
            .getInputExpression());
  }

  @Test
  public void testMakeEnvironment3() {
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
    assertNull((new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeEnvironment(tDecision)
            .getInputExpression());
  }

  @Test
  public void testMakeEnvironment4() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory.makeEnvironment(tInputData, instanceResult.getRootEnvironment())
        .getInputExpression());
  }

  @Test
  public void testMakeEnvironment5() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Greeting Message");
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory.makeEnvironment(tDecision, instanceResult.getRootEnvironment())
        .getInputExpression());
  }

  @Test
  public void testMakeEnvironment6() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory.makeEnvironment(tInputData, instanceResult.getRootEnvironment())
        .getInputExpression());
  }

  @Test
  public void testMakeEnvironment7() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory.makeEnvironment(tInputData, instanceResult.getRootEnvironment(), true)
        .getInputExpression());
  }

  @Test
  public void testMakeEnvironment8() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Greeting Message");
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory.makeEnvironment(tDecision, instanceResult.getRootEnvironment(), true)
        .getInputExpression());
  }

  @Test
  public void testMakeEnvironment9() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Full Name");
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory.makeEnvironment(tInputData, instanceResult.getRootEnvironment(), true)
        .getInputExpression());
  }

  @Test
  public void testMakeFunctionDefinitionEnvironment() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory, lazyEvaluationDetector,
            new TreeMap<String, String>()));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    Environment parentEnvironment = environmentMemoizer.get(tBusinessKnowledgeModel);

    // Act
    Environment actualMakeFunctionDefinitionEnvironmentResult = standardDMNEnvironmentFactory
        .makeFunctionDefinitionEnvironment(tBusinessKnowledgeModel, new TFunctionDefinition(), parentEnvironment);

    // Assert
    assertNull(actualMakeFunctionDefinitionEnvironmentResult.getInputExpression());
    assertNull(actualMakeFunctionDefinitionEnvironmentResult.getParent());
  }

  @Test
  public void testMakeFunctionDefinitionEnvironment2() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory, lazyEvaluationDetector,
            new TreeMap<String, String>()));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    Environment parentEnvironment = instanceResult.makeEnvironment(environmentMemoizer.get(tBusinessKnowledgeModel),
        null);

    // Act and Assert
    assertNull(standardDMNEnvironmentFactory
        .makeFunctionDefinitionEnvironment(tBusinessKnowledgeModel, new TFunctionDefinition(), parentEnvironment)
        .getInputExpression());
  }

  @Test
  public void testMakeFunctionDefinitionEnvironment3() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory, lazyEvaluationDetector,
            new TreeMap<String, String>()));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    Environment parentEnvironment = environmentMemoizer.get(tBusinessKnowledgeModel);

    // Act
    Environment actualMakeFunctionDefinitionEnvironmentResult = standardDMNEnvironmentFactory
        .makeFunctionDefinitionEnvironment(tBusinessKnowledgeModel, new TFunctionDefinition(), parentEnvironment);

    // Assert
    assertNull(actualMakeFunctionDefinitionEnvironmentResult.getInputExpression());
    assertNull(actualMakeFunctionDefinitionEnvironmentResult.getParent());
  }

  @Test
  public void testMakeOutputEntryEnvironment() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Approval Status");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Environment actualMakeOutputEntryEnvironmentResult = (new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))).makeOutputEntryEnvironment(tDecision, instanceResult);

    // Assert
    assertNull(actualMakeOutputEntryEnvironmentResult.getInputExpression());
    assertNull(actualMakeOutputEntryEnvironmentResult.getParent().getInputExpressionType());
  }

  @Test
  public void testMakeOutputEntryEnvironment2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Approval Status");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Environment actualMakeOutputEntryEnvironmentResult = (new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))).makeOutputEntryEnvironment(tDecision, instanceResult);

    // Assert
    assertNull(actualMakeOutputEntryEnvironmentResult.getInputExpression());
    assertNull(actualMakeOutputEntryEnvironmentResult.getParent().getInputExpressionType());
  }

  @Test
  public void testMakeOutputEntryEnvironment3() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("Approval Status");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Environment actualMakeOutputEntryEnvironmentResult = (new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters))).makeOutputEntryEnvironment(tDecision, instanceResult);

    // Assert
    assertNull(actualMakeOutputEntryEnvironmentResult.getInputExpression());
    assertNull(actualMakeOutputEntryEnvironmentResult.getParent().getInputExpressionType());
  }

  @Test
  public void testMakeVariableDeclaration() {
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
    Declaration actualMakeVariableDeclarationResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .makeVariableDeclaration(tInputData, tInformationItem);

    // Assert
    assertTrue(
        actualMakeVariableDeclarationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertEquals("Full Name", actualMakeVariableDeclarationResult.getName());
  }

  @Test
  public void testMakeVariableDeclaration2() {
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
    Declaration actualMakeVariableDeclarationResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .makeVariableDeclaration(tInputData, tInformationItem);

    // Assert
    assertTrue(
        actualMakeVariableDeclarationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertEquals("Full Name", actualMakeVariableDeclarationResult.getName());
  }

  @Test
  public void testMakeVariableDeclaration3() {
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

    // Act
    Declaration actualMakeVariableDeclarationResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .makeVariableDeclaration(tDecision, tInformationItem);

    // Assert
    assertTrue(
        actualMakeVariableDeclarationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertEquals("Greeting Message", actualMakeVariableDeclarationResult.getName());
  }

  @Test
  public void testToFEELType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    Type actualToFEELTypeResult = standardDMNEnvironmentFactory.toFEELType(tDefinitions,
        QualifiedName.toQualifiedName(tDefinitions, "feel.string"));

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    Type actualToFEELTypeResult = standardDMNEnvironmentFactory.toFEELType(tDefinitions,
        QualifiedName.toQualifiedName(tDefinitions, "feel.string"));

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    StandardDMNEnvironmentFactory standardDMNEnvironmentFactory = new StandardDMNEnvironmentFactory(
        new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    Type actualToFEELTypeResult = standardDMNEnvironmentFactory.toFEELType(tDefinitions,
        QualifiedName.toQualifiedName(tDefinitions, "feel.string"));

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType4() {
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
    Type actualToFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .toFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType5() {
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
    Type actualToFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .toFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType6() {
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
    Type actualToFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .toFEELType(tInputData);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType7() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.string");
    tItemDefinition.setIsCollection((Boolean) false);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .toFEELType(tItemDefinition);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType8() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.string");
    tItemDefinition.setIsCollection((Boolean) false);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .toFEELType(tItemDefinition);

    // Assert
    assertSame(((StringType) actualToFEELTypeResult).STRING, actualToFEELTypeResult);
  }

  @Test
  public void testToFEELType9() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.number");
    tItemDefinition.setIsCollection((Boolean) false);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Type actualToFEELTypeResult = (new StandardDMNEnvironmentFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .toFEELType(tItemDefinition);

    // Assert
    assertSame(((NumberType) actualToFEELTypeResult).NUMBER, actualToFEELTypeResult);
  }
}

