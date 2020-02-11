package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.gs.dmn.feel.analysis.semantics.type.Type;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.syntax.ast.expression.function.Conversion
 *
 * @author Diffblue JCover
 */

public class ConversionTest {

    @Test(timeout=10000)
    public void conversionFunction() {
        Type elementType1 = mock(Type.class);
        Type elementType2 = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType1).conversionFunction(new Conversion(ConversionKind.LIST_TO_ELEMENT, elementType2), "gif"), is("this.<gif>asElement"));
    }

    @Test(timeout=10000)
    public void conversionFunctionReturnsAsList() {
        Type elementType1 = mock(Type.class);
        Type elementType2 = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType1).conversionFunction(new Conversion(ConversionKind.ELEMENT_TO_LIST, elementType2), "gif"), is("asList"));
    }

    @Test(timeout=10000)
    public void conversionFunctionReturnsNull() {
        Type elementType1 = mock(Type.class);
        Type elementType2 = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType1).conversionFunction(new Conversion(ConversionKind.NONE, elementType2), "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void equalsOIsFoo() {
        Type elementType = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType).equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void equalsOIsNull() {
        Type elementType = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType).equals(null), is(false));
    }

    @Test(timeout=10000)
    public void getKindReturnsNONE() {
        Type elementType = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType).getKind(), is(ConversionKind.NONE));
    }

    @Test(timeout=10000)
    public void getTargetType() {
        Type elementType = mock(Type.class);
        assertThat(new Conversion(ConversionKind.NONE, elementType).getTargetType(), sameInstance(elementType));
    }
}
