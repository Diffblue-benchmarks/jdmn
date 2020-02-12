package com.gs.dmn.feel.analysis.semantics.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.type.EnumerationType
 *
 * @author Diffblue JCover
 */

public class EnumerationTypeDiffblueTest {

    @Test(timeout=10000)
    public void equivalentToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new EnumerationType().equivalentTo(other), is(false));
    }
}
