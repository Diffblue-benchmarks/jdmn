package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.QualifiedName;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.BetweenExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.DateTimeLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.LogicNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.InstanceOfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ListTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FEELSemanticVisitorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void visitTest34() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    Type type = ((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    Type type1 = ((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }
  @Test(timeout=10000)
  public void visitTest33() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act and Assert
    assertSame(iterator, feelSemanticVisitor.visit(iterator, FEELContext.makeContext(null)));
  }
  @Test(timeout=10000)
  public void visitTest32() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertSame(simplePositiveUnaryTests,
        feelSemanticVisitor.visit(simplePositiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((SimplePositiveUnaryTests) feelSemanticVisitor.visit(simplePositiveUnaryTests,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
  @Test(timeout=10000)
  public void visitTest31() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, feelSemanticVisitor.visit(expressionList, FEELContext.makeContext(null)));
    Type type = ((ExpressionList) feelSemanticVisitor.visit(expressionList, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
  @Test(timeout=10000)
  public void visitTest30() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ContextEntryKey contextEntryKey = new ContextEntryKey("foo");

    // Act and Assert
    assertSame(contextEntryKey, feelSemanticVisitor.visit(contextEntryKey, FEELContext.makeContext(null)));
  }
  @Test(timeout=10000)
  public void visitTest29() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList function = new ExpressionList();
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(null));

    // Act and Assert
    thrown.expect(ClassCastException.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest28() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Disjunction disjunction = new Disjunction(leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getType();
    Expression leftOperand1 = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getLeftOperand();
    Type type1 = rightOperand.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type2 = leftOperand1.getType();
    assertTrue(type2 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    String actualToStringResult = type2.toString();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", actualToStringResult);
    assertEquals("TupleType()", type1.toString());
  }
  @Test(timeout=10000)
  public void visitTest27() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList start = new ExpressionList();
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(start, new ExpressionList());

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    Expression start1 = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain,
        FEELContext.makeContext(null))).getStart();
    Expression end = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain,
        FEELContext.makeContext(null))).getEnd();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    boolean actualIsValidResult = type.isValid();
    Type type1 = end.getType();
    Type type2 = start1.getType();
    assertTrue(type2 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    String actualToStringResult = type2.toString();
    assertFalse(actualIsValidResult);
    assertEquals("TupleType()", actualToStringResult);
    assertEquals("TupleType()", type1.toString());
  }
  @Test(timeout=10000)
  public void visitTest26() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NamedParameters namedParameters = new NamedParameters(null);

    // Act and Assert
    assertSame(namedParameters, feelSemanticVisitor.visit(namedParameters, FEELContext.makeContext(null)));
  }
  @Test(timeout=10000)
  public void visitTest25() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NamedTypeExpression element = new NamedTypeExpression("name");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest24() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();
    IfExpression element = new IfExpression(condition, thenExpression, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest23() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ArithmeticNegation element = new ArithmeticNegation(new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest22() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter, feelSemanticVisitor.visit(formalParameter, FEELContext.makeContext(null)));
  }
  @Test(timeout=10000)
  public void visitTest21() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Exponentiation element = new Exponentiation(leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest20() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Relational element = new Relational("foo", leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest19() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ListTypeExpression element = new ListTypeExpression(new NamedTypeExpression("name"));

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest18() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Any any = new Any();

    // Act and Assert
    assertSame(any, feelSemanticVisitor.visit(any, FEELContext.makeContext(null)));
    assertTrue(((Any) feelSemanticVisitor.visit(any, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
  @Test(timeout=10000)
  public void visitTest17() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();
    BetweenExpression element = new BetweenExpression(value, leftEndpoint, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionTest element = new ExpressionTest(new ExpressionList());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");

    // Act and Assert
    assertSame(booleanLiteral, feelSemanticVisitor.visit(booleanLiteral, FEELContext.makeContext(null)));
    assertTrue(((BooleanLiteral) feelSemanticVisitor.visit(booleanLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
  @Test(timeout=10000)
  public void visitTest14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Conjunction conjunction = new Conjunction(leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getType();
    Expression leftOperand1 = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getLeftOperand();
    Type type1 = rightOperand.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type2 = leftOperand1.getType();
    assertTrue(type2 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    String actualToStringResult = type2.toString();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", actualToStringResult);
    assertEquals("TupleType()", type1.toString());
  }
  @Test(timeout=10000)
  public void visitTest13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NullTest nullTest = new NullTest();

    // Act and Assert
    assertSame(nullTest, feelSemanticVisitor.visit(nullTest, FEELContext.makeContext(null)));
    assertTrue(((NullTest) feelSemanticVisitor.visit(nullTest, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }
  @Test(timeout=10000)
  public void visitTest12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(null);

    // Act and Assert
    assertSame(positiveUnaryTests, feelSemanticVisitor.visit(positiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((PositiveUnaryTests) feelSemanticVisitor.visit(positiveUnaryTests, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
  @Test(timeout=10000)
  public void visitTest11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, feelSemanticVisitor.visit(nullLiteral, FEELContext.makeContext(null)));
    assertTrue(((NullLiteral) feelSemanticVisitor.visit(nullLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }
  @Test(timeout=10000)
  public void visitTest10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    assertSame(positionalParameters, feelSemanticVisitor.visit(positionalParameters, FEELContext.makeContext(null)));
  }
  @Test(timeout=10000)
  public void visitTest9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Multiplication element = new Multiplication("foo", leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Addition element = new Addition("foo", leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    QualifiedName element = new QualifiedName(null);

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NumericLiteral numericLiteral = new NumericLiteral("value");

    // Act and Assert
    assertSame(numericLiteral, feelSemanticVisitor.visit(numericLiteral, FEELContext.makeContext(null)));
    assertTrue(((NumericLiteral) feelSemanticVisitor.visit(numericLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }
  @Test(timeout=10000)
  public void visitTest5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    DateTimeLiteral element = new DateTimeLiteral("foo", "foo");

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"));

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
  @Test(timeout=10000)
  public void visitTest3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null))).getType();
    Type type1 = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }
  @Test(timeout=10000)
  public void visitTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act and Assert
    assertSame(stringLiteral, feelSemanticVisitor.visit(stringLiteral, FEELContext.makeContext(null)));
    assertTrue(((StringLiteral) feelSemanticVisitor.visit(stringLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }
  @Test(timeout=10000)
  public void visitTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList start = new ExpressionList();
    RangeTest element = new RangeTest(true, start, true, new ExpressionList());

    // Act and Assert
    thrown.expect(SemanticError.class);
    feelSemanticVisitor.visit(element, FEELContext.makeContext(null));
  }
}

