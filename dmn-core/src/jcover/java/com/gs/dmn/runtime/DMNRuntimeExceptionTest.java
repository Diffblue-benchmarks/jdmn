package com.gs.dmn.runtime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.DMNRuntimeException
 *
 * @author Diffblue JCover
 */

public class DMNRuntimeExceptionTest {

    @Test(timeout=10000)
    public void constructor() {
        DMNRuntimeException obj = new DMNRuntimeException("jpg");
        assertThat(obj.getCause(), is(nullValue()));
        assertThat(obj.getLocalizedMessage(), is("jpg"));
        assertThat(obj.getMessage(), is("jpg"));
        // array literal with unexpected element type StackTraceElement
        // array literal with unexpected element type Throwable
    }
}
