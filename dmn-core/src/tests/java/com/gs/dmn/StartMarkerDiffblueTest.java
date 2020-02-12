package com.gs.dmn;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;

/**
 * Unit tests for com.gs.dmn.StartMarker
 *
 * @author Diffblue JCover
 */

public class StartMarkerDiffblueTest {

    @Test(timeout=10000)
    public void getDecision() {
        TDecision decision = new TDecision();
        assertThat(new StartMarker(decision).getDecision(), sameInstance(decision));
    }
}
