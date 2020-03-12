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
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.InExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.DateTimeLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.LogicNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.QuantifiedExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimpleUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.UnaryTests;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.runtime.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ASTFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange and Act
    ASTFactory actualAstFactory = new ASTFactory();

    // Assert
    assertTrue(
        actualAstFactory.toNullLiteral() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral);
    assertTrue(actualAstFactory.toAny() instanceof com.gs.dmn.feel.analysis.syntax.ast.test.Any);
  }

  @Test
  public void toAdditionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToAdditionResult = astFactory.toAddition("-", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("-", ((Addition) actualToAdditionResult).getOperator());
    assertTrue(actualToAdditionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(-,ExpressionList(),ExpressionList())", actualToAdditionResult.toString());
  }

  @Test
  public void toAnyTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toAny().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toBetweenExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToBetweenExpressionResult = astFactory.toBetweenExpression(new ExpressionList(),
        new ExpressionList(), new ExpressionList());

    // Assert
    assertTrue(actualToBetweenExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualToBetweenExpressionResult.toString());
  }

  @Test
  public void toBooleanLiteralTest() {
    // Arrange and Act
    BooleanLiteral actualToBooleanLiteralResult = (new ASTFactory()).toBooleanLiteral("-");

    // Assert
    assertTrue(actualToBooleanLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("-", actualToBooleanLiteralResult.getLexeme());
  }

  @Test
  public void toComparisonTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToComparisonResult = astFactory.toComparison("-", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("-", ((Relational) actualToComparisonResult).getOperator());
    assertTrue(actualToComparisonResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(-,ExpressionList(),ExpressionList())", actualToComparisonResult.toString());
  }

  @Test
  public void toConjunctionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToConjunctionResult = astFactory.toConjunction(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("and", ((Conjunction) actualToConjunctionResult).getOperator());
    assertTrue(actualToConjunctionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualToConjunctionResult.toString());
  }

  @Test
  public void toContextEntryKeyTest() {
    // Arrange, Act and Assert
    assertEquals("-", (new ASTFactory()).toContextEntryKey("-").getKey());
  }

  @Test
  public void toContextTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<ContextEntry> contextEntryList = new ArrayList<ContextEntry>();
    contextEntryList.add(new ContextEntry(null, new ExpressionList()));

    // Act and Assert
    assertTrue(
        astFactory.toContext(contextEntryList).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toContextTypeExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));

    // Act
    TypeExpression actualToContextTypeExpressionResult = astFactory.toContextTypeExpression(pairList);

    // Assert
    assertTrue(
        actualToContextTypeExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))",
        actualToContextTypeExpressionResult.toString());
  }

  @Test
  public void toDateTimeLiteralTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToDateTimeLiteralResult = astFactory.toDateTimeLiteral("-", new ExpressionList());

    // Assert
    Expression function = ((FunctionInvocation) actualToDateTimeLiteralResult).getFunction();
    String actualToStringResult = function.toString();
    boolean actualIsEmptyResult = ((FunctionInvocation) actualToDateTimeLiteralResult).getParameters().isEmpty();
    Type type = actualToDateTimeLiteralResult.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(Name(-) -> PositionalParameters" + "(ExpressionList()))",
        actualToDateTimeLiteralResult.toString());
    assertFalse(actualIsEmptyResult);
    assertEquals("Name(-)", actualToStringResult);
    assertSame(type, function.getType());
  }

  @Test
  public void toDateTimeLiteralTest2() {
    // Arrange and Act
    Expression actualToDateTimeLiteralResult = (new ASTFactory()).toDateTimeLiteral("-", "-");

    // Assert
    String actualConversionFunction = ((DateTimeLiteral) actualToDateTimeLiteralResult).getConversionFunction();
    assertTrue(actualToDateTimeLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("-", actualConversionFunction);
    assertEquals("-", ((DateTimeLiteral) actualToDateTimeLiteralResult).getLexeme());
  }

  @Test
  public void toDisjunctionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToDisjunctionResult = astFactory.toDisjunction(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("or", ((Disjunction) actualToDisjunctionResult).getOperator());
    assertTrue(actualToDisjunctionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualToDisjunctionResult.toString());
  }

  @Test
  public void toExponentiationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToExponentiationResult = astFactory.toExponentiation(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("**", ((Exponentiation) actualToExponentiationResult).getOperator());
    assertTrue(actualToExponentiationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualToExponentiationResult.toString());
  }

  @Test
  public void toExpressionListTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    ExpressionList expressionList1 = new ExpressionList();
    expressionList.add(expressionList1);

    // Act and Assert
    assertSame(expressionList1, astFactory.toExpressionList(expressionList));
  }

  @Test
  public void toExpressionTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    ExpressionTest actualToExpressionTestResult = astFactory.toExpressionTest(new ExpressionList());

    // Assert
    assertTrue(actualToExpressionTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualToExpressionTestResult.toString());
  }

  @Test
  public void toFilterExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToFilterExpressionResult = astFactory.toFilterExpression(new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualToFilterExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())",
        actualToFilterExpressionResult.toString());
  }

  @Test
  public void toForExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    ExpressionList expressionList = new ExpressionList();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(expressionList)));

    // Act
    Expression actualToForExpressionResult = astFactory.toForExpression(iteratorList, expressionList);

    // Assert
    assertTrue(actualToForExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ForExpression(Iterator(name in ExpressionIteratorDomain" + "(ExpressionList())) -> ExpressionList())",
        actualToForExpressionResult.toString());
  }

  @Test
  public void toFormalParameterTest() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Act
    FormalParameter actualToFormalParameterResult = (new ASTFactory()).toFormalParameter("-", namedTypeExpression);

    // Assert
    assertSame(namedTypeExpression, actualToFormalParameterResult.getTypeExpression());
    assertEquals("-", actualToFormalParameterResult.getName());
  }

  @Test
  public void toFunctionDefinitionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act
    Expression actualToFunctionDefinitionResult = astFactory.toFunctionDefinition(formalParameterList,
        new ExpressionList(), true);

    // Assert
    boolean actualIsExternalResult = ((FunctionDefinition) actualToFunctionDefinitionResult).isExternal();
    AnyType expectedType = anyType.ANY;
    assertSame(expectedType, actualToFunctionDefinitionResult.getType());
    assertEquals("FunctionDefinition(FormalParameter(name, Any)," + " ExpressionList(), true)",
        actualToFunctionDefinitionResult.toString());
    assertTrue(actualIsExternalResult);
  }

  @Test
  public void toFunctionInvocationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act
    Expression actualToFunctionInvocationResult = astFactory.toFunctionInvocation(function,
        new NamedParameters(stringExpressionMap));

    // Assert
    assertTrue(actualToFunctionInvocationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(ExpressionList() -> NamedParameters(foo" + " : ExpressionList()))",
        actualToFunctionInvocationResult.toString());
  }

  @Test
  public void toFunctionTypeExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);

    // Act
    TypeExpression actualToFunctionTypeExpressionResult = astFactory.toFunctionTypeExpression(typeExpressionList,
        namedTypeExpression);

    // Assert
    assertTrue(
        actualToFunctionTypeExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName)" + " -> NamedTypeExpression(qualifiedName))",
        actualToFunctionTypeExpressionResult.toString());
  }

  @Test
  public void toIfExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    IfExpression actualToIfExpressionResult = astFactory.toIfExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualToIfExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualToIfExpressionResult.toString());
  }

  @Test
  public void toInExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToInExpressionResult = astFactory.toInExpression(new ExpressionList(), new ExpressionList());

    // Assert
    PositiveUnaryTest getResult = ((InExpression) actualToInExpressionResult).getTests().get(0);
    Type type = actualToInExpressionResult.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(null" + ",ExpressionList()))",
        actualToInExpressionResult.toString());
    assertNull(((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(null,ExpressionList())", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void toInstanceOfTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    NamedTypeExpression typeExpresion = new NamedTypeExpression("qualifiedName");

    // Act
    Expression actualToInstanceOfResult = astFactory.toInstanceOf(new ExpressionList(), typeExpresion);

    // Assert
    assertTrue(actualToInstanceOfResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(qualifiedName))",
        actualToInstanceOfResult.toString());
  }

  @Test
  public void toIntervalTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    RangeTest actualToIntervalTestResult = astFactory.toIntervalTest("-", new ExpressionList(), "-",
        new ExpressionList());

    // Assert
    assertTrue(actualToIntervalTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())",
        actualToIntervalTestResult.toString());
    assertTrue(actualToIntervalTestResult.isOpenStart());
  }

  @Test
  public void toIntervalTestTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    RangeTest actualToIntervalTestResult = astFactory.toIntervalTest("-", new ExpressionList(), "]",
        new ExpressionList());

    // Assert
    assertTrue(actualToIntervalTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),false,ExpressionList" + "())",
        actualToIntervalTestResult.toString());
    assertTrue(actualToIntervalTestResult.isOpenStart());
  }

  @Test
  public void toIntervalTestTest3() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    RangeTest actualToIntervalTestResult = astFactory.toIntervalTest("[", new ExpressionList(), "-",
        new ExpressionList());

    // Assert
    assertTrue(actualToIntervalTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(false,ExpressionList(),true,ExpressionList" + "())",
        actualToIntervalTestResult.toString());
    assertFalse(actualToIntervalTestResult.isOpenStart());
  }

  @Test
  public void toIteratorDomainTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        astFactory.toIteratorDomain(new ExpressionList(), new ExpressionList()).toString());
  }

  @Test
  public void toIteratorTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Iterator actualToIteratorResult = astFactory.toIterator("-", new ExpressionIteratorDomain(new ExpressionList()));

    // Assert
    assertEquals("-", actualToIteratorResult.getName());
    assertEquals("Iterator(- in ExpressionIteratorDomain(ExpressionList" + "()))", actualToIteratorResult.toString());
  }

  @Test
  public void toIteratorTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Iterator actualToIteratorResult = astFactory.toIterator("-", new ExpressionList());

    // Assert
    assertEquals("-", actualToIteratorResult.getName());
    assertEquals("Iterator(- in ExpressionIteratorDomain(ExpressionList" + "()))", actualToIteratorResult.toString());
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualToIteratorResult.getDomain().toString());
  }

  @Test
  public void toListLiteralTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    Expression actualToListLiteralResult = astFactory.toListLiteral(expressionList);

    // Assert
    assertTrue(actualToListLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral(ExpressionList())", actualToListLiteralResult.toString());
  }

  @Test
  public void toListTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ListTest actualToListTestResult = astFactory.toListTest(expressionList);

    // Assert
    Type type = actualToListTestResult.getType();
    assertTrue(type instanceof AnyType);
    ListLiteral listLiteral = actualToListTestResult.getListLiteral();
    String actualToStringResult = listLiteral.toString();
    assertEquals("ListTest(ListLiteral(ExpressionList()))", actualToListTestResult.toString());
    assertEquals("ListLiteral(ExpressionList())", actualToStringResult);
    assertSame(type, listLiteral.getType());
  }

  @Test
  public void toListTestTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ListTest actualToListTestResult = astFactory.toListTest(new ListLiteral(expressionList));

    // Assert
    assertTrue(actualToListTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTest(ListLiteral(ExpressionList()))", actualToListTestResult.toString());
  }

  @Test
  public void toListTypeExpressionTest() {
    // Arrange
    NamedTypeExpression elementType = new NamedTypeExpression("qualifiedName");

    // Act
    TypeExpression actualToListTypeExpressionResult = (new ASTFactory()).toListTypeExpression(elementType);

    // Assert
    assertTrue(actualToListTypeExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))",
        actualToListTypeExpressionResult.toString());
  }

  @Test
  public void toMultiplicationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToMultiplicationResult = astFactory.toMultiplication("-", new ExpressionList(),
        new ExpressionList());

    // Assert
    assertEquals("-", ((Multiplication) actualToMultiplicationResult).getOperator());
    assertTrue(actualToMultiplicationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(-,ExpressionList(),ExpressionList" + "())", actualToMultiplicationResult.toString());
  }

  @Test
  public void toNameTest() {
    // Arrange and Act
    Expression actualToNameResult = (new ASTFactory()).toName("-");

    // Assert
    assertTrue(actualToNameResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(-)", actualToNameResult.toString());
  }

  @Test
  public void toNamedParametersTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertFalse(astFactory.toNamedParameters(stringExpressionMap).isEmpty());
  }

  @Test
  public void toNamedTypeExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    astFactory.toNamedTypeExpression(new ExpressionList());
  }

  @Test
  public void toNamedTypeExpressionTest2() {
    // Arrange and Act
    TypeExpression actualToNamedTypeExpressionResult = (new ASTFactory()).toNamedTypeExpression("-");

    // Assert
    assertEquals("-", ((NamedTypeExpression) actualToNamedTypeExpressionResult).getQualifiedName());
    assertTrue(actualToNamedTypeExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toNegatedSimpleUnaryTestsTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));

    // Act
    SimpleUnaryTests actualToNegatedSimpleUnaryTestsResult = astFactory
        .toNegatedSimpleUnaryTests(new SimplePositiveUnaryTests(simplePositiveUnaryTestList));

    // Assert
    assertTrue(
        actualToNegatedSimpleUnaryTestsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "(ListTest(ListLiteral())))",
        actualToNegatedSimpleUnaryTestsResult.toString());
  }

  @Test
  public void toNegatedUnaryTestsTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act
    UnaryTests actualToNegatedUnaryTestsResult = astFactory
        .toNegatedUnaryTests(new PositiveUnaryTests(positiveUnaryTestList));

    // Assert
    assertTrue(actualToNegatedUnaryTestsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))", actualToNegatedUnaryTestsResult.toString());
  }

  @Test
  public void toNegationTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToNegationResult = astFactory.toNegation("not", new ExpressionList());

    // Assert
    assertNull(((LogicNegation) actualToNegationResult).getRightOperand());
    assertEquals("not", ((LogicNegation) actualToNegationResult).getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualToNegationResult.toString());
    assertTrue(actualToNegationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toNegationTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToNegationResult = astFactory.toNegation("-", new ExpressionList());

    // Assert
    assertNull(((ArithmeticNegation) actualToNegationResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualToNegationResult).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualToNegationResult.toString());
    assertTrue(actualToNegationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toNegationTest3() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    astFactory.toNegation("[", new ExpressionList());
  }

  @Test
  public void toNegationTest4() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    astFactory.toNegation(stringList, new ExpressionList());
  }

  @Test
  public void toNullLiteralTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toNullLiteral().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toNullPositiveUnaryTestTest() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toNullPositiveUnaryTest()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void toNumericLiteralTest() {
    // Arrange and Act
    NumericLiteral actualToNumericLiteralResult = (new ASTFactory()).toNumericLiteral("-");

    // Assert
    assertTrue(actualToNumericLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("-", actualToNumericLiteralResult.getLexeme());
  }

  @Test
  public void toOperatorTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    OperatorTest actualToOperatorTestResult = astFactory.toOperatorTest("-", new ExpressionList());

    // Assert
    assertTrue(actualToOperatorTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("-", actualToOperatorTestResult.getOperator());
    assertEquals("OperatorTest(-,ExpressionList())", actualToOperatorTestResult.toString());
  }

  @Test
  public void toPathExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToPathExpressionResult = astFactory.toPathExpression(new ExpressionList(), "-");

    // Assert
    String actualMember = ((PathExpression) actualToPathExpressionResult).getMember();
    assertTrue(actualToPathExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(ExpressionList(), -)", actualToPathExpressionResult.toString());
    assertEquals("-", actualMember);
  }

  @Test
  public void toPathExpressionTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    Expression actualToPathExpressionResult = astFactory.toPathExpression(stringList);

    // Assert
    assertTrue(actualToPathExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualToPathExpressionResult.toString());
  }

  @Test
  public void toPositionalParametersTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertFalse(astFactory.toPositionalParameters(expressionList).isEmpty());
  }

  @Test
  public void toPositiveUnaryTestTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    PositiveUnaryTest actualToPositiveUnaryTestResult = astFactory.toPositiveUnaryTest(new ExpressionList());

    // Assert
    assertTrue(actualToPositiveUnaryTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualToPositiveUnaryTestResult.toString());
  }

  @Test
  public void toPositiveUnaryTestsTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    PositiveUnaryTests actualToPositiveUnaryTestsResult = astFactory.toPositiveUnaryTests(expressionList);

    // Assert
    Type type = actualToPositiveUnaryTestsResult.getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTest getResult = actualToPositiveUnaryTestsResult.getPositiveUnaryTests().get(0);
    assertEquals("PositiveUnaryTests(ExpressionTest(ExpressionList" + "()))",
        actualToPositiveUnaryTestsResult.toString());
    assertEquals("ExpressionTest(ExpressionList())", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void toQualifiedNameTest() {
    // Arrange and Act
    Expression actualToQualifiedNameResult = (new ASTFactory()).toQualifiedName("foo", "foo", "foo");

    // Assert
    Expression source = ((PathExpression) actualToQualifiedNameResult).getSource();
    Type type = actualToQualifiedNameResult.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("PathExpression(PathExpression(Name(foo)," + " foo), foo)", actualToQualifiedNameResult.toString());
    assertEquals("foo", ((PathExpression) actualToQualifiedNameResult).getMember());
    assertEquals("foo", ((PathExpression) source).getMember());
    assertEquals("foo.foo", ((PathExpression) source).getPath());
    assertSame(type, source.getType());
    Expression source1 = ((PathExpression) source).getSource();
    assertSame(type, source1.getType());
    assertEquals("Name(foo)", source1.toString());
  }

  @Test
  public void toQualifiedNameTest2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    Expression actualToQualifiedNameResult = astFactory.toQualifiedName(stringList);

    // Assert
    assertTrue(actualToQualifiedNameResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualToQualifiedNameResult.toString());
  }

  @Test
  public void toQuantifiedExpressionTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    ExpressionList expressionList = new ExpressionList();
    iteratorList.add(new Iterator("-", new ExpressionIteratorDomain(expressionList)));

    // Act
    Expression actualToQuantifiedExpressionResult = astFactory.toQuantifiedExpression("-", iteratorList,
        expressionList);

    // Assert
    String actualPredicate = ((QuantifiedExpression) actualToQuantifiedExpressionResult).getPredicate();
    assertTrue(actualToQuantifiedExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("-", actualPredicate);
    assertEquals("QuantifiedExpression(-, Iterator(- in" + " ExpressionIteratorDomain(ExpressionList())) ->"
        + " ExpressionList())", actualToQuantifiedExpressionResult.toString());
  }

  @Test
  public void toSimplePositiveUnaryTestsTest() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    SimplePositiveUnaryTests actualToSimplePositiveUnaryTestsResult = astFactory
        .toSimplePositiveUnaryTests(expressionList);

    // Assert
    Type type = actualToSimplePositiveUnaryTestsResult.getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTest getResult = actualToSimplePositiveUnaryTestsResult.getSimplePositiveUnaryTests().get(0);
    assertEquals("SimplePositiveUnaryTests(OperatorTest(null,ExpressionList" + "()))",
        actualToSimplePositiveUnaryTestsResult.toString());
    String actualOperator = ((OperatorTest) getResult).getOperator();
    assertEquals("OperatorTest(null,ExpressionList())", getResult.toString());
    assertSame(type, getResult.getType());
    assertNull(actualOperator);
  }

  @Test
  public void toStringLiteralTest() {
    // Arrange and Act
    StringLiteral actualToStringLiteralResult = (new ASTFactory()).toStringLiteral("-");

    // Assert
    assertTrue(actualToStringLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("-", actualToStringLiteralResult.getLexeme());
  }
}

