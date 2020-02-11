package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey
 *
 * @author Diffblue JCover
 */

public class ContextEntryKeyTest {

    @Test(timeout=10000)
    public void getKeyReturnsSmith() {
        assertThat(new ContextEntryKey("Smith").getKey(), is("Smith"));
    }
}
