package com.gs.dmn.feel.lib;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.lib.BigDecimalUtil
 *
 * @author Diffblue JCover
 */

public class BigDecimalUtilDiffblueTest {

    @Test(timeout=10000)
    public void abs() {
        BigDecimal number = BigDecimal.valueOf(1L);
        BigDecimal result = BigDecimalUtil.abs(number);
        assertThat(result.toPlainString(), is("1"));
        assertThat(number, sameInstance(result));
    }

    @Test(timeout=10000)
    public void absNumberIsNullReturnsNull() {
        assertThat(BigDecimalUtil.abs(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void ceiling() {
        BigDecimal number = BigDecimal.valueOf(1L);
        BigDecimal result = BigDecimalUtil.ceiling(number);
        assertThat(result.toPlainString(), is("1"));
        assertThat(number, sameInstance(result));
    }

    @Test(timeout=10000)
    public void ceilingNumberIsNullReturnsNull() {
        assertThat(BigDecimalUtil.ceiling(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void decimal() {
        assertThat(BigDecimalUtil.decimal(null, BigDecimal.valueOf(1L)), is(nullValue()));
        assertThat(BigDecimalUtil.decimal(BigDecimal.valueOf(1L), null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void even() {
        assertThat(BigDecimalUtil.even(null), is(nullValue()));
        assertThat(BigDecimalUtil.even(BigDecimal.valueOf(1L)), is(false));
        assertThat(BigDecimalUtil.even(BigDecimal.valueOf(0L)), is(true));
    }

    @Test(timeout=10000)
    public void expNumberIsNullReturnsNull() {
        assertThat(BigDecimalUtil.exp(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void floor() {
        BigDecimal number = BigDecimal.valueOf(1L);
        BigDecimal result = BigDecimalUtil.floor(number);
        assertThat(result.toPlainString(), is("1"));
        assertThat(number, sameInstance(result));
    }

    @Test(timeout=10000)
    public void floorNumberIsNullReturnsNull() {
        assertThat(BigDecimalUtil.floor(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void intModulo() {
        assertThat(BigDecimalUtil.intModulo(null, BigDecimal.valueOf(1L)), is(nullValue()));
        assertThat(BigDecimalUtil.intModulo(BigDecimal.valueOf(1L), null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void logNumberIsNullReturnsNull() {
        assertThat(BigDecimalUtil.log(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void max1() {
        List list = new ArrayList();
        ((ArrayList)list).add(BigDecimal.valueOf(1L));
        BigDecimal result = BigDecimalUtil.max(list);
        assertThat(result.toPlainString(), is("1"));
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(BigDecimal.class));
        assertThat(((BigDecimal)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void max2() {
        assertThat(BigDecimalUtil.max(new ArrayList()), is(nullValue()));
        assertThat(BigDecimalUtil.max(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void mean1() {
        List list = new ArrayList();
        ((ArrayList)list).add(BigDecimal.valueOf(1L));
        BigDecimal result = BigDecimalUtil.mean(list);
        assertThat(result.toPlainString(), is("1"));
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(BigDecimal.class));
        assertThat(((BigDecimal)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void mean2() {
        assertThat(BigDecimalUtil.mean(new ArrayList()), is(nullValue()));
        assertThat(BigDecimalUtil.mean(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void median1() {
        List list = new ArrayList();
        ((ArrayList)list).add(BigDecimal.valueOf(1L));
        BigDecimal result = BigDecimalUtil.median(list);
        assertThat(result.toPlainString(), is("1"));
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(BigDecimal.class));
        assertThat(((BigDecimal)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void median2() {
        assertThat(BigDecimalUtil.median(new ArrayList()), is(nullValue()));
        assertThat(BigDecimalUtil.median(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void min1() {
        List list = new ArrayList();
        ((ArrayList)list).add(BigDecimal.valueOf(1L));
        BigDecimal result = BigDecimalUtil.min(list);
        assertThat(result.toPlainString(), is("1"));
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(BigDecimal.class));
        assertThat(((BigDecimal)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void min2() {
        assertThat(BigDecimalUtil.min(new ArrayList()), is(nullValue()));
        assertThat(BigDecimalUtil.min(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void mode1() {
        List list = new ArrayList();
        Object object = 1;
        ((ArrayList)list).add(object);
        assertThat(BigDecimalUtil.mode(list).size(), is(1));
        assertThat(BigDecimalUtil.mode(list).get(0), sameInstance(object));
    }

    @Test(timeout=10000)
    public void mode2() {
        assertTrue(BigDecimalUtil.mode(new ArrayList()).isEmpty());
        assertThat(BigDecimalUtil.mode(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void modeReturnsNull() {
        List list = new ArrayList();
        ((ArrayList)list).add("foo");
        assertThat(BigDecimalUtil.mode(list), is(nullValue()));
    }

    @Test(timeout=10000)
    public void modulo1() {
        BigDecimal dividend = BigDecimal.valueOf(0L);
        BigDecimal result = BigDecimalUtil.modulo(dividend, BigDecimal.valueOf(1L));
        assertThat(result.toPlainString(), is("0"));
        assertThat(dividend, sameInstance(result));
    }

    @Test(timeout=10000)
    public void modulo2() {
        assertThat(BigDecimalUtil.modulo(null, BigDecimal.valueOf(1L)), is(nullValue()));
        assertThat(BigDecimalUtil.modulo(BigDecimal.valueOf(1L), null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericDivide() {
        assertThat(BigDecimalUtil.numericDivide(BigDecimal.valueOf(1L), BigDecimal.valueOf(0L)), is(nullValue()));
        assertThat(BigDecimalUtil.numericDivide(BigDecimal.valueOf(1L), null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void odd() {
        assertThat(BigDecimalUtil.odd(null), is(nullValue()));
        assertThat(BigDecimalUtil.odd(BigDecimal.valueOf(0L)), is(false));
        assertThat(BigDecimalUtil.odd(BigDecimal.valueOf(1L)), is(true));
    }

    @Test(timeout=10000)
    public void product1() {
        List list = new ArrayList();
        ((ArrayList)list).add(BigDecimal.valueOf(1L));
        BigDecimal result = BigDecimalUtil.product(list);
        assertThat(result.toPlainString(), is("1"));
        assertThat(list.size(), is(1));
        assertThat(list.get(0), instanceOf(BigDecimal.class));
        assertThat(((BigDecimal)list.get(0)), sameInstance(result));
    }

    @Test(timeout=10000)
    public void product2() {
        assertThat(BigDecimalUtil.product(new ArrayList()), is(nullValue()));
        assertThat(BigDecimalUtil.product(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void sqrtNumberIsNullReturnsNull() {
        assertThat(BigDecimalUtil.sqrt(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stddev() {
        assertThat(BigDecimalUtil.stddev(new ArrayList()), is(nullValue()));
        assertThat(BigDecimalUtil.stddev(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void sumListIsNullReturnsNull() {
        assertThat(BigDecimalUtil.sum(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void toPlainString() {
        assertThat(BigDecimalUtil.decimal(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)).toPlainString(), is("0.0"));
        assertThat(BigDecimalUtil.exp(BigDecimal.valueOf(1L)).toPlainString(), is("2.718281828459045"));
        assertThat(BigDecimalUtil.intModulo(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)).toPlainString(), is("0"));
        assertThat(BigDecimalUtil.log(BigDecimal.valueOf(1L)).toPlainString(), is("0.0"));
        assertThat(BigDecimalUtil.sqrt(BigDecimal.valueOf(1L)).toPlainString(), is("1.0"));
    }
}
