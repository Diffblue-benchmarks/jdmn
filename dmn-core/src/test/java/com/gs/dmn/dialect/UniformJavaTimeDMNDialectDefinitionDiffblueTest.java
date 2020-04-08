package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UniformJavaTimeDMNDialectDefinitionDiffblueTest {
  @Test
  public void testCreateTypeTranslator() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.UniformJavaTimeFEELTypeTranslator);
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.UniformJavaTimeDMNBaseDecision",
        (new UniformJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test
  public void testCreateFEELLib() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeDMNDialectDefinition())
        .createFEELLib() instanceof com.gs.dmn.feel.lib.UniformJavaTimeFEELLib);
  }

  @Test
  public void testGetDecisionBaseClass() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.UniformJavaTimeDMNBaseDecision",
        (new UniformJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }
}

