package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TDecisionRule
 *
 * @author Diffblue JCover
 */

public class TDecisionRuleTest {

    @Test(timeout=10000)
    public void getAnnotationEntryReturnsEmpty() {
        TDecisionRule obj = new TDecisionRule();
        List<TDecisionRule.AnnotationEntry> result = obj.getAnnotationEntry();
        assertTrue(result.isEmpty());
        assertThat(obj.getAnnotationEntry(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getInputEntryReturnsEmpty() {
        TDecisionRule obj = new TDecisionRule();
        List<TUnaryTests> result = obj.getInputEntry();
        assertTrue(result.isEmpty());
        assertThat(obj.getInputEntry(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getOutputEntryReturnsEmpty() {
        TDecisionRule obj = new TDecisionRule();
        List<TLiteralExpression> result = obj.getOutputEntry();
        assertTrue(result.isEmpty());
        assertThat(obj.getOutputEntry(), sameInstance(result));
    }
}
