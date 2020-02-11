package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.AlignmentKind
 *
 * @author Diffblue JCover
 */

public class AlignmentKindTest {

    @Test(timeout=10000)
    public void valueReturnsStart() {
        assertThat(AlignmentKind.START.value(), is("start"));
    }

    @Test(timeout=10000)
    public void valuesReturnsSTARTENDCENTER() {
        AlignmentKind[] result = AlignmentKind.values();
        assertThat(result[0], is(AlignmentKind.START));
        assertThat(result[1], is(AlignmentKind.END));
        assertThat(result[2], is(AlignmentKind.CENTER));
    }
}
