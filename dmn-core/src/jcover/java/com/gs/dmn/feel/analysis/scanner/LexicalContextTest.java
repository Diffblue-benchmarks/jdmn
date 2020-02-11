package com.gs.dmn.feel.analysis.scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.scanner.LexicalContext
 *
 * @author Diffblue JCover
 */

public class LexicalContextTest {

    @Test(timeout=10000)
    public void addNameNameIsBar() {
        new LexicalContext(new java.util.ArrayList<String>()).addName("bar");
    }

    @Test(timeout=10000)
    public void addNames1() {
        new LexicalContext((java.util.List<String>)null).addNames(new ArrayList<String>());
    }

    @Test(timeout=10000)
    public void addNames2() {
        List<String> names2 = new ArrayList<String>();
        ((ArrayList<String>)names2).add("/bin/bash");
        new LexicalContext(new ArrayList<String>()).addNames(names2);
    }

    @Test(timeout=10000)
    public void addNames3() {
        new LexicalContext().addNames(new ArrayList<String>());
    }

    @Test(timeout=10000)
    public void orderedNames() {
        List<String> names1 = new ArrayList<String>();
        assertThat(new LexicalContext(names1).orderedNames(), sameInstance(names1));
    }

    @Test(timeout=10000)
    public void orderedNamesReturnsBarFoo() {
        String[] names = new String[] { "bar", "foo" };
        assertThat(new LexicalContext(names).orderedNames().size(), is(2));
        assertThat(new LexicalContext(names).orderedNames().get(0), is("bar"));
        assertThat(new LexicalContext(names).orderedNames().get(1), is("foo"));
    }

    @Test(timeout=10000)
    public void orderedNamesReturnsEmpty() {
        assertTrue(new LexicalContext((String[])null).orderedNames().isEmpty());
    }

    @Test(timeout=10000)
    public void orderedNamesReturnsFoo() {
        String[] names = new String[] { "foo" };
        assertThat(new LexicalContext(names).orderedNames().size(), is(1));
        assertThat(new LexicalContext(names).orderedNames().get(0), is("foo"));
    }
}
