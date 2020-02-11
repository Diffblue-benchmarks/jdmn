package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TInformationRequirement
 *
 * @author Diffblue JCover
 */

public class TInformationRequirementTest {

    @Test(timeout=10000)
    public void getRequiredDecisionReturnsNull() {
        assertThat(new TInformationRequirement().getRequiredDecision(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRequiredInputReturnsNull() {
        assertThat(new TInformationRequirement().getRequiredInput(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setRequiredDecision() {
        TInformationRequirement obj = new TInformationRequirement();
        TDMNElementReference value = new TDMNElementReference();
        obj.setRequiredDecision(value);
        assertThat(obj.getRequiredDecision(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setRequiredInput() {
        TInformationRequirement obj = new TInformationRequirement();
        TDMNElementReference value = new TDMNElementReference();
        obj.setRequiredInput(value);
        assertThat(obj.getRequiredInput(), sameInstance(value));
    }
}
