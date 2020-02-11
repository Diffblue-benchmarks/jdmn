package com.gs.dmn.feel.lib.type.time.pure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;
import java.time.temporal.TemporalAmount;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.time.pure.TemporalAmountDurationType
 *
 * @author Diffblue JCover
 */

public class TemporalAmountDurationTypeTest {

    @Test(timeout=10000)
    public void durationAdd1() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationAdd(first, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationAdd2() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationAdd((TemporalAmount)null, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationAdd3() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationAdd(first, (TemporalAmount)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationDivide1() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationDivide(first, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationDivide2() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationDivide((TemporalAmount)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationDivideSecondIsNull() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationDivide(first, (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationEqual1() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationEqual(first, second), is(false));
    }

    @Test(timeout=10000)
    public void durationEqual2() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationEqual((TemporalAmount)null, second), is(false));
    }

    @Test(timeout=10000)
    public void durationEqual3() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationEqual(first, (TemporalAmount)null), is(false));
    }

    @Test(timeout=10000)
    public void durationEqualReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationEqual((TemporalAmount)null, (TemporalAmount)null), is(true));
    }

    @Test(timeout=10000)
    public void durationGreaterEqualThan1() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationGreaterEqualThan((TemporalAmount)null, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationGreaterEqualThan2() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationGreaterEqualThan(first, (TemporalAmount)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationGreaterEqualThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationGreaterEqualThan((TemporalAmount)null, (TemporalAmount)null), is(false));
    }

    @Test(timeout=10000)
    public void durationGreaterThan1() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationGreaterThan((TemporalAmount)null, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationGreaterThan2() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationGreaterThan(first, (TemporalAmount)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationGreaterThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationGreaterThan((TemporalAmount)null, (TemporalAmount)null), is(false));
    }

    @Test(timeout=10000)
    public void durationLessEqualThan1() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationLessEqualThan((TemporalAmount)null, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationLessEqualThan2() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationLessEqualThan(first, (TemporalAmount)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationLessEqualThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationLessEqualThan((TemporalAmount)null, (TemporalAmount)null), is(false));
    }

    @Test(timeout=10000)
    public void durationLessThan1() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationLessThan((TemporalAmount)null, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationLessThan2() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationLessThan(first, (TemporalAmount)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationLessThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationLessThan((TemporalAmount)null, (TemporalAmount)null), is(false));
    }

    @Test(timeout=10000)
    public void durationMultiply1() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationMultiply(first, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationMultiply2() {
        Logger logger = mock(Logger.class);
        assertThat(new TemporalAmountDurationType(logger).durationMultiply((TemporalAmount)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationMultiplySecondIsNull() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationMultiply(first, (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationNotEqualReturnsTrue() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationNotEqual(first, second), is(true));
    }

    @Test(timeout=10000)
    public void durationSubtract1() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationSubtract(first, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationSubtract2() {
        Logger logger = mock(Logger.class);
        TemporalAmount second = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationSubtract((TemporalAmount)null, second), is(nullValue()));
    }

    @Test(timeout=10000)
    public void durationSubtract3() {
        Logger logger = mock(Logger.class);
        TemporalAmount first = mock(TemporalAmount.class);
        assertThat(new TemporalAmountDurationType(logger).durationSubtract(first, (TemporalAmount)null), is(nullValue()));
    }
}
