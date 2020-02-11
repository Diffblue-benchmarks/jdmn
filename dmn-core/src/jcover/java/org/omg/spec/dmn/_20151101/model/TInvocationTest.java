package org.omg.spec.dmn._20151101.model;

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
 * Unit tests for org.omg.spec.dmn._20151101.model.TInvocation
 *
 * @author Diffblue JCover
 */

public class TInvocationTest {

    @Test(timeout=10000)
    public void getBindingReturnsEmpty() {
        TInvocation obj = new TInvocation();
        List<TBinding> result = obj.getBinding();
        assertTrue(result.isEmpty());
        assertThat(obj.getBinding(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getExpressionReturnsNull() {
        assertThat(new TInvocation().getExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpression() {
        TInvocation obj = new TInvocation();
        JAXBElement<? extends TExpression> value1 = new JAXBElement<TExpression>(new QName("545321456"), TExpression.class, String.class, new TExpression());
        obj.setExpression(value1);
        assertThat(obj.getExpression(), sameInstance(value1));
    }
}
