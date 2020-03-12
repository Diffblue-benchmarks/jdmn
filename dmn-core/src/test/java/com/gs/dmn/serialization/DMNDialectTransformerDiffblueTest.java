package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class DMNDialectTransformerDiffblueTest {
  @Test
  public void transformDefinitionsTest() {
    // Arrange
    DMNDialectTransformer dmnDialectTransformer = new DMNDialectTransformer(new NopBuildLogger());

    // Act and Assert
    org.omg.spec.dmn._20180521.model.TDefinitions left = dmnDialectTransformer
        .transformDefinitions(new org.omg.spec.dmn._20151101.model.TDefinitions()).getLeft();
    assertNull(left.getExtensionElements());
    assertNull(left.getExporter());
    assertNull(left.getDescription());
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", left.getTypeLanguage());
    assertNull(left.getLabel());
    assertNull(left.getExporterVersion());
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", left.getExpressionLanguage());
    assertNull(left.getNamespace());
    assertNull(left.getId());
    assertNull(left.getName());
  }

  @Test
  public void transformRepositoryTest() {
    // Arrange
    DMNDialectTransformer dmnDialectTransformer = new DMNDialectTransformer(new NopBuildLogger());

    // Act and Assert
    org.omg.spec.dmn._20180521.model.TDefinitions rootDefinitions = dmnDialectTransformer
        .transformRepository(new org.omg.spec.dmn._20151101.model.TDefinitions()).getRootDefinitions();
    assertNull(rootDefinitions.getExtensionElements());
    assertNull(rootDefinitions.getExporter());
    assertNull(rootDefinitions.getDescription());
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", rootDefinitions.getTypeLanguage());
    assertNull(rootDefinitions.getLabel());
    assertNull(rootDefinitions.getExporterVersion());
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", rootDefinitions.getExpressionLanguage());
    assertNull(rootDefinitions.getNamespace());
    assertNull(rootDefinitions.getId());
    assertNull(rootDefinitions.getName());
  }
}

