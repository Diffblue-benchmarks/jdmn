package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain
 *
 * @author Diffblue JCover
 */

public class RangeIteratorDomainTest {

    @Test(timeout=10000)
    public void getEnd() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        assertThat(new RangeIteratorDomain(start, end).getEnd(), sameInstance(end));
    }

    @Test(timeout=10000)
    public void getStart() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        assertThat(new RangeIteratorDomain(start, end).getStart(), sameInstance(start));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        Expression start = mock(Expression.class);
        Expression end = mock(Expression.class);
        assertThat(new RangeIteratorDomain(start, end).getType(), is(nullValue()));
    }
}
