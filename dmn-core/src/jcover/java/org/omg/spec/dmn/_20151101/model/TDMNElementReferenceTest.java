package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TDMNElementReference
 *
 * @author Diffblue JCover
 */

public class TDMNElementReferenceTest {

    @Test(timeout=10000)
    public void getHrefReturnsNull() {
        assertThat(new TDMNElementReference().getHref(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setHrefToFoo() {
        TDMNElementReference obj = new TDMNElementReference();
        obj.setHref("foo");
        assertThat(obj.getHref(), is("foo"));
    }
}
