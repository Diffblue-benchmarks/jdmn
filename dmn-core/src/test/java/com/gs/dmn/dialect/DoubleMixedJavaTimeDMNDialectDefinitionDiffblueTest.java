package com.gs.dmn.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DoubleMixedJavaTimeDMNDialectDefinitionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DoubleMixedJavaTimeDMNBa" + "seDecision",
        (new DoubleMixedJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }

  @Test
  public void createFEELLibTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeDMNDialectDefinition())
        .createFEELLib() instanceof com.gs.dmn.feel.lib.DoubleMixedJavaTimeFEELLib);
  }

  @Test
  public void createTypeTranslatorTest() {
    // Arrange, Act and Assert
    assertTrue((new DoubleMixedJavaTimeDMNDialectDefinition())
        .createTypeTranslator() instanceof com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator);
  }

  @Test
  public void getDecisionBaseClassTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.DoubleMixedJavaTimeDMNBa" + "seDecision",
        (new DoubleMixedJavaTimeDMNDialectDefinition()).getDecisionBaseClass());
  }
}

