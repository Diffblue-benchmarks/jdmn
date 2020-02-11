package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TDecisionService
 *
 * @author Diffblue JCover
 */

public class TDecisionServiceTest {

    @Test(timeout=10000)
    public void getEncapsulatedDecisionReturnsEmpty() {
        TDecisionService obj = new TDecisionService();
        List<TDMNElementReference> result = obj.getEncapsulatedDecision();
        assertTrue(result.isEmpty());
        assertThat(obj.getEncapsulatedDecision(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getInputDataReturnsEmpty() {
        TDecisionService obj = new TDecisionService();
        List<TDMNElementReference> result = obj.getInputData();
        assertTrue(result.isEmpty());
        assertThat(obj.getInputData(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getInputDecisionReturnsEmpty() {
        TDecisionService obj = new TDecisionService();
        List<TDMNElementReference> result = obj.getInputDecision();
        assertTrue(result.isEmpty());
        assertThat(obj.getInputDecision(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getOutputDecisionReturnsEmpty() {
        TDecisionService obj = new TDecisionService();
        List<TDMNElementReference> result = obj.getOutputDecision();
        assertTrue(result.isEmpty());
        assertThat(obj.getOutputDecision(), sameInstance(result));
    }
}
