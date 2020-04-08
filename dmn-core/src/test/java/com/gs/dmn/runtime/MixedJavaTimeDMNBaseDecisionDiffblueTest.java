package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MixedJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void testGetDRGElementAnnotation() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testGetRuleAnnotation() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

