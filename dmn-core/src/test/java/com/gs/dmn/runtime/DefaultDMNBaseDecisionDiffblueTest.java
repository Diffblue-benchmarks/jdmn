package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DefaultDMNBaseDecisionDiffblueTest {
  @Test
  public void testGetDRGElementAnnotation() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void testGetRuleAnnotation() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getRuleAnnotation(1));
  }
}

