package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters
 *
 * @author Diffblue JCover
 */

public class NamedParametersDiffblueTest {

    @Test(timeout=10000)
    public void constructor() {
        Map<String, Expression> params = new HashMap<String, Expression>();
        Type type = mock(Type.class);
        Expression x4 = mock(Expression.class);
        when(x4.getType())
            .thenReturn(type);
        ((HashMap<String, Expression>)params).put("foo", x4);
        NamedParameters namedParameters = new NamedParameters(params);
        assertThat(namedParameters.getConvertedArguments(), is(nullValue()));
        assertThat(namedParameters.getConvertedParameterTypes(), is(nullValue()));
        assertThat(namedParameters.getOriginalArguments(), is(nullValue()));
        assertThat(namedParameters.getParameterConversions(), is(nullValue()));
        assertThat(namedParameters.getParameters(), sameInstance(params));
        // pojo ParameterTypes
        assertThat(namedParameters.isEmpty(), is(false));
    }

    @Test(timeout=10000)
    public void getConvertedArgumentsReturnsNull() {
        assertThat(new NamedParameters(new HashMap<String, Expression>()).getConvertedArguments(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getConvertedParameterTypesReturnsNull() {
        assertThat(new NamedParameters(new HashMap<String, Expression>()).getConvertedParameterTypes(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOriginalArgumentsReturnsNull() {
        assertThat(new NamedParameters(new HashMap<String, Expression>()).getOriginalArguments(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameterConversionsReturnsNull() {
        assertThat(new NamedParameters(new HashMap<String, Expression>()).getParameterConversions(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameters() {
        Map<String, Expression> params = new HashMap<String, Expression>();
        assertThat(new NamedParameters(params).getParameters(), sameInstance(params));
    }

    @Test(timeout=10000)
    public void getParametersReturnsEmpty() {
        NamedParameters namedParameters = new NamedParameters(null);
        Map<String, Expression> result = namedParameters.getParameters();
        assertThat(result.isEmpty(), is(true));
        assertThat(namedParameters.getParameters(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getSignature1() {
        // pojo ParameterTypes
    }

    @Test(timeout=10000)
    public void getSignature2() {
        Map<String, Expression> params = new HashMap<String, Expression>();
        Type type1 = mock(Type.class);
        Type type2 = mock(Type.class);
        Type type3 = mock(Type.class);
        Expression x4 = mock(Expression.class);
        when(x4.getType())
            .thenReturn(type1)
            .thenReturn(type2)
            .thenReturn(type3);
        ((HashMap<String, Expression>)params).put("foo", x4);
        // pojo ParameterTypes
    }

    @Test(timeout=10000)
    public void isEmptyReturnsFalse() {
        Map<String, Expression> params = new HashMap<String, Expression>();
        Type type1 = mock(Type.class);
        Type type2 = mock(Type.class);
        Expression x4 = mock(Expression.class);
        when(x4.getType())
            .thenReturn(type1)
            .thenReturn(type2);
        ((HashMap<String, Expression>)params).put("foo", x4);
        assertThat(new NamedParameters(params).isEmpty(), is(false));
    }

    @Test(timeout=10000)
    public void isEmptyReturnsTrue() {
        assertThat(new NamedParameters(new HashMap<String, Expression>()).isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void setConvertedParameterTypes() {
        new NamedParameters(new HashMap<String, Expression>()).setConvertedParameterTypes(null);
    }

    @Test(timeout=10000)
    public void setOriginalArguments() {
        new NamedParameters(new HashMap<String, Expression>()).setOriginalArguments(null);
    }

    @Test(timeout=10000)
    public void setParameterConversions() {
        new NamedParameters(new HashMap<String, Expression>()).setParameterConversions(null);
    }
}
