package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertTrue;

import com.gs.dmn.DMNModelRepository;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector
 *
 * @author Diffblue JCover
 */

public class NopLazyEvaluationDetectorTest {

    @Test(timeout=10000)
    public void detect() {
        assertTrue(new NopLazyEvaluationDetector().detect(new DMNModelRepository()).getLazyEvaluatedDecisions().isEmpty());
    }
}
