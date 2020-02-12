package com.gs.dmn.feel.synthesis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.synthesis.JavaOperator
 *
 * @author Diffblue JCover
 */

public class JavaOperatorDiffblueTest {

    @Test(timeout=10000)
    public void getAssociativityReturnsLEFT_RIGHT() {
        assertThat(new JavaOperator("/bin/bash", 1, false, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).getAssociativity(), is(JavaOperator.Associativity.LEFT_RIGHT));
    }

    @Test(timeout=10000)
    public void getCardinality() {
        assertThat(new JavaOperator("bar", 1, false, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).getCardinality(), is(1));
        assertThat(new JavaOperator("/bin/bash", 0, false, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).getCardinality(), is(0));
    }

    @Test(timeout=10000)
    public void getName() {
        assertThat(new JavaOperator("/bin/bash", 1, false, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getNotationReturnsINFIX() {
        assertThat(new JavaOperator("/bin/bash", 1, false, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).getNotation(), is(JavaOperator.Notation.INFIX));
    }

    @Test(timeout=10000)
    public void isCommutative() {
        assertThat(new JavaOperator("bar", 1, false, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).isCommutative(), is(false));
        assertThat(new JavaOperator("/bin/bash", 1, true, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX).isCommutative(), is(true));
    }
}
