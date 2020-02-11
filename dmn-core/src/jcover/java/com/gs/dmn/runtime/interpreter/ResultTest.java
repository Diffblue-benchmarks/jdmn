package com.gs.dmn.runtime.interpreter;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.Result
 *
 * @author Diffblue JCover
 */

public class ResultTest {

    @Test(timeout=10000)
    public void type() {
        Type type = mock(Type.class);
        when(type.isValid())
            .thenReturn(false);
        Result result1 = new Result("foo", type);
        Type result2 = Result.type(result1);
        assertThat(result2.isValid(), is(false));
        assertThat(result1.getType(), sameInstance(result2));
    }

    @Test(timeout=10000)
    public void typeResultIsNullReturnsNull() {
        assertThat(Result.type(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void valueResultIsNullReturnsNull() {
        assertThat(Result.value(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void valueReturnsFoo() {
        Type type = mock(Type.class);
        Result result1 = new Result("foo", type);
        Object result2 = Result.value(result1);
        assertThat(result2, instanceOf(String.class));
        assertThat(((String)result2), is("foo"));
        assertThat(result1.getValue(), sameInstance(result2));
    }
}
