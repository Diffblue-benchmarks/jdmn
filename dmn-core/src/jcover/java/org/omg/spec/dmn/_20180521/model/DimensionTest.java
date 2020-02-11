package org.omg.spec.dmn._20180521.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.Dimension
 *
 * @author Diffblue JCover
 */

public class DimensionTest {

    @Test(timeout=10000)
    public void getHeightReturnsZero() {
        assertEquals(0.0, new Dimension().getHeight(), 0);
    }

    @Test(timeout=10000)
    public void getWidthReturnsZero() {
        assertEquals(0.0, new Dimension().getWidth(), 0);
    }

    @Test(timeout=10000)
    public void setHeightToOne() {
        Dimension dimension = new Dimension();
        dimension.setHeight(1.0);
        assertEquals(1.0, dimension.getHeight(), 0);
    }

    @Test(timeout=10000)
    public void setWidthToOne() {
        Dimension dimension = new Dimension();
        dimension.setWidth(1.0);
        assertEquals(1.0, dimension.getWidth(), 0);
    }
}
