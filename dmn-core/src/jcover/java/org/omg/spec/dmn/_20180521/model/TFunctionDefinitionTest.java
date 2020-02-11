package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TFunctionDefinition
 *
 * @author Diffblue JCover
 */

public class TFunctionDefinitionTest {

    @Test(timeout=10000)
    public void getExpressionReturnsNull() {
        assertThat(new TFunctionDefinition().getExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFormalParameterReturnsEmpty() {
        TFunctionDefinition obj = new TFunctionDefinition();
        List<TInformationItem> result = obj.getFormalParameter();
        assertTrue(result.isEmpty());
        assertThat(obj.getFormalParameter(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getKindReturnsFEEL() {
        assertThat(new TFunctionDefinition().getKind(), is(TFunctionKind.FEEL));
    }

    @Test(timeout=10000)
    public void setExpression() {
        TFunctionDefinition obj = new TFunctionDefinition();
        JAXBElement<? extends TExpression> value1 = new JAXBElement<TExpression>(new QName("545321456"), TExpression.class, String.class, new TExpression());
        obj.setExpression(value1);
        assertThat(obj.getExpression(), sameInstance(value1));
    }

    @Test(timeout=10000)
    public void setKindToFEEL() {
        new TFunctionDefinition().setKind(TFunctionKind.FEEL);
    }
}
