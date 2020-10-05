package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
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

public class AdditionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    StringLiteral leftOperand = new StringLiteral("\"Hello \"");

    // Act
    Addition actualAddition = new Addition("+", leftOperand, new Name("'Full Name'"));

    // Assert
    assertEquals("+", actualAddition.getOperator());
    assertTrue(actualAddition.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(+,StringLiteral(\"Hello \"),Name('Full Name'))", actualAddition.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    StringLiteral leftOperand = new StringLiteral("\"You are \"");

    // Act
    Addition actualAddition = new Addition("+", leftOperand, new Name("'Employment Status'"));

    // Assert
    assertEquals("+", actualAddition.getOperator());
    assertTrue(actualAddition.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(+,StringLiteral(\"You are \"),Name('Employment Status'))", actualAddition.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("1");
    PathExpression leftOperand1 = new PathExpression(new Name("loan"), "rate");

    // Act
    Addition actualAddition = new Addition("+", leftOperand,
        new Multiplication("/", leftOperand1, new NumericLiteral("12")));

    // Assert
    assertEquals("+", actualAddition.getOperator());
    assertTrue(actualAddition.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(+,NumericLiteral(1),Multiplication(/,PathExpression(Name(loan), rate),NumericLiteral(12)))",
        actualAddition.toString());
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
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Full Name'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral leftOperand = new StringLiteral("\"Hello \"");
    Addition addition = new Addition("+", leftOperand, new Name("'Full Name'"));

    // Act and Assert
    assertSame(addition, addition.accept(new FEELSemanticVisitor(dmnTransformer), params));
    Type actualType = ((Addition) addition.accept(new FEELSemanticVisitor(dmnTransformer), params)).getRightOperand()
        .getType();
    StringType expectedType = stringType.STRING;
    Type type = ((Addition) addition.accept(new FEELSemanticVisitor(dmnTransformer), params)).getType();
    assertSame(expectedType, type);
    assertSame(type,
        ((Addition) addition.accept(new FEELSemanticVisitor(dmnTransformer), params)).getLeftOperand().getType());
    assertSame(stringType, actualType);
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
        addition.accept(new FEELToJavaVisitor(basicDMN2JavaTransformer), makeContextResult));
  }

  @Test
  public void testAccept3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Employment Status'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral leftOperand = new StringLiteral("\"You are \"");
    Addition addition = new Addition("+", leftOperand, new Name("'Employment Status'"));

    // Act and Assert
    assertSame(addition, addition.accept(new FEELSemanticVisitor(dmnTransformer), params));
    Type actualType = ((Addition) addition.accept(new FEELSemanticVisitor(dmnTransformer), params)).getRightOperand()
        .getType();
    StringType expectedType = stringType.STRING;
    Type type = ((Addition) addition.accept(new FEELSemanticVisitor(dmnTransformer), params)).getType();
    assertSame(expectedType, type);
    assertSame(type,
        ((Addition) addition.accept(new FEELSemanticVisitor(dmnTransformer), params)).getLeftOperand().getType());
    assertSame(stringType, actualType);
  }
}

