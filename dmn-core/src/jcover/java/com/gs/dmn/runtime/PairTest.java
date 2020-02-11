package com.gs.dmn.runtime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.Pair
 *
 * @author Diffblue JCover
 */

public class PairTest {

    @Test(timeout=10000)
    public void getLeft() {
        Object left = new Object();
        assertThat(new Pair<Object, Object>(left, new Object()).getLeft(), sameInstance(left));
    }

    @Test(timeout=10000)
    public void getRight() {
        Object right = new Object();
        assertThat(new Pair<Object, Object>(new Object(), right).getRight(), sameInstance(right));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new Pair<Object, Object>("bar", "foo").equals(new Object()), is(false));
        assertThat(new Pair<Object, Object>("foo", new Object()).equals(new Pair("foo", new Object())), is(false));
        assertThat(new Pair<Object, Object>("bar", "foo").equals(new Pair(new Object(), new Object())), is(false));
    }
}
