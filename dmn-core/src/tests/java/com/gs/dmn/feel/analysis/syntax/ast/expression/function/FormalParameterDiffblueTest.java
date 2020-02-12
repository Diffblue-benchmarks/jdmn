package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter
 *
 * @author Diffblue JCover
 */

public class FormalParameterDiffblueTest {

    @Test(timeout=10000)
    public void equalsOIsNull() {
        Type type = mock(Type.class);
        assertThat(new FormalParameter("name", type).equals(null), is(false));
    }

    @Test(timeout=10000)
    public void getNameReturnsName() {
        Type type = mock(Type.class);
        assertThat(new FormalParameter("name", type).getName(), is("name"));
    }

    @Test(timeout=10000)
    public void getType() {
        Type type = mock(Type.class);
        assertThat(new FormalParameter("name", type).getType(), sameInstance(type));
    }

    @Test(timeout=10000)
    public void getTypeExpressionReturnsNull() {
        Type type = mock(Type.class);
        assertThat(new FormalParameter("name", type).getTypeExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setType() {
        Type type1 = mock(Type.class);
        FormalParameter formalParameter = new FormalParameter("name", type1);
        Type type2 = mock(Type.class);
        formalParameter.setType(type2);
        assertThat(formalParameter.getType(), sameInstance(type2));
    }

    @Test(timeout=10000)
    public void testequals1() {
        Type type = mock(Type.class);
        assertThat(new FormalParameter("name", type).equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void testequals2() {
        TypeExpression typeExpression = mock(TypeExpression.class);
        assertThat(new FormalParameter("name", typeExpression).equals("foo"), is(false));
    }
}
