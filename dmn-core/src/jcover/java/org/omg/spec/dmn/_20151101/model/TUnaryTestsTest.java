package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TUnaryTests
 *
 * @author Diffblue JCover
 */

public class TUnaryTestsTest {

    @Test(timeout=10000)
    public void getExpressionLanguageReturnsNull() {
        assertThat(new TUnaryTests().getExpressionLanguage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTextReturnsNull() {
        assertThat(new TUnaryTests().getText(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpressionLanguageToJpg() {
        TUnaryTests obj = new TUnaryTests();
        obj.setExpressionLanguage("jpg");
        assertThat(obj.getExpressionLanguage(), is("jpg"));
    }

    @Test(timeout=10000)
    public void setTextToHtml() {
        TUnaryTests obj = new TUnaryTests();
        obj.setText("html");
        assertThat(obj.getText(), is("html"));
    }
}
