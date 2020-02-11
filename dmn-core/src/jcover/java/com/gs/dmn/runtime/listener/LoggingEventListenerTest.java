package com.gs.dmn.runtime.listener;

import static org.mockito.Mockito.mock;

import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.runtime.listener.LoggingEventListener
 *
 * @author Diffblue JCover
 */

public class LoggingEventListenerTest {

    @Test(timeout=10000)
    public void endDRGElementArgumentsIsEmptyAndDurationIsOne() {
        Logger logger = mock(Logger.class);
        new LoggingEventListener(logger).endDRGElement(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments(), new Object(), 1L);
    }

    @Test(timeout=10000)
    public void endRule() {
        Logger logger = mock(Logger.class);
        new LoggingEventListener(logger).endRule(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"), new Object());
    }

    @Test(timeout=10000)
    public void matchRule() {
        Logger logger = mock(Logger.class);
        new LoggingEventListener(logger).matchRule(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"));
    }

    @Test(timeout=10000)
    public void startDRGElementArgumentsIsEmpty() {
        Logger logger = mock(Logger.class);
        new LoggingEventListener(logger).startDRGElement(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments());
    }

    @Test(timeout=10000)
    public void startRule() {
        Logger logger = mock(Logger.class);
        new LoggingEventListener(logger).startRule(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"));
    }
}
