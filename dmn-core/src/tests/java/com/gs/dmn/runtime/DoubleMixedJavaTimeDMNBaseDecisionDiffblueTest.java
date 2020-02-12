package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DoubleMixedJavaTimeDMNBaseDecisionDiffblueTest {
  @Test(timeout=10000)
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test(timeout=10000)
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

