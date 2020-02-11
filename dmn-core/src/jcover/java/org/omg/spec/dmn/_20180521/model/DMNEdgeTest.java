package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.DMNEdge
 *
 * @author Diffblue JCover
 */

public class DMNEdgeTest {

    @Test(timeout=10000)
    public void getDmnElementRefReturnsNull() {
        assertThat(new DMNEdge().getDmnElementRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDMNLabelReturnsNull() {
        assertThat(new DMNEdge().getDMNLabel(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setDmnElementRef() {
        DMNEdge obj = new DMNEdge();
        QName value = new QName("545321456");
        obj.setDmnElementRef(value);
        assertThat(obj.getDmnElementRef(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setDMNLabel() {
        DMNEdge obj = new DMNEdge();
        DMNLabel value = new DMNLabel();
        obj.setDMNLabel(value);
        assertThat(obj.getDMNLabel(), sameInstance(value));
    }
}
