package org.omg.dmn.tck.marshaller._20160719;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.dmn.tck.marshaller._20160719.TestCaseType
 *
 * @author Diffblue JCover
 */

public class TestCaseTypeTest {

    @Test(timeout=10000)
    public void valueReturnsDecision() {
        assertThat(TestCaseType.DECISION.value(), is("decision"));
    }

    @Test(timeout=10000)
    public void valuesReturnsDECISIONBKMDECISION_SERVICE() {
        TestCaseType[] result = TestCaseType.values();
        assertThat(result[0], is(TestCaseType.DECISION));
        assertThat(result[1], is(TestCaseType.BKM));
        assertThat(result[2], is(TestCaseType.DECISION_SERVICE));
    }
}
