package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
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

public class FEELToJavaVisitorDiffblueTest {
  @Test
  public void testNameToJava() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();

    // Act and Assert
    assertEquals("fullName", feelToJavaVisitor.nameToJava("'Full Name'",
        FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision))));
  }

  @Test
  public void testNameToJava2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();

    // Act and Assert
    assertEquals("monthlySalary", feelToJavaVisitor.nameToJava("'Monthly Salary'",
        FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision))));
  }

  @Test
  public void testNameToJava3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();

    // Act and Assert
    assertEquals("employmentStatus", feelToJavaVisitor.nameToJava("'Employment Status'",
        FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision))));
  }

  @Test
  public void testVisit() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("fullName", feelToJavaVisitor.visit(new Name("'Full Name'"), context));
  }

  @Test
  public void testVisit10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("null", feelToJavaVisitor.visit(new NullLiteral(), context));
  }

  @Test
  public void testVisit11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("null", feelToJavaVisitor.visit(new NullLiteral(), context));
  }

  @Test
  public void testVisit12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("number(\"12\")", feelToJavaVisitor.visit(new NumericLiteral("12"), context));
  }

  @Test
  public void testVisit13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("\"Hello \"", feelToJavaVisitor.visit(new StringLiteral("\"Hello \""), context));
  }

  @Test
  public void testVisit14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("\"You are \"", feelToJavaVisitor.visit(new StringLiteral("\"You are \""), context));
  }

  @Test
  public void testVisit15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    BooleanType booleanType = new BooleanType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("A", booleanType));
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("B", booleanType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext makeContextResult = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name leftOperand = new Name("A");
    Conjunction conjunction = new Conjunction(leftOperand, new Name("B"));
    conjunction.accept(new FEELSemanticVisitor(basicDMN2JavaTransformer), makeContextResult);

    // Act and Assert
    assertEquals("booleanAnd(a, b)",
        (new FEELToJavaVisitor(basicDMN2JavaTransformer)).visit(conjunction, makeContextResult));
  }

  @Test
  public void testVisit16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("booleanNot(a)", feelToJavaVisitor.visit(new LogicNegation(new Name("A")), context));
  }

  @Test
  public void testVisit2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("monthlySalary", feelToJavaVisitor.visit(new Name("'Monthly Salary'"), context));
  }

  @Test
  public void testVisit3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("employmentStatus", feelToJavaVisitor.visit(new Name("'Employment Status'"), context));
  }

  @Test
  public void testVisit4() {
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
        (new FEELToJavaVisitor(basicDMN2JavaTransformer)).visit(addition, makeContextResult));
  }

  @Test
  public void testVisit5() {
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
        (new FEELToJavaVisitor(basicDMN2JavaTransformer)).visit(addition, makeContextResult));
  }

  @Test
  public void testVisit6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("numericUnaryMinus(number(\".872\"))",
        feelToJavaVisitor.visit(new ArithmeticNegation(new NumericLiteral(".872")), context));
  }

  @Test
  public void testVisit7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    NumericLiteral leftOperand = new NumericLiteral("10");

    // Act and Assert
    assertEquals("numericExponentiation(number(\"10\"), number(\"5\"))",
        feelToJavaVisitor.visit(new Exponentiation(leftOperand, new NumericLiteral("5")), context));
  }

  @Test
  public void testVisit8() {
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
        (new FEELToJavaVisitor(basicDMN2JavaTransformer)).visit(multiplication, makeContextResult));
  }

  @Test
  public void testVisit9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("null", feelToJavaVisitor.visit(new NullLiteral(), context));
  }
}

