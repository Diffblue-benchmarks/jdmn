package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.THitPolicy
 *
 * @author Diffblue JCover
 */

public class THitPolicyTest {

    @Test(timeout=10000)
    public void valueReturnsUNIQUE() {
        assertThat(THitPolicy.UNIQUE.value(), is("UNIQUE"));
    }

    @Test(timeout=10000)
    public void valuesReturnsUNIQUEFIRSTPRIORITYANYCOLLECTRULE_ORDEROUTPUT_ORDER() {
        THitPolicy[] result = THitPolicy.values();
        assertThat(result[0], is(THitPolicy.UNIQUE));
        assertThat(result[1], is(THitPolicy.FIRST));
        assertThat(result[2], is(THitPolicy.PRIORITY));
        assertThat(result[3], is(THitPolicy.ANY));
        assertThat(result[4], is(THitPolicy.COLLECT));
        assertThat(result[5], is(THitPolicy.RULE_ORDER));
        assertThat(result[6], is(THitPolicy.OUTPUT_ORDER));
    }
}
