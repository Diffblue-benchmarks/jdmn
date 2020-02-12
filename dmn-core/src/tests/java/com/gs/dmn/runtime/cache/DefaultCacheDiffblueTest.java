package com.gs.dmn.runtime.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.cache.DefaultCache
 *
 * @author Diffblue JCover
 */

public class DefaultCacheDiffblueTest {

    @Test(timeout=10000)
    public void bindKeyIsFoo() {
        new DefaultCache().bind("foo", new Object());
    }

    @Test(timeout=10000)
    public void clear() {
        new DefaultCache().clear();
    }

    @Test(timeout=10000)
    public void containsKeyIsFooReturnsFalse() {
        assertThat(new DefaultCache().contains("foo"), is(false));
    }

    @Test(timeout=10000)
    public void lookupKeyIsFooReturnsNull() {
        assertThat(new DefaultCache().lookup("foo"), is(nullValue()));
    }
}
