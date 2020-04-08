package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBuiltinAggregator;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionRule;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TOutputClause;

public class DecisionTableToJavaTransformerDiffblueTest {
  @Test
  public void testAbstractRuleOutputClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            lazyEvaluationDetector, stringStringMap))).abstractRuleOutputClassName());
  }

  @Test
  public void testAggregation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));

    // Act and Assert
    assertNull(decisionTableToJavaTransformer.aggregation(new TDecisionTable()));
  }

  @Test
  public void testAggregator() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TDecisionTable tDecisionTable = new TDecisionTable();
    tDecisionTable.setAggregation(TBuiltinAggregator.MIN);
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("min(-.stream().map(o -> ((NullRuleOutput)o).getValue" + "()).collect(Collectors.toList()))",
        decisionTableToJavaTransformer.aggregator(element, tDecisionTable, tOutputClause, "-"));
  }

  @Test
  public void testAggregator2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TDecisionTable tDecisionTable = new TDecisionTable();
    tDecisionTable.setAggregation(TBuiltinAggregator.SUM);
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("sum(-.stream().map(o -> ((NullRuleOutput)o).getValue" + "()).collect(Collectors.toList()))",
        decisionTableToJavaTransformer.aggregator(element, tDecisionTable, tOutputClause, "-"));
  }

  @Test
  public void testAggregator3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TDecisionTable tDecisionTable = new TDecisionTable();
    tDecisionTable.setAggregation(TBuiltinAggregator.COUNT);
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("number(String.format(\"%d\", -.size()))",
        decisionTableToJavaTransformer.aggregator(element, tDecisionTable, tOutputClause, "-"));
  }

  @Test
  public void testAggregator4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TDecisionTable tDecisionTable = new TDecisionTable();
    tDecisionTable.setAggregation(TBuiltinAggregator.MAX);
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("max(-.stream().map(o -> ((NullRuleOutput)o).getValue" + "()).collect(Collectors.toList()))",
        decisionTableToJavaTransformer.aggregator(element, tDecisionTable, tOutputClause, "-"));
  }

  @Test
  public void testAnnotation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("\"\"", decisionTableToJavaTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDecisionRule tDecisionRule = new TDecisionRule();
    tDecisionRule.setDescription("value");

    // Act and Assert
    assertEquals("value", decisionTableToJavaTransformer.annotationEscapedText(tDecisionRule));
  }

  @Test
  public void testAnnotationEscapedText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));

    // Act and Assert
    assertEquals("", decisionTableToJavaTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testDefaultValue() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("null", decisionTableToJavaTransformer.defaultValue(element, new TOutputClause()));
  }

  @Test
  public void testHitPolicyAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            lazyEvaluationDetector, stringStringMap))).hitPolicyAnnotationClassName());
  }

  @Test
  public void testOutputClausePriorityVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("valuePriority",
        decisionTableToJavaTransformer.outputClausePriorityVariableName(element, tOutputClause));
  }

  @Test
  public void testOutputClauseVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("value", decisionTableToJavaTransformer.outputClauseVariableName(element, tOutputClause));
  }

  @Test
  public void testPriorityGetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("getValuePriority()", decisionTableToJavaTransformer.priorityGetter(element, tOutputClause));
  }

  @Test
  public void testPrioritySetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("setValuePriority", decisionTableToJavaTransformer.prioritySetter(element, tOutputClause));
  }

  @Test
  public void testRuleAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.Rule",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            lazyEvaluationDetector, stringStringMap))).ruleAnnotationClassName());
  }

  @Test
  public void testRuleArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));

    // Act and Assert
    assertEquals("annotationSet_", decisionTableToJavaTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());

    // Act and Assert
    assertEquals("annotationSet_", decisionTableToJavaTransformer.ruleArgumentList(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleId() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ArrayList<TDecisionRule> tDecisionRuleList = new ArrayList<TDecisionRule>();
    TDecisionRule tDecisionRule = new TDecisionRule();
    tDecisionRuleList.add(tDecisionRule);

    // Act and Assert
    assertEquals("0", decisionTableToJavaTransformer.ruleId(tDecisionRuleList, tDecisionRule));
  }

  @Test
  public void testRuleId2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ArrayList<TDecisionRule> tDecisionRuleList = new ArrayList<TDecisionRule>();
    TDecisionRule tDecisionRule = new TDecisionRule();
    tDecisionRule.setId("value");
    tDecisionRuleList.add(tDecisionRule);

    // Act and Assert
    assertEquals("value", decisionTableToJavaTransformer.ruleId(tDecisionRuleList, tDecisionRule));
  }

  @Test
  public void testRuleOutputClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));

    // Act and Assert
    assertEquals("NullRuleOutput", decisionTableToJavaTransformer.ruleOutputClassName(new TDRGElement()));
  }

  @Test
  public void testRuleOutputListClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutputList",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            lazyEvaluationDetector, stringStringMap))).ruleOutputListClassName());
  }

  @Test
  public void testRuleSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        decisionTableToJavaTransformer.ruleSignature(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        decisionTableToJavaTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testSetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("setValue", decisionTableToJavaTransformer.setter(element, tOutputClause));
  }
}

