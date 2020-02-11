package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.ConversionKind
 *
 * @author Diffblue JCover
 */

public class ConversionKindTest {

    @Test(timeout=10000)
    public void valuesReturnsNONEELEMENT_TO_LISTLIST_TO_ELEMENT() {
        ConversionKind[] result = ConversionKind.values();
        assertThat(result[0], is(ConversionKind.NONE));
        assertThat(result[1], is(ConversionKind.ELEMENT_TO_LIST));
        assertThat(result[2], is(ConversionKind.LIST_TO_ELEMENT));
    }
}
