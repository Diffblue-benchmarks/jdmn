package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.FEELAnalyzerImpl;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.UnaryTests;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class AbstractFEELTranslatorDiffblueTest {
  @Test
  public void testParseUnaryTests() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));

    // Act
    UnaryTests actualParseUnaryTestsResult = (new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer))).parseUnaryTests("foo");

    // Assert
    List<PositiveUnaryTest> positiveUnaryTests = ((PositiveUnaryTests) actualParseUnaryTestsResult)
        .getPositiveUnaryTests();
    Type type = actualParseUnaryTestsResult.getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTest getResult = positiveUnaryTests.get(0);
    assertEquals("PositiveUnaryTests(OperatorTest(null,Name(foo)))", actualParseUnaryTestsResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(null,Name(foo))", getResult.toString());
    String actualName = ((Name) endpoint).getName();
    assertSame(type, getResult.getType());
    assertNull(((OperatorTest) getResult).getOperator());
    assertEquals("foo", actualName);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testParseSimpleUnaryTests() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));

    // Act
    UnaryTests actualParseSimpleUnaryTestsResult = (new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer))).parseSimpleUnaryTests("foo");

    // Assert
    List<SimplePositiveUnaryTest> simplePositiveUnaryTests = ((SimplePositiveUnaryTests) actualParseSimpleUnaryTestsResult)
        .getSimplePositiveUnaryTests();
    Type type = actualParseSimpleUnaryTestsResult.getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTest getResult = simplePositiveUnaryTests.get(0);
    assertEquals("SimplePositiveUnaryTests(OperatorTest(null" + ",Name(foo)))",
        actualParseSimpleUnaryTestsResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(null,Name(foo))", getResult.toString());
    String actualName = ((Name) endpoint).getName();
    assertSame(type, getResult.getType());
    assertNull(((OperatorTest) getResult).getOperator());
    assertEquals("foo", actualName);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testAnalyzeUnaryTests() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "-");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));

    // Act and Assert
    assertTrue(abstractFEELTranslator.analyzeUnaryTests("-", FEELContext.makeContext(null))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testAnalyzeSimpleUnaryTests() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "-");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));

    // Act and Assert
    assertTrue(abstractFEELTranslator.analyzeSimpleUnaryTests("-", FEELContext.makeContext(null))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testParseExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));

    // Act
    Expression actualParseExpressionResult = (new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer))).parseExpression("foo");

    // Assert
    assertTrue(actualParseExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualParseExpressionResult.toString());
  }

  @Test
  public void testParseSimpleExpressions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));

    // Act
    Expression actualParseSimpleExpressionsResult = (new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer))).parseSimpleExpressions("foo");

    // Assert
    assertTrue(actualParseSimpleExpressionsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualParseSimpleExpressionsResult.toString());
  }

  @Test
  public void testParseTextualExpressions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));

    // Act
    Expression actualParseTextualExpressionsResult = (new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer))).parseTextualExpressions("foo");

    // Assert
    assertTrue(
        actualParseTextualExpressionsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualParseTextualExpressionsResult.toString());
  }

  @Test
  public void testUnaryTestsToJava() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "-");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));

    // Act and Assert
    assertEquals("true", abstractFEELTranslator.unaryTestsToJava("-", FEELContext.makeContext(null)));
  }

  @Test
  public void testUnaryTestsToJava2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("true", abstractFEELTranslator.unaryTestsToJava(new Any(), context));
  }

  @Test
  public void testSimpleUnaryTestsToJava() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("true", abstractFEELTranslator.simpleUnaryTestsToJava(new Any(), context));
  }

  @Test
  public void testSimpleUnaryTestsToJava2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "-");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));

    // Act and Assert
    assertEquals("true", abstractFEELTranslator.simpleUnaryTestsToJava("-", FEELContext.makeContext(null)));
  }

  @Test
  public void testExpressionToJava() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("null", abstractFEELTranslator.expressionToJava(new NullLiteral(), context));
  }

  @Test
  public void testSimpleExpressionsToJava() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("null", abstractFEELTranslator.simpleExpressionsToJava(new Any(), context));
  }

  @Test
  public void testSimpleExpressionsToJava2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELAnalyzerImpl feelAnalyzer = new FEELAnalyzerImpl(basicDMN2JavaTransformer);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");
    FEELToJavaVisitor expressionVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, lazyEvaluationDetector1, stringStringMap1));
    AbstractFEELTranslator abstractFEELTranslator = new AbstractFEELTranslator(feelAnalyzer, expressionVisitor,
        new SimpleExpressionsToJavaVisitor(basicDMN2JavaTransformer));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("null", abstractFEELTranslator.simpleExpressionsToJava(new NullLiteral(), context));
  }
}

