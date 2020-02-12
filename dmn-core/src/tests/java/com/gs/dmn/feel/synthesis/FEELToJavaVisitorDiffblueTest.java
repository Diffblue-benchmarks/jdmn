package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.QualifiedName;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.BetweenExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Context;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Conversion;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ConversionKind;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.DateTimeLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.LogicNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.FilterExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.InstanceOfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ContextTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.FunctionTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ListTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedPositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedSimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FEELToJavaVisitorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void visitTest44() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NegatedSimplePositiveUnaryTests element = new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(null));

    // Act and Assert
    assertEquals("booleanNot(booleanOr())", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest43() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    PathExpression element = new PathExpression(new ExpressionList(), "foo");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest42() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Iterator element = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest41() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ListTest element = new ListTest(new ListLiteral(null));

    // Act and Assert
    thrown.expect(ClassCastException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest40() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    SimplePositiveUnaryTests element = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertEquals("booleanOr()", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest39() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList element = new ExpressionList();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest38() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ContextEntryKey element = new ContextEntryKey("foo");

    // Act and Assert
    assertEquals("\"foo\"", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest37() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    FunctionTypeExpression element = new FunctionTypeExpression(null, new NamedTypeExpression("name"));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest36() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Context element = new Context(null);

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.Context()", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest35() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList function = new ExpressionList();
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(null));

    // Act and Assert
    thrown.expect(ClassCastException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest34() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Disjunction element = new Disjunction(leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest33() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList start = new ExpressionList();
    RangeIteratorDomain element = new RangeIteratorDomain(start, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest32() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NamedParameters namedParameters = new NamedParameters(null);

    // Act and Assert
    assertSame(namedParameters, feelToJavaVisitor.visit(namedParameters, FEELContext.makeContext(null)));
    assertTrue(((NamedParameters) feelToJavaVisitor.visit(namedParameters, FEELContext.makeContext(null)))
        .getOriginalArguments() instanceof com.gs.dmn.runtime.interpreter.NamedArguments);
  }

  @Test(timeout=10000)
  public void visitTest31() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ListLiteral element = new ListLiteral(null);

    // Act and Assert
    assertEquals("asList()", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest30() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NamedTypeExpression element = new NamedTypeExpression("name");

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest29() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();
    IfExpression element = new IfExpression(condition, thenExpression, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest28() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ArithmeticNegation element = new ArithmeticNegation(new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest27() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    FormalParameter element = new FormalParameter("name", new AnyType());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest26() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Name element = new Name("?");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest25() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Name element = new Name("name");

    // Act and Assert
    assertEquals("name", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest24() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Exponentiation element = new Exponentiation(leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void convertArgumentTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));

    // Act and Assert
    assertEquals("foo", feelToJavaVisitor.convertArgument("foo", new Conversion(ConversionKind.NONE, new AnyType())));
  }

  @Test(timeout=10000)
  public void visitTest23() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Relational element = new Relational("foo", leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest22() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ContextTypeExpression element = new ContextTypeExpression(null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void nameToJavaTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));

    // Act and Assert
    thrown.expect(NullPointerException.class);
    feelToJavaVisitor.nameToJava("?", FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void nameToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));

    // Act and Assert
    assertEquals("name", feelToJavaVisitor.nameToJava("name", FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest21() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ListTypeExpression element = new ListTypeExpression(new NamedTypeExpression("name"));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest20() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    Any element = new Any();

    // Act and Assert
    assertEquals("true", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest19() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();
    BetweenExpression element = new BetweenExpression(value, leftEndpoint, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest18() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionTest element = new ExpressionTest(new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest17() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    BooleanLiteral element = new BooleanLiteral("value");

    // Act and Assert
    assertEquals("Boolean.FALSE", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Conjunction element = new Conjunction(leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    PositiveUnaryTests element = new PositiveUnaryTests(null);

    // Act and Assert
    assertEquals("booleanOr()", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NullLiteral element = new NullLiteral();

    // Act and Assert
    assertEquals("null", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ContextEntryKey key = new ContextEntryKey("foo");
    ContextEntry element = new ContextEntry(key, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    assertSame(positionalParameters, feelToJavaVisitor.visit(positionalParameters, FEELContext.makeContext(null)));
    assertTrue(((PositionalParameters) feelToJavaVisitor.visit(positionalParameters, FEELContext.makeContext(null)))
        .getOriginalArguments() instanceof com.gs.dmn.runtime.interpreter.PositionalArguments);
  }

  @Test(timeout=10000)
  public void visitTest10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Multiplication element = new Multiplication("foo", leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    Addition element = new Addition("foo", leftOperand, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    QualifiedName element = new QualifiedName(null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList source = new ExpressionList();
    FilterExpression element = new FilterExpression(source, new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NumericLiteral element = new NumericLiteral("value");

    // Act and Assert
    assertEquals("number(\"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    DateTimeLiteral element = new DateTimeLiteral("foo", "foo");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"));

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    LogicNegation element = new LogicNegation(new ExpressionList());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    feelToJavaVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    StringLiteral element = new StringLiteral("value");

    // Act and Assert
    assertEquals("\"value\"", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act and Assert
    assertEquals("booleanNot(booleanOr())", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }
}

