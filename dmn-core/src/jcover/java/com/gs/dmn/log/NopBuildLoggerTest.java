package com.gs.dmn.log;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.log.NopBuildLogger
 *
 * @author Diffblue JCover
 */

public class NopBuildLoggerTest {

    @Test(timeout=10000)
    public void debugCharSequenceIsFoo() {
        new NopBuildLogger().debug("foo");
    }

    @Test(timeout=10000)
    public void errorCharSequenceIsFoo() {
        new NopBuildLogger().error("foo");
    }

    @Test(timeout=10000)
    public void infoCharSequenceIsFoo() {
        new NopBuildLogger().info("foo");
    }

    @Test(timeout=10000)
    public void warnCharSequenceIsFoo() {
        new NopBuildLogger().warn("foo");
    }
}
