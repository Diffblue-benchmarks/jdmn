package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TDecisionTableOrientation
 *
 * @author Diffblue JCover
 */

public class TDecisionTableOrientationTest {

    @Test(timeout=10000)
    public void value() {
        assertThat(TDecisionTableOrientation.RULE_AS_ROW.value(), is("Rule-as-Row"));
    }

    @Test(timeout=10000)
    public void valuesReturnsRULE_AS_ROWRULE_AS_COLUMNCROSS_TABLE() {
        TDecisionTableOrientation[] result = TDecisionTableOrientation.values();
        assertThat(result[0], is(TDecisionTableOrientation.RULE_AS_ROW));
        assertThat(result[1], is(TDecisionTableOrientation.RULE_AS_COLUMN));
        assertThat(result[2], is(TDecisionTableOrientation.CROSS_TABLE));
    }
}
