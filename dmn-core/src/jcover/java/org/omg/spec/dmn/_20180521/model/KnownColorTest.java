package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.KnownColor
 *
 * @author Diffblue JCover
 */

public class KnownColorTest {

    @Test(timeout=10000)
    public void valueReturnsMaroon() {
        assertThat(KnownColor.MAROON.value(), is("maroon"));
    }

    @Test(timeout=10000)
    public void valuesReturnsMAROONREDORANGEYELLOWOLIVEPURPLEFUCHSIAWHITELIMEGREENNAVYBLUEAQUATEALBLACKSILVERGRAY() {
        KnownColor[] result = KnownColor.values();
        assertThat(result[0], is(KnownColor.MAROON));
        assertThat(result[1], is(KnownColor.RED));
        assertThat(result[2], is(KnownColor.ORANGE));
        assertThat(result[3], is(KnownColor.YELLOW));
        assertThat(result[4], is(KnownColor.OLIVE));
        assertThat(result[5], is(KnownColor.PURPLE));
        assertThat(result[6], is(KnownColor.FUCHSIA));
        assertThat(result[7], is(KnownColor.WHITE));
        assertThat(result[8], is(KnownColor.LIME));
        assertThat(result[9], is(KnownColor.GREEN));
        assertThat(result[10], is(KnownColor.NAVY));
        assertThat(result[11], is(KnownColor.BLUE));
        assertThat(result[12], is(KnownColor.AQUA));
        assertThat(result[13], is(KnownColor.TEAL));
        assertThat(result[14], is(KnownColor.BLACK));
        assertThat(result[15], is(KnownColor.SILVER));
        assertThat(result[16], is(KnownColor.GRAY));
    }
}
