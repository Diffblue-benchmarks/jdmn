package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TContext
 *
 * @author Diffblue JCover
 */

public class TContextTest {

    @Test(timeout=10000)
    public void getContextEntryReturnsEmpty() {
        TContext obj = new TContext();
        List<TContextEntry> result = obj.getContextEntry();
        assertTrue(result.isEmpty());
        assertThat(obj.getContextEntry(), sameInstance(result));
    }
}
