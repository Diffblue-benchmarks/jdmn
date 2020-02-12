package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
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
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.InExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Context;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
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
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.ForExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.InstanceOfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.QuantifiedExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ContextTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.FunctionTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ListTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedPositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedSimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import org.junit.Test;

public class NopVisitorDiffblueTest {
  @Test(timeout=10000)
  public void visitTest50() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));

    // Act and Assert
    assertSame(negatedSimplePositiveUnaryTests,
        nopVisitor.visit(negatedSimplePositiveUnaryTests, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest49() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "foo");

    // Act and Assert
    assertSame(pathExpression, nopVisitor.visit(pathExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest48() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act and Assert
    assertSame(iterator, nopVisitor.visit(iterator, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest47() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ListTest listTest = new ListTest(new ListLiteral(null));

    // Act and Assert
    assertSame(listTest, nopVisitor.visit(listTest, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest46() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertSame(simplePositiveUnaryTests, nopVisitor.visit(simplePositiveUnaryTests, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest45() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, nopVisitor.visit(expressionList, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest44() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ContextEntryKey contextEntryKey = new ContextEntryKey("foo");

    // Act and Assert
    assertSame(contextEntryKey, nopVisitor.visit(contextEntryKey, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest43() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ForExpression forExpression = new ForExpression(null, new ExpressionList());

    // Act and Assert
    assertSame(forExpression, nopVisitor.visit(forExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest42() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FunctionTypeExpression functionTypeExpression = new FunctionTypeExpression(null, new NamedTypeExpression("name"));

    // Act and Assert
    assertSame(functionTypeExpression, nopVisitor.visit(functionTypeExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest41() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Context context = new Context(null);

    // Act and Assert
    assertSame(context, nopVisitor.visit(context, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest40() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList function = new ExpressionList();
    FunctionInvocation functionInvocation = new FunctionInvocation(function, new NamedParameters(null));

    // Act and Assert
    assertSame(functionInvocation, nopVisitor.visit(functionInvocation, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest39() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Disjunction disjunction = new Disjunction(leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(disjunction, nopVisitor.visit(disjunction, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest38() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList start = new ExpressionList();
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(start, new ExpressionList());

    // Act and Assert
    assertSame(rangeIteratorDomain, nopVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest37() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NamedParameters namedParameters = new NamedParameters(null);

    // Act and Assert
    assertSame(namedParameters, nopVisitor.visit(namedParameters, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest36() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ListLiteral listLiteral = new ListLiteral(null);

    // Act and Assert
    assertSame(listLiteral, nopVisitor.visit(listLiteral, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest35() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    OperatorTest operatorTest = new OperatorTest("foo", new ExpressionList());

    // Act and Assert
    assertSame(operatorTest, nopVisitor.visit(operatorTest, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest34() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act and Assert
    assertSame(namedTypeExpression, nopVisitor.visit(namedTypeExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest33() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();
    IfExpression ifExpression = new IfExpression(condition, thenExpression, new ExpressionList());

    // Act and Assert
    assertSame(ifExpression, nopVisitor.visit(ifExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest32() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new ExpressionList());

    // Act and Assert
    assertSame(arithmeticNegation, nopVisitor.visit(arithmeticNegation, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest31() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter, nopVisitor.visit(formalParameter, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest30() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Name name = new Name("name");

    // Act and Assert
    assertSame(name, nopVisitor.visit(name, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest29() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Exponentiation exponentiation = new Exponentiation(leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(exponentiation, nopVisitor.visit(exponentiation, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest28() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList value = new ExpressionList();
    InExpression inExpression = new InExpression(value, new NullTest());

    // Act and Assert
    assertSame(inExpression, nopVisitor.visit(inExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest27() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Relational relational = new Relational("foo", leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(relational, nopVisitor.visit(relational, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest26() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ContextTypeExpression contextTypeExpression = new ContextTypeExpression(null);

    // Act and Assert
    assertSame(contextTypeExpression, nopVisitor.visit(contextTypeExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest25() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ListTypeExpression listTypeExpression = new ListTypeExpression(new NamedTypeExpression("name"));

    // Act and Assert
    assertSame(listTypeExpression, nopVisitor.visit(listTypeExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest24() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Any any = new Any();

    // Act and Assert
    assertSame(any, nopVisitor.visit(any, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest23() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    QuantifiedExpression quantifiedExpression = new QuantifiedExpression("foo", null, new ExpressionList());

    // Act and Assert
    assertSame(quantifiedExpression, nopVisitor.visit(quantifiedExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest22() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();
    BetweenExpression betweenExpression = new BetweenExpression(value, leftEndpoint, new ExpressionList());

    // Act and Assert
    assertSame(betweenExpression, nopVisitor.visit(betweenExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest21() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionTest expressionTest = new ExpressionTest(new ExpressionList());

    // Act and Assert
    assertSame(expressionTest, nopVisitor.visit(expressionTest, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest20() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act and Assert
    assertSame(expressionIteratorDomain, nopVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest19() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");

    // Act and Assert
    assertSame(booleanLiteral, nopVisitor.visit(booleanLiteral, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest18() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Conjunction conjunction = new Conjunction(leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(conjunction, nopVisitor.visit(conjunction, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest17() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NullTest nullTest = new NullTest();

    // Act and Assert
    assertSame(nullTest, nopVisitor.visit(nullTest, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest16() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(null);

    // Act and Assert
    assertSame(positiveUnaryTests, nopVisitor.visit(positiveUnaryTests, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest15() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, nopVisitor.visit(nullLiteral, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest14() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    assertSame(positionalParameters, nopVisitor.visit(positionalParameters, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest13() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ContextEntryKey key = new ContextEntryKey("foo");
    ContextEntry contextEntry = new ContextEntry(key, new ExpressionList());

    // Act and Assert
    assertSame(contextEntry, nopVisitor.visit(contextEntry, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest12() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Multiplication multiplication = new Multiplication("foo", leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(multiplication, nopVisitor.visit(multiplication, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest11() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Addition addition = new Addition("foo", leftOperand, new ExpressionList());

    // Act and Assert
    assertSame(addition, nopVisitor.visit(addition, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest10() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    QualifiedName qualifiedName = new QualifiedName(null);

    // Act and Assert
    assertSame(qualifiedName, nopVisitor.visit(qualifiedName, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest9() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList source = new ExpressionList();
    FilterExpression filterExpression = new FilterExpression(source, new ExpressionList());

    // Act and Assert
    assertSame(filterExpression, nopVisitor.visit(filterExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest8() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NumericLiteral numericLiteral = new NumericLiteral("value");

    // Act and Assert
    assertSame(numericLiteral, nopVisitor.visit(numericLiteral, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest7() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral("foo", "foo");

    // Act and Assert
    assertSame(dateTimeLiteral, nopVisitor.visit(dateTimeLiteral, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest6() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FunctionDefinition functionDefinition = new FunctionDefinition(null, new ExpressionList(), true);

    // Act and Assert
    assertSame(functionDefinition, nopVisitor.visit(functionDefinition, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest5() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression instanceOfExpression = new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"));

    // Act and Assert
    assertSame(instanceOfExpression, nopVisitor.visit(instanceOfExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest4() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());

    // Act and Assert
    assertSame(logicNegation, nopVisitor.visit(logicNegation, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest3() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act and Assert
    assertSame(stringLiteral, nopVisitor.visit(stringLiteral, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest2() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act and Assert
    assertSame(negatedPositiveUnaryTests, nopVisitor.visit(negatedPositiveUnaryTests, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList start = new ExpressionList();
    RangeTest rangeTest = new RangeTest(true, start, true, new ExpressionList());

    // Act and Assert
    assertSame(rangeTest, nopVisitor.visit(rangeTest, FEELContext.makeContext(null)));
  }
}

