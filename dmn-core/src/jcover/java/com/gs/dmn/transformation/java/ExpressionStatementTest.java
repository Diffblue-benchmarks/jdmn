package com.gs.dmn.transformation.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.java.ExpressionStatement
 *
 * @author Diffblue JCover
 */

public class ExpressionStatementTest {

    @Test(timeout=10000)
    public void getExpressionReturnsJpg() {
        Type expressionType = mock(Type.class);
        assertThat(new ExpressionStatement("jpg", expressionType).getExpression(), is("jpg"));
    }

    @Test(timeout=10000)
    public void getExpressionType() {
        Type expressionType = mock(Type.class);
        assertThat(new ExpressionStatement("jpg", expressionType).getExpressionType(), sameInstance(expressionType));
    }
}
