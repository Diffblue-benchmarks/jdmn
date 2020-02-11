package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TKnowledgeSource
 *
 * @author Diffblue JCover
 */

public class TKnowledgeSourceTest {

    @Test(timeout=10000)
    public void getAuthorityRequirementReturnsEmpty() {
        TKnowledgeSource obj = new TKnowledgeSource();
        List<TAuthorityRequirement> result = obj.getAuthorityRequirement();
        assertTrue(result.isEmpty());
        assertThat(obj.getAuthorityRequirement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getLocationURIReturnsNull() {
        assertThat(new TKnowledgeSource().getLocationURI(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOwnerReturnsNull() {
        assertThat(new TKnowledgeSource().getOwner(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new TKnowledgeSource().getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setLocationURIToGermany() {
        TKnowledgeSource obj = new TKnowledgeSource();
        obj.setLocationURI("Germany");
        assertThat(obj.getLocationURI(), is("Germany"));
    }

    @Test(timeout=10000)
    public void setOwner() {
        TKnowledgeSource obj = new TKnowledgeSource();
        TDMNElementReference value = new TDMNElementReference();
        obj.setOwner(value);
        assertThat(obj.getOwner(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setTypeToGif() {
        TKnowledgeSource obj = new TKnowledgeSource();
        obj.setType("gif");
        assertThat(obj.getType(), is("gif"));
    }
}
