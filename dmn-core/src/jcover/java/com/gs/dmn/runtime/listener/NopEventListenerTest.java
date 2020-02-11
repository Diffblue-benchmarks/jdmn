package com.gs.dmn.runtime.listener;

import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.listener.NopEventListener
 *
 * @author Diffblue JCover
 */

public class NopEventListenerTest {

    @Test(timeout=10000)
    public void endDRGElementArgumentsIsEmptyAndDurationIsOne() {
        new NopEventListener().endDRGElement(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments(), new Object(), 1L);
    }

    @Test(timeout=10000)
    public void endRule() {
        new NopEventListener().endRule(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"), new Object());
    }

    @Test(timeout=10000)
    public void matchRule() {
        new NopEventListener().matchRule(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"));
    }

    @Test(timeout=10000)
    public void startDRGElementArgumentsIsEmpty() {
        new NopEventListener().startDRGElement(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments());
    }

    @Test(timeout=10000)
    public void startRule() {
        new NopEventListener().startRule(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"));
    }
}
