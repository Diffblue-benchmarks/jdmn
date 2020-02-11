package com.gs.dmn.feel.lib;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.lib.StringUtil
 *
 * @author Diffblue JCover
 */

public class StringUtilTest {

    @Test(timeout=10000)
    public void contains() {
        assertThat(StringUtil.contains("foo", null), is(nullValue()));
        assertThat(StringUtil.contains("bar", "foo"), is(false));
        assertThat(StringUtil.contains(null, "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void endsWith() {
        assertThat(StringUtil.endsWith("foo", null), is(nullValue()));
        assertThat(StringUtil.endsWith("bar", "foo"), is(false));
        assertThat(StringUtil.endsWith(null, "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void lowerCase() {
        assertThat(StringUtil.lowerCase("foo"), is("foo"));
        assertThat(StringUtil.lowerCase(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void matches() throws Exception {
        assertThat(StringUtil.matches("foo", "foo", ""), is(true));
        assertThat(StringUtil.matches(null, "foo", "foo"), is(false));
        assertThat(StringUtil.matches("foo", null, "foo"), is(false));
        assertThat(StringUtil.matches("foo", "foo", null), is(true));
    }

    @Test(timeout=10000)
    public void replace() throws Exception {
        assertThat(StringUtil.replace("foo", "foo", "accounting", ""), is("accounting"));
        assertThat(StringUtil.replace("foo", "foo", "accounting", null), is("accounting"));
        assertThat(StringUtil.replace(null, "foo", "accounting", "foo"), is(nullValue()));
        assertThat(StringUtil.replace("foo", null, "accounting", "foo"), is(nullValue()));
        assertThat(StringUtil.replace("foo", "foo", null, "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void split1() {
        String string = "foo";
        assertThat(StringUtil.split(string, " ").size(), is(1));
        assertThat(StringUtil.split(string, " ").get(0), instanceOf(String.class));
        assertThat(((String)StringUtil.split(string, " ").get(0)), sameInstance(string));
    }

    @Test(timeout=10000)
    public void split2() {
        assertThat(StringUtil.split("foo", ""), is(nullValue()));
        assertThat(StringUtil.split("foo", "foo").size(), is(2));
        assertThat(StringUtil.split("foo", "foo").get(0), instanceOf(String.class));
        assertThat(((String)StringUtil.split("foo", "foo").get(0)), is(""));
        assertThat(StringUtil.split("foo", "foo").get(1), instanceOf(String.class));
        assertThat(((String)StringUtil.split("foo", "foo").get(1)), is(""));
        assertThat(StringUtil.split("foo", null), is(nullValue()));
        assertThat(StringUtil.split("", " "), is(nullValue()));
        assertThat(StringUtil.split(null, " "), is(nullValue()));
    }

    @Test(timeout=10000)
    public void startsWith() {
        assertThat(StringUtil.startsWith("New York", null), is(nullValue()));
        assertThat(StringUtil.startsWith("bar", "New York"), is(false));
        assertThat(StringUtil.startsWith(null, "New York"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringLength() {
        assertThat(StringUtil.stringLength(""), is(0L));
        assertThat(StringUtil.stringLength("foo"), is(3L));
    }

    @Test(timeout=10000)
    public void stripQuotes() {
        assertThat(StringUtil.stripQuotes(""), is(""));
        assertThat(StringUtil.stripQuotes("foo"), is("foo"));
    }

    @Test(timeout=10000)
    public void substring() {
        assertThat(StringUtil.substring("foo", 1, null), is(nullValue()));
        assertThat(StringUtil.substring("foo", 1, 1), is("f"));
        assertThat(StringUtil.substring("foo", 1), is("foo"));
        assertThat(StringUtil.substring("foo", -1), is("o"));
        assertThat(StringUtil.substring("foo", -1, 1), is("o"));
        assertThat(StringUtil.substring("foo", null), is(nullValue()));
        assertThat(StringUtil.substring("foo", null, 1), is(nullValue()));
        assertThat(StringUtil.substring(null, 1), is(nullValue()));
        assertThat(StringUtil.substring(null, 1, 1), is(nullValue()));
    }

    @Test(timeout=10000)
    public void substringAfter() {
        assertThat(StringUtil.substringAfter("foo", ""), is("foo"));
        assertThat(StringUtil.substringAfter("bar", "foo"), is(""));
        assertThat(StringUtil.substringAfter(null, "foo"), is(nullValue()));
        assertThat(StringUtil.substringAfter("foo", null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void substringBefore() {
        assertThat(StringUtil.substringBefore("foo", null), is(nullValue()));
        assertThat(StringUtil.substringBefore("bar", "foo"), is(""));
        assertThat(StringUtil.substringBefore("foo", "foo"), is(""));
        assertThat(StringUtil.substringBefore(null, "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void upperCase() {
        assertThat(StringUtil.upperCase("foo"), is("FOO"));
        assertThat(StringUtil.upperCase(null), is(nullValue()));
    }
}
