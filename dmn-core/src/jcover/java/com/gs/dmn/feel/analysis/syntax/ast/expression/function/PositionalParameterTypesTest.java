package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameterTypes
 *
 * @author Diffblue JCover
 */

public class PositionalParameterTypesTest {

    @Test(timeout=10000)
    public void candidates1() {
        assertTrue(new PositionalParameterTypes(new ArrayList<com.gs.dmn.feel.analysis.semantics.type.Type>()).candidates().isEmpty());
    }

    @Test(timeout=10000)
    public void candidates2() {
        List<Type> types = new ArrayList<Type>();
        Type type = mock(Type.class);
        ((ArrayList<Type>)types).add(type);
        assertTrue(new PositionalParameterTypes(types).candidates().isEmpty());
    }

    @Test(timeout=10000)
    public void compatibleReturnsFalse() {
        List<Type> types = new ArrayList<Type>();
        Type type1 = mock(Type.class);
        ((ArrayList<Type>)types).add(type1);
        assertThat(new PositionalParameterTypes(types).compatible(new ArrayList<FormalParameter>()), is(false));
    }

    @Test(timeout=10000)
    public void compatibleReturnsTrue() {
        assertThat(new PositionalParameterTypes(new ArrayList<Type>()).compatible(new ArrayList<FormalParameter>()), is(true));
    }

    @Test(timeout=10000)
    public void getTypes() {
        List<Type> types = new ArrayList<Type>();
        assertThat(new PositionalParameterTypes(types).getTypes(), sameInstance(types));
    }

    @Test(timeout=10000)
    public void size() {
        assertThat(new PositionalParameterTypes(new ArrayList<Type>()).size(), is(0));
        assertThat(new PositionalParameterTypes(null).size(), is(0));
    }

    @Test(timeout=10000)
    public void sizeReturnsOne() {
        List<Type> types = new ArrayList<Type>();
        Type type = mock(Type.class);
        ((ArrayList<Type>)types).add(type);
        assertThat(new PositionalParameterTypes(types).size(), is(1));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new PositionalParameterTypes(new ArrayList<Type>()).equals("foo"), is(false));
        assertThat(new PositionalParameterTypes(new ArrayList<Type>()).equals(null), is(false));
    }
}
