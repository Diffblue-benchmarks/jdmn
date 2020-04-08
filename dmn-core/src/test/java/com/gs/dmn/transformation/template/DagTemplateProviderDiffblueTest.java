package com.gs.dmn.transformation.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DagTemplateProviderDiffblueTest {
  @Test
  public void testBaseTemplatePath() {
    // Arrange, Act and Assert
    assertEquals("/templates/dmn2java", (new DagTemplateProvider()).baseTemplatePath());
  }

  @Test
  public void testItemDefinitionInterfaceTemplate() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionInterface.ftl", (new DagTemplateProvider()).itemDefinitionInterfaceTemplate());
  }

  @Test
  public void testItemDefinitionClassTemplate() {
    // Arrange, Act and Assert
    assertEquals("common/itemDefinitionClass.ftl", (new DagTemplateProvider()).itemDefinitionClassTemplate());
  }

  @Test
  public void testBkmTemplateName() {
    // Arrange, Act and Assert
    assertEquals("tree/bkm.ftl", (new DagTemplateProvider()).bkmTemplateName());
  }

  @Test
  public void testDecisionTemplateName() {
    // Arrange, Act and Assert
    assertEquals("dag/decision.ftl", (new DagTemplateProvider()).decisionTemplateName());
  }

  @Test
  public void testDecisionTableRuleOutputTemplate() {
    // Arrange, Act and Assert
    assertEquals("tree/decisionTableRuleOutput.ftl", (new DagTemplateProvider()).decisionTableRuleOutputTemplate());
  }

  @Test
  public void testTestBaseTemplatePath() {
    // Arrange, Act and Assert
    assertEquals("/templates/tck", (new DagTemplateProvider()).testBaseTemplatePath());
  }

  @Test
  public void testTestTemplateName() {
    // Arrange, Act and Assert
    assertEquals("common/junit.ftl", (new DagTemplateProvider()).testTemplateName());
  }
}

