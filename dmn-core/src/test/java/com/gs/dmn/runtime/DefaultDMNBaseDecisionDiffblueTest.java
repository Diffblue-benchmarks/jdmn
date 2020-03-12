package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DefaultDMNBaseDecisionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getRuleAnnotation(1));
  }
}

