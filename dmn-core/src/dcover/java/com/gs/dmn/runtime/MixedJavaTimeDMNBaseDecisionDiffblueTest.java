package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MixedJavaTimeDMNBaseDecisionDiffblueTest {
  @Test(timeout=10000)
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test(timeout=10000)
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

