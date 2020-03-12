package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DoubleMixedJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

