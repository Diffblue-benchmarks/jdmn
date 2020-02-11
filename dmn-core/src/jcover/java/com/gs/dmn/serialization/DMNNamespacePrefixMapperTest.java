package com.gs.dmn.serialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.serialization.DMNNamespacePrefixMapper
 *
 * @author Diffblue JCover
 */

public class DMNNamespacePrefixMapperTest {

    @Test(timeout=10000)
    public void getPreDeclaredNamespaceUris() {
        assertArrayEquals(new String[] { "http://www.w3.org/2001/XMLSchema", "http://www.omg.org/spec/DMN/20180521/MODEL/", "http://www.omg.org/spec/DMN/20180521/DC/", "http://www.omg.org/spec/DMN/20180521/DMNDI/", "http://www.omg.org/spec/DMN/20180521/DI/", "http://www.omg.org/spec/DMN/20180521/FEEL/" }, new DMNNamespacePrefixMapper().getPreDeclaredNamespaceUris());
    }

    @Test(timeout=10000)
    public void getPreferredPrefix() {
        assertThat(new DMNNamespacePrefixMapper("bar", "foo").getPreferredPrefix("foo", "foo", false), is("foo"));
        assertThat(new DMNNamespacePrefixMapper("foo", "").getPreferredPrefix("foo", "foo", false), is("foo"));
        assertThat(new DMNNamespacePrefixMapper().getPreferredPrefix("bar", "foo", false), is("foo"));
    }

    @Test(timeout=10000)
    public void getUserNamespaceReturnsBar() {
        assertThat(new DMNNamespacePrefixMapper("bar", "foo").getUserNamespace(), is("bar"));
    }

    @Test(timeout=10000)
    public void getUserPrefixReturnsFoo() {
        assertThat(new DMNNamespacePrefixMapper("bar", "foo").getUserPrefix(), is("foo"));
    }

    @Test(timeout=10000)
    public void getVersion() {
        DMNNamespacePrefixMapper obj = new DMNNamespacePrefixMapper();
        DMNVersion result = obj.getVersion();
        assertThat(result.getFeelNamespace(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertThat(result.getFeelPrefix(), is("feel"));
        assertThat(result.getJavaPackage(), is("org.omg.spec.dmn._20180521.model"));
        assertThat(result.getNamespace(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getNamespaceMap().get("http://www.omg.org/spec/DMN/20180521/DC/"), is("dc"));
        assertThat(result.getNamespaceMap().get("http://www.omg.org/spec/DMN/20180521/DI/"), is("di"));
        assertThat(result.getNamespaceMap().get("http://www.omg.org/spec/DMN/20180521/DMNDI/"), is("dmndi"));
        assertThat(result.getNamespaceMap().get("http://www.omg.org/spec/DMN/20180521/FEEL/"), is("feel"));
        assertThat(result.getNamespaceMap().get("http://www.omg.org/spec/DMN/20180521/MODEL/"), is("dmn"));
        assertThat(result.getPrefix(), is("dmn"));
        assertThat(result.getSchemaLocation(), is("dmn/1.2/dmn.xsd"));
        assertThat(result.getVersion(), is("1.2"));
        assertThat(obj.getVersion(), sameInstance(result));
    }
}
