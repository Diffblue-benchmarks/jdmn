package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.environment.Declaration;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.DeclarationMatch
 *
 * @author Diffblue JCover
 */

public class DeclarationMatchDiffblueTest {

    @Test(timeout=10000)
    public void getDeclaration() {
        Declaration declaration = mock(Declaration.class);
        ParameterTypes parameterTypes = mock(ParameterTypes.class);
        ParameterConversions parameterConversions = mock(ParameterConversions.class);
        assertThat(new DeclarationMatch(declaration, parameterTypes, parameterConversions).getDeclaration(), sameInstance(declaration));
    }

    @Test(timeout=10000)
    public void getParameterConversions() {
        Declaration declaration = mock(Declaration.class);
        ParameterTypes parameterTypes = mock(ParameterTypes.class);
        ParameterConversions parameterConversions = mock(ParameterConversions.class);
        assertThat(new DeclarationMatch(declaration, parameterTypes, parameterConversions).getParameterConversions(), sameInstance(parameterConversions));
    }

    @Test(timeout=10000)
    public void getParameterTypes() {
        Declaration declaration = mock(Declaration.class);
        ParameterTypes parameterTypes = mock(ParameterTypes.class);
        ParameterConversions parameterConversions = mock(ParameterConversions.class);
        assertThat(new DeclarationMatch(declaration, parameterTypes, parameterConversions).getParameterTypes(), sameInstance(parameterTypes));
    }
}
