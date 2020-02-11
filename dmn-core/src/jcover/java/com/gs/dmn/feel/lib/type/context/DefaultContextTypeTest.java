package com.gs.dmn.feel.lib.type.context;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.context.DefaultContextType
 *
 * @author Diffblue JCover
 */

public class DefaultContextTypeTest {

    @Test(timeout=10000)
    public void contextEqualC1IsFoo() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultContextType(logger).contextEqual("foo", new Object()), is(false));
    }

    @Test(timeout=10000)
    public void contextEqualC1IsNullAndC2IsFoo() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultContextType(logger).contextEqual(null, "foo"), is(false));
    }

    @Test(timeout=10000)
    public void contextEqualC1IsNullAndC2IsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultContextType(logger).contextEqual(null, null), is(true));
    }

    @Test(timeout=10000)
    public void contextEqualC2IsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultContextType(logger).contextEqual(new Object(), null), is(false));
    }

    @Test(timeout=10000)
    public void contextNotEqualC1IsFooReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultContextType(logger).contextNotEqual("foo", new Object()), is(true));
    }
}
