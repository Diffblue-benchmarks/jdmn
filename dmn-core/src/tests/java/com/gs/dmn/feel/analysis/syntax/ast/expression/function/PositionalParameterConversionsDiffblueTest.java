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
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameterConversions
 *
 * @author Diffblue JCover
 */

public class PositionalParameterConversionsDiffblueTest {

    @Test(timeout=10000)
    public void add() {
        PositionalParameterConversions positionalParameterConversions = new PositionalParameterConversions();
        Type elementType = mock(Type.class);
        Conversion conversion = new Conversion(ConversionKind.NONE, elementType);
        positionalParameterConversions.add(conversion);
        assertThat(positionalParameterConversions.getConversions().size(), is(1));
        assertThat(positionalParameterConversions.getConversions().get(0), sameInstance(conversion));
    }

    @Test(timeout=10000)
    public void getConversions() {
        PositionalParameterConversions positionalParameterConversions = new PositionalParameterConversions();
        List<Conversion> result = positionalParameterConversions.getConversions();
        assertTrue(result.isEmpty());
        assertThat(positionalParameterConversions.getConversions(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getConversionsFormalParametersIsEmpty() {
        PositionalParameterConversions positionalParameterConversions = new PositionalParameterConversions();
        List<Conversion> result = positionalParameterConversions.getConversions(new ArrayList<FormalParameter>());
        assertTrue(result.isEmpty());
        assertThat(positionalParameterConversions.getConversions(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void testequals1() {
        List<Type> types = new ArrayList<Type>();
        Type type1 = mock(Type.class);
        ((ArrayList<Type>)types).add(type1);
        Type type2 = mock(Type.class);
        assertThat(new PositionalParameterConversions(types).equals(type2), is(false));
    }

    @Test(timeout=10000)
    public void testequals2() {
        assertThat(new PositionalParameterConversions().equals("foo"), is(false));
        assertThat(new PositionalParameterConversions(new ArrayList<Type>()).equals("foo"), is(false));
        assertThat(new PositionalParameterConversions().equals(null), is(false));
    }
}
