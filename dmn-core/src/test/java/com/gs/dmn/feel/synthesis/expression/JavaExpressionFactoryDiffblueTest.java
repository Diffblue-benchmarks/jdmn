package com.gs.dmn.feel.synthesis.expression;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.CompositeLazyEvaluationDetector;
import com.gs.dmn.transformation.lazy.LazyEvaluationDetector;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.TItemDefinition;

public class JavaExpressionFactoryDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER)",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .constructor("com.gs.dmn.runtime.listener.LoggingEventListener", "LOGGER"));
  }

  @Test
  public void testConstructor2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor()",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .constructor("com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor", ""));
  }

  @Test
  public void testConstructor3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.cache.DefaultCache()",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .constructor("com.gs.dmn.runtime.cache.DefaultCache", ""));
  }

  @Test
  public void testConvertDecisionArgumentFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    JavaExpressionFactory javaExpressionFactory = new JavaExpressionFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? com.gs.dmn.serialization.JsonSerializer.OBJECT_MAPPER.readValue(monthlySalary,"
            + " new com.fasterxml.jackson.core.type.TypeReference<java.math.BigDecimalImpl>() {}) : null)",
        javaExpressionFactory.convertDecisionArgumentFromString("monthlySalary", new NumberType()));
  }

  @Test
  public void testConvertDecisionArgumentFromString2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    JavaExpressionFactory javaExpressionFactory = new JavaExpressionFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? com.gs.dmn.serialization.JsonSerializer.OBJECT_MAPPER.readValue(monthlySalary,"
            + " new com.fasterxml.jackson.core.type.TypeReference<java.math.BigDecimalImpl>() {}) : null)",
        javaExpressionFactory.convertDecisionArgumentFromString("monthlySalary", new NumberType()));
  }

  @Test
  public void testConvertDecisionArgumentFromString3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    JavaExpressionFactory javaExpressionFactory = new JavaExpressionFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals(
        "(monthlySalary != null ? com.gs.dmn.serialization.JsonSerializer.OBJECT_MAPPER.readValue(monthlySalary,"
            + " new com.fasterxml.jackson.core.type.TypeReference<java.math.BigDecimalImpl>() {}) : null)",
        javaExpressionFactory.convertDecisionArgumentFromString("monthlySalary", new NumberType()));
  }

  @Test
  public void testConvertMethodName() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("tLoan");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("toTLoan",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).convertMethodName(tItemDefinition));
  }

  @Test
  public void testConvertMethodName2() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("tLoan");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("toTLoan",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).convertMethodName(tItemDefinition));
  }

  @Test
  public void testConvertMethodName3() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("tLoan");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("toTLoan",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).convertMethodName(tItemDefinition));
  }

  @Test
  public void testFalseConstant() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean.FALSE", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).falseConstant());
  }

  @Test
  public void testFalseConstant2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean.FALSE", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).falseConstant());
  }

  @Test
  public void testFalseConstant3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean.FALSE", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).falseConstant());
  }

  @Test
  public void testMakeEquality() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "Boolean.TRUE == booleanAnd(\n" + "            (numericGreaterEqualThan(age, number(\"18\"))),\n"
            + "            booleanOr((stringEqual(riskCategory, \"Medium\")), (stringEqual(riskCategory, \"Low\"))),\n"
            + "            (booleanEqual(isAffordable, Boolean.TRUE))\n" + "        )",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(
            dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(),
            inputParameters))).makeEquality("Boolean.TRUE", "booleanAnd(\n"
                + "            (numericGreaterEqualThan(age, number(\"18\"))),\n"
                + "            booleanOr((stringEqual(riskCategory, \"Medium\")), (stringEqual(riskCategory, \"Low\"))),\n"
                + "            (booleanEqual(isAffordable, Boolean.TRUE))\n" + "        )"));
  }

  @Test
  public void testMakeEquality2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "Boolean.TRUE == booleanAnd(\n" + "            (numericLessThan(age, number(\"18\"))),\n"
            + "            booleanOr((stringEqual(riskCategory, \"Medium\")), (stringEqual(riskCategory, \"Low\"))),\n"
            + "            (booleanEqual(isAffordable, Boolean.TRUE))\n" + "        )",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(
            dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(),
            inputParameters))).makeEquality("Boolean.TRUE", "booleanAnd(\n"
                + "            (numericLessThan(age, number(\"18\"))),\n"
                + "            booleanOr((stringEqual(riskCategory, \"Medium\")), (stringEqual(riskCategory, \"Low\"))),\n"
                + "            (booleanEqual(isAffordable, Boolean.TRUE))\n" + "        )"));
  }

  @Test
  public void testMakeEquality3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals(
        "Boolean.TRUE == booleanAnd(\n" + "            (stringEqual(riskCategory, \"High\")),\n"
            + "            (booleanEqual(isAffordable, Boolean.TRUE))\n" + "        )",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeEquality("Boolean.TRUE",
                "booleanAnd(\n" + "            (stringEqual(riskCategory, \"High\")),\n"
                    + "            (booleanEqual(isAffordable, Boolean.TRUE))\n" + "        )"));
  }

  @Test
  public void testMakeForExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    JavaExpressionFactory javaExpressionFactory = new JavaExpressionFactory(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));

    // Act and Assert
    assertEquals(
        "com.gs.dmn.generated.tck.cl3_0003_iteration.PMT2.PMT2(i, annotationSet_, eventListener_, externalExecutor_,"
            + " cache_).collect(Collectors.toList())",
        javaExpressionFactory.makeForExpression(new ArrayList<Pair<String, String>>(),
            "com.gs.dmn.generated.tck.cl3_0003_iteration.PMT2.PMT2(i, annotationSet_, eventListener_, externalExecutor_,"
                + " cache_)"));
  }

  @Test
  public void testMakeIfExpression() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "(booleanEqual(numericGreaterThan(numericMultiply(disposableIncome, creditContingencyFactor),"
            + " requiredMonthlyInstallment), Boolean.TRUE)) ? Boolean.TRUE : Boolean.FALSE",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>()))).makeIfExpression(
                "numericGreaterThan(numericMultiply(disposableIncome, creditContingencyFactor), requiredMonthlyInstallment"
                    + ")",
                "Boolean.TRUE", "Boolean.FALSE"));
  }

  @Test
  public void testMakeIfExpression2() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("(booleanEqual(stringEqual(productType, \"SPECIAL LOAN\"), Boolean.TRUE)) ? number(\"25.00\") : null",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .makeIfExpression("stringEqual(productType, \"SPECIAL LOAN\")", "number(\"25.00\")", "null"));
  }

  @Test
  public void testMakeIfExpression3() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "(booleanEqual(stringEqual(productType, \"STANDARD LOAN\"), Boolean.TRUE)) ? number(\"20.00\") :"
            + " (booleanEqual(stringEqual(productType, \"SPECIAL LOAN\"), Boolean.TRUE)) ? number(\"25.00\") : null",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>()))).makeIfExpression(
                "stringEqual(productType, \"STANDARD LOAN\")", "number(\"20.00\")",
                "(booleanEqual(stringEqual(productType, \"SPECIAL LOAN\"), Boolean.TRUE)) ? number(\"25.00\") : null"));
  }

  @Test
  public void testMakeMemberAssignment() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("basic.setStartsWithX(startsWithX);",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeMemberAssignment("basic",
                "startsWithX", "startsWithX"));
  }

  @Test
  public void testMakeMemberAssignment2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("basic.setStartsWithB(startsWithB);",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeMemberAssignment("basic",
                "startsWithB", "startsWithB"));
  }

  @Test
  public void testMakeMemberAssignment3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("basic.setEndsWithX(endsWithX);",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeMemberAssignment("basic",
                "endsWithX", "endsWithX"));
  }

  @Test
  public void testMakeReturn() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("return basic;", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeReturn("basic"));
  }

  @Test
  public void testMakeReturn2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("return replace;",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeReturn("replace"));
  }

  @Test
  public void testMakeReturn3() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals("return affordability;",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>()))).makeReturn("affordability"));
  }

  @Test
  public void testMakeSumAggregator() {
    // Arrange
    CompositeLazyEvaluationDetector lazyEvaluationDetector = new CompositeLazyEvaluationDetector(
        new ArrayList<LazyEvaluationDetector>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();

    // Act and Assert
    assertEquals(
        "sum(ruleOutputs_.stream().map(o -> ((ApplicationRiskScoreModelRuleOutput)o).getApplicationRiskScoreModel"
            + "()).collect(Collectors.toList()))",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, lazyEvaluationDetector, new TreeMap<String, String>())))
                .makeSumAggregator("ruleOutputs_", "ApplicationRiskScoreModelRuleOutput", "applicationRiskScoreModel"));
  }

  @Test
  public void testMakeVariableAssignment() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean startsWithX = startsWith(a, \"x\");",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeVariableAssignment("Boolean",
                "startsWithX", "startsWith(a, \"x\")"));
  }

  @Test
  public void testMakeVariableAssignment2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean startsWithB = startsWith(a, b);",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeVariableAssignment("Boolean",
                "startsWithB", "startsWith(a, b)"));
  }

  @Test
  public void testMakeVariableAssignment3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean endsWithX = endsWith(a, \"x\");",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).makeVariableAssignment("Boolean",
                "endsWithX", "endsWith(a, \"x\")"));
  }

  @Test
  public void testNullableParameter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String fullName",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).nullableParameter("String",
                "fullName"));
  }

  @Test
  public void testNullableParameter2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String fullName",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).nullableParameter("String",
                "fullName"));
  }

  @Test
  public void testNullableParameter3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("String fullName",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).nullableParameter("String",
                "fullName"));
  }

  @Test
  public void testParameter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .parameter("com.gs.dmn.runtime.annotation.AnnotationSet", "annotationSet_"));
  }

  @Test
  public void testParameter2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .parameter("com.gs.dmn.runtime.annotation.AnnotationSet", "annotationSet_"));
  }

  @Test
  public void testParameter3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener eventListener_",
        (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
            nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
                .parameter("com.gs.dmn.runtime.listener.EventListener", "eventListener_"));
  }

  @Test
  public void testTrueConstant() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean.TRUE", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).trueConstant());
  }

  @Test
  public void testTrueConstant2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean.TRUE", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).trueConstant());
  }

  @Test
  public void testTrueConstant3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act and Assert
    assertEquals("Boolean.TRUE", (new JavaExpressionFactory(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters))).trueConstant());
  }
}

