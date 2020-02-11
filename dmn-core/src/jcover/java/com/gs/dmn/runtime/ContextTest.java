package com.gs.dmn.runtime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.Context
 *
 * @author Diffblue JCover
 */

public class ContextTest {

    @Test(timeout=10000)
    public void add() {
        Context context = new Context();
        Object key = new Object();
        Object value = new Object();
        assertThat(context.add(key, value), sameInstance(context));
        assertThat(context.getBindings().get(key), sameInstance(value));
    }

    @Test(timeout=10000)
    public void get() {
        assertThat(new Context().get(new Object()), is(nullValue()));
        assertThat(new Context().get("foo", new Object[] { }), is(nullValue()));
        assertThat(new Context().get("foo", null), is(nullValue()));
        assertThat(new Context().get("bar", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getBindingsReturnsEmpty() {
        Context context = new Context();
        Map result = context.getBindings();
        assertThat(result.isEmpty(), is(true));
        assertThat(context.getBindings(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new Context().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isEquivalent() {
        assertThat(new Context().isEquivalent(null), is(false));
        assertThat(new Context().isEquivalent(new Context()), is(true));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new Context().equals("foo"), is(false));
        assertThat(new Context("bar").equals("foo"), is(false));
        assertThat(new Context().equals(null), is(false));
    }
}
