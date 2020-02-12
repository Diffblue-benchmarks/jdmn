package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.Parameter;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BuiltinFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.ItemDefinitionType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.synthesis.FEELTranslator;
import com.gs.dmn.feel.synthesis.FEELTranslatorImpl;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.feel.synthesis.type.FEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.transformation.java.CompoundStatement;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TContextEntry;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionRule;
import org.omg.spec.dmn._20180521.model.TDecisionService;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TExpression;
import org.omg.spec.dmn._20180521.model.TFunctionKind;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TInvocable;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TLiteralExpression;
import org.omg.spec.dmn._20180521.model.TNamedElement;
import org.omg.spec.dmn._20180521.model.TOutputClause;

public class BasicDMN2JavaTransformerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void pairClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Pair", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).pairClassName());
  }

  @Test(timeout=10000)
  public void qualifiedNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo.name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).qualifiedName("foo", "name"));
  }

  @Test(timeout=10000)
  public void convertExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    CompoundStatement compoundStatement = new CompoundStatement();

    // Act and Assert
    assertSame(compoundStatement, basicDMN2JavaTransformer.convertExpression(compoundStatement, new AnyType()));
  }

  @Test(timeout=10000)
  public void isFEELFunctionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertTrue((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).isFEELFunction(TFunctionKind.FEEL));
  }

  @Test(timeout=10000)
  public void evaluateElementCommentTextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.evaluateElementCommentText(new TDRGElement());
  }

  @Test(timeout=10000)
  public void drgElementDefaultArgumentsExtraTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals(
        "foo, new com.gs.dmn.runtime.listener.LoggingEventListener" + "(LOGGER), new com.gs.dmn.runtime.external"
            + ".DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null)).drgElementDefaultArgumentsExtra("foo"));
  }

  @Test(timeout=10000)
  public void drgElementSignatureExtraTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals(
        "foo, com.gs.dmn.runtime.listener.EventListener" + " eventListener_, com.gs.dmn.runtime.external"
            + ".ExternalFunctionExecutor externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null)).drgElementSignatureExtra("foo"));
  }

  @Test(timeout=10000)
  public void assertClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).assertClassName());
  }

  @Test(timeout=10000)
  public void conditionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.condition(element, new TDecisionRule());
  }

  @Test(timeout=10000)
  public void toFEELTypeTest3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act
    Type actualToFEELTypeResult = basicDMN2JavaTransformer.toFEELType(new TItemDefinition());

    // Assert
    assertSame(((AnyType) actualToFEELTypeResult).ANY, actualToFEELTypeResult);
  }

  @Test(timeout=10000)
  public void hitPolicyTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.hitPolicy(new TDRGElement());
  }

  @Test(timeout=10000)
  public void isLazyEvaluatedTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isLazyEvaluated(new TDRGElement()));
  }

  @Test(timeout=10000)
  public void parameterJavaTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.parameterJavaType(new TNamedElement());
  }

  @Test(timeout=10000)
  public void itemDefinitionJavaInterfaceNameTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    basicDMN2JavaTransformer.itemDefinitionJavaInterfaceName(new TItemDefinition());
  }

  @Test(timeout=10000)
  public void argumentsClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Arguments", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).argumentsClassName());
  }

  @Test(timeout=10000)
  public void prioritySetterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.prioritySetter(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void isLazyEvaluatedTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).isLazyEvaluated("name"));
  }

  @Test(timeout=10000)
  public void drgElementSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementSignature(new TDRGElement());
  }

  @Test(timeout=10000)
  public void ruleOutputClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("NullRuleOutput", basicDMN2JavaTransformer.ruleOutputClassName(new TDRGElement()));
  }

  @Test(timeout=10000)
  public void cacheVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("cache_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).cacheVariableName());
  }

  @Test(timeout=10000)
  public void convertDecisionArgumentTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("name", basicDMN2JavaTransformer.convertDecisionArgument("name", new AnyType()));
  }

  @Test(timeout=10000)
  public void itemDefinitionTypeNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("Object", basicDMN2JavaTransformer.itemDefinitionTypeName(new TItemDefinition()));
  }

  @Test(timeout=10000)
  public void defaultConstructorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("new name()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).defaultConstructor("name"));
  }

  @Test(timeout=10000)
  public void getEnvironmentFactoryTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertNull((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).getEnvironmentFactory());
  }

  @Test(timeout=10000)
  public void toStringJavaTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toStringJavaType(new AnyType()));
  }

  @Test(timeout=10000)
  public void abstractRuleOutputClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).abstractRuleOutputClassName());
  }

  @Test(timeout=10000)
  public void setterTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.setter(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void isJavaFunctionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).isJavaFunction(TFunctionKind.FEEL));
  }

  @Test(timeout=10000)
  public void addDeclarationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement parent = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.addDeclaration(parent, (Environment) null, new TDRGElement(), null);
  }

  @Test(timeout=10000)
  public void convertToItemDefinitionTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("type.Name.toName(foo)",
        basicDMN2JavaTransformer.convertToItemDefinitionType("foo", new ItemDefinitionType("name")));
  }

  @Test(timeout=10000)
  public void lazyEvaluationTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("foo", basicDMN2JavaTransformer.lazyEvaluationType(new TDRGElement(), "foo"));
  }

  @Test(timeout=10000)
  public void fluentConstructorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("new name()foo", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).fluentConstructor("name", "foo"));
  }

  @Test(timeout=10000)
  public void outputEntryToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.outputEntryToJava(element, new TLiteralExpression(), 1);
  }

  @Test(timeout=10000)
  public void drgElementOutputTypeRefTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementOutputTypeRef(new TDRGElement());
  }

  @Test(timeout=10000)
  public void drgElementDirectSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementDirectSignature(new TDRGElement());
  }

  @Test(timeout=10000)
  public void decisionTopologicalConstructorSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionTopologicalConstructorSignature(new TDecision()));
  }

  @Test(timeout=10000)
  public void makeVariableDeclarationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TNamedElement element = new TNamedElement();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.makeVariableDeclaration(element, new TInformationItem(), null);
  }

  @Test(timeout=10000)
  public void ruleSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        basicDMN2JavaTransformer.ruleSignature(new TDecision()));
  }

  @Test(timeout=10000)
  public void toFEELTypeTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(), null))
        .toFEELType("name");
  }

  @Test(timeout=10000)
  public void variableTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.variableType(new TInformationItem()));
  }

  @Test(timeout=10000)
  public void dmnTypeClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.DMNType", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).dmnTypeClassName());
  }

  @Test(timeout=10000)
  public void toFEELTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.toFEELType(new QualifiedName("name"));
  }

  @Test(timeout=10000)
  public void drgRuleMetadataClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Rule", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).drgRuleMetadataClassName());
  }

  @Test(timeout=10000)
  public void drgElementArgumentNameListTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementArgumentNameList(new TDRGElement(), true);
  }

  @Test(timeout=10000)
  public void drgElementOutputFEELTypeTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    basicDMN2JavaTransformer.drgElementOutputFEELType(new TNamedElement());
  }

  @Test(timeout=10000)
  public void drgElementOutputTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    basicDMN2JavaTransformer.drgElementOutputType(new TNamedElement());
  }

  @Test(timeout=10000)
  public void externalExecutorVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).externalExecutorVariableName());
  }

  @Test(timeout=10000)
  public void drgElementArgumentsExtraCacheTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).drgElementArgumentsExtraCache("foo"));
  }

  @Test(timeout=10000)
  public void inputDataParametersClosureTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new TDecision()).size());
  }

  @Test(timeout=10000)
  public void drgElementMetadataClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.DRGElement", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).drgElementMetadataClassName());
  }

  @Test(timeout=10000)
  public void inputDataParametersClosureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new TDecision(), true).size());
  }

  @Test(timeout=10000)
  public void dsFEELParameterNamesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.dsFEELParameterNames(new TDecisionService()).size());
  }

  @Test(timeout=10000)
  public void drgElementVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementVariableName(new TDRGElement());
  }

  @Test(timeout=10000)
  public void isComplexTypeTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isComplexType(new TItemDefinition()));
  }

  @Test(timeout=10000)
  public void isComplexTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isComplexType(new AnyType()));
  }

  @Test(timeout=10000)
  public void annotationSetClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).annotationSetClassName());
  }

  @Test(timeout=10000)
  public void upperCaseFirstTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("Name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).upperCaseFirst("name"));
  }

  @Test(timeout=10000)
  public void toJavaTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("Object", basicDMN2JavaTransformer.toJavaType(new AnyType()));
  }

  @Test(timeout=10000)
  public void augmentArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo, annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).augmentArgumentList("foo"));
  }

  @Test(timeout=10000)
  public void loggingEventListenerClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.LoggingEventListener", (new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null)).loggingEventListenerClassName());
  }

  @Test(timeout=10000)
  public void invFEELParametersTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.invFEELParameters(new TDRGElement());
  }

  @Test(timeout=10000)
  public void entryTypeTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act
    Type actualEntryTypeResult = basicDMN2JavaTransformer.entryType(new TContextEntry(), null);

    // Assert
    assertSame(((AnyType) actualEntryTypeResult).ANY, actualEntryTypeResult);
  }

  @Test(timeout=10000)
  public void priorityGetterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.priorityGetter(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void javaRootPackageNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).javaRootPackageName());
  }

  @Test(timeout=10000)
  public void drgElementConvertedArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementConvertedArgumentList(new TDRGElement());
  }

  @Test(timeout=10000)
  public void itemDefinitionSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.itemDefinitionSignature(new TItemDefinition()));
  }

  @Test(timeout=10000)
  public void augmentSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo, com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null)).augmentSignature("foo"));
  }

  @Test(timeout=10000)
  public void decisionTopologicalConstructorNewArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionTopologicalConstructorNewArgumentList(new TDecision()));
  }

  @Test(timeout=10000)
  public void expressionKindAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.ExpressionKind", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).expressionKindAnnotationClassName());
  }

  @Test(timeout=10000)
  public void isCompoundStatementTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertTrue(basicDMN2JavaTransformer.isCompoundStatement(new CompoundStatement()));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator doubleMixedJavaTimeFEELTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act
    BasicDMN2JavaTransformer actualBasicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        doubleMixedJavaTimeFEELTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Assert
    FEELTranslator expectedFEELTranslator = actualBasicDMN2JavaTransformer.feelTranslator;
    DMNModelRepository actualDMNModelRepository = actualBasicDMN2JavaTransformer.getDMNModelRepository();
    FEELTranslator actualFEELTranslator = actualBasicDMN2JavaTransformer.getFEELTranslator();
    FEELTypeTranslator actualFEELTypeTranslator = actualBasicDMN2JavaTransformer.getFEELTypeTranslator();
    boolean actualIsCachingResult = actualBasicDMN2JavaTransformer.isCaching();
    assertSame(dmnModelRepository, actualDMNModelRepository);
    assertNull(actualBasicDMN2JavaTransformer.getEnvironmentFactory());
    assertSame(expectedFEELTranslator, actualFEELTranslator);
    assertFalse(actualIsCachingResult);
    assertSame(doubleMixedJavaTimeFEELTypeTranslator, actualFEELTypeTranslator);
  }

  @Test(timeout=10000)
  public void defaultCacheClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).defaultCacheClassName());
  }

  @Test(timeout=10000)
  public void isCachingTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).isCaching("foo"));
  }

  @Test(timeout=10000)
  public void ruleAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.Rule", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).ruleAnnotationClassName());
  }

  @Test(timeout=10000)
  public void getterTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("getName()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).getter("name"));
  }

  @Test(timeout=10000)
  public void outputClauseVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.outputClauseVariableName(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void annotationEscapedTextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test(timeout=10000)
  public void elementKindTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals(DRGElementKind.OTHER, basicDMN2JavaTransformer.elementKind(new TDRGElement()));
  }

  @Test(timeout=10000)
  public void javaFriendlyVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).javaFriendlyVariableName("name"));
  }

  @Test(timeout=10000)
  public void expressionTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.expressionType(new TExpression(), null);
  }

  @Test(timeout=10000)
  public void pairComparatorClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.PairComparator", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).pairComparatorClassName());
  }

  @Test(timeout=10000)
  public void defaultValueTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("null", basicDMN2JavaTransformer.defaultValue(element, new TOutputClause()));
  }

  @Test(timeout=10000)
  public void makeInvocableDeclarationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.makeInvocableDeclaration(new TInvocable(), null);
  }

  @Test(timeout=10000)
  public void drgElementMetadataFieldNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("DRG_ELEMENT_METADATA", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).drgElementMetadataFieldName());
  }

  @Test(timeout=10000)
  public void drgElementArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementArgumentList(new TDRGElement());
  }

  @Test(timeout=10000)
  public void lookupPrimitiveTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.lookupPrimitiveType(new QualifiedName("name")));
  }

  @Test(timeout=10000)
  public void eventListenerClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).eventListenerClassName());
  }

  @Test(timeout=10000)
  public void drgElementDirectArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementDirectArgumentList(new TDRGElement());
  }

  @Test(timeout=10000)
  public void aggregatorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();
    TDecisionTable decisionTable = new TDecisionTable();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.aggregator(element, decisionTable, new TOutputClause(), "name");
  }

  @Test(timeout=10000)
  public void drgElementOutputFEELTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.drgElementOutputFEELType(new TNamedElement(), null);
  }

  @Test(timeout=10000)
  public void getterNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("getName", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).getterName("name"));
  }

  @Test(timeout=10000)
  public void annotationSetVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).annotationSetVariableName());
  }

  @Test(timeout=10000)
  public void drgElementEvaluateArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementEvaluateArgumentList(new TDRGElement());
  }

  @Test(timeout=10000)
  public void getDMNModelRepositoryTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertSame(dmnModelRepository, (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).getDMNModelRepository());
  }

  @Test(timeout=10000)
  public void aggregationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.aggregation(new TDecisionTable()));
  }

  @Test(timeout=10000)
  public void annotationTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(element, new TDecisionRule()));
  }

  @Test(timeout=10000)
  public void javaFriendlyNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).javaFriendlyName("name"));
  }

  @Test(timeout=10000)
  public void drgRuleMetadataFieldNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("drgRuleMetadata", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).drgRuleMetadataFieldName());
  }

  @Test(timeout=10000)
  public void dsFEELParametersTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.dsFEELParameters(new TDecisionService()).size());
  }

  @Test(timeout=10000)
  public void endElementCommentTextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.endElementCommentText(new TDRGElement());
  }

  @Test(timeout=10000)
  public void contextClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Context", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).contextClassName());
  }

  @Test(timeout=10000)
  public void setterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("setName", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).setter("name"));
  }

  @Test(timeout=10000)
  public void toQualifiedJavaTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("java.lang.Object", basicDMN2JavaTransformer.toQualifiedJavaType(new AnyType()));
  }

  @Test(timeout=10000)
  public void javaTypePackageNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("type", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).javaTypePackageName());
  }

  @Test(timeout=10000)
  public void lazyEvalClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.LazyEval", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).lazyEvalClassName());
  }

  @Test(timeout=10000)
  public void makeDSDeclarationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.makeDSDeclaration(new TDecisionService(), null);
  }

  @Test(timeout=10000)
  public void defaultExternalExecutorClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFuncti" + "onExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null)).defaultExternalExecutorClassName());
  }

  @Test(timeout=10000)
  public void drgElementArgumentNameListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementArgumentNameList(new TDRGElement());
  }

  @Test(timeout=10000)
  public void inputDataVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.inputDataVariableName(new TInputData());
  }

  @Test(timeout=10000)
  public void itemDefinitionJavaClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("nameImpl", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).itemDefinitionJavaClassName("name"));
  }

  @Test(timeout=10000)
  public void drgElementAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElement", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).drgElementAnnotationClassName());
  }

  @Test(timeout=10000)
  public void eventListenerVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("eventListener_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).eventListenerVariableName());
  }

  @Test(timeout=10000)
  public void parameterVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.parameterVariableName(new TInformationItem());
  }

  @Test(timeout=10000)
  public void externalExecutorClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFuncti" + "onExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null)).externalExecutorClassName());
  }

  @Test(timeout=10000)
  public void ruleOutputListClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutputList", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).ruleOutputListClassName());
  }

  @Test(timeout=10000)
  public void contextSetterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("put(\"name\", ", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).contextSetter("name"));
  }

  @Test(timeout=10000)
  public void informationItemTypeNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.informationItemTypeName(new TInformationItem());
  }

  @Test(timeout=10000)
  public void lowerCaseFirstTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).lowerCaseFirst("name"));
  }

  @Test(timeout=10000)
  public void shouldGenerateApplyWithConversionFromStringTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.shouldGenerateApplyWithConversionFromString(new TDRGElement());
  }

  @Test(timeout=10000)
  public void itemDefinitionJavaInterfaceNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).itemDefinitionJavaInterfaceName("name"));
  }

  @Test(timeout=10000)
  public void convertTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, basicDMN2JavaTransformer.convertType(anyType, true));
  }

  @Test(timeout=10000)
  public void isCachingTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).isCaching());
  }

  @Test(timeout=10000)
  public void lazyEvaluationArgumentTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("name", basicDMN2JavaTransformer.lazyEvaluationArgument(new TDRGElement(), "name"));
  }

  @Test(timeout=10000)
  public void dmnRuntimeExceptionClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.DMNRuntimeException", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).dmnRuntimeExceptionClassName());
  }

  @Test(timeout=10000)
  public void asElementTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("asElement(foo)", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).asElement("foo"));
  }

  @Test(timeout=10000)
  public void annotationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("\"description\"", basicDMN2JavaTransformer.annotation(new TDRGElement(), "description"));
  }

  @Test(timeout=10000)
  public void bkmFunctionNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).bkmFunctionName("name"));
  }

  @Test(timeout=10000)
  public void getFEELTypeTranslatorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator doubleMixedJavaTimeFEELTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertSame(doubleMixedJavaTimeFEELTypeTranslator, (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        doubleMixedJavaTimeFEELTypeTranslator, new NopLazyEvaluationDetector(), null)).getFEELTypeTranslator());
  }

  @Test(timeout=10000)
  public void getFEELTranslatorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertSame(basicDMN2JavaTransformer.feelTranslator, basicDMN2JavaTransformer.getFEELTranslator());
  }

  @Test(timeout=10000)
  public void entryTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TContextEntry entry = new TContextEntry();
    TExpression expression = new TExpression();

    // Act
    Type actualEntryTypeResult = basicDMN2JavaTransformer.entryType(entry, expression, new ExpressionList());

    // Assert
    assertSame(((AnyType) actualEntryTypeResult).ANY, actualEntryTypeResult);
  }

  @Test(timeout=10000)
  public void priorityTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.priority(element, new TLiteralExpression(), 1);
  }

  @Test(timeout=10000)
  public void defaultValueTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.defaultValue(new TDRGElement());
  }

  @Test(timeout=10000)
  public void startElementCommentTextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.startElementCommentText(new TDRGElement());
  }

  @Test(timeout=10000)
  public void decisionConstructorNewArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionConstructorNewArgumentList(new TDecision()));
  }

  @Test(timeout=10000)
  public void contextGetterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("get(\"name\")", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).contextGetter("name"));
  }

  @Test(timeout=10000)
  public void outputClauseClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.outputClauseClassName(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void drgElementEvaluateSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementEvaluateSignature(new TDRGElement());
  }

  @Test(timeout=10000)
  public void drgElementArgumentsExtraTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo, eventListener_, externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).drgElementArgumentsExtra("foo"));
  }

  @Test(timeout=10000)
  public void drgElementSignatureWithConversionFromStringTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementSignatureWithConversionFromString(new TDRGElement());
  }

  @Test(timeout=10000)
  public void outputClausePriorityVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.outputClausePriorityVariableName(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void functionDefinitionToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    basicDMN2JavaTransformer.functionDefinitionToJava(new FunctionDefinition(null, new ExpressionList(), true), true,
        "foo");
  }

  @Test(timeout=10000)
  public void defaultEventListenerClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).defaultEventListenerClassName());
  }

  @Test(timeout=10000)
  public void cacheInterfaceNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).cacheInterfaceName());
  }

  @Test(timeout=10000)
  public void drgElementArgumentListWithConversionFromStringTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.drgElementArgumentListWithConversionFromString(new TDRGElement());
  }

  @Test(timeout=10000)
  public void makeBKMDeclarationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    basicDMN2JavaTransformer.makeBKMDeclaration(new TBusinessKnowledgeModel(), null);
  }

  @Test(timeout=10000)
  public void expressionToJavaTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.expressionToJava(new TDRGElement());
  }

  @Test(timeout=10000)
  public void asListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("asList(foo)", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).asList("foo"));
  }

  @Test(timeout=10000)
  public void drgElementDefaultArgumentsExtraCacheTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).drgElementDefaultArgumentsExtraCache("foo"));
  }

  @Test(timeout=10000)
  public void directInformationRequirementsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.directInformationRequirements(new TDRGElement()).size());
  }

  @Test(timeout=10000)
  public void hitPolicyAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).hitPolicyAnnotationClassName());
  }

  @Test(timeout=10000)
  public void escapeInStringTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).escapeInString("foo"));
  }

  @Test(timeout=10000)
  public void elementKindAnnotationClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElementKind", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null)).elementKindAnnotationClassName());
  }

  @Test(timeout=10000)
  public void getterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.getter(element, new TOutputClause());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("new name(foo)", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).constructor("name", "foo"));
  }

  @Test(timeout=10000)
  public void expressionToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    TExpression expression = new TExpression();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.expressionToJava(expression, null, new TDRGElement());
  }

  @Test(timeout=10000)
  public void decisionConstructorSignatureTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionConstructorSignature(new TDecision()));
  }

  @Test(timeout=10000)
  public void expressionKindTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    basicDMN2JavaTransformer.expressionKind(new TDRGElement());
  }

  @Test(timeout=10000)
  public void applyMethodTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    AnyType anyType = new AnyType();
    Parameter parameter = new Parameter("name", anyType);

    // Act and Assert
    assertEquals(
        "public Object apply(foo) {Object name = (Object)args[0];" + " Object name = (Object)args[1]; Object name ="
            + " (Object)args[2];return name;}",
        basicDMN2JavaTransformer.applyMethod(
            new BuiltinFunctionType(anyType, parameter, new Parameter("name", new AnyType()), parameter), "foo", true,
            "name"));
  }

  @Test(timeout=10000)
  public void ruleArgumentListTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.ruleArgumentList(new TDecision()));
  }

  @Test(timeout=10000)
  public void drgElementSignatureExtraCacheTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("foo", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).drgElementSignatureExtraCache("foo"));
  }

  @Test(timeout=10000)
  public void dsFunctionNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("name", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).dsFunctionName("name"));
  }

  @Test(timeout=10000)
  public void hasDirectSubDecisionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.hasDirectSubDecisions(new TDecision()));
  }

  @Test(timeout=10000)
  public void functionalInterfaceConstructorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    assertEquals("new foo<foo>() {foo}", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null)).functionalInterfaceConstructor("foo", "foo", "foo"));
  }
}

