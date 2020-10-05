package com.gs.dmn.feel.analysis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class FEELAnalyzerImplDiffblueTest {
  @Test
  public void testParseExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Expression actualParseExpressionResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .parseExpression("\"Hello \" + 'Full Name'");

    // Assert
    Expression rightOperand = ((Addition) actualParseExpressionResult).getRightOperand();
    assertEquals("+", ((Addition) actualParseExpressionResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Type type = actualParseExpressionResult.getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualParseExpressionResult).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertEquals("Addition(+,StringLiteral(\"Hello \"),Name('Full Name'))", actualParseExpressionResult.toString());
    assertEquals("StringLiteral(\"Hello \")", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("'Full Name'", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testParseExpression2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Expression actualParseExpressionResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .parseExpression("12 * 'Monthly Salary'");

    // Assert
    Expression rightOperand = ((Multiplication) actualParseExpressionResult).getRightOperand();
    assertEquals("*", ((Multiplication) actualParseExpressionResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Type type = actualParseExpressionResult.getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualParseExpressionResult).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertEquals("Multiplication(*,NumericLiteral(12),Name('Monthly Salary'))", actualParseExpressionResult.toString());
    assertEquals("NumericLiteral(12)", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("'Monthly Salary'", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testParseExpression3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Expression actualParseExpressionResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .parseExpression("\"You are \" + 'Employment Status'");

    // Assert
    Expression rightOperand = ((Addition) actualParseExpressionResult).getRightOperand();
    assertEquals("+", ((Addition) actualParseExpressionResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Type type = actualParseExpressionResult.getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualParseExpressionResult).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertEquals("Addition(+,StringLiteral(\"You are \"),Name('Employment Status'))",
        actualParseExpressionResult.toString());
    assertEquals("StringLiteral(\"You are \")", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("'Employment Status'", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testParseSimpleExpressions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();

    // Act
    Expression actualParseSimpleExpressionsResult = (new FEELAnalyzerImpl(new BasicDMN2JavaTransformer(
        dmnModelRepository, environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters)))
            .parseSimpleExpressions("Age");

    // Assert
    assertTrue(actualParseSimpleExpressionsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(Age)", actualParseSimpleExpressionsResult.toString());
  }
}

