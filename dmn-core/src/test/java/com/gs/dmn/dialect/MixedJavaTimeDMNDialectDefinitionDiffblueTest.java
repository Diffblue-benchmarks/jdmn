package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MixedJavaTimeDMNDialectDefinitionDiffblueTest {
  @Test
  public void testCreateTypeTranslator() {
    // Arrange, Act and Assert
    assertTrue((new MixedJavaTimeDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.MixedJavaTimeFEELTypeTranslator);
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.MixedJavaTimeDMNBaseDecision",
        (new MixedJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test
  public void testCreateFEELLib() {
    // Arrange, Act and Assert
    assertTrue(
        (new MixedJavaTimeDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.MixedJavaTimeFEELLib);
  }

  @Test
  public void testGetDecisionBaseClass() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.MixedJavaTimeDMNBaseDecision",
        (new MixedJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }
}

