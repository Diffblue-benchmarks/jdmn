package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TBuiltinAggregator
 *
 * @author Diffblue JCover
 */

public class TBuiltinAggregatorTest {

    @Test(timeout=10000)
    public void valueReturnsSUM() {
        assertThat(TBuiltinAggregator.SUM.value(), is("SUM"));
    }

    @Test(timeout=10000)
    public void valuesReturnsSUMCOUNTMINMAX() {
        TBuiltinAggregator[] result = TBuiltinAggregator.values();
        assertThat(result[0], is(TBuiltinAggregator.SUM));
        assertThat(result[1], is(TBuiltinAggregator.COUNT));
        assertThat(result[2], is(TBuiltinAggregator.MIN));
        assertThat(result[3], is(TBuiltinAggregator.MAX));
    }
}
