package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.DMNDI
 *
 * @author Diffblue JCover
 */

public class DMNDITest {

    @Test(timeout=10000)
    public void getDMNDiagramReturnsEmpty() {
        DMNDI obj = new DMNDI();
        List<DMNDiagram> result = obj.getDMNDiagram();
        assertTrue(result.isEmpty());
        assertThat(obj.getDMNDiagram(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getDMNStyleReturnsEmpty() {
        DMNDI obj = new DMNDI();
        List<DMNStyle> result = obj.getDMNStyle();
        assertTrue(result.isEmpty());
        assertThat(obj.getDMNStyle(), sameInstance(result));
    }
}
