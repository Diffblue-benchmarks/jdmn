package com.gs.dmn.transformation.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DagTemplateProviderDiffblueTest {
  @Test(timeout=10000)
  public void testBaseTemplatePathTest() {
    // Arrange, Act and Assert
    assertEquals("/templates/tck", (new DagTemplateProvider()).testBaseTemplatePath());
  }

  @Test(timeout=10000)
  public void itemDefinitionClassTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionClass.ftl", (new DagTemplateProvider()).itemDefinitionClassTemplate());
  }

  @Test(timeout=10000)
  public void decisionTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("dag/decision.ftl", (new DagTemplateProvider()).decisionTemplateName());
  }

  @Test(timeout=10000)
  public void decisionTableRuleOutputTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("tree/decisionTableRuleOutput.ftl", (new DagTemplateProvider()).decisionTableRuleOutputTemplate());
  }

  @Test(timeout=10000)
  public void baseTemplatePathTest() {
    // Arrange, Act and Assert
    assertEquals("/templates/dmn2java", (new DagTemplateProvider()).baseTemplatePath());
  }

  @Test(timeout=10000)
  public void testTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("common/junit.ftl", (new DagTemplateProvider()).testTemplateName());
  }

  @Test(timeout=10000)
  public void bkmTemplateNameTest() {
    // Arrange, Act and Assert
    assertEquals("tree/bkm.ftl", (new DagTemplateProvider()).bkmTemplateName());
  }

  @Test(timeout=10000)
  public void itemDefinitionInterfaceTemplateTest() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionInterface.ftl", (new DagTemplateProvider()).itemDefinitionInterfaceTemplate());
  }
}

