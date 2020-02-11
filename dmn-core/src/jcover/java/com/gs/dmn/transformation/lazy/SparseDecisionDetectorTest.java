package com.gs.dmn.transformation.lazy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

import com.gs.dmn.DMNModelRepository;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecisionTable;

/**
 * Unit tests for com.gs.dmn.transformation.lazy.SparseDecisionDetector
 *
 * @author Diffblue JCover
 */

public class SparseDecisionDetectorTest {

    @Test(timeout=10000)
    public void detect() {
        assertTrue(new SparseDecisionDetector().detect(new DMNModelRepository()).getLazyEvaluatedDecisions().isEmpty());
    }

    @Test(timeout=10000)
    public void isSparseDecisionTableSparsityThresholdIsOneReturnsFalse() {
        assertThat(new SparseDecisionDetector().isSparseDecisionTable(new TDecisionTable(), 1.0), is(false));
    }
}
