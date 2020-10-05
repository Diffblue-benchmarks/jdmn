package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.synthesis.FEELToJavaVisitor;
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

public class MultiplicationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("12");

    // Act
    Multiplication actualMultiplication = new Multiplication("*", leftOperand, new Name("'Monthly Salary'"));

    // Assert
    assertEquals("*", actualMultiplication.getOperator());
    assertTrue(actualMultiplication.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(*,NumericLiteral(12),Name('Monthly Salary'))", actualMultiplication.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    PathExpression leftOperand = new PathExpression(new Name("loan"), "principal");

    // Act
    Multiplication actualMultiplication = new Multiplication("*", leftOperand,
        new PathExpression(new Name("loan"), "rate"));

    // Assert
    assertEquals("*", actualMultiplication.getOperator());
    assertTrue(actualMultiplication.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(*,PathExpression(Name(loan), principal),PathExpression(Name(loan), rate))",
        actualMultiplication.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    PathExpression leftOperand = new PathExpression(new Name("loan"), "principal");
    Multiplication leftOperand1 = new Multiplication("*", leftOperand, new PathExpression(new Name("loan"), "rate"));

    // Act
    Multiplication actualMultiplication = new Multiplication("/", leftOperand1, new NumericLiteral("12"));

    // Assert
    assertEquals("/", actualMultiplication.getOperator());
    assertTrue(actualMultiplication.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(/,Multiplication(*,PathExpression(Name(loan), principal),PathExpression(Name(loan),"
        + " rate)),NumericLiteral(12))", actualMultiplication.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    NumberType numberType = new NumberType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Monthly Salary'", numberType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    NumericLiteral leftOperand = new NumericLiteral("12");
    Multiplication multiplication = new Multiplication("*", leftOperand, new Name("'Monthly Salary'"));

    // Act and Assert
    assertSame(multiplication, multiplication.accept(new FEELSemanticVisitor(dmnTransformer), params));
    Type actualType = ((Multiplication) multiplication.accept(new FEELSemanticVisitor(dmnTransformer), params))
        .getRightOperand().getType();
    NumberType expectedType = numberType.NUMBER;
    Type type = ((Multiplication) multiplication.accept(new FEELSemanticVisitor(dmnTransformer), params)).getType();
    assertSame(expectedType, type);
    assertSame(type, ((Multiplication) multiplication.accept(new FEELSemanticVisitor(dmnTransformer), params))
        .getLeftOperand().getType());
    assertSame(numberType, actualType);
  }

  @Test
  public void testAccept2() {
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
        multiplication.accept(new FEELToJavaVisitor(basicDMN2JavaTransformer), makeContextResult));
  }
}

