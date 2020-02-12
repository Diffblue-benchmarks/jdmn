package com.gs.dmn.runtime.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.InterpretedRuleOutput
 *
 * @author Diffblue JCover
 */

public class InterpretedRuleOutputDiffblueTest {

    @Test(timeout=10000)
    public void getResult() {
        Object result = new Object();
        assertThat(new InterpretedRuleOutput(false, result).getResult(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void sortMatchedResultsIsEmpty() {
        List<com.gs.dmn.runtime.RuleOutput> matchedResults = new ArrayList<com.gs.dmn.runtime.RuleOutput>();
        assertThat(new InterpretedRuleOutput(false, "foo").sort(matchedResults), sameInstance(matchedResults));
    }

    @Test(timeout=10000)
    public void sortMatchedResultsIsNullReturnsNull() {
        assertThat(new InterpretedRuleOutput(false, new Object()).sort(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new InterpretedRuleOutput(false, "bar").equals(new InterpretedRuleOutput(false, "foo")), is(false));
        assertThat(new InterpretedRuleOutput(true, "bar").equals(new InterpretedRuleOutput(false, "foo")), is(false));
        assertThat(new InterpretedRuleOutput(false, "bar").equals("foo"), is(false));
        assertThat(new InterpretedRuleOutput(false, "foo").equals(new InterpretedRuleOutput(false, "foo")), is(true));
    }
}
