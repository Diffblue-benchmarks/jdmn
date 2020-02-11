package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TInformationItem
 *
 * @author Diffblue JCover
 */

public class TInformationItemTest {

    @Test(timeout=10000)
    public void getTypeRefReturnsNull() {
        assertThat(new TInformationItem().getTypeRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTypeRef() {
        TInformationItem obj = new TInformationItem();
        QName value = new QName("545321456");
        obj.setTypeRef(value);
        assertThat(obj.getTypeRef(), sameInstance(value));
    }
}
