package com.gs.dmn.validation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.log.BuildLogger;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDecision;

/**
 * Unit tests for com.gs.dmn.validation.DefaultDMNValidator
 *
 * @author Diffblue JCover
 */

public class DefaultDMNValidatorDiffblueTest {

    @Test(timeout=10000)
    public void validate1() {
        assertTrue(new DefaultDMNValidator().validate(new DMNModelRepository()).isEmpty());
    }

    @Test(timeout=10000)
    public void validate2() {
        BuildLogger logger = mock(BuildLogger.class);
        assertTrue(new DefaultDMNValidator(logger).validate(new DMNModelRepository()).isEmpty());
    }

    @Test(timeout=10000)
    public void validateBusinessKnowledgeModelErrorsIsEmpty() {
        List<String> errors = new ArrayList<String>();
        new DefaultDMNValidator().validateBusinessKnowledgeModel(new TBusinessKnowledgeModel(), errors);
        assertThat(errors.size(), is(1));
        assertThat(errors.get(0), is("Missing name for element 'null'"));
    }

    @Test(timeout=10000)
    public void validateDecisionErrorsIsEmpty() {
        List<String> errors = new ArrayList<String>();
        new DefaultDMNValidator().validateDecision(new TDecision(), new DMNModelRepository(), errors);
        assertThat(errors.size(), is(2));
        assertThat(errors.get(0), is("Missing name for element 'null'"));
        assertThat(errors.get(1), is("Missing variable for 'null'"));
    }
}
