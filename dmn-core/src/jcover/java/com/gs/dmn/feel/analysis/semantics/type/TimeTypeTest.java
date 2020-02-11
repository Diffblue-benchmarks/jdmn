package com.gs.dmn.feel.analysis.semantics.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.type.TimeType
 *
 * @author Diffblue JCover
 */

public class TimeTypeTest {

    @Test(timeout=10000)
    public void equivalentToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new TimeType().equivalentTo(other), is(false));
    }

    @Test(timeout=10000)
    public void getMemberTypeMemberIsGifReturnsNull() {
        assertThat(TimeType.getMemberType("gif"), is(nullValue()));
    }
}
