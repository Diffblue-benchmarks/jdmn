package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TBinding
 *
 * @author Diffblue JCover
 */

public class TBindingTest {

    @Test(timeout=10000)
    public void getExpressionReturnsNull() {
        assertThat(new TBinding().getExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameterReturnsNull() {
        assertThat(new TBinding().getParameter(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpression() {
        TBinding obj = new TBinding();
        JAXBElement<? extends TExpression> value1 = new JAXBElement<TExpression>(new QName("545321456"), TExpression.class, String.class, new TExpression());
        obj.setExpression(value1);
        assertThat(obj.getExpression(), sameInstance(value1));
    }

    @Test(timeout=10000)
    public void setParameter() {
        TBinding obj = new TBinding();
        TInformationItem value = new TInformationItem();
        obj.setParameter(value);
        assertThat(obj.getParameter(), sameInstance(value));
    }
}
