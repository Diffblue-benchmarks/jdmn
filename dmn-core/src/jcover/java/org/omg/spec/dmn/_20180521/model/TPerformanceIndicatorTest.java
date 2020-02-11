package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TPerformanceIndicator
 *
 * @author Diffblue JCover
 */

public class TPerformanceIndicatorTest {

    @Test(timeout=10000)
    public void getImpactingDecisionReturnsEmpty() {
        TPerformanceIndicator obj = new TPerformanceIndicator();
        List<TDMNElementReference> result = obj.getImpactingDecision();
        assertTrue(result.isEmpty());
        assertThat(obj.getImpactingDecision(), sameInstance(result));
    }
}
