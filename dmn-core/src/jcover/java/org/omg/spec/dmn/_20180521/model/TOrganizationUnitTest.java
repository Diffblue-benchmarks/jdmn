package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TOrganizationUnit
 *
 * @author Diffblue JCover
 */

public class TOrganizationUnitTest {

    @Test(timeout=10000)
    public void getDecisionMadeReturnsEmpty() {
        TOrganizationUnit obj = new TOrganizationUnit();
        List<TDMNElementReference> result = obj.getDecisionMade();
        assertTrue(result.isEmpty());
        assertThat(obj.getDecisionMade(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getDecisionOwnedReturnsEmpty() {
        TOrganizationUnit obj = new TOrganizationUnit();
        List<TDMNElementReference> result = obj.getDecisionOwned();
        assertTrue(result.isEmpty());
        assertThat(obj.getDecisionOwned(), sameInstance(result));
    }
}
