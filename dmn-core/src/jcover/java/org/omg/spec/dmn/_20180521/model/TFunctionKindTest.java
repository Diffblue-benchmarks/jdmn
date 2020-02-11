package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TFunctionKind
 *
 * @author Diffblue JCover
 */

public class TFunctionKindTest {

    @Test(timeout=10000)
    public void valueReturnsFEEL() {
        assertThat(TFunctionKind.FEEL.value(), is("FEEL"));
    }

    @Test(timeout=10000)
    public void valuesReturnsFEELJAVAPMML() {
        TFunctionKind[] result = TFunctionKind.values();
        assertThat(result[0], is(TFunctionKind.FEEL));
        assertThat(result[1], is(TFunctionKind.JAVA));
        assertThat(result[2], is(TFunctionKind.PMML));
    }
}
