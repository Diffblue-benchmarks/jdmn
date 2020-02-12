package com.gs.dmn.feel.analysis.semantics.environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ParameterTypes;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.environment.Environment
 *
 * @author Diffblue JCover
 */

public class EnvironmentDiffblueTest {

    @Test(timeout=10000)
    public void getInputExpressionReturnsNull() {
        assertThat(new Environment().getInputExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInputExpressionTypeReturnsNull() {
        assertThat(new Environment().getInputExpressionType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void lookupFunctionDeclarationReturnsEmpty() {
        assertTrue(new Environment().lookupFunctionDeclaration("bar").isEmpty());
    }

    @Test(timeout=10000)
    public void lookupFunctionDeclarationReturnsNull() {
        ParameterTypes parameterTypes = mock(ParameterTypes.class);
        assertThat(new Environment().lookupFunctionDeclaration("bar", parameterTypes), is(nullValue()));
    }

    @Test(timeout=10000)
    public void lookupVariableDeclarationNameIsBarReturnsNull() {
        assertThat(new Environment().lookupVariableDeclaration("bar"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void updateVariableDeclarationNameIsBar() {
        Type type = mock(Type.class);
        new Environment().updateVariableDeclaration("bar", type);
    }
}
