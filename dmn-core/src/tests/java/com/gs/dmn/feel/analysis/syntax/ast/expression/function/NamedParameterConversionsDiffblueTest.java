package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterConversions
 *
 * @author Diffblue JCover
 */

public class NamedParameterConversionsDiffblueTest {

    @Test(timeout=10000)
    public void addKeyIsName() {
        NamedParameterConversions namedParameterConversions = new NamedParameterConversions();
        Type elementType3 = mock(Type.class);
        Conversion conversion = new Conversion(ConversionKind.NONE, elementType3);
        namedParameterConversions.add("name", conversion);
        assertThat(namedParameterConversions.getConversions().get("name"), sameInstance(conversion));
    }

    @Test(timeout=10000)
    public void constructor() {
        List<FormalParameter> parameters = new ArrayList<FormalParameter>();
        Type type = mock(Type.class);
        ((ArrayList<FormalParameter>)parameters).add(new FormalParameter("name", type));
        NamedParameterConversions namedParameterConversions = new NamedParameterConversions(parameters);
        assertThat(namedParameterConversions.getConversions().get("name").getKind(), is(ConversionKind.NONE));
        assertThat(namedParameterConversions.getConversions().get("name").getTargetType(), sameInstance(type));
    }

    @Test(timeout=10000)
    public void getConversions() {
        NamedParameterConversions namedParameterConversions = new NamedParameterConversions();
        Map<String, Conversion> result = namedParameterConversions.getConversions();
        assertThat(result.isEmpty(), is(true));
        assertThat(namedParameterConversions.getConversions(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getConversionsFormalParametersIsEmpty() {
        assertTrue(new NamedParameterConversions().getConversions(new ArrayList<FormalParameter>()).isEmpty());
    }

    @Test(timeout=10000)
    public void getConversionsReturnsNull() {
        List<FormalParameter> formalParameters = new ArrayList<FormalParameter>();
        Type type2 = mock(Type.class);
        ((ArrayList<FormalParameter>)formalParameters).add(new FormalParameter("name", type2));
        assertThat(new NamedParameterConversions().getConversions(formalParameters).size(), is(1));
        assertThat(new NamedParameterConversions().getConversions(formalParameters).get(0), is(nullValue()));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new NamedParameterConversions().equals("foo"), is(false));
        assertThat(new NamedParameterConversions(new ArrayList<FormalParameter>()).equals("foo"), is(false));
        assertThat(new NamedParameterConversions((Map<String, Conversion>)null).equals("foo"), is(false));
        assertThat(new NamedParameterConversions().equals(null), is(false));
    }
}
