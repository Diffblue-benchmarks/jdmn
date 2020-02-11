package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TImport
 *
 * @author Diffblue JCover
 */

public class TImportTest {

    @Test(timeout=10000)
    public void getImportTypeReturnsNull() {
        assertThat(new TImport().getImportType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLocationURIReturnsNull() {
        assertThat(new TImport().getLocationURI(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsNull() {
        assertThat(new TImport().getNamespace(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setImportTypeToGif() {
        TImport obj = new TImport();
        obj.setImportType("gif");
        assertThat(obj.getImportType(), is("gif"));
    }

    @Test(timeout=10000)
    public void setLocationURIToGermany() {
        TImport obj = new TImport();
        obj.setLocationURI("Germany");
        assertThat(obj.getLocationURI(), is("Germany"));
    }

    @Test(timeout=10000)
    public void setNamespaceToFoo() {
        TImport obj = new TImport();
        obj.setNamespace("foo");
        assertThat(obj.getNamespace(), is("foo"));
    }
}
