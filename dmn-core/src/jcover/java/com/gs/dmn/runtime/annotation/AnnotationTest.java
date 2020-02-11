package com.gs.dmn.runtime.annotation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.annotation.Annotation
 *
 * @author Diffblue JCover
 */

public class AnnotationTest {

    @Test(timeout=10000)
    public void getAnnotationReturnsGermany() {
        assertThat(new Annotation("/bin/bash", 1, "Germany").getAnnotation(), is("Germany"));
    }

    @Test(timeout=10000)
    public void getDecisionName() {
        assertThat(new Annotation("/bin/bash", 1, "Germany").getDecisionName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getRuleIndex() {
        assertThat(new Annotation("bar", 1, "Germany").getRuleIndex(), is(1));
        assertThat(new Annotation("/bin/bash", 0, "Germany").getRuleIndex(), is(0));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new Annotation("bar", 1, "Germany").equals("foo"), is(false));
        assertThat(new Annotation("bar", 1, "Germany").equals(null), is(false));
    }
}
