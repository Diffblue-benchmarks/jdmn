package com.gs.dmn.runtime.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.listener.Rule
 *
 * @author Diffblue JCover
 */

public class RuleTest {

    @Test(timeout=10000)
    public void getAnnotationReturnsGermany() {
        assertThat(new Rule(1, "Germany").getAnnotation(), is("Germany"));
    }

    @Test(timeout=10000)
    public void getIndex() {
        assertThat(new Rule(1, "Germany").getIndex(), is(1));
        assertThat(new Rule(0, "Germany").getIndex(), is(0));
    }
}
