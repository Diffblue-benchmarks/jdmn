package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.InExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Parameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.DateTimeLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.ForExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.QuantifiedExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ContextTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.FunctionTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimpleUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.UnaryTests;
import com.gs.dmn.runtime.DMNRuntimeException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ASTFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void toDateTimeLiteralTest2() {
    // Arrange and Act
    Expression actualToDateTimeLiteralResult = (new ASTFactory()).toDateTimeLiteral("foo", "foo");

    // Assert
    Type type = actualToDateTimeLiteralResult.getType();
    String actualLexeme = ((DateTimeLiteral) actualToDateTimeLiteralResult).getLexeme();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", ((DateTimeLiteral) actualToDateTimeLiteralResult).getConversionFunction());
    assertEquals("foo", actualLexeme);
  }

  @Test(timeout=10000)
  public void toFunctionTypeExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act
    TypeExpression actualToFunctionTypeExpressionResult = astFactory.toFunctionTypeExpression(null,
        namedTypeExpression);

    // Assert
    Type type = actualToFunctionTypeExpressionResult.getType();
    TypeExpression actualReturnType = ((FunctionTypeExpression) actualToFunctionTypeExpressionResult).getReturnType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((FunctionTypeExpression) actualToFunctionTypeExpressionResult).getParameters());
    assertSame(namedTypeExpression, actualReturnType);
  }

  @Test(timeout=10000)
  public void toExponentiationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList leftOperand = new ExpressionList();

    // Act
    Expression actualToExponentiationResult = astFactory.toExponentiation(leftOperand, new ExpressionList());

    // Assert
    Type type = actualToExponentiationResult.getType();
    String actualToStringResult = actualToExponentiationResult.toString();
    assertEquals("**", ((Exponentiation) actualToExponentiationResult).getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toListTestTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    ListTest actualToListTestResult = astFactory.toListTest(new ListLiteral(null));

    // Assert
    Type type = actualToListTestResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTest(ListLiteral())", actualToListTestResult.toString());
  }

  @Test(timeout=10000)
  public void toExpressionTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    ExpressionTest actualToExpressionTestResult = astFactory.toExpressionTest(new ExpressionList());

    // Assert
    Type type = actualToExpressionTestResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualToExpressionTestResult.toString());
  }

  @Test(timeout=10000)
  public void toDateTimeLiteralTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToDateTimeLiteralResult = astFactory.toDateTimeLiteral("foo", new ExpressionList());

    // Assert
    Expression function = ((FunctionInvocation) actualToDateTimeLiteralResult).getFunction();
    Type type = actualToDateTimeLiteralResult.getType();
    String actualToStringResult = actualToDateTimeLiteralResult.toString();
    Parameters parameters = ((FunctionInvocation) actualToDateTimeLiteralResult).getParameters();
    Type actualType = function.getType();
    String actualToStringResult1 = function.toString();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(Name(foo) -> PositionalParameters" + "(ExpressionList()))", actualToStringResult);
    assertFalse(parameters.isEmpty());
    assertEquals("Name(foo)", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void toComparisonTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList leftOperand = new ExpressionList();

    // Act
    Expression actualToComparisonResult = astFactory.toComparison("foo", leftOperand, new ExpressionList());

    // Assert
    Type type = actualToComparisonResult.getType();
    String actualToStringResult = actualToComparisonResult.toString();
    assertEquals("foo", ((Relational) actualToComparisonResult).getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(foo,ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toIteratorTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Iterator actualToIteratorResult = astFactory.toIterator("name", new ExpressionList());

    // Assert
    String actualName = actualToIteratorResult.getName();
    String actualToStringResult = actualToIteratorResult.toString();
    assertEquals("name", actualName);
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualToStringResult);
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualToIteratorResult.getDomain().toString());
  }

  @Test(timeout=10000)
  public void toBooleanLiteralTest() {
    // Arrange and Act
    BooleanLiteral actualToBooleanLiteralResult = (new ASTFactory()).toBooleanLiteral("foo");

    // Assert
    Type type = actualToBooleanLiteralResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", actualToBooleanLiteralResult.getLexeme());
  }

  @Test(timeout=10000)
  public void toContextTest() {
    // Arrange and Act
    Expression actualToContextResult = (new ASTFactory()).toContext(null);

    // Assert
    Type type = actualToContextResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Context()", actualToContextResult.toString());
  }

  @Test(timeout=10000)
  public void toListTestTest() {
    // Arrange and Act
    ListTest actualToListTestResult = (new ASTFactory()).toListTest((List<Expression>) null);

    // Assert
    Type type = actualToListTestResult.getType();
    String actualToStringResult = actualToListTestResult.toString();
    ListLiteral listLiteral = actualToListTestResult.getListLiteral();
    assertTrue(type instanceof AnyType);
    Type actualType = listLiteral.getType();
    assertEquals("ListTest(ListLiteral())", actualToStringResult);
    assertEquals("ListLiteral()", listLiteral.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void toFunctionDefinitionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList expressionList = new ExpressionList();

    // Act
    Expression actualToFunctionDefinitionResult = astFactory.toFunctionDefinition(null, expressionList, true);

    // Assert
    Type type = actualToFunctionDefinitionResult.getType();
    Expression actualBody = ((FunctionDefinition) actualToFunctionDefinitionResult).getBody();
    boolean actualIsExternalResult = ((FunctionDefinition) actualToFunctionDefinitionResult).isExternal();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((FunctionDefinition) actualToFunctionDefinitionResult).getFormalParameters());
    assertTrue(actualIsExternalResult);
    assertSame(expressionList, actualBody);
  }

  @Test(timeout=10000)
  public void toContextEntryTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ContextEntryKey key = new ContextEntryKey("foo");

    // Act and Assert
    assertEquals("ContextEntry(ContextEntryKey(foo) =" + " ExpressionList())",
        astFactory.toContextEntry(key, new ExpressionList()).toString());
  }

  @Test(timeout=10000)
  public void toNamedParametersTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toNamedParameters(null).isEmpty());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ASTFactory actualAstFactory = new ASTFactory();

    // Assert
    Expression toNullLiteralResult = actualAstFactory.toNullLiteral();
    assertTrue(toNullLiteralResult instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral);
    assertTrue(actualAstFactory.toAny() instanceof com.gs.dmn.feel.analysis.syntax.ast.test.Any);
  }

  @Test(timeout=10000)
  public void toFilterExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList value = new ExpressionList();

    // Act
    Expression actualToFilterExpressionResult = astFactory.toFilterExpression(value, new ExpressionList());

    // Assert
    Type type = actualToFilterExpressionResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())",
        actualToFilterExpressionResult.toString());
  }

  @Test(timeout=10000)
  public void toNumericLiteralTest() {
    // Arrange and Act
    NumericLiteral actualToNumericLiteralResult = (new ASTFactory()).toNumericLiteral("foo");

    // Assert
    Type type = actualToNumericLiteralResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", actualToNumericLiteralResult.getLexeme());
  }

  @Test(timeout=10000)
  public void toFunctionInvocationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList function = new ExpressionList();

    // Act
    Expression actualToFunctionInvocationResult = astFactory.toFunctionInvocation(function, new NamedParameters(null));

    // Assert
    Type type = actualToFunctionInvocationResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(ExpressionList() ->" + " NamedParameters())",
        actualToFunctionInvocationResult.toString());
  }

  @Test(timeout=10000)
  public void toQuantifiedExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList expressionList = new ExpressionList();

    // Act
    Expression actualToQuantifiedExpressionResult = astFactory.toQuantifiedExpression("foo", null, expressionList);

    // Assert
    Type type = actualToQuantifiedExpressionResult.getType();
    String actualPredicate = ((QuantifiedExpression) actualToQuantifiedExpressionResult).getPredicate();
    Expression actualBody = ((QuantifiedExpression) actualToQuantifiedExpressionResult).getBody();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((QuantifiedExpression) actualToQuantifiedExpressionResult).getIterators());
    assertSame(expressionList, actualBody);
    assertEquals("foo", actualPredicate);
  }

  @Test(timeout=10000)
  public void toQualifiedNameTest() {
    // Arrange and Act
    Expression actualToQualifiedNameResult = (new ASTFactory()).toQualifiedName("foo", "foo", "foo");

    // Assert
    Type type = actualToQualifiedNameResult.getType();
    String actualToStringResult = actualToQualifiedNameResult.toString();
    String actualMember = ((PathExpression) actualToQualifiedNameResult).getMember();
    Expression source = ((PathExpression) actualToQualifiedNameResult).getSource();
    assertTrue(type instanceof AnyType);
    Type actualType = source.getType();
    String actualPath = ((PathExpression) source).getPath();
    String actualMember1 = ((PathExpression) source).getMember();
    Expression source1 = ((PathExpression) source).getSource();
    assertEquals("PathExpression(PathExpression(Name(foo)," + " foo), foo)", actualToStringResult);
    assertEquals("foo", actualMember);
    assertEquals("foo", actualMember1);
    assertEquals("foo.foo", actualPath);
    assertSame(type, actualType);
    Type actualType1 = source1.getType();
    assertSame(type, actualType1);
    assertEquals("Name(foo)", source1.toString());
  }

  @Test(timeout=10000)
  public void toNameTest() {
    // Arrange and Act
    Expression actualToNameResult = (new ASTFactory()).toName("name");

    // Assert
    Type type = actualToNameResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualToNameResult.toString());
  }

  @Test(timeout=10000)
  public void toNullPositiveUnaryTestTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toNullPositiveUnaryTest()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringLiteralTest() {
    // Arrange and Act
    StringLiteral actualToStringLiteralResult = (new ASTFactory()).toStringLiteral("foo");

    // Assert
    Type type = actualToStringLiteralResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", actualToStringLiteralResult.getLexeme());
  }

  @Test(timeout=10000)
  public void toDisjunctionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList left = new ExpressionList();

    // Act
    Expression actualToDisjunctionResult = astFactory.toDisjunction(left, new ExpressionList());

    // Assert
    Type type = actualToDisjunctionResult.getType();
    String actualToStringResult = actualToDisjunctionResult.toString();
    assertEquals("or", ((Disjunction) actualToDisjunctionResult).getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toIntervalTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    RangeTest actualToIntervalTestResult = astFactory.toIntervalTest("foo", new ExpressionList(), "foo",
        new ExpressionList());

    // Assert
    Type type = actualToIntervalTestResult.getType();
    String actualToStringResult = actualToIntervalTestResult.toString();
    boolean actualIsOpenStartResult = actualToIntervalTestResult.isOpenStart();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualToStringResult);
    assertTrue(actualIsOpenStartResult);
  }

  @Test(timeout=10000)
  public void toContextTypeExpressionTest() {
    // Arrange and Act
    TypeExpression actualToContextTypeExpressionResult = (new ASTFactory()).toContextTypeExpression(null);

    // Assert
    Type type = actualToContextTypeExpressionResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((ContextTypeExpression) actualToContextTypeExpressionResult).getMembers());
  }

  @Test(timeout=10000)
  public void toNullLiteralTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toNullLiteral().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toForExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList expressionList = new ExpressionList();

    // Act
    Expression actualToForExpressionResult = astFactory.toForExpression(null, expressionList);

    // Assert
    Type type = actualToForExpressionResult.getType();
    Expression actualBody = ((ForExpression) actualToForExpressionResult).getBody();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((ForExpression) actualToForExpressionResult).getIterators());
    assertSame(expressionList, actualBody);
  }

  @Test(timeout=10000)
  public void toPositiveUnaryTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    PositiveUnaryTest actualToPositiveUnaryTestResult = astFactory.toPositiveUnaryTest(new ExpressionList());

    // Assert
    Type type = actualToPositiveUnaryTestResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualToPositiveUnaryTestResult.toString());
  }

  @Test(timeout=10000)
  public void toMultiplicationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList leftOperand = new ExpressionList();

    // Act
    Expression actualToMultiplicationResult = astFactory.toMultiplication("foo", leftOperand, new ExpressionList());

    // Assert
    Type type = actualToMultiplicationResult.getType();
    String actualToStringResult = actualToMultiplicationResult.toString();
    assertEquals("foo", ((Multiplication) actualToMultiplicationResult).getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(foo,ExpressionList(),ExpressionList" + "())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toPathExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToPathExpressionResult = astFactory.toPathExpression(new ExpressionList(), "foo");

    // Assert
    Type type = actualToPathExpressionResult.getType();
    String actualToStringResult = actualToPathExpressionResult.toString();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(ExpressionList(), foo)", actualToStringResult);
    assertEquals("foo", ((PathExpression) actualToPathExpressionResult).getMember());
  }

  @Test(timeout=10000)
  public void toNegatedUnaryTestsTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    UnaryTests actualToNegatedUnaryTestsResult = astFactory.toNegatedUnaryTests(new PositiveUnaryTests(null));

    // Assert
    Type type = actualToNegatedUnaryTestsResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedUnaryTests(PositiveUnaryTests())", actualToNegatedUnaryTestsResult.toString());
  }

  @Test(timeout=10000)
  public void toAnyTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toAny().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toFormalParameterTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");

    // Act
    FormalParameter actualToFormalParameterResult = astFactory.toFormalParameter("name", namedTypeExpression);

    // Assert
    String actualName = actualToFormalParameterResult.getName();
    assertSame(namedTypeExpression, actualToFormalParameterResult.getTypeExpression());
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void toInExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList value = new ExpressionList();

    // Act
    Expression actualToInExpressionResult = astFactory.toInExpression(value, new ExpressionList());

    // Assert
    Type type = actualToInExpressionResult.getType();
    String actualToStringResult = actualToInExpressionResult.toString();
    PositiveUnaryTest getResult = ((InExpression) actualToInExpressionResult).getTests().get(0);
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(null" + ",ExpressionList()))", actualToStringResult);
    Type actualType = getResult.getType();
    String actualToStringResult1 = getResult.toString();
    assertNull(((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(null,ExpressionList())", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void toIteratorDomainTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        astFactory.toIteratorDomain(start, new ExpressionList()).toString());
  }

  @Test(timeout=10000)
  public void toBetweenExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();

    // Act
    Expression actualToBetweenExpressionResult = astFactory.toBetweenExpression(value, leftEndpoint,
        new ExpressionList());

    // Assert
    Type type = actualToBetweenExpressionResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualToBetweenExpressionResult.toString());
  }

  @Test(timeout=10000)
  public void toIteratorTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Iterator actualToIteratorResult = astFactory.toIterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Assert
    String actualName = actualToIteratorResult.getName();
    assertEquals("name", actualName);
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))",
        actualToIteratorResult.toString());
  }

  @Test(timeout=10000)
  public void toPositionalParametersTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toPositionalParameters(null).isEmpty());
  }

  @Test(timeout=10000)
  public void toOperatorTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    OperatorTest actualToOperatorTestResult = astFactory.toOperatorTest("foo", new ExpressionList());

    // Assert
    Type type = actualToOperatorTestResult.getType();
    String actualToStringResult = actualToOperatorTestResult.toString();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", actualToOperatorTestResult.getOperator());
    assertEquals("OperatorTest(foo,ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toContextEntryKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ASTFactory()).toContextEntryKey("foo").getKey());
  }

  @Test(timeout=10000)
  public void toListTypeExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    TypeExpression actualToListTypeExpressionResult = astFactory.toListTypeExpression(new NamedTypeExpression("name"));

    // Assert
    Type type = actualToListTypeExpressionResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression(name))", actualToListTypeExpressionResult.toString());
  }

  @Test(timeout=10000)
  public void toListLiteralTest() {
    // Arrange and Act
    Expression actualToListLiteralResult = (new ASTFactory()).toListLiteral(null);

    // Assert
    Type type = actualToListLiteralResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualToListLiteralResult.toString());
  }

  @Test(timeout=10000)
  public void toConjunctionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList left = new ExpressionList();

    // Act
    Expression actualToConjunctionResult = astFactory.toConjunction(left, new ExpressionList());

    // Assert
    Type type = actualToConjunctionResult.getType();
    String actualToStringResult = actualToConjunctionResult.toString();
    assertEquals("and", ((Conjunction) actualToConjunctionResult).getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toAdditionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList leftOperand = new ExpressionList();

    // Act
    Expression actualToAdditionResult = astFactory.toAddition("foo", leftOperand, new ExpressionList());

    // Assert
    Type type = actualToAdditionResult.getType();
    String actualToStringResult = actualToAdditionResult.toString();
    assertEquals("foo", ((Addition) actualToAdditionResult).getOperator());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(foo,ExpressionList(),ExpressionList())", actualToStringResult);
  }

  @Test(timeout=10000)
  public void toNegationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    astFactory.toNegation("foo", new ExpressionList());
  }

  @Test(timeout=10000)
  public void toNamedTypeExpressionTest2() {
    // Arrange and Act
    TypeExpression actualToNamedTypeExpressionResult = (new ASTFactory()).toNamedTypeExpression("name");

    // Assert
    String actualQualifiedName = ((NamedTypeExpression) actualToNamedTypeExpressionResult).getQualifiedName();
    assertEquals("name", actualQualifiedName);
    assertTrue(actualToNamedTypeExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toIfExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();

    // Act
    IfExpression actualToIfExpressionResult = astFactory.toIfExpression(condition, thenExpression,
        new ExpressionList());

    // Assert
    Type type = actualToIfExpressionResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualToIfExpressionResult.toString());
  }

  @Test(timeout=10000)
  public void toNamedTypeExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    astFactory.toNamedTypeExpression(new ExpressionList());
  }

  @Test(timeout=10000)
  public void toInstanceOfTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList expression = new ExpressionList();

    // Act
    Expression actualToInstanceOfResult = astFactory.toInstanceOf(expression, new NamedTypeExpression("name"));

    // Assert
    Type type = actualToInstanceOfResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(name))",
        actualToInstanceOfResult.toString());
  }

  @Test(timeout=10000)
  public void toNegatedSimpleUnaryTestsTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    SimpleUnaryTests actualToNegatedSimpleUnaryTestsResult = astFactory
        .toNegatedSimpleUnaryTests(new SimplePositiveUnaryTests(null));

    // Assert
    Type type = actualToNegatedSimpleUnaryTestsResult.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())",
        actualToNegatedSimpleUnaryTestsResult.toString());
  }
}

