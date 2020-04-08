package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DoubleMixedJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void testGetDRGElementAnnotation() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testGetRuleAnnotation() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

