package com.gs.dmn.transformation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.gs.dmn.log.BuildLogger;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.ToSimpleNameTransformer
 *
 * @author Diffblue JCover
 */

public class ToSimpleNameTransformerTest {

    @Test(timeout=10000)
    public void transformName() {
        assertThat(new ToSimpleNameTransformer().transformName("bar"), is("bar"));
        assertThat(new ToSimpleNameTransformer().transformName(""), is(""));
        assertThat(new ToSimpleNameTransformer().transformName("/bin/bash"), is("BinBash"));
    }

    @Test(timeout=10000)
    public void transformNameOldNameIsBarReturnsBar() {
        BuildLogger logger = mock(BuildLogger.class);
        assertThat(new ToSimpleNameTransformer(logger).transformName("bar"), is("bar"));
    }
}
