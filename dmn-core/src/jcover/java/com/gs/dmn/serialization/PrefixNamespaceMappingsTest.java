package com.gs.dmn.serialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.serialization.PrefixNamespaceMappings
 *
 * @author Diffblue JCover
 */

public class PrefixNamespaceMappingsTest {

    @Test(timeout=10000)
    public void getPrefixIsFooReturnsNull() {
        assertThat(new PrefixNamespaceMappings().get("foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPrefixNamespaceIsFooReturnsNull() {
        assertThat(new PrefixNamespaceMappings().getPrefix("foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void merge() {
        new PrefixNamespaceMappings().merge(new PrefixNamespaceMappings());
    }

    @Test(timeout=10000)
    public void mergeOtherIsNull() {
        new PrefixNamespaceMappings().merge(null);
    }

    @Test(timeout=10000)
    public void putNamespaceIsFooAndPrefixIsFoo() {
        new PrefixNamespaceMappings().put("foo", "foo");
    }

    @Test(timeout=10000)
    public void renameKeyNewKeyIsFooAndOldKeyIsBar() {
        new PrefixNamespaceMappings().renameKey("bar", "foo");
    }
}
