package com.gs.dmn.runtime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.PairComparator
 *
 * @author Diffblue JCover
 */

public class PairComparatorTest {

    @Test(timeout=10000)
    public void compare() {
        assertThat(new PairComparator<Object>().compare(new Pair<Object, Integer>(new Object(), 1), new Pair<Object, Integer>(new Object(), null)), is(-1));
        assertThat(new PairComparator<Object>().compare(new Pair<Object, Integer>(new Object(), 0), new Pair<Object, Integer>(new Object(), 1)), is(1));
        assertThat(new PairComparator<Object>().compare(new Pair<Object, Integer>("foo", null), new Pair<Object, Integer>(new Object(), 1)), is(1));
        assertThat(new PairComparator<Object>().compare(new Pair<Object, Integer>("foo", 1), new Pair<Object, Integer>(new Object(), 1)), is(0));
        assertThat(new PairComparator<Object>().compare(new Pair<Object, Integer>(new Object(), null), new Pair<Object, Integer>(new Object(), null)), is(0));
    }
}
