package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.DMNStyle
 *
 * @author Diffblue JCover
 */

public class DMNStyleTest {

    @Test(timeout=10000)
    public void getFillColorReturnsNull() {
        assertThat(new DMNStyle().getFillColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFontColorReturnsNull() {
        assertThat(new DMNStyle().getFontColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFontFamilyReturnsNull() {
        assertThat(new DMNStyle().getFontFamily(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFontSizeReturnsNull() {
        assertThat(new DMNStyle().getFontSize(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLabelHorizontalAlignementReturnsNull() {
        assertThat(new DMNStyle().getLabelHorizontalAlignement(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLabelVerticalAlignmentReturnsNull() {
        assertThat(new DMNStyle().getLabelVerticalAlignment(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStrokeColorReturnsNull() {
        assertThat(new DMNStyle().getStrokeColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isFontBoldReturnsNull() {
        assertThat(new DMNStyle().isFontBold(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isFontItalicReturnsNull() {
        assertThat(new DMNStyle().isFontItalic(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isFontStrikeThroughReturnsNull() {
        assertThat(new DMNStyle().isFontStrikeThrough(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isFontUnderlineReturnsNull() {
        assertThat(new DMNStyle().isFontUnderline(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setFillColor() {
        DMNStyle obj = new DMNStyle();
        Color value = new Color();
        obj.setFillColor(value);
        assertThat(obj.getFillColor(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setFontBoldToFalse() {
        DMNStyle obj = new DMNStyle();
        obj.setFontBold(false);
        assertThat(obj.isFontBold(), is(false));
    }

    @Test(timeout=10000)
    public void setFontColor() {
        DMNStyle obj = new DMNStyle();
        Color value = new Color();
        obj.setFontColor(value);
        assertThat(obj.getFontColor(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setFontFamilyToFoo() {
        DMNStyle obj = new DMNStyle();
        obj.setFontFamily("foo");
        assertThat(obj.getFontFamily(), is("foo"));
    }

    @Test(timeout=10000)
    public void setFontItalicToFalse() {
        DMNStyle obj = new DMNStyle();
        obj.setFontItalic(false);
        assertThat(obj.isFontItalic(), is(false));
    }

    @Test(timeout=10000)
    public void setFontSizeToOne() {
        DMNStyle obj = new DMNStyle();
        obj.setFontSize(1.0);
        assertEquals(1.0, obj.getFontSize(), 0);
    }

    @Test(timeout=10000)
    public void setFontStrikeThroughToFalse() {
        DMNStyle obj = new DMNStyle();
        obj.setFontStrikeThrough(false);
        assertThat(obj.isFontStrikeThrough(), is(false));
    }

    @Test(timeout=10000)
    public void setFontUnderlineToFalse() {
        DMNStyle obj = new DMNStyle();
        obj.setFontUnderline(false);
        assertThat(obj.isFontUnderline(), is(false));
    }

    @Test(timeout=10000)
    public void setLabelHorizontalAlignementToSTART() {
        DMNStyle obj = new DMNStyle();
        obj.setLabelHorizontalAlignement(AlignmentKind.START);
        assertThat(obj.getLabelHorizontalAlignement(), is(AlignmentKind.START));
    }

    @Test(timeout=10000)
    public void setLabelVerticalAlignmentToSTART() {
        DMNStyle obj = new DMNStyle();
        obj.setLabelVerticalAlignment(AlignmentKind.START);
        assertThat(obj.getLabelVerticalAlignment(), is(AlignmentKind.START));
    }

    @Test(timeout=10000)
    public void setStrokeColor() {
        DMNStyle obj = new DMNStyle();
        Color value = new Color();
        obj.setStrokeColor(value);
        assertThat(obj.getStrokeColor(), sameInstance(value));
    }
}
