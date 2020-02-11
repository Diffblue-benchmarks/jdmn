package org.omg.spec.dmn._20180521.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.Bounds
 *
 * @author Diffblue JCover
 */

public class BoundsTest {

    @Test(timeout=10000)
    public void getHeightReturnsZero() {
        assertEquals(0.0, new Bounds().getHeight(), 0);
    }

    @Test(timeout=10000)
    public void getWidthReturnsZero() {
        assertEquals(0.0, new Bounds().getWidth(), 0);
    }

    @Test(timeout=10000)
    public void getXReturnsZero() {
        assertEquals(0.0, new Bounds().getX(), 0);
    }

    @Test(timeout=10000)
    public void getYReturnsZero() {
        assertEquals(0.0, new Bounds().getY(), 0);
    }

    @Test(timeout=10000)
    public void setHeightToOne() {
        Bounds bounds = new Bounds();
        bounds.setHeight(1.0);
        assertEquals(1.0, bounds.getHeight(), 0);
    }

    @Test(timeout=10000)
    public void setWidthToOne() {
        Bounds bounds = new Bounds();
        bounds.setWidth(1.0);
        assertEquals(1.0, bounds.getWidth(), 0);
    }

    @Test(timeout=10000)
    public void setXToOne() {
        Bounds bounds = new Bounds();
        bounds.setX(1.0);
        assertEquals(1.0, bounds.getX(), 0);
    }

    @Test(timeout=10000)
    public void setYToOne() {
        Bounds bounds = new Bounds();
        bounds.setY(1.0);
        assertEquals(1.0, bounds.getY(), 0);
    }
}
