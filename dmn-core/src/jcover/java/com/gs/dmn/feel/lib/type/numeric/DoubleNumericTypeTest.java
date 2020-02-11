package com.gs.dmn.feel.lib.type.numeric;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.numeric.DoubleNumericType
 *
 * @author Diffblue JCover
 */

public class DoubleNumericTypeTest {

    @Test(timeout=10000)
    public void numericAddFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericAdd((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericAddReturnsTwo() {
        Logger logger = mock(Logger.class);
        assertEquals(2.0, new DoubleNumericType(logger).numericAdd((Double)1.0, (Double)1.0), 0);
    }

    @Test(timeout=10000)
    public void numericAddSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericAdd((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericDivideFirstIsOneAndSecondIsOneReturnsOne() {
        Logger logger = mock(Logger.class);
        assertEquals(1.0, new DoubleNumericType(logger).numericDivide((Double)1.0, (Double)1.0), 0);
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsNaN() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericEqual((Double)Double.NaN, (Double)1.0), is(false));
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericEqual((Double)null, (Double)1.0), is(false));
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericEqual((Double)null, (Double)null), is(true));
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsOneAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericEqual((Double)1.0, (Double)null), is(false));
    }

    @Test(timeout=10000)
    public void numericEqualFirstIsOneReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericEqual((Double)1.0, (Double)1.0), is(true));
    }

    @Test(timeout=10000)
    public void numericExponentiationFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericExponentiation((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericExponentiationReturnsOne() {
        Logger logger = mock(Logger.class);
        assertEquals(1.0, new DoubleNumericType(logger).numericExponentiation((Double)1.0, (Double)1.0), 0);
    }

    @Test(timeout=10000)
    public void numericExponentiationSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericExponentiation((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterEqualThan((Double)null, (Double)null), is(true));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanFirstIsNullAndSecondIsOneReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterEqualThan((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanSecondIsNaNReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterEqualThan((Double)1.0, (Double)Double.NaN), is(false));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterEqualThan((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterEqualThanSecondIsOneReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterEqualThan((Double)1.0, (Double)1.0), is(true));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsNaNReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterThan((Double)Double.NaN, (Double)1.0), is(true));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterThan((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsNullAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterThan((Double)null, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsOneAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterThan((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericGreaterThanFirstIsOneReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericGreaterThan((Double)1.0, (Double)1.0), is(false));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsNaNReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessEqualThan((Double)Double.NaN, (Double)1.0), is(false));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessEqualThan((Double)null, (Double)null), is(true));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessEqualThan((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsOneAndSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessEqualThan((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessEqualThanFirstIsOneReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessEqualThan((Double)1.0, (Double)1.0), is(true));
    }

    @Test(timeout=10000)
    public void numericLessThanFirstIsNullAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessThan((Double)null, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessThanFirstIsNullAndSecondIsOne() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessThan((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessThanSecondIsNaNReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessThan((Double)1.0, (Double)Double.NaN), is(true));
    }

    @Test(timeout=10000)
    public void numericLessThanSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessThan((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericLessThanSecondIsOneReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericLessThan((Double)1.0, (Double)1.0), is(false));
    }

    @Test(timeout=10000)
    public void numericMultiplyFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericMultiply((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericMultiplyReturnsOne() {
        Logger logger = mock(Logger.class);
        assertEquals(1.0, new DoubleNumericType(logger).numericMultiply((Double)1.0, (Double)1.0), 0);
    }

    @Test(timeout=10000)
    public void numericMultiplySecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericMultiply((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericNotEqualFirstIsOneAndSecondIsOneReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericNotEqual((Double)1.0, (Double)1.0), is(false));
    }

    @Test(timeout=10000)
    public void numericSubtractFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericSubtract((Double)null, (Double)1.0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericSubtractReturnsZero() {
        Logger logger = mock(Logger.class);
        assertEquals(0.0, new DoubleNumericType(logger).numericSubtract((Double)1.0, (Double)1.0), 0);
    }

    @Test(timeout=10000)
    public void numericSubtractSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericSubtract((Double)1.0, (Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericUnaryMinusFirstIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DoubleNumericType(logger).numericUnaryMinus((Double)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void numericUnaryMinusFirstIsOneReturnsMinusOne() {
        Logger logger = mock(Logger.class);
        assertEquals(-1.0, new DoubleNumericType(logger).numericUnaryMinus((Double)1.0), 0);
    }
}
