package com.gs.dmn.runtime.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.InputClausePair
 *
 * @author Diffblue JCover
 */

public class InputClausePairTest {

    @Test(timeout=10000)
    public void getExpression() {
        Expression expression = mock(Expression.class);
        assertThat(new InputClausePair(expression, new Object()).getExpression(), sameInstance(expression));
    }

    @Test(timeout=10000)
    public void getValue() {
        Expression expression = mock(Expression.class);
        Object value = new Object();
        assertThat(new InputClausePair(expression, value).getValue(), sameInstance(value));
    }
}
