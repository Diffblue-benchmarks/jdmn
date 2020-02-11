package com.gs.dmn.runtime.annotation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDRGElement;

/**
 * Unit tests for com.gs.dmn.runtime.annotation.DRGElementKind
 *
 * @author Diffblue JCover
 */

public class DRGElementKindTest {

    @Test(timeout=10000)
    public void kindByClassReturnsOTHER() {
        assertThat(DRGElementKind.kindByClass(new TDRGElement()), is(DRGElementKind.OTHER));
    }

    @Test(timeout=10000)
    public void valuesReturnsDECISIONDECISION_SERVICEBUSINESS_KNOWLEDGE_MODELKNOWLEDGE_SOURCEINPUT_DATAOTHER() {
        DRGElementKind[] result = DRGElementKind.values();
        assertThat(result[0], is(DRGElementKind.DECISION));
        assertThat(result[1], is(DRGElementKind.DECISION_SERVICE));
        assertThat(result[2], is(DRGElementKind.BUSINESS_KNOWLEDGE_MODEL));
        assertThat(result[3], is(DRGElementKind.KNOWLEDGE_SOURCE));
        assertThat(result[4], is(DRGElementKind.INPUT_DATA));
        assertThat(result[5], is(DRGElementKind.OTHER));
    }
}
