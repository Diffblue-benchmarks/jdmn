package com.gs.dmn.serialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.serialization.DMNVersion
 *
 * @author Diffblue JCover
 */

public class DMNVersionDiffblueTest {

    @Test(timeout=10000)
    public void constructor() {
        Map<String, String> otherNamespaces = new HashMap<String, String>();
        ((HashMap<String, String>)otherNamespaces).put("foo", "foo");
        DMNVersion obj = new DMNVersion("Mr", "Germany", "foo", "foo", "foo", "foo", otherNamespaces, "foo");
        assertThat(obj.getFeelNamespace(), is("foo"));
        assertThat(obj.getFeelPrefix(), is("foo"));
        assertThat(obj.getJavaPackage(), is("foo"));
        assertThat(obj.getNamespace(), is("foo"));
        assertThat(obj.getNamespaceMap().get("foo"), is("foo"));
        assertThat(obj.getPrefix(), is("foo"));
        assertThat(obj.getSchemaLocation(), is("Germany"));
        assertThat(obj.getVersion(), is("Mr"));
    }

    @Test(timeout=10000)
    public void getFeelNamespace() {
        assertThat(new DMNVersion("Mr", "Germany", "", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getFeelNamespace(), is("foo"));
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getFeelNamespace(), is("foo"));
    }

    @Test(timeout=10000)
    public void getFeelPrefixReturnsFoo() {
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getFeelPrefix(), is("foo"));
    }

    @Test(timeout=10000)
    public void getJavaPackageReturnsFoo() {
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getJavaPackage(), is("foo"));
    }

    @Test(timeout=10000)
    public void getNamespaceMapReturnsFoo() {
        DMNVersion obj = new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo");
        Map<String, String> result = obj.getNamespaceMap();
        assertThat(result.get("foo"), is("foo"));
        assertThat(obj.getNamespaceMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsFoo() {
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getNamespace(), is("foo"));
    }

    @Test(timeout=10000)
    public void getPrefixReturnsBar() {
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getPrefix(), is("bar"));
    }

    @Test(timeout=10000)
    public void getSchemaLocationReturnsGermany() {
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getSchemaLocation(), is("Germany"));
    }

    @Test(timeout=10000)
    public void getVersionReturnsMr() {
        assertThat(new DMNVersion("Mr", "Germany", "bar", "foo", "foo", "foo", new HashMap<String, String>(), "foo").getVersion(), is("Mr"));
    }
}
