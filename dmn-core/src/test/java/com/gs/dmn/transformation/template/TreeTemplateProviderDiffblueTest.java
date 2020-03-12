package com.gs.dmn.transformation.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeTemplateProviderDiffblueTest {
  @Test
  public void baseTemplatePathTest() {
    // Arrange, Act and Assert
    assertEquals("/templates/dmn2java", (new TreeTemplateProvider()).baseTemplatePath());
  }

  @Test
  public void bkmTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("tree/bkm.ftl", (new TreeTemplateProvider()).bkmTemplateName());
  }

  @Test
  public void decisionTableRuleOutputTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("tree/decisionTableRuleOutput.ftl", (new TreeTemplateProvider()).decisionTableRuleOutputTemplate());
  }

  @Test
  public void decisionTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("tree/decision.ftl", (new TreeTemplateProvider()).decisionTemplateName());
  }

  @Test
  public void itemDefinitionClassTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionClass.ftl", (new TreeTemplateProvider()).itemDefinitionClassTemplate());
  }

  @Test
  public void itemDefinitionInterfaceTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionInterface.ftl", (new TreeTemplateProvider()).itemDefinitionInterfaceTemplate());
  }

  @Test
  public void testBaseTemplatePathTest() {
    // Arrange, Act and Assert
    assertEquals("/templates/tck", (new TreeTemplateProvider()).testBaseTemplatePath());
  }

  @Test
  public void testTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("common/junit.ftl", (new TreeTemplateProvider()).testTemplateName());
  }
}

