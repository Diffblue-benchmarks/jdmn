package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.DMNDiagram
 *
 * @author Diffblue JCover
 */

public class DMNDiagramTest {

    @Test(timeout=10000)
    public void getDMNDiagramElementReturnsEmpty() {
        DMNDiagram obj = new DMNDiagram();
        List<javax.xml.bind.JAXBElement<? extends DiagramElement>> result = obj.getDMNDiagramElement();
        assertTrue(result.isEmpty());
        assertThat(obj.getDMNDiagramElement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getSizeReturnsNull() {
        assertThat(new DMNDiagram().getSize(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setSize() {
        DMNDiagram obj = new DMNDiagram();
        Dimension value = new Dimension();
        obj.setSize(value);
        assertThat(obj.getSize(), sameInstance(value));
    }
}
