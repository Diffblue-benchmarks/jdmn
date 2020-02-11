package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionRule;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TLiteralExpression;
import org.omg.spec.dmn._20180521.model.TOutputClause;

public class DecisionTableToJavaTransformerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void aggregationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    assertNull(decisionTableToJavaTransformer.aggregation(new TDecisionTable()));
  }
  @Test(timeout=10000)
  public void priorityTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.priority(element, new TLiteralExpression(), 1);
  }
  @Test(timeout=10000)
  public void defaultValueTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.defaultValue(new TDRGElement());
  }
  @Test(timeout=10000)
  public void annotationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("\"\"", decisionTableToJavaTransformer.annotation(element, new TDecisionRule()));
  }
  @Test(timeout=10000)
  public void outputClauseClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.outputClauseClassName(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void conditionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.condition(element, new TDecisionRule());
  }
  @Test(timeout=10000)
  public void hitPolicyTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.hitPolicy(new TDRGElement());
  }
  @Test(timeout=10000)
  public void priorityGetterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.priorityGetter(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void outputClausePriorityVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.outputClausePriorityVariableName(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void prioritySetterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.prioritySetter(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void ruleOutputClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    assertEquals("NullRuleOutput", decisionTableToJavaTransformer.ruleOutputClassName(new TDRGElement()));
  }
  @Test(timeout=10000)
  public void abstractRuleOutputClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            new NopLazyEvaluationDetector(), null))).abstractRuleOutputClassName());
  }
  @Test(timeout=10000)
  public void setterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.setter(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void ruleAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.Rule",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            new NopLazyEvaluationDetector(), null))).ruleAnnotationClassName());
  }
  @Test(timeout=10000)
  public void outputEntryToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.outputEntryToJava(element, new TLiteralExpression(), 1);
  }
  @Test(timeout=10000)
  public void ruleOutputListClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutputList",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            new NopLazyEvaluationDetector(), null))).ruleOutputListClassName());
  }
  @Test(timeout=10000)
  public void outputClauseVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.outputClauseVariableName(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void annotationEscapedTextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    assertEquals("", decisionTableToJavaTransformer.annotationEscapedText(new TDecisionRule()));
  }
  @Test(timeout=10000)
  public void hitPolicyAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy",
        (new DecisionTableToJavaTransformer(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
            new NopLazyEvaluationDetector(), null))).hitPolicyAnnotationClassName());
  }
  @Test(timeout=10000)
  public void ruleSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        decisionTableToJavaTransformer.ruleSignature(new TDecision()));
  }
  @Test(timeout=10000)
  public void getterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.getter(element, new TOutputClause());
  }
  @Test(timeout=10000)
  public void defaultValueTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("null", decisionTableToJavaTransformer.defaultValue(element, new TOutputClause()));
  }
  @Test(timeout=10000)
  public void ruleArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    assertEquals("annotationSet_", decisionTableToJavaTransformer.ruleArgumentList(new TDecision()));
  }
  @Test(timeout=10000)
  public void aggregatorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    DecisionTableToJavaTransformer decisionTableToJavaTransformer = new DecisionTableToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    TDRGElement element = new TDRGElement();
    TDecisionTable decisionTable = new TDecisionTable();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    decisionTableToJavaTransformer.aggregator(element, decisionTable, new TOutputClause(), "name");
  }
}

