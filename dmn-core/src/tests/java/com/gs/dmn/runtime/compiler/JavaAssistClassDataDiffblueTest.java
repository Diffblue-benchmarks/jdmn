package com.gs.dmn.runtime.compiler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.compiler.JavaAssistClassData
 *
 * @author Diffblue JCover
 */

public class JavaAssistClassDataDiffblueTest {

    @Test(timeout=10000)
    public void getBridgeMethodTextReturnsSomething() {
        assertThat(new JavaAssistClassData("/bin/bash", "/bin/bash", "something", "something").getBridgeMethodText(), is("something"));
    }

    @Test(timeout=10000)
    public void getMethodTextReturnsSomething() {
        assertThat(new JavaAssistClassData("/bin/bash", "/bin/bash", "something", "something").getMethodText(), is("something"));
    }
}
