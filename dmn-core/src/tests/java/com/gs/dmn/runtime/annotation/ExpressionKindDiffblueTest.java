package com.gs.dmn.runtime.annotation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TExpression;

/**
 * Unit tests for com.gs.dmn.runtime.annotation.ExpressionKind
 *
 * @author Diffblue JCover
 */

public class ExpressionKindDiffblueTest {

    @Test(timeout=10000)
    public void kindByClassReturnsOTHER() {
        assertThat(ExpressionKind.kindByClass(new TExpression()), is(ExpressionKind.OTHER));
    }

    @Test(timeout=10000)
    public void valuesReturnsFUNCTION_DEFINITIONDECISION_TABLERELATIONLISTCONTEXTINVOCATIONLITERAL_EXPRESSIONOTHER() {
        ExpressionKind[] result = ExpressionKind.values();
        assertThat(result[0], is(ExpressionKind.FUNCTION_DEFINITION));
        assertThat(result[1], is(ExpressionKind.DECISION_TABLE));
        assertThat(result[2], is(ExpressionKind.RELATION));
        assertThat(result[3], is(ExpressionKind.LIST));
        assertThat(result[4], is(ExpressionKind.CONTEXT));
        assertThat(result[5], is(ExpressionKind.INVOCATION));
        assertThat(result[6], is(ExpressionKind.LITERAL_EXPRESSION));
        assertThat(result[7], is(ExpressionKind.OTHER));
    }
}
