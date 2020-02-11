package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TElementCollection
 *
 * @author Diffblue JCover
 */

public class TElementCollectionTest {

    @Test(timeout=10000)
    public void getDrgElementReturnsEmpty() {
        TElementCollection obj = new TElementCollection();
        List<TDMNElementReference> result = obj.getDrgElement();
        assertTrue(result.isEmpty());
        assertThat(obj.getDrgElement(), sameInstance(result));
    }
}
