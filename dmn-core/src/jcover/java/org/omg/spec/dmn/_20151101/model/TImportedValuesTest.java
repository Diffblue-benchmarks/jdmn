package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TImportedValues
 *
 * @author Diffblue JCover
 */

public class TImportedValuesTest {

    @Test(timeout=10000)
    public void getExpressionLanguageReturnsNull() {
        assertThat(new TImportedValues().getExpressionLanguage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getImportedElementReturnsNull() {
        assertThat(new TImportedValues().getImportedElement(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setExpressionLanguageToJpg() {
        TImportedValues obj = new TImportedValues();
        obj.setExpressionLanguage("jpg");
        assertThat(obj.getExpressionLanguage(), is("jpg"));
    }

    @Test(timeout=10000)
    public void setImportedElementToFoo() {
        TImportedValues obj = new TImportedValues();
        obj.setImportedElement("foo");
        assertThat(obj.getImportedElement(), is("foo"));
    }
}
