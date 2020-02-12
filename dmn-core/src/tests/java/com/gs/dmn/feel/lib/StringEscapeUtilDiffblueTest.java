package com.gs.dmn.feel.lib;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.lib.StringEscapeUtil
 *
 * @author Diffblue JCover
 */

public class StringEscapeUtilDiffblueTest {

    @Test(timeout=10000)
    public void escapeFEEL() {
        assertThat(StringEscapeUtil.escapeFEEL(""), is(""));
        assertThat(StringEscapeUtil.escapeFEEL("foo"), is("foo"));
    }

    @Test(timeout=10000)
    public void escapeInString() {
        assertThat(StringEscapeUtil.escapeInString(""), is(""));
        assertThat(StringEscapeUtil.escapeInString("html"), is("html"));
    }

    @Test(timeout=10000)
    public void unescapeFEEL() {
        assertThat(StringEscapeUtil.unescapeFEEL(""), is(""));
        assertThat(StringEscapeUtil.unescapeFEEL("foo"), is("foo"));
    }
}
