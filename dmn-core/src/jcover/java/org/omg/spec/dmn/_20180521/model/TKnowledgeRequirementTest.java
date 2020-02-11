package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TKnowledgeRequirement
 *
 * @author Diffblue JCover
 */

public class TKnowledgeRequirementTest {

    @Test(timeout=10000)
    public void getRequiredKnowledgeReturnsNull() {
        assertThat(new TKnowledgeRequirement().getRequiredKnowledge(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setRequiredKnowledge() {
        TKnowledgeRequirement obj = new TKnowledgeRequirement();
        TDMNElementReference value = new TDMNElementReference();
        obj.setRequiredKnowledge(value);
        assertThat(obj.getRequiredKnowledge(), sameInstance(value));
    }
}
