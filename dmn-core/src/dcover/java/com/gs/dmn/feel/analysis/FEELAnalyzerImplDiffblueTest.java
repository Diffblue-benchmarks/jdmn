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
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FEELAnalyzerImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void parseSimpleUnaryTestsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act
    UnaryTests actualParseSimpleUnaryTestsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(), null)))
            .parseSimpleUnaryTests("foo");

    // Assert
    Type type = actualParseSimpleUnaryTestsResult.getType();
    String actualToStringResult = actualParseSimpleUnaryTestsResult.toString();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTest getResult = ((SimplePositiveUnaryTests) actualParseSimpleUnaryTestsResult)
        .getSimplePositiveUnaryTests().get(0);
    assertEquals("SimplePositiveUnaryTests(OperatorTest(null" + ",Name(foo)))", actualToStringResult);
    Type actualType = getResult.getType();
    String actualToStringResult1 = getResult.toString();
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    String actualOperator = ((OperatorTest) getResult).getOperator();
    assertEquals("OperatorTest(null,Name(foo))", actualToStringResult1);
    Type actualType1 = endpoint.getType();
    assertSame(type, actualType);
    assertNull(actualOperator);
    assertEquals("foo", ((Name) endpoint).getName());
    assertSame(type, actualType1);
  }

  @Test(timeout=10000)
  public void parseSimpleExpressionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act
    Expression actualParseSimpleExpressionsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(), null)))
            .parseSimpleExpressions("foo");

    // Assert
    Type type = actualParseSimpleExpressionsResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualParseSimpleExpressionsResult.toString());
  }

  @Test(timeout=10000)
  public void parseUnaryTestsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act
    UnaryTests actualParseUnaryTestsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null))).parseUnaryTests("foo");

    // Assert
    Type type = actualParseUnaryTestsResult.getType();
    String actualToStringResult = actualParseUnaryTestsResult.toString();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTest getResult = ((PositiveUnaryTests) actualParseUnaryTestsResult).getPositiveUnaryTests().get(0);
    assertEquals("PositiveUnaryTests(OperatorTest(null,Name(foo)))", actualToStringResult);
    Type actualType = getResult.getType();
    String actualToStringResult1 = getResult.toString();
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    String actualOperator = ((OperatorTest) getResult).getOperator();
    assertEquals("OperatorTest(null,Name(foo))", actualToStringResult1);
    Type actualType1 = endpoint.getType();
    assertSame(type, actualType);
    assertNull(actualOperator);
    assertEquals("foo", ((Name) endpoint).getName());
    assertSame(type, actualType1);
  }

  @Test(timeout=10000)
  public void parseBoxedExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null))).parseBoxedExpression("foo");
  }

  @Test(timeout=10000)
  public void parseTextualExpressionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act
    Expression actualParseTextualExpressionsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(), null)))
            .parseTextualExpressions("foo");

    // Assert
    Type type = actualParseTextualExpressionsResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualParseTextualExpressionsResult.toString());
  }

  @Test(timeout=10000)
  public void parseExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act
    Expression actualParseExpressionResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null))).parseExpression("foo");

    // Assert
    Type type = actualParseExpressionResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualParseExpressionResult.toString());
  }
}

