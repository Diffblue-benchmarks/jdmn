package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.LogicNegation;
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

public class FEELSemanticVisitorDiffblueTest {
  @Test
  public void testVisit() {
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
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name name = new Name("'Full Name'");

    // Act and Assert
    assertSame(name, (new FEELSemanticVisitor(dmnTransformer)).visit(name, context));
    assertSame(stringType, ((Name) (new FEELSemanticVisitor(dmnTransformer)).visit(name, context)).getType());
  }

  @Test
  public void testVisit10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(dmnTransformer);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, feelSemanticVisitor.visit(nullLiteral, context));
    assertTrue(((NullLiteral) feelSemanticVisitor.visit(nullLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(dmnTransformer);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, feelSemanticVisitor.visit(nullLiteral, context));
    assertTrue(((NullLiteral) feelSemanticVisitor.visit(nullLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    NumericLiteral numericLiteral = new NumericLiteral("12");

    // Act and Assert
    assertSame(numericLiteral, (new FEELSemanticVisitor(dmnTransformer)).visit(numericLiteral, context));
    assertTrue(((NumericLiteral) (new FEELSemanticVisitor(dmnTransformer)).visit(numericLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral stringLiteral = new StringLiteral("\"Hello \"");

    // Act and Assert
    assertSame(stringLiteral, (new FEELSemanticVisitor(dmnTransformer)).visit(stringLiteral, context));
    assertTrue(((StringLiteral) (new FEELSemanticVisitor(dmnTransformer)).visit(stringLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral stringLiteral = new StringLiteral("\"You are \"");

    // Act and Assert
    assertSame(stringLiteral, (new FEELSemanticVisitor(dmnTransformer)).visit(stringLiteral, context));
    assertTrue(((StringLiteral) (new FEELSemanticVisitor(dmnTransformer)).visit(stringLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    BooleanType booleanType = new BooleanType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("B", booleanType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name leftOperand = new Name("A");
    Conjunction conjunction = new Conjunction(leftOperand, new Name("B"));

    // Act and Assert
    assertSame(conjunction, (new FEELSemanticVisitor(dmnTransformer)).visit(conjunction, context));
    Type actualType = ((Conjunction) (new FEELSemanticVisitor(dmnTransformer)).visit(conjunction, context))
        .getRightOperand().getType();
    BooleanType expectedType = booleanType.BOOLEAN;
    assertSame(expectedType,
        ((Conjunction) (new FEELSemanticVisitor(dmnTransformer)).visit(conjunction, context)).getType());
    assertSame(booleanType, actualType);
  }

  @Test
  public void testVisit16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    BooleanType booleanType = new BooleanType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("A", booleanType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    LogicNegation logicNegation = new LogicNegation(new Name("A"));

    // Act and Assert
    assertSame(logicNegation, (new FEELSemanticVisitor(dmnTransformer)).visit(logicNegation, context));
    Type actualType = ((LogicNegation) (new FEELSemanticVisitor(dmnTransformer)).visit(logicNegation, context))
        .getLeftOperand().getType();
    BooleanType expectedType = booleanType.BOOLEAN;
    assertSame(expectedType,
        ((LogicNegation) (new FEELSemanticVisitor(dmnTransformer)).visit(logicNegation, context)).getType());
    assertSame(booleanType, actualType);
  }

  @Test
  public void testVisit2() {
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
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name name = new Name("'Monthly Salary'");

    // Act and Assert
    assertSame(name, (new FEELSemanticVisitor(dmnTransformer)).visit(name, context));
    assertSame(numberType, ((Name) (new FEELSemanticVisitor(dmnTransformer)).visit(name, context)).getType());
  }

  @Test
  public void testVisit3() {
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
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name name = new Name("'Employment Status'");

    // Act and Assert
    assertSame(name, (new FEELSemanticVisitor(dmnTransformer)).visit(name, context));
    assertSame(stringType, ((Name) (new FEELSemanticVisitor(dmnTransformer)).visit(name, context)).getType());
  }

  @Test
  public void testVisit4() {
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
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral leftOperand = new StringLiteral("\"Hello \"");
    Addition addition = new Addition("+", leftOperand, new Name("'Full Name'"));

    // Act and Assert
    assertSame(addition, (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context));
    Type actualType = ((Addition) (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context)).getRightOperand()
        .getType();
    StringType expectedType = stringType.STRING;
    Type type = ((Addition) (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context)).getType();
    assertSame(expectedType, type);
    assertSame(type,
        ((Addition) (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context)).getLeftOperand().getType());
    assertSame(stringType, actualType);
  }

  @Test
  public void testVisit5() {
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
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    StringLiteral leftOperand = new StringLiteral("\"You are \"");
    Addition addition = new Addition("+", leftOperand, new Name("'Employment Status'"));

    // Act and Assert
    assertSame(addition, (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context));
    Type actualType = ((Addition) (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context)).getRightOperand()
        .getType();
    StringType expectedType = stringType.STRING;
    Type type = ((Addition) (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context)).getType();
    assertSame(expectedType, type);
    assertSame(type,
        ((Addition) (new FEELSemanticVisitor(dmnTransformer)).visit(addition, context)).getLeftOperand().getType());
    assertSame(stringType, actualType);
  }

  @Test
  public void testVisit6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new NumericLiteral(".872"));

    // Act and Assert
    assertSame(arithmeticNegation, (new FEELSemanticVisitor(dmnTransformer)).visit(arithmeticNegation, context));
    Type actualType = ((ArithmeticNegation) (new FEELSemanticVisitor(dmnTransformer)).visit(arithmeticNegation,
        context)).getLeftOperand().getType();
    Type type = ((ArithmeticNegation) (new FEELSemanticVisitor(dmnTransformer)).visit(arithmeticNegation, context))
        .getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    NumericLiteral leftOperand = new NumericLiteral("10");
    Exponentiation exponentiation = new Exponentiation(leftOperand, new NumericLiteral("5"));

    // Act and Assert
    assertSame(exponentiation, (new FEELSemanticVisitor(dmnTransformer)).visit(exponentiation, context));
    Type actualType = ((Exponentiation) (new FEELSemanticVisitor(dmnTransformer)).visit(exponentiation, context))
        .getRightOperand().getType();
    Type type = ((Exponentiation) (new FEELSemanticVisitor(dmnTransformer)).visit(exponentiation, context)).getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, ((Exponentiation) (new FEELSemanticVisitor(dmnTransformer)).visit(exponentiation, context))
        .getLeftOperand().getType());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit8() {
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
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    NumericLiteral leftOperand = new NumericLiteral("12");
    Multiplication multiplication = new Multiplication("*", leftOperand, new Name("'Monthly Salary'"));

    // Act and Assert
    assertSame(multiplication, (new FEELSemanticVisitor(dmnTransformer)).visit(multiplication, context));
    Type actualType = ((Multiplication) (new FEELSemanticVisitor(dmnTransformer)).visit(multiplication, context))
        .getRightOperand().getType();
    NumberType expectedType = numberType.NUMBER;
    Type type = ((Multiplication) (new FEELSemanticVisitor(dmnTransformer)).visit(multiplication, context)).getType();
    assertSame(expectedType, type);
    assertSame(type, ((Multiplication) (new FEELSemanticVisitor(dmnTransformer)).visit(multiplication, context))
        .getLeftOperand().getType());
    assertSame(numberType, actualType);
  }

  @Test
  public void testVisit9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(dmnTransformer);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, feelSemanticVisitor.visit(nullLiteral, context));
    assertTrue(((NullLiteral) feelSemanticVisitor.visit(nullLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }
}

