package com.gs.dmn.runtime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.gs.dmn.runtime.annotation.HitPolicy;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.RuleOutputList
 *
 * @author Diffblue JCover
 */

public class RuleOutputListTest {

    @Test(timeout=10000)
    public void add1() {
        new RuleOutputList().add(null);
    }

    @Test(timeout=10000)
    public void add2() {
        RuleOutput result = mock(RuleOutput.class);
        when(result.isMatched())
            .thenReturn(false);
        new RuleOutputList().add(result);
    }

    @Test(timeout=10000)
    public void add3() {
        RuleOutputList ruleOutputList = new RuleOutputList();
        RuleOutput result = mock(RuleOutput.class);
        when(result.isMatched())
            .thenReturn(true);
        ruleOutputList.add(result);
        assertThat(ruleOutputList.getMatchedRuleResults().size(), is(1));
        assertThat(ruleOutputList.getMatchedRuleResults().get(0), sameInstance(result));
    }

    @Test(timeout=10000)
    public void applyMultipleHitPolicyIsCOLLECT() {
        RuleOutputList ruleOutputList = new RuleOutputList();
        List<? extends RuleOutput> result = ruleOutputList.applyMultiple(HitPolicy.COLLECT);
        assertTrue(result.isEmpty());
        assertThat((List<? extends RuleOutput>)ruleOutputList.getMatchedRuleResults(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void applyMultipleHitPolicyIsOUTPUT_ORDER() {
        RuleOutputList ruleOutputList = new RuleOutputList();
        List<? extends RuleOutput> result = ruleOutputList.applyMultiple(HitPolicy.OUTPUT_ORDER);
        assertTrue(result.isEmpty());
        assertThat((List<? extends RuleOutput>)ruleOutputList.getMatchedRuleResults(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void applyMultipleHitPolicyIsRULE_ORDER() {
        RuleOutputList ruleOutputList = new RuleOutputList();
        List<? extends RuleOutput> result = ruleOutputList.applyMultiple(HitPolicy.RULE_ORDER);
        assertTrue(result.isEmpty());
        assertThat((List<? extends RuleOutput>)ruleOutputList.getMatchedRuleResults(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void applySingle() {
        assertThat(new RuleOutputList().applySingle(HitPolicy.ANY), is(nullValue()));
        assertThat(new RuleOutputList().applySingle(HitPolicy.FIRST), is(nullValue()));
        assertThat(new RuleOutputList().applySingle(HitPolicy.PRIORITY), is(nullValue()));
        assertThat(new RuleOutputList().applySingle(HitPolicy.RULE_ORDER), is(nullValue()));
        assertThat(new RuleOutputList().applySingle(HitPolicy.UNIQUE), is(nullValue()));
    }

    @Test(timeout=10000)
    public void noMatchedRulesReturnsTrue() {
        assertThat(new RuleOutputList().noMatchedRules(), is(true));
    }
}
