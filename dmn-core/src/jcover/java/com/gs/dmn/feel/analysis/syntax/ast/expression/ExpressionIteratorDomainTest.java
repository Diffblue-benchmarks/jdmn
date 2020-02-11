package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain
 *
 * @author Diffblue JCover
 */

public class ExpressionIteratorDomainTest {

    @Test(timeout=10000)
    public void getExpression() {
        Expression expression = mock(Expression.class);
        assertThat(new ExpressionIteratorDomain(expression).getExpression(), sameInstance(expression));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        Expression expression = mock(Expression.class);
        assertThat(new ExpressionIteratorDomain(expression).getType(), is(nullValue()));
    }
}
