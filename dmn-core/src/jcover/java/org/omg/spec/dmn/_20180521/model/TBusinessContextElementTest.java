package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TBusinessContextElement
 *
 * @author Diffblue JCover
 */

public class TBusinessContextElementTest {

    @Test(timeout=10000)
    public void getURIReturnsNull() {
        assertThat(new TBusinessContextElement().getURI(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setURIToFoo() {
        TBusinessContextElement obj = new TBusinessContextElement();
        obj.setURI("foo");
        assertThat(obj.getURI(), is("foo"));
    }
}
