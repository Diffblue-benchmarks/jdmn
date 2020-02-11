package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TDefinitions
 *
 * @author Diffblue JCover
 */

public class TDefinitionsTest {

    @Test(timeout=10000)
    public void getArtifactReturnsEmpty() {
        TDefinitions obj = new TDefinitions();
        List<javax.xml.bind.JAXBElement<? extends TArtifact>> result = obj.getArtifact();
        assertTrue(result.isEmpty());
        assertThat(obj.getArtifact(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getBusinessContextElementReturnsEmpty() {
        TDefinitions obj = new TDefinitions();
        List<javax.xml.bind.JAXBElement<? extends TBusinessContextElement>> result = obj.getBusinessContextElement();
        assertTrue(result.isEmpty());
        assertThat(obj.getBusinessContextElement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getDMNDIReturnsNull() {
        assertThat(new TDefinitions().getDMNDI(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDrgElementReturnsEmpty() {
        TDefinitions obj = new TDefinitions();
        List<javax.xml.bind.JAXBElement<? extends TDRGElement>> result = obj.getDrgElement();
        assertTrue(result.isEmpty());
        assertThat(obj.getDrgElement(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getElementCollectionReturnsEmpty() {
        TDefinitions obj = new TDefinitions();
        List<TElementCollection> result = obj.getElementCollection();
        assertTrue(result.isEmpty());
        assertThat(obj.getElementCollection(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getExporterReturnsNull() {
        assertThat(new TDefinitions().getExporter(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExporterVersionReturnsNull() {
        assertThat(new TDefinitions().getExporterVersion(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExpressionLanguage() {
        assertThat(new TDefinitions().getExpressionLanguage(), is("http://www.omg.org/spec/FEEL/20140401"));
    }

    @Test(timeout=10000)
    public void getImportReturnsEmpty() {
        TDefinitions obj = new TDefinitions();
        List<TImport> result = obj.getImport();
        assertTrue(result.isEmpty());
        assertThat(obj.getImport(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getItemDefinitionReturnsEmpty() {
        TDefinitions obj = new TDefinitions();
        List<TItemDefinition> result = obj.getItemDefinition();
        assertTrue(result.isEmpty());
        assertThat(obj.getItemDefinition(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsNull() {
        assertThat(new TDefinitions().getNamespace(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeLanguage() {
        assertThat(new TDefinitions().getTypeLanguage(), is("http://www.omg.org/spec/FEEL/20140401"));
    }

    @Test(timeout=10000)
    public void setDMNDI() {
        TDefinitions obj = new TDefinitions();
        DMNDI value = new DMNDI();
        obj.setDMNDI(value);
        assertThat(obj.getDMNDI(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setExporterToFoo() {
        TDefinitions obj = new TDefinitions();
        obj.setExporter("foo");
        assertThat(obj.getExporter(), is("foo"));
    }

    @Test(timeout=10000)
    public void setExporterVersionToMr() {
        TDefinitions obj = new TDefinitions();
        obj.setExporterVersion("Mr");
        assertThat(obj.getExporterVersion(), is("Mr"));
    }

    @Test(timeout=10000)
    public void setExpressionLanguageToJpg() {
        TDefinitions obj = new TDefinitions();
        obj.setExpressionLanguage("jpg");
        assertThat(obj.getExpressionLanguage(), is("jpg"));
    }

    @Test(timeout=10000)
    public void setNamespaceToFoo() {
        TDefinitions obj = new TDefinitions();
        obj.setNamespace("foo");
        assertThat(obj.getNamespace(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTypeLanguageToGif() {
        TDefinitions obj = new TDefinitions();
        obj.setTypeLanguage("gif");
        assertThat(obj.getTypeLanguage(), is("gif"));
    }
}
