package com.gs.dmn.feel.analysis.semantics.environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.environment.VariableDeclaration
 *
 * @author Diffblue JCover
 */

public class VariableDeclarationDiffblueTest {

    @Test(timeout=10000)
    public void getType() {
        Type type = mock(Type.class);
        assertThat(new VariableDeclaration("/bin/bash", type).getType(), sameInstance(type));
    }

    @Test(timeout=10000)
    public void setType() {
        Type type1 = mock(Type.class);
        VariableDeclaration variableDeclaration = new VariableDeclaration("/bin/bash", type1);
        Type type2 = mock(Type.class);
        variableDeclaration.setType(type2);
        assertThat(variableDeclaration.getType(), sameInstance(type2));
    }
}
