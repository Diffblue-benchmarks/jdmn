package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PureJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void testGetDRGElementAnnotation() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testGetRuleAnnotation() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

