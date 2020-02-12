package com.gs.dmn.runtime.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.ImportPath
 *
 * @author Diffblue JCover
 */

public class ImportPathDiffblueTest {

    @Test(timeout=10000)
    public void asString() {
        assertThat(new ImportPath(".").asString(), is("."));
        assertThat(new ImportPath("").asString(), is(""));
    }

    @Test(timeout=10000)
    public void getPathElementsReturnsBar() {
        ImportPath importPath = new ImportPath("bar");
        List<String> result = importPath.getPathElements();
        assertThat(result.size(), is(1));
        assertThat(result.get(0), is("bar"));
        assertThat(importPath.getPathElements(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(new ImportPath("").isEmpty(), is(true));
        assertThat(ImportPath.isEmpty("bar"), is(false));
        assertThat(ImportPath.isEmpty(""), is(true));
        assertThat(ImportPath.isEmpty(new ImportPath("")), is(true));
        assertThat(ImportPath.isEmpty((ImportPath)null), is(true));
        assertThat(ImportPath.isEmpty(new ImportPath("bar")), is(false));
        assertThat(new ImportPath("bar").isEmpty(), is(false));
    }
}
