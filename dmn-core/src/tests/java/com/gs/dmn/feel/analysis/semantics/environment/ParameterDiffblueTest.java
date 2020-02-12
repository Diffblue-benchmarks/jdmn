package com.gs.dmn.feel.analysis.semantics.environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.environment.Parameter
 *
 * @author Diffblue JCover
 */

public class ParameterDiffblueTest {

    @Test(timeout=10000)
    public void isOptionalReturnsFalse() {
        Type type1 = mock(Type.class);
        assertThat(new Parameter("name", type1).isOptional(), is(false));
    }

    @Test(timeout=10000)
    public void isOptionalReturnsTrue() {
        Type type = mock(Type.class);
        assertThat(new Parameter("name", type, true, false).isOptional(), is(true));
    }

    @Test(timeout=10000)
    public void isVarArgReturnsFalse() {
        Type type1 = mock(Type.class);
        assertThat(new Parameter("name", type1).isVarArg(), is(false));
    }

    @Test(timeout=10000)
    public void isVarArgReturnsTrue() {
        Type type = mock(Type.class);
        assertThat(new Parameter("name", type, false, true).isVarArg(), is(true));
    }

    @Test(timeout=10000)
    public void testequals1() {
        Type type1 = mock(Type.class);
        assertThat(new Parameter("name", type1).equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void testequals2() {
        Type type = mock(Type.class);
        assertThat(new Parameter("name", type, true, false).equals("foo"), is(false));
    }
}
