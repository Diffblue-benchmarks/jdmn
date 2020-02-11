package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.Color
 *
 * @author Diffblue JCover
 */

public class ColorTest {

    @Test(timeout=10000)
    public void getBlueReturnsZero() {
        assertThat(new Color().getBlue(), is(0));
    }

    @Test(timeout=10000)
    public void getGreenReturnsZero() {
        assertThat(new Color().getGreen(), is(0));
    }

    @Test(timeout=10000)
    public void getRedReturnsZero() {
        assertThat(new Color().getRed(), is(0));
    }

    @Test(timeout=10000)
    public void setBlueToOne() {
        Color color = new Color();
        color.setBlue(1);
        assertThat(color.getBlue(), is(1));
    }

    @Test(timeout=10000)
    public void setGreenToOne() {
        Color color = new Color();
        color.setGreen(1);
        assertThat(color.getGreen(), is(1));
    }

    @Test(timeout=10000)
    public void setRedToOne() {
        Color color = new Color();
        color.setRed(1);
        assertThat(color.getRed(), is(1));
    }
}
