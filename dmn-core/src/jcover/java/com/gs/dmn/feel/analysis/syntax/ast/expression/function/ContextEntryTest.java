package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry
 *
 * @author Diffblue JCover
 */

public class ContextEntryTest {

    @Test(timeout=10000)
    public void getExpression() {
        Expression expression = mock(Expression.class);
        assertThat(new ContextEntry(new ContextEntryKey("Smith"), expression).getExpression(), sameInstance(expression));
    }

    @Test(timeout=10000)
    public void getKey() {
        ContextEntryKey key = new ContextEntryKey("Smith");
        Expression expression = mock(Expression.class);
        assertThat(new ContextEntry(key, expression).getKey(), sameInstance(key));
    }
}
