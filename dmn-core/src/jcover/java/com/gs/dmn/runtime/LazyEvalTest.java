package com.gs.dmn.runtime;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Supplier;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.LazyEval
 *
 * @author Diffblue JCover
 */

public class LazyEvalTest {

    @Test(timeout=10000)
    public void getOrComputeReturnsFoo() {
        @SuppressWarnings("unchecked")
        Supplier<Object> supplier = mock(Supplier.class);
        when(supplier.get())
            .thenReturn("foo");
        LazyEval<Object> lazyEval = new LazyEval<Object>(supplier);
        Object result = lazyEval.getOrCompute();
        assertThat(result, instanceOf(String.class));
        assertThat(((String)result), is("foo"));
        assertThat(lazyEval.getOrCompute(), sameInstance(result));
    }
}
