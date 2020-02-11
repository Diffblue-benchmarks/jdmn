package com.gs.dmn.log;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.log.Slf4jBuildLogger
 *
 * @author Diffblue JCover
 */

public class Slf4jBuildLoggerTest {

    @Test(timeout=10000)
    public void debugCharSequenceIsFoo() {
        Logger logger = mock(Logger.class);
        new Slf4jBuildLogger(logger).debug("foo");
    }

    @Test(timeout=10000)
    public void errorCharSequenceIsFoo() {
        Logger logger = mock(Logger.class);
        new Slf4jBuildLogger(logger).error("foo");
    }

    @Test(timeout=10000)
    public void infoCharSequenceIsFoo() {
        Logger logger = mock(Logger.class);
        new Slf4jBuildLogger(logger).info("foo");
    }

    @Test(timeout=10000)
    public void warnCharSequenceIsFoo() {
        Logger logger = mock(Logger.class);
        new Slf4jBuildLogger(logger).warn("foo");
    }
}
