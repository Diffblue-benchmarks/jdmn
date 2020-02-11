package com.gs.dmn.runtime.annotation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.annotation.HitPolicy
 *
 * @author Diffblue JCover
 */

public class HitPolicyTest {

    @Test(timeout=10000)
    public void fromValueVIsGermanyReturnsUNKNOWN() {
        assertThat(HitPolicy.fromValue("Germany"), is(HitPolicy.UNKNOWN));
    }

    @Test(timeout=10000)
    public void valueReturnsUNIQUE() {
        assertThat(HitPolicy.UNIQUE.value(), is("UNIQUE"));
    }
}
