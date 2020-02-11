package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator
 *
 * @author Diffblue JCover
 */

public class IteratorTest {

    @Test(timeout=10000)
    public void getDomain() {
        IteratorDomain domain = mock(IteratorDomain.class);
        assertThat(new Iterator("Smith", domain).getDomain(), sameInstance(domain));
    }

    @Test(timeout=10000)
    public void getNameReturnsSmith() {
        IteratorDomain domain = mock(IteratorDomain.class);
        assertThat(new Iterator("Smith", domain).getName(), is("Smith"));
    }
}
