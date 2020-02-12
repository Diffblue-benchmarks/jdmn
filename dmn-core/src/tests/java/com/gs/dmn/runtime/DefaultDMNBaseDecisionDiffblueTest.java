package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DefaultDMNBaseDecisionDiffblueTest {
  @Test(timeout=10000)
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test(timeout=10000)
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DefaultDMNBaseDecision()).getRuleAnnotation(1));
  }
}

