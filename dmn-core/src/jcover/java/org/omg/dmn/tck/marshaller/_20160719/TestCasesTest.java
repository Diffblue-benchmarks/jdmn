package org.omg.dmn.tck.marshaller._20160719;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.dmn.tck.marshaller._20160719.TestCases
 *
 * @author Diffblue JCover
 */

public class TestCasesTest {

    @Test(timeout=10000)
    public void getLabelsReturnsNull() {
        assertThat(new TestCases().getLabels(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getModelNameReturnsNull() {
        assertThat(new TestCases().getModelName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTestCaseReturnsEmpty() {
        TestCases testCases = new TestCases();
        List<TestCases.TestCase> result = testCases.getTestCase();
        assertTrue(result.isEmpty());
        assertThat(testCases.getTestCase(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void setLabels() {
        TestCases testCases = new TestCases();
        TestCases.Labels value = new TestCases.Labels();
        testCases.setLabels(value);
        assertThat(testCases.getLabels(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setModelName() {
        TestCases testCases = new TestCases();
        testCases.setModelName("/bin/bash");
        assertThat(testCases.getModelName(), is("/bin/bash"));
    }
}
