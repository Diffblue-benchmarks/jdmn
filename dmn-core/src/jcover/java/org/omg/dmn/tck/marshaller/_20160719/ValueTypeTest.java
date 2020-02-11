package org.omg.dmn.tck.marshaller._20160719;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.dmn.tck.marshaller._20160719.ValueType
 *
 * @author Diffblue JCover
 */

public class ValueTypeTest {

    @Test(timeout=10000)
    public void getComponentReturnsEmpty() {
        ValueType valueType = new ValueType();
        List<ValueType.Component> result = valueType.getComponent();
        assertTrue(result.isEmpty());
        assertThat(valueType.getComponent(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getExtensionElementsReturnsNull() {
        assertThat(new ValueType().getExtensionElements(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getListReturnsNull() {
        assertThat(new ValueType().getList(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOtherAttributesReturnsEmpty() {
        ValueType valueType = new ValueType();
        Map<javax.xml.namespace.QName, String> result = valueType.getOtherAttributes();
        assertThat(result.isEmpty(), is(true));
        assertThat(valueType.getOtherAttributes(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getValueReturnsNull() {
        assertThat(new ValueType().getValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExtensionElements() {
        ValueType valueType = new ValueType();
        ValueType.ExtensionElements value = new ValueType.ExtensionElements();
        valueType.setExtensionElements(value);
        assertThat(valueType.getExtensionElements(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setList() {
        ValueType valueType = new ValueType();
        JAXBElement<ValueType.List> value1 = new JAXBElement<ValueType.List>(new QName("545321456"), ValueType.List.class, String.class, new ValueType.List());
        valueType.setList(value1);
        assertThat(valueType.getList(), sameInstance(value1));
    }

    @Test(timeout=10000)
    public void setValue() {
        ValueType valueType = new ValueType();
        JAXBElement<Object> value1 = new JAXBElement<Object>(new QName("545321456"), Object.class, String.class, new Object());
        valueType.setValue(value1);
        assertThat(valueType.getValue(), sameInstance(value1));
    }
}
