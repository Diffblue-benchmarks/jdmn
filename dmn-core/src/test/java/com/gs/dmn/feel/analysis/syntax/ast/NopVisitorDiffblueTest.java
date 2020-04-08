package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
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
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedPositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedSimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.runtime.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class NopVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    RangeTest rangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());

    // Act and Assert
    assertSame(rangeTest, nopVisitor.visit(rangeTest, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit10() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    FEELContext context = FEELContext.makeContext(null);
    QualifiedName qualifiedName = new QualifiedName(stringList);

    // Act and Assert
    assertSame(qualifiedName, nopVisitor.visit(qualifiedName, context));
  }

  @Test
  public void testVisit11() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Addition addition = new Addition("operator", new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(addition, nopVisitor.visit(addition, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit12() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Multiplication multiplication = new Multiplication("operator", new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(multiplication, nopVisitor.visit(multiplication, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit13() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ContextEntry contextEntry = new ContextEntry(null, new ExpressionList());

    // Act and Assert
    assertSame(contextEntry, nopVisitor.visit(contextEntry, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit14() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);

    // Act and Assert
    assertSame(positionalParameters, nopVisitor.visit(positionalParameters, context));
  }

  @Test
  public void testVisit15() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FEELContext context = FEELContext.makeContext(null);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, nopVisitor.visit(nullLiteral, context));
  }

  @Test
  public void testVisit16() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    FEELContext context = FEELContext.makeContext(null);
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);

    // Act and Assert
    assertSame(positiveUnaryTests, nopVisitor.visit(positiveUnaryTests, context));
  }

  @Test
  public void testVisit17() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FEELContext context = FEELContext.makeContext(null);
    NullTest nullTest = new NullTest();

    // Act and Assert
    assertSame(nullTest, nopVisitor.visit(nullTest, context));
  }

  @Test
  public void testVisit18() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Conjunction conjunction = new Conjunction(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(conjunction, nopVisitor.visit(conjunction, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit19() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");

    // Act and Assert
    assertSame(booleanLiteral, nopVisitor.visit(booleanLiteral, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Act and Assert
    assertSame(negatedPositiveUnaryTests, nopVisitor.visit(negatedPositiveUnaryTests, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit20() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act and Assert
    assertSame(expressionIteratorDomain, nopVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit21() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionTest expressionTest = new ExpressionTest(new ExpressionList());

    // Act and Assert
    assertSame(expressionTest, nopVisitor.visit(expressionTest, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit22() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    BetweenExpression betweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Act and Assert
    assertSame(betweenExpression, nopVisitor.visit(betweenExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit23() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(null)));
    QuantifiedExpression quantifiedExpression = new QuantifiedExpression("predicate", iteratorList,
        new ExpressionList());

    // Act and Assert
    assertSame(quantifiedExpression, nopVisitor.visit(quantifiedExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit24() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FEELContext context = FEELContext.makeContext(null);
    Any any = new Any();

    // Act and Assert
    assertSame(any, nopVisitor.visit(any, context));
  }

  @Test
  public void testVisit25() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ListTypeExpression listTypeExpression = new ListTypeExpression(new NamedTypeExpression("qualifiedName"));

    // Act and Assert
    assertSame(listTypeExpression, nopVisitor.visit(listTypeExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit26() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    FEELContext params = FEELContext.makeContext(null);
    ContextTypeExpression contextTypeExpression = new ContextTypeExpression(pairList);

    // Act and Assert
    assertSame(contextTypeExpression, nopVisitor.visit(contextTypeExpression, params));
  }

  @Test
  public void testVisit27() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Relational relational = new Relational("operator", new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(relational, nopVisitor.visit(relational, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit28() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList value = new ExpressionList();
    InExpression inExpression = new InExpression(value, new NullTest());

    // Act and Assert
    assertSame(inExpression, nopVisitor.visit(inExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit29() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Exponentiation exponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(exponentiation, nopVisitor.visit(exponentiation, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit3() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act and Assert
    assertSame(stringLiteral, nopVisitor.visit(stringLiteral, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit30() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Name name = new Name("name");

    // Act and Assert
    assertSame(name, nopVisitor.visit(name, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit31() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter, nopVisitor.visit(formalParameter, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit32() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new ExpressionList());

    // Act and Assert
    assertSame(arithmeticNegation, nopVisitor.visit(arithmeticNegation, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit33() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    IfExpression ifExpression = new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(ifExpression, nopVisitor.visit(ifExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit34() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Act and Assert
    assertSame(namedTypeExpression, nopVisitor.visit(namedTypeExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit35() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    OperatorTest operatorTest = new OperatorTest("operator", new ExpressionList());

    // Act and Assert
    assertSame(operatorTest, nopVisitor.visit(operatorTest, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit36() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act and Assert
    assertSame(listLiteral, nopVisitor.visit(listLiteral, context));
  }

  @Test
  public void testVisit37() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);

    // Act and Assert
    assertSame(namedParameters, nopVisitor.visit(namedParameters, context));
  }

  @Test
  public void testVisit38() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(rangeIteratorDomain, nopVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit39() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Disjunction disjunction = new Disjunction(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(disjunction, nopVisitor.visit(disjunction, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit4() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());

    // Act and Assert
    assertSame(logicNegation, nopVisitor.visit(logicNegation, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit40() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation functionInvocation = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act and Assert
    assertSame(functionInvocation, nopVisitor.visit(functionInvocation, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit41() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<ContextEntry> contextEntryList = new ArrayList<ContextEntry>();
    contextEntryList.add(new ContextEntry(null, new ExpressionList()));
    FEELContext context = FEELContext.makeContext(null);
    Context context1 = new Context(contextEntryList);

    // Act and Assert
    assertSame(context1, nopVisitor.visit(context1, context));
  }

  @Test
  public void testVisit42() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);
    FEELContext params = FEELContext.makeContext(null);
    FunctionTypeExpression functionTypeExpression = new FunctionTypeExpression(typeExpressionList, namedTypeExpression);

    // Act and Assert
    assertSame(functionTypeExpression, nopVisitor.visit(functionTypeExpression, params));
  }

  @Test
  public void testVisit43() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));
    ForExpression forExpression = new ForExpression(iteratorList, new ExpressionList());

    // Act and Assert
    assertSame(forExpression, nopVisitor.visit(forExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit44() {
    // Arrange
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertNull((new NopVisitor()).visit((ContextEntryKey) null, context));
  }

  @Test
  public void testVisit45() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FEELContext context = FEELContext.makeContext(null);
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, nopVisitor.visit(expressionList, context));
  }

  @Test
  public void testVisit46() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));
    FEELContext context = FEELContext.makeContext(null);
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(simplePositiveUnaryTestList);

    // Act and Assert
    assertSame(simplePositiveUnaryTests, nopVisitor.visit(simplePositiveUnaryTests, context));
  }

  @Test
  public void testVisit47() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListTest listTest = new ListTest(new ListLiteral(expressionList));

    // Act and Assert
    assertSame(listTest, nopVisitor.visit(listTest, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit48() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act and Assert
    assertSame(iterator, nopVisitor.visit(iterator, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit49() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");

    // Act and Assert
    assertSame(pathExpression, nopVisitor.visit(pathExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit5() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression instanceOfExpression = new InstanceOfExpression(new ExpressionList(), rightOperand);

    // Act and Assert
    assertSame(instanceOfExpression, nopVisitor.visit(instanceOfExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit50() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ListTest param0 = new ListTest(null);
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(param0);
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(simplePositiveUnaryTestList));

    // Act and Assert
    assertSame(negatedSimplePositiveUnaryTests,
        nopVisitor.visit(negatedSimplePositiveUnaryTests, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit6() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    FunctionDefinition functionDefinition = new FunctionDefinition(formalParameterList, new ExpressionList(), true);

    // Act and Assert
    assertSame(functionDefinition, nopVisitor.visit(functionDefinition, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit7() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");

    // Act and Assert
    assertSame(dateTimeLiteral, nopVisitor.visit(dateTimeLiteral, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit8() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    NumericLiteral numericLiteral = new NumericLiteral("value");

    // Act and Assert
    assertSame(numericLiteral, nopVisitor.visit(numericLiteral, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit9() {
    // Arrange
    NopVisitor nopVisitor = new NopVisitor();
    FilterExpression filterExpression = new FilterExpression(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(filterExpression, nopVisitor.visit(filterExpression, FEELContext.makeContext(null)));
  }
}

