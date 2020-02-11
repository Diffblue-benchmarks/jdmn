package com.gs.dmn.feel.analysis.syntax.ast;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.IteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Parameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.ASTFactory
 *
 * @author Diffblue JCover
 */

public class ASTFactoryTest {

    @Test(timeout=10000)
    public void isValid() {
        assertThat(new ASTFactory().toAny().getType().isValid(), is(true));
        assertThat(new ASTFactory().toContext(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry>()).getType().isValid(), is(true));
        assertThat(new ASTFactory().toContextTypeExpression(new ArrayList<com.gs.dmn.runtime.Pair<String, com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression>>()).getType().isValid(), is(true));
        assertThat(new ASTFactory().toDateTimeLiteral("1999-12-31", "1999-12-31").getType().isValid(), is(true));
        assertThat(new ASTFactory().toExpressionList(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.expression.Expression>()).getType().isValid(), is(true));
        assertThat(new ASTFactory().toListLiteral(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.expression.Expression>()).getType().isValid(), is(true));
        assertThat(new ASTFactory().toNamedTypeExpression("int").getType().isValid(), is(true));
        assertThat(new ASTFactory().toName("Smith").getType().isValid(), is(true));
        assertThat(new ASTFactory().toNegatedSimpleUnaryTests(new SimplePositiveUnaryTests(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTest>())).getType().isValid(), is(true));
        assertThat(new ASTFactory().toNegatedUnaryTests(new PositiveUnaryTests(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest>())).getType().isValid(), is(true));
        assertThat(new ASTFactory().toNullLiteral().getType().isValid(), is(true));
        assertThat(new ASTFactory().toNullPositiveUnaryTest().getType().isValid(), is(true));
        assertThat(new ASTFactory().toQualifiedName(new String[] { "Smith" }).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toAddition() {
        Expression leftOperand = mock(Expression.class);
        Expression rightOperand = mock(Expression.class);
        assertThat(new ASTFactory().toAddition("+", leftOperand, rightOperand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toBetweenExpression() {
        Expression value = mock(Expression.class);
        Expression leftEndpoint = mock(Expression.class);
        Expression rightEndpoint = mock(Expression.class);
        assertThat(new ASTFactory().toBetweenExpression(value, leftEndpoint, rightEndpoint).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toBooleanLiteralLexemeIsSmith() {
        BooleanLiteral result = new ASTFactory().toBooleanLiteral("Smith");
        assertThat(result.getLexeme(), is("Smith"));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toComparison() {
        Expression leftOperand = mock(Expression.class);
        Expression rightOperand = mock(Expression.class);
        assertThat(new ASTFactory().toComparison("+", leftOperand, rightOperand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toConjunction() {
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        assertThat(new ASTFactory().toConjunction(left, right).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toContextEntry() {
        ContextEntryKey key = new ContextEntryKey("Smith");
        Expression expression = mock(Expression.class);
        ContextEntry result = new ASTFactory().toContextEntry(key, expression);
        assertThat(result.getExpression(), sameInstance(expression));
        assertThat(result.getKey(), sameInstance(key));
    }

    @Test(timeout=10000)
    public void toContextEntryKeyTextIsHtml() {
        assertThat(new ASTFactory().toContextEntryKey("html").getKey(), is("html"));
    }

    @Test(timeout=10000)
    public void toDateTimeLiteralKindIsBar() {
        Expression stringLiteral = mock(Expression.class);
        assertThat(new ASTFactory().toDateTimeLiteral("bar", stringLiteral).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toDisjunction() {
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        assertThat(new ASTFactory().toDisjunction(left, right).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toExponentiation() {
        Expression leftOperand = mock(Expression.class);
        Expression rightOperand = mock(Expression.class);
        assertThat(new ASTFactory().toExponentiation(leftOperand, rightOperand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toExpressionList() {
        List<Expression> expressionList = new ArrayList<Expression>();
        Expression expression = mock(Expression.class);
        ((ArrayList<Expression>)expressionList).add(expression);
        assertThat(new ASTFactory().toExpressionList(expressionList), sameInstance(expression));
    }

    @Test(timeout=10000)
    public void toExpressionTest() {
        Expression expression = mock(Expression.class);
        ExpressionTest result = new ASTFactory().toExpressionTest(expression);
        assertThat(result.getExpression(), sameInstance(expression));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toFilterExpression() {
        Expression value = mock(Expression.class);
        Expression filter = mock(Expression.class);
        assertThat(new ASTFactory().toFilterExpression(value, filter).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toForExpressionIteratorsIsEmpty() {
        Expression body = mock(Expression.class);
        assertThat(new ASTFactory().toForExpression(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator>(), body).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toFormalParameterParameterNameIsName() {
        TypeExpression typeExpression = mock(TypeExpression.class);
        FormalParameter result = new ASTFactory().toFormalParameter("name", typeExpression);
        assertThat(result.getName(), is("name"));
        assertThat(result.getType(), is(nullValue()));
        assertThat(result.getTypeExpression(), sameInstance(typeExpression));
    }

    @Test(timeout=10000)
    public void toFunctionDefinitionExternalIsFalseAndFormalParametersIsEmpty() {
        Expression body = mock(Expression.class);
        assertThat(new ASTFactory().toFunctionDefinition(new ArrayList<FormalParameter>(), body, false).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toFunctionInvocation() {
        Expression function = mock(Expression.class);
        Parameters parameters = mock(Parameters.class);
        assertThat(new ASTFactory().toFunctionInvocation(function, parameters).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toFunctionTypeExpressionParametersIsEmpty() {
        TypeExpression returnType = mock(TypeExpression.class);
        assertThat(new ASTFactory().toFunctionTypeExpression(new ArrayList<TypeExpression>(), returnType).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toIfExpression() {
        Expression condition = mock(Expression.class);
        Expression thenExpression = mock(Expression.class);
        Expression elseExpression = mock(Expression.class);
        IfExpression result = new ASTFactory().toIfExpression(condition, thenExpression, elseExpression);
        assertThat(result.getCondition(), sameInstance(condition));
        assertThat(result.getElseExpression(), sameInstance(elseExpression));
        assertThat(result.getThenExpression(), sameInstance(thenExpression));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toInExpression() {
        Expression value = mock(Expression.class);
        Expression expression = mock(Expression.class);
        assertThat(new ASTFactory().toInExpression(value, expression).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toInstanceOf() {
        Expression expression = mock(Expression.class);
        TypeExpression typeExpresion = mock(TypeExpression.class);
        assertThat(new ASTFactory().toInstanceOf(expression, typeExpresion).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toIntervalTest() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        RangeTest result = new ASTFactory().toIntervalTest("[", start, "Smith", end);
        assertThat(result.getEnd(), sameInstance(end));
        assertThat(result.getStart(), sameInstance(start));
        assertThat(result.isOpenEnd(), is(true));
        assertThat(result.isOpenStart(), is(false));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toIntervalTestLeftParIsBar() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        RangeTest result = new ASTFactory().toIntervalTest("bar", start, "Smith", end);
        assertThat(result.getEnd(), sameInstance(end));
        assertThat(result.getStart(), sameInstance(start));
        assertThat(result.isOpenEnd(), is(true));
        assertThat(result.isOpenStart(), is(true));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toIntervalTestLeftParIsSmith() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        RangeTest result = new ASTFactory().toIntervalTest("Smith", start, "]", end);
        assertThat(result.getEnd(), sameInstance(end));
        assertThat(result.getStart(), sameInstance(start));
        assertThat(result.isOpenEnd(), is(false));
        assertThat(result.isOpenStart(), is(true));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toIterator1() {
        Expression domain = mock(Expression.class);
        Iterator result = new ASTFactory().toIterator("Smith", domain);
        assertThat(result.getDomain().getType(), is(nullValue()));
        assertThat(result.getName(), is("Smith"));
    }

    @Test(timeout=10000)
    public void toIterator2() {
        IteratorDomain domain = mock(IteratorDomain.class);
        Iterator result = new ASTFactory().toIterator("Smith", domain);
        assertThat(result.getDomain(), sameInstance(domain));
        assertThat(result.getName(), is("Smith"));
    }

    @Test(timeout=10000)
    public void toIteratorDomain() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        assertThat(new ASTFactory().toIteratorDomain(start, end).getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void toListTest() {
        ListLiteral expression2 = new ListLiteral(new ArrayList<Expression>());
        ListTest result = new ASTFactory().toListTest(expression2);
        assertThat(result.getListLiteral(), sameInstance(expression2));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toListTestExpressionsIsEmpty() {
        ListTest result = new ASTFactory().toListTest(new ArrayList<Expression>());
        assertTrue(result.getListLiteral().getExpressionList().isEmpty());
        assertThat(result.getListLiteral().getType().isValid(), is(true));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toListTypeExpression() {
        TypeExpression elementType = mock(TypeExpression.class);
        assertThat(new ASTFactory().toListTypeExpression(elementType).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toMultiplication() {
        Expression leftOperand = mock(Expression.class);
        Expression rightOperand = mock(Expression.class);
        assertThat(new ASTFactory().toMultiplication("+", leftOperand, rightOperand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toNamedParametersParamsIsEmptyReturnsEmpty() {
        Map<String, Expression> params = new HashMap<String, Expression>();
        NamedParameters result = new ASTFactory().toNamedParameters(params);
        assertThat(result.getConvertedArguments(), is(nullValue()));
        assertThat(result.getConvertedParameterTypes(), is(nullValue()));
        assertThat(result.getOriginalArguments(), is(nullValue()));
        assertThat(result.getParameterConversions(), is(nullValue()));
        assertThat(result.getParameters(), sameInstance(params));
        // pojo com.gs.dmn.feel.analysis.syntax.ast.expression.function.ParameterTypes
        assertThat(result.isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void toNegation() {
        Expression operand = mock(Expression.class);
        assertThat(new ASTFactory().toNegation("-", operand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toNegationKindIsNot() {
        Expression operand = mock(Expression.class);
        assertThat(new ASTFactory().toNegation("not", operand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toNegationKindListIsEmpty() {
        Expression operand = mock(Expression.class);
        assertThat(new ASTFactory().toNegation(new ArrayList<String>(), operand), sameInstance(operand));
    }

    @Test(timeout=10000)
    public void toNegationKindListIsNot() {
        List<String> kindList = new ArrayList<String>();
        ((ArrayList<String>)kindList).add("not");
        Expression operand = mock(Expression.class);
        assertThat(new ASTFactory().toNegation(kindList, operand).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toNumericLiteralLexemeIsSmith() {
        NumericLiteral result = new ASTFactory().toNumericLiteral("Smith");
        assertThat(result.getLexeme(), is("Smith"));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toPathExpression() {
        Expression source = mock(Expression.class);
        assertThat(new ASTFactory().toPathExpression(source, "1").getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toPositionalParametersParamsIsEmptyReturnsEmpty() {
        List<Expression> params = new ArrayList<Expression>();
        PositionalParameters result = new ASTFactory().toPositionalParameters(params);
        assertThat(result.getConvertedArguments(), is(nullValue()));
        assertThat(result.getConvertedParameterTypes(), is(nullValue()));
        assertThat(result.getOriginalArguments(), is(nullValue()));
        assertThat(result.getParameterConversions(), is(nullValue()));
        assertThat(result.getParameters(), sameInstance(params));
        // pojo com.gs.dmn.feel.analysis.syntax.ast.expression.function.ParameterTypes
        assertThat(result.isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void toPositiveUnaryTest() {
        Expression expression = mock(Expression.class);
        assertThat(new ASTFactory().toPositiveUnaryTest(expression).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toPositiveUnaryTests() {
        List<Expression> expressions = new ArrayList<Expression>();
        Expression expression = mock(Expression.class);
        ((ArrayList<Expression>)expressions).add(expression);
        PositiveUnaryTests result = new ASTFactory().toPositiveUnaryTests(expressions);
        assertThat(result.getPositiveUnaryTests().size(), is(1));
        assertThat(result.getPositiveUnaryTests().get(0).getType().isValid(), is(true));
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toPositiveUnaryTestsExpressionsIsEmpty() {
        PositiveUnaryTests result = new ASTFactory().toPositiveUnaryTests(new ArrayList<Expression>());
        assertTrue(result.getPositiveUnaryTests().isEmpty());
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toQuantifiedExpressionIteratorsIsEmptyAndPredicateIsSmith() {
        Expression body = mock(Expression.class);
        assertThat(new ASTFactory().toQuantifiedExpression("Smith", new ArrayList<Iterator>(), body).getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toSimplePositiveUnaryTestsExpressionsIsEmpty() {
        SimplePositiveUnaryTests result = new ASTFactory().toSimplePositiveUnaryTests(new ArrayList<Expression>());
        assertTrue(result.getSimplePositiveUnaryTests().isEmpty());
        assertThat(result.getType().isValid(), is(true));
    }

    @Test(timeout=10000)
    public void toStringLiteralLexemeIsSmith() {
        StringLiteral result = new ASTFactory().toStringLiteral("Smith");
        assertThat(result.getLexeme(), is("Smith"));
        assertThat(result.getType().isValid(), is(true));
    }
}
