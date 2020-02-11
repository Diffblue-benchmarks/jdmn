package com.gs.dmn.feel.analysis.semantics.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.type.NullType
 *
 * @author Diffblue JCover
 */

public class NullTypeTest {

    @Test(timeout=10000)
    public void conformsToReturnsTrue() {
        Type other = mock(Type.class);
        assertThat(new NullType().conformsTo(other), is(true));
    }

    @Test(timeout=10000)
    public void equivalentToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new NullType().equivalentTo(other), is(false));
    }

    @Test(timeout=10000)
    public void isValidReturnsTrue() {
        assertThat(new NullType().isValid(), is(true));
    }
}
