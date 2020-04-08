package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UniformJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void testGetDRGElementAnnotation() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testGetRuleAnnotation() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

