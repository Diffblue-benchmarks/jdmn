package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureJavaTimeDMNDialectDefinitionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.PureJavaTimeDMNBaseDecision",
        (new PureJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test
  public void createFEELLibTest() {
    // Arrange, Act and Assert
    assertTrue(
        (new PureJavaTimeDMNDialectDefinition()).createFEELLib() instanceof com.gs.dmn.feel.lib.PureJavaTimeFEELLib);
  }

  @Test
  public void createTypeTranslatorTest() {
    // Arrange, Act and Assert
    assertTrue((new PureJavaTimeDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.PureJavaTimeFEELTypeTranslator);
  }

  @Test
  public void getDecisionBaseClassTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.PureJavaTimeDMNBaseDecision",
        (new PureJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }
}

