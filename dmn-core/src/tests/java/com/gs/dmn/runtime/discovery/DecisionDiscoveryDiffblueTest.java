package com.gs.dmn.runtime.discovery;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.discovery.DecisionDiscovery
 *
 * @author Diffblue JCover
 */

public class DecisionDiscoveryDiffblueTest {

    @Test(timeout=10000)
    public void discoverPackagePrefixIsFooReturnsEmpty() {
        assertTrue(new DecisionDiscovery().discover("foo").isEmpty());
    }
}
