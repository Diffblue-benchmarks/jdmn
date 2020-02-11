package com.gs.dmn.maven;

import static org.mockito.Mockito.mock;

import org.apache.maven.plugin.logging.Log;
import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.maven.MavenBuildLogger
 *
 * @author Diffblue JCover
 */

public class MavenBuildLoggerTest {

    @Test(timeout=10000)
    public void debugCharSequenceIsFoo() {
        Log logger = mock(Log.class);
        new MavenBuildLogger(logger).debug("foo");
    }

    @Test(timeout=10000)
    public void errorCharSequenceIsFoo() {
        Log logger = mock(Log.class);
        new MavenBuildLogger(logger).error("foo");
    }

    @Test(timeout=10000)
    public void infoCharSequenceIsFoo() {
        Log logger = mock(Log.class);
        new MavenBuildLogger(logger).info("foo");
    }

    @Test(timeout=10000)
    public void warnCharSequenceIsFoo() {
        Log logger = mock(Log.class);
        new MavenBuildLogger(logger).warn("foo");
    }
}
