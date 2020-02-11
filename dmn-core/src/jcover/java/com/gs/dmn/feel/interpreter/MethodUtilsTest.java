package com.gs.dmn.feel.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.interpreter.MethodUtils
 *
 * @author Diffblue JCover
 */

public class MethodUtilsTest {

    @Test(timeout=10000)
    public void resolveMethodArgumentTypesIsStringAndClsIsStringAndMethodNameIsBarReturnsNull() {
        Class[] argumentTypes = new Class[] { String.class };
        assertThat(MethodUtils.resolveMethod("bar", String.class, argumentTypes), is(nullValue()));
    }
}
