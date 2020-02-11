package com.gs.dmn.runtime.compiler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.compiler.JavaxToolsClassData
 *
 * @author Diffblue JCover
 */

public class JavaxToolsClassDataTest {

    @Test(timeout=10000)
    public void getClassTextReturnsSomething() {
        assertThat(new JavaxToolsClassData("/bin/bash", "/bin/bash", "something").getClassText(), is("something"));
    }
}
