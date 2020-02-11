package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TDMNElement
 *
 * @author Diffblue JCover
 */

public class TDMNElementTest {

    @Test(timeout=10000)
    public void getDescriptionReturnsNull() {
        assertThat(new TDMNElement().getDescription(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExtensionElementsReturnsNull() {
        assertThat(new TDMNElement().getExtensionElements(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIdReturnsNull() {
        assertThat(new TDMNElement().getId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLabelReturnsNull() {
        assertThat(new TDMNElement().getLabel(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOtherAttributesReturnsEmpty() {
        TDMNElement obj = new TDMNElement();
        Map<javax.xml.namespace.QName, String> result = obj.getOtherAttributes();
        assertThat(result.isEmpty(), is(true));
        assertThat(obj.getOtherAttributes(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void setDescriptionToFoo() {
        TDMNElement obj = new TDMNElement();
        obj.setDescription("foo");
        assertThat(obj.getDescription(), is("foo"));
    }

    @Test(timeout=10000)
    public void setExtensionElements() {
        TDMNElement obj = new TDMNElement();
        TDMNElement.ExtensionElements value = new TDMNElement.ExtensionElements();
        obj.setExtensionElements(value);
        assertThat(obj.getExtensionElements(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setIdToFoo() {
        TDMNElement obj = new TDMNElement();
        obj.setId("foo");
        assertThat(obj.getId(), is("foo"));
    }

    @Test(timeout=10000)
    public void setLabelToFoo() {
        TDMNElement obj = new TDMNElement();
        obj.setLabel("foo");
        assertThat(obj.getLabel(), is("foo"));
    }
}
