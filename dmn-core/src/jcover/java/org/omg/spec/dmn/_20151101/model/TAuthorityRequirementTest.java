package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TAuthorityRequirement
 *
 * @author Diffblue JCover
 */

public class TAuthorityRequirementTest {

    @Test(timeout=10000)
    public void getRequiredAuthorityReturnsNull() {
        assertThat(new TAuthorityRequirement().getRequiredAuthority(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRequiredDecisionReturnsNull() {
        assertThat(new TAuthorityRequirement().getRequiredDecision(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRequiredInputReturnsNull() {
        assertThat(new TAuthorityRequirement().getRequiredInput(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setRequiredAuthority() {
        TAuthorityRequirement obj = new TAuthorityRequirement();
        TDMNElementReference value = new TDMNElementReference();
        obj.setRequiredAuthority(value);
        assertThat(obj.getRequiredAuthority(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setRequiredDecision() {
        TAuthorityRequirement obj = new TAuthorityRequirement();
        TDMNElementReference value = new TDMNElementReference();
        obj.setRequiredDecision(value);
        assertThat(obj.getRequiredDecision(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setRequiredInput() {
        TAuthorityRequirement obj = new TAuthorityRequirement();
        TDMNElementReference value = new TDMNElementReference();
        obj.setRequiredInput(value);
        assertThat(obj.getRequiredInput(), sameInstance(value));
    }
}
