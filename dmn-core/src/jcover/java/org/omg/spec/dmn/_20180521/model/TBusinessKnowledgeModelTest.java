package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel
 *
 * @author Diffblue JCover
 */

public class TBusinessKnowledgeModelTest {

    @Test(timeout=10000)
    public void getAuthorityRequirementReturnsEmpty() {
        TBusinessKnowledgeModel obj = new TBusinessKnowledgeModel();
        List<TAuthorityRequirement> result = obj.getAuthorityRequirement();
        assertTrue(result.isEmpty());
        assertThat(obj.getAuthorityRequirement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getEncapsulatedLogicReturnsNull() {
        assertThat(new TBusinessKnowledgeModel().getEncapsulatedLogic(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getKnowledgeRequirementReturnsEmpty() {
        TBusinessKnowledgeModel obj = new TBusinessKnowledgeModel();
        List<TKnowledgeRequirement> result = obj.getKnowledgeRequirement();
        assertTrue(result.isEmpty());
        assertThat(obj.getKnowledgeRequirement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void setEncapsulatedLogic() {
        TBusinessKnowledgeModel obj = new TBusinessKnowledgeModel();
        TFunctionDefinition value = new TFunctionDefinition();
        obj.setEncapsulatedLogic(value);
        assertThat(obj.getEncapsulatedLogic(), sameInstance(value));
    }
}
