package org.omg.spec.dmn._20180521.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.Point
 *
 * @author Diffblue JCover
 */

public class PointTest {

    @Test(timeout=10000)
    public void getXReturnsZero() {
        assertEquals(0.0, new Point().getX(), 0);
    }

    @Test(timeout=10000)
    public void getYReturnsZero() {
        assertEquals(0.0, new Point().getY(), 0);
    }

    @Test(timeout=10000)
    public void setXToOne() {
        Point point = new Point();
        point.setX(1.0);
        assertEquals(1.0, point.getX(), 0);
    }

    @Test(timeout=10000)
    public void setYToOne() {
        Point point = new Point();
        point.setY(1.0);
        assertEquals(1.0, point.getY(), 0);
    }
}
