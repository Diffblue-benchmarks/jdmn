package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TRelation
 *
 * @author Diffblue JCover
 */

public class TRelationTest {

    @Test(timeout=10000)
    public void getColumnReturnsEmpty() {
        TRelation obj = new TRelation();
        List<TInformationItem> result = obj.getColumn();
        assertTrue(result.isEmpty());
        assertThat(obj.getColumn(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getRowReturnsEmpty() {
        TRelation obj = new TRelation();
        List<TList> result = obj.getRow();
        assertTrue(result.isEmpty());
        assertThat(obj.getRow(), sameInstance(result));
    }
}
