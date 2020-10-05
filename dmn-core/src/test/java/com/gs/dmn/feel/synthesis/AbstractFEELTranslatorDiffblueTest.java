package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.basic.EnvironmentMemoizer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class AbstractFEELTranslatorDiffblueTest {
  @Test
  public void testAnalyzeExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELTranslatorImpl feelTranslatorImpl = new FEELTranslatorImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        instanceResult, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Full Name'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);

    // Act
    Expression actualAnalyzeExpressionResult = feelTranslatorImpl.analyzeExpression("\"Hello \" + 'Full Name'",
        FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision)));

    // Assert
    Expression rightOperand = ((Addition) actualAnalyzeExpressionResult).getRightOperand();
    assertEquals("+", ((Addition) actualAnalyzeExpressionResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    StringType expectedType = stringType.STRING;
    Type type = actualAnalyzeExpressionResult.getType();
    assertSame(expectedType, type);
    Expression leftOperand = ((Addition) actualAnalyzeExpressionResult).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertEquals("Addition(+,StringLiteral(\"Hello \"),Name('Full Name'))", actualAnalyzeExpressionResult.toString());
    assertEquals("StringLiteral(\"Hello \")", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("'Full Name'", actualName);
    assertSame(stringType, rightOperand.getType());
  }

  @Test
  public void testAnalyzeExpression2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELTranslatorImpl feelTranslatorImpl = new FEELTranslatorImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        instanceResult, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    NumberType numberType = new NumberType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Monthly Salary'", numberType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);

    // Act
    Expression actualAnalyzeExpressionResult = feelTranslatorImpl.analyzeExpression("12 * 'Monthly Salary'",
        FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision)));

    // Assert
    Expression rightOperand = ((Multiplication) actualAnalyzeExpressionResult).getRightOperand();
    assertEquals("*", ((Multiplication) actualAnalyzeExpressionResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    NumberType expectedType = numberType.NUMBER;
    Type type = actualAnalyzeExpressionResult.getType();
    assertSame(expectedType, type);
    Expression leftOperand = ((Multiplication) actualAnalyzeExpressionResult).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertEquals("Multiplication(*,NumericLiteral(12),Name('Monthly Salary'))",
        actualAnalyzeExpressionResult.toString());
    assertEquals("NumericLiteral(12)", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("'Monthly Salary'", actualName);
    assertSame(numberType, rightOperand.getType());
  }

  @Test
  public void testAnalyzeExpression3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELTranslatorImpl feelTranslatorImpl = new FEELTranslatorImpl(new BasicDMN2JavaTransformer(dmnModelRepository,
        instanceResult, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Employment Status'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);

    // Act
    Expression actualAnalyzeExpressionResult = feelTranslatorImpl.analyzeExpression(
        "\"You are \" + 'Employment Status'", FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision)));

    // Assert
    Expression rightOperand = ((Addition) actualAnalyzeExpressionResult).getRightOperand();
    assertEquals("+", ((Addition) actualAnalyzeExpressionResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    StringType expectedType = stringType.STRING;
    Type type = actualAnalyzeExpressionResult.getType();
    assertSame(expectedType, type);
    Expression leftOperand = ((Addition) actualAnalyzeExpressionResult).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertEquals("Addition(+,StringLiteral(\"You are \"),Name('Employment Status'))",
        actualAnalyzeExpressionResult.toString());
    assertEquals("StringLiteral(\"You are \")", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("'Employment Status'", actualName);
    assertSame(stringType, rightOperand.getType());
  }

  @Test
  public void testExpressionToNative() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Full Name'", new StringType()));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext makeContextResult = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral leftOperand = new StringLiteral("\"Hello \"");
    Addition addition = new Addition("+", leftOperand, new Name("'Full Name'"));
    addition.accept(new FEELSemanticVisitor(basicDMN2JavaTransformer), makeContextResult);

    // Act and Assert
    assertEquals("stringAdd(\"Hello \", fullName)",
        (new FEELTranslatorImpl(basicDMN2JavaTransformer)).expressionToNative(addition, makeContextResult));
  }

  @Test
  public void testExpressionToNative2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Monthly Salary'", new NumberType()));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext makeContextResult = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    NumericLiteral leftOperand = new NumericLiteral("12");
    Multiplication multiplication = new Multiplication("*", leftOperand, new Name("'Monthly Salary'"));
    multiplication.accept(new FEELSemanticVisitor(basicDMN2JavaTransformer), makeContextResult);

    // Act and Assert
    assertEquals("numericMultiply(number(\"12\"), monthlySalary)",
        (new FEELTranslatorImpl(basicDMN2JavaTransformer)).expressionToNative(multiplication, makeContextResult));
  }

  @Test
  public void testExpressionToNative3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    makeEnvironmentResult
        .addDeclaration(instanceResult.makeVariableDeclaration("'Employment Status'", new StringType()));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext makeContextResult = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral leftOperand = new StringLiteral("\"You are \"");
    Addition addition = new Addition("+", leftOperand, new Name("'Employment Status'"));
    addition.accept(new FEELSemanticVisitor(basicDMN2JavaTransformer), makeContextResult);

    // Act and Assert
    assertEquals("stringAdd(\"You are \", employmentStatus)",
        (new FEELTranslatorImpl(basicDMN2JavaTransformer)).expressionToNative(addition, makeContextResult));
  }
}

