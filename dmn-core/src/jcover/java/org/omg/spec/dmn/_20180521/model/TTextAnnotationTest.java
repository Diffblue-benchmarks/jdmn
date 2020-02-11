package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TTextAnnotation
 *
 * @author Diffblue JCover
 */

public class TTextAnnotationTest {

    @Test(timeout=10000)
    public void getTextFormat() {
        assertThat(new TTextAnnotation().getTextFormat(), is("text/plain"));
    }

    @Test(timeout=10000)
    public void getTextReturnsNull() {
        assertThat(new TTextAnnotation().getText(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTextFormatToHtml() {
        TTextAnnotation obj = new TTextAnnotation();
        obj.setTextFormat("html");
        assertThat(obj.getTextFormat(), is("html"));
    }

    @Test(timeout=10000)
    public void setTextToHtml() {
        TTextAnnotation obj = new TTextAnnotation();
        obj.setText("html");
        assertThat(obj.getText(), is("html"));
    }
}
