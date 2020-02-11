package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TItemDefinition
 *
 * @author Diffblue JCover
 */

public class TItemDefinitionTest {

    @Test(timeout=10000)
    public void getAllowedValuesReturnsNull() {
        assertThat(new TItemDefinition().getAllowedValues(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getItemComponentReturnsEmpty() {
        TItemDefinition obj = new TItemDefinition();
        List<TItemDefinition> result = obj.getItemComponent();
        assertTrue(result.isEmpty());
        assertThat(obj.getItemComponent(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getTypeLanguageReturnsNull() {
        assertThat(new TItemDefinition().getTypeLanguage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeRefReturnsNull() {
        assertThat(new TItemDefinition().getTypeRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isIsCollectionReturnsFalse() {
        assertThat(new TItemDefinition().isIsCollection(), is(false));
    }

    @Test(timeout=10000)
    public void setAllowedValues() {
        TItemDefinition obj = new TItemDefinition();
        TUnaryTests value = new TUnaryTests();
        obj.setAllowedValues(value);
        assertThat(obj.getAllowedValues(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setIsCollectionToFalse() {
        new TItemDefinition().setIsCollection(false);
    }

    @Test(timeout=10000)
    public void setTypeLanguageToGif() {
        TItemDefinition obj = new TItemDefinition();
        obj.setTypeLanguage("gif");
        assertThat(obj.getTypeLanguage(), is("gif"));
    }

    @Test(timeout=10000)
    public void setTypeRefToGif() {
        TItemDefinition obj = new TItemDefinition();
        obj.setTypeRef("gif");
        assertThat(obj.getTypeRef(), is("gif"));
    }
}
