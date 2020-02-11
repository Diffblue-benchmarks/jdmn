package com.gs.dmn.feel.lib.type.logic;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.logic.DefaultBooleanType
 *
 * @author Diffblue JCover
 */

public class DefaultBooleanTypeTest {

    @Test(timeout=10000)
    public void booleanAndOperandsIsEmptyReturnsNull1() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanAnd(new ArrayList<Object>()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanAndOperandsIsEmptyReturnsNull2() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanAnd(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanAndReturnsFalse1() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { false, "foo" };
        Boolean result = new DefaultBooleanType(logger).booleanAnd(operands);
        assertThat(operands[0], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[0]), sameInstance(result));
        assertThat(result, is(false));
    }

    @Test(timeout=10000)
    public void booleanAndReturnsFalse2() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { "foo", false };
        Boolean result = new DefaultBooleanType(logger).booleanAnd(operands);
        assertThat(operands[1], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[1]), sameInstance(result));
        assertThat(result, is(false));
    }

    @Test(timeout=10000)
    public void booleanAndReturnsFalse3() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { true, false };
        Boolean result = new DefaultBooleanType(logger).booleanAnd(operands);
        assertThat(operands[1], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[1]), sameInstance(result));
        assertThat(result, is(false));
    }

    @Test(timeout=10000)
    public void booleanAndReturnsNull1() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanAnd((Boolean)true, "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanAndReturnsNull2() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanAnd("bar", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanAndReturnsTrue() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { true, true };
        Boolean result = new DefaultBooleanType(logger).booleanAnd(operands);
        assertThat(operands[0], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[0]), sameInstance(result));
        assertThat(operands[1], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[1]), sameInstance(result));
        assertThat(result, is(true));
    }

    @Test(timeout=10000)
    public void booleanEqualFirstIsFalseAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanEqual(false, null), is(false));
    }

    @Test(timeout=10000)
    public void booleanEqualFirstIsNullAndSecondIsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanEqual(null, false), is(false));
    }

    @Test(timeout=10000)
    public void booleanEqualFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanEqual(null, null), is(true));
    }

    @Test(timeout=10000)
    public void booleanEqualFirstIsTrueAndSecondIsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanEqual(true, false), is(false));
    }

    @Test(timeout=10000)
    public void booleanNotEqualFirstIsFalseReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanNotEqual(false, false), is(false));
    }

    @Test(timeout=10000)
    public void booleanNotEqualFirstIsTrueReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanNotEqual(true, false), is(true));
    }

    @Test(timeout=10000)
    public void booleanNotReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanNot(new Object()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanOrOperandsIsEmptyReturnsNull1() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanOr(new ArrayList<Object>()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanOrOperandsIsEmptyReturnsNull2() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanOr(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanOrReturnsFalse() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { false, false };
        Boolean result = new DefaultBooleanType(logger).booleanOr(operands);
        assertThat(operands[0], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[0]), sameInstance(result));
        assertThat(operands[1], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[1]), sameInstance(result));
        assertThat(result, is(false));
    }

    @Test(timeout=10000)
    public void booleanOrReturnsNull1() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanOr((Boolean)false, "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanOrReturnsNull2() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultBooleanType(logger).booleanOr("foo", (Boolean)false), is(nullValue()));
    }

    @Test(timeout=10000)
    public void booleanOrReturnsTrue1() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { true, false };
        Boolean result = new DefaultBooleanType(logger).booleanOr(operands);
        assertThat(operands[0], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[0]), sameInstance(result));
        assertThat(result, is(true));
    }

    @Test(timeout=10000)
    public void booleanOrReturnsTrue2() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { false, true };
        Boolean result = new DefaultBooleanType(logger).booleanOr(operands);
        assertThat(operands[1], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[1]), sameInstance(result));
        assertThat(result, is(true));
    }

    @Test(timeout=10000)
    public void booleanOrReturnsTrue3() {
        Logger logger = mock(Logger.class);
        Object[] operands = new Object[] { "foo", true };
        Boolean result = new DefaultBooleanType(logger).booleanOr(operands);
        assertThat(operands[1], instanceOf(Boolean.class));
        assertThat(((Boolean)operands[1]), sameInstance(result));
        assertThat(result, is(true));
    }
}
