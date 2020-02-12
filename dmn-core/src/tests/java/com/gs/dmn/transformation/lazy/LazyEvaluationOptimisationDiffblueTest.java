package com.gs.dmn.transformation.lazy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.lazy.LazyEvaluationOptimisation
 *
 * @author Diffblue JCover
 */

public class LazyEvaluationOptimisationDiffblueTest {

    @Test(timeout=10000)
    public void addLazyEvaluatedDecision() {
        LazyEvaluationOptimisation lazyEvaluationOptimisation = new LazyEvaluationOptimisation();
        lazyEvaluationOptimisation.addLazyEvaluatedDecision("/bin/bash");
        assertTrue(lazyEvaluationOptimisation.getLazyEvaluatedDecisions().contains("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getLazyEvaluatedDecisionsReturnsEmpty() {
        LazyEvaluationOptimisation lazyEvaluationOptimisation = new LazyEvaluationOptimisation();
        Set<String> result = lazyEvaluationOptimisation.getLazyEvaluatedDecisions();
        assertTrue(result.isEmpty());
        assertThat(lazyEvaluationOptimisation.getLazyEvaluatedDecisions(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void isLazyEvaluatedNameIsBarReturnsFalse() {
        assertThat(new LazyEvaluationOptimisation().isLazyEvaluated("bar"), is(false));
    }

    @Test(timeout=10000)
    public void union() {
        new LazyEvaluationOptimisation().union(new LazyEvaluationOptimisation());
    }
}
