package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TDecisionTable
 *
 * @author Diffblue JCover
 */

public class TDecisionTableTest {

    @Test(timeout=10000)
    public void getAggregationReturnsNull() {
        assertThat(new TDecisionTable().getAggregation(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHitPolicyReturnsUNIQUE() {
        assertThat(new TDecisionTable().getHitPolicy(), is(THitPolicy.UNIQUE));
    }

    @Test(timeout=10000)
    public void getInputReturnsEmpty() {
        TDecisionTable obj = new TDecisionTable();
        List<TInputClause> result = obj.getInput();
        assertTrue(result.isEmpty());
        assertThat(obj.getInput(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getOutputLabelReturnsNull() {
        assertThat(new TDecisionTable().getOutputLabel(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOutputReturnsEmpty() {
        TDecisionTable obj = new TDecisionTable();
        List<TOutputClause> result = obj.getOutput();
        assertTrue(result.isEmpty());
        assertThat(obj.getOutput(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getPreferredOrientationReturnsRULE_AS_ROW() {
        assertThat(new TDecisionTable().getPreferredOrientation(), is(TDecisionTableOrientation.RULE_AS_ROW));
    }

    @Test(timeout=10000)
    public void getRuleReturnsEmpty() {
        TDecisionTable obj = new TDecisionTable();
        List<TDecisionRule> result = obj.getRule();
        assertTrue(result.isEmpty());
        assertThat(obj.getRule(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void setAggregationToSUM() {
        TDecisionTable obj = new TDecisionTable();
        obj.setAggregation(TBuiltinAggregator.SUM);
        assertThat(obj.getAggregation(), is(TBuiltinAggregator.SUM));
    }

    @Test(timeout=10000)
    public void setHitPolicyToUNIQUE() {
        new TDecisionTable().setHitPolicy(THitPolicy.UNIQUE);
    }

    @Test(timeout=10000)
    public void setOutputLabelToFoo() {
        TDecisionTable obj = new TDecisionTable();
        obj.setOutputLabel("foo");
        assertThat(obj.getOutputLabel(), is("foo"));
    }

    @Test(timeout=10000)
    public void setPreferredOrientationToRULE_AS_ROW() {
        new TDecisionTable().setPreferredOrientation(TDecisionTableOrientation.RULE_AS_ROW);
    }
}
