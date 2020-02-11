package com.gs.dmn.runtime.listener;

import static org.mockito.Mockito.mock;

import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.listener.CompositeListener
 *
 * @author Diffblue JCover
 */

public class CompositeListenerTest {

    @Test(timeout=10000)
    public void endDRGElementArgumentsIsEmptyAndDurationIsOne() {
        EventListener element = mock(EventListener.class);
        EventListener[] eventListeners = new EventListener[] { element };
        new CompositeListener(eventListeners).endDRGElement(new DRGElement("foo", "bar", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments(), new Object(), 1L);
    }

    @Test(timeout=10000)
    public void endRule() {
        EventListener element = mock(EventListener.class);
        EventListener[] eventListeners = new EventListener[] { element };
        new CompositeListener(eventListeners).endRule(new DRGElement("foo", "bar", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"), new Object());
    }

    @Test(timeout=10000)
    public void matchRule() {
        EventListener element = mock(EventListener.class);
        EventListener[] eventListeners = new EventListener[] { element };
        new CompositeListener(eventListeners).matchRule(new DRGElement("foo", "bar", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"));
    }

    @Test(timeout=10000)
    public void startDRGElement1() {
        new CompositeListener(null).startDRGElement(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments());
    }

    @Test(timeout=10000)
    public void startDRGElement2() {
        EventListener element = mock(EventListener.class);
        EventListener[] eventListeners = new EventListener[] { element };
        new CompositeListener(eventListeners).startDRGElement(new DRGElement("foo", "bar", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Arguments());
    }

    @Test(timeout=10000)
    public void startRule() {
        EventListener element = mock(EventListener.class);
        EventListener[] eventListeners = new EventListener[] { element };
        new CompositeListener(eventListeners).startRule(new DRGElement("foo", "bar", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1), new Rule(1, "Germany"));
    }
}
