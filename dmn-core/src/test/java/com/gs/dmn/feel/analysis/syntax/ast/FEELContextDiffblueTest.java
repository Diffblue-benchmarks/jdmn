package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.transformation.basic.EnvironmentMemoizer;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;

public class FEELContextDiffblueTest {
  @Test
  public void testMakeContext() {
    // Arrange
    TDecision tDecision = new TDecision();

    // Act
    FEELContext actualMakeContextResult = FEELContext.makeContext(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertNull(actualMakeContextResult.getRuntimeEnvironment());
    assertNull(actualMakeContextResult.getEnvironment());
    assertSame(tDecision, actualMakeContextResult.getElement());
  }

  @Test
  public void testMakeContext2() {
    // Arrange
    TDecision tDecision = new TDecision();

    // Act
    FEELContext actualMakeContextResult = FEELContext.makeContext(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertNull(actualMakeContextResult.getRuntimeEnvironment());
    assertNull(actualMakeContextResult.getEnvironment());
    assertSame(tDecision, actualMakeContextResult.getElement());
  }

  @Test
  public void testMakeContext3() {
    // Arrange
    TDecision tDecision = new TDecision();

    // Act
    FEELContext actualMakeContextResult = FEELContext.makeContext(tDecision,
        (new EnvironmentMemoizer()).get(tDecision));

    // Assert
    assertNull(actualMakeContextResult.getRuntimeEnvironment());
    assertNull(actualMakeContextResult.getEnvironment());
    assertSame(tDecision, actualMakeContextResult.getElement());
  }
}

