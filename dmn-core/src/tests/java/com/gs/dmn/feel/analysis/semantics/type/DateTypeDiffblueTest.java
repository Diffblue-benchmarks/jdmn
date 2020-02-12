package com.gs.dmn.feel.analysis.semantics.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.type.DateType
 *
 * @author Diffblue JCover
 */

public class DateTypeDiffblueTest {

    @Test(timeout=10000)
    public void conformsToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new DateType().conformsTo(other), is(false));
    }

    @Test(timeout=10000)
    public void equivalentToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new DateType().equivalentTo(other), is(false));
    }

    @Test(timeout=10000)
    public void getMemberTypeMemberIsGifReturnsNull() {
        assertThat(DateType.getMemberType("gif"), is(nullValue()));
    }
}
