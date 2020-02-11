package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TList
 *
 * @author Diffblue JCover
 */

public class TListTest {

    @Test(timeout=10000)
    public void getExpressionReturnsEmpty() {
        TList obj = new TList();
        List<javax.xml.bind.JAXBElement<? extends TExpression>> result = obj.getExpression();
        assertTrue(result.isEmpty());
        assertThat(obj.getExpression(), sameInstance(result));
    }
}
