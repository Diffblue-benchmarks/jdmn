package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TNamedElement
 *
 * @author Diffblue JCover
 */

public class TNamedElementTest {

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new TNamedElement().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setName() {
        TNamedElement obj = new TNamedElement();
        obj.setName("/bin/bash");
        assertThat(obj.getName(), is("/bin/bash"));
    }
}
