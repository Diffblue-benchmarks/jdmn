package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class DMNDialectTransformerDiffblueTest {
  @Test(timeout=10000)
  public void transformRepositoryTest() {
    // Arrange
    DMNDialectTransformer dmnDialectTransformer = new DMNDialectTransformer(new NopBuildLogger());

    // Act and Assert
    org.omg.spec.dmn._20180521.model.TDefinitions rootDefinitions = dmnDialectTransformer
        .transformRepository(new org.omg.spec.dmn._20151101.model.TDefinitions()).getRootDefinitions();
    String actualName = rootDefinitions.getName();
    String actualId = rootDefinitions.getId();
    String actualNamespace = rootDefinitions.getNamespace();
    String actualExpressionLanguage = rootDefinitions.getExpressionLanguage();
    String actualExporterVersion = rootDefinitions.getExporterVersion();
    String actualLabel = rootDefinitions.getLabel();
    String actualTypeLanguage = rootDefinitions.getTypeLanguage();
    String actualDescription = rootDefinitions.getDescription();
    String actualExporter = rootDefinitions.getExporter();
    assertNull(rootDefinitions.getExtensionElements());
    assertNull(actualExporter);
    assertNull(actualDescription);
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", actualTypeLanguage);
    assertNull(actualLabel);
    assertNull(actualExporterVersion);
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", actualExpressionLanguage);
    assertNull(actualNamespace);
    assertNull(actualId);
    assertNull(actualName);
  }

  @Test(timeout=10000)
  public void transformDefinitionsTest() {
    // Arrange
    DMNDialectTransformer dmnDialectTransformer = new DMNDialectTransformer(new NopBuildLogger());

    // Act and Assert
    org.omg.spec.dmn._20180521.model.TDefinitions left = dmnDialectTransformer
        .transformDefinitions(new org.omg.spec.dmn._20151101.model.TDefinitions()).getLeft();
    String actualName = left.getName();
    String actualId = left.getId();
    String actualNamespace = left.getNamespace();
    String actualExpressionLanguage = left.getExpressionLanguage();
    String actualExporterVersion = left.getExporterVersion();
    String actualLabel = left.getLabel();
    String actualTypeLanguage = left.getTypeLanguage();
    String actualDescription = left.getDescription();
    String actualExporter = left.getExporter();
    assertNull(left.getExtensionElements());
    assertNull(actualExporter);
    assertNull(actualDescription);
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", actualTypeLanguage);
    assertNull(actualLabel);
    assertNull(actualExporterVersion);
    assertEquals("http://www.omg.org/spec/DMN/20180521/FEEL/", actualExpressionLanguage);
    assertNull(actualNamespace);
    assertNull(actualId);
    assertNull(actualName);
  }
}

