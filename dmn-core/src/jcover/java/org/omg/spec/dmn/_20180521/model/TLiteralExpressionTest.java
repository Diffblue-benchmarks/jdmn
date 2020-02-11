package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TLiteralExpression
 *
 * @author Diffblue JCover
 */

public class TLiteralExpressionTest {

    @Test(timeout=10000)
    public void getExpressionLanguageReturnsNull() {
        assertThat(new TLiteralExpression().getExpressionLanguage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getImportedValuesReturnsNull() {
        assertThat(new TLiteralExpression().getImportedValues(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTextReturnsNull() {
        assertThat(new TLiteralExpression().getText(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpressionLanguageToJpg() {
        TLiteralExpression obj = new TLiteralExpression();
        obj.setExpressionLanguage("jpg");
        assertThat(obj.getExpressionLanguage(), is("jpg"));
    }

    @Test(timeout=10000)
    public void setImportedValues() {
        TLiteralExpression obj = new TLiteralExpression();
        TImportedValues value = new TImportedValues();
        obj.setImportedValues(value);
        assertThat(obj.getImportedValues(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setTextToHtml() {
        TLiteralExpression obj = new TLiteralExpression();
        obj.setText("html");
        assertThat(obj.getText(), is("html"));
    }
}
