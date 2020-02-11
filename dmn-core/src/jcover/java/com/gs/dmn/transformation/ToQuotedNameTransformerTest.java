package com.gs.dmn.transformation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.gs.dmn.log.BuildLogger;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.ToQuotedNameTransformer
 *
 * @author Diffblue JCover
 */

public class ToQuotedNameTransformerTest {

    @Test(timeout=10000)
    public void transformName1() {
        BuildLogger logger = mock(BuildLogger.class);
        assertThat(new ToQuotedNameTransformer(logger).transformName("/bin/bash"), is("'/bin/bash'"));
    }

    @Test(timeout=10000)
    public void transformName2() {
        assertThat(new ToQuotedNameTransformer().transformName("/bin/bash"), is("'/bin/bash'"));
        assertThat(new ToQuotedNameTransformer().transformName("bar"), is("bar"));
        assertThat(new ToQuotedNameTransformer().transformName(""), is(""));
    }
}
