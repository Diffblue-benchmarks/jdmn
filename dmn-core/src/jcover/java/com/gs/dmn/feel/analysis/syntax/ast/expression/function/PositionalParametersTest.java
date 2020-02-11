package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters
 *
 * @author Diffblue JCover
 */

public class PositionalParametersTest {

    @Test(timeout=10000)
    public void constructor() {
        List<Expression> params = new ArrayList<Expression>();
        Type type = mock(Type.class);
        Expression expression = mock(Expression.class);
        when(expression.getType())
            .thenReturn(type);
        ((ArrayList<Expression>)params).add(expression);
        PositionalParameters positionalParameters = new PositionalParameters(params);
        assertThat(positionalParameters.getConvertedArguments(), is(nullValue()));
        assertThat(positionalParameters.getConvertedParameterTypes(), is(nullValue()));
        assertThat(positionalParameters.getOriginalArguments(), is(nullValue()));
        assertThat(positionalParameters.getParameterConversions(), is(nullValue()));
        assertThat(positionalParameters.getParameters(), sameInstance(params));
        // pojo ParameterTypes
        assertThat(positionalParameters.isEmpty(), is(false));
    }

    @Test(timeout=10000)
    public void getConvertedArgumentsReturnsNull() {
        assertThat(new PositionalParameters(new ArrayList<Expression>()).getConvertedArguments(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getConvertedParameterTypesReturnsNull() {
        assertThat(new PositionalParameters(new ArrayList<Expression>()).getConvertedParameterTypes(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOriginalArgumentsReturnsNull() {
        assertThat(new PositionalParameters(new ArrayList<Expression>()).getOriginalArguments(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameterConversionsReturnsNull() {
        assertThat(new PositionalParameters(new ArrayList<Expression>()).getParameterConversions(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameters() {
        List<Expression> params = new ArrayList<Expression>();
        assertThat(new PositionalParameters(params).getParameters(), sameInstance(params));
    }

    @Test(timeout=10000)
    public void getSignature() {
        // pojo ParameterTypes
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(new PositionalParameters(new ArrayList<Expression>()).isEmpty(), is(true));
        assertThat(new PositionalParameters(null).isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void isEmptyReturnsFalse() {
        List<Expression> params = new ArrayList<Expression>();
        Type type1 = mock(Type.class);
        Type type2 = mock(Type.class);
        Expression expression = mock(Expression.class);
        when(expression.getType())
            .thenReturn(type1)
            .thenReturn(type2);
        ((ArrayList<Expression>)params).add(expression);
        assertThat(new PositionalParameters(params).isEmpty(), is(false));
    }

    @Test(timeout=10000)
    public void setConvertedParameterTypes() {
        new PositionalParameters(new ArrayList<Expression>()).setConvertedParameterTypes(null);
    }

    @Test(timeout=10000)
    public void setOriginalArguments() {
        new PositionalParameters(new ArrayList<Expression>()).setOriginalArguments(null);
    }

    @Test(timeout=10000)
    public void setParameterConversions() {
        new PositionalParameters(new ArrayList<Expression>()).setParameterConversions(null);
    }
}
