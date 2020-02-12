package com.gs.dmn.feel.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.interpreter.JavaFunctionInfo
 *
 * @author Diffblue JCover
 */

public class JavaFunctionInfoDiffblueTest {

    @Test(timeout=10000)
    public void convertArgumentsArgListIsEmptyReturnsEmpty() {
        assertTrue(new JavaFunctionInfo("bar", "/bin/bash", new ArrayList<String>()).convertArguments(new ArrayList<Object>()).isEmpty());
    }

    @Test(timeout=10000)
    public void getClassName() {
        assertThat(new JavaFunctionInfo("/bin/bash", "/bin/bash", new ArrayList<String>()).getClassName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getMethodName() {
        assertThat(new JavaFunctionInfo("/bin/bash", "/bin/bash", new ArrayList<String>()).getMethodName(), is("/bin/bash"));
    }
}
