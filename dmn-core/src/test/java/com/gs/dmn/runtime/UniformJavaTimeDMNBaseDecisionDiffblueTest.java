package com.gs.dmn.runtime;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UniformJavaTimeDMNBaseDecisionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getDRGElementAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeDMNBaseDecision()).getDRGElementAnnotation());
  }

  @Test
  public void getRuleAnnotationTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeDMNBaseDecision()).getRuleAnnotation(1));
  }
}

