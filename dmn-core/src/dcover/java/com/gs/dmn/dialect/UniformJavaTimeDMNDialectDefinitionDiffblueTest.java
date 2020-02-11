package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UniformJavaTimeDMNDialectDefinitionDiffblueTest {
  @Test(timeout=10000)
  public void createTypeTranslatorTest() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.UniformJavaTimeFEELTypeTranslator);
  }

  @Test(timeout=10000)
  public void getDecisionBaseClassTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.UniformJavaTimeDMNBaseDecision",
        (new UniformJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test(timeout=10000)
  public void createFEELLibTest() {
    // Arrange, Act and Assert
    assertTrue((new UniformJavaTimeDMNDialectDefinition())
        .createFEELLib() instanceof com.gs.dmn.feel.lib.UniformJavaTimeFEELLib);
  }
}

