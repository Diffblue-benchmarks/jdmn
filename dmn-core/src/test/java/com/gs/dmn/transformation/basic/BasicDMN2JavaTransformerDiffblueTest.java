package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ContextType;
import com.gs.dmn.feel.analysis.semantics.type.DateTimeType;
import com.gs.dmn.feel.analysis.semantics.type.ItemDefinitionType;
import com.gs.dmn.feel.analysis.semantics.type.ListType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.synthesis.FEELTranslator;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.feel.synthesis.type.FEELTypeTranslator;
import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.transformation.java.CompoundStatement;
import com.gs.dmn.transformation.java.ExpressionStatement;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TContextEntry;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionRule;
import org.omg.spec.dmn._20180521.model.TDecisionService;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TExpression;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TFunctionKind;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TOutputClause;

public class BasicDMN2JavaTransformerDiffblueTest {
  @Test
  public void testAbstractRuleOutputClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.RuleOutput", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).abstractRuleOutputClassName());
  }

  @Test
  public void testAggregation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.aggregation(new TDecisionTable()));
  }

  @Test
  public void testAnnotation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("\"description\"", basicDMN2JavaTransformer.annotation(new TDRGElement(), "description"));
  }

  @Test
  public void testAnnotation2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(new TDRGElement(), (String) null));
  }

  @Test
  public void testAnnotation3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("\"description\"", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).annotation(null, "description"));
  }

  @Test
  public void testAnnotation4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("\"\"", basicDMN2JavaTransformer.annotation(element, new TDecisionRule()));
  }

  @Test
  public void testAnnotationEscapedText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.annotationEscapedText(new TDecisionRule()));
  }

  @Test
  public void testAnnotationSetClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).annotationSetClassName());
  }

  @Test
  public void testAnnotationSetVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).annotationSetVariableName());
  }

  @Test
  public void testArgumentsClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Arguments", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).argumentsClassName());
  }

  @Test
  public void testAsElement() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("asElement()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).asElement(""));
  }

  @Test
  public void testAsList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("asList()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).asList(""));
  }

  @Test
  public void testAssertClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).assertClassName());
  }

  @Test
  public void testAugmentArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).augmentArgumentList(""));
  }

  @Test
  public void testAugmentArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("annotationSet_, annotationSet_", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).augmentArgumentList("annotationSet_"));
  }

  @Test
  public void testAugmentSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).augmentSignature(""));
  }

  @Test
  public void testAugmentSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("%s %s, com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).augmentSignature("%s %s"));
  }

  @Test
  public void testBkmFEELParameterNames() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.bkmFEELParameterNames(tBusinessKnowledgeModel).size());
  }

  @Test
  public void testBkmFunctionName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).bkmFunctionName(""));
  }

  @Test
  public void testBkmFunctionName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.bkmFunctionName(tBusinessKnowledgeModel));
  }

  @Test
  public void testCacheInterfaceName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).cacheInterfaceName());
  }

  @Test
  public void testCacheVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("cache_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).cacheVariableName());
  }

  @Test
  public void testConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("new ()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).constructor("", ""));
  }

  @Test
  public void testConstructor2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    BasicDMN2JavaTransformer actualBasicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Assert
    DMNModelRepository expectedDMNModelRepository = actualBasicDMN2JavaTransformer.dmnModelRepository;
    assertSame(expectedDMNModelRepository, actualBasicDMN2JavaTransformer.getDMNModelRepository());
    assertNull(actualBasicDMN2JavaTransformer.getEnvironmentFactory());
    FEELTranslator expectedFEELTranslator = actualBasicDMN2JavaTransformer.feelTranslator;
    assertSame(expectedFEELTranslator, actualBasicDMN2JavaTransformer.getFEELTranslator());
    assertFalse(actualBasicDMN2JavaTransformer.isCaching());
    FEELTypeTranslator expectedFEELTypeTranslator = actualBasicDMN2JavaTransformer.feelTypeTranslator;
    assertSame(expectedFEELTypeTranslator, actualBasicDMN2JavaTransformer.getFEELTypeTranslator());
  }

  @Test
  public void testContextClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Context", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).contextClassName());
  }

  @Test
  public void testContextGetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("get(\"\")", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).contextGetter(""));
  }

  @Test
  public void testContextSetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("put(\"\", ", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).contextSetter(""));
  }

  @Test
  public void testConvertDecisionArgument() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.convertDecisionArgument("", new AnyType()));
  }

  @Test
  public void testConvertExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ExpressionStatement statement = new ExpressionStatement("expression", new ContextType());
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("null");

    // Act and Assert
    assertEquals("type.Null.toNull(expression)",
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, itemDefinitionType))
            .getExpression());
    assertSame(itemDefinitionType,
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, itemDefinitionType))
            .getExpressionType());
  }

  @Test
  public void testConvertExpression2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ExpressionStatement statement = new ExpressionStatement("expression", new ListType());
    AnyType anyType = new AnyType();

    // Act and Assert
    assertEquals("this.<Object>asElement(expression)",
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, anyType)).getExpression());
    assertSame(anyType,
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, anyType)).getExpressionType());
  }

  @Test
  public void testConvertExpression3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ExpressionStatement expressionStatement = new ExpressionStatement("expression", new AnyType());

    // Act and Assert
    assertSame(expressionStatement, basicDMN2JavaTransformer.convertExpression(expressionStatement, new AnyType()));
  }

  @Test
  public void testConvertExpression4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ExpressionStatement statement = new ExpressionStatement("expression", new AnyType());
    ListType listType = new ListType();

    // Act and Assert
    assertEquals("asList(expression)",
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, listType)).getExpression());
    assertSame(listType,
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, listType)).getExpressionType());
  }

  @Test
  public void testConvertExpression5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ExpressionStatement expressionStatement = new ExpressionStatement("expression", new AnyType());

    // Act and Assert
    assertSame(expressionStatement,
        basicDMN2JavaTransformer.convertExpression(expressionStatement, new ItemDefinitionType("")));
  }

  @Test
  public void testConvertExpression6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ExpressionStatement statement = new ExpressionStatement("null", new AnyType());
    AnyType anyType = new AnyType();

    // Act and Assert
    assertEquals("null",
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, anyType)).getExpression());
    assertSame(anyType,
        ((ExpressionStatement) basicDMN2JavaTransformer.convertExpression(statement, anyType)).getExpressionType());
  }

  @Test
  public void testConvertExpression7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, null,
        lazyEvaluationDetector, stringStringMap);
    ExpressionStatement expressionStatement = new ExpressionStatement("expression", new ListType());

    // Act and Assert
    assertSame(expressionStatement, basicDMN2JavaTransformer.convertExpression(expressionStatement, new ListType()));
  }

  @Test
  public void testConvertExpression8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    CompoundStatement compoundStatement = new CompoundStatement();

    // Act and Assert
    assertSame(compoundStatement, basicDMN2JavaTransformer.convertExpression(compoundStatement, new AnyType()));
  }

  @Test
  public void testConvertMethodName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("value");

    // Act and Assert
    assertEquals("toValue", basicDMN2JavaTransformer.convertMethodName(tItemDefinition));
  }

  @Test
  public void testConvertToItemDefinitionType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("type.Foo.toFoo()",
        basicDMN2JavaTransformer.convertToItemDefinitionType("", new ItemDefinitionType("foo")));
  }

  @Test
  public void testConvertType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, basicDMN2JavaTransformer.convertType(anyType, false));
  }

  @Test
  public void testConvertType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, basicDMN2JavaTransformer.convertType(anyType, true));
  }

  @Test
  public void testDecisionConstructorNewArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionConstructorNewArgumentList(new TDecision()));
  }

  @Test
  public void testDecisionConstructorSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionConstructorSignature(new TDecision()));
  }

  @Test
  public void testDecisionTopologicalConstructorNewArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionTopologicalConstructorNewArgumentList(new TDecision()));
  }

  @Test
  public void testDecisionTopologicalConstructorSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.decisionTopologicalConstructorSignature(new TDecision()));
  }

  @Test
  public void testDefaultCacheClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).defaultCacheClassName());
  }

  @Test
  public void testDefaultConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("new ()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).defaultConstructor(""));
  }

  @Test
  public void testDefaultEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).defaultEventListenerClassName());
  }

  @Test
  public void testDefaultExternalExecutorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFuncti" + "onExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).defaultExternalExecutorClassName());
  }

  @Test
  public void testDefaultValue() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();

    // Act and Assert
    assertEquals("null", basicDMN2JavaTransformer.defaultValue(element, new TOutputClause()));
  }

  @Test
  public void testDirectInformationRequirements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.directInformationRequirements(new TDRGElement()).size());
  }

  @Test
  public void testDmnRuntimeExceptionClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.DMNRuntimeException", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).dmnRuntimeExceptionClassName());
  }

  @Test
  public void testDmnTypeClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.DMNType", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).dmnTypeClassName());
  }

  @Test
  public void testDrgElementAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElement", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).drgElementAnnotationClassName());
  }

  @Test
  public void testDrgElementArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentListWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_",
        basicDMN2JavaTransformer.drgElementArgumentListWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementArgumentNameList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new TDecision()).size());
  }

  @Test
  public void testDrgElementArgumentNameList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.drgElementArgumentNameList(new TDecisionService()).size());
  }

  @Test
  public void testDrgElementArgumentsExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("eventListener_, externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).drgElementArgumentsExtra(""));
  }

  @Test
  public void testDrgElementArgumentsExtra2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("%s, %s, eventListener_, externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).drgElementArgumentsExtra("%s, %s"));
  }

  @Test
  public void testDrgElementArgumentsExtraCache() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).drgElementArgumentsExtraCache(""));
  }

  @Test
  public void testDrgElementConvertedArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.drgElementConvertedArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals(
        "new %s(LOGGER), new %s(), new com.gs.dmn.runtime" + ".listener.LoggingEventListener(LOGGER), new"
            + " com.gs.dmn.runtime.external.DefaultExternalFun" + "ctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).drgElementDefaultArgumentsExtra("new %s(LOGGER), new %s()"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtra2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals(
        "new com.gs.dmn.runtime.listener.LoggingEventListener" + "(LOGGER), new com.gs.dmn.runtime.external"
            + ".DefaultExternalFunctionExecutor()",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).drgElementDefaultArgumentsExtra(""));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).drgElementDefaultArgumentsExtraCache(""));
  }

  @Test
  public void testDrgElementEvaluateArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_, eventListener_, externalExecutor_",
        basicDMN2JavaTransformer.drgElementEvaluateArgumentList(new TDecision()));
  }

  @Test
  public void testDrgElementEvaluateSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_, com.gs.dmn.runtime.listener.EventListener"
            + " eventListener_, com.gs.dmn.runtime.external" + ".ExternalFunctionExecutor externalExecutor_",
        basicDMN2JavaTransformer.drgElementEvaluateSignature(new TDecision()));
  }

  @Test
  public void testDrgElementMetadataClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.DRGElement", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).drgElementMetadataClassName());
  }

  @Test
  public void testDrgElementMetadataFieldName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("DRG_ELEMENT_METADATA", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).drgElementMetadataFieldName());
  }

  @Test
  public void testDrgElementSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        basicDMN2JavaTransformer.drgElementSignature(new TDecision()));
  }

  @Test
  public void testDrgElementSignatureExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals(
        "com.gs.dmn.runtime.listener.EventListener eventListener_,"
            + " com.gs.dmn.runtime.external.ExternalFunctionExecutor" + " externalExecutor_",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).drgElementSignatureExtra(""));
  }

  @Test
  public void testDrgElementSignatureExtraCache() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).drgElementSignatureExtraCache(""));
  }

  @Test
  public void testDrgElementSignatureWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        basicDMN2JavaTransformer.drgElementSignatureWithConversionFromString(new TDecision()));
  }

  @Test
  public void testDrgElementVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement tdrgElement = new TDRGElement();
    tdrgElement.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.drgElementVariableName(tdrgElement));
  }

  @Test
  public void testDrgRuleMetadataClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.Rule", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).drgRuleMetadataClassName());
  }

  @Test
  public void testDrgRuleMetadataFieldName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("drgRuleMetadata", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).drgRuleMetadataFieldName());
  }

  @Test
  public void testDsFEELParameterNames() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.dsFEELParameterNames(new TDecisionService()).size());
  }

  @Test
  public void testDsFEELParameters() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.dsFEELParameters(new TDecisionService()).size());
  }

  @Test
  public void testDsFunctionName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).dsFunctionName("."));
  }

  @Test
  public void testDsFunctionName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).dsFunctionName(""));
  }

  @Test
  public void testDsFunctionName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("javaUtilList", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).dsFunctionName("java.util.List"));
  }

  @Test
  public void testDsFunctionName4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("Object", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).dsFunctionName("Object"));
  }

  @Test
  public void testDsFunctionName5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDecisionService tDecisionService = new TDecisionService();
    tDecisionService.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.dsFunctionName(tDecisionService));
  }

  @Test
  public void testElementKind() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(DRGElementKind.OTHER, basicDMN2JavaTransformer.elementKind(new TDRGElement()));
  }

  @Test
  public void testElementKindAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.DRGElementKind", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).elementKindAnnotationClassName());
  }

  @Test
  public void testEndElementCommentText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("End BKM 'null'", basicDMN2JavaTransformer.endElementCommentText(new TBusinessKnowledgeModel()));
  }

  @Test
  public void testEndElementCommentText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("End decision 'null'", basicDMN2JavaTransformer.endElementCommentText(new TDecision()));
  }

  @Test
  public void testEntryType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TContextEntry entry = new TContextEntry();

    // Act
    Type actualEntryTypeResult = basicDMN2JavaTransformer.entryType(entry, null, new ExpressionList());

    // Assert
    assertSame(((AnyType) actualEntryTypeResult).ANY, actualEntryTypeResult);
  }

  @Test
  public void testEntryType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TContextEntry entry = new TContextEntry();
    TExpression expression = new TExpression();

    // Act
    Type actualEntryTypeResult = basicDMN2JavaTransformer.entryType(entry, expression, new ExpressionList());

    // Assert
    assertSame(((AnyType) actualEntryTypeResult).ANY, actualEntryTypeResult);
  }

  @Test
  public void testEntryType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act
    Type actualEntryTypeResult = basicDMN2JavaTransformer.entryType(new TContextEntry(), null);

    // Assert
    assertSame(((AnyType) actualEntryTypeResult).ANY, actualEntryTypeResult);
  }

  @Test
  public void testEscapeInString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).escapeInString(""));
  }

  @Test
  public void testEvaluateElementCommentText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Evaluate decision 'null'", basicDMN2JavaTransformer.evaluateElementCommentText(new TDecision()));
  }

  @Test
  public void testEvaluateElementCommentText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Evaluate BKM 'null'",
        basicDMN2JavaTransformer.evaluateElementCommentText(new TBusinessKnowledgeModel()));
  }

  @Test
  public void testEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).eventListenerClassName());
  }

  @Test
  public void testEventListenerVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("eventListener_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).eventListenerVariableName());
  }

  @Test
  public void testExpressionKindAnnotationClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.ExpressionKind", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).expressionKindAnnotationClassName());
  }

  @Test
  public void testExpressionType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertNull((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).expressionType(null, null));
  }

  @Test
  public void testExternalExecutorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFuncti" + "onExecutor",
        (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap)).externalExecutorClassName());
  }

  @Test
  public void testExternalExecutorVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("externalExecutor_", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).externalExecutorVariableName());
  }

  @Test
  public void testFluentConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("new ()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).fluentConstructor("", ""));
  }

  @Test
  public void testFunctionalInterfaceConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("new <>() {}", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).functionalInterfaceConstructor("", "", ""));
  }

  @Test
  public void testGetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("getValue()", basicDMN2JavaTransformer.getter(element, tOutputClause));
  }

  @Test
  public void testGetter2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("get()", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).getter(""));
  }

  @Test
  public void testGetter3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("value");

    // Act and Assert
    assertEquals("getValue()", basicDMN2JavaTransformer.getter(tItemDefinition));
  }

  @Test
  public void testGetterName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("get", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).getterName(""));
  }

  @Test
  public void testHasDirectSubDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.hasDirectSubDecisions(new TDecision()));
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
    assertEquals("com.gs.dmn.runtime.annotation.HitPolicy", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).hitPolicyAnnotationClassName());
  }

  @Test
  public void testInformationItemVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.informationItemVariableName(tInformationItem));
  }

  @Test
  public void testInputDataParametersClosure() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new TDecision(), true).size());
  }

  @Test
  public void testInputDataParametersClosure2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.inputDataParametersClosure(new TDecision()).size());
  }

  @Test
  public void testInputDataVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TInputData tInputData = new TInputData();
    tInputData.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.inputDataVariableName(tInputData));
  }

  @Test
  public void testInvFEELParameters() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals(0, basicDMN2JavaTransformer.invFEELParameters(new TDecisionService()).size());
  }

  @Test
  public void testIsCaching() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isCaching(""));
  }

  @Test
  public void testIsComplexType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isComplexType(new AnyType()));
  }

  @Test
  public void testIsComplexType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isComplexType(new ListType()));
  }

  @Test
  public void testIsComplexType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertTrue(basicDMN2JavaTransformer.isComplexType(new ItemDefinitionType("")));
  }

  @Test
  public void testIsComplexType4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isComplexType(new TItemDefinition()));
  }

  @Test
  public void testIsCompoundStatement() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertTrue(basicDMN2JavaTransformer.isCompoundStatement(new CompoundStatement()));
  }

  @Test
  public void testIsFEELFunction() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertTrue((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isFEELFunction(TFunctionKind.FEEL));
  }

  @Test
  public void testIsFEELFunction2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertTrue((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isFEELFunction(null));
  }

  @Test
  public void testIsFEELFunction3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isFEELFunction(TFunctionKind.JAVA));
  }

  @Test
  public void testIsJavaFunction() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isJavaFunction(TFunctionKind.FEEL));
  }

  @Test
  public void testIsJavaFunction2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertTrue((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isJavaFunction(TFunctionKind.JAVA));
  }

  @Test
  public void testIsLazyEvaluated() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertFalse((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).isLazyEvaluated(""));
  }

  @Test
  public void testIsLazyEvaluated2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.isLazyEvaluated(new TDRGElement()));
  }

  @Test
  public void testItemDefinitionJavaClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("Impl", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).itemDefinitionJavaClassName(""));
  }

  @Test
  public void testItemDefinitionJavaInterfaceName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).itemDefinitionJavaInterfaceName("Impl"));
  }

  @Test
  public void testItemDefinitionSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.itemDefinitionSignature(new TItemDefinition()));
  }

  @Test
  public void testItemDefinitionTypeName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Object", basicDMN2JavaTransformer.itemDefinitionTypeName(new TItemDefinition()));
  }

  @Test
  public void testItemDefinitionVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.itemDefinitionVariableName(tItemDefinition));
  }

  @Test
  public void testJavaFriendlyName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).javaFriendlyName(""));
  }

  @Test
  public void testJavaFriendlyVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("java.util.list", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).javaFriendlyVariableName("java.util.List"));
  }

  @Test
  public void testJavaRootPackageName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).javaRootPackageName());
  }

  @Test
  public void testJavaTypePackageName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("type", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).javaTypePackageName());
  }

  @Test
  public void testLazyEvalClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.LazyEval", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).lazyEvalClassName());
  }

  @Test
  public void testLazyEvaluationArgument() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.lazyEvaluationArgument(new TDRGElement(), ""));
  }

  @Test
  public void testLazyEvaluationType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("", basicDMN2JavaTransformer.lazyEvaluationType(new TDRGElement(), ""));
  }

  @Test
  public void testLoggingEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.LoggingEventListener", (new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).loggingEventListenerClassName());
  }

  @Test
  public void testLookupPrimitiveType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.lookupPrimitiveType(new QualifiedName("name")));
  }

  @Test
  public void testLookupPrimitiveType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.lookupPrimitiveType(new QualifiedName("feel", "localPart")));
  }

  @Test
  public void testLookupPrimitiveType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.lookupPrimitiveType(new QualifiedName("namespace", "localPart")));
  }

  @Test
  public void testLowerCaseFirst() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).lowerCaseFirst("."));
  }

  @Test
  public void testOutputClausePriorityVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("valuePriority", basicDMN2JavaTransformer.outputClausePriorityVariableName(element, tOutputClause));
  }

  @Test
  public void testOutputClauseVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.outputClauseVariableName(element, tOutputClause));
  }

  @Test
  public void testPairClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Pair", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).pairClassName());
  }

  @Test
  public void testPairComparatorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.PairComparator", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).pairComparatorClassName());
  }

  @Test
  public void testParameterVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setName("value");

    // Act and Assert
    assertEquals("value", basicDMN2JavaTransformer.parameterVariableName(tInformationItem));
  }

  @Test
  public void testPriorityGetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("getValuePriority()", basicDMN2JavaTransformer.priorityGetter(element, tOutputClause));
  }

  @Test
  public void testPrioritySetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("setValuePriority", basicDMN2JavaTransformer.prioritySetter(element, tOutputClause));
  }

  @Test
  public void testQualifiedName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).qualifiedName("", ""));
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
    assertEquals("com.gs.dmn.runtime.annotation.Rule", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).ruleAnnotationClassName());
  }

  @Test
  public void testRuleArgumentList() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.ruleArgumentList(new TDecision()));
  }

  @Test
  public void testRuleArgumentList2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());

    // Act and Assert
    assertEquals("annotationSet_", basicDMN2JavaTransformer.ruleArgumentList(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleId() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    ArrayList<TDecisionRule> tDecisionRuleList = new ArrayList<TDecisionRule>();
    TDecisionRule tDecisionRule = new TDecisionRule();
    tDecisionRuleList.add(tDecisionRule);

    // Act and Assert
    assertEquals("0", basicDMN2JavaTransformer.ruleId(tDecisionRuleList, tDecisionRule));
  }

  @Test
  public void testRuleOutputClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("NullRuleOutput", basicDMN2JavaTransformer.ruleOutputClassName(new TDRGElement()));
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
    assertEquals("com.gs.dmn.runtime.RuleOutputList", (new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap)).ruleOutputListClassName());
  }

  @Test
  public void testRuleSignature() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    tBusinessKnowledgeModel.setEncapsulatedLogic(new TFunctionDefinition());

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        basicDMN2JavaTransformer.ruleSignature(tBusinessKnowledgeModel));
  }

  @Test
  public void testRuleSignature2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet" + " annotationSet_",
        basicDMN2JavaTransformer.ruleSignature(new TDecision()));
  }

  @Test
  public void testSetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("set", (new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap)).setter(""));
  }

  @Test
  public void testSetter2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("setValue", basicDMN2JavaTransformer.setter(element, tOutputClause));
  }

  @Test
  public void testSetter3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("value");

    // Act and Assert
    assertEquals("setValue", basicDMN2JavaTransformer.setter(tItemDefinition));
  }

  @Test
  public void testShouldGenerateApplyWithConversionFromString() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.shouldGenerateApplyWithConversionFromString(new TDecision()));
  }

  @Test
  public void testShouldGenerateApplyWithConversionFromString2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse(basicDMN2JavaTransformer.shouldGenerateApplyWithConversionFromString(new TBusinessKnowledgeModel()));
  }

  @Test
  public void testStartElementCommentText() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Start decision 'null'", basicDMN2JavaTransformer.startElementCommentText(new TDecision()));
  }

  @Test
  public void testStartElementCommentText2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Start BKM 'null'", basicDMN2JavaTransformer.startElementCommentText(new TBusinessKnowledgeModel()));
  }

  @Test
  public void testToFEELType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertNull((new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
        stringStringMap)).toFEELType(""));
  }

  @Test
  public void testToFEELType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act
    Type actualToFEELTypeResult = basicDMN2JavaTransformer.toFEELType(new TItemDefinition());

    // Assert
    assertSame(((AnyType) actualToFEELTypeResult).ANY, actualToFEELTypeResult);
  }

  @Test
  public void testToJavaType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Object", basicDMN2JavaTransformer.toJavaType(new AnyType()));
  }

  @Test
  public void testToQualifiedJavaType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("java.util.List<Object>", basicDMN2JavaTransformer.toQualifiedJavaType(new ListType()));
  }

  @Test
  public void testToQualifiedJavaType2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("type.20200301", basicDMN2JavaTransformer.toQualifiedJavaType(new DateTimeType("2020-03-01")));
  }

  @Test
  public void testToQualifiedJavaType3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("type.", basicDMN2JavaTransformer.toQualifiedJavaType(new DateTimeType(".")));
  }

  @Test
  public void testToQualifiedJavaType4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("java.lang.Object", basicDMN2JavaTransformer.toQualifiedJavaType(new AnyType()));
  }

  @Test
  public void testToStringJavaType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("String", basicDMN2JavaTransformer.toStringJavaType(new AnyType()));
  }

  @Test
  public void testVariableType() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertNull(basicDMN2JavaTransformer.variableType(new TInformationItem()));
  }
}

