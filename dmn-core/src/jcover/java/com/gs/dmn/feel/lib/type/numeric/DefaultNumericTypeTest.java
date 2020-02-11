package com.gs.dmn.feel.lib.type.numeric;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.numeric.DefaultNumericType
 *
 * @author Diffblue JCover
 */

public class DefaultNumericTypeTest {

    @Test(timeout=10000)
    public void numericAdd() {
        Logger logger = mock(Logger.class);
        BigDecimal second = BigDecimal.valueOf(1L);
        assertThat(new DefaultNumericType(logger).numericAdd(BigDecimal.valueOf(0L), second), sameInstance(second));
    }

    @Test(timeout=10000)
    public void numericAddFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericAdd((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericAddSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericAdd(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericDivide() {
        Logger logger = mock(Logger.class);
        BigDecimal first = BigDecimal.valueOf(1L);
        assertThat(new DefaultNumericType(logger).numericDivide(first, BigDecimal.valueOf(1L)), sameInstance(first));
    }

    @Test(timeout=10000)
    public void numericEqual() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericEqual(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)), is(false));
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericEqual((BigDecimal)null, BigDecimal.valueOf(1L)), is(false));
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericEqual((BigDecimal)null, (BigDecimal)null), is(true));
    }

    @Test(timeout=10000)
    public void numericEqualReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericEqual(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)), is(true));
    }

    @Test(timeout=10000)
    public void numericEqualSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericEqual(BigDecimal.valueOf(1L), (BigDecimal)null), is(false));
    }

    @Test(timeout=10000)
    public void numericExponentiation() {
        Logger logger = mock(Logger.class);
        BigDecimal first = BigDecimal.valueOf(1L);
        assertThat(new DefaultNumericType(logger).numericExponentiation(first, BigDecimal.valueOf(0L)), sameInstance(first));
    }

    @Test(timeout=10000)
    public void numericExponentiationFirstIsNullAndSecondIsOneReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericExponentiation((BigDecimal)null, 1), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericExponentiationFirstIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericExponentiation((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericExponentiationSecondIsMinusOne() {
        Logger logger = mock(Logger.class);
        BigDecimal first = BigDecimal.valueOf(1L);
        assertThat(new DefaultNumericType(logger).numericExponentiation(first, -1), sameInstance(first));
    }

    @Test(timeout=10000)
    public void numericExponentiationSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericExponentiation(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericExponentiationSecondIsOne() {
        Logger logger = mock(Logger.class);
        BigDecimal first = BigDecimal.valueOf(1L);
        assertThat(new DefaultNumericType(logger).numericExponentiation(first, 1), sameInstance(first));
    }

    @Test(timeout=10000)
    public void numericExponentiationSecondIsOneReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericExponentiation(BigDecimal.valueOf(0L), 1), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericExponentiationSecondIsZero() {
        Logger logger = mock(Logger.class);
        BigDecimal first = BigDecimal.valueOf(1L);
        assertThat(new DefaultNumericType(logger).numericExponentiation(first, 0), sameInstance(first));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterEqualThan((BigDecimal)null, (BigDecimal)null), is(true));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanFirstIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterEqualThan((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterEqualThan(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)), is(false));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterEqualThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(0L)), is(true));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterEqualThan(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterThan((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsNullAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterThan((BigDecimal)null, (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterThan(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)), is(false));
    }

    @Test(timeout=10000)
    public void numericGreaterThanReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(0L)), is(true));
    }

    @Test(timeout=10000)
    public void numericGreaterThanSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericGreaterThan(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessEqualThan((BigDecimal)null, (BigDecimal)null), is(true));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessEqualThan((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessEqualThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(0L)), is(false));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessEqualThan(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)), is(true));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessEqualThan(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessThanFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessThan((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessThanFirstIsNullAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessThan((BigDecimal)null, (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessThanReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessThan(BigDecimal.valueOf(1L), BigDecimal.valueOf(0L)), is(false));
    }

    @Test(timeout=10000)
    public void numericLessThanReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessThan(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)), is(true));
    }

    @Test(timeout=10000)
    public void numericLessThanSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericLessThan(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericMultiply() {
        Logger logger = mock(Logger.class);
        BigDecimal first = BigDecimal.valueOf(0L);
        assertThat(new DefaultNumericType(logger).numericMultiply(first, BigDecimal.valueOf(1L)), sameInstance(first));
    }

    @Test(timeout=10000)
    public void numericMultiplyFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericMultiply((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericMultiplySecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericMultiply(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericNotEqualReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericNotEqual(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)), is(true));
    }

    @Test(timeout=10000)
    public void numericSubtract() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericSubtract(BigDecimal.valueOf(0L), BigDecimal.valueOf(1L)).toPlainString(), is("-1"));
    }

    @Test(timeout=10000)
    public void numericSubtractFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericSubtract((BigDecimal)null, BigDecimal.valueOf(1L)), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericSubtractSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericSubtract(BigDecimal.valueOf(1L), (BigDecimal)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericUnaryMinus() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericUnaryMinus(BigDecimal.valueOf(1L)).toPlainString(), is("-1"));
    }

    @Test(timeout=10000)
    public void numericUnaryMinusFirstIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultNumericType(logger).numericUnaryMinus((BigDecimal)null), is(nullValue()));
    }
}
