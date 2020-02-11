package com.gs.dmn.runtime.interpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.NamedArguments
 *
 * @author Diffblue JCover
 */

public class NamedArgumentsTest {

    @Test(timeout=10000)
    public void addArgIsFooAndNameIsBar() {
        NamedArguments namedArguments = new NamedArguments();
        Object arg = "foo";
        namedArguments.add("bar", arg);
        assertThat(namedArguments.getArguments().get("bar"), sameInstance(arg));
    }

    @Test(timeout=10000)
    public void argumentList1() {
        Map<String, Object> arguments = new HashMap<String, Object>();
        Object x4 = "foo";
        ((HashMap<String, Object>)arguments).put("bar", x4);
        List<FormalParameter> formalParameters = new ArrayList<FormalParameter>();
        Type type = mock(Type.class);
        ((ArrayList<FormalParameter>)formalParameters).add(new FormalParameter("bar", type));
        assertThat(new NamedArguments(arguments).argumentList(formalParameters).size(), is(1));
        assertThat(new NamedArguments(arguments).argumentList(formalParameters).get(0), sameInstance(x4));
    }

    @Test(timeout=10000)
    public void argumentList2() {
        assertTrue(new NamedArguments().argumentList(new ArrayList<FormalParameter>()).isEmpty());
        assertTrue(new NamedArguments(null).argumentList(new ArrayList<FormalParameter>()).isEmpty());
    }

    @Test(timeout=10000)
    public void getArgumentsReturnsEmpty() {
        NamedArguments namedArguments = new NamedArguments();
        Map<String, Object> result = namedArguments.getArguments();
        assertThat(result.isEmpty(), is(true));
        assertThat(namedArguments.getArguments(), sameInstance(result));
    }
}
