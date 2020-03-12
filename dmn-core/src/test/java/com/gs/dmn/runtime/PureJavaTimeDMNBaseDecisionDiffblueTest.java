package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PureJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

