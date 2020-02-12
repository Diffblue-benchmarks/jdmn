package com.gs.dmn.serialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.log.BuildLogger;
import com.gs.dmn.runtime.Pair;

import org.junit.Test;
import org.omg.spec.dmn._20151101.model.TDefinitions;

/**
 * Unit tests for com.gs.dmn.serialization.DMNDialectTransformer
 *
 * @author Diffblue JCover
 */

public class DMNDialectTransformerDiffblueTest {

    @Test(timeout=10000)
    public void transformDefinitions() {
        BuildLogger logger = mock(BuildLogger.class);
        Pair<org.omg.spec.dmn._20180521.model.TDefinitions, PrefixNamespaceMappings> result = new DMNDialectTransformer(logger).transformDefinitions(new TDefinitions());
        assertTrue(result.getLeft().getArtifact().isEmpty());
        assertTrue(result.getLeft().getBusinessContextElement().isEmpty());
        assertThat(result.getLeft().getDMNDI(), is(nullValue()));
        assertTrue(result.getLeft().getDrgElement().isEmpty());
        assertTrue(result.getLeft().getElementCollection().isEmpty());
        assertThat(result.getLeft().getExporter(), is(nullValue()));
        assertThat(result.getLeft().getExporterVersion(), is(nullValue()));
        assertThat(result.getLeft().getExpressionLanguage(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertTrue(result.getLeft().getImport().isEmpty());
        assertTrue(result.getLeft().getItemDefinition().isEmpty());
        assertThat(result.getLeft().getNamespace(), is(nullValue()));
        assertThat(result.getLeft().getTypeLanguage(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertThat(result.getLeft().getName(), is(nullValue()));
        assertThat(result.getLeft().getDescription(), is(nullValue()));
        assertThat(result.getLeft().getExtensionElements(), is(nullValue()));
        assertThat(result.getLeft().getId(), is(nullValue()));
        assertThat(result.getLeft().getLabel(), is(nullValue()));
        assertThat(result.getLeft().getOtherAttributes().isEmpty(), is(true));
        // pojo PrefixNamespaceMappings
    }

    @Test(timeout=10000)
    public void transformRepository() {
        BuildLogger logger = mock(BuildLogger.class);
        DMNModelRepository result = new DMNDialectTransformer(logger).transformRepository(new TDefinitions());
        assertThat(result.getAllDefinitions().size(), is(1));
        assertTrue(result.getAllDefinitions().get(0).getArtifact().isEmpty());
        assertTrue(result.getAllDefinitions().get(0).getBusinessContextElement().isEmpty());
        assertThat(result.getAllDefinitions().get(0).getDMNDI(), is(nullValue()));
        assertTrue(result.getAllDefinitions().get(0).getDrgElement().isEmpty());
        assertTrue(result.getAllDefinitions().get(0).getElementCollection().isEmpty());
        assertThat(result.getAllDefinitions().get(0).getExporter(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getExporterVersion(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getExpressionLanguage(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertTrue(result.getAllDefinitions().get(0).getImport().isEmpty());
        assertTrue(result.getAllDefinitions().get(0).getItemDefinition().isEmpty());
        assertThat(result.getAllDefinitions().get(0).getNamespace(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getTypeLanguage(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertThat(result.getAllDefinitions().get(0).getName(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getDescription(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getExtensionElements(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getId(), is(nullValue()));
        assertThat(result.getAllDefinitions().get(0).getLabel(), is(nullValue()));
        // reference, but not known
        assertTrue(result.getImportedNames().isEmpty());
        // pojo PrefixNamespaceMappings
        assertTrue(result.getRootDefinitions().getArtifact().isEmpty());
        assertTrue(result.getRootDefinitions().getBusinessContextElement().isEmpty());
        assertThat(result.getRootDefinitions().getDMNDI(), is(nullValue()));
        assertTrue(result.getRootDefinitions().getDrgElement().isEmpty());
        assertTrue(result.getRootDefinitions().getElementCollection().isEmpty());
        assertThat(result.getRootDefinitions().getExporter(), is(nullValue()));
        assertThat(result.getRootDefinitions().getExporterVersion(), is(nullValue()));
        assertThat(result.getRootDefinitions().getExpressionLanguage(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertTrue(result.getRootDefinitions().getImport().isEmpty());
        assertTrue(result.getRootDefinitions().getItemDefinition().isEmpty());
        assertThat(result.getRootDefinitions().getNamespace(), is(nullValue()));
        assertThat(result.getRootDefinitions().getTypeLanguage(), is("http://www.omg.org/spec/DMN/20180521/FEEL/"));
        assertThat(result.getRootDefinitions().getName(), is(nullValue()));
        assertThat(result.getRootDefinitions().getDescription(), is(nullValue()));
        assertThat(result.getRootDefinitions().getExtensionElements(), is(nullValue()));
        assertThat(result.getRootDefinitions().getId(), is(nullValue()));
        assertThat(result.getRootDefinitions().getLabel(), is(nullValue()));
        assertThat(result.getRootDefinitions().getOtherAttributes().isEmpty(), is(true));
    }
}
