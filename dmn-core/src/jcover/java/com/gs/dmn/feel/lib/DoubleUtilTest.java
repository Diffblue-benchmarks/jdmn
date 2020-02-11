package com.gs.dmn.feel.lib;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.lib.DoubleUtil
 *
 * @author Diffblue JCover
 */

public class DoubleUtilTest {

    @Test(timeout=10000)
    public void abs() {
        assertThat(DoubleUtil.abs(null), is(nullValue()));
        assertEquals(1.0, DoubleUtil.abs(1.0), 0);
    }

    @Test(timeout=10000)
    public void ceiling() {
        assertThat(DoubleUtil.ceiling(null), is(nullValue()));
        assertEquals(1.0, DoubleUtil.ceiling(1.0), 0);
    }

    @Test(timeout=10000)
    public void decimal() {
        assertThat(DoubleUtil.decimal(null, 1.0), is(nullValue()));
        assertEquals(1.0, DoubleUtil.decimal(1.0, 1.0), 0);
        assertThat(DoubleUtil.decimal(1.0, null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void even() {
        assertThat(DoubleUtil.even(Double.NaN), is(nullValue()));
        assertThat(DoubleUtil.even(null), is(nullValue()));
        assertThat(DoubleUtil.even(1.0), is(false));
    }

    @Test(timeout=10000)
    public void exp() {
        assertThat(DoubleUtil.exp(null), is(nullValue()));
        assertEquals(0x1.5bf0a8b145769p+1 /* 2.71828 */, DoubleUtil.exp(1.0), 0);
    }

    @Test(timeout=10000)
    public void floor() {
        assertThat(DoubleUtil.floor(null), is(nullValue()));
        assertEquals(1.0, DoubleUtil.floor(1.0), 0);
    }

    @Test(timeout=10000)
    public void intModulo() {
        assertThat(DoubleUtil.intModulo(null, 1.0), is(nullValue()));
        assertThat(DoubleUtil.intModulo(1.0, null), is(nullValue()));
        assertEquals(0.0, DoubleUtil.intModulo(1.0, 1.0), 0);
    }

    @Test(timeout=10000)
    public void log() {
        assertThat(DoubleUtil.log(null), is(nullValue()));
        assertEquals(0.0, DoubleUtil.log(1.0), 0);
    }

    @Test(timeout=10000)
    public void mean() {
        assertThat(DoubleUtil.mean(new ArrayList()), is(nullValue()));
        assertThat(DoubleUtil.mean(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void meanReturnsOne() {
        List list = new ArrayList();
        ((ArrayList)list).add(1.0);
        assertEquals(1.0, DoubleUtil.mean(list), 0);
    }

    @Test(timeout=10000)
    public void median() {
        assertThat(DoubleUtil.median(new ArrayList()), is(nullValue()));
        assertThat(DoubleUtil.median(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void medianReturnsOne() {
        List list = new ArrayList();
        ((ArrayList)list).add(1.0);
        Double result = DoubleUtil.median(list);
        assertEquals(1.0, result, 0);
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(Double.class));
        assertThat(((Double)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void min() {
        assertThat(DoubleUtil.min(new ArrayList()), is(nullValue()));
        assertThat(DoubleUtil.min(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void minReturnsOne() {
        List list = new ArrayList();
        ((ArrayList)list).add(1.0);
        Double result = DoubleUtil.min(list);
        assertEquals(1.0, result, 0);
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(Double.class));
        assertThat(((Double)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void mode1() {
        List list = new ArrayList();
        Object object = 1;
        ((ArrayList)list).add(object);
        assertThat(DoubleUtil.mode(list).size(), is(1));
        assertThat(DoubleUtil.mode(list).get(0), sameInstance(object));
    }

    @Test(timeout=10000)
    public void mode2() {
        assertTrue(DoubleUtil.mode(new ArrayList()).isEmpty());
        assertThat(DoubleUtil.mode(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void modeReturnsNull() {
        List list = new ArrayList();
        ((ArrayList)list).add("foo");
        assertThat(DoubleUtil.mode(list), is(nullValue()));
    }

    @Test(timeout=10000)
    public void modulo() {
        assertThat(DoubleUtil.modulo(null, 1.0), is(nullValue()));
        assertThat(DoubleUtil.modulo(1.0, null), is(nullValue()));
        assertEquals(0.0, DoubleUtil.modulo(1.0, 1.0), 0);
    }

    @Test(timeout=10000)
    public void numericDivide() {
        assertEquals(0.0, DoubleUtil.numericDivide(0.0, 1.0), 0);
        assertThat(DoubleUtil.numericDivide(1.0, null), is(nullValue()));
        assertThat(DoubleUtil.numericDivide(1.0, 0.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void odd() {
        assertThat(DoubleUtil.odd(Double.NaN), is(nullValue()));
        assertThat(DoubleUtil.odd(null), is(nullValue()));
        assertThat(DoubleUtil.odd(1.0), is(true));
    }

    @Test(timeout=10000)
    public void product() {
        assertThat(DoubleUtil.product(new ArrayList()), is(nullValue()));
        assertThat(DoubleUtil.product(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void productReturnsOne() {
        List list = new ArrayList();
        ((ArrayList)list).add(1.0);
        assertEquals(1.0, DoubleUtil.product(list), 0);
    }

    @Test(timeout=10000)
    public void sqrt() {
        assertThat(DoubleUtil.sqrt(null), is(nullValue()));
        assertEquals(1.0, DoubleUtil.sqrt(1.0), 0);
    }

    @Test(timeout=10000)
    public void stddev() {
        assertThat(DoubleUtil.stddev(new ArrayList()), is(nullValue()));
        assertThat(DoubleUtil.stddev(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stddevReturnsNaN() {
        List list = new ArrayList();
        ((ArrayList)list).add(1.0);
        assertTrue(Double.isNaN(DoubleUtil.stddev(list)));
    }

    @Test(timeout=10000)
    public void sumListIsNullReturnsNull() {
        assertThat(DoubleUtil.sum(null), is(nullValue()));
    }
}
