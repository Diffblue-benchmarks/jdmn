package com.gs.dmn.feel.analysis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
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

public class FEELAnalyzerImplDiffblueTest {
  @Test
  public void testParseExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    Expression actualParseExpressionResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap))).parseExpression("text");

    // Assert
    assertTrue(actualParseExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(text)", actualParseExpressionResult.toString());
  }

  @Test
  public void testParseSimpleExpressions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    Expression actualParseSimpleExpressionsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap)))
            .parseSimpleExpressions("text");

    // Assert
    assertTrue(actualParseSimpleExpressionsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(text)", actualParseSimpleExpressionsResult.toString());
  }

  @Test
  public void testParseSimpleUnaryTests() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    UnaryTests actualParseSimpleUnaryTestsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap)))
            .parseSimpleUnaryTests("text");

    // Assert
    List<SimplePositiveUnaryTest> simplePositiveUnaryTests = ((SimplePositiveUnaryTests) actualParseSimpleUnaryTestsResult)
        .getSimplePositiveUnaryTests();
    Type type = actualParseSimpleUnaryTestsResult.getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTest getResult = simplePositiveUnaryTests.get(0);
    assertEquals("SimplePositiveUnaryTests(OperatorTest(null,Name" + "(text)))",
        actualParseSimpleUnaryTestsResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(null,Name(text))", getResult.toString());
    String actualName = ((Name) endpoint).getName();
    assertSame(type, getResult.getType());
    assertNull(((OperatorTest) getResult).getOperator());
    assertEquals("text", actualName);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testParseTextualExpressions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    Expression actualParseTextualExpressionsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap)))
            .parseTextualExpressions("text");

    // Assert
    assertTrue(
        actualParseTextualExpressionsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(text)", actualParseTextualExpressionsResult.toString());
  }

  @Test
  public void testParseUnaryTests() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    UnaryTests actualParseUnaryTestsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap))).parseUnaryTests("text");

    // Assert
    List<PositiveUnaryTest> positiveUnaryTests = ((PositiveUnaryTests) actualParseUnaryTestsResult)
        .getPositiveUnaryTests();
    Type type = actualParseUnaryTestsResult.getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTest getResult = positiveUnaryTests.get(0);
    assertEquals("PositiveUnaryTests(OperatorTest(null,Name(text)))", actualParseUnaryTestsResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(null,Name(text))", getResult.toString());
    String actualName = ((Name) endpoint).getName();
    assertSame(type, getResult.getType());
    assertNull(((OperatorTest) getResult).getOperator());
    assertEquals("text", actualName);
    assertSame(type, endpoint.getType());
  }
}

