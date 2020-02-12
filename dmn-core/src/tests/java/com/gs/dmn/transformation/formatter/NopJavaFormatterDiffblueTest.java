package com.gs.dmn.transformation.formatter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.formatter.NopJavaFormatter
 *
 * @author Diffblue JCover
 */

public class NopJavaFormatterDiffblueTest {

    @Test(timeout=10000)
    public void formatSource() {
        assertThat(new NopJavaFormatter().formatSource("yyyy-MM-dd"), is("yyyy-MM-dd"));
    }
}
