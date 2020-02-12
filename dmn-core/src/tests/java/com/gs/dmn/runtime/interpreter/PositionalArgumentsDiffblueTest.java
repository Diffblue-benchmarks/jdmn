package com.gs.dmn.runtime.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.PositionalArguments
 *
 * @author Diffblue JCover
 */

public class PositionalArgumentsDiffblueTest {

    @Test(timeout=10000)
    public void add() {
        PositionalArguments positionalArguments = new PositionalArguments(null);
        Object arg = new Object();
        positionalArguments.add(arg);
        assertThat(positionalArguments.getArguments().size(), is(1));
        assertThat(positionalArguments.getArguments().get(0), sameInstance(arg));
    }

    @Test(timeout=10000)
    public void addArgIsFoo() {
        PositionalArguments positionalArguments = new PositionalArguments();
        Object arg = "foo";
        positionalArguments.add(arg);
        assertThat(positionalArguments.getArguments().size(), is(1));
        assertThat(positionalArguments.getArguments().get(0), sameInstance(arg));
    }

    @Test(timeout=10000)
    public void argumentListFormalParametersIsEmpty() {
        List<Object> arguments = new ArrayList<Object>();
        assertThat(new PositionalArguments(arguments).argumentList(new ArrayList<com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter>()), sameInstance(arguments));
    }

    @Test(timeout=10000)
    public void getArguments() {
        List<Object> arguments = new ArrayList<Object>();
        assertThat(new PositionalArguments(arguments).getArguments(), sameInstance(arguments));
    }
}
