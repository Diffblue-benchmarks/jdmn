package com.gs.dmn.transformation.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeTemplateProviderDiffblueTest {
  @Test(timeout=10000)
  public void testBaseTemplatePathTest() {
    // Arrange, Act and Assert
    assertEquals("/templates/tck", (new TreeTemplateProvider()).testBaseTemplatePath());
  }

  @Test(timeout=10000)
  public void itemDefinitionClassTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionClass.ftl", (new TreeTemplateProvider()).itemDefinitionClassTemplate());
  }

  @Test(timeout=10000)
  public void decisionTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("tree/decision.ftl", (new TreeTemplateProvider()).decisionTemplateName());
  }

  @Test(timeout=10000)
  public void decisionTableRuleOutputTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("tree/decisionTableRuleOutput.ftl", (new TreeTemplateProvider()).decisionTableRuleOutputTemplate());
  }

  @Test(timeout=10000)
  public void baseTemplatePathTest() {
    // Arrange, Act and Assert
    assertEquals("/templates/dmn2java", (new TreeTemplateProvider()).baseTemplatePath());
  }

  @Test(timeout=10000)
  public void testTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("common/junit.ftl", (new TreeTemplateProvider()).testTemplateName());
  }

  @Test(timeout=10000)
  public void bkmTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("tree/bkm.ftl", (new TreeTemplateProvider()).bkmTemplateName());
  }

  @Test(timeout=10000)
  public void itemDefinitionInterfaceTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionInterface.ftl", (new TreeTemplateProvider()).itemDefinitionInterfaceTemplate());
  }
}

