package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.DMNLabel
 *
 * @author Diffblue JCover
 */

public class DMNLabelTest {

    @Test(timeout=10000)
    public void getTextReturnsNull() {
        assertThat(new DMNLabel().getText(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTextToHtml() {
        DMNLabel obj = new DMNLabel();
        obj.setText("html");
        assertThat(obj.getText(), is("html"));
    }
}
