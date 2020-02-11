package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TAssociationDirection
 *
 * @author Diffblue JCover
 */

public class TAssociationDirectionTest {

    @Test(timeout=10000)
    public void valueReturnsNone() {
        assertThat(TAssociationDirection.NONE.value(), is("None"));
    }

    @Test(timeout=10000)
    public void valuesReturnsNONEONEBOTH() {
        TAssociationDirection[] result = TAssociationDirection.values();
        assertThat(result[0], is(TAssociationDirection.NONE));
        assertThat(result[1], is(TAssociationDirection.ONE));
        assertThat(result[2], is(TAssociationDirection.BOTH));
    }
}
