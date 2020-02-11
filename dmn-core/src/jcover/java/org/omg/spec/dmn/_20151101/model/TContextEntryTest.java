package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TContextEntry
 *
 * @author Diffblue JCover
 */

public class TContextEntryTest {

    @Test(timeout=10000)
    public void getExpressionReturnsNull() {
        assertThat(new TContextEntry().getExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getVariableReturnsNull() {
        assertThat(new TContextEntry().getVariable(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpression() {
        TContextEntry obj = new TContextEntry();
        JAXBElement<? extends TExpression> value1 = new JAXBElement<TExpression>(new QName("545321456"), TExpression.class, String.class, new TExpression());
        obj.setExpression(value1);
        assertThat(obj.getExpression(), sameInstance(value1));
    }

    @Test(timeout=10000)
    public void setVariable() {
        TContextEntry obj = new TContextEntry();
        TInformationItem value = new TInformationItem();
        obj.setVariable(value);
        assertThat(obj.getVariable(), sameInstance(value));
    }
}
