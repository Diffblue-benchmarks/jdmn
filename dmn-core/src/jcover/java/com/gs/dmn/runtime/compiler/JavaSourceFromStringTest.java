package com.gs.dmn.runtime.compiler;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.compiler.JavaSourceFromString
 *
 * @author Diffblue JCover
 */

public class JavaSourceFromStringTest {

    @Test(timeout=10000)
    public void deleteReturnsFalse() {
        assertThat(new JavaSourceFromString("/bin/bash", "OX13QD").delete(), is(false));
    }

    @Test(timeout=10000)
    public void getCharContentIgnoreEncodingErrorsIsFalse() {
        String code = "OX13QD";
        assertThat(new JavaSourceFromString("/bin/bash", code).getCharContent(false), instanceOf(String.class));
        assertThat(((String)new JavaSourceFromString("/bin/bash", code).getCharContent(false)), sameInstance(code));
    }
}
