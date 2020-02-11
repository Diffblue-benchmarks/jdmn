package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TDecision
 *
 * @author Diffblue JCover
 */

public class TDecisionTest {

    @Test(timeout=10000)
    public void getAllowedAnswersReturnsNull() {
        assertThat(new TDecision().getAllowedAnswers(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getAuthorityRequirementReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TAuthorityRequirement> result = obj.getAuthorityRequirement();
        assertTrue(result.isEmpty());
        assertThat(obj.getAuthorityRequirement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getDecisionMakerReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TDMNElementReference> result = obj.getDecisionMaker();
        assertTrue(result.isEmpty());
        assertThat(obj.getDecisionMaker(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getDecisionOwnerReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TDMNElementReference> result = obj.getDecisionOwner();
        assertTrue(result.isEmpty());
        assertThat(obj.getDecisionOwner(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getExpressionReturnsNull() {
        assertThat(new TDecision().getExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getImpactedPerformanceIndicatorReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TDMNElementReference> result = obj.getImpactedPerformanceIndicator();
        assertTrue(result.isEmpty());
        assertThat(obj.getImpactedPerformanceIndicator(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getInformationRequirementReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TInformationRequirement> result = obj.getInformationRequirement();
        assertTrue(result.isEmpty());
        assertThat(obj.getInformationRequirement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getKnowledgeRequirementReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TKnowledgeRequirement> result = obj.getKnowledgeRequirement();
        assertTrue(result.isEmpty());
        assertThat(obj.getKnowledgeRequirement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getQuestionReturnsNull() {
        assertThat(new TDecision().getQuestion(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSupportedObjectiveReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TDMNElementReference> result = obj.getSupportedObjective();
        assertTrue(result.isEmpty());
        assertThat(obj.getSupportedObjective(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getUsingProcessReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TDMNElementReference> result = obj.getUsingProcess();
        assertTrue(result.isEmpty());
        assertThat(obj.getUsingProcess(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getUsingTaskReturnsEmpty() {
        TDecision obj = new TDecision();
        List<TDMNElementReference> result = obj.getUsingTask();
        assertTrue(result.isEmpty());
        assertThat(obj.getUsingTask(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getVariableReturnsNull() {
        assertThat(new TDecision().getVariable(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAllowedAnswersToFoo() {
        TDecision obj = new TDecision();
        obj.setAllowedAnswers("foo");
        assertThat(obj.getAllowedAnswers(), is("foo"));
    }

    @Test(timeout=10000)
    public void setExpression() {
        TDecision obj = new TDecision();
        JAXBElement<? extends TExpression> value1 = new JAXBElement<TExpression>(new QName("545321456"), TExpression.class, String.class, new TExpression());
        obj.setExpression(value1);
        assertThat(obj.getExpression(), sameInstance(value1));
    }

    @Test(timeout=10000)
    public void setQuestionToFoo() {
        TDecision obj = new TDecision();
        obj.setQuestion("foo");
        assertThat(obj.getQuestion(), is("foo"));
    }

    @Test(timeout=10000)
    public void setVariable() {
        TDecision obj = new TDecision();
        TInformationItem value = new TInformationItem();
        obj.setVariable(value);
        assertThat(obj.getVariable(), sameInstance(value));
    }
}
